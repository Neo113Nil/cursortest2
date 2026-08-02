package defpackage;

/* loaded from: classes10.dex */
public final class ib3 {
    public final yxr a;

    public ib3(yxr yxrVar) {
        this.a = yxrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib3) && jl40.l(this.a, ((ib3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
