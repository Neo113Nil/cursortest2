package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes11.dex */
final class odu extends d730<pqj0> {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final long i;
    public final r5j0 j;
    public final boolean k;
    public final long l;
    public final long m;
    public final int n;
    public final float h = 8.0f;
    public final int o = 3;

    public odu(float f, float f2, float f3, float f4, float f5, float f6, float f7, long j, r5j0 r5j0Var, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.i = j;
        this.j = r5j0Var;
        this.k = z;
        this.l = j2;
        this.m = j3;
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odu)) {
            return false;
        }
        odu oduVar = (odu) obj;
        return Float.compare(this.a, oduVar.a) == 0 && Float.compare(this.b, oduVar.b) == 0 && Float.compare(this.c, oduVar.c) == 0 && Float.compare(this.d, oduVar.d) == 0 && Float.compare(this.e, oduVar.e) == 0 && Float.compare(this.f, oduVar.f) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(this.g, oduVar.g) == 0 && Float.compare(this.h, oduVar.h) == 0 && lkp0.a(this.i, oduVar.i) && epx.f(this.j, oduVar.j) && this.k == oduVar.k && l5g.d(this.l, oduVar.l) && l5g.d(this.m, oduVar.m) && this.n == oduVar.n && this.o == oduVar.o;
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = lkp0.c;
        int b = qoy.b((this.j.hashCode() + bh10.a(a, 31, this.i)) * 31, 961, this.k);
        int i2 = l5g.l;
        return shy.a(this.o, shy.a(this.n, bh10.a(bh10.a(b, 31, this.l), 31, this.m), 31), 31);
    }

    @Override // xsna.d730
    public final pqj0 r() {
        pqj0 pqj0Var = new pqj0();
        pqj0Var.p = this.a;
        pqj0Var.q = this.b;
        pqj0Var.r = this.c;
        pqj0Var.s = this.d;
        pqj0Var.t = this.e;
        pqj0Var.u = this.f;
        pqj0Var.v = this.g;
        pqj0Var.w = this.h;
        pqj0Var.x = this.i;
        pqj0Var.y = this.j;
        pqj0Var.z = this.k;
        pqj0Var.A = this.l;
        pqj0Var.B = this.m;
        pqj0Var.C = this.n;
        pqj0Var.D = this.o;
        pqj0Var.E = new oqj0(pqj0Var);
        return pqj0Var;
    }

    @Override // xsna.d730
    public final void s(pqj0 pqj0Var) {
        androidx.compose.ui.node.o oVar;
        pqj0 pqj0Var2 = pqj0Var;
        pqj0Var2.p = this.a;
        pqj0Var2.q = this.b;
        pqj0Var2.r = this.c;
        pqj0Var2.s = this.d;
        pqj0Var2.t = this.e;
        pqj0Var2.u = this.f;
        pqj0Var2.v = this.g;
        pqj0Var2.w = this.h;
        pqj0Var2.x = this.i;
        pqj0Var2.y = this.j;
        pqj0Var2.z = this.k;
        pqj0Var2.A = this.l;
        pqj0Var2.B = this.m;
        pqj0Var2.C = this.n;
        pqj0Var2.D = this.o;
        oqj0 oqj0Var = pqj0Var2.E;
        if (pqj0Var2.b.o && (oVar = itl.d(pqj0Var2, 2).t) != null) {
            oVar.j2(oqj0Var, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", translationX=");
        sb.append(this.d);
        sb.append(", translationY=");
        sb.append(this.e);
        sb.append(", shadowElevation=");
        sb.append(this.f);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.g);
        sb.append(", cameraDistance=");
        sb.append(this.h);
        sb.append(", transformOrigin=");
        sb.append((Object) lkp0.d(this.i));
        sb.append(", shape=");
        sb.append(this.j);
        sb.append(", clip=");
        sb.append(this.k);
        sb.append(", renderEffect=null, ambientShadowColor=");
        dn.h(this.l, ", spotShadowColor=", sb);
        dn.h(this.m, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.n + ')'));
        sb.append(", blendMode=");
        sb.append((Object) ne7.F(this.o));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
