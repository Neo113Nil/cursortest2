package com.yandex.go.flex.main_screen.domain;

import com.yandex.go.flex.main_screen.api.domain.SuperappTopPlaqueType;
import com.yandex.go.flex.main_screen.experiments.j;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class h {
    public final j a;

    public h(j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        SuperappTopPlaqueTypeInteractorImpl$get$1 superappTopPlaqueTypeInteractorImpl$get$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SuperappTopPlaqueTypeInteractorImpl$get$1) {
            superappTopPlaqueTypeInteractorImpl$get$1 = (SuperappTopPlaqueTypeInteractorImpl$get$1) continuationImpl;
            int i2 = superappTopPlaqueTypeInteractorImpl$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTopPlaqueTypeInteractorImpl$get$1.label = i2 - Integer.MIN_VALUE;
                obj = superappTopPlaqueTypeInteractorImpl$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTopPlaqueTypeInteractorImpl$get$1.label;
                j jVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTopPlaqueTypeInteractorImpl$get$1.label = 1;
                    obj = jVar.c(superappTopPlaqueTypeInteractorImpl$get$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Boolean) obj).booleanValue() ? SuperappTopPlaqueType.HEADER_COMPACT_TOP : SuperappTopPlaqueType.DOCUMENT_SECTION;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return SuperappTopPlaqueType.HEADER_BOTTOM;
                }
                superappTopPlaqueTypeInteractorImpl$get$1.label = 2;
                obj = jVar.b(superappTopPlaqueTypeInteractorImpl$get$1);
            }
        }
        superappTopPlaqueTypeInteractorImpl$get$1 = new SuperappTopPlaqueTypeInteractorImpl$get$1(this, continuationImpl);
        obj = superappTopPlaqueTypeInteractorImpl$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTopPlaqueTypeInteractorImpl$get$1.label;
        j jVar2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
