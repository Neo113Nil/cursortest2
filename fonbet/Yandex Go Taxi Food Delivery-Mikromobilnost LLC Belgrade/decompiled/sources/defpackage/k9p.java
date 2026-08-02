package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class k9p implements l9p {
    public final boolean a;

    public k9p(boolean z) {
        this.a = z;
    }

    @Override // defpackage.l9p
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9p) && this.a == ((k9p) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // defpackage.l9p
    public final boolean isLoading() {
        return true;
    }

    public final String toString() {
        return nzs.b("Retry(withTaxiButton=", Extension.C_BRAKE, this.a);
    }
}
