package com.yandex.go.chargers.data;

import defpackage.g8e;
import defpackage.kb20;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.s8o;
import defpackage.vp21;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class f {
    public final vp21 a;
    public final po21 b;
    public final kb20 c;

    public f(vp21 vp21Var, po21 po21Var, kb20 kb20Var) {
        this.a = vp21Var;
        this.b = po21Var;
        this.c = kb20Var;
    }

    public static LinkedHashMap a() {
        return kotlin.collections.b.l(new Pair("Timezone-Offset", s8o.q()), new Pair("X-Timezone", TimeZone.getDefault().getID()));
    }

    public static Map e() {
        return g8e.z("Timezone-Offset", s8o.q());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        ChargersApiHeaderRepository$getDvizhHeaders$1 chargersApiHeaderRepository$getDvizhHeaders$1;
        int i;
        String a;
        if (continuationImpl instanceof ChargersApiHeaderRepository$getDvizhHeaders$1) {
            chargersApiHeaderRepository$getDvizhHeaders$1 = (ChargersApiHeaderRepository$getDvizhHeaders$1) continuationImpl;
            int i2 = chargersApiHeaderRepository$getDvizhHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersApiHeaderRepository$getDvizhHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersApiHeaderRepository$getDvizhHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersApiHeaderRepository$getDvizhHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersApiHeaderRepository$getDvizhHeaders$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(chargersApiHeaderRepository$getDvizhHeaders$1);
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
                mo21 mo21Var = (mo21) obj;
                Pair pair = new Pair("Lat", String.valueOf(mo21Var.a));
                Pair pair2 = new Pair("Lon", String.valueOf(mo21Var.b));
                Pair pair3 = new Pair("X-Ya-Phone-Verified", ((ru.yandex.taxi.startup.launch.h) this.a).Og());
                kb20 kb20Var = this.c;
                Pair pair4 = new Pair("UUID", kb20Var.b());
                a = kb20Var.a();
                if (a == null) {
                    a = "";
                }
                return kotlin.collections.b.l(pair, pair2, pair3, pair4, new Pair("DeviceID", a), new Pair("Timezone-Offset", s8o.q()));
            }
        }
        chargersApiHeaderRepository$getDvizhHeaders$1 = new ChargersApiHeaderRepository$getDvizhHeaders$1(this, continuationImpl);
        Object obj2 = chargersApiHeaderRepository$getDvizhHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersApiHeaderRepository$getDvizhHeaders$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        Pair pair5 = new Pair("Lat", String.valueOf(mo21Var2.a));
        Pair pair22 = new Pair("Lon", String.valueOf(mo21Var2.b));
        Pair pair32 = new Pair("X-Ya-Phone-Verified", ((ru.yandex.taxi.startup.launch.h) this.a).Og());
        kb20 kb20Var2 = this.c;
        Pair pair42 = new Pair("UUID", kb20Var2.b());
        a = kb20Var2.a();
        if (a == null) {
        }
        return kotlin.collections.b.l(pair5, pair22, pair32, pair42, new Pair("DeviceID", a), new Pair("Timezone-Offset", s8o.q()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(ContinuationImpl continuationImpl) {
        ChargersApiHeaderRepository$getHeaders$1 chargersApiHeaderRepository$getHeaders$1;
        int i;
        if (continuationImpl instanceof ChargersApiHeaderRepository$getHeaders$1) {
            chargersApiHeaderRepository$getHeaders$1 = (ChargersApiHeaderRepository$getHeaders$1) continuationImpl;
            int i2 = chargersApiHeaderRepository$getHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersApiHeaderRepository$getHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersApiHeaderRepository$getHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersApiHeaderRepository$getHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersApiHeaderRepository$getHeaders$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(chargersApiHeaderRepository$getHeaders$1);
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
                mo21 mo21Var = (mo21) obj;
                return (Serializable) kotlin.collections.b.i(new Pair("Lat", String.valueOf(mo21Var.a)), new Pair("Lon", String.valueOf(mo21Var.b)), new Pair("Timezone-Offset", s8o.q()));
            }
        }
        chargersApiHeaderRepository$getHeaders$1 = new ChargersApiHeaderRepository$getHeaders$1(this, continuationImpl);
        Object obj2 = chargersApiHeaderRepository$getHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersApiHeaderRepository$getHeaders$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        return (Serializable) kotlin.collections.b.i(new Pair("Lat", String.valueOf(mo21Var2.a)), new Pair("Lon", String.valueOf(mo21Var2.b)), new Pair("Timezone-Offset", s8o.q()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(ContinuationImpl continuationImpl) {
        ChargersApiHeaderRepository$getSuperPassesHeaders$1 chargersApiHeaderRepository$getSuperPassesHeaders$1;
        int i;
        String a;
        if (continuationImpl instanceof ChargersApiHeaderRepository$getSuperPassesHeaders$1) {
            chargersApiHeaderRepository$getSuperPassesHeaders$1 = (ChargersApiHeaderRepository$getSuperPassesHeaders$1) continuationImpl;
            int i2 = chargersApiHeaderRepository$getSuperPassesHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersApiHeaderRepository$getSuperPassesHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersApiHeaderRepository$getSuperPassesHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersApiHeaderRepository$getSuperPassesHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersApiHeaderRepository$getSuperPassesHeaders$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(chargersApiHeaderRepository$getSuperPassesHeaders$1);
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
                mo21 mo21Var = (mo21) obj;
                Pair pair = new Pair("Lat", String.valueOf(mo21Var.a));
                Pair pair2 = new Pair("Lon", String.valueOf(mo21Var.b));
                kb20 kb20Var = this.c;
                Pair pair3 = new Pair("UUID", kb20Var.b());
                a = kb20Var.a();
                if (a == null) {
                    a = "";
                }
                return (Serializable) kotlin.collections.b.i(pair, pair2, pair3, new Pair("DeviceID", a), new Pair("Timezone-Offset", s8o.q()));
            }
        }
        chargersApiHeaderRepository$getSuperPassesHeaders$1 = new ChargersApiHeaderRepository$getSuperPassesHeaders$1(this, continuationImpl);
        Object obj2 = chargersApiHeaderRepository$getSuperPassesHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersApiHeaderRepository$getSuperPassesHeaders$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        Pair pair4 = new Pair("Lat", String.valueOf(mo21Var2.a));
        Pair pair22 = new Pair("Lon", String.valueOf(mo21Var2.b));
        kb20 kb20Var2 = this.c;
        Pair pair32 = new Pair("UUID", kb20Var2.b());
        a = kb20Var2.a();
        if (a == null) {
        }
        return (Serializable) kotlin.collections.b.i(pair4, pair22, pair32, new Pair("DeviceID", a), new Pair("Timezone-Offset", s8o.q()));
    }
}
