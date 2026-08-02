package com.yandex.go.external_service.preloader.data;

import com.yandex.go.external_service.preloader.data.models.StaticInfo;
import defpackage.bvf0;
import defpackage.ny61;
import defpackage.p4j0;
import defpackage.qa7;
import defpackage.sa7;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.v6u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final p4j0 a;
    public final gom.yandex.go.web.statics.data.b b;
    public final v6u0 c;

    public a(p4j0 p4j0Var, gom.yandex.go.web.statics.data.b bVar, v6u0 v6u0Var) {
        this.a = p4j0Var;
        this.b = bVar;
        this.c = v6u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, tse tseVar, Iterable iterable, ContinuationImpl continuationImpl) {
        ManifestRepository$downloadChunk$1 manifestRepository$downloadChunk$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ManifestRepository$downloadChunk$1) {
            manifestRepository$downloadChunk$1 = (ManifestRepository$downloadChunk$1) continuationImpl;
            int i2 = manifestRepository$downloadChunk$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                manifestRepository$downloadChunk$1.label = i2 - Integer.MIN_VALUE;
                Object obj = manifestRepository$downloadChunk$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = manifestRepository$downloadChunk$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(tje.h(tseVar, null, null, new ManifestRepository$downloadManifest$1(aVar, (String) it.next(), null), 3));
                    }
                    manifestRepository$downloadChunk$1.L$0 = null;
                    manifestRepository$downloadChunk$1.L$1 = null;
                    manifestRepository$downloadChunk$1.label = 1;
                    obj = kotlinx.coroutines.a.b(arrayList, manifestRepository$downloadChunk$1);
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
                return kotlin.collections.a.M((Iterable) obj);
            }
        }
        manifestRepository$downloadChunk$1 = new ManifestRepository$downloadChunk$1(aVar, continuationImpl);
        Object obj2 = manifestRepository$downloadChunk$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = manifestRepository$downloadChunk$1.label;
        if (i != 0) {
        }
        return kotlin.collections.a.M((Iterable) obj2);
    }

    public final Object b(Collection collection, Continuation continuation) {
        Set N0 = kotlin.collections.a.N0(collection);
        boolean isEmpty = N0.isEmpty();
        gom.yandex.go.web.statics.data.b bVar = this.b;
        if (isEmpty) {
            bVar.a();
        } else {
            sa7 sa7Var = (sa7) bVar.a.getValue();
            qa7 qa7Var = sa7Var != null ? new qa7(sa7Var) : null;
            if (qa7Var != null) {
                while (qa7Var.hasNext()) {
                    if (!N0.contains((String) qa7Var.next())) {
                        qa7Var.remove();
                    }
                }
            }
        }
        if (!N0.isEmpty()) {
            return bvf0.n(new ManifestRepository$preload$2(this, N0, null), continuation);
        }
        StaticInfo.Companion.getClass();
        return StaticInfo.d;
    }
}
