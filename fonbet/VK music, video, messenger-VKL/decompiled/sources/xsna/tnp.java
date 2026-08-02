package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class tnp extends Lambda implements izs<q9x, q9x> {
    final /* synthetic */ izs<Integer, Integer> $targetHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tnp(izs<? super Integer, Integer> izsVar) {
        super(1);
        this.$targetHeight = izsVar;
    }

    @Override // xsna.izs
    public final q9x invoke(q9x q9xVar) {
        long j = q9xVar.a;
        return new q9x((((int) (j >> 32)) << 32) | (this.$targetHeight.invoke(Integer.valueOf((int) (j & 4294967295L))).intValue() & 4294967295L));
    }
}
