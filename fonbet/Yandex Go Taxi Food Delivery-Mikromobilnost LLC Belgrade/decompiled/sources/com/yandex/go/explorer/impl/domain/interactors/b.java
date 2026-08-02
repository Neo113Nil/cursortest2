package com.yandex.go.explorer.impl.domain.interactors;

import android.location.Location;
import defpackage.ny61;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.repository.e;

/* loaded from: classes12.dex */
public final class b {
    public final ru.yandex.taxi.preorder.source.userposition.repository.b a;

    public b(ru.yandex.taxi.preorder.source.userposition.repository.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ExplorerLocationInteractor$getLocationUpdates$1 explorerLocationInteractor$getLocationUpdates$1;
        int i;
        e eVar;
        if (continuationImpl instanceof ExplorerLocationInteractor$getLocationUpdates$1) {
            explorerLocationInteractor$getLocationUpdates$1 = (ExplorerLocationInteractor$getLocationUpdates$1) continuationImpl;
            int i2 = explorerLocationInteractor$getLocationUpdates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerLocationInteractor$getLocationUpdates$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerLocationInteractor$getLocationUpdates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerLocationInteractor$getLocationUpdates$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    explorerLocationInteractor$getLocationUpdates$1.label = 1;
                    obj = this.a.b(explorerLocationInteractor$getLocationUpdates$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (tpr) obj;
                    }
                    kotlin.b.b(obj);
                }
                eVar = (e) obj;
                if (eVar != null) {
                    return null;
                }
                explorerLocationInteractor$getLocationUpdates$1.L$0 = null;
                explorerLocationInteractor$getLocationUpdates$1.label = 2;
                obj = e.d(eVar, null, null, explorerLocationInteractor$getLocationUpdates$1, 3);
            }
        }
        explorerLocationInteractor$getLocationUpdates$1 = new ExplorerLocationInteractor$getLocationUpdates$1(this, continuationImpl);
        Object obj2 = explorerLocationInteractor$getLocationUpdates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerLocationInteractor$getLocationUpdates$1.label;
        if (i != 0) {
        }
        eVar = (e) obj2;
        if (eVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ExplorerLocationInteractor$getSingleLocationUpdate$1 explorerLocationInteractor$getSingleLocationUpdate$1;
        int i;
        tpr tprVar;
        if (continuationImpl instanceof ExplorerLocationInteractor$getSingleLocationUpdate$1) {
            explorerLocationInteractor$getSingleLocationUpdate$1 = (ExplorerLocationInteractor$getSingleLocationUpdate$1) continuationImpl;
            int i2 = explorerLocationInteractor$getSingleLocationUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerLocationInteractor$getSingleLocationUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerLocationInteractor$getSingleLocationUpdate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerLocationInteractor$getSingleLocationUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    explorerLocationInteractor$getSingleLocationUpdate$1.label = 1;
                    obj = a(explorerLocationInteractor$getSingleLocationUpdate$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return (Location) obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                tprVar = (tpr) obj;
                if (tprVar != null) {
                    return null;
                }
                explorerLocationInteractor$getSingleLocationUpdate$1.label = 2;
                obj = kotlinx.coroutines.flow.e.y(tprVar, explorerLocationInteractor$getSingleLocationUpdate$1);
            }
        }
        explorerLocationInteractor$getSingleLocationUpdate$1 = new ExplorerLocationInteractor$getSingleLocationUpdate$1(this, continuationImpl);
        Object obj3 = explorerLocationInteractor$getSingleLocationUpdate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerLocationInteractor$getSingleLocationUpdate$1.label;
        if (i != 0) {
        }
        tprVar = (tpr) obj3;
        if (tprVar != null) {
        }
    }
}
