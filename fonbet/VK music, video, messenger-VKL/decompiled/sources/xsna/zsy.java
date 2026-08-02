package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyLayoutItemAnimation.kt */
@b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class zsy extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ phr<h9x> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ wsy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsy(wsy wsyVar, phr<h9x> phrVar, long j, spj<? super zsy> spjVar) {
        super(2, spjVar);
        this.this$0 = wsyVar;
        this.$spec = phrVar;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zsy(this.this$0, this.$spec, this.$totalDelta, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zsy) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(1:(1:(5:6|7|8|9|10)(2:14|15))(2:16|17))(10:25|26|(2:28|(1:30)(1:37))(1:38)|31|32|(2:34|(2:36|24))|19|20|21|22)|18|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (xsna.if2.c(r4, r5, r6, r7, r8, 4) != r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        phr phrVar;
        phr phrVar2;
        zsy zsyVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (((Boolean) ((zak0) this.this$0.o.d).getValue()).booleanValue()) {
                phr<h9x> phrVar3 = this.$spec;
                phrVar = phrVar3 instanceof xmk0 ? (xmk0) phrVar3 : aty.a;
            } else {
                phrVar = this.$spec;
            }
            phrVar2 = phrVar;
            if (!((Boolean) ((zak0) this.this$0.o.d).getValue()).booleanValue()) {
                if2<h9x, tq2> if2Var = this.this$0.o;
                h9x h9xVar = new h9x(this.$totalDelta);
                this.L$0 = phrVar2;
                this.label = 1;
                if (if2Var.e(h9xVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            phr phrVar4 = phrVar2;
            long c = h9x.c(this.this$0.o.d().a, this.$totalDelta);
            wsy wsyVar = this.this$0;
            if2<h9x, tq2> if2Var2 = wsyVar.o;
            h9x h9xVar2 = new h9x(c);
            ysy ysyVar = new ysy(wsyVar, c, 0);
            this.L$0 = null;
            this.label = 2;
            zsyVar = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                zsyVar = this;
                wsy wsyVar2 = zsyVar.this$0;
                int i2 = wsy.t;
                wsyVar2.g(false);
                zsyVar.this$0.g = false;
                return s3q0.a;
            }
            phrVar2 = (phr) this.L$0;
            kotlin.a.a(obj);
        }
        this.this$0.c.invoke();
        phr phrVar42 = phrVar2;
        long c2 = h9x.c(this.this$0.o.d().a, this.$totalDelta);
        wsy wsyVar3 = this.this$0;
        if2<h9x, tq2> if2Var22 = wsyVar3.o;
        h9x h9xVar22 = new h9x(c2);
        ysy ysyVar2 = new ysy(wsyVar3, c2, 0);
        this.L$0 = null;
        this.label = 2;
        zsyVar = this;
    }
}
