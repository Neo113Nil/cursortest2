package com.yandex.go.flex.common.utils;

import defpackage.d6x;
import defpackage.g6u;
import defpackage.j5x;
import defpackage.k6x;
import defpackage.m5x;
import defpackage.ny61;
import defpackage.o400;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v4x;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final tt2 a;

    public a(tt2 tt2Var) {
        this.a = tt2Var;
    }

    public static List a(List list, j5x j5xVar) {
        if (j5xVar instanceof m5x) {
            Map map = ((m5x) j5xVar).a;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                ycc.r(a(kotlin.collections.a.o0(list, str), (j5x) entry.getValue()), arrayList);
            }
            return arrayList;
        }
        if (!(j5xVar instanceof v4x)) {
            return Collections.singletonList(new Pair(list, j5xVar));
        }
        List list2 = ((v4x) j5xVar).a;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ycc.r(a(kotlin.collections.a.o0(list, Integer.valueOf(i)), (j5x) obj), arrayList2);
            i = i2;
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(k6x k6xVar, d6x d6xVar, ContinuationImpl continuationImpl) {
        JasonStatePatcherImpl$patch$1 jasonStatePatcherImpl$patch$1;
        int i;
        if (continuationImpl instanceof JasonStatePatcherImpl$patch$1) {
            jasonStatePatcherImpl$patch$1 = (JasonStatePatcherImpl$patch$1) continuationImpl;
            int i2 = jasonStatePatcherImpl$patch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jasonStatePatcherImpl$patch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jasonStatePatcherImpl$patch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jasonStatePatcherImpl$patch$1.label;
                if (i != 0) {
                    b.b(obj);
                    List a = a(EmptyList.a, d6xVar.a.a);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    JasonStatePatcherImpl$patch$2 jasonStatePatcherImpl$patch$2 = new JasonStatePatcherImpl$patch$2(k6xVar, a, d6xVar, null);
                    jasonStatePatcherImpl$patch$1.L$0 = null;
                    jasonStatePatcherImpl$patch$1.L$1 = null;
                    jasonStatePatcherImpl$patch$1.L$2 = null;
                    jasonStatePatcherImpl$patch$1.label = 1;
                    if (tje.k0(g6uVar, jasonStatePatcherImpl$patch$2, jasonStatePatcherImpl$patch$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        jasonStatePatcherImpl$patch$1 = new JasonStatePatcherImpl$patch$1(this, continuationImpl);
        Object obj2 = jasonStatePatcherImpl$patch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jasonStatePatcherImpl$patch$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
