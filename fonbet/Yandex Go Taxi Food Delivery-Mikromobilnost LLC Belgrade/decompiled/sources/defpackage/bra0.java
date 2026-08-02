package defpackage;

import com.ybsdk.widgets.common.YbButtonViewGroup;
import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class bra0 implements era0 {
    public final kao a;
    public final YbButtonViewGroup.b b;
    public final File c;

    public bra0(kao kaoVar, YbButtonViewGroup.b bVar, File file) {
        this.a = kaoVar;
        this.b = bVar;
        this.c = file;
    }

    public final YbButtonViewGroup.b a() {
        return this.b;
    }

    public final File b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bra0) {
            bra0 bra0Var = (bra0) obj;
            if (this.a == bra0Var.a && jl40.l(this.b, bra0Var.b) && jl40.l(this.c, bra0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        YbButtonViewGroup.b bVar = this.b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        File file = this.c;
        return hashCode2 + (file != null ? file.hashCode() : 0);
    }

    public final String toString() {
        return "Content(errorViewSuccessState=" + this.a + ", buttonGroupState=" + this.b + ", file=" + this.c + Extension.C_BRAKE;
    }
}
