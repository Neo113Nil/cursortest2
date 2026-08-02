package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kox implements qas0 {
    public final File a;
    public final boolean b;

    public kox(File file, boolean z) {
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
        if (!(obj instanceof kox)) {
            return false;
        }
        kox koxVar = (kox) obj;
        return this.a.equals(koxVar.a) && this.b == koxVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TakePhoto(photoFile=" + this.a + ", withFlash=" + this.b + Extension.C_BRAKE;
    }
}
