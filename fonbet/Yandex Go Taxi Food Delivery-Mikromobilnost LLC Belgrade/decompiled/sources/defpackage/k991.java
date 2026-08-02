package defpackage;

import android.os.Looper;
import com.google.android.gms.internal.identity.b;
import com.google.android.gms.internal.identity.c;
import com.google.android.gms.internal.identity.d;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k991 extends ust implements eqs {
    public static final zm2 k = new zm2("LocationServices.API", new b091(2), new pm2());

    public final zzw e() {
        ysx0 a = zsx0.a();
        a.a = c.a;
        a.d = 2414;
        return d(0, a.a());
    }

    public final Task f(LocationCallback locationCallback) {
        return c(puy.c(locationCallback, "LocationCallback"), 2418).h(zkj.y, s400.a);
    }

    public final Task g(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            cvw.m(looper, "invalid null looper");
        }
        ouy a = puy.a(looper, locationCallback, "LocationCallback");
        kzo kzoVar = new kzo(this, a, hay.b);
        hn71 hn71Var = new hn71(28, kzoVar, locationRequest);
        qz40 a2 = o8g0.a();
        a2.k(hn71Var);
        a2.s(kzoVar);
        a2.u(a);
        a2.o(2436);
        return b(a2.i());
    }

    public final Task h(LocationRequest locationRequest, Executor executor, nut nutVar) {
        ouy b = puy.b(nutVar, nut.class.getSimpleName(), executor);
        kzo kzoVar = new kzo(this, b, d.a);
        b bVar = new b(kzoVar, locationRequest, 0);
        qz40 a = o8g0.a();
        a.k(bVar);
        a.s(kzoVar);
        a.u(b);
        a.o(2435);
        return b(a.i());
    }
}
