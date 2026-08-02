package com.yandex.mob;

import defpackage.jr20;
import defpackage.lq20;
import defpackage.ny61;
import defpackage.tm20;
import defpackage.zy11;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class m {
    public final jr20 a;
    public final com.yandex.mob.datastore.c b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public m(jr20 jr20Var, com.yandex.mob.datastore.c cVar) {
        this.a = jr20Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MobProxiesDns$init$1 mobProxiesDns$init$1;
        int i;
        tm20 tm20Var;
        List<lq20> list;
        if (continuationImpl instanceof MobProxiesDns$init$1) {
            mobProxiesDns$init$1 = (MobProxiesDns$init$1) continuationImpl;
            int i2 = mobProxiesDns$init$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobProxiesDns$init$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobProxiesDns$init$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobProxiesDns$init$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobProxiesDns$init$1.label = 1;
                    obj = this.b.a(mobProxiesDns$init$1);
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
                tm20Var = (tm20) obj;
                if (tm20Var != null && (list = tm20Var.c) != null) {
                    for (lq20 lq20Var : list) {
                        String str = lq20Var.g;
                        if (str != null) {
                            this.c.put(lq20Var.d, str);
                        }
                    }
                }
                jr20.b(this.a, null, new MobProxiesDns$init$3(this, null), 3);
                return zy11.a;
            }
        }
        mobProxiesDns$init$1 = new MobProxiesDns$init$1(this, continuationImpl);
        Object obj2 = mobProxiesDns$init$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobProxiesDns$init$1.label;
        if (i != 0) {
        }
        tm20Var = (tm20) obj2;
        if (tm20Var != null) {
            while (r6.hasNext()) {
            }
        }
        jr20.b(this.a, null, new MobProxiesDns$init$3(this, null), 3);
        return zy11.a;
    }

    public final List b(String str) {
        String str2 = (String) this.c.get(str);
        return str2 != null ? Collections.singletonList(InetAddress.getByName(str2)) : EmptyList.a;
    }
}
