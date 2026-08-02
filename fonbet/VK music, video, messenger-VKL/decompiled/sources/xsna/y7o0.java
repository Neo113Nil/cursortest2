package xsna;

import android.text.TextPaint;

/* compiled from: TelLinkSpan.kt */
/* loaded from: classes2.dex */
public final class y7o0 extends ohl {
    public final String e;
    public final String f;
    public final boolean g;

    public y7o0(String str, String str2, boolean z) {
        super(3, null);
        this.e = str;
        this.f = str2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7o0)) {
            return false;
        }
        y7o0 y7o0Var = (y7o0) obj;
        return epx.f(this.e, y7o0Var.e) && epx.f(this.f, y7o0Var.f) && this.g == y7o0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + urd0.a(this.e.hashCode() * 31, 31, this.f);
    }

    @Override // android.text.style.ClickableSpan
    public final String toString() {
        StringBuilder sb = new StringBuilder("TelLinkSpan(phone=");
        sb.append(this.e);
        sb.append(", link=");
        sb.append(this.f);
        sb.append(", highlight=");
        return defpackage.q0.a(sb, this.g, ')');
    }

    @Override // xsna.ohl, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.g) {
            super.updateDrawState(textPaint);
        }
    }
}
