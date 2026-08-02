package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.q630;
import xsna.tra0;

/* compiled from: LottieAnimationSizeNode.kt */
/* loaded from: classes12.dex */
public final class b700 extends q630.c implements noy {
    public int p;
    public int q;

    /* compiled from: LottieAnimationSizeNode.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tra0 tra0Var) {
            super(1);
            this.$placeable = tra0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a.x(aVar, this.$placeable, 0, 0);
            return s3q0.a;
        }
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        long a2;
        long d = s6j.d(j, pli.h(this.p, this.q));
        if (o6j.h(j) == Integer.MAX_VALUE && o6j.i(j) != Integer.MAX_VALUE) {
            int i = (int) (d >> 32);
            int i2 = (this.q * i) / this.p;
            a2 = s6j.a(i, i, i2, i2);
        } else if (o6j.i(j) != Integer.MAX_VALUE || o6j.h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (d >> 32);
            int i4 = (int) (d & 4294967295L);
            a2 = s6j.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (d & 4294967295L);
            int i6 = (this.p * i5) / this.q;
            a2 = s6j.a(i6, i6, i5, i5);
        }
        tra0 N = zo10Var.N(a2);
        return ep10Var.Q(N.b, N.c, jgp.b, new a(N));
    }
}
