package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftComponentBase.kt */
@b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$modifyDraft$2", f = "ClipsDraftComponentBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class asd extends SuspendLambda implements wzs<lud, spj<? super s3q0>, Object> {
    final /* synthetic */ otd $draft;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asd(otd otdVar, spj<? super asd> spjVar) {
        super(2, spjVar);
        this.$draft = otdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        asd asdVar = new asd(this.$draft, spjVar);
        asdVar.L$0 = obj;
        return asdVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lud ludVar, spj<? super s3q0> spjVar) {
        return ((asd) create(ludVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        lud ludVar = (lud) this.L$0;
        otd otdVar = this.$draft;
        String str = otdVar.a.a;
        ludVar.a.q(q6x.D(otdVar).e5().toString(), str, true);
        otd otdVar2 = ludVar.d;
        if (epx.f(otdVar2 != null ? otdVar2.a.a : null, str)) {
            ludVar.d = otdVar;
        }
        return s3q0.a;
    }
}
