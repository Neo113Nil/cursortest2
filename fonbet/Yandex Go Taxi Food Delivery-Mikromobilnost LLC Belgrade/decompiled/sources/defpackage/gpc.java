package defpackage;

import android.util.Log;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.go.taxi.order.search.polling.model.DriverPosition;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.routes.presentation.CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.routes.presentation.CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3;
import ru.yandex.taxi.routes.presentation.c;

/* loaded from: classes6.dex */
public final class gpc implements nlm, bxj {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object w;
    public Object x;

    public gpc(crg crgVar, p78 p78Var, jtq0 jtq0Var) {
        this.b = crgVar;
        this.c = p78Var;
        this.a = jtq0Var.d();
        this.w = Collections.synchronizedSet(new j63(0));
        this.x = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    @Override // defpackage.nlm
    public void a() {
        jst.e.getClass();
    }

    @Override // defpackage.bxj
    public void b(khx khxVar, wwf wwfVar) {
        fxj fxjVar;
        boolean z;
        String a = ((apl0) this.b).a(khxVar);
        xjg xjgVar = (xjg) this.w;
        synchronized (xjgVar) {
            fxjVar = (fxj) ((HashMap) xjgVar.b).get(a);
            if (fxjVar == null) {
                qnh qnhVar = (qnh) xjgVar.c;
                synchronized (((ArrayDeque) qnhVar.a)) {
                    fxjVar = (fxj) ((ArrayDeque) qnhVar.a).poll();
                }
                if (fxjVar == null) {
                    fxjVar = new fxj();
                }
                ((HashMap) xjgVar.b).put(a, fxjVar);
            }
            fxjVar.b++;
        }
        fxjVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(khxVar);
            }
            try {
                eyj f = f();
                if (f.n(a) == null) {
                    mxj e = f.e(a);
                    if (e == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(a));
                    }
                    try {
                        if (((wyn) wwfVar.a).e(wwfVar.b, e.d(), (mg70) wwfVar.c)) {
                            eyj.a(e.d, e, true);
                            e.c = true;
                        }
                        if (!z) {
                            try {
                                e.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!e.c) {
                            try {
                                e.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException unused3) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } finally {
            ((xjg) this.w).e(a);
        }
    }

    @Override // defpackage.bxj
    public File c(khx khxVar) {
        String a = ((apl0) this.b).a(khxVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(khxVar);
        }
        try {
            zch n = f().n(a);
            if (n != null) {
                return ((File[]) n.a)[0];
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    @Override // defpackage.bxj
    public synchronized void clear() {
        try {
            try {
                eyj f = f();
                f.close();
                ow21.a(f.a);
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
                synchronized (this) {
                    this.x = null;
                }
            }
            synchronized (this) {
                this.x = null;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.x = null;
                throw th;
            }
        }
    }

    @Override // defpackage.nlm
    public void d(IOException iOException) {
        ((c) this.b).H.d(this.a, iOException);
        jst.e.k(iOException, "Error driving route");
        ((CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3) this.x).invoke(iOException);
    }

    @Override // defpackage.nlm
    public void e(List list) {
        Object obj;
        Object obj2;
        Object lgl0Var;
        c cVar = (c) this.b;
        if (!cVar.Pg() && !list.isEmpty()) {
            list = Collections.singletonList(a.P(list));
        }
        qlm qlmVar = cVar.U;
        d0l0 d0l0Var = (d0l0) this.c;
        qlmVar.getClass();
        if (list.isEmpty()) {
            lgl0Var = new Result.Failure(new IOException("Routes list is empty"));
        } else {
            List list2 = list;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (in91.d((DrivingRoute) obj)) {
                        break;
                    }
                }
            }
            DrivingRoute drivingRoute = (DrivingRoute) obj;
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (in91.e((DrivingRoute) obj2)) {
                        break;
                    }
                }
            }
            DrivingRoute drivingRoute2 = (DrivingRoute) obj2;
            if (drivingRoute == null && drivingRoute2 == null) {
                drivingRoute = (DrivingRoute) list.get(0);
            } else if (drivingRoute == null) {
                drivingRoute = drivingRoute2;
                drivingRoute2 = null;
            }
            List list3 = d0l0Var.b;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList.add(ru.yandex.taxi.map.utils.a.F(((Address) it3.next()).B()));
            }
            lgl0Var = new lgl0(new a4l0(drivingRoute, null, arrayList, null), drivingRoute2 != null ? new a4l0(drivingRoute2, null, arrayList, null) : null);
        }
        CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 = (CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2) this.w;
        if (!(lgl0Var instanceof Result.Failure)) {
            lgl0 lgl0Var2 = (lgl0) lgl0Var;
            DrivingRoute drivingRoute3 = lgl0Var2.a.a;
            a4l0 a4l0Var = lgl0Var2.b;
            cVar.H.e(this.a, j73.A(new DrivingRoute[]{drivingRoute3, a4l0Var != null ? a4l0Var.a : null}));
            commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2.invoke(lgl0Var2);
        }
        CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3 commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3 = (CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3) this.x;
        Throwable a = Result.a(lgl0Var);
        if (a != null) {
            commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3.invoke(a);
        }
    }

    public synchronized eyj f() {
        try {
            if (((eyj) this.x) == null) {
                this.x = eyj.v((File) this.c, 1, this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (eyj) this.x;
    }

    public void g(DriverCandidate driverCandidate, ImageProvider imageProvider) {
        n0 n0Var = (n0) this.x;
        if (driverCandidate != null) {
            String str = driverCandidate.b;
            String str2 = driverCandidate.a;
            List list = driverCandidate.c;
            if (str.length() != 0 && !list.isEmpty()) {
                List<DriverPosition> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (DriverPosition driverPosition : list2) {
                    zzs zzsVar = new zzs(driverPosition.b, driverPosition.c, 0, null, null, 28);
                    double d = driverPosition.a;
                    Date c = ((crg) this.b).c(driverPosition.e);
                    if (c == null) {
                        ny61.g("Required value was null.");
                        return;
                    }
                    arrayList.add(new h001(zzsVar, d, c, null, null));
                }
                sjm sjmVar = new sjm(str, arrayList);
                ((Set) this.w).add(str2);
                p78 p78Var = (p78) this.c;
                r78 r78Var = new r78(this.a, p78Var.a, p78Var.b);
                r78Var.a(str2, sjmVar);
                pb30 b = r78Var.b();
                if (!list.isEmpty()) {
                    DriverPosition driverPosition2 = (DriverPosition) list.get(0);
                    b.x = new Point(driverPosition2.b, driverPosition2.c);
                    b.w = (float) driverPosition2.a;
                } else if (b.x == null) {
                    n0Var.g(null);
                    return;
                }
                b.b = true;
                b.c = true;
                b.y = imageProvider;
                n0Var.g(new f2e0(str2, b));
                return;
            }
        }
        n0Var.g(null);
    }

    public gpc(File file) {
        this.w = new xjg();
        this.c = file;
        this.a = 262144000L;
        this.b = new apl0();
    }

    public gpc(c cVar, d0l0 d0l0Var, long j, CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2, CommonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3 commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3) {
        this.b = cVar;
        this.c = d0l0Var;
        this.a = j;
        this.w = commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2;
        this.x = commonRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3;
    }
}
