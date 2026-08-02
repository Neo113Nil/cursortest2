package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.addmethod.data.model.ApplicationBindingFlow;
import com.yandex.go.payments.addmethod.data.model.AsyncApplicationBindingFlow;
import com.yandex.go.payments.addmethod.data.model.BindPaymentMethodRequest;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import com.yandex.go.payments.addmethod.data.model.g0;
import defpackage.bb0;
import defpackage.cmt;
import defpackage.dg41;
import defpackage.evu0;
import defpackage.ff0;
import defpackage.ff41;
import defpackage.g9a0;
import defpackage.h4a0;
import defpackage.if0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.scg;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xe91;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$onLaunch$1", f = "AddMBankAccountBaseRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMBankAccountBaseRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ if0 $payload;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$onLaunch$1$3", f = "AddMBankAccountBaseRouter.kt", l = {114, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$onLaunch$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements tls {
        final /* synthetic */ ff41 $addMBankAccountApi;
        final /* synthetic */ if0 $payload;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(b bVar, if0 if0Var, ff41 ff41Var, Continuation continuation) {
            super(1, continuation);
            this.this$0 = bVar;
            this.$payload = if0Var;
            this.$addMBankAccountApi = ff41Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$payload, this.$addMBankAccountApi, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass3) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
        
            if (com.yandex.go.payments.mbank.navigation.b.Q(r3, r5, r1, r12, r11) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (r12 == r0) goto L19;
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
                h4a0 h4a0Var = this.this$0.I;
                h4a0Var.getClass();
                h4a0Var.a.a("PaymentMethod.AddMBank.Loading", new HashMap(), 1, new HashMap());
                zzs zzsVar = this.$payload.a;
                cmt<g0> c = this.this$0.N.c(new BindPaymentMethodRequest(PaymentMethod$Type.MBANK_ACCOUNT.getCode(), 16, this.$payload.b, this.$payload.d, scc.g(new Double(zzsVar.b), new Double(zzsVar.a))));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.d(c, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                kotlin.b.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (!(g0Var instanceof WebviewBindingFlow)) {
                if (!(g0Var instanceof ApplicationBindingFlow) && !(g0Var instanceof AsyncApplicationBindingFlow)) {
                    w511.b();
                    return null;
                }
                jst.e.c("AddMBankAccount received unexpected binding flow, expected WebviewBindingFlow");
                ny61.r("MBank requires webview binding flow");
                return null;
            }
            WebviewBindingFlow webviewBindingFlow = (WebviewBindingFlow) g0Var;
            String str = webviewBindingFlow.f;
            if (evu0.J(str)) {
                ny61.k();
                return null;
            }
            b bVar = this.this$0;
            ff41 ff41Var = this.$addMBankAccountApi;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMBankAccountBaseRouter$onLaunch$1(b bVar, if0 if0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = if0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddMBankAccountBaseRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddMBankAccountBaseRouter$onLaunch$1 addMBankAccountBaseRouter$onLaunch$1 = (AddMBankAccountBaseRouter$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addMBankAccountBaseRouter$onLaunch$1.invokeSuspend(zy11Var);
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
        g9a0.b(this.this$0.J, xe91.i(this.$payload.c), PaymentMethod$Type.MBANK_ACCOUNT.getCode());
        scg a = this.this$0.H.a();
        this.this$0.A(a.b(), new dg41(new UiWebViewConfig(null, null, false, false, false, false, null, false, true, null, false, false, null, null, null, 1, 0, true, false, null, false, false, 4030203, null), null, null, null, new ff0(0, this.this$0), null, null, 222), new bb0(this.this$0, 1));
        b bVar = this.this$0;
        b.R(bVar, null, new AnonymousClass3(bVar, this.$payload, a, null), 3);
        return zy11.a;
    }
}
