package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class os8 implements rs8 {
    public final File a;
    public final qs8 b;

    public os8(File file, qs8 qs8Var) {
        this.a = file;
        this.b = qs8Var;
    }

    @Override // defpackage.rs8
    public final qs8 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os8)) {
            return false;
        }
        os8 os8Var = (os8) obj;
        return jl40.l(this.a, os8Var.a) && this.b.equals(os8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoCaptured(photoFile=" + this.a + ", step=" + this.b + Extension.C_BRAKE;
    }
}
