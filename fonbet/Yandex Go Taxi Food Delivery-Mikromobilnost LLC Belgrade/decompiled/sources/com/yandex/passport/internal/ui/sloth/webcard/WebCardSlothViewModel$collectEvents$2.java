package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$collectEvents$2", f = "WebCardSlothViewModel.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebCardSlothViewModel$collectEvents$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d1 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/sloth/a1;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/sloth/a1;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$collectEvents$2$1", f = "WebCardSlothViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$collectEvents$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((com.yandex.passport.sloth.a1) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
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
            com.yandex.passport.sloth.a1 a1Var = (com.yandex.passport.sloth.a1) this.L$0;
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth result: " + a1Var, 8);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardSlothViewModel$collectEvents$2(d1 d1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebCardSlothViewModel$collectEvents$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebCardSlothViewModel$collectEvents$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj3 = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj3;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.sloth.c1 c1Var = this.this$0.B;
        if (c1Var == null) {
            c1Var = null;
        }
        kotlinx.coroutines.flow.n0 n0Var = c1Var.c.e;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
        kotlinx.coroutines.flow.n0 n0Var2 = this.this$0.F;
        this.label = 1;
        kotlinx.coroutines.flow.i0 i0Var = new kotlinx.coroutines.flow.i0(n0Var2, anonymousClass1);
        n0Var.getClass();
        Object m = kotlinx.coroutines.flow.n0.m(n0Var, i0Var, this);
        if (m != obj2) {
            m = obj3;
        }
        return m == obj2 ? obj2 : obj3;
    }
}
