package com.yandex.go.payments.addmethod.navigation;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import defpackage.ai0;
import defpackage.avj0;
import defpackage.g9a0;
import defpackage.hk0;
import defpackage.ik0;
import defpackage.kyh0;
import defpackage.lvj0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tls;
import defpackage.tse;
import defpackage.uh0;
import defpackage.wi0;
import defpackage.wls;
import defpackage.xe91;
import defpackage.yvf0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddWalletBindingBaseRouter$withSpinner$1", f = "AddWalletBindingBaseRouter.kt", l = {293, 303, lvj0.NOT_MODIFIED, 316, 319}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddWalletBindingBaseRouter$withSpinner$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ uh0 $prerequisiteScreen;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddWalletBindingBaseRouter$withSpinner$1(uh0 uh0Var, e eVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$prerequisiteScreen = uh0Var;
        this.this$0 = eVar;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddWalletBindingBaseRouter$withSpinner$1(this.$prerequisiteScreen, this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddWalletBindingBaseRouter$withSpinner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0195, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r16) != r2) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e eVar;
        tls tlsVar;
        String str;
        uh0 uh0Var;
        e eVar2;
        uh0 uh0Var2;
        e eVar3;
        uh0 uh0Var3;
        e eVar4;
        String screen;
        String P;
        e eVar5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                uh0 uh0Var4 = this.$prerequisiteScreen;
                eVar = this.this$0;
                tlsVar = this.$action;
                if (uh0Var4 != null) {
                    try {
                        str = uh0Var4.a;
                        if (str == null) {
                        }
                        wi0 wi0Var = (wi0) eVar.D.j;
                        ai0 ai0Var = new ai0(str, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
                        this.L$0 = eVar;
                        this.L$1 = tlsVar;
                        this.L$2 = eVar;
                        this.L$3 = uh0Var4;
                        this.L$4 = null;
                        this.label = 1;
                        wi0Var.a(ai0Var, this);
                        if (zy11Var != coroutineSingletons) {
                            uh0Var2 = uh0Var4;
                            eVar3 = eVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        uh0Var = uh0Var4;
                        eVar2 = eVar;
                        ik0 ik0Var = eVar2.D;
                        ik0 ik0Var2 = eVar2.D;
                        g9a0 g9a0Var = (g9a0) ik0Var.i;
                        hk0 hk0Var = (hk0) eVar2.x;
                        if (hk0Var == null) {
                        }
                        if (screen == null) {
                        }
                        g9a0Var.c(xe91.i(screen), eVar2.U().getCode(), "fail");
                        P = e.P(eVar2, th);
                        if (P == null) {
                        }
                        wi0 wi0Var2 = (wi0) ik0Var2.j;
                        ai0 ai0Var2 = new ai0(P, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                        this.L$0 = eVar2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        wi0Var2.a(ai0Var2, this);
                        if (zy11Var != coroutineSingletons) {
                        }
                    }
                }
                str = ((avj0) ((zuj0) eVar.D.d)).h(kyh0.add_payment_method_preparing_loading_text);
                wi0 wi0Var3 = (wi0) eVar.D.j;
                ai0 ai0Var3 = new ai0(str, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
                this.L$0 = eVar;
                this.L$1 = tlsVar;
                this.L$2 = eVar;
                this.L$3 = uh0Var4;
                this.L$4 = null;
                this.label = 1;
                wi0Var3.a(ai0Var3, this);
                if (zy11Var != coroutineSingletons) {
                }
            }
            if (i == 1) {
                uh0Var2 = (uh0) this.L$3;
                eVar3 = (e) this.L$2;
                tlsVar = (tls) this.L$1;
                eVar = (e) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    uh0Var = uh0Var2;
                    eVar2 = eVar3;
                    ik0 ik0Var3 = eVar2.D;
                    ik0 ik0Var22 = eVar2.D;
                    g9a0 g9a0Var2 = (g9a0) ik0Var3.i;
                    hk0 hk0Var2 = (hk0) eVar2.x;
                    if (hk0Var2 == null) {
                    }
                    if (screen == null) {
                    }
                    g9a0Var2.c(xe91.i(screen), eVar2.U().getCode(), "fail");
                    P = e.P(eVar2, th);
                    if (P == null) {
                    }
                    wi0 wi0Var22 = (wi0) ik0Var22.j;
                    ai0 ai0Var22 = new ai0(P, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                    this.L$0 = eVar2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    wi0Var22.a(ai0Var22, this);
                    if (zy11Var != coroutineSingletons) {
                    }
                }
            } else {
                if (i == 2) {
                    uh0Var3 = (uh0) this.L$2;
                    eVar4 = (e) this.L$1;
                    tlsVar = (tls) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        this.L$0 = eVar4;
                        this.L$1 = uh0Var3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                    } catch (Throwable th3) {
                        th = th3;
                        uh0Var = uh0Var3;
                        eVar2 = eVar4;
                        ik0 ik0Var32 = eVar2.D;
                        ik0 ik0Var222 = eVar2.D;
                        g9a0 g9a0Var22 = (g9a0) ik0Var32.i;
                        hk0 hk0Var22 = (hk0) eVar2.x;
                        screen = hk0Var22 == null ? hk0Var22.getScreen() : null;
                        if (screen == null) {
                            screen = "";
                        }
                        g9a0Var22.c(xe91.i(screen), eVar2.U().getCode(), "fail");
                        P = e.P(eVar2, th);
                        if (P == null) {
                            P = uh0Var != null ? uh0Var.b : null;
                            if (P == null) {
                                P = ((avj0) ((zuj0) ik0Var222.d)).h(kyh0.add_payment_method_preparing_failed_text);
                            }
                        }
                        wi0 wi0Var222 = (wi0) ik0Var222.j;
                        ai0 ai0Var222 = new ai0(P, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                        this.L$0 = eVar2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        wi0Var222.a(ai0Var222, this);
                        if (zy11Var != coroutineSingletons) {
                            eVar5 = eVar2;
                            this.L$0 = eVar5;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 5;
                        }
                    }
                    return tlsVar.invoke(this) != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i == 3) {
                    uh0Var = (uh0) this.L$1;
                    eVar2 = (e) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        return zy11Var;
                    } catch (Throwable th4) {
                        th = th4;
                        ik0 ik0Var322 = eVar2.D;
                        ik0 ik0Var2222 = eVar2.D;
                        g9a0 g9a0Var222 = (g9a0) ik0Var322.i;
                        hk0 hk0Var222 = (hk0) eVar2.x;
                        if (hk0Var222 == null) {
                        }
                        if (screen == null) {
                        }
                        g9a0Var222.c(xe91.i(screen), eVar2.U().getCode(), "fail");
                        P = e.P(eVar2, th);
                        if (P == null) {
                        }
                        wi0 wi0Var2222 = (wi0) ik0Var2222.j;
                        ai0 ai0Var2222 = new ai0(P, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                        this.L$0 = eVar2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        wi0Var2222.a(ai0Var2222, this);
                        if (zy11Var != coroutineSingletons) {
                        }
                    }
                }
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar5 = (e) this.L$0;
                    kotlin.b.b(obj);
                    eVar5.r(new qu(9));
                    return zy11Var;
                }
                eVar5 = (e) this.L$0;
                kotlin.b.b(obj);
                this.L$0 = eVar5;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 5;
            }
            eVar.z((m950) ((yvf0) eVar.D.g).get(), sy60.Q2);
            this.L$0 = tlsVar;
            this.L$1 = eVar3;
            this.L$2 = uh0Var2;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                uh0Var3 = uh0Var2;
                eVar4 = eVar3;
                this.L$0 = eVar4;
                this.L$1 = uh0Var3;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                if (tlsVar.invoke(this) != coroutineSingletons) {
                }
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
