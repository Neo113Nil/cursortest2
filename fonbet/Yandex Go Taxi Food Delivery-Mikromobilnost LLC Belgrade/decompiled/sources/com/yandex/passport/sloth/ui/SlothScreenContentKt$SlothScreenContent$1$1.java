package com.yandex.passport.sloth.ui;

import android.net.Uri;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.tasks.zzw;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.SlothMetricaEvent$PhoneNumberHintState;
import defpackage.a4b1;
import defpackage.dtx0;
import defpackage.jqr;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yd00;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.SlothScreenContentKt$SlothScreenContent$1$1", f = "SlothScreenContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothScreenContentKt$SlothScreenContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.sloth.ui.dependencies.q $externalWishConsumer;
    final /* synthetic */ yd00 $requestPhoneHintLauncher;
    final /* synthetic */ h $slothActivityInteractor;
    final /* synthetic */ z1 $viewModel;
    final /* synthetic */ lz40 $webViewControlFlow;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/sloth/ui/o1;", "effect", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/sloth/ui/o1;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.sloth.ui.SlothScreenContentKt$SlothScreenContent$1$1$1", f = "SlothScreenContent.kt", l = {HProv.ALG_SID_SHA3_384, 82, 103}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.sloth.ui.SlothScreenContentKt$SlothScreenContent$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ com.yandex.passport.sloth.ui.dependencies.q $externalWishConsumer;
        final /* synthetic */ yd00 $requestPhoneHintLauncher;
        final /* synthetic */ h $slothActivityInteractor;
        final /* synthetic */ z1 $viewModel;
        final /* synthetic */ lz40 $webViewControlFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(yd00 yd00Var, lz40 lz40Var, h hVar, z1 z1Var, com.yandex.passport.sloth.ui.dependencies.q qVar, Continuation continuation) {
            super(2, continuation);
            this.$webViewControlFlow = lz40Var;
            this.$slothActivityInteractor = hVar;
            this.$requestPhoneHintLauncher = yd00Var;
            this.$externalWishConsumer = qVar;
            this.$viewModel = z1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            lz40 lz40Var = this.$webViewControlFlow;
            h hVar = this.$slothActivityInteractor;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$requestPhoneHintLauncher, lz40Var, hVar, this.$viewModel, this.$externalWishConsumer, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((o1) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            if (r1.emit(r2, r9) == r0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        
            if (r1.emit(r2, r9) == r0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0169, code lost:
        
            if (r10.emit(com.yandex.passport.sloth.ui.l2.a, r9) == r0) goto L63;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                o1 o1Var = (o1) this.L$0;
                if (o1Var instanceof h1) {
                    lz40 lz40Var = this.$webViewControlFlow;
                    j2 j2Var = new j2(((h1) o1Var).a);
                    this.label = 1;
                } else if (o1Var instanceof j1) {
                    lz40 lz40Var2 = this.$webViewControlFlow;
                    k2 k2Var = new k2(((j1) o1Var).a);
                    this.label = 2;
                } else if (o1Var instanceof k1) {
                    h hVar = this.$slothActivityInteractor;
                    k1 k1Var = (k1) o1Var;
                    String str = k1Var.a;
                    com.yandex.passport.sloth.p pVar = k1Var.b;
                    Uid uid = k1Var.c;
                    l lVar = hVar.a;
                    Uri uri = com.yandex.passport.common.browser.c.a;
                    Serializable d = com.yandex.passport.common.browser.c.d(hVar.d, str);
                    if (!(d instanceof Result.Failure)) {
                        ((com.yandex.passport.internal.ui.sloth.f) lVar).a(new com.yandex.passport.sloth.n0(pVar, true, (String) d, uid != null ? Long.valueOf(uid.getValue()) : null));
                    }
                    if (Result.a(d) != null) {
                        ((com.yandex.passport.internal.ui.sloth.f) lVar).a(new com.yandex.passport.sloth.n0(pVar, false, null, uid != null ? Long.valueOf(uid.getValue()) : null));
                    }
                } else if (o1Var instanceof n1) {
                    h hVar2 = this.$slothActivityInteractor;
                    yd00 yd00Var = this.$requestPhoneHintLauncher;
                    t tVar = new t(this.$viewModel, 3);
                    l lVar2 = hVar2.a;
                    GetPhoneNumberHintIntentRequest.builder().getClass();
                    GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = new GetPhoneNumberHintIntentRequest(0);
                    try {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Phone Number Hint started", 8);
                        }
                        ((com.yandex.passport.internal.ui.sloth.f) lVar2).a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.STARTED, (String) null));
                        zzw f = a4b1.a(hVar2.d).f(getPhoneNumberHintIntentRequest);
                        f fVar = new f(0, new e(0, yd00Var));
                        f.getClass();
                        f.g(dtx0.a, fVar);
                        f.d(new g(0, hVar2, tVar));
                    } catch (Exception e) {
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint failed", e);
                        }
                        ((com.yandex.passport.internal.ui.sloth.f) lVar2).a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.FAILED, e.getMessage()));
                        tVar.invoke(null);
                    }
                } else if (!(o1Var instanceof g1)) {
                    if (o1Var instanceof i1) {
                        this.$externalWishConsumer.a(SlothUiWish.CANCEL);
                    } else if (o1Var instanceof m1) {
                        h hVar3 = this.$slothActivityInteractor;
                        new com.yandex.passport.internal.util.h(((com.yandex.passport.internal.ui.sloth.g) hVar3.c).a).b(hVar3.d);
                    } else {
                        if (!(o1Var instanceof l1)) {
                            w511.b();
                            return null;
                        }
                        lz40 lz40Var3 = this.$webViewControlFlow;
                        this.label = 3;
                    }
                }
                return coroutineSingletons;
            }
            if (i != 1 && i != 2 && i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothScreenContentKt$SlothScreenContent$1$1(yd00 yd00Var, lz40 lz40Var, h hVar, z1 z1Var, com.yandex.passport.sloth.ui.dependencies.q qVar, Continuation continuation) {
        super(2, continuation);
        this.$viewModel = z1Var;
        this.$webViewControlFlow = lz40Var;
        this.$slothActivityInteractor = hVar;
        this.$requestPhoneHintLauncher = yd00Var;
        this.$externalWishConsumer = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        z1 z1Var = this.$viewModel;
        SlothScreenContentKt$SlothScreenContent$1$1 slothScreenContentKt$SlothScreenContent$1$1 = new SlothScreenContentKt$SlothScreenContent$1$1(this.$requestPhoneHintLauncher, this.$webViewControlFlow, this.$slothActivityInteractor, z1Var, this.$externalWishConsumer, continuation);
        slothScreenContentKt$SlothScreenContent$1$1.L$0 = obj;
        return slothScreenContentKt$SlothScreenContent$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SlothScreenContentKt$SlothScreenContent$1$1 slothScreenContentKt$SlothScreenContent$1$1 = (SlothScreenContentKt$SlothScreenContent$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        slothScreenContentKt$SlothScreenContent$1$1.invokeSuspend(zy11Var);
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
        z1 z1Var = this.$viewModel;
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(z1Var.w, new AnonymousClass1(this.$requestPhoneHintLauncher, this.$webViewControlFlow, this.$slothActivityInteractor, z1Var, this.$externalWishConsumer, null), 3));
        return zy11.a;
    }
}
