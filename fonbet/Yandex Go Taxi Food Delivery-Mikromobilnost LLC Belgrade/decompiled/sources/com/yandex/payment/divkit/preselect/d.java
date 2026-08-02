package com.yandex.payment.divkit.preselect;

import com.yandex.payment.divkit.select.PlusCardTopUpState;
import com.yandex.payment.divkit.usecases.l;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.a8a0;
import defpackage.dtf;
import defpackage.ewe0;
import defpackage.jl40;
import defpackage.kcq0;
import defpackage.ny61;
import defpackage.ptf;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.vpr;
import defpackage.y22;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class d implements vpr {
    public final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x006c, code lost:
    
        if (com.yandex.payment.divkit.preselect.f.W(r9, (org.json.JSONObject) r11, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0053, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ptf ptfVar, Continuation continuation) {
        DKPreselectViewModel$observePaymentMethods$1$3$emit$1 dKPreselectViewModel$observePaymentMethods$1$3$emit$1;
        int i;
        String str;
        PaymentMethod paymentMethod;
        List<String> restrictions;
        if (continuation instanceof DKPreselectViewModel$observePaymentMethods$1$3$emit$1) {
            dKPreselectViewModel$observePaymentMethods$1$3$emit$1 = (DKPreselectViewModel$observePaymentMethods$1$3$emit$1) continuation;
            int i2 = dKPreselectViewModel$observePaymentMethods$1$3$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKPreselectViewModel$observePaymentMethods$1$3$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKPreselectViewModel$observePaymentMethods$1$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKPreselectViewModel$observePaymentMethods$1$3$emit$1.label;
                f fVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = fVar.b;
                    dtf dtfVar = ptfVar.a;
                    dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$0 = ptfVar;
                    dKPreselectViewModel$observePaymentMethods$1$3$emit$1.label = 1;
                    obj = lVar.b(dtfVar, dKPreselectViewModel$observePaymentMethods$1$3$emit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ptfVar = (ptf) dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$0;
                        kotlin.b.b(obj);
                        List list = ptfVar.b;
                        boolean z = ptfVar.c;
                        fVar.getClass();
                        rwo rwoVar = fVar.c;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            PaymentMethod paymentMethod2 = (PaymentMethod) obj2;
                            if (!(paymentMethod2 instanceof PaymentMethod.Card) || (restrictions = ((PaymentMethod.Card) paymentMethod2).getRestrictions()) == null || restrictions.isEmpty()) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.size() != 1 || z) {
                            Integer Y = fVar.Y(list);
                            PaymentMethod paymentMethod3 = Y != null ? (PaymentMethod) list.get(Y.intValue()) : null;
                            if (Y != null) {
                                int intValue = Y.intValue();
                                kcq0 kcq0Var = fVar.A;
                                if (kcq0Var != null) {
                                    kcq0Var.onSelectPaymentMethod(intValue);
                                }
                                kcq0 kcq0Var2 = fVar.A;
                                if (kcq0Var2 != null && (paymentMethod = kcq0Var2.z) != null) {
                                    ((y22) rwoVar).a(f.X(paymentMethod, true));
                                }
                            }
                            if (fVar.C != null) {
                                if (paymentMethod3 == null || !jl40.l(a8a0.c(paymentMethod3), fVar.C)) {
                                    sv90 sv90Var = qv90.a;
                                    String str2 = fVar.C;
                                    str = str2 != null ? str2 : "";
                                    sv90Var.getClass();
                                    ((y22) rwoVar).a(sv90.m(str));
                                } else {
                                    sv90 sv90Var2 = qv90.a;
                                    String str3 = fVar.C;
                                    str = str3 != null ? str3 : "";
                                    sv90Var2.getClass();
                                    ((y22) rwoVar).a(sv90.l(str));
                                }
                            }
                            if (fVar.K.getValue() != PlusCardTopUpState.LOADING) {
                                r0 r0Var = fVar.D;
                                ewe0 ewe0Var = new ewe0();
                                r0Var.getClass();
                                r0Var.m(null, ewe0Var);
                            }
                        } else {
                            fVar.Z((PaymentMethod) kotlin.collections.a.P(arrayList), false);
                        }
                        sv90 sv90Var3 = qv90.a;
                        DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
                        sv90Var3.getClass();
                        ((y22) rwoVar).a(sv90.f0(divCardForAnalytics).d(null));
                        return zy11.a;
                    }
                    ptfVar = (ptf) dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                fVar.getClass();
                dtf dtfVar2 = ptfVar.a;
                dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$0 = ptfVar;
                dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$1 = obj;
                dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$2 = null;
                dKPreselectViewModel$observePaymentMethods$1$3$emit$1.I$0 = 0;
                dKPreselectViewModel$observePaymentMethods$1$3$emit$1.label = 2;
            }
        }
        dKPreselectViewModel$observePaymentMethods$1$3$emit$1 = new DKPreselectViewModel$observePaymentMethods$1$3$emit$1(this, continuation);
        Object obj3 = dKPreselectViewModel$observePaymentMethods$1$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKPreselectViewModel$observePaymentMethods$1$3$emit$1.label;
        f fVar2 = this.a;
        if (i != 0) {
        }
        fVar2.getClass();
        dtf dtfVar22 = ptfVar.a;
        dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$0 = ptfVar;
        dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$1 = obj3;
        dKPreselectViewModel$observePaymentMethods$1$3$emit$1.L$2 = null;
        dKPreselectViewModel$observePaymentMethods$1$3$emit$1.I$0 = 0;
        dKPreselectViewModel$observePaymentMethods$1$3$emit$1.label = 2;
    }
}
