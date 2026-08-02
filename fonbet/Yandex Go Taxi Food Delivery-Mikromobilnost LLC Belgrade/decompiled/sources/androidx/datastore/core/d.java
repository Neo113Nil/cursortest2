package androidx.datastore.core;

import defpackage.f8w;
import defpackage.ny61;
import defpackage.qng;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class d extends k {
    public List c;
    public final /* synthetic */ f d;

    public d(f fVar, List list) {
        this.d = fVar;
        this.c = kotlin.collections.a.J0(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.datastore.core.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
        int i;
        qng qngVar;
        if (continuationImpl instanceof DataStoreImpl$InitDataStore$doRun$1) {
            dataStoreImpl$InitDataStore$doRun$1 = (DataStoreImpl$InitDataStore$doRun$1) continuationImpl;
            int i2 = dataStoreImpl$InitDataStore$doRun$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataStoreImpl$InitDataStore$doRun$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$InitDataStore$doRun$1.label;
                f fVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = this.c;
                    if (list == null || list.isEmpty()) {
                        dataStoreImpl$InitDataStore$doRun$1.label = 1;
                        obj = f.g(fVar, false, dataStoreImpl$InitDataStore$doRun$1);
                    } else {
                        f8w h = fVar.h();
                        DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1(fVar, this, null);
                        dataStoreImpl$InitDataStore$doRun$1.label = 2;
                        obj = h.c(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    qngVar = (qng) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    qngVar = (qng) obj;
                }
                fVar.h.b(qngVar);
                return zy11.a;
            }
        }
        dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuationImpl);
        Object obj2 = dataStoreImpl$InitDataStore$doRun$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$InitDataStore$doRun$1.label;
        f fVar2 = this.d;
        if (i != 0) {
        }
        fVar2.h.b(qngVar);
        return zy11.a;
    }
}
