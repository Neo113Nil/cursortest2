package androidx.compose.ui.graphics;

import androidx.compose.ui.node.s;
import defpackage.e530;
import defpackage.ehr0;
import defpackage.g8e;
import defpackage.j530;
import defpackage.jl40;
import defpackage.jw01;
import defpackage.ldc;
import defpackage.m2k0;
import defpackage.oyr;
import defpackage.qje;
import defpackage.qv10;
import defpackage.tls;
import defpackage.uh6;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Lj530;", "Landroidx/compose/ui/graphics/e;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class c extends j530 {
    public final long B;
    public final ehr0 C;
    public final boolean D;
    public final long E;
    public final long F;
    public final float a;
    public final float b;
    public final float c;
    public final float w;
    public final float x;
    public final float y;
    public final float z;
    public final float A = 8.0f;
    public final int G = 3;

    public c(float f, float f2, float f3, float f4, float f5, float f6, float f7, long j, ehr0 ehr0Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.w = f4;
        this.x = f5;
        this.y = f6;
        this.z = f7;
        this.B = j;
        this.C = ehr0Var;
        this.D = z;
        this.E = j2;
        this.F = j3;
    }

    @Override // defpackage.j530
    public final e530 a() {
        final e eVar = new e();
        eVar.a = this.a;
        eVar.b = this.b;
        eVar.c = this.c;
        eVar.w = this.w;
        eVar.x = this.x;
        eVar.y = this.y;
        eVar.z = this.z;
        eVar.A = this.A;
        eVar.B = this.B;
        eVar.C = this.C;
        eVar.D = this.D;
        eVar.E = this.E;
        eVar.F = this.F;
        eVar.G = this.G;
        eVar.H = new tls() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.u(e.this.a);
                m2k0Var.v(e.this.b);
                m2k0Var.b(e.this.c);
                m2k0Var.D(e.this.w);
                m2k0Var.G(e.this.x);
                m2k0Var.x(e.this.y);
                e.this.getClass();
                m2k0Var.o(0.0f);
                e.this.getClass();
                m2k0Var.q(e.this.z);
                m2k0Var.e(e.this.A);
                m2k0Var.B(e.this.B);
                m2k0Var.y(e.this.C);
                m2k0Var.g(e.this.D);
                e.this.getClass();
                m2k0Var.m(null);
                m2k0Var.d(e.this.E);
                m2k0Var.A(e.this.F);
                e.this.getClass();
                m2k0Var.j(0);
                e eVar2 = e.this;
                int i = eVar2.G;
                if (m2k0Var.M != i) {
                    m2k0Var.a |= 524288;
                    m2k0Var.M = i;
                }
                eVar2.getClass();
                return zy11.a;
            }
        };
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0 && Float.compare(this.w, cVar.w) == 0 && Float.compare(this.x, cVar.x) == 0 && Float.compare(this.y, cVar.y) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.z, cVar.z) == 0 && Float.compare(this.A, cVar.A) == 0 && jw01.a(this.B, cVar.B) && jl40.l(this.C, cVar.C) && this.D == cVar.D && ldc.c(this.E, cVar.E) && ldc.c(this.F, cVar.F) && this.G == cVar.G;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        s sVar;
        e eVar = (e) e530Var;
        eVar.a = this.a;
        eVar.b = this.b;
        eVar.c = this.c;
        eVar.w = this.w;
        eVar.x = this.x;
        eVar.y = this.y;
        eVar.z = this.z;
        eVar.A = this.A;
        eVar.B = this.B;
        eVar.C = this.C;
        eVar.D = this.D;
        eVar.E = this.E;
        eVar.F = this.F;
        eVar.G = this.G;
        tls tlsVar = eVar.H;
        if (eVar.getNode().isAttached() && (sVar = qje.N(eVar, 2).J) != null) {
            sVar.A1(tlsVar, true);
        }
    }

    public final int hashCode() {
        int c = g8e.c(this.A, g8e.c(this.z, g8e.c(0.0f, g8e.c(0.0f, g8e.c(this.y, g8e.c(this.x, g8e.c(this.w, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = jw01.c;
        int e = unr0.e((this.C.hashCode() + qv10.c(c, 31, this.B)) * 31, 961, this.D);
        int i2 = ldc.n;
        return oyr.b(this.G, oyr.b(0, qv10.c(qv10.c(e, 31, this.E), 31, this.F), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", translationX=");
        sb.append(this.w);
        sb.append(", translationY=");
        sb.append(this.x);
        sb.append(", shadowElevation=");
        sb.append(this.y);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.z);
        sb.append(", cameraDistance=");
        sb.append(this.A);
        sb.append(", transformOrigin=");
        sb.append((Object) jw01.b(this.B));
        sb.append(", shape=");
        sb.append(this.C);
        sb.append(", clip=");
        sb.append(this.D);
        sb.append(", renderEffect=null, ambientShadowColor=");
        xvz.w(this.E, ", spotShadowColor=", sb);
        xvz.w(this.F, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) uh6.U(this.G));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
