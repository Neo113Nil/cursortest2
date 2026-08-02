package com.yandex.go.drive.sdkintegration.domain.session.drive;

import com.yandex.go.drive.sdkintegration.domain.session.f;
import defpackage.eci0;
import defpackage.h3y;
import defpackage.jqr;
import defpackage.kfm;
import defpackage.lqn;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.shf;
import defpackage.t1r0;
import defpackage.tse;
import defpackage.ucm;
import defpackage.v3x;
import defpackage.vhf;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.ym91;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.o;

/* loaded from: classes.dex */
public final class c implements t1r0 {
    public final kfm a;
    public final com.yandex.go.drive.experiments.c b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final com.yandex.go.drive.delegates.b f;
    public final AtomicReference g = new AtomicReference();
    public final eci0 h;

    public c(tse tseVar, kfm kfmVar, com.yandex.go.drive.experiments.c cVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, com.yandex.go.drive.delegates.b bVar) {
        this.a = kfmVar;
        this.b = cVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = bVar;
        this.h = e.O(new k(com.yandex.go.coroutines.b.d(new o(e.t(new b(new jqr(new rol0(new DriveSessionStateInteractor$sessionStateFlow$1(this, null)), new DriveSessionStateInteractor$sessionStateFlow$2(this, null), 3), this)), new DriveSessionStateInteractor$sessionStateFlow$4(3, null)), new DriveSessionStateInteractor$sessionStateFlow$5(2, null)), new DriveSessionStateInteractor$sessionStateFlow$6(3, null)), tseVar, wsr0.a(xsr0.a, 1), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, lqn lqnVar, ContinuationImpl continuationImpl) {
        DriveSessionStateInteractor$fetchState$1 driveSessionStateInteractor$fetchState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object y;
        ucm ucmVar;
        cVar.getClass();
        if (continuationImpl instanceof DriveSessionStateInteractor$fetchState$1) {
            driveSessionStateInteractor$fetchState$1 = (DriveSessionStateInteractor$fetchState$1) continuationImpl;
            int i2 = driveSessionStateInteractor$fetchState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveSessionStateInteractor$fetchState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveSessionStateInteractor$fetchState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveSessionStateInteractor$fetchState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.drive.delegates.b bVar = cVar.f;
                    driveSessionStateInteractor$fetchState$1.L$0 = lqnVar;
                    driveSessionStateInteractor$fetchState$1.label = 1;
                    obj = bVar.c(driveSessionStateInteractor$fetchState$1);
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
                        ucmVar = (ucm) driveSessionStateInteractor$fetchState$1.L$1;
                        kotlin.b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (ucmVar != null || !booleanValue) {
                            v3x.a.getClass();
                            return null;
                        }
                        f fVar = (f) cVar.e.get();
                        driveSessionStateInteractor$fetchState$1.L$0 = null;
                        driveSessionStateInteractor$fetchState$1.L$1 = null;
                        driveSessionStateInteractor$fetchState$1.Z$0 = booleanValue;
                        driveSessionStateInteractor$fetchState$1.label = 3;
                        Object a = fVar.a(driveSessionStateInteractor$fetchState$1);
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    }
                    lqnVar = (lqn) driveSessionStateInteractor$fetchState$1.L$0;
                    kotlin.b.b(obj);
                }
                ucm ucmVar2 = (ucm) obj;
                driveSessionStateInteractor$fetchState$1.L$0 = null;
                driveSessionStateInteractor$fetchState$1.L$1 = ucmVar2;
                driveSessionStateInteractor$fetchState$1.label = 2;
                y = !((lqnVar == null ? ym91.c(lqnVar) : null) instanceof vhf) ? Boolean.TRUE : e.y(e.X(cVar.b.a(), new DriveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1(cVar, null)), driveSessionStateInteractor$fetchState$1);
                if (y != coroutineSingletons) {
                    obj = y;
                    ucmVar = ucmVar2;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    if (ucmVar != null) {
                    }
                    v3x.a.getClass();
                    return null;
                }
            }
        }
        driveSessionStateInteractor$fetchState$1 = new DriveSessionStateInteractor$fetchState$1(cVar, continuationImpl);
        Object obj2 = driveSessionStateInteractor$fetchState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveSessionStateInteractor$fetchState$1.label;
        if (i != 0) {
        }
        ucm ucmVar22 = (ucm) obj2;
        driveSessionStateInteractor$fetchState$1.L$0 = null;
        driveSessionStateInteractor$fetchState$1.L$1 = ucmVar22;
        driveSessionStateInteractor$fetchState$1.label = 2;
        if (!((lqnVar == null ? ym91.c(lqnVar) : null) instanceof vhf)) {
        }
        if (y != coroutineSingletons) {
        }
    }

    @Override // defpackage.t1r0
    public final shf a() {
        lqn lqnVar = (lqn) this.g.get();
        if (lqnVar != null) {
            return ym91.c(lqnVar);
        }
        return null;
    }

    @Override // defpackage.t1r0
    public final eci0 b() {
        return this.h;
    }
}
