package com.yandex.go.external_service.preloader.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.external_service.preloader.data.models.StaticInfo;
import defpackage.bvf0;
import defpackage.c7u0;
import defpackage.f6u0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ku2;
import defpackage.ny61;
import defpackage.p4j0;
import defpackage.qa7;
import defpackage.sa7;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.v6u0;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    public final p4j0 a;
    public final gom.yandex.go.web.statics.data.b b;
    public final f6u0 c;
    public final v6u0 d;
    public final i3y e;
    public final AtomicReference f = new AtomicReference();

    public b(p4j0 p4j0Var, gom.yandex.go.web.statics.data.b bVar, f6u0 f6u0Var, v6u0 v6u0Var, Context context) {
        this.a = p4j0Var;
        this.b = bVar;
        this.c = f6u0Var;
        this.d = v6u0Var;
        this.e = kotlin.a.a(new ku2(context, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, tse tseVar, List list, ContinuationImpl continuationImpl) {
        StaticRepository$downloadChunk$1 staticRepository$downloadChunk$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof StaticRepository$downloadChunk$1) {
            staticRepository$downloadChunk$1 = (StaticRepository$downloadChunk$1) continuationImpl;
            int i2 = staticRepository$downloadChunk$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                staticRepository$downloadChunk$1.label = i2 - Integer.MIN_VALUE;
                Object obj = staticRepository$downloadChunk$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = staticRepository$downloadChunk$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(tje.h(tseVar, null, null, new StaticRepository$downloadStatic$1(bVar, (String) it.next(), null), 3));
                    }
                    staticRepository$downloadChunk$1.L$0 = null;
                    staticRepository$downloadChunk$1.L$1 = null;
                    staticRepository$downloadChunk$1.label = 1;
                    if (kotlinx.coroutines.a.b(arrayList, staticRepository$downloadChunk$1) == coroutineSingletons) {
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
        staticRepository$downloadChunk$1 = new StaticRepository$downloadChunk$1(bVar, continuationImpl);
        Object obj2 = staticRepository$downloadChunk$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = staticRepository$downloadChunk$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final Object b(StaticInfo staticInfo, Continuation continuation) {
        Object n;
        StaticInfo staticInfo2;
        int i = c7u0.a[this.a.b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                staticInfo2 = new StaticInfo(v4r0.h(staticInfo.a, staticInfo.b.keySet()), kotlin.collections.b.f());
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                staticInfo2 = new StaticInfo(staticInfo.a, kotlin.collections.b.f());
            }
            staticInfo = staticInfo2;
        }
        if (!jl40.l(staticInfo, c())) {
            String c = this.d.a.c(staticInfo, StaticInfo.Companion.serializer());
            SharedPreferences.Editor edit = ((SharedPreferences) this.e.getValue()).edit();
            edit.putString("eatskitstatic_statics_preferences.preload_info", c);
            edit.apply();
            this.f.set(staticInfo);
        }
        Set set = staticInfo.a;
        boolean isEmpty = set.isEmpty();
        gom.yandex.go.web.statics.data.b bVar = this.b;
        if (isEmpty) {
            bVar.a();
        } else {
            sa7 sa7Var = (sa7) bVar.a.getValue();
            qa7 qa7Var = sa7Var != null ? new qa7(sa7Var) : null;
            if (qa7Var != null) {
                while (qa7Var.hasNext()) {
                    if (!set.contains((String) qa7Var.next())) {
                        qa7Var.remove();
                    }
                }
            }
        }
        Set set2 = staticInfo.a;
        return (!set2.isEmpty() && (n = bvf0.n(new StaticRepository$preload$2(this, set2, null), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? n : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r4 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StaticInfo c() {
        StaticInfo staticInfo;
        AtomicReference atomicReference = this.f;
        StaticInfo staticInfo2 = (StaticInfo) atomicReference.get();
        if (staticInfo2 != null) {
            return staticInfo2;
        }
        String string = ((SharedPreferences) this.e.getValue()).getString("eatskitstatic_statics_preferences.preload_info", null);
        if (string != null) {
            staticInfo = (StaticInfo) this.d.a.b(StaticInfo.Companion.serializer(), string);
        }
        staticInfo = new StaticInfo(0);
        while (!atomicReference.compareAndSet(null, staticInfo) && atomicReference.get() == null) {
        }
        return staticInfo;
    }
}
