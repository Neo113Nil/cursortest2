package com.yandex.go.design.compose.modal.bottomsheet;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.n;
import defpackage.bts;
import defpackage.c3z;
import defpackage.did;
import defpackage.dtr0;
import defpackage.f3n;
import defpackage.fid;
import defpackage.fwi;
import defpackage.gp5;
import defpackage.jj2;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pzt0;
import defpackage.rfb1;
import defpackage.rol0;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tse;
import defpackage.twt0;
import defpackage.tx40;
import defpackage.vz20;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wz20;
import defpackage.zpn;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public abstract class b {
    public static final twt0 a = sb2.G(0.0f, 400.0f, 5, null);

    public static final wg6 a(boolean z, float f, f3n f3nVar, boolean z2, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, fid fidVar, int i, int i2, int i3) {
        boolean z3 = (i3 & 1) != 0 ? true : z;
        boolean z4 = (i3 & 2) != 0;
        boolean z5 = (i3 & 4) != 0;
        float f2 = (i3 & 16) != 0 ? 56.0f : f;
        jj2 jj2Var = (i3 & 32) != 0 ? a : f3nVar;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = zpn.j(EmptyCoroutineContext.a, btsVar);
            btsVar.o0(Q);
        }
        tse tseVar = (tse) Q;
        fwi fwiVar = (fwi) ((bts) fidVar).m(j.h);
        boolean booleanValue = (i3 & 256) != 0 ? ((Boolean) ((bts) fidVar).m(n.a)).booleanValue() : z2;
        sls slsVar5 = (i3 & 512) != 0 ? null : slsVar;
        sls slsVar6 = (i3 & 1024) != 0 ? null : slsVar2;
        sls slsVar7 = (i3 & 2048) != 0 ? (sls) ((bts) fidVar).m(c3z.a) : slsVar3;
        sls slsVar8 = (i3 & 4096) != 0 ? null : slsVar4;
        bts btsVar2 = (bts) fidVar;
        Object Q2 = btsVar2.Q();
        if (Q2 == o430Var) {
            Q2 = new wg6(tseVar, fwiVar, booleanValue);
            btsVar2.o0(Q2);
        }
        wg6 wg6Var = (wg6) Q2;
        wg6Var.p = jj2Var;
        wg6Var.t = slsVar7;
        wg6Var.k = z3;
        wg6Var.l = z4;
        wg6Var.m = z5;
        fwi fwiVar2 = wg6Var.b;
        wg6Var.o = fwiVar2.w0(125.0f);
        wg6Var.n = fwiVar2.w0(f2);
        if (rfb1.g(wg6Var)) {
            tx40 tx40Var = wg6Var.h;
            tx40Var.setFloatValue(wg6Var.a(tx40Var.getFloatValue()));
        }
        wz20 wz20Var = (wz20) btsVar2.m(vz20.a);
        boolean k = btsVar2.k(wz20Var) | ((((i & 1879048192) ^ 805306368) > 536870912 && btsVar2.k(slsVar5)) || (i & 805306368) == 536870912) | btsVar2.k(slsVar6);
        Object Q3 = btsVar2.Q();
        if (k || Q3 == o430Var) {
            Q3 = new BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1(wz20Var, wg6Var, slsVar5, slsVar6, null);
            btsVar2.o0(Q3);
        }
        zy11 zy11Var = zy11.a;
        zpn.e(btsVar2, (wls) Q3, zy11Var);
        boolean z6 = (((i2 & 896) ^ 384) > 256 && btsVar2.k(slsVar8)) || (i2 & 384) == 256;
        Object Q4 = btsVar2.Q();
        if (z6 || Q4 == o430Var) {
            Q4 = new BottomSheetStateExtensionsKt$rememberBottomSheetState$2$1(wg6Var, slsVar8, null);
            btsVar2.o0(Q4);
        }
        zpn.e(btsVar2, (wls) Q4, zy11Var);
        return wg6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (c(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(wg6 wg6Var, ContinuationImpl continuationImpl) {
        BottomSheetStateExtensionsKt$show$1 bottomSheetStateExtensionsKt$show$1;
        int i;
        pzt0 pzt0Var;
        if (continuationImpl instanceof BottomSheetStateExtensionsKt$show$1) {
            bottomSheetStateExtensionsKt$show$1 = (BottomSheetStateExtensionsKt$show$1) continuationImpl;
            int i2 = bottomSheetStateExtensionsKt$show$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomSheetStateExtensionsKt$show$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bottomSheetStateExtensionsKt$show$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomSheetStateExtensionsKt$show$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!wg6Var.e) {
                        bottomSheetStateExtensionsKt$show$1.L$0 = wg6Var;
                        bottomSheetStateExtensionsKt$show$1.label = 1;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                wg6Var = (wg6) bottomSheetStateExtensionsKt$show$1.L$0;
                kotlin.b.b(obj);
                wg6Var.e = true;
                wg6Var.g.setValue(new dtr0(wg6Var.f));
                c.c(wg6Var, 0.0f, 3);
                pzt0Var = wg6Var.r;
                if (pzt0Var != null) {
                    bottomSheetStateExtensionsKt$show$1.L$0 = null;
                    bottomSheetStateExtensionsKt$show$1.label = 2;
                    Object u0 = pzt0Var.u0(bottomSheetStateExtensionsKt$show$1);
                    return u0 == coroutineSingletons ? coroutineSingletons : u0;
                }
                return zy11.a;
            }
        }
        bottomSheetStateExtensionsKt$show$1 = new BottomSheetStateExtensionsKt$show$1(continuationImpl);
        Object obj2 = bottomSheetStateExtensionsKt$show$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomSheetStateExtensionsKt$show$1.label;
        if (i != 0) {
        }
        wg6Var.e = true;
        wg6Var.g.setValue(new dtr0(wg6Var.f));
        c.c(wg6Var, 0.0f, 3);
        pzt0Var = wg6Var.r;
        if (pzt0Var != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(wg6 wg6Var, ContinuationImpl continuationImpl) {
        BottomSheetStateExtensionsKt$waitForCardMeasure$1 bottomSheetStateExtensionsKt$waitForCardMeasure$1;
        int i;
        if (continuationImpl instanceof BottomSheetStateExtensionsKt$waitForCardMeasure$1) {
            bottomSheetStateExtensionsKt$waitForCardMeasure$1 = (BottomSheetStateExtensionsKt$waitForCardMeasure$1) continuationImpl;
            int i2 = bottomSheetStateExtensionsKt$waitForCardMeasure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomSheetStateExtensionsKt$waitForCardMeasure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bottomSheetStateExtensionsKt$waitForCardMeasure$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomSheetStateExtensionsKt$waitForCardMeasure$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rol0 o = f.o(new gp5(wg6Var, 3));
                    BottomSheetStateExtensionsKt$waitForCardMeasure$3 bottomSheetStateExtensionsKt$waitForCardMeasure$3 = new BottomSheetStateExtensionsKt$waitForCardMeasure$3(2, null);
                    bottomSheetStateExtensionsKt$waitForCardMeasure$1.L$0 = null;
                    bottomSheetStateExtensionsKt$waitForCardMeasure$1.label = 1;
                    if (e.x(o, bottomSheetStateExtensionsKt$waitForCardMeasure$3, bottomSheetStateExtensionsKt$waitForCardMeasure$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        bottomSheetStateExtensionsKt$waitForCardMeasure$1 = new BottomSheetStateExtensionsKt$waitForCardMeasure$1(continuationImpl);
        Object obj2 = bottomSheetStateExtensionsKt$waitForCardMeasure$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomSheetStateExtensionsKt$waitForCardMeasure$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
