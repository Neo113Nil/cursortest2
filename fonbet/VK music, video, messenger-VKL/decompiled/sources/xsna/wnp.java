package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class wnp extends Lambda implements izs<q9x, h9x> {
    final /* synthetic */ izs<Integer, Integer> $initialOffsetY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wnp(izs<? super Integer, Integer> izsVar) {
        super(1);
        this.$initialOffsetY = izsVar;
    }

    @Override // xsna.izs
    public final h9x invoke(q9x q9xVar) {
        return new h9x((0 << 32) | (4294967295L & this.$initialOffsetY.invoke(Integer.valueOf((int) (q9xVar.a & 4294967295L))).intValue()));
    }
}
