package com.ybsdk.screens.menu.presentation;

import android.content.Context;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.MenuEvents$MenuScreenLoadedResult;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import defpackage.b3z;
import defpackage.ds31;
import defpackage.j3h;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.pzt0;
import defpackage.qq7;
import defpackage.tje;
import defpackage.uc5;
import defpackage.xyz;
import defpackage.yn10;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final YBSdkVisualParams B;
    public final f C;
    public final ppp0 D;
    public final j3h E;
    public final b3z F;
    public final AppAnalyticsReporter G;
    public final com.ybsdk.screens.menu.domain.a H;
    public pzt0 I;

    public b(Context context, YBSdkVisualParams yBSdkVisualParams, f fVar, ppp0 ppp0Var, j3h j3hVar, b3z b3zVar, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.screens.menu.domain.a aVar) {
        super(new xyz(20, yBSdkVisualParams), new yn10(context));
        this.B = yBSdkVisualParams;
        this.C = fVar;
        this.D = ppp0Var;
        this.E = j3hVar;
        this.F = b3zVar;
        this.G = appAnalyticsReporter;
        this.H = aVar;
        appAnalyticsReporter.J.a.a("menu_screen.open", null);
        b3zVar.a(new a(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, this));
        pzt0 pzt0Var = this.I;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.I = tje.N(ds31.a(this), null, null, new MenuViewModel$loadMenuScreenData$1(true, this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(b bVar, ContinuationImpl continuationImpl) {
        MenuViewModel$loadAccountManagementUri$1 menuViewModel$loadAccountManagementUri$1;
        int i;
        Long l;
        bVar.getClass();
        if (continuationImpl instanceof MenuViewModel$loadAccountManagementUri$1) {
            menuViewModel$loadAccountManagementUri$1 = (MenuViewModel$loadAccountManagementUri$1) continuationImpl;
            int i2 = menuViewModel$loadAccountManagementUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuViewModel$loadAccountManagementUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuViewModel$loadAccountManagementUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuViewModel$loadAccountManagementUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = bVar.C;
                    menuViewModel$loadAccountManagementUri$1.label = 1;
                    obj = fVar.a(menuViewModel$loadAccountManagementUri$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                l = (Long) obj;
                if (l != null) {
                    return new Result.Failure(new Exception("getAccountManagementUri error: no uid"));
                }
                long longValue = l.longValue();
                ppp0 ppp0Var = bVar.D;
                menuViewModel$loadAccountManagementUri$1.label = 2;
                Object b = ((com.ybsdk.feature.passport.impl.a) ppp0Var).b(longValue, menuViewModel$loadAccountManagementUri$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        menuViewModel$loadAccountManagementUri$1 = new MenuViewModel$loadAccountManagementUri$1(bVar, continuationImpl);
        Object obj2 = menuViewModel$loadAccountManagementUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuViewModel$loadAccountManagementUri$1.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
    }

    public final void c0(MenuEvents$MenuScreenLoadedResult menuEvents$MenuScreenLoadedResult, String str) {
        qq7 qq7Var = this.G.J;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, menuEvents$MenuScreenLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        qq7Var.a.a("menu_screen.loaded", linkedHashMap);
    }

    public final void d0() {
        this.G.J.a.a("menu_screen.exit.click", null);
    }

    public final void e0() {
        pzt0 pzt0Var = this.I;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            pzt0 pzt0Var2 = this.I;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            this.I = tje.N(ds31.a(this), null, null, new MenuViewModel$loadMenuScreenData$1(false, this, null), 3);
        }
    }

    public final void f0() {
        pzt0 pzt0Var = this.I;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.I = tje.N(ds31.a(this), null, null, new MenuViewModel$loadMenuScreenData$1(true, this, null), 3);
    }
}
