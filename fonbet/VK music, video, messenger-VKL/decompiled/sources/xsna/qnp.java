package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class qnp extends Lambda implements izs<q9x, q9x> {
    final /* synthetic */ izs<Integer, Integer> $targetWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qnp(izs<? super Integer, Integer> izsVar) {
        super(1);
        this.$targetWidth = izsVar;
    }

    @Override // xsna.izs
    public final q9x invoke(q9x q9xVar) {
        long j = q9xVar.a;
        return new q9x((this.$targetWidth.invoke(Integer.valueOf((int) (j >> 32))).intValue() << 32) | (4294967295L & ((int) (j & 4294967295L))));
    }
}
