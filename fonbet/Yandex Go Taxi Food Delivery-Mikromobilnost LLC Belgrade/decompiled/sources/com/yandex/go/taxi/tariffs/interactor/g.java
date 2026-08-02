package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.g6u;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o400;
import defpackage.po21;
import defpackage.qv10;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes8.dex */
public final class g {
    public final tt2 a;
    public final com.yandex.go.zone.interactors.b b;
    public final po21 c;
    public final com.yandex.go.route.interactor.b d;

    public g(tt2 tt2Var, com.yandex.go.zone.interactors.b bVar, po21 po21Var, com.yandex.go.route.interactor.b bVar2) {
        this.a = tt2Var;
        this.b = bVar;
        this.c = po21Var;
        this.d = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (kotlinx.coroutines.a.w(4000, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AwaitZoneInteractorImpl$awaitOrFetchZone$1 awaitZoneInteractorImpl$awaitOrFetchZone$1;
        int i;
        Ref$ObjectRef z;
        Zone zone;
        if (continuationImpl instanceof AwaitZoneInteractorImpl$awaitOrFetchZone$1) {
            awaitZoneInteractorImpl$awaitOrFetchZone$1 = (AwaitZoneInteractorImpl$awaitOrFetchZone$1) continuationImpl;
            int i2 = awaitZoneInteractorImpl$awaitOrFetchZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awaitZoneInteractorImpl$awaitOrFetchZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = awaitZoneInteractorImpl$awaitOrFetchZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = awaitZoneInteractorImpl$awaitOrFetchZone$1.label;
                if (i != 0) {
                    z = qv10.z(obj);
                    AwaitZoneInteractorImpl$awaitOrFetchZone$2 awaitZoneInteractorImpl$awaitOrFetchZone$2 = new AwaitZoneInteractorImpl$awaitOrFetchZone$2(this, z, null);
                    awaitZoneInteractorImpl$awaitOrFetchZone$1.L$0 = z;
                    awaitZoneInteractorImpl$awaitOrFetchZone$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                        awaitZoneInteractorImpl$awaitOrFetchZone$1.L$0 = null;
                        awaitZoneInteractorImpl$awaitOrFetchZone$1.L$1 = null;
                        awaitZoneInteractorImpl$awaitOrFetchZone$1.label = 3;
                        Object c = this.b.c((mo21) obj, awaitZoneInteractorImpl$awaitOrFetchZone$1);
                        return c == coroutineSingletons ? coroutineSingletons : c;
                    }
                    z = (Ref$ObjectRef) awaitZoneInteractorImpl$awaitOrFetchZone$1.L$0;
                    kotlin.b.b(obj);
                }
                zone = (Zone) z.element;
                if (zone == null) {
                    return zone;
                }
                this.a.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                AwaitZoneInteractorImpl$awaitOrFetchZone$location$1 awaitZoneInteractorImpl$awaitOrFetchZone$location$1 = new AwaitZoneInteractorImpl$awaitOrFetchZone$location$1(this, null);
                awaitZoneInteractorImpl$awaitOrFetchZone$1.L$0 = null;
                awaitZoneInteractorImpl$awaitOrFetchZone$1.label = 2;
                obj = tje.k0(g6uVar, awaitZoneInteractorImpl$awaitOrFetchZone$location$1, awaitZoneInteractorImpl$awaitOrFetchZone$1);
            }
        }
        awaitZoneInteractorImpl$awaitOrFetchZone$1 = new AwaitZoneInteractorImpl$awaitOrFetchZone$1(this, continuationImpl);
        Object obj2 = awaitZoneInteractorImpl$awaitOrFetchZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = awaitZoneInteractorImpl$awaitOrFetchZone$1.label;
        if (i != 0) {
        }
        zone = (Zone) z.element;
        if (zone == null) {
        }
    }
}
