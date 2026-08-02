package com.yandex.passport.internal.ui.challenge.vpn;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.VpnStatus;
import com.yandex.passport.internal.report.ec;
import com.yandex.passport.internal.report.reporters.g1;
import defpackage.gci0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeStoreFactory$ExecutorImpl$observeVpnStatus$1", f = "VpnChallengeStoreFactory.kt", l = {HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VpnChallengeStoreFactory$ExecutorImpl$observeVpnStatus$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/internal/entities/VpnStatus;", ACSPConstants.STATUS, "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/internal/entities/VpnStatus;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeStoreFactory$ExecutorImpl$observeVpnStatus$1$1", f = "VpnChallengeStoreFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeStoreFactory$ExecutorImpl$observeVpnStatus$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((VpnStatus) obj, (Continuation) obj2);
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
            VpnStatus vpnStatus = (VpnStatus) this.L$0;
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "observeVpnStatus new status: " + vpnStatus, 8);
            }
            if (jl40.l(vpnStatus, VpnStatus.Allowed.INSTANCE)) {
                g1 g1Var = this.this$0.e;
                g1Var.getClass();
                g1Var.h(ec.w);
                this.this$0.k();
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VpnChallengeStoreFactory$ExecutorImpl$observeVpnStatus$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VpnChallengeStoreFactory$ExecutorImpl$observeVpnStatus$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VpnChallengeStoreFactory$ExecutorImpl$observeVpnStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            gci0 gci0Var = hVar.c.l;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hVar, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(gci0Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
