package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h2i implements uni {
    public final l2i a;

    public h2i(l2i l2iVar) {
        this.a = l2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2i) && jl40.l(this.a, ((h2i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeliveryCostDetailsArgs(screenState=" + this.a + Extension.C_BRAKE;
    }
}
