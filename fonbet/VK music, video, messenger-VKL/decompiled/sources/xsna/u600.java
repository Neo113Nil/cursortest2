package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: LottieAnimatable.kt */
/* loaded from: classes12.dex */
public final class u600 extends Lambda implements izs<Long, Boolean> {
    final /* synthetic */ int $iterations;
    final /* synthetic */ w600 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u600(w600 w600Var, int i) {
        super(1);
        this.this$0 = w600Var;
        this.$iterations = i;
    }

    @Override // xsna.izs
    public final Boolean invoke(Long l) {
        return Boolean.valueOf(w600.c(this.this$0, this.$iterations, l.longValue()));
    }
}
