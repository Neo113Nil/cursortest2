package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.q630;
import xsna.tra0;

/* compiled from: ZIndexModifier.kt */
/* loaded from: classes11.dex */
public final class z5y0 extends q630.c implements noy {
    public float p;

    /* compiled from: ZIndexModifier.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $placeable;
        final /* synthetic */ z5y0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tra0 tra0Var, z5y0 z5y0Var) {
            super(1);
            this.$placeable = tra0Var;
            this.this$0 = z5y0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            aVar.q(this.$placeable, 0, 0, this.this$0.p);
            return s3q0.a;
        }
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N = zo10Var.N(j);
        return ep10Var.Q(N.b, N.c, jgp.b, new a(N, this));
    }

    public final String toString() {
        return xq.c(')', this.p, new StringBuilder("ZIndexModifier(zIndex="));
    }
}
