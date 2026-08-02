package com.yandex.go.safety.center.safetycenter_web.domain;

import android.app.Activity;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.g6u;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.p2y0;
import defpackage.q5z;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vjr0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final vjr0 a;
    public final tt2 b;
    public final p2y0 c;

    public a(vjr0 vjr0Var, tt2 tt2Var, p2y0 p2y0Var) {
        this.a = vjr0Var;
        this.b = tt2Var;
        this.c = p2y0Var;
    }

    public final void a(String str, String str2) {
        if (str.length() == 0) {
            return;
        }
        if (str2 != null) {
            try {
                str = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
            } catch (Throwable unused) {
            }
        }
        int i = kyh0.bottom_sheet_share_route;
        Activity activity = this.a.a;
        q5z.c0(str, activity.getString(i), activity, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$1 safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        o2y0 o2y0Var;
        TaxiOrder b;
        String str3;
        g6u g6uVar;
        SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2 safetyCenterWebShareUrlInteractor$shareUrlByOrderId$2;
        if (continuationImpl instanceof SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$1) {
            safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1 = (SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$1) continuationImpl;
            int i2 = safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    if (str != null) {
                        safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$0 = null;
                        safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$1 = str2;
                        safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.label = 1;
                        obj = ((e0) this.c).p(str, safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                str2 = (String) safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$1;
                b.b(obj);
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null && (b = o2y0Var.b()) != null && (str3 = b.V().B) != null) {
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6uVar = o400.a;
                    safetyCenterWebShareUrlInteractor$shareUrlByOrderId$2 = new SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2(this, str3, str2, null);
                    safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$0 = null;
                    safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$1 = null;
                    safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$2 = null;
                    safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.label = 2;
                    if (tje.k0(g6uVar, safetyCenterWebShareUrlInteractor$shareUrlByOrderId$2, safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1 = new SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$1(this, continuationImpl);
        Object obj2 = safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
            this.b.getClass();
            sjh sjhVar2 = uyj.a;
            g6uVar = o400.a;
            safetyCenterWebShareUrlInteractor$shareUrlByOrderId$2 = new SafetyCenterWebShareUrlInteractor$shareUrlByOrderId$2(this, str3, str2, null);
            safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$0 = null;
            safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$1 = null;
            safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.L$2 = null;
            safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1.label = 2;
            if (tje.k0(g6uVar, safetyCenterWebShareUrlInteractor$shareUrlByOrderId$2, safetyCenterWebShareUrlInteractor$shareUrlByOrderId$1) != coroutineSingletons) {
            }
        }
        return zy11Var2;
    }
}
