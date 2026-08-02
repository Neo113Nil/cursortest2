package com.yandex.go.scooters.qr.preview.domain;

import com.yandex.go.scooters.qr.domain.c;
import defpackage.hmo0;
import defpackage.ny61;
import defpackage.qoo0;
import defpackage.tt2;
import defpackage.usn0;
import defpackage.vpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.q;

/* loaded from: classes13.dex */
public final class a {
    public final tt2 a;
    public final com.yandex.go.scooters.qr.preview.data.mapper.a b;
    public final qoo0 c;
    public final c d;
    public final usn0 e;
    public final q f;

    public a(tt2 tt2Var, com.yandex.go.scooters.qr.preview.data.mapper.a aVar, qoo0 qoo0Var, c cVar, usn0 usn0Var, q qVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = qoo0Var;
        this.d = cVar;
        this.e = usn0Var;
        this.f = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r0) == r9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, vpr vprVar, long j, ContinuationImpl continuationImpl) {
        ScootersPreviewInteractor$delayHiding$1 scootersPreviewInteractor$delayHiding$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ScootersPreviewInteractor$delayHiding$1) {
            scootersPreviewInteractor$delayHiding$1 = (ScootersPreviewInteractor$delayHiding$1) continuationImpl;
            int i2 = scootersPreviewInteractor$delayHiding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreviewInteractor$delayHiding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPreviewInteractor$delayHiding$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreviewInteractor$delayHiding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPreviewInteractor$delayHiding$1.L$0 = vprVar;
                    scootersPreviewInteractor$delayHiding$1.J$0 = j;
                    scootersPreviewInteractor$delayHiding$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    j = scootersPreviewInteractor$delayHiding$1.J$0;
                    vprVar = (vpr) scootersPreviewInteractor$delayHiding$1.L$0;
                    kotlin.b.b(obj);
                }
                scootersPreviewInteractor$delayHiding$1.L$0 = null;
                scootersPreviewInteractor$delayHiding$1.J$0 = j;
                scootersPreviewInteractor$delayHiding$1.label = 2;
                Object emit = vprVar.emit(hmo0.a, scootersPreviewInteractor$delayHiding$1);
                return emit != coroutineSingletons ? coroutineSingletons : emit;
            }
        }
        scootersPreviewInteractor$delayHiding$1 = new ScootersPreviewInteractor$delayHiding$1(aVar, continuationImpl);
        Object obj2 = scootersPreviewInteractor$delayHiding$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewInteractor$delayHiding$1.label;
        if (i != 0) {
        }
        scootersPreviewInteractor$delayHiding$1.L$0 = null;
        scootersPreviewInteractor$delayHiding$1.J$0 = j;
        scootersPreviewInteractor$delayHiding$1.label = 2;
        Object emit2 = vprVar.emit(hmo0.a, scootersPreviewInteractor$delayHiding$1);
        if (emit2 != coroutineSingletons2) {
        }
    }
}
