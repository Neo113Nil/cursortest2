package com.ybsdk.feature.banners.impl.domain.interactors;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$FullscreenNotificationShownScreen;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechFullscreenLoadedScreen;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechFullscreenSkipReason;
import com.ybsdk.core.common.domain.entities.CommunicationType;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import defpackage.btc;
import defpackage.bvf0;
import defpackage.d6v;
import defpackage.em3;
import defpackage.fcy0;
import defpackage.h791;
import defpackage.hfp0;
import defpackage.ifp0;
import defpackage.j3h;
import defpackage.jfp0;
import defpackage.jl40;
import defpackage.lfp0;
import defpackage.mfp0;
import defpackage.nfp0;
import defpackage.ny61;
import defpackage.qis;
import defpackage.sd90;
import defpackage.tje;
import defpackage.v0h;
import defpackage.w0h;
import defpackage.w511;
import defpackage.wbz0;
import defpackage.x0h;
import defpackage.x4c;
import defpackage.y0h;
import defpackage.y1r0;
import defpackage.ye0;
import defpackage.zrm;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes3.dex */
public final class a {
    public final j3h a;
    public final b b;
    public final com.ybsdk.common.a c;
    public final zrm d;
    public final y1r0 e;

    public a(j3h j3hVar, b bVar, com.ybsdk.common.a aVar, zrm zrmVar, y1r0 y1r0Var) {
        this.a = j3hVar;
        this.b = bVar;
        this.c = aVar;
        this.d = zrmVar;
        this.e = y1r0Var;
    }

    public final qis a(List list, ye0 ye0Var) {
        TechEvents$TechFullscreenLoadedScreen techEvents$TechFullscreenLoadedScreen;
        String str;
        zrm zrmVar = this.d;
        fcy0 fcy0Var = ((AppAnalyticsReporter) zrmVar.b).m0;
        if (ye0Var.equals(lfp0.b)) {
            techEvents$TechFullscreenLoadedScreen = TechEvents$TechFullscreenLoadedScreen.DASHBOARD;
        } else if (ye0Var.equals(nfp0.b)) {
            techEvents$TechFullscreenLoadedScreen = TechEvents$TechFullscreenLoadedScreen.PRODUCTS;
        } else if (ye0Var.equals(mfp0.b)) {
            techEvents$TechFullscreenLoadedScreen = TechEvents$TechFullscreenLoadedScreen.MERCHANT_OFFERS;
        } else if (ye0Var.equals(hfp0.b)) {
            techEvents$TechFullscreenLoadedScreen = TechEvents$TechFullscreenLoadedScreen.AUTOTOPUP;
        } else if (ye0Var.equals(ifp0.b)) {
            techEvents$TechFullscreenLoadedScreen = TechEvents$TechFullscreenLoadedScreen.AUTOTOPUP_V2;
        } else {
            if (!(ye0Var instanceof jfp0)) {
                w511.b();
                return null;
            }
            techEvents$TechFullscreenLoadedScreen = TechEvents$TechFullscreenLoadedScreen.COMMON_DIVKIT;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = ((qis) it.next()).f;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        jfp0 jfp0Var = ye0Var instanceof jfp0 ? (jfp0) ye0Var : null;
        String str3 = jfp0Var != null ? jfp0Var.b : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, techEvents$TechFullscreenLoadedScreen.getOriginalValue());
        linkedHashMap.put("fullscreen_count", Integer.valueOf(size));
        linkedHashMap.put("fullscreen_names", arrayList);
        if (str3 != null) {
            linkedHashMap.put("screen_path", str3);
        }
        fcy0Var.a.a("tech.fullscreen.loaded", linkedHashMap);
        qis qisVar = (qis) kotlin.collections.a.R(list);
        if (qisVar == null || (str = qisVar.e) != null) {
            return qisVar;
        }
        zrmVar.c(ye0Var, TechEvents$TechFullscreenSkipReason.NO_ACTION, str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d6v d6vVar, qis qisVar, ye0 ye0Var, ContinuationImpl continuationImpl) {
        FullscreenNotificationsInteractorImpl$showFullscreenWithResult$1 fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1;
        int i;
        CommonEvents$FullscreenNotificationShownScreen commonEvents$FullscreenNotificationShownScreen;
        qis qisVar2 = qisVar;
        if (continuationImpl instanceof FullscreenNotificationsInteractorImpl$showFullscreenWithResult$1) {
            fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1 = (FullscreenNotificationsInteractorImpl$showFullscreenWithResult$1) continuationImpl;
            int i2 = fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = qisVar2.e;
                    String str2 = qisVar2.c;
                    y0h e = h791.e(this.a, str, false, null, 14);
                    boolean z2 = e instanceof v0h;
                    zrm zrmVar = this.d;
                    if (!z2 && !jl40.l(e, w0h.a)) {
                        if (!(e instanceof x0h)) {
                            w511.b();
                            return null;
                        }
                        zrmVar.c(ye0Var, TechEvents$TechFullscreenSkipReason.WRONG_DEEPLINK, qisVar2.e);
                        x4c.g("Unable to open fullscreen notification", null, ye0Var, null, 10);
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    wbz0 wbz0Var = (wbz0) zrmVar.c;
                    String str3 = qisVar2.e;
                    Uri parse = Uri.parse(str3 == null ? "" : str3);
                    em3 em3Var = ((AppAnalyticsReporter) zrmVar.b).o;
                    if (ye0Var.equals(nfp0.b)) {
                        commonEvents$FullscreenNotificationShownScreen = CommonEvents$FullscreenNotificationShownScreen.PRODUCTS;
                    } else if (ye0Var.equals(lfp0.b)) {
                        commonEvents$FullscreenNotificationShownScreen = CommonEvents$FullscreenNotificationShownScreen.DASHBOARD;
                    } else if (ye0Var.equals(mfp0.b)) {
                        commonEvents$FullscreenNotificationShownScreen = CommonEvents$FullscreenNotificationShownScreen.MERCHANT_OFFERS;
                    } else if (ye0Var.equals(hfp0.b)) {
                        commonEvents$FullscreenNotificationShownScreen = CommonEvents$FullscreenNotificationShownScreen.AUTOTOPUP;
                    } else if (ye0Var.equals(ifp0.b)) {
                        commonEvents$FullscreenNotificationShownScreen = CommonEvents$FullscreenNotificationShownScreen.AUTOTOPUP_V2;
                    } else {
                        if (!(ye0Var instanceof jfp0)) {
                            w511.b();
                            return null;
                        }
                        commonEvents$FullscreenNotificationShownScreen = CommonEvents$FullscreenNotificationShownScreen.COMMON_DIVKIT;
                    }
                    CommonEvents$FullscreenNotificationShownScreen commonEvents$FullscreenNotificationShownScreen2 = commonEvents$FullscreenNotificationShownScreen;
                    String str4 = qisVar2.f;
                    String path = parse.getPath();
                    wbz0Var.getClass();
                    String l = sd90.l(parse, SdkUri$QueryParam.TARGET.getParamValue());
                    String l2 = sd90.l(parse, SdkUri$QueryParam.SHOW_CLOSE_BUTTON.getParamValue());
                    jfp0 jfp0Var = ye0Var instanceof jfp0 ? (jfp0) ye0Var : null;
                    em3Var.h(commonEvents$FullscreenNotificationShownScreen2, str4, str3, path, l, l2, jfp0Var != null ? jfp0Var.b : null, qisVar2.h);
                    this.c.c(new btc(str2, qisVar2.f, ye0Var, CommunicationType.FULLSCREEN));
                    if (qisVar2.g) {
                        fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.L$0 = qisVar2;
                        fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.label = 1;
                        tje.N(bvf0.a(fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.get_context()), null, null, new FullscreenNotificationsInteractorImpl$markAsRead$2(this, str2, d6vVar, null), 3);
                        if (zy11.a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qisVar2 = (qis) fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.L$0;
                    kotlin.b.b(obj);
                }
                if (jl40.l(qisVar2.h, Boolean.TRUE)) {
                    this.e.a();
                }
                return Boolean.valueOf(z);
            }
        }
        fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1 = new FullscreenNotificationsInteractorImpl$showFullscreenWithResult$1(this, continuationImpl);
        Object obj2 = fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullscreenNotificationsInteractorImpl$showFullscreenWithResult$1.label;
        boolean z3 = true;
        if (i != 0) {
        }
        if (jl40.l(qisVar2.h, Boolean.TRUE)) {
        }
        return Boolean.valueOf(z3);
    }
}
