package com.yandex.urbanads.internal.flex;

import com.yandex.urbanads.UrbanAdsError$ErrorType;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a201;
import defpackage.bf21;
import defpackage.exy0;
import defpackage.i7x0;
import defpackage.m0m;
import defpackage.mjm0;
import defpackage.nf21;
import defpackage.ny61;
import defpackage.o3l0;
import defpackage.of21;
import defpackage.ojh;
import defpackage.on70;
import defpackage.pf21;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tf21;
import defpackage.u1m;
import defpackage.ue21;
import defpackage.wzl;
import defpackage.xzl;
import defpackage.ywl;
import flex.core.loader.network.e;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {
    public final m0m a;
    public final o3l0 b;
    public final exy0 c;

    public b(e eVar, o3l0 o3l0Var, exy0 exy0Var) {
        this.a = eVar;
        this.b = o3l0Var;
        this.c = exy0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[Catch: Exception -> 0x003e, CancellationException -> 0x0152, TryCatch #2 {CancellationException -> 0x0152, Exception -> 0x003e, blocks: (B:12:0x0038, B:14:0x006c, B:16:0x0072, B:18:0x0078, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:28:0x0098, B:30:0x00b0, B:32:0x00bf, B:34:0x00c3, B:36:0x00c6, B:38:0x012e, B:44:0x004a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: Exception -> 0x003e, CancellationException -> 0x0152, TryCatch #2 {CancellationException -> 0x0152, Exception -> 0x003e, blocks: (B:12:0x0038, B:14:0x006c, B:16:0x0072, B:18:0x0078, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:28:0x0098, B:30:0x00b0, B:32:0x00bf, B:34:0x00c3, B:36:0x00c6, B:38:0x012e, B:44:0x004a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[Catch: Exception -> 0x003e, CancellationException -> 0x0152, TryCatch #2 {CancellationException -> 0x0152, Exception -> 0x003e, blocks: (B:12:0x0038, B:14:0x006c, B:16:0x0072, B:18:0x0078, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:28:0x0098, B:30:0x00b0, B:32:0x00bf, B:34:0x00c3, B:36:0x00c6, B:38:0x012e, B:44:0x004a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[Catch: Exception -> 0x003e, CancellationException -> 0x0152, TryCatch #2 {CancellationException -> 0x0152, Exception -> 0x003e, blocks: (B:12:0x0038, B:14:0x006c, B:16:0x0072, B:18:0x0078, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:28:0x0098, B:30:0x00b0, B:32:0x00bf, B:34:0x00c3, B:36:0x00c6, B:38:0x012e, B:44:0x004a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bf21 bf21Var, sls slsVar, sls slsVar2, ContinuationImpl continuationImpl) {
        PopupFetcher$fetchAndShow$1 popupFetcher$fetchAndShow$1;
        int i;
        int i2;
        sls slsVar3;
        sls slsVar4;
        xzl xzlVar;
        ywl ywlVar;
        ojh ojhVar;
        try {
            if (continuationImpl instanceof PopupFetcher$fetchAndShow$1) {
                popupFetcher$fetchAndShow$1 = (PopupFetcher$fetchAndShow$1) continuationImpl;
                int i3 = popupFetcher$fetchAndShow$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    popupFetcher$fetchAndShow$1.label = i3 - Integer.MIN_VALUE;
                    PopupFetcher$fetchAndShow$1 popupFetcher$fetchAndShow$12 = popupFetcher$fetchAndShow$1;
                    Object obj = popupFetcher$fetchAndShow$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = popupFetcher$fetchAndShow$12.label;
                    i2 = 14;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        m0m m0mVar = this.a;
                        u1m c = on70.c(bf21Var);
                        popupFetcher$fetchAndShow$12.L$0 = null;
                        slsVar3 = slsVar;
                        popupFetcher$fetchAndShow$12.L$1 = slsVar3;
                        slsVar4 = slsVar2;
                        popupFetcher$fetchAndShow$12.L$2 = slsVar4;
                        popupFetcher$fetchAndShow$12.label = 1;
                        obj = m0mVar.e(c, null, false, false, new i7x0(), popupFetcher$fetchAndShow$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sls slsVar5 = (sls) popupFetcher$fetchAndShow$12.L$2;
                        sls slsVar6 = (sls) popupFetcher$fetchAndShow$12.L$1;
                        kotlin.b.b(obj);
                        slsVar4 = slsVar5;
                        slsVar3 = slsVar6;
                    }
                    wzl wzlVar = (wzl) obj;
                    xzlVar = !(wzlVar instanceof xzl) ? (xzl) wzlVar : null;
                    if (xzlVar != null && (ywlVar = xzlVar.a) != null) {
                        mjm0 mjm0Var = ywlVar.b;
                        ojhVar = mjm0Var instanceof ojh ? (ojh) mjm0Var : null;
                        if (ojhVar != null) {
                            return new nf21(new a201(i2, UrbanAdsError$ErrorType.FLEX, "DefaultScaffold not found"));
                        }
                        int a = this.c.a(ojhVar.a);
                        tf21 tf21Var = (tf21) ywlVar.c.b(qoi0.a(tf21.class));
                        if (tf21Var == null) {
                            return new nf21(new a201(i2, UrbanAdsError$ErrorType.FLEX, "UrbanAds not found in shared data"));
                        }
                        if (tf21Var.a) {
                            return of21.a;
                        }
                        UrbanAdsBottomSheetFragment.Companion.getClass();
                        String uuid = UUID.randomUUID().toString();
                        UrbanAdsBottomSheetFragment.callbacksStorage.put(uuid, new ue21(slsVar3, slsVar4));
                        this.b.showPopup(null, ywlVar, true, true, true, true, null, false, kotlin.collections.b.i(new Pair(UrbanAdsBottomSheetFragment.CORNER_RADIUS, new Integer(tf21Var.b)), new Pair(UrbanAdsBottomSheetFragment.SHOW_GRABBER, Boolean.valueOf(tf21Var.c)), new Pair(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, new Integer(a)), new Pair(UrbanAdsBottomSheetFragment.CALLBACKS_ID, uuid)), null);
                        return pf21.a;
                    }
                    return new nf21(new a201(i2, UrbanAdsError$ErrorType.FLEX, "Failed to fetch document"));
                }
            }
            if (i != 0) {
            }
            wzl wzlVar2 = (wzl) obj;
            if (!(wzlVar2 instanceof xzl)) {
            }
            if (xzlVar != null) {
                mjm0 mjm0Var2 = ywlVar.b;
                if (mjm0Var2 instanceof ojh) {
                }
                if (ojhVar != null) {
                }
            }
            return new nf21(new a201(i2, UrbanAdsError$ErrorType.FLEX, "Failed to fetch document"));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            UrbanAdsError$ErrorType urbanAdsError$ErrorType = UrbanAdsError$ErrorType.FLEX;
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new nf21(new a201(i2, urbanAdsError$ErrorType, message));
        }
        popupFetcher$fetchAndShow$1 = new PopupFetcher$fetchAndShow$1(this, continuationImpl);
        PopupFetcher$fetchAndShow$1 popupFetcher$fetchAndShow$122 = popupFetcher$fetchAndShow$1;
        Object obj2 = popupFetcher$fetchAndShow$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = popupFetcher$fetchAndShow$122.label;
        i2 = 14;
    }
}
