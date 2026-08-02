package com.yandex.go.payments.yape.navigation;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import defpackage.ai0;
import defpackage.avj0;
import defpackage.g9a0;
import defpackage.kyh0;
import defpackage.lk0;
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
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.yape.navigation.AddYapeTokenBaseRouter$withSpinner$1", f = "AddYapeTokenBaseRouter.kt", l = {113, HProv.PP_PASSWD_TERM, HProv.PP_SAME_MEDIA, HProv.PP_CONTAINER_EXTENSION_DEL, HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddYapeTokenBaseRouter$withSpinner$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ uh0 $prerequisiteScreen;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddYapeTokenBaseRouter$withSpinner$1(uh0 uh0Var, c cVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$prerequisiteScreen = uh0Var;
        this.this$0 = cVar;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddYapeTokenBaseRouter$withSpinner$1(this.$prerequisiteScreen, this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddYapeTokenBaseRouter$withSpinner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uh0 uh0Var;
        String str;
        c cVar;
        c cVar2;
        tls tlsVar;
        c cVar3;
        c cVar4;
        tls tlsVar2;
        String str2;
        c cVar5;
        c cVar6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                uh0Var = this.$prerequisiteScreen;
                c cVar7 = this.this$0;
                tls tlsVar3 = this.$action;
                if (uh0Var != null) {
                    try {
                        str = uh0Var.a;
                        if (str == null) {
                        }
                        wi0 wi0Var = cVar7.K;
                        ai0 ai0Var = new ai0(str, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
                        this.L$0 = cVar7;
                        this.L$1 = tlsVar3;
                        this.L$2 = cVar7;
                        this.L$3 = uh0Var;
                        this.L$4 = null;
                        this.label = 1;
                        wi0Var.a(ai0Var, this);
                        if (zy11Var != coroutineSingletons) {
                            cVar2 = cVar7;
                            tlsVar = tlsVar3;
                            cVar3 = cVar2;
                        }
                    } catch (Throwable unused) {
                        cVar = cVar7;
                        g9a0 g9a0Var = cVar.J;
                        lk0 lk0Var = (lk0) cVar.x;
                        if (lk0Var == null) {
                        }
                        if (str2 == null) {
                        }
                        g9a0Var.c(xe91.i(str2), PaymentMethod$Type.YAPE_TOKEN.getCode(), "fail");
                        if (uh0Var != null) {
                        }
                        String h = ((avj0) cVar.E).h(kyh0.add_payment_method_preparing_failed_text);
                        wi0 wi0Var2 = cVar.K;
                        ai0 ai0Var2 = new ai0(h, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                        this.L$0 = cVar;
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
                str = ((avj0) cVar7.E).h(kyh0.add_payment_method_preparing_loading_text);
                wi0 wi0Var3 = cVar7.K;
                ai0 ai0Var3 = new ai0(str, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
                this.L$0 = cVar7;
                this.L$1 = tlsVar3;
                this.L$2 = cVar7;
                this.L$3 = uh0Var;
                this.L$4 = null;
                this.label = 1;
                wi0Var3.a(ai0Var3, this);
                if (zy11Var != coroutineSingletons) {
                }
            }
            if (i != 1) {
                if (i == 2) {
                    uh0Var = (uh0) this.L$2;
                    cVar4 = (c) this.L$1;
                    tlsVar2 = (tls) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        this.L$0 = cVar4;
                        this.L$1 = uh0Var;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                    } catch (Throwable unused2) {
                        cVar = cVar4;
                        g9a0 g9a0Var2 = cVar.J;
                        lk0 lk0Var2 = (lk0) cVar.x;
                        str2 = lk0Var2 == null ? lk0Var2.a : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        g9a0Var2.c(xe91.i(str2), PaymentMethod$Type.YAPE_TOKEN.getCode(), "fail");
                        if (uh0Var != null || (h = uh0Var.b) == null) {
                            String h2 = ((avj0) cVar.E).h(kyh0.add_payment_method_preparing_failed_text);
                        }
                        wi0 wi0Var22 = cVar.K;
                        ai0 ai0Var22 = new ai0(h2, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                        this.L$0 = cVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        wi0Var22.a(ai0Var22, this);
                        if (zy11Var != coroutineSingletons) {
                            cVar5 = cVar;
                            this.L$0 = cVar5;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 5;
                            if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                            }
                        }
                    }
                    return tlsVar2.invoke(this) != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i == 3) {
                    uh0Var = (uh0) this.L$1;
                    cVar = (c) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        return zy11Var;
                    } catch (Throwable unused3) {
                        g9a0 g9a0Var22 = cVar.J;
                        lk0 lk0Var22 = (lk0) cVar.x;
                        if (lk0Var22 == null) {
                        }
                        if (str2 == null) {
                        }
                        g9a0Var22.c(xe91.i(str2), PaymentMethod$Type.YAPE_TOKEN.getCode(), "fail");
                        if (uh0Var != null) {
                        }
                        String h22 = ((avj0) cVar.E).h(kyh0.add_payment_method_preparing_failed_text);
                        wi0 wi0Var222 = cVar.K;
                        ai0 ai0Var222 = new ai0(h22, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                        this.L$0 = cVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        wi0Var222.a(ai0Var222, this);
                        if (zy11Var != coroutineSingletons) {
                        }
                    }
                }
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar6 = (c) this.L$0;
                    kotlin.b.b(obj);
                    cVar6.r(new qu(9));
                    return zy11Var;
                }
                cVar5 = (c) this.L$0;
                kotlin.b.b(obj);
                this.L$0 = cVar5;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                    cVar6 = cVar5;
                    cVar6.r(new qu(9));
                    return zy11Var;
                }
            }
            uh0Var = (uh0) this.L$3;
            cVar2 = (c) this.L$2;
            tlsVar = (tls) this.L$1;
            cVar3 = (c) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable unused4) {
                cVar = cVar2;
                g9a0 g9a0Var222 = cVar.J;
                lk0 lk0Var222 = (lk0) cVar.x;
                if (lk0Var222 == null) {
                }
                if (str2 == null) {
                }
                g9a0Var222.c(xe91.i(str2), PaymentMethod$Type.YAPE_TOKEN.getCode(), "fail");
                if (uh0Var != null) {
                }
                String h222 = ((avj0) cVar.E).h(kyh0.add_payment_method_preparing_failed_text);
                wi0 wi0Var2222 = cVar.K;
                ai0 ai0Var2222 = new ai0(h222, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                this.L$0 = cVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 4;
                wi0Var2222.a(ai0Var2222, this);
                if (zy11Var != coroutineSingletons) {
                }
            }
            cVar3.z((m950) cVar3.H.get(), sy60.Q2);
            this.L$0 = tlsVar;
            this.L$1 = cVar2;
            this.L$2 = uh0Var;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                cVar4 = cVar2;
                tlsVar2 = tlsVar;
                this.L$0 = cVar4;
                this.L$1 = uh0Var;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                if (tlsVar2.invoke(this) != coroutineSingletons) {
                }
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
