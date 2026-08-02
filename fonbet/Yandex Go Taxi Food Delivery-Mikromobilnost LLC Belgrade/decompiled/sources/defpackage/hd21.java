package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hd21 {
    public final Boolean a;

    public hd21(Boolean bool) {
        this.a = bool;
    }

    public final Boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd21) && jl40.l(this.a, ((hd21) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "UploadUserPhotoDeeplink(requestRoutestats=" + this.a + Extension.C_BRAKE;
    }

    public hd21() {
        this(null);
    }
}
