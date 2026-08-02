package xsna;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import xsna.vdo0;

/* compiled from: TextLayoutBuilder.java */
/* loaded from: classes2.dex */
public final class gjo0 {
    public static final m900<Integer, Layout> e = new m900<>(100);
    public int a = Integer.MAX_VALUE;
    public final a b;

    @Nullable
    public Layout c;
    public boolean d;

    /* compiled from: TextLayoutBuilder.java */
    public static class a {
        public TextPaint a;
        public CharSequence b;
        public float c;
        public float d;
        public boolean e;
        public boolean f;

        @Nullable
        public TextUtils.TruncateAt g;
        public int h;
        public Layout.Alignment i;
        public vdo0.e j;
        public int k;
        public boolean l;

        public final void a() {
            if (this.l) {
                TextPaint textPaint = new TextPaint(this.a);
                textPaint.set(this.a);
                this.a = textPaint;
                this.l = false;
            }
        }

        public final int hashCode() {
            int floatToIntBits = (Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + ((Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + ((Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + ((((Float.floatToIntBits(this.a.getTextSize()) + ((this.a.getColor() + 31) * 31)) * 31) + (this.a.getTypeface() != null ? this.a.getTypeface().hashCode() : 0)) * 31)) * 31)) * 31)) * 961;
            TextPaint textPaint = this.a;
            int floatToIntBits2 = (((((Float.floatToIntBits(this.d) + ((Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + ((Float.floatToIntBits(this.c) + dq.d((Float.floatToIntBits(textPaint.density) + ((floatToIntBits + textPaint.linkColor) * 31)) * 31, 29791, this.a.drawableState)) * 31)) * 31)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
            TextUtils.TruncateAt truncateAt = this.g;
            int hashCode = (((floatToIntBits2 + (truncateAt != null ? truncateAt.hashCode() : 0)) * 961) + this.h) * 31;
            Layout.Alignment alignment = this.i;
            int hashCode2 = (hashCode + (alignment != null ? alignment.hashCode() : 0)) * 31;
            vdo0.e eVar = this.j;
            int d = dq.d(dq.d((((hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.k) * 961, 31, null), 31, null);
            CharSequence charSequence = this.b;
            return d + (charSequence != null ? charSequence.hashCode() : 0);
        }
    }

    public gjo0() {
        a aVar = new a();
        aVar.a = new TextPaint(1);
        aVar.c = 1.0f;
        aVar.d = Float.MAX_VALUE;
        aVar.e = true;
        aVar.f = true;
        aVar.g = null;
        aVar.h = Integer.MAX_VALUE;
        aVar.i = Layout.Alignment.ALIGN_NORMAL;
        aVar.j = vdo0.c;
        aVar.k = 0;
        aVar.l = false;
        this.b = aVar;
        this.c = null;
        this.d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006b  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Layout a() {
        boolean z;
        boolean z2;
        m900<Integer, Layout> m900Var;
        int i;
        int i2;
        BoringLayout.Metrics isBoring;
        boolean z3;
        CharSequence charSequence;
        Layout a2;
        Layout layout;
        if (this.d && (layout = this.c) != null) {
            return layout;
        }
        a aVar = this.b;
        CharSequence charSequence2 = aVar.b;
        if (charSequence2 == null || charSequence2.length() == 0) {
            return null;
        }
        boolean z4 = true;
        if (this.d) {
            CharSequence charSequence3 = aVar.b;
            if (charSequence3 instanceof Spannable) {
                z = ((ClickableSpan[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length() - 1, ClickableSpan.class)).length > 0;
                z2 = this.d;
                m900Var = e;
                if (z2 || z) {
                    i = -1;
                } else {
                    i = aVar.hashCode();
                    Layout layout2 = m900Var.get(Integer.valueOf(i));
                    if (layout2 != null) {
                        return layout2;
                    }
                }
                i2 = i;
                int i3 = aVar.h;
                isBoring = i3 != 1 ? BoringLayout.isBoring(aVar.b, aVar.a) : null;
                int ceil = (int) Math.ceil(Layout.getDesiredWidth(aVar.b, aVar.a));
                Math.round((aVar.a.getFontMetricsInt(null) * aVar.c) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int max = Math.max(Math.min(ceil, this.a), 0);
                if (isBoring == null) {
                    a2 = BoringLayout.make(aVar.b, aVar.a, max, aVar.i, aVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, isBoring, aVar.e, aVar.g, max);
                } else {
                    while (true) {
                        try {
                            charSequence = aVar.b;
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                            z3 = z4;
                        }
                        try {
                            a2 = byk0.a(charSequence, charSequence.length(), aVar.a, max, aVar.i, aVar.c, aVar.e, aVar.g, max, i3, aVar.j, aVar.k, aVar.f);
                            break;
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                            z3 = true;
                            if (aVar.b instanceof String) {
                                throw e;
                            }
                            Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e);
                            aVar.b = aVar.b.toString();
                            z4 = z3;
                        }
                        Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e);
                        aVar.b = aVar.b.toString();
                        z4 = z3;
                    }
                }
                if (this.d && !z) {
                    this.c = a2;
                    m900Var.put(Integer.valueOf(i2), a2);
                }
                aVar.l = true;
                return a2;
            }
        }
        z = false;
        z2 = this.d;
        m900Var = e;
        if (z2) {
        }
        i = -1;
        i2 = i;
        int i32 = aVar.h;
        if (i32 != 1) {
        }
        int ceil2 = (int) Math.ceil(Layout.getDesiredWidth(aVar.b, aVar.a));
        Math.round((aVar.a.getFontMetricsInt(null) * aVar.c) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int max2 = Math.max(Math.min(ceil2, this.a), 0);
        if (isBoring == null) {
        }
        if (this.d) {
            this.c = a2;
            m900Var.put(Integer.valueOf(i2), a2);
        }
        aVar.l = true;
        return a2;
    }

    public final void b(@Nullable CharSequence charSequence) {
        a aVar = this.b;
        if (charSequence == aVar.b) {
            return;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            try {
                charSequence.hashCode();
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line.", e2);
            }
        }
        if (charSequence.equals(aVar.b)) {
            return;
        }
        aVar.b = charSequence;
        this.c = null;
    }

    public final void c(float f) {
        a aVar = this.b;
        if (aVar.a.getTextSize() != f) {
            aVar.a();
            aVar.a.setTextSize(f);
            this.c = null;
        }
    }
}
