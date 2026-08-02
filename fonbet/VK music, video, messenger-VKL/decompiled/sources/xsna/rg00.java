package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ch00;

/* compiled from: ManageCommunitiesNotificationsFeature.kt */
@b6l(c = "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsFeature$deleteGroup$1", f = "ManageCommunitiesNotificationsFeature.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class rg00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $id;
    int label;
    final /* synthetic */ tg00 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg00(tg00 tg00Var, long j, spj<? super rg00> spjVar) {
        super(2, spjVar);
        this.this$0 = tg00Var;
        this.$id = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rg00(this.this$0, this.$id, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rg00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            rqu rquVar = this.this$0.h;
            long j = this.$id;
            this.label = 1;
            a = rquVar.a(j, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        tg00 tg00Var = this.this$0;
        if (!(a instanceof Result.Failure)) {
            myc0.h(tg00Var.i, null, null, new sg00(tg00Var, null), 3);
        }
        tg00 tg00Var2 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            tg00Var2.g.b(new ch00.e(a2));
        }
        return s3q0.a;
    }
}
