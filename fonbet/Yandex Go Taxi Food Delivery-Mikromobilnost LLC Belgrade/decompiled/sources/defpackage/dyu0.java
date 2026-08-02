package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui_models.form.ai_widgets.TextFontState;

/* loaded from: classes5.dex */
public final class dyu0 {
    public final String a;
    public final ldc b;
    public final int c;
    public final TextFontState d;

    public dyu0(String str, ldc ldcVar, int i, TextFontState textFontState) {
        this.a = str;
        this.b = ldcVar;
        this.c = i;
        this.d = textFontState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyu0)) {
            return false;
        }
        dyu0 dyu0Var = (dyu0) obj;
        return this.a.equals(dyu0Var.a) && jl40.l(this.b, dyu0Var.b) && this.c == dyu0Var.c && this.d == dyu0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int b = oyr.b(this.c, (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31, 31);
        TextFontState textFontState = this.d;
        return b + (textFontState != null ? textFontState.hashCode() : 0);
    }

    public final String toString() {
        return "StyledTextState(title=" + this.a + ", textColor=" + this.b + ", textSize=" + this.c + ", textFont=" + this.d + Extension.C_BRAKE;
    }
}
