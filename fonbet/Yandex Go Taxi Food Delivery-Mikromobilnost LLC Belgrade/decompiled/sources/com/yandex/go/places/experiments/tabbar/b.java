package com.yandex.go.places.experiments.tabbar;

import com.yandex.go.places.experiments.tabbar.DiscoveryTabbarExperiment;
import com.yandex.go.places.models.ui.DiscoveryMainTab$TabType;
import com.yandex.go.places.models.ui.PlacesNativeScreenTabName;
import defpackage.amh;
import defpackage.btj;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final rqo a;
    public final k7x0 b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new amh(25, this));

    public b(rqo rqoVar, k7x0 k7x0Var) {
        this.a = rqoVar;
        this.b = k7x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(DiscoveryTabbarExperiment discoveryTabbarExperiment) {
        DiscoveryMainTab$TabType discoveryMainTab$TabType;
        DiscoveryMainTab$TabType discoveryMainTab$TabType2;
        String str;
        List<DiscoveryTabbarExperiment.DiscoveryTab> list = discoveryTabbarExperiment.d;
        ArrayList arrayList = new ArrayList();
        for (DiscoveryTabbarExperiment.DiscoveryTab discoveryTab : list) {
            DiscoveryTabbarExperiment.DiscoveryTabType discoveryTabType = discoveryTab.f;
            int i = discoveryTabType == null ? -1 : a.a[discoveryTabType.ordinal()];
            btj btjVar = null;
            if (i == 1) {
                discoveryMainTab$TabType = DiscoveryMainTab$TabType.NATIVE_TAB;
            } else if (i != 2) {
                discoveryMainTab$TabType2 = null;
                if (discoveryTab.a && discoveryMainTab$TabType2 != null) {
                    String str2 = discoveryTab.b;
                    String str3 = discoveryTab.c;
                    m7x0 m7x0Var = (m7x0) this.b;
                    String a = m7x0Var.a(str3);
                    String a2 = m7x0Var.a(discoveryTab.d);
                    str = (String) discoveryTabbarExperiment.c.get(discoveryTab.e);
                    if (str == null) {
                        str = "";
                    }
                    btjVar = new btj(str2, a, a2, str, discoveryMainTab$TabType2);
                }
                if (btjVar == null) {
                    arrayList.add(btjVar);
                }
            } else {
                discoveryMainTab$TabType = DiscoveryMainTab$TabType.FLEX_TAB;
            }
            discoveryMainTab$TabType2 = discoveryMainTab$TabType;
            if (discoveryTab.a) {
                String str22 = discoveryTab.b;
                String str32 = discoveryTab.c;
                m7x0 m7x0Var2 = (m7x0) this.b;
                String a3 = m7x0Var2.a(str32);
                String a22 = m7x0Var2.a(discoveryTab.d);
                str = (String) discoveryTabbarExperiment.c.get(discoveryTab.e);
                if (str == null) {
                }
                btjVar = new btj(str22, a3, a22, str, discoveryMainTab$TabType2);
            }
            if (btjVar == null) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        DiscoveryTabBarRepository$getTabs$1 discoveryTabBarRepository$getTabs$1;
        int i;
        if (continuationImpl instanceof DiscoveryTabBarRepository$getTabs$1) {
            discoveryTabBarRepository$getTabs$1 = (DiscoveryTabBarRepository$getTabs$1) continuationImpl;
            int i2 = discoveryTabBarRepository$getTabs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discoveryTabBarRepository$getTabs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = discoveryTabBarRepository$getTabs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discoveryTabBarRepository$getTabs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    discoveryTabBarRepository$getTabs$1.label = 1;
                    obj = t1b0Var.b(discoveryTabBarRepository$getTabs$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return a((DiscoveryTabbarExperiment) obj);
            }
        }
        discoveryTabBarRepository$getTabs$1 = new DiscoveryTabBarRepository$getTabs$1(this, continuationImpl);
        Object obj2 = discoveryTabBarRepository$getTabs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discoveryTabBarRepository$getTabs$1.label;
        if (i != 0) {
        }
        return a((DiscoveryTabbarExperiment) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        DiscoveryTabBarRepository$isEnabled$1 discoveryTabBarRepository$isEnabled$1;
        int i;
        if (continuationImpl instanceof DiscoveryTabBarRepository$isEnabled$1) {
            discoveryTabBarRepository$isEnabled$1 = (DiscoveryTabBarRepository$isEnabled$1) continuationImpl;
            int i2 = discoveryTabBarRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discoveryTabBarRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = discoveryTabBarRepository$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discoveryTabBarRepository$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    discoveryTabBarRepository$isEnabled$1.label = 1;
                    obj = t1b0Var.b(discoveryTabBarRepository$isEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                DiscoveryTabbarExperiment discoveryTabbarExperiment = (DiscoveryTabbarExperiment) obj;
                return Boolean.valueOf(!discoveryTabbarExperiment.b && a(discoveryTabbarExperiment).size() > 1);
            }
        }
        discoveryTabBarRepository$isEnabled$1 = new DiscoveryTabBarRepository$isEnabled$1(this, continuationImpl);
        Object obj2 = discoveryTabBarRepository$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discoveryTabBarRepository$isEnabled$1.label;
        if (i != 0) {
        }
        DiscoveryTabbarExperiment discoveryTabbarExperiment2 = (DiscoveryTabbarExperiment) obj2;
        return Boolean.valueOf(!discoveryTabbarExperiment2.b && a(discoveryTabbarExperiment2).size() > 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        DiscoveryTabBarRepository$isMapTabEnabled$1 discoveryTabBarRepository$isMapTabEnabled$1;
        int i;
        List<DiscoveryTabbarExperiment.DiscoveryTab> list;
        if (continuationImpl instanceof DiscoveryTabBarRepository$isMapTabEnabled$1) {
            discoveryTabBarRepository$isMapTabEnabled$1 = (DiscoveryTabBarRepository$isMapTabEnabled$1) continuationImpl;
            int i2 = discoveryTabBarRepository$isMapTabEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discoveryTabBarRepository$isMapTabEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = discoveryTabBarRepository$isMapTabEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discoveryTabBarRepository$isMapTabEnabled$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    discoveryTabBarRepository$isMapTabEnabled$1.label = 1;
                    obj = t1b0Var.b(discoveryTabBarRepository$isMapTabEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list = ((DiscoveryTabbarExperiment) obj).d;
                if ((list instanceof Collection) || !list.isEmpty()) {
                    for (DiscoveryTabbarExperiment.DiscoveryTab discoveryTab : list) {
                        if (jl40.l(discoveryTab.b, PlacesNativeScreenTabName.MAP.getId()) && discoveryTab.a && discoveryTab.f == DiscoveryTabbarExperiment.DiscoveryTabType.NATIVE_TAB) {
                            break;
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        discoveryTabBarRepository$isMapTabEnabled$1 = new DiscoveryTabBarRepository$isMapTabEnabled$1(this, continuationImpl);
        Object obj2 = discoveryTabBarRepository$isMapTabEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discoveryTabBarRepository$isMapTabEnabled$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        list = ((DiscoveryTabbarExperiment) obj2).d;
        if (list instanceof Collection) {
        }
        while (r4.hasNext()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
