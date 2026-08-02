package defpackage;

import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.ButtonsAlignment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class o00 {
    public final x27 a;
    public final e37 b;
    public final ButtonsAlignment c;

    public o00(x27 x27Var, e37 e37Var, ButtonsAlignment buttonsAlignment) {
        this.a = x27Var;
        this.b = e37Var;
        this.c = buttonsAlignment;
    }

    public final ButtonsAlignment a() {
        return this.c;
    }

    public final e37 b() {
        return this.b;
    }

    public final e37 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return this.a.equals(o00Var.a) && this.b.equals(o00Var.b) && this.c == o00Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ActionsState(minorButtonState=" + this.a + ", majorButtonState=" + this.b + ", buttonsAlignment=" + this.c + Extension.C_BRAKE;
    }
}
