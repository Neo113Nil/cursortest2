package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class id31 implements ge31 {
    public final pzu a;

    public id31(pzu pzuVar) {
        this.a = pzuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id31) && jl40.l(this.a, ((id31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HubItemAction(action=" + this.a + Extension.C_BRAKE;
    }
}
