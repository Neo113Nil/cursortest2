package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gij implements iij {
    public final bij a;

    public gij(bij bijVar) {
        this.a = bijVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gij) && jl40.l(this.a, ((gij) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(entity=" + this.a + Extension.C_BRAKE;
    }
}
