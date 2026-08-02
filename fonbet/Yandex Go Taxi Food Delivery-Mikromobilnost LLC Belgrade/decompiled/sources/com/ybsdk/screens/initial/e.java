package com.ybsdk.screens.initial;

import com.ybsdk.common.entities.UserIdentificationStatusEntity;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.navigation.InternalScreenIntent;
import com.ybsdk.screens.initial.deeplink.PendingDeeplinkListConfig$DefaultScreenBehavior;
import defpackage.asa0;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.kn21;
import defpackage.l3h;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tfl0;
import defpackage.u470;
import defpackage.wdp0;
import defpackage.xra0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class e {
    public final wdp0 a;
    public final j3h b;
    public final u470 c;
    public final xra0 d;
    public final tfl0 e;
    public final com.ybsdk.common.repositiories.user.a f;

    public e(wdp0 wdp0Var, j3h j3hVar, u470 u470Var, xra0 xra0Var, tfl0 tfl0Var, com.ybsdk.common.repositiories.user.a aVar) {
        this.a = wdp0Var;
        this.b = j3hVar;
        this.c = u470Var;
        this.d = xra0Var;
        this.e = tfl0Var;
        this.f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.ybsdk.screens.initial.e] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InitialViewModelNavigationHelper$calculateTargetScreens$1 initialViewModelNavigationHelper$calculateTargetScreens$1;
        int i;
        Collection j;
        ?? r13;
        List list;
        List list2;
        Collection collection = EmptyList.a;
        if (continuationImpl instanceof InitialViewModelNavigationHelper$calculateTargetScreens$1) {
            initialViewModelNavigationHelper$calculateTargetScreens$1 = (InitialViewModelNavigationHelper$calculateTargetScreens$1) continuationImpl;
            int i2 = initialViewModelNavigationHelper$calculateTargetScreens$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialViewModelNavigationHelper$calculateTargetScreens$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initialViewModelNavigationHelper$calculateTargetScreens$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModelNavigationHelper$calculateTargetScreens$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Deeplink a = this.c.a();
                    List f = ((l3h) this.b).f(a);
                    InternalScreenIntent internalScreenIntent = this.a.a;
                    List f2 = internalScreenIntent != null ? ((l3h) this.b).f(internalScreenIntent.getDeeplink()) : null;
                    asa0 asa0Var = this.d.b;
                    if (asa0Var == null) {
                        j = null;
                    } else {
                        j3h j3hVar = this.b;
                        List list3 = asa0Var.a;
                        l3h l3hVar = (l3h) j3hVar;
                        l3hVar.getClass();
                        ListBuilder a2 = rcc.a();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            Collection b = l3hVar.b((Deeplink) it.next());
                            a2.addAll(b != null ? b : collection);
                        }
                        j = a2.j();
                        Deeplink deeplink = (Deeplink) kotlin.collections.a.R(asa0Var.a);
                        if (deeplink == null || (asa0Var.b == PendingDeeplinkListConfig$DefaultScreenBehavior.INCLUDE && !jl40.l(deeplink.getNavigation(), DeeplinkNavigation.ReplaceRoot.INSTANCE) && !jl40.l(deeplink.getParsedUri(), a.getParsedUri()))) {
                            List list4 = f;
                            if (j == null) {
                                j = collection;
                            }
                            j = kotlin.collections.a.m0(j, list4);
                        }
                    }
                    List g = this.e.g();
                    Deeplink deeplink2 = this.d.a;
                    Collection b2 = deeplink2 != null ? ((l3h) this.b).b(deeplink2) : null;
                    if (b2 != null) {
                        collection = b2;
                    }
                    if (j == null) {
                        List list5 = g;
                        r13 = !list5.isEmpty() ? kotlin.collections.a.m0(collection, list5) : f2 != null ? kotlin.collections.a.m0(collection, f2) : kotlin.collections.a.m0(collection, f);
                    } else {
                        r13 = j;
                    }
                    initialViewModelNavigationHelper$calculateTargetScreens$1.L$0 = f;
                    initialViewModelNavigationHelper$calculateTargetScreens$1.L$1 = r13;
                    initialViewModelNavigationHelper$calculateTargetScreens$1.label = 1;
                    Object c = c(r13, initialViewModelNavigationHelper$calculateTargetScreens$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    List list6 = r13;
                    obj = c;
                    list = list6;
                    list2 = f;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) initialViewModelNavigationHelper$calculateTargetScreens$1.L$1;
                    list2 = (List) initialViewModelNavigationHelper$calculateTargetScreens$1.L$0;
                    kotlin.b.b(obj);
                }
                return (((Boolean) obj).booleanValue() || list.isEmpty()) ? list2 : list;
            }
        }
        initialViewModelNavigationHelper$calculateTargetScreens$1 = new InitialViewModelNavigationHelper$calculateTargetScreens$1(this, continuationImpl);
        Object obj2 = initialViewModelNavigationHelper$calculateTargetScreens$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModelNavigationHelper$calculateTargetScreens$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    public final void b() {
        this.a.a = null;
        xra0 xra0Var = this.d;
        xra0Var.a = null;
        xra0Var.b = null;
        this.e.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:11:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:10:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractList abstractList, ContinuationImpl continuationImpl) {
        InitialViewModelNavigationHelper$isAllowOpen$1 initialViewModelNavigationHelper$isAllowOpen$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof InitialViewModelNavigationHelper$isAllowOpen$1) {
            initialViewModelNavigationHelper$isAllowOpen$1 = (InitialViewModelNavigationHelper$isAllowOpen$1) continuationImpl;
            int i2 = initialViewModelNavigationHelper$isAllowOpen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialViewModelNavigationHelper$isAllowOpen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initialViewModelNavigationHelper$isAllowOpen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModelNavigationHelper$isAllowOpen$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (abstractList == null || !abstractList.isEmpty()) {
                        it = abstractList.iterator();
                        if (it.hasNext()) {
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) initialViewModelNavigationHelper$isAllowOpen$1.L$0;
                kotlin.b.b(obj);
                boolean z2 = ((Boolean) obj).booleanValue();
                if (!z2) {
                    z = false;
                    return Boolean.valueOf(z);
                }
                if (it.hasNext()) {
                    Screen screen = (Screen) it.next();
                    if (jl40.l(screen.getScreenKey(), "UpgradeScreen") || jl40.l(screen.getScreenKey(), "UpgradeEditScreen")) {
                        initialViewModelNavigationHelper$isAllowOpen$1.L$0 = it;
                        initialViewModelNavigationHelper$isAllowOpen$1.label = 1;
                        obj = d(initialViewModelNavigationHelper$isAllowOpen$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        boolean z22 = ((Boolean) obj).booleanValue();
                        if (!z22) {
                        }
                        if (it.hasNext()) {
                        }
                    } else {
                        z22 = true;
                        if (!z22) {
                        }
                        if (it.hasNext()) {
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        initialViewModelNavigationHelper$isAllowOpen$1 = new InitialViewModelNavigationHelper$isAllowOpen$1(this, continuationImpl);
        Object obj3 = initialViewModelNavigationHelper$isAllowOpen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModelNavigationHelper$isAllowOpen$1.label;
        boolean z3 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        InitialViewModelNavigationHelper$isAnonymousUserForUpgrade$1 initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1;
        int i;
        boolean z;
        Object a;
        kn21 kn21Var;
        if (continuationImpl instanceof InitialViewModelNavigationHelper$isAnonymousUserForUpgrade$1) {
            initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1 = (InitialViewModelNavigationHelper$isAnonymousUserForUpgrade$1) continuationImpl;
            int i2 = initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1.label;
                z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1.label = 1;
                    a = this.f.a(false, initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                kn21Var = (kn21) (a instanceof Result.Failure ? null : a);
                if (kn21Var != null && kn21Var.a == UserIdentificationStatusEntity.ANONYMOUS) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1 = new InitialViewModelNavigationHelper$isAnonymousUserForUpgrade$1(this, continuationImpl);
        Object obj2 = initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModelNavigationHelper$isAnonymousUserForUpgrade$1.label;
        z = false;
        if (i != 0) {
        }
        kn21Var = (kn21) (a instanceof Result.Failure ? null : a);
        if (kn21Var != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
