package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class d1j0 implements t2v {
    public final mds a;

    public d1j0(mds mdsVar) {
        this.a = mdsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1j0) && jl40.l(this.a, ((d1j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplaceFragmentIfIsNotOpenAlready(fragmentScreen=" + this.a + Extension.C_BRAKE;
    }
}
