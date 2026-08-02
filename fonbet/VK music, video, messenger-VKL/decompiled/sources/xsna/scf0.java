package xsna;

/* compiled from: RecommendedChannelsExt.kt */
/* loaded from: classes16.dex */
public final class scf0 {
    public final int a;
    public final wpp<Long, dcf0> b;

    public scf0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scf0)) {
            return false;
        }
        scf0 scf0Var = (scf0) obj;
        return this.a == scf0Var.a && epx.f(this.b, scf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RecommendedChannelsExt(version=" + this.a + ", channels=" + this.b + ')';
    }

    public scf0(int i, wpp<Long, dcf0> wppVar) {
        this.a = i;
        this.b = wppVar;
    }

    public /* synthetic */ scf0(int i) {
        this(0, new wpp());
    }
}
