package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftComponentBase.kt */
@b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$retrieveDraft$2", f = "ClipsDraftComponentBase.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class bsd extends SuspendLambda implements wzs<lud, spj<? super otd>, Object> {
    final /* synthetic */ wzs<lud, spj<? super otd>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bsd(wzs<? super lud, ? super spj<? super otd>, ? extends Object> wzsVar, spj<? super bsd> spjVar) {
        super(2, spjVar);
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        bsd bsdVar = new bsd(this.$block, spjVar);
        bsdVar.L$0 = obj;
        return bsdVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lud ludVar, spj<? super otd> spjVar) {
        return ((bsd) create(ludVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lud ludVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lud ludVar2 = (lud) this.L$0;
            wzs<lud, spj<? super otd>, Object> wzsVar = this.$block;
            this.L$0 = ludVar2;
            this.label = 1;
            Object invoke = wzsVar.invoke(ludVar2, this);
            if (invoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            ludVar = ludVar2;
            obj = invoke;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ludVar = (lud) this.L$0;
            kotlin.a.a(obj);
        }
        otd otdVar = (otd) obj;
        if (otdVar != null) {
            return ludVar.b(otdVar);
        }
        return null;
    }
}
