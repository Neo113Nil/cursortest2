package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class od31 implements ge31 {
    public final pzu a;

    public od31(pzu pzuVar) {
        this.a = pzuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od31) && jl40.l(this.a, ((od31) obj).a);
    }

    public final int hashCode() {
        pzu pzuVar = this.a;
        if (pzuVar == null) {
            return 0;
        }
        return pzuVar.hashCode();
    }

    public final String toString() {
        return "OnHubItemClick(action=" + this.a + Extension.C_BRAKE;
    }
}
