package com.yandex.go.chargers.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.chargers.experiment.ChargersUsePointAExperiment;
import defpackage.ep21;
import defpackage.g6u;
import defpackage.hbp0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o8h;
import defpackage.po21;
import defpackage.rya;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u2a;
import defpackage.uyj;
import defpackage.vng;
import defpackage.y5a;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class c implements u2a {
    public final tt2 a;
    public final com.yandex.go.zone.interactors.b b;
    public final ru.yandex.taxi.location.user.c c;
    public final po21 d;
    public final o8h e;
    public final b f;
    public final rya g;
    public final y5a h;
    public final hbp0 i;

    public c(tt2 tt2Var, com.yandex.go.zone.interactors.b bVar, ru.yandex.taxi.location.user.c cVar, po21 po21Var, o8h o8hVar, b bVar2, rya ryaVar, y5a y5aVar) {
        this.a = tt2Var;
        this.b = bVar;
        this.c = cVar;
        this.d = po21Var;
        this.e = o8hVar;
        this.f = bVar2;
        this.g = ryaVar;
        this.h = y5aVar;
        this.i = new hbp0(new ChargersInitialLocationInteractor$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(4:(1:(1:(1:14)(2:19|20))(4:21|22|23|(1:25)(1:26)))(1:27)|15|16|17)(6:28|29|30|31|(2:33|25)|26))(1:34))(3:45|(4:47|(1:48)|51|(2:53|25))|26)|35|(5:37|(3:39|(1:41)|30)|31|(0)|26)(4:42|(1:44)|23|(0))|25))|58|6|7|(0)(0)|35|(0)(0)|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        throw r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0 A[Catch: all -> 0x00fa, CancellationException -> 0x00fb, TryCatch #2 {CancellationException -> 0x00fb, all -> 0x00fa, blocks: (B:16:0x0040, B:22:0x004e, B:23:0x00df, B:29:0x005c, B:30:0x00b5, B:31:0x00b7, B:34:0x0060, B:35:0x009a, B:37:0x00a0, B:39:0x00a8, B:42:0x00d0, B:51:0x008d), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0 A[Catch: all -> 0x00fa, CancellationException -> 0x00fb, TryCatch #2 {CancellationException -> 0x00fb, all -> 0x00fa, blocks: (B:16:0x0040, B:22:0x004e, B:23:0x00df, B:29:0x005c, B:30:0x00b5, B:31:0x00b7, B:34:0x0060, B:35:0x009a, B:37:0x00a0, B:39:0x00a8, B:42:0x00d0, B:51:0x008d), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, ContinuationImpl continuationImpl) {
        ChargersInitialLocationInteractor$focusOnStartIfNeeded$1 chargersInitialLocationInteractor$focusOnStartIfNeeded$1;
        Object obj;
        int i;
        Object value;
        Address e;
        g6u g6uVar;
        ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$1 chargersInitialLocationInteractor$focusOnStartIfNeeded$2$1;
        tt2 tt2Var = cVar.a;
        ru.yandex.taxi.location.user.c cVar2 = cVar.c;
        y5a y5aVar = cVar.h;
        if (continuationImpl instanceof ChargersInitialLocationInteractor$focusOnStartIfNeeded$1) {
            chargersInitialLocationInteractor$focusOnStartIfNeeded$1 = (ChargersInitialLocationInteractor$focusOnStartIfNeeded$1) continuationImpl;
            int i2 = chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                obj = chargersInitialLocationInteractor$focusOnStartIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((Boolean) y5aVar.b.a.getValue()).booleanValue()) {
                        r0 r0Var = y5aVar.a;
                        do {
                            value = r0Var.getValue();
                            ((Boolean) value).getClass();
                        } while (!r0Var.k(value, Boolean.FALSE));
                        rya ryaVar = cVar.g;
                        chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label = 1;
                        obj = ryaVar.a.b(chargersInitialLocationInteractor$focusOnStartIfNeeded$1);
                        if (obj == coroutineSingletons) {
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        e = (Address) obj;
                        tt2Var.getClass();
                        sjh sjhVar = uyj.a;
                        g6uVar = o400.a;
                        chargersInitialLocationInteractor$focusOnStartIfNeeded$2$1 = new ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$1(cVar, e, null);
                        chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$0 = null;
                        chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$1 = null;
                        chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label = 3;
                        if (tje.k0(g6uVar, chargersInitialLocationInteractor$focusOnStartIfNeeded$2$1, chargersInitialLocationInteractor$focusOnStartIfNeeded$1) == coroutineSingletons) {
                        }
                    }
                    if (i == 3) {
                    } else {
                        if (i == 4) {
                            kotlin.b.b(obj);
                            tt2Var.getClass();
                            sjh sjhVar2 = uyj.a;
                            g6u g6uVar2 = o400.a;
                            ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2 chargersInitialLocationInteractor$focusOnStartIfNeeded$2$2 = new ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2(cVar, (mo21) obj, null);
                            chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$0 = null;
                            chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$1 = null;
                            chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label = 5;
                            return tje.k0(g6uVar2, chargersInitialLocationInteractor$focusOnStartIfNeeded$2$2, chargersInitialLocationInteractor$focusOnStartIfNeeded$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if (!((ChargersUsePointAExperiment) obj).b) {
                    e = cVar2.a.e();
                    if (e == null) {
                        RoutePointType routePointType = RoutePointType.POINT_A;
                        chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$0 = null;
                        chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label = 2;
                        obj = cVar2.a(routePointType, chargersInitialLocationInteractor$focusOnStartIfNeeded$1);
                        if (obj == coroutineSingletons) {
                        }
                        e = (Address) obj;
                    }
                    tt2Var.getClass();
                    sjh sjhVar3 = uyj.a;
                    g6uVar = o400.a;
                    chargersInitialLocationInteractor$focusOnStartIfNeeded$2$1 = new ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$1(cVar, e, null);
                    chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$0 = null;
                    chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$1 = null;
                    chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label = 3;
                    if (tje.k0(g6uVar, chargersInitialLocationInteractor$focusOnStartIfNeeded$2$1, chargersInitialLocationInteractor$focusOnStartIfNeeded$1) == coroutineSingletons) {
                    }
                }
                po21 po21Var = cVar.d;
                chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$0 = null;
                chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label = 4;
                obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(chargersInitialLocationInteractor$focusOnStartIfNeeded$1);
                if (obj == coroutineSingletons) {
                }
                tt2Var.getClass();
                sjh sjhVar22 = uyj.a;
                g6u g6uVar22 = o400.a;
                ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2 chargersInitialLocationInteractor$focusOnStartIfNeeded$2$22 = new ChargersInitialLocationInteractor$focusOnStartIfNeeded$2$2(cVar, (mo21) obj, null);
                chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$0 = null;
                chargersInitialLocationInteractor$focusOnStartIfNeeded$1.L$1 = null;
                chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label = 5;
                if (tje.k0(g6uVar22, chargersInitialLocationInteractor$focusOnStartIfNeeded$2$22, chargersInitialLocationInteractor$focusOnStartIfNeeded$1) != coroutineSingletons) {
                }
            }
        }
        chargersInitialLocationInteractor$focusOnStartIfNeeded$1 = new ChargersInitialLocationInteractor$focusOnStartIfNeeded$1(cVar, continuationImpl);
        obj = chargersInitialLocationInteractor$focusOnStartIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersInitialLocationInteractor$focusOnStartIfNeeded$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (!((ChargersUsePointAExperiment) obj).b) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r11 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (((ru.yandex.taxi.preorder.source.userposition.e) r0).d(r1) == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, ContinuationImpl continuationImpl) {
        ChargersInitialLocationInteractor$preloadZoneInfo$1 chargersInitialLocationInteractor$preloadZoneInfo$1;
        int i;
        po21 po21Var = cVar.d;
        if (continuationImpl instanceof ChargersInitialLocationInteractor$preloadZoneInfo$1) {
            chargersInitialLocationInteractor$preloadZoneInfo$1 = (ChargersInitialLocationInteractor$preloadZoneInfo$1) continuationImpl;
            int i2 = chargersInitialLocationInteractor$preloadZoneInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersInitialLocationInteractor$preloadZoneInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersInitialLocationInteractor$preloadZoneInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersInitialLocationInteractor$preloadZoneInfo$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cVar.e.getClass();
                    return zy11Var;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        chargersInitialLocationInteractor$preloadZoneInfo$1.label = 2;
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        kotlin.b.b(obj);
                        mo21 A = vng.A((ep21) obj);
                        if (A != null) {
                            com.yandex.go.zone.interactors.b bVar = cVar.b;
                            chargersInitialLocationInteractor$preloadZoneInfo$1.L$0 = null;
                            chargersInitialLocationInteractor$preloadZoneInfo$1.label = 4;
                            bVar.getClass();
                            if (bVar.b(A.a(), chargersInitialLocationInteractor$preloadZoneInfo$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                chargersInitialLocationInteractor$preloadZoneInfo$1.label = 3;
                obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).m(chargersInitialLocationInteractor$preloadZoneInfo$1);
            }
        }
        chargersInitialLocationInteractor$preloadZoneInfo$1 = new ChargersInitialLocationInteractor$preloadZoneInfo$1(cVar, continuationImpl);
        Object obj2 = chargersInitialLocationInteractor$preloadZoneInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersInitialLocationInteractor$preloadZoneInfo$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    @Override // defpackage.u2a
    public final void a() {
        hbp0 hbp0Var = this.i;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new ChargersInitialLocationInteractor$onAttach$1(this, null), 3);
        hbp0.e(hbp0Var, null, null, new ChargersInitialLocationInteractor$onAttach$2(this, null), 3);
    }

    @Override // defpackage.u2a
    public final void onDetach() {
        this.i.b();
    }
}
