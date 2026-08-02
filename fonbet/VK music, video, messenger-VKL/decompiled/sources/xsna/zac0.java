package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.y9c0;

/* compiled from: PosterTextDelegate.kt */
/* loaded from: classes15.dex */
public final class zac0 implements TextWatcher {
    public final ebc0 b;
    public y9c0.a c;
    public int d;
    public final Matcher e = hd60.a().Y().matcher("");
    public final Matcher f = hd60.a().Q().matcher("");

    /* compiled from: PosterTextDelegate.kt */
    public final class a extends ClickableSpan {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            if (jjc.d().a()) {
                return;
            }
            maz e = xwk.d().e();
            Context context = view.getContext();
            if (context == null) {
                s3q0 s3q0Var = s3q0.a;
            } else {
                e.a(context, drm0.p0(this.b).toString());
                s3q0 s3q0Var2 = s3q0.a;
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(zac0.this.d);
            textPaint.setUnderlineText(true);
        }
    }

    public zac0(ebc0 ebc0Var) {
        this.b = ebc0Var;
        ebc0Var.setBackground(null);
        ebc0Var.setBreakStrategy(1);
        ebc0Var.setGravity(17);
        com.vk.typography.b.k(ebc0Var, FontFamily.DISPLAY_DEMIBOLD, null, 6);
        ebc0Var.addTextChangedListener(this);
    }

    public final void a(int i) {
        Float valueOf;
        ebc0 ebc0Var = this.b;
        if (i == 0) {
            i = ebc0Var.getMeasuredWidth();
        }
        if (i == 0) {
            i = iah0.f().widthPixels;
        }
        int b = an10.b(i * 0.055555556f);
        ebc0Var.setPadding(b, ebc0Var.getPaddingTop(), b, ebc0Var.getPaddingBottom());
        int i2 = i - (b * 2);
        String obj = ebc0Var.getText().toString();
        y9c0.a aVar = this.c;
        Float f = null;
        if (obj.length() > (aVar != null ? aVar.b : 104)) {
            if (aVar != null) {
                valueOf = Float.valueOf(aVar.e);
            }
            valueOf = null;
        } else {
            if (aVar != null) {
                valueOf = Float.valueOf(aVar.c);
            }
            valueOf = null;
        }
        float f2 = i2;
        float floatValue = (valueOf != null ? valueOf.floatValue() : 0.06111f) * f2;
        y9c0.a aVar2 = this.c;
        if (obj.length() > (aVar2 != null ? aVar2.b : 104)) {
            if (aVar2 != null) {
                f = Float.valueOf(aVar2.f);
            }
        } else if (aVar2 != null) {
            f = Float.valueOf(aVar2.d);
        }
        float floatValue2 = (f2 * (f != null ? f.floatValue() : 0.07222f)) - floatValue;
        ebc0Var.setTextSize(0, floatValue);
        if (floatValue2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ebc0Var.setLineSpacing(floatValue2, 1.0f);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        vg6 vg6Var;
        Object b9zVar;
        if (editable == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pattern pattern = n420.a;
        ArrayList m = yjo0.m(editable);
        List D0 = m != null ? j5g.D0(new bbc0(), m) : null;
        int size = D0 != null ? D0.size() : 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (D0 != null && (vg6Var = (vg6) j5g.b0(i2, D0)) != null) {
                int i3 = vg6Var.a - i;
                int i4 = vg6Var.b - i;
                if (vg6Var instanceof pgq0) {
                    StringBuilder sb = new StringBuilder("vkontakte://");
                    sb.append(a0a.d);
                    sb.append('/');
                    pgq0 pgq0Var = (pgq0) vg6Var;
                    sb.append(pgq0Var.e ? "club" : "id");
                    sb.append(Math.abs(pgq0Var.d.b));
                    b9zVar = new a(sb.toString());
                } else {
                    b9zVar = vg6Var instanceof l9z ? new b9z(this.d, ((l9z) vg6Var).d, new bk30(this, 18)) : null;
                }
                if (b9zVar != null) {
                    editable.replace(i3, i4, vg6Var.c);
                    i += (vg6Var.b - vg6Var.a) - vg6Var.c.length();
                    editable.setSpan(b9zVar, i3, vg6Var.c.length() + i3, 0);
                    int i5 = vg6Var.a;
                    arrayList.add(new wlb(i5, vg6Var.c.length() + i5));
                }
            }
        }
        this.e.reset(editable);
        while (this.e.find()) {
            if (!hd60.a().B(this.e, arrayList)) {
                int start = this.e.start();
                int end = this.e.end();
                if (this.e.start() <= 0 || editable.charAt(this.e.start() - 1) != '@') {
                    editable.setSpan(new a(this.e.group()), start, end, 0);
                    arrayList.add(new wlb(start, end));
                }
            }
        }
        this.f.reset(editable);
        while (this.f.find()) {
            if (!hd60.a().B(this.f, arrayList)) {
                int start2 = this.f.start();
                int end2 = this.f.end();
                editable.setSpan(this.f.group(2) == null ? new a("vkontakte://search/" + this.f.group()) : new a("vkontakte://" + a0a.d + '/' + this.f.group(2) + '/' + Uri.encode(this.f.group(1).substring(1))), start2, end2, 0);
                arrayList.add(new wlb(start2, end2));
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a(0);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
