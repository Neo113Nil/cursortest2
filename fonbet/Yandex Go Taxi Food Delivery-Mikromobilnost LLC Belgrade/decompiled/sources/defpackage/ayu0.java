package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.data.TextFont;

/* loaded from: classes5.dex */
public final class ayu0 {
    public final String a;
    public final String b;
    public final int c;
    public final TextFont d;

    public ayu0(String str, String str2, int i, TextFont textFont) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = textFont;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayu0)) {
            return false;
        }
        ayu0 ayu0Var = (ayu0) obj;
        return this.a.equals(ayu0Var.a) && jl40.l(this.b, ayu0Var.b) && this.c == ayu0Var.c && this.d == ayu0Var.d;
    }

    public final int hashCode() {
        int b = oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
        TextFont textFont = this.d;
        return b + (textFont == null ? 0 : textFont.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("StyledText(title=", this.a, ", textColor=", this.b, ", textSize=");
        v.append(this.c);
        v.append(", textFont=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
