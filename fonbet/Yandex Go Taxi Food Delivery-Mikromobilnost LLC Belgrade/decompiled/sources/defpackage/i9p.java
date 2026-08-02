package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class i9p implements l9p {
    public final boolean a;
    public final boolean b;

    public i9p(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.l9p
    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9p)) {
            return false;
        }
        i9p i9pVar = (i9p) obj;
        return this.a == i9pVar.a && this.b == i9pVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("Failure(withTaxiButton=", ", isLocalNetworkError=", Extension.C_BRAKE, this.a, this.b);
    }
}
