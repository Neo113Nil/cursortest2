package xsna;

/* compiled from: ParticlesConfig.kt */
/* loaded from: classes6.dex */
public final class haq implements pq2 {
    public final ml90 a;

    public haq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof haq) && epx.f(this.a, ((haq) obj).a);
    }

    @Override // xsna.pq2
    public final ml90 getConfig() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ExplosionAnimationType(config=" + this.a + ')';
    }

    public haq(ml90 ml90Var) {
        this.a = ml90Var;
    }

    public /* synthetic */ haq(int i) {
        this(new ml90(null, null, null, 31));
    }
}
