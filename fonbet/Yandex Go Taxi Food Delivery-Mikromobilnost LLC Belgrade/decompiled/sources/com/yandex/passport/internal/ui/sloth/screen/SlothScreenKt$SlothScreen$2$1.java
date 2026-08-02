package com.yandex.passport.internal.ui.sloth.screen;

import com.yandex.passport.sloth.i0;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.screen.SlothScreenKt$SlothScreen$2$1", f = "SlothScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothScreenKt$SlothScreen$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onExternalRequest;
    final /* synthetic */ i $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/sloth/i0;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/sloth/i0;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.sloth.screen.SlothScreenKt$SlothScreen$2$1$1", f = "SlothScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.sloth.screen.SlothScreenKt$SlothScreen$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tls $onExternalRequest;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tls tlsVar, Continuation continuation) {
            super(2, continuation);
            this.$onExternalRequest = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExternalRequest, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((i0) obj, (Continuation) obj2);
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
            this.$onExternalRequest.invoke((i0) this.L$0);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothScreenKt$SlothScreen$2$1(i iVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$viewModel = iVar;
        this.$onExternalRequest = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlothScreenKt$SlothScreen$2$1 slothScreenKt$SlothScreen$2$1 = new SlothScreenKt$SlothScreen$2$1(this.$viewModel, this.$onExternalRequest, continuation);
        slothScreenKt$SlothScreen$2$1.L$0 = obj;
        return slothScreenKt$SlothScreen$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SlothScreenKt$SlothScreen$2$1 slothScreenKt$SlothScreen$2$1 = (SlothScreenKt$SlothScreen$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        slothScreenKt$SlothScreen$2$1.invokeSuspend(zy11Var);
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
        kotlinx.coroutines.flow.e.H((tse) this.L$0, new jqr(this.$viewModel.c, new AnonymousClass1(this.$onExternalRequest, null), 3));
        return zy11.a;
    }
}
