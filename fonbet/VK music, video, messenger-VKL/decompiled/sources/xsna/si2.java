package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class si2 extends Lambda implements izs<Integer, Integer> {
    final /* synthetic */ izs<Integer, Integer> $targetOffset;
    final /* synthetic */ mi2<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public si2(mi2<Object> mi2Var, izs<? super Integer, Integer> izsVar) {
        super(1);
        this.this$0 = mi2Var;
        this.$targetOffset = izsVar;
    }

    @Override // xsna.izs
    public final Integer invoke(Integer num) {
        int intValue = num.intValue();
        mi2<Object> mi2Var = this.this$0;
        mtk0<q9x> d = mi2Var.e.d(((zak0) mi2Var.a.d).getValue());
        long j = d != null ? d.getValue().a : 0L;
        long j2 = intValue;
        return this.$targetOffset.invoke(Integer.valueOf((-((int) (mi2.g(this.this$0, (j2 & 4294967295L) | (j2 << 32), j) >> 32))) + ((int) (j >> 32))));
    }
}
