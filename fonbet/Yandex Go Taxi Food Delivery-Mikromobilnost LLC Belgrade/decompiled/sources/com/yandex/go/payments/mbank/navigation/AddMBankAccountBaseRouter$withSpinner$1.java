package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import defpackage.ai0;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tls;
import defpackage.tse;
import defpackage.wi0;
import defpackage.wls;
import defpackage.zi0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$withSpinner$1", f = "AddMBankAccountBaseRouter.kt", l = {UpdateOrganizationResult.BaseError.UNPROCESSABLE_ENTITY, NetworkRequestException.TOO_MANY_REQUESTS, 430, 435, 438}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMBankAccountBaseRouter$withSpinner$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ WebviewBindingFlow $info;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMBankAccountBaseRouter$withSpinner$1(WebviewBindingFlow webviewBindingFlow, b bVar, tls tlsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$info = webviewBindingFlow;
        this.this$0 = bVar;
        this.$action = tlsVar;
        this.$errorMessage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddMBankAccountBaseRouter$withSpinner$1(this.$info, this.this$0, this.$action, this.$errorMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddMBankAccountBaseRouter$withSpinner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        if (r7 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        String str;
        WebviewBindingFlow webviewBindingFlow;
        b bVar;
        String str2;
        WebviewBindingFlow webviewBindingFlow2;
        String str3;
        b bVar2;
        WebviewBindingFlow webviewBindingFlow3;
        String str4;
        tls tlsVar2;
        b bVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                WebviewBindingFlow webviewBindingFlow4 = this.$info;
                b bVar4 = this.this$0;
                tlsVar = this.$action;
                String str5 = this.$errorMessage;
                if (webviewBindingFlow4 != null) {
                    try {
                        str = webviewBindingFlow4.c;
                        if (str == null) {
                        }
                        wi0 wi0Var = bVar4.M;
                        ai0 ai0Var = new ai0(str, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
                        this.L$0 = bVar4;
                        this.L$1 = tlsVar;
                        this.L$2 = str5;
                        this.L$3 = webviewBindingFlow4;
                        this.L$4 = bVar4;
                        this.L$5 = null;
                        this.label = 1;
                        wi0Var.a(ai0Var, this);
                        if (zy11Var != coroutineSingletons) {
                            webviewBindingFlow2 = webviewBindingFlow4;
                            bVar = bVar4;
                            str3 = str5;
                            bVar2 = bVar;
                        }
                    } catch (Throwable unused) {
                        webviewBindingFlow = webviewBindingFlow4;
                        bVar = bVar4;
                        str2 = str5;
                        if (str2 == null) {
                        }
                        wi0 wi0Var2 = bVar.M;
                        ai0 ai0Var2 = new ai0(str2, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                        this.L$0 = bVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 4;
                        wi0Var2.a(ai0Var2, this);
                    }
                }
                str = ((avj0) bVar4.G).h(kyh0.add_payment_method_preparing_loading_text);
                wi0 wi0Var3 = bVar4.M;
                ai0 ai0Var3 = new ai0(str, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
                this.L$0 = bVar4;
                this.L$1 = tlsVar;
                this.L$2 = str5;
                this.L$3 = webviewBindingFlow4;
                this.L$4 = bVar4;
                this.L$5 = null;
                this.label = 1;
                wi0Var3.a(ai0Var3, this);
                if (zy11Var != coroutineSingletons) {
                }
            }
            if (i == 1) {
                bVar = (b) this.L$4;
                webviewBindingFlow2 = (WebviewBindingFlow) this.L$3;
                str3 = (String) this.L$2;
                tlsVar = (tls) this.L$1;
                bVar2 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    webviewBindingFlow = webviewBindingFlow2;
                    str2 = str3;
                    if (str2 == null) {
                        str2 = webviewBindingFlow != null ? webviewBindingFlow.b : null;
                        if (str2 == null) {
                            str2 = ((avj0) bVar.G).h(kyh0.add_payment_method_preparing_failed_text);
                        }
                    }
                    wi0 wi0Var22 = bVar.M;
                    ai0 ai0Var22 = new ai0(str2, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                    this.L$0 = bVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    wi0Var22.a(ai0Var22, this);
                }
            } else {
                if (i == 2) {
                    bVar = (b) this.L$3;
                    webviewBindingFlow3 = (WebviewBindingFlow) this.L$2;
                    str4 = (String) this.L$1;
                    tlsVar2 = (tls) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        this.L$0 = str4;
                        this.L$1 = webviewBindingFlow3;
                        this.L$2 = bVar;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                    } catch (Throwable unused3) {
                        webviewBindingFlow = webviewBindingFlow3;
                        str2 = str4;
                        if (str2 == null) {
                        }
                        wi0 wi0Var222 = bVar.M;
                        ai0 ai0Var222 = new ai0(str2, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                        this.L$0 = bVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 4;
                        wi0Var222.a(ai0Var222, this);
                    }
                    return tlsVar2.invoke(this) != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar3 = (b) this.L$0;
                        kotlin.b.b(obj);
                        bVar3.r(new qu(9));
                        return zy11Var;
                    }
                    bVar = (b) this.L$0;
                    kotlin.b.b(obj);
                    this.L$0 = bVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 5;
                    if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                        bVar3 = bVar;
                        bVar3.r(new qu(9));
                        return zy11Var;
                    }
                }
                bVar = (b) this.L$2;
                webviewBindingFlow = (WebviewBindingFlow) this.L$1;
                str2 = (String) this.L$0;
                try {
                    kotlin.b.b(obj);
                    return zy11Var;
                } catch (Throwable unused4) {
                    if (str2 == null) {
                    }
                    wi0 wi0Var2222 = bVar.M;
                    ai0 ai0Var2222 = new ai0(str2, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                    this.L$0 = bVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    wi0Var2222.a(ai0Var2222, this);
                }
            }
            zi0 zi0Var = (zi0) bVar2.K.get();
            bVar2.O = zi0Var;
            bVar2.z(zi0Var, sy60.Q2);
            this.L$0 = tlsVar;
            this.L$1 = str3;
            this.L$2 = webviewBindingFlow2;
            this.L$3 = bVar;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 2;
            if (kotlinx.coroutines.a.i(300L, this) != coroutineSingletons) {
                webviewBindingFlow3 = webviewBindingFlow2;
                str4 = str3;
                tlsVar2 = tlsVar;
                this.L$0 = str4;
                this.L$1 = webviewBindingFlow3;
                this.L$2 = bVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (tlsVar2.invoke(this) != coroutineSingletons) {
                }
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
