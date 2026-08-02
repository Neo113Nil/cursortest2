package defpackage;

import com.yandex.go.design.compose.button.ButtonForm;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class mpv0 {
    public final ety0 a;
    public final byk0 b;
    public final ButtonForm c;

    public mpv0(ety0 ety0Var, byk0 byk0Var, ButtonForm buttonForm) {
        this.a = ety0Var;
        this.b = byk0Var;
        this.c = buttonForm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpv0)) {
            return false;
        }
        mpv0 mpv0Var = (mpv0) obj;
        return jl40.l(this.a, mpv0Var.a) && this.b.equals(mpv0Var.b) && this.c == mpv0Var.c;
    }

    public final int hashCode() {
        ety0 ety0Var = this.a;
        int hashCode = ety0Var == null ? 0 : ety0Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "SummaryStyle(boldVerticalTextStyle=" + this.a + ", smallVerticalShape=" + this.b + ", addressTrailButtonForm=" + this.c + Extension.C_BRAKE;
    }
}
