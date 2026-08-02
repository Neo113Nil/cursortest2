package com.yandex.passport.sloth.ui;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.SlothScreenContentKt$SlothScreenContent$3$1", f = "SlothScreenContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothScreenContentKt$SlothScreenContent$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ k $component;
    final /* synthetic */ z1 $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/sloth/ui/c;", ACSPConstants.STATUS, "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/sloth/ui/c;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.sloth.ui.SlothScreenContentKt$SlothScreenContent$3$1$1", f = "SlothScreenContent.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.sloth.ui.SlothScreenContentKt$SlothScreenContent$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ z1 $viewModel;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(z1 z1Var, Continuation continuation) {
            super(2, continuation);
            this.$viewModel = z1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((c) obj, (Continuation) obj2);
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
            c cVar = (c) this.L$0;
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "SlothNetworkStatus " + cVar, 8);
            }
            if (jl40.l(cVar, c.a)) {
                this.$viewModel.W(r1.a);
            } else if (jl40.l(cVar, c.b)) {
                this.$viewModel.W(new u1(com.yandex.passport.sloth.ui.webview.b.a));
            } else if (cVar != null) {
                w511.b();
                return null;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothScreenContentKt$SlothScreenContent$3$1(k kVar, z1 z1Var, Continuation continuation) {
        super(2, continuation);
        this.$component = kVar;
        this.$viewModel = z1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlothScreenContentKt$SlothScreenContent$3$1 slothScreenContentKt$SlothScreenContent$3$1 = new SlothScreenContentKt$SlothScreenContent$3$1(this.$component, this.$viewModel, continuation);
        slothScreenContentKt$SlothScreenContent$3$1.L$0 = obj;
        return slothScreenContentKt$SlothScreenContent$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SlothScreenContentKt$SlothScreenContent$3$1 slothScreenContentKt$SlothScreenContent$3$1 = (SlothScreenContentKt$SlothScreenContent$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        slothScreenContentKt$SlothScreenContent$3$1.invokeSuspend(zy11Var);
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
        tse tseVar = (tse) this.L$0;
        r slothNetworkStatus = ((a) this.$component).a.getSlothNetworkStatus();
        q5z.h(slothNetworkStatus);
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(((com.yandex.passport.internal.sloth.l) slothNetworkStatus).a, new AnonymousClass1(this.$viewModel, null), 3));
        return zy11.a;
    }
}
