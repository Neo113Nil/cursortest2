package com.yandex.go.flex.main_screen.utils.query;

import defpackage.ny61;
import defpackage.s8x;
import defpackage.ute0;
import defpackage.voh;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final s8x a = kotlinx.coroutines.a.a();
    public final AtomicReference b = new AtomicReference();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r6.a.u0(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Set set, ContinuationImpl continuationImpl) {
        DeferredStartAppDocumentQuery$awaitOrNull$1 deferredStartAppDocumentQuery$awaitOrNull$1;
        int i;
        voh vohVar;
        if (continuationImpl instanceof DeferredStartAppDocumentQuery$awaitOrNull$1) {
            deferredStartAppDocumentQuery$awaitOrNull$1 = (DeferredStartAppDocumentQuery$awaitOrNull$1) continuationImpl;
            int i2 = deferredStartAppDocumentQuery$awaitOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deferredStartAppDocumentQuery$awaitOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deferredStartAppDocumentQuery$awaitOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deferredStartAppDocumentQuery$awaitOrNull$1.label;
                if (i != 0) {
                    b.b(obj);
                    deferredStartAppDocumentQuery$awaitOrNull$1.L$0 = set;
                    deferredStartAppDocumentQuery$awaitOrNull$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return (ute0) obj;
                    }
                    set = (Set) deferredStartAppDocumentQuery$awaitOrNull$1.L$0;
                    b.b(obj);
                }
                vohVar = (voh) this.b.getAndSet(null);
                if (vohVar != null) {
                    if (Collections.disjoint(set, vohVar.a)) {
                        vohVar = null;
                    }
                    if (vohVar != null) {
                        deferredStartAppDocumentQuery$awaitOrNull$1.L$0 = null;
                        deferredStartAppDocumentQuery$awaitOrNull$1.label = 2;
                        obj = vohVar.b.s(deferredStartAppDocumentQuery$awaitOrNull$1);
                    }
                }
                return null;
            }
        }
        deferredStartAppDocumentQuery$awaitOrNull$1 = new DeferredStartAppDocumentQuery$awaitOrNull$1(this, continuationImpl);
        Object obj2 = deferredStartAppDocumentQuery$awaitOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deferredStartAppDocumentQuery$awaitOrNull$1.label;
        if (i != 0) {
        }
        vohVar = (voh) this.b.getAndSet(null);
        if (vohVar != null) {
        }
        return null;
    }

    public final void b() {
        this.b.set(null);
        this.a.j0();
    }
}
