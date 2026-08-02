package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hyk extends gc5 {
    public final String c;
    public final eal d;

    public hyk(String str, eal ealVar) {
        super(str, 2);
        this.c = str;
        this.d = ealVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyk)) {
            return false;
        }
        hyk hykVar = (hyk) obj;
        return jl40.l(this.c, hykVar.c) && jl40.l(this.d, hykVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitSkeletonViewItem(id=" + this.c + ", divSkeletonViewState=" + this.d + Extension.C_BRAKE;
    }

    public /* synthetic */ hyk(eal ealVar) {
        this("div_kit_shimmer", ealVar);
    }
}
