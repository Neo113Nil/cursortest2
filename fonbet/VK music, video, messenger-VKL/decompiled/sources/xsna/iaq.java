package xsna;

/* compiled from: ParticlesConfig.kt */
/* loaded from: classes6.dex */
public final class iaq {
    public final int a;
    public final float b;
    public final float c;

    public iaq() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaq)) {
            return false;
        }
        iaq iaqVar = (iaq) obj;
        return this.a == iaqVar.a && Float.compare(this.b, iaqVar.b) == 0 && Float.compare(this.c, iaqVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExplosionConfig(particleCount=");
        sb.append(this.a);
        sb.append(", initialTimeMultiplier=");
        sb.append(this.b);
        sb.append(", decayStrength=");
        return xq.c(')', this.c, sb);
    }

    public iaq(int i) {
        int i2 = (i & 1) != 0 ? 100 : 75;
        float f = (i & 2) != 0 ? 10.0f : 15.0f;
        this.a = i2;
        this.b = f;
        this.c = 0.04f;
    }
}
