package com.yandex.go.drive.vertical.interactor;

import defpackage.ck31;
import defpackage.ny61;
import defpackage.sls;
import defpackage.ud;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;

/* loaded from: classes12.dex */
public final class f {
    public final String a;
    public final ck31 b;
    public final com.yandex.go.taxi.tariffs.interactor.g c;

    public f(String str, ck31 ck31Var, com.yandex.go.taxi.tariffs.interactor.g gVar) {
        this.a = str;
        this.b = ck31Var;
        this.c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6.c.a(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sls slsVar, ContinuationImpl continuationImpl) {
        DriveTrackVerticalInteractor$trackVertical$1 driveTrackVerticalInteractor$trackVertical$1;
        int i;
        if (continuationImpl instanceof DriveTrackVerticalInteractor$trackVertical$1) {
            driveTrackVerticalInteractor$trackVertical$1 = (DriveTrackVerticalInteractor$trackVertical$1) continuationImpl;
            int i2 = driveTrackVerticalInteractor$trackVertical$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveTrackVerticalInteractor$trackVertical$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveTrackVerticalInteractor$trackVertical$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveTrackVerticalInteractor$trackVertical$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    driveTrackVerticalInteractor$trackVertical$1.L$0 = slsVar;
                    driveTrackVerticalInteractor$trackVertical$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    slsVar = (sls) driveTrackVerticalInteractor$trackVertical$1.L$0;
                    kotlin.b.b(obj);
                }
                o oVar = new o(((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).i(), new DriveTrackVerticalInteractor$trackVertical$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                ud udVar = new ud(26, slsVar, this);
                driveTrackVerticalInteractor$trackVertical$1.L$0 = null;
                driveTrackVerticalInteractor$trackVertical$1.L$1 = null;
                driveTrackVerticalInteractor$trackVertical$1.L$2 = null;
                driveTrackVerticalInteractor$trackVertical$1.L$3 = null;
                driveTrackVerticalInteractor$trackVertical$1.label = 2;
                Object collect = oVar.collect(udVar, driveTrackVerticalInteractor$trackVertical$1);
                return collect != coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        driveTrackVerticalInteractor$trackVertical$1 = new DriveTrackVerticalInteractor$trackVertical$1(this, continuationImpl);
        Object obj2 = driveTrackVerticalInteractor$trackVertical$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveTrackVerticalInteractor$trackVertical$1.label;
        if (i != 0) {
        }
        o oVar2 = new o(((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).i(), new DriveTrackVerticalInteractor$trackVertical$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
        ud udVar2 = new ud(26, slsVar, this);
        driveTrackVerticalInteractor$trackVertical$1.L$0 = null;
        driveTrackVerticalInteractor$trackVertical$1.L$1 = null;
        driveTrackVerticalInteractor$trackVertical$1.L$2 = null;
        driveTrackVerticalInteractor$trackVertical$1.L$3 = null;
        driveTrackVerticalInteractor$trackVertical$1.label = 2;
        Object collect2 = oVar2.collect(udVar2, driveTrackVerticalInteractor$trackVertical$1);
        if (collect2 != coroutineSingletons2) {
        }
    }
}
