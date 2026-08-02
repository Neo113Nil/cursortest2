package defpackage;

import com.yandex.go.design.compose.spinner.SpinnerState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ayl0 implements cyl0 {
    public final String a;
    public final SpinnerState b = SpinnerState.DONE;

    public ayl0(String str) {
        this.a = str;
    }

    @Override // defpackage.cyl0
    public final SpinnerState a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayl0) && this.a.equals(((ayl0) obj).a);
    }

    @Override // defpackage.cyl0
    public final String getSubtitle() {
        return null;
    }

    @Override // defpackage.cyl0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Success(title=", this.a, Extension.C_BRAKE);
    }
}
