package com.yandex.go.payments.addmethod.navigation;

import com.yandex.go.payments.addmethod.data.model.ApplicationBindingFlow;
import com.yandex.go.payments.addmethod.data.model.AsyncApplicationBindingFlow;
import com.yandex.go.payments.addmethod.data.model.BindPaymentMethodRequest;
import com.yandex.go.payments.addmethod.data.model.UserDataField;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import com.yandex.go.payments.addmethod.data.model.g0;
import defpackage.cmt;
import defpackage.jd0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qaa0;
import defpackage.scc;
import defpackage.tls;
import defpackage.uh0;
import defpackage.w511;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1", f = "AddFastshiftAccountBaseRouter.kt", l = {156, 164, HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1 extends SuspendLambda implements tls {
    final /* synthetic */ tls $onBindUrlReceived;
    final /* synthetic */ tls $onError;
    final /* synthetic */ uh0 $prerequisiteScreen;
    final /* synthetic */ List<UserDataField> $userData;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1(c cVar, List list, tls tlsVar, uh0 uh0Var, tls tlsVar2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$userData = list;
        this.$onBindUrlReceived = tlsVar;
        this.$prerequisiteScreen = uh0Var;
        this.$onError = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AddFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1(this.this$0, this.$userData, this.$onBindUrlReceived, this.$prerequisiteScreen, this.$onError, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AddFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f0, code lost:
    
        if (com.yandex.go.payments.addmethod.navigation.c.P(r6, r7, r8, r9, r10, r12) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        if (r13 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0055, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<UserDataField> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qaa0 a = this.this$0.O.a();
            if (a == null || (r13 = a.b) == null) {
                po21 po21Var = this.this$0.H;
                this.label = 1;
                obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(this);
            }
            String code = PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode();
            String d = this.this$0.K.d();
            List g = scc.g(new Double(r13.b), new Double(r13.a));
            jd0 jd0Var = (jd0) this.this$0.x;
            String str = jd0Var == null ? jd0Var.b : null;
            list = this.$userData;
            if (list.isEmpty()) {
                list = null;
            }
            cmt<g0> c = this.this$0.N.c(new BindPaymentMethodRequest(code, g, d, list, str));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = ru.yandex.taxi.network.api.a.d(c, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                kotlin.b.b(obj);
                g0 g0Var = (g0) obj;
                if (g0Var instanceof ApplicationBindingFlow) {
                    c cVar = this.this$0;
                    String str2 = ((ApplicationBindingFlow) g0Var).a;
                    tls tlsVar = this.$onBindUrlReceived;
                    if (tlsVar != null) {
                        cVar.getClass();
                        tlsVar.invoke(str2);
                    } else {
                        cVar.V(str2);
                    }
                } else {
                    if (!(g0Var instanceof AsyncApplicationBindingFlow)) {
                        if (g0Var instanceof WebviewBindingFlow) {
                            ny61.r("Unexpected webview flow for fastshift_account");
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    c cVar2 = this.this$0;
                    String str3 = ((AsyncApplicationBindingFlow) g0Var).a;
                    uh0 uh0Var = this.$prerequisiteScreen;
                    tls tlsVar2 = this.$onBindUrlReceived;
                    tls tlsVar3 = this.$onError;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        zzs zzsVar = ((mo21) obj).a();
        String code2 = PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode();
        String d2 = this.this$0.K.d();
        List g2 = scc.g(new Double(zzsVar.b), new Double(zzsVar.a));
        jd0 jd0Var2 = (jd0) this.this$0.x;
        if (jd0Var2 == null) {
        }
        list = this.$userData;
        if (list.isEmpty()) {
        }
        cmt<g0> c2 = this.this$0.N.c(new BindPaymentMethodRequest(code2, g2, d2, list, str));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = ru.yandex.taxi.network.api.a.d(c2, this);
    }
}
