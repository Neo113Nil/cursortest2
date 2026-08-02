package com.yandex.go.morphlex.data;

import android.content.Context;
import defpackage.d6x;
import defpackage.g8e;
import defpackage.k6x;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class f {
    public final Context a;
    public final com.yandex.go.flex.common.utils.a b;
    public final k6x c;
    public json.state.disk.storage.feature.b d;

    public f(Context context, com.yandex.go.flex.common.utils.a aVar, k6x k6xVar) {
        this.a = context;
        this.b = aVar;
        this.c = k6xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r7.b.b(r3, r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MorphlexFlexJasonStateDiskStorageRepository$start$1 morphlexFlexJasonStateDiskStorageRepository$start$1;
        int i;
        d6x d6xVar;
        if (continuationImpl instanceof MorphlexFlexJasonStateDiskStorageRepository$start$1) {
            morphlexFlexJasonStateDiskStorageRepository$start$1 = (MorphlexFlexJasonStateDiskStorageRepository$start$1) continuationImpl;
            int i2 = morphlexFlexJasonStateDiskStorageRepository$start$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexFlexJasonStateDiskStorageRepository$start$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexFlexJasonStateDiskStorageRepository$start$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexFlexJasonStateDiskStorageRepository$start$1.label;
                k6x k6xVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    json.state.disk.storage.feature.b bVar = this.d;
                    if (bVar != null) {
                        bVar.b();
                    }
                    this.d = null;
                    json.state.disk.storage.feature.c cVar = new json.state.disk.storage.feature.c(this.a, g8e.o("jason_morphlex_storage_", str));
                    json.state.disk.storage.feature.b bVar2 = new json.state.disk.storage.feature.b(k6xVar, cVar);
                    this.d = bVar2;
                    bVar2.a();
                    morphlexFlexJasonStateDiskStorageRepository$start$1.L$0 = null;
                    morphlexFlexJasonStateDiskStorageRepository$start$1.L$1 = null;
                    morphlexFlexJasonStateDiskStorageRepository$start$1.L$2 = null;
                    morphlexFlexJasonStateDiskStorageRepository$start$1.label = 1;
                    obj = cVar.a(morphlexFlexJasonStateDiskStorageRepository$start$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                d6xVar = (d6x) obj;
                if (d6xVar != null) {
                    morphlexFlexJasonStateDiskStorageRepository$start$1.L$0 = null;
                    morphlexFlexJasonStateDiskStorageRepository$start$1.L$1 = null;
                    morphlexFlexJasonStateDiskStorageRepository$start$1.L$2 = null;
                    morphlexFlexJasonStateDiskStorageRepository$start$1.L$3 = null;
                    morphlexFlexJasonStateDiskStorageRepository$start$1.label = 2;
                }
                return zy11.a;
            }
        }
        morphlexFlexJasonStateDiskStorageRepository$start$1 = new MorphlexFlexJasonStateDiskStorageRepository$start$1(this, continuationImpl);
        Object obj2 = morphlexFlexJasonStateDiskStorageRepository$start$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexFlexJasonStateDiskStorageRepository$start$1.label;
        k6x k6xVar2 = this.c;
        if (i != 0) {
        }
        d6xVar = (d6x) obj2;
        if (d6xVar != null) {
        }
        return zy11.a;
    }
}
