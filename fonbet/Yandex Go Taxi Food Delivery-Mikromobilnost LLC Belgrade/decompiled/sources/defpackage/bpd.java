package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class bpd implements fpd {
    public static final apd Companion = new apd();
    public final String a;

    public /* synthetic */ bpd(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, zod.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpd) && jl40.l(this.a, ((bpd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Trial(period="), this.a, ')');
    }
}
