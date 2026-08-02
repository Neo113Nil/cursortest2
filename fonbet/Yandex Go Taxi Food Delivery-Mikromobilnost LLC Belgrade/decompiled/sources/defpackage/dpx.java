package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dpx implements qas0 {
    public final File a;
    public final boolean b;

    public dpx(File file, boolean z) {
        this.a = file;
        this.b = z;
    }

    public final File a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpx)) {
            return false;
        }
        dpx dpxVar = (dpx) obj;
        return this.a.equals(dpxVar.a) && this.b == dpxVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TakePhoto(photoFile=" + this.a + ", withFlash=" + this.b + Extension.C_BRAKE;
    }
}
