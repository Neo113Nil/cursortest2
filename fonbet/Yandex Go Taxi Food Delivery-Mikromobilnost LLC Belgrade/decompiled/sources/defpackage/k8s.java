package defpackage;

/* loaded from: classes2.dex */
public final class k8s implements h8s {
    public final String a;
    public final l8s b;

    public k8s() {
        this("", new l8s(0));
    }

    public final String a() {
        return this.a;
    }

    public final l8s b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8s)) {
            return false;
        }
        k8s k8sVar = (k8s) obj;
        return jl40.l(this.a, k8sVar.a) && jl40.l(this.b, k8sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.a + ", text=" + this.b + ')';
    }

    public k8s(String str, l8s l8sVar) {
        this.a = str;
        this.b = l8sVar;
    }
}
