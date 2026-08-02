package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fu41 extends mm91 {
    public final boolean b;

    public fu41(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu41) && this.b == ((fu41) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return nzs.b("Loading(afterError=", Extension.C_BRAKE, this.b);
    }

    public fu41() {
        this(false);
    }
}
