package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ncv {
    public final long a;
    public final int b;

    public ncv(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncv)) {
            return false;
        }
        ncv ncvVar = (ncv) obj;
        return this.a == ncvVar.a && this.b == ncvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ImageParameters(maximumPhotoSizeBytes=" + this.a + ", quality=" + this.b + Extension.C_BRAKE;
    }
}
