package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class lnp extends Lambda implements izs<q9x, q9x> {
    final /* synthetic */ izs<Integer, Integer> $initialWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lnp(izs<? super Integer, Integer> izsVar) {
        super(1);
        this.$initialWidth = izsVar;
    }

    @Override // xsna.izs
    public final q9x invoke(q9x q9xVar) {
        long j = q9xVar.a;
        return new q9x((this.$initialWidth.invoke(Integer.valueOf((int) (j >> 32))).intValue() << 32) | (4294967295L & ((int) (j & 4294967295L))));
    }
}
