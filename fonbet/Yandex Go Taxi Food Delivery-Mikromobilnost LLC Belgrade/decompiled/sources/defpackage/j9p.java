package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class j9p implements l9p {
    public final boolean a;
    public final boolean b;

    public j9p(boolean z, boolean z2) {
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
        if (!(obj instanceof j9p)) {
            return false;
        }
        j9p j9pVar = (j9p) obj;
        return this.a == j9pVar.a && this.b == j9pVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.l9p
    public final boolean isLoading() {
        return true;
    }

    public final String toString() {
        return ly3.o("Loading(withTaxiButton=", ", isFinalSuggestAvailable=", Extension.C_BRAKE, this.a, this.b);
    }
}
