package xsna;

/* compiled from: Colors.kt */
/* loaded from: classes11.dex */
public final class k9g {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;

    public k9g(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        l5g l5gVar = new l5g(j);
        k0x k0xVar = k0x.c;
        this.a = androidx.compose.runtime.k.a(l5gVar, k0xVar);
        this.b = androidx.compose.runtime.k.a(new l5g(j2), k0xVar);
        this.c = androidx.compose.runtime.k.a(new l5g(j3), k0xVar);
        this.d = androidx.compose.runtime.k.a(new l5g(j4), k0xVar);
        this.e = androidx.compose.runtime.k.a(new l5g(j5), k0xVar);
        this.f = androidx.compose.runtime.k.a(new l5g(j6), k0xVar);
        this.g = androidx.compose.runtime.k.a(new l5g(j7), k0xVar);
        this.h = androidx.compose.runtime.k.a(new l5g(j8), k0xVar);
        this.i = androidx.compose.runtime.k.a(new l5g(j9), k0xVar);
        this.j = androidx.compose.runtime.k.a(new l5g(j10), k0xVar);
        this.k = androidx.compose.runtime.k.a(new l5g(j11), k0xVar);
        this.l = androidx.compose.runtime.k.a(new l5g(j12), k0xVar);
        this.m = androidx.compose.runtime.k.a(Boolean.TRUE, k0xVar);
    }

    public final long a() {
        return ((l5g) ((zak0) this.k).getValue()).a;
    }

    public final long b() {
        return ((l5g) ((zak0) this.a).getValue()).a;
    }

    public final long c() {
        return ((l5g) ((zak0) this.f).getValue()).a;
    }

    public final boolean d() {
        return ((Boolean) ((zak0) this.m).getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        sb.append((Object) l5g.j(b()));
        sb.append(", primaryVariant=");
        dn.h(((l5g) ((zak0) this.b).getValue()).a, ", secondary=", sb);
        dn.h(((l5g) ((zak0) this.c).getValue()).a, ", secondaryVariant=", sb);
        dn.h(((l5g) ((zak0) this.d).getValue()).a, ", background=", sb);
        sb.append((Object) l5g.j(((l5g) ((zak0) this.e).getValue()).a));
        sb.append(", surface=");
        sb.append((Object) l5g.j(c()));
        sb.append(", error=");
        dn.h(((l5g) ((zak0) this.g).getValue()).a, ", onPrimary=", sb);
        dn.h(((l5g) ((zak0) this.h).getValue()).a, ", onSecondary=", sb);
        dn.h(((l5g) ((zak0) this.i).getValue()).a, ", onBackground=", sb);
        sb.append((Object) l5g.j(((l5g) ((zak0) this.j).getValue()).a));
        sb.append(", onSurface=");
        sb.append((Object) l5g.j(a()));
        sb.append(", onError=");
        sb.append((Object) l5g.j(((l5g) ((zak0) this.l).getValue()).a));
        sb.append(", isLight=");
        sb.append(d());
        sb.append(')');
        return sb.toString();
    }
}
