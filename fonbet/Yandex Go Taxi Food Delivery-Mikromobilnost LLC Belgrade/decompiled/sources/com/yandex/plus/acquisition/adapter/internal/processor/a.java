package com.yandex.plus.acquisition.adapter.internal.processor;

import com.yandex.plus.acquisition.adapter.api.PlusAcquisitionSdkPaymentAnalyticsParams;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import defpackage.bvf0;
import defpackage.c0d0;
import defpackage.ls90;
import defpackage.mth;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rzc0;
import defpackage.szc0;
import defpackage.u42;
import defpackage.v42;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a {
    public final c0d0 a;
    public final rzc0 b;
    public final u42 c;
    public final r0 d;
    public final mth e;

    public a(c0d0 c0d0Var, rzc0 rzc0Var, v42 v42Var) {
        this.a = c0d0Var;
        this.b = rzc0Var;
        this.c = v42Var;
        r0 c = bvf0.c(null);
        this.d = c;
        this.e = new mth(c, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ee, code lost:
    
        if (r1 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, Map map, String str3, boolean z, PlusAcquisitionSdkPaymentAnalyticsParams plusAcquisitionSdkPaymentAnalyticsParams, Continuation continuation) {
        ButtonSectionStateProcessor$refreshButtonSectionState$1 buttonSectionStateProcessor$refreshButtonSectionState$1;
        int i;
        PlusAcquisitionPaymentAnalytics$Params a;
        Object obj;
        boolean z2;
        n4u0 n4u0Var;
        String str4 = str2;
        if (continuation instanceof ButtonSectionStateProcessor$refreshButtonSectionState$1) {
            buttonSectionStateProcessor$refreshButtonSectionState$1 = (ButtonSectionStateProcessor$refreshButtonSectionState$1) continuation;
            int i2 = buttonSectionStateProcessor$refreshButtonSectionState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                buttonSectionStateProcessor$refreshButtonSectionState$1.label = i2 - Integer.MIN_VALUE;
                ButtonSectionStateProcessor$refreshButtonSectionState$1 buttonSectionStateProcessor$refreshButtonSectionState$12 = buttonSectionStateProcessor$refreshButtonSectionState$1;
                Object obj2 = buttonSectionStateProcessor$refreshButtonSectionState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = buttonSectionStateProcessor$refreshButtonSectionState$12.label;
                r0 r0Var = this.d;
                if (i != 0) {
                    b.b(obj2);
                    szc0 szc0Var = new szc0(str, str4);
                    r0Var.getClass();
                    r0Var.m(null, szc0Var);
                    a = ((v42) this.c).a(plusAcquisitionSdkPaymentAnalyticsParams);
                    com.yandex.plus.acquisition.sdk.pay.impl.providers.a aVar = (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) ((ls90) this.a).f.getValue();
                    Set singleton = Collections.singleton(str4);
                    buttonSectionStateProcessor$refreshButtonSectionState$12.L$0 = str;
                    buttonSectionStateProcessor$refreshButtonSectionState$12.L$1 = str4;
                    buttonSectionStateProcessor$refreshButtonSectionState$12.L$2 = null;
                    buttonSectionStateProcessor$refreshButtonSectionState$12.L$3 = null;
                    buttonSectionStateProcessor$refreshButtonSectionState$12.L$4 = null;
                    buttonSectionStateProcessor$refreshButtonSectionState$12.L$5 = a;
                    buttonSectionStateProcessor$refreshButtonSectionState$12.Z$0 = z;
                    buttonSectionStateProcessor$refreshButtonSectionState$12.label = 1;
                    Serializable a2 = aVar.a(str, singleton, map, str3, z, a, buttonSectionStateProcessor$refreshButtonSectionState$12);
                    if (a2 != coroutineSingletons) {
                        obj = a2;
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n4u0 n4u0Var2 = (pz40) buttonSectionStateProcessor$refreshButtonSectionState$12.L$7;
                    b.b(obj2);
                    n4u0Var = n4u0Var2;
                    ((r0) n4u0Var).l(obj2);
                    return zy11.a;
                }
                boolean z3 = buttonSectionStateProcessor$refreshButtonSectionState$12.Z$0;
                PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params = (PlusAcquisitionPaymentAnalytics$Params) buttonSectionStateProcessor$refreshButtonSectionState$12.L$5;
                String str5 = (String) buttonSectionStateProcessor$refreshButtonSectionState$12.L$1;
                String str6 = (String) buttonSectionStateProcessor$refreshButtonSectionState$12.L$0;
                b.b(obj2);
                a = plusAcquisitionPaymentAnalytics$Params;
                str4 = str5;
                obj = obj2;
                z2 = z3;
                str = str6;
                buttonSectionStateProcessor$refreshButtonSectionState$12.L$0 = null;
                buttonSectionStateProcessor$refreshButtonSectionState$12.L$1 = null;
                buttonSectionStateProcessor$refreshButtonSectionState$12.L$2 = null;
                buttonSectionStateProcessor$refreshButtonSectionState$12.L$3 = null;
                buttonSectionStateProcessor$refreshButtonSectionState$12.L$4 = null;
                buttonSectionStateProcessor$refreshButtonSectionState$12.L$5 = null;
                buttonSectionStateProcessor$refreshButtonSectionState$12.L$6 = null;
                buttonSectionStateProcessor$refreshButtonSectionState$12.L$7 = r0Var;
                buttonSectionStateProcessor$refreshButtonSectionState$12.Z$0 = z2;
                buttonSectionStateProcessor$refreshButtonSectionState$12.label = 2;
                obj2 = ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.a) this.b).e(str, str4, a, (List) obj, buttonSectionStateProcessor$refreshButtonSectionState$12);
                n4u0Var = r0Var;
            }
        }
        buttonSectionStateProcessor$refreshButtonSectionState$1 = new ButtonSectionStateProcessor$refreshButtonSectionState$1(this, continuation);
        ButtonSectionStateProcessor$refreshButtonSectionState$1 buttonSectionStateProcessor$refreshButtonSectionState$122 = buttonSectionStateProcessor$refreshButtonSectionState$1;
        Object obj22 = buttonSectionStateProcessor$refreshButtonSectionState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = buttonSectionStateProcessor$refreshButtonSectionState$122.label;
        r0 r0Var2 = this.d;
        if (i != 0) {
        }
        buttonSectionStateProcessor$refreshButtonSectionState$122.L$0 = null;
        buttonSectionStateProcessor$refreshButtonSectionState$122.L$1 = null;
        buttonSectionStateProcessor$refreshButtonSectionState$122.L$2 = null;
        buttonSectionStateProcessor$refreshButtonSectionState$122.L$3 = null;
        buttonSectionStateProcessor$refreshButtonSectionState$122.L$4 = null;
        buttonSectionStateProcessor$refreshButtonSectionState$122.L$5 = null;
        buttonSectionStateProcessor$refreshButtonSectionState$122.L$6 = null;
        buttonSectionStateProcessor$refreshButtonSectionState$122.L$7 = r0Var2;
        buttonSectionStateProcessor$refreshButtonSectionState$122.Z$0 = z2;
        buttonSectionStateProcessor$refreshButtonSectionState$122.label = 2;
        obj22 = ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.a) this.b).e(str, str4, a, (List) obj, buttonSectionStateProcessor$refreshButtonSectionState$122);
        n4u0Var = r0Var2;
    }
}
