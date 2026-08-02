package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.q630;
import xsna.tra0;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes11.dex */
public final class pqj0 extends q630.c implements noy, fgi0 {
    public long A;
    public long B;
    public int C;
    public int D;
    public oqj0 E;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public r5j0 y;
    public boolean z;

    /* compiled from: GraphicsLayerModifier.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $placeable;
        final /* synthetic */ pqj0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tra0 tra0Var, pqj0 pqj0Var) {
            super(1);
            this.$placeable = tra0Var;
            this.this$0 = pqj0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a.K(aVar, this.$placeable, 0, 0, this.this$0.E, 4);
            return s3q0.a;
        }
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N = zo10Var.N(j);
        return ep10Var.Q(N.b, N.c, jgp.b, new a(N, this));
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        if (this.z) {
            qgi0.p(tgi0Var, this.y);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.p);
        sb.append(", scaleY=");
        sb.append(this.q);
        sb.append(", alpha = ");
        sb.append(this.r);
        sb.append(", translationX=");
        sb.append(this.s);
        sb.append(", translationY=");
        sb.append(this.t);
        sb.append(", shadowElevation=");
        sb.append(this.u);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.v);
        sb.append(", cameraDistance=");
        sb.append(this.w);
        sb.append(", transformOrigin=");
        sb.append((Object) lkp0.d(this.x));
        sb.append(", shape=");
        sb.append(this.y);
        sb.append(", clip=");
        sb.append(this.z);
        sb.append(", renderEffect=null, ambientShadowColor=");
        dn.h(this.A, ", spotShadowColor=", sb);
        dn.h(this.B, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.C + ')'));
        sb.append(", blendMode=");
        sb.append((Object) ne7.F(this.D));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // xsna.fgi0
    public final boolean w1() {
        return false;
    }
}
