package defpackage;

import android.net.Uri;
import androidx.compose.runtime.g;
import com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType;
import com.google.firebase.sessions.d;
import com.yandex.go.flex.common.api.FeedSdkTheme;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.MainSidePager;
import com.yandex.go.payments.shared.w;
import com.yandex.go.quark.dynamic.h;
import com.yandex.go.scooters.domain.y;
import com.yandex.go.screenshot_screencast_tracker.impl.b;
import com.yandex.go.taxi.order.domain.interactors.p;
import com.yandex.go.taxi.order.superapp.orders.n;
import com.yandex.go.taxi.order.superapp.orders.v;
import com.yandex.go.zone.model.Zone;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.sdc.domain.c;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.settings.email.a;
import ru.yandex.taxi.summary.promotions.repository.e;
import ru.yandex.taxi.superapp.f;

/* loaded from: classes9.dex */
public final class j5e0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5e0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        wgg0 wgg0Var;
        h hVar;
        Object a;
        final long j;
        final int i = 0;
        switch (this.a) {
            case 0:
                fxe0 fxe0Var = (fxe0) obj;
                k5e0 k5e0Var = (k5e0) this.b;
                if (fxe0Var instanceof v7s0) {
                    ((h5e0) k5e0Var.Dg()).P(((v7s0) fxe0Var).a);
                } else if (fxe0Var instanceof r0c) {
                    ((h5e0) k5e0Var.Dg()).hide();
                } else {
                    k5e0Var.getClass();
                }
                return zy11.a;
            case 1:
                ((kef0) this.b).render((lef0) obj);
                return zy11.a;
            case 2:
                Object emit = ((lz40) this.b).emit((dgf0) obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
            case 3:
                ((vof0) this.b).render((oof0) obj);
                return zy11.a;
            case 4:
                if (!((Boolean) obj).booleanValue()) {
                    zgg0 zgg0Var = ((oig0) this.b).b;
                    synchronized (zgg0Var) {
                        try {
                            kjz kjzVar = zgg0Var.b;
                            if (kjzVar != null && (wgg0Var = (wgg0) kjzVar.c) != null && (hVar = (h) ((xvf0) ((e6g) wgg0Var).d).get()) != null) {
                                hVar.f();
                            }
                            zgg0Var.b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return zy11.a;
            case 5:
                ((a) ((fpi0) this.b).b.get()).d();
                return zy11.a;
            case 6:
                ((Boolean) obj).getClass();
                Object invoke = ((tls) this.b).invoke(continuation);
                return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : zy11.a;
            case 7:
                zuo0 zuo0Var = (zuo0) obj;
                com.yandex.go.scooters.ignition.domain.a aVar = (com.yandex.go.scooters.ignition.domain.a) this.b;
                if (((ewn0) aVar.f.get()).a()) {
                    ((pep0) aVar.c).f((m950) aVar.d.get(), new ovn0(r0b1.b(), zuo0Var.getSessionId(), null), hxx.a);
                }
                return zy11.a;
            case 8:
                return (((Boolean) obj).booleanValue() && (a = ((fxn0) this.b).d.a(continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? a : zy11.a;
            case 9:
                zuo0 zuo0Var2 = (zuo0) obj;
                y yVar = (y) this.b;
                yVar.getClass();
                String sessionId = zuo0Var2.getSessionId();
                Iterator it = ((Iterable) yVar.g.get()).iterator();
                while (it.hasNext()) {
                    ((yuo0) it.next()).a(sessionId);
                }
                Iterator it2 = ((Iterable) yVar.h.get()).iterator();
                while (it2.hasNext()) {
                    ((yuo0) it2.next()).a(sessionId);
                }
                if (!((ewn0) yVar.e.get()).a()) {
                    ((pep0) yVar.c).f((m950) yVar.d.get(), new ovn0(c1b1.a(), zuo0Var2.getSessionId(), new mvn0(zuo0Var2)), hxx.a);
                }
                return zy11.a;
            case 10:
                Iterator it3 = ((Iterable) ((b) this.b).f.get()).iterator();
                while (it3.hasNext()) {
                    ((com.yandex.go.diagnostic_qr.b) it3.next()).b();
                }
                return zy11.a;
            case 11:
                com.yandex.go.screenshot_screencast_tracker.impl.trackers.h.a((com.yandex.go.screenshot_screencast_tracker.impl.trackers.h) this.b, (Uri) obj);
                return zy11.a;
            case 12:
                t1w t1wVar = (t1w) obj;
                mip0 mip0Var = (mip0) this.b;
                mip0Var.c = t1wVar;
                mip0Var.a(t1wVar);
                return zy11.a;
            case 13:
                ((c) this.b).c.a();
                return zy11.a;
            case 14:
                fnx0 fnx0Var = (fnx0) obj;
                w3r0 w3r0Var = (w3r0) this.b;
                Zone c = w3r0Var.c.c();
                pex0 pex0Var = fnx0Var.c;
                List list = w3r0Var.c.a.x;
                ru.yandex.taxi.requirements.repository.b bVar = w3r0Var.d.a;
                ArrayList arrayList = new ArrayList(list);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = pex0Var.f().iterator();
                while (it4.hasNext()) {
                    k1b0 i2 = ((lmw0) it4.next()).i();
                    if (!jl40.l(i2, h1b0.a)) {
                        if (i2 instanceof i1b0) {
                            b580 b580Var = (b580) bVar.d.get(((i1b0) i2).a());
                            if (b580Var != null) {
                                arrayList2.add(b580Var);
                                arrayList3.add(b580Var.a);
                            }
                        } else {
                            if (!(i2 instanceof j1b0)) {
                                w511.b();
                                return null;
                            }
                            b580 b580Var2 = (b580) bVar.d.get(((j1b0) i2).a);
                            if (b580Var2 != null) {
                                arrayList2.add(b580Var2);
                                arrayList3.add(b580Var2.a);
                            }
                        }
                    }
                }
                ycc.w(arrayList, new cuh(arrayList3, 1), true);
                arrayList.addAll(arrayList2);
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (!iab1.c((b580) next, pex0Var)) {
                        arrayList4.add(next);
                    }
                }
                w3r0Var.a(arrayList4, c, RequirementsChangedNotifier.ChangeType.CHANGE, fnx0Var.c);
                return zy11.a;
            case 15:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                w wVar = (w) this.b;
                if (booleanValue) {
                    bpr0 bpr0Var = (bpr0) wVar.a.get();
                    bpr0Var.f = true;
                    bpr0Var.h.postDelayed(bpr0Var.i, 500L);
                } else {
                    bpr0 bpr0Var2 = (bpr0) wVar.a.get();
                    bpr0Var2.f = false;
                    bpr0Var2.h.removeCallbacks(bpr0Var2.i);
                }
                return zy11.a;
            case 16:
                wyq0 wyq0Var = (wyq0) obj;
                d dVar = (d) this.b;
                dVar.h = wyq0Var;
                Object a2 = d.a(dVar, wyq0Var.a.a, SharedSessionRepositoryImpl$NotificationType.GENERAL, continuation);
                return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : zy11.a;
            case 17:
                ((g) ((w6f0) this.b)).setValue(obj);
                return zy11.a;
            case 18:
                ((e) this.b).h.a();
                return zy11.a;
            case 19:
                ((g0w0) this.b).render((i0w0) obj);
                return zy11.a;
            case 20:
                i iVar = (i) this.b;
                iVar.getClass();
                iVar.q(false, (zzs) obj, RoutePointType.POINT_A, true, false, "auto", null, PositionInitAction.AUTO_LOCATION);
                return zy11.a;
            case 21:
                ((MainSidePager) this.b).setHintHeaderHeight(((Number) obj).intValue());
                return zy11.a;
            case 22:
                g3w0 g3w0Var = (g3w0) obj;
                a3w0 a3w0Var = (a3w0) this.b;
                ((z2w0) a3w0Var.Dg()).render(g3w0Var);
                a3w0Var.B.a(g3w0Var);
                return zy11.a;
            case 23:
                ((e4w0) this.b).render((h4w0) obj);
                return zy11.a;
            case 24:
                hl3 hl3Var = (hl3) obj;
                f fVar = ((com.yandex.go.external_service.auth.a) this.b).c;
                if (hl3Var instanceof fl3) {
                    j = ((fl3) hl3Var).a;
                } else {
                    if (!(hl3Var instanceof gl3)) {
                        w511.b();
                        return null;
                    }
                    j = 0;
                }
                fVar.d.updateAndGet(new UnaryOperator() { // from class: mne
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        one oneVar = (one) obj2;
                        if (oneVar == null || oneVar.b().getValue() != j) {
                            return null;
                        }
                        return oneVar;
                    }
                });
                return zy11.a;
            case 25:
                Object emit2 = ((com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.b) this.b).e.emit((waw0) obj, continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : zy11.a;
            case 26:
                final v vVar = (v) this.b;
                ConcurrentHashMap concurrentHashMap = vVar.p;
                j63 j63Var = new j63(concurrentHashMap.keySet());
                List list2 = (List) obj;
                j63Var.removeAll(list2);
                r53 r53Var = new r53(j63Var);
                while (r53Var.hasNext()) {
                    final o2y0 o2y0Var = (o2y0) r53Var.next();
                    n nVar = (n) concurrentHashMap.remove(o2y0Var);
                    if (nVar != null) {
                        nVar.c(new Consumer() { // from class: t1y0
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj2) {
                                switch (i) {
                                    case 0:
                                        vVar.b(o2y0Var, (q6y0) obj2);
                                        break;
                                    default:
                                        vVar.b(o2y0Var, (q6y0) obj2);
                                        break;
                                }
                            }
                        });
                    }
                }
                j63 j63Var2 = new j63(list2);
                j63Var2.removeAll(concurrentHashMap.keySet());
                r53 r53Var2 = new r53(j63Var2);
                while (r53Var2.hasNext()) {
                    final o2y0 o2y0Var2 = (o2y0) r53Var2.next();
                    r53 r53Var3 = r53Var2;
                    n nVar2 = new n(vVar.a, o2y0Var2, ((h980) vVar.b.get()).a(), (q180) vVar.c.get(), (com.yandex.go.taxi.order.superapp.orders.h) vVar.d.get(), (ru.yandex.taxi.checkin.a) vVar.e.get(), (p) vVar.g.get(), (iup0) vVar.i.get(), vVar.f, vVar.j, vVar.k, vVar.l, vVar.m, vVar.n);
                    if (((Number) vVar.q.j().getValue()).intValue() > 0) {
                        final int i3 = 1;
                        nVar2.b(new Consumer() { // from class: t1y0
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj2) {
                                switch (i3) {
                                    case 0:
                                        vVar.b(o2y0Var2, (q6y0) obj2);
                                        break;
                                    default:
                                        vVar.b(o2y0Var2, (q6y0) obj2);
                                        break;
                                }
                            }
                        });
                    }
                    concurrentHashMap.put(o2y0Var2, nVar2);
                    r53Var2 = r53Var3;
                }
                return zy11.a;
            case 27:
                String str = (String) obj;
                Iterator it6 = ((cay0) this.b).e.iterator();
                while (it6.hasNext()) {
                    ((Consumer) it6.next()).accept(str);
                }
                return zy11.a;
            case 28:
                FeedSdkTheme feedSdkTheme = (FeedSdkTheme) obj;
                ((com.yandex.go.flex.common.ui.theme.f) this.b).c = feedSdkTheme;
                com.yandex.go.flex.common.ui.theme.f fVar2 = (com.yandex.go.flex.common.ui.theme.f) this.b;
                fVar2.b.removeIf(new md3(20, new ceu0(10)));
                Iterator it7 = fVar2.b.iterator();
                while (it7.hasNext()) {
                    pvy0 pvy0Var = (pvy0) ((WeakReference) it7.next()).get();
                    if (pvy0Var != null) {
                        pvy0Var.a(feedSdkTheme.getId());
                    }
                }
                return zy11.a;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                yv11 yv11Var = (yv11) this.b;
                yv11Var.getClass();
                yv11Var.b(new u131("superapp.profile.is_ultima_badge_available", booleanValue2));
                return zy11.a;
        }
    }
}
