package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class ni2 extends Lambda implements izs<Integer, Integer> {
    final /* synthetic */ izs<Integer, Integer> $initialOffset;
    final /* synthetic */ mi2<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(mi2 mi2Var, izs izsVar) {
        super(1);
        this.$initialOffset = izsVar;
        this.this$0 = mi2Var;
    }

    @Override // xsna.izs
    public final Integer invoke(Integer num) {
        int intValue = num.intValue();
        izs<Integer, Integer> izsVar = this.$initialOffset;
        int h = (int) (mi2.h(this.this$0) >> 32);
        mi2<Object> mi2Var = this.this$0;
        long j = intValue;
        return izsVar.invoke(Integer.valueOf(h - ((int) (mi2.g(mi2Var, (j & 4294967295L) | (j << 32), mi2.h(mi2Var)) >> 32))));
    }
}
