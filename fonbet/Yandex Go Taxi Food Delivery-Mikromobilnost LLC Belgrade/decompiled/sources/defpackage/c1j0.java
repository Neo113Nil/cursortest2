package defpackage;

/* loaded from: classes11.dex */
public final class c1j0 implements t2v {
    public final mds a;

    public c1j0(mds mdsVar) {
        this.a = mdsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1j0) && jl40.l(this.a, ((c1j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ReplaceFragment(fragmentScreen=" + this.a + ", tag=null)";
    }
}
