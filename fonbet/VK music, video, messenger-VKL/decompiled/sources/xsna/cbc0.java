package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.typography.FontFamily;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PosterTextDelegate.kt */
/* loaded from: classes4.dex */
public final class cbc0 implements TextWatcher {
    public final TextView b;
    public boolean c;
    public Poster.Constants d;
    public int e;
    public final Matcher f = hd60.a().Y().matcher("");
    public final Matcher g = hd60.a().Q().matcher("");

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
            textPaint.setColor(cbc0.this.e);
            textPaint.setUnderlineText(true);
        }
    }

    public cbc0(TextView textView) {
        this.b = textView;
        textView.setBackground(null);
        textView.setGravity(17);
        com.vk.typography.b.k(textView, FontFamily.DISPLAY_DEMIBOLD, null, 6);
        textView.addTextChangedListener(this);
    }

    public final void a(int i) {
        Float valueOf;
        TextView textView = this.b;
        if (i == 0) {
            i = textView.getMeasuredWidth();
        }
        if (i == 0) {
            i = iah0.f().widthPixels;
        }
        int b = an10.b(i * 0.055555556f);
        textView.setPadding(b, textView.getPaddingTop(), b, textView.getPaddingBottom());
        int i2 = i - (b * 2);
        String obj = textView.getText().toString();
        Poster.Constants constants = this.d;
        Float f = null;
        if (obj.length() > (constants != null ? constants.c : 104)) {
            if (constants != null) {
                valueOf = Float.valueOf(constants.f);
            }
            valueOf = null;
        } else {
            if (constants != null) {
                valueOf = Float.valueOf(constants.d);
            }
            valueOf = null;
        }
        float f2 = i2;
        float floatValue = (valueOf != null ? valueOf.floatValue() : 0.06111f) * f2;
        Poster.Constants constants2 = this.d;
        if (obj.length() > (constants2 != null ? constants2.c : 104)) {
            if (constants2 != null) {
                f = Float.valueOf(constants2.g);
            }
        } else if (constants2 != null) {
            f = Float.valueOf(constants2.e);
        }
        float floatValue2 = (f2 * (f != null ? f.floatValue() : 0.07222f)) - floatValue;
        textView.setTextSize(0, floatValue);
        if (floatValue2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            textView.setLineSpacing(floatValue2, 1.0f);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        vg6 vg6Var;
        Object b9zVar;
        if (editable == null) {
            return;
        }
        if (this.c) {
            this.c = false;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pattern pattern = n420.a;
        ArrayList m = yjo0.m(editable);
        List D0 = m != null ? j5g.D0(new abc0(), m) : null;
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
                    b9zVar = vg6Var instanceof l9z ? new b9z(this.e, ((l9z) vg6Var).d, new bbw(this, 24)) : null;
                }
                if (b9zVar != null) {
                    this.c = true;
                    editable.replace(i3, i4, vg6Var.c);
                    i += (vg6Var.b - vg6Var.a) - vg6Var.c.length();
                    editable.setSpan(b9zVar, i3, vg6Var.c.length() + i3, 0);
                    int i5 = vg6Var.a;
                    arrayList.add(new wlb(i5, vg6Var.c.length() + i5));
                }
            }
        }
        this.f.reset(editable);
        while (this.f.find()) {
            if (!hd60.a().B(this.f, arrayList)) {
                int start = this.f.start();
                int end = this.f.end();
                if (this.f.start() <= 0 || editable.charAt(this.f.start() - 1) != '@') {
                    editable.setSpan(new a(this.f.group()), start, end, 0);
                    arrayList.add(new wlb(start, end));
                }
            }
        }
        this.g.reset(editable);
        while (this.g.find()) {
            if (!hd60.a().B(this.g, arrayList)) {
                int start2 = this.g.start();
                int end2 = this.g.end();
                editable.setSpan(this.g.group(2) == null ? new a("vkontakte://search/" + this.g.group()) : new a("vkontakte://" + a0a.d + '/' + this.g.group(2) + '/' + Uri.encode(this.g.group(1).substring(1))), start2, end2, 0);
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
