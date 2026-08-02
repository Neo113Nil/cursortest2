package defpackage;

import com.yandex.go.design.compose.spinner.SpinnerState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class byl0 implements cyl0 {
    public final String a;
    public final String b;
    public final SpinnerState c = SpinnerState.ERROR;

    public byl0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cyl0
    public final SpinnerState a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byl0)) {
            return false;
        }
        byl0 byl0Var = (byl0) obj;
        return this.a.equals(byl0Var.a) && this.b.equals(byl0Var.b);
    }

    @Override // defpackage.cyl0
    public final String getSubtitle() {
        return this.b;
    }

    @Override // defpackage.cyl0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ValidationFailIntermediate(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
