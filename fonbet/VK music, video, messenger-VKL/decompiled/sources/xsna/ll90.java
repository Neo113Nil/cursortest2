package xsna;

/* compiled from: ParticlesConfig.kt */
/* loaded from: classes6.dex */
public final class ll90 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final double j;
    public final double k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final int p;
    public final int q;
    public final float r;
    public final float s;

    public ll90() {
        this(524287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll90)) {
            return false;
        }
        ll90 ll90Var = (ll90) obj;
        return this.a == ll90Var.a && Float.compare(this.b, ll90Var.b) == 0 && Float.compare(this.c, ll90Var.c) == 0 && Float.compare(this.d, ll90Var.d) == 0 && Float.compare(this.e, ll90Var.e) == 0 && Float.compare(this.f, ll90Var.f) == 0 && Float.compare(this.g, ll90Var.g) == 0 && Float.compare(this.h, ll90Var.h) == 0 && Float.compare(this.i, ll90Var.i) == 0 && Double.compare(this.j, ll90Var.j) == 0 && Double.compare(this.k, ll90Var.k) == 0 && Float.compare(this.l, ll90Var.l) == 0 && Float.compare(this.m, ll90Var.m) == 0 && Float.compare(this.n, ll90Var.n) == 0 && Float.compare(this.o, ll90Var.o) == 0 && this.p == ll90Var.p && this.q == ll90Var.q && Float.compare(this.r, ll90Var.r) == 0 && Float.compare(this.s, ll90Var.s) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.s) + io.reactivex.rxjava3.subjects.b.a(this.r, shy.a(this.q, shy.a(this.p, io.reactivex.rxjava3.subjects.b.a(this.o, io.reactivex.rxjava3.subjects.b.a(this.n, io.reactivex.rxjava3.subjects.b.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, zjh0.b(this.k, zjh0.b(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParticleConfig(sectionCount=");
        sb.append(this.a);
        sb.append(", globalRotationSpeed=");
        sb.append(this.b);
        sb.append(", spawnRate=");
        sb.append(this.c);
        sb.append(", explosionSpawnBoost=");
        sb.append(this.d);
        sb.append(", explosionTimeThreshold=");
        sb.append(this.e);
        sb.append(", explosionCurveRange=");
        sb.append(this.f);
        sb.append(", explosionStartJitter=");
        sb.append(this.g);
        sb.append(", minSize=");
        sb.append(this.h);
        sb.append(", maxSize=");
        sb.append(this.i);
        sb.append(", minSpeed=");
        sb.append(this.j);
        sb.append(", maxSpeed=");
        sb.append(this.k);
        sb.append(", rotationVariance=");
        sb.append(this.l);
        sb.append(", minSineCycles=");
        sb.append(this.m);
        sb.append(", maxSineCycles=");
        sb.append(this.n);
        sb.append(", defaultAmplitude=");
        sb.append(this.o);
        sb.append(", minPeakAlpha=");
        sb.append(this.p);
        sb.append(", maxPeakAlpha=");
        sb.append(this.q);
        sb.append(", fadeInDuration=");
        sb.append(this.r);
        sb.append(", fadeOutStart=");
        return xq.c(')', this.s, sb);
    }

    public ll90(int i) {
        int i2 = (i & 1) != 0 ? 16 : 10;
        float f = (i & 128) != 0 ? 20.0f : 15.0f;
        float f2 = (i & 256) != 0 ? 45.0f : 30.0f;
        this.a = i2;
        this.b = 0.4f;
        this.c = 0.2f;
        this.d = 0.6f;
        this.e = 1.5f;
        this.f = 120.0f;
        this.g = 0.15f;
        this.h = f;
        this.i = f2;
        this.j = 0.0015d;
        this.k = 0.003d;
        this.l = 8.0f;
        this.m = 2.0f;
        this.n = 3.5f;
        this.o = 20.0f;
        this.p = 200;
        this.q = 255;
        this.r = 0.3f;
        this.s = 0.7f;
    }
}
