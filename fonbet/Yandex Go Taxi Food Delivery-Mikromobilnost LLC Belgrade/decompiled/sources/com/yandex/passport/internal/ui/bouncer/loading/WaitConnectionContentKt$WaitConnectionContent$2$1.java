package com.yandex.passport.internal.ui.bouncer.loading;

import com.yandex.passport.internal.sloth.l;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.sloth.ui.r;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.loading.WaitConnectionContentKt$WaitConnectionContent$2$1", f = "WaitConnectionContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WaitConnectionContentKt$WaitConnectionContent$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ r $networkObserver;
    final /* synthetic */ t $wishSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitConnectionContentKt$WaitConnectionContent$2$1(r rVar, t tVar, Continuation continuation) {
        super(2, continuation);
        this.$networkObserver = rVar;
        this.$wishSource = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WaitConnectionContentKt$WaitConnectionContent$2$1(this.$networkObserver, this.$wishSource, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WaitConnectionContentKt$WaitConnectionContent$2$1 waitConnectionContentKt$WaitConnectionContent$2$1 = (WaitConnectionContentKt$WaitConnectionContent$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        waitConnectionContentKt$WaitConnectionContent$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(bvf0.a(get_context()), null, null, new WaitConnectionContentKt$WaitConnectionContent$2$1$invokeSuspend$$inlined$collectOn$1(((l) this.$networkObserver).a, null, this.$wishSource), 3);
        return zy11.a;
    }
}
