package com.yandex.go.payments.domain;

import defpackage.a2a0;
import defpackage.avj0;
import defpackage.d600;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.kyh0;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.m1a0;
import defpackage.mcp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1c;
import defpackage.tse;
import defpackage.v7x;
import defpackage.vbn;
import defpackage.wls;
import defpackage.xea0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ld600;", "<anonymous>", "(Ltse;)Ld600;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.MainMenuPaymentUiStateInteractorImpl$toUiState$2", f = "MainMenuPaymentUiStateInteractorImpl.kt", l = {100, 101, HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainMenuPaymentUiStateInteractorImpl$toUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ lv90 $compositePayment;
    final /* synthetic */ boolean $hasMultipleActiveOrders;
    final /* synthetic */ boolean $hasUnverifiedCards;
    final /* synthetic */ lv90 $selectedPayment;
    final /* synthetic */ boolean $selectorExperimentEnabled;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuPaymentUiStateInteractorImpl$toUiState$2(u uVar, lv90 lv90Var, lv90 lv90Var2, boolean z, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uVar;
        this.$selectedPayment = lv90Var;
        this.$compositePayment = lv90Var2;
        this.$selectorExperimentEnabled = z;
        this.$hasUnverifiedCards = z2;
        this.$hasMultipleActiveOrders = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainMenuPaymentUiStateInteractorImpl$toUiState$2(this.this$0, this.$selectedPayment, this.$compositePayment, this.$selectorExperimentEnabled, this.$hasUnverifiedCards, this.$hasMultipleActiveOrders, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainMenuPaymentUiStateInteractorImpl$toUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0070, code lost:
    
        if (r1 == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x005f, code lost:
    
        if (r0 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object a;
        m1a0 m1a0Var;
        Object a2;
        m1a0 m1a0Var2;
        lea0 lea0Var;
        Object a3;
        m1a0 m1a0Var3;
        lea0 lea0Var2;
        String str2;
        boolean z;
        Pair pair;
        String obj2;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        str = "";
        if (i == 0) {
            kotlin.b.b(obj);
            a2a0 a2a0Var = this.this$0.j;
            lv90 lv90Var = this.$selectedPayment;
            lv90 lv90Var2 = this.$compositePayment;
            this.label = 1;
            a = a2a0.a(a2a0Var, lv90Var, lv90Var2, null, this, 12);
        } else {
            if (i != 1) {
                if (i == 2) {
                    m1a0Var = (m1a0) this.L$0;
                    kotlin.b.b(obj);
                    a2 = obj;
                    m1a0Var2 = m1a0Var;
                    lea0Var = (lea0) a2;
                    lv90 lv90Var3 = this.$selectedPayment;
                    String str4 = lv90Var3.b;
                    PaymentMethod$Type paymentMethod$Type = lv90Var3.a;
                    if (str4 != null && paymentMethod$Type != null) {
                        y yVar = this.this$0.d;
                        xea0 xea0Var = new xea0(str4, paymentMethod$Type);
                        this.L$0 = m1a0Var2;
                        this.L$1 = lea0Var;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = "";
                        this.label = 3;
                        a3 = yVar.a(xea0Var, this);
                        if (a3 != coroutineSingletons) {
                            m1a0Var3 = m1a0Var2;
                            lea0Var2 = lea0Var;
                            str2 = "";
                            str3 = (String) a3;
                            if (evu0.J(str3)) {
                            }
                            lea0Var = lea0Var2;
                            m1a0Var2 = m1a0Var3;
                        }
                        return coroutineSingletons;
                    }
                    z = this.$selectorExperimentEnabled;
                    if (z) {
                    }
                    if (z) {
                    }
                    pair = new Pair(null, Boolean.FALSE);
                    String str5 = (String) pair.getFirst();
                    boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                    boolean z2 = this.$hasMultipleActiveOrders;
                    boolean z3 = !z2;
                    boolean z4 = this.$selectorExperimentEnabled;
                    boolean z5 = z4 && !z2;
                    u uVar = this.this$0;
                    lv90 lv90Var4 = this.$selectedPayment;
                    uVar.getClass();
                    return new d600(z3, z5, (lv90Var4.a == null || z4) ? kyh0.payment_section_title : kyh0.paymentmethod_title, str5, booleanValue, m1a0Var2);
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str6 = (String) this.L$4;
                lea0 lea0Var3 = (lea0) this.L$1;
                m1a0 m1a0Var4 = (m1a0) this.L$0;
                kotlin.b.b(obj);
                m1a0Var3 = m1a0Var4;
                lea0Var2 = lea0Var3;
                str2 = str6;
                a3 = obj;
                str3 = (String) a3;
                if (evu0.J(str3)) {
                    str = str3.concat(this.$selectedPayment.a == PaymentMethod$Type.CARD ? g8e.o(" ", m1a0Var3.a) : "");
                } else {
                    str = str2;
                }
                lea0Var = lea0Var2;
                m1a0Var2 = m1a0Var3;
                z = this.$selectorExperimentEnabled;
                if (z && this.$hasUnverifiedCards) {
                    pair = new Pair(((avj0) this.this$0.i).h(kyh0.confirm_card_toolbar_title), Boolean.TRUE);
                } else if (!z || this.$hasMultipleActiveOrders) {
                    pair = new Pair(null, Boolean.FALSE);
                } else {
                    u uVar2 = this.this$0;
                    lv90 lv90Var5 = this.$selectedPayment;
                    if (str.length() == 0) {
                        uVar2.getClass();
                        if (lea0Var instanceof p1c) {
                            obj2 = ((p1c) lea0Var).c;
                        } else if (lea0Var instanceof vbn) {
                            obj2 = ((vbn) lea0Var).d;
                        } else if (lea0Var instanceof v7x) {
                            obj2 = ((v7x) lea0Var).d;
                        } else if (lea0Var instanceof mcp) {
                            obj2 = ((mcp) lea0Var).d;
                        } else if (lea0Var != null) {
                            obj2 = evu0.k0(m1a0Var2.a() + " " + m1a0Var2.b).toString();
                        } else if (lv90Var5.a == PaymentMethod$Type.FASTSHIFT_ACCOUNT) {
                            obj2 = m1a0Var2.a();
                        } else {
                            obj2 = evu0.k0(m1a0Var2.a() + " " + m1a0Var2.b).toString();
                        }
                        str = obj2;
                    }
                    pair = new Pair(str, Boolean.FALSE);
                }
                String str52 = (String) pair.getFirst();
                boolean booleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
                boolean z22 = this.$hasMultipleActiveOrders;
                boolean z32 = !z22;
                boolean z42 = this.$selectorExperimentEnabled;
                boolean z52 = z42 && !z22;
                u uVar3 = this.this$0;
                lv90 lv90Var42 = this.$selectedPayment;
                uVar3.getClass();
                return new d600(z32, z52, (lv90Var42.a == null || z42) ? kyh0.payment_section_title : kyh0.paymentmethod_title, str52, booleanValue2, m1a0Var2);
            }
            kotlin.b.b(obj);
            a = obj;
        }
        m1a0Var = (m1a0) a;
        u uVar4 = this.this$0;
        lv90 lv90Var6 = this.$selectedPayment;
        this.L$0 = m1a0Var;
        this.label = 2;
        a2 = u.a(uVar4, lv90Var6, this);
    }
}
