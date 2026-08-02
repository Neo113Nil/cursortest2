package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ppd {
    public static final opd Companion = new opd();
    public final String a;

    public /* synthetic */ ppd(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, npd.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppd) && jl40.l(this.a, ((ppd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("TariffName(name="), this.a, ')');
    }
}
