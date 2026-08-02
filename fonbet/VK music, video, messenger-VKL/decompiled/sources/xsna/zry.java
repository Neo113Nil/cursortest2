package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyGridState.kt */
@b6l(c = "androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2", f = "LazyGridState.kt", l = {IronSourceError.ERROR_BN_LOAD_NO_CONFIG}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class zry extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ dsy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zry(dsy dsyVar, int i, int i2, spj<? super zry> spjVar) {
        super(2, spjVar);
        this.this$0 = dsyVar;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zry zryVar = new zry(this.this$0, this.$index, this.$scrollOffset, spjVar);
        zryVar.L$0 = obj;
        return zryVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
        return ((zry) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ggh0 ggh0Var = (ggh0) this.L$0;
            dsy dsyVar = this.this$0;
            Ctry ctry = new Ctry(ggh0Var, dsyVar);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            fh9 fh9Var = dsy.w;
            int i4 = ((mry) ((zak0) dsyVar.e).getValue()).j * 100;
            azl azlVar = ((mry) ((zak0) this.this$0.e).getValue()).i;
            this.label = 1;
            if (kuy.a(ctry, i2, i3, i4, azlVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
