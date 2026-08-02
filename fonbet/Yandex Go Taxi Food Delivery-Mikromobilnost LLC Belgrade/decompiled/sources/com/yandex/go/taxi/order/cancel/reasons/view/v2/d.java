package com.yandex.go.taxi.order.cancel.reasons.view.v2;

import com.yandex.go.taxi.order.cancel.reasons.analytics.CancelReasonsAnalytics$CloseReason;
import defpackage.ad5;
import defpackage.ay7;
import defpackage.bx7;
import defpackage.co40;
import defpackage.da0;
import defpackage.gy7;
import defpackage.ny61;
import defpackage.oxu0;
import defpackage.r;
import defpackage.scc;
import defpackage.sr4;
import defpackage.sx7;
import defpackage.tx7;
import defpackage.ux7;
import defpackage.vw7;
import defpackage.vx7;
import defpackage.w511;
import defpackage.yx7;
import defpackage.zw7;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class d extends ad5 {
    public final oxu0 A;
    public final sr4 B;
    public boolean C;
    public final com.yandex.go.taxi.order.cancel.reasons.interactor.a x;
    public final yx7 y;
    public final bx7 z;

    public d(com.yandex.go.taxi.order.cancel.reasons.interactor.a aVar, yx7 yx7Var, bx7 bx7Var, oxu0 oxu0Var, sr4 sr4Var) {
        super(ay7.class);
        this.x = aVar;
        this.y = yx7Var;
        this.z = bx7Var;
        this.A = oxu0Var;
        this.B = sr4Var;
        this.C = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, gy7 gy7Var, Continuation continuation) {
        CancelReasonsV2Presenter$reportScreenShownIfItNeed$1 cancelReasonsV2Presenter$reportScreenShownIfItNeed$1;
        int i;
        dVar.getClass();
        if (continuation instanceof CancelReasonsV2Presenter$reportScreenShownIfItNeed$1) {
            cancelReasonsV2Presenter$reportScreenShownIfItNeed$1 = (CancelReasonsV2Presenter$reportScreenShownIfItNeed$1) continuation;
            int i2 = cancelReasonsV2Presenter$reportScreenShownIfItNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelReasonsV2Presenter$reportScreenShownIfItNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cancelReasonsV2Presenter$reportScreenShownIfItNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelReasonsV2Presenter$reportScreenShownIfItNeed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (dVar.C) {
                        dVar.C = false;
                        com.yandex.go.taxi.order.cancel.reasons.interactor.a aVar = dVar.x;
                        ArrayList arrayList = gy7Var.c;
                        cancelReasonsV2Presenter$reportScreenShownIfItNeed$1.L$0 = null;
                        cancelReasonsV2Presenter$reportScreenShownIfItNeed$1.label = 1;
                        obj = aVar.a(arrayList, cancelReasonsV2Presenter$reportScreenShownIfItNeed$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                zw7 zw7Var = (zw7) obj;
                bx7 bx7Var = dVar.z;
                co40 co40Var = bx7Var.a;
                String str = bx7Var.b.b().a;
                List J0 = kotlin.collections.a.J0(zw7Var.a);
                List J02 = kotlin.collections.a.J0(zw7Var.b);
                co40Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", str);
                hashMap.put("button_list", J0);
                hashMap.put("button_list_more", J02);
                co40Var.a.a("OrderFeedback.Rate.Show", hashMap, 1, new HashMap());
                return zy11.a;
            }
        }
        cancelReasonsV2Presenter$reportScreenShownIfItNeed$1 = new CancelReasonsV2Presenter$reportScreenShownIfItNeed$1(dVar, continuation);
        Object obj2 = cancelReasonsV2Presenter$reportScreenShownIfItNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelReasonsV2Presenter$reportScreenShownIfItNeed$1.label;
        if (i != 0) {
        }
        zw7 zw7Var2 = (zw7) obj2;
        bx7 bx7Var2 = dVar.z;
        co40 co40Var2 = bx7Var2.a;
        String str2 = bx7Var2.b.b().a;
        List J03 = kotlin.collections.a.J0(zw7Var2.a);
        List J022 = kotlin.collections.a.J0(zw7Var2.b);
        co40Var2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("order_id", str2);
        hashMap2.put("button_list", J03);
        hashMap2.put("button_list_more", J022);
        co40Var2.a.a("OrderFeedback.Rate.Show", hashMap2, 1, new HashMap());
        return zy11.a;
    }

    public final void Lg(vx7 vx7Var) {
        Object value;
        String str;
        boolean z = vx7Var instanceof ux7;
        yx7 yx7Var = this.y;
        if (z) {
            String str2 = ((ux7) vx7Var).a;
            r0 r0Var = yx7Var.a.a;
            do {
                value = r0Var.getValue();
                vw7 vw7Var = (vw7) value;
                String str3 = vw7Var != null ? vw7Var.a : null;
                vw7 vw7Var2 = new vw7(str2);
                if (str3 == null ? false : str3.equals(str2)) {
                    vw7Var2 = null;
                }
                str = vw7Var2 != null ? vw7Var2.a : null;
            } while (!r0Var.k(value, str != null ? new vw7(str) : null));
            return;
        }
        boolean z2 = vx7Var instanceof tx7;
        bx7 bx7Var = this.z;
        if (!z2) {
            if (!(vx7Var instanceof sx7)) {
                w511.b();
                return;
            }
            String str4 = ((sx7) vx7Var).a;
            vw7 vw7Var3 = (vw7) yx7Var.a.a.getValue();
            String str5 = vw7Var3 != null ? vw7Var3.a : null;
            bx7Var.a(CancelReasonsAnalytics$CloseReason.DONE, scc.h(str5 != null ? str5 : null));
            ((da0) this.B.b).r(new r(str5, str4, 3));
            return;
        }
        co40 co40Var = bx7Var.a;
        String str6 = bx7Var.b.b().a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str6);
        hashMap.put("button", "more");
        co40Var.a.a("OrderFeedback.Rate.Tapped", hashMap, 1, new HashMap());
        r0 r0Var2 = yx7Var.a.b;
        Boolean bool = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.m(null, bool);
    }
}
