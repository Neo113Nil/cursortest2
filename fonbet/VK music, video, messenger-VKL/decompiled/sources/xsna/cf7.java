package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.dak0;
import xsna.q630;
import xsna.tra0;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes11.dex */
public final class cf7 extends q630.c implements noy, fgi0 {
    public izs<? super tdu, s3q0> p;

    /* compiled from: GraphicsLayerModifier.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $placeable;
        final /* synthetic */ cf7 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tra0 tra0Var, cf7 cf7Var) {
            super(1);
            this.$placeable = tra0Var;
            this.this$0 = cf7Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a.K(aVar, this.$placeable, 0, 0, this.this$0.p, 4);
            return s3q0.a;
        }
    }

    public cf7(izs<? super tdu, s3q0> izsVar) {
        this.p = izsVar;
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
        boolean z;
        r5j0 r5j0Var;
        androidx.compose.ui.node.o d = itl.d(this, 2);
        if (d.J) {
            r5j0 r5j0Var2 = d.H;
            z = d.I;
            r5j0Var = r5j0Var2;
        } else {
            sfg0 sfg0Var = rdu.a;
            if (sfg0Var == null) {
                rdu.a = new sfg0();
            } else {
                sfg0Var.c();
            }
            sfg0 sfg0Var2 = rdu.a;
            sfg0Var2.t = d.q.z;
            sfg0Var2.s = pli.w(d.d);
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e = a2 != null ? a2.e() : null;
            dak0 b = dak0.a.b(a2);
            try {
                this.p.invoke(sfg0Var2);
                s3q0 s3q0Var = s3q0.a;
                dak0.a.d(a2, b, e);
                r5j0Var = sfg0Var2.p;
                z = sfg0Var2.q;
            } catch (Throwable th) {
                dak0.a.d(a2, b, e);
                throw th;
            }
        }
        if (z) {
            qgi0.p(tgi0Var, r5j0Var);
        }
    }

    public final String toString() {
        return up.c(new StringBuilder("BlockGraphicsLayerModifier(block="), this.p, ')');
    }

    @Override // xsna.fgi0
    public final boolean w1() {
        return false;
    }
}
