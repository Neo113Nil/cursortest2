package defpackage;

/* loaded from: classes11.dex */
public final class a590 implements zzb {
    public final Class a;

    public a590(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.zzb
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a590) {
            return jl40.l(this.a, ((a590) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
