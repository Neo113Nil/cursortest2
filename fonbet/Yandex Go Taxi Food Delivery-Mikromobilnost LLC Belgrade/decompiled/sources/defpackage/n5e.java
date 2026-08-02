package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.internal.authorized.sync.SyncController$SyncErrorSource;
import io.appmetrica.analytics.RtmErrorEvent;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes15.dex */
public final class n5e implements y4e, vff0, qw50 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public k5e E;
    public final Looper a;
    public final xw50 b;
    public final o5e c;
    public final doc w;
    public final ohs0 x = new ohs0();
    public boolean y;
    public SyncController$SyncErrorSource z;

    public n5e(a5e a5eVar, Looper looper, xw50 xw50Var, wff0 wff0Var, o5e o5eVar, doc docVar) {
        this.a = looper;
        this.b = xw50Var;
        this.c = o5eVar;
        this.w = docVar;
        z83.g(null, looper, Looper.myLooper());
        z83.g(null, xw50Var.w.getLooper(), Looper.myLooper());
        xw50Var.b.b(this);
        a5eVar.a(this);
        wff0Var.a(this);
        this.E = k5e.f;
    }

    @Override // defpackage.qw50
    public final void a(boolean z) {
        z83.g(null, this.a, Looper.myLooper());
        e();
    }

    @Override // defpackage.vff0
    public final void b() {
        this.D = true;
        xw50 xw50Var = this.b;
        z83.g(null, xw50Var.w.getLooper(), Looper.myLooper());
        xw50Var.b.d(this);
    }

    @Override // defpackage.y4e
    public final void c(wor0 wor0Var) {
        z83.g(null, this.a, Looper.myLooper());
        this.A = false;
        this.y = true;
        e();
    }

    public final void d(k5e k5eVar) {
        z83.g(null, this.a, Looper.myLooper());
        if (jl40.l(this.E, k5eVar)) {
            return;
        }
        this.E = k5eVar;
        o5e o5eVar = this.c;
        k5e a = o5eVar.a();
        k5e k5eVar2 = k5e.d;
        if (!a.equals(k5eVar2) && k5eVar.equals(k5eVar2)) {
            w3c.a.getClass();
            SystemClock.elapsedRealtime();
        }
        if (o5eVar.a().equals(k5eVar2) && !k5eVar.equals(k5eVar2)) {
            w3c.a.getClass();
            SystemClock.elapsedRealtime();
        }
        k5e a2 = o5eVar.a();
        k5e k5eVar3 = k5e.k;
        if (!a2.equals(k5eVar3) && k5eVar.equals(k5eVar3)) {
            w3c.a.getClass();
            SystemClock.elapsedRealtime();
        }
        if (o5eVar.a().equals(k5eVar3) && !k5eVar.equals(k5eVar3)) {
            w3c.a.getClass();
            SystemClock.elapsedRealtime();
        }
        o5eVar.a.set(k5eVar);
        r0 r0Var = o5eVar.b;
        r0Var.getClass();
        r0Var.m(null, k5eVar);
        k5e k5eVar4 = this.E;
        doc docVar = this.w;
        docVar.getClass();
        Map i = b.i(new Pair(ACSPConstants.STATUS, Integer.valueOf(k5eVar4.a)), new Pair("statusName", k5eVar4.b));
        x22 x22Var = docVar.b;
        x22Var.reportEvent("tech connection status changed", i);
        if (scc.g(k5e.g, k5e.e, k5e.l).contains(k5eVar4)) {
            x22Var.j("tech_connection_error", RtmErrorEvent.ErrorLevel.ERROR, i);
        }
        Iterator it = this.x.iterator();
        while (true) {
            sq60 sq60Var = (sq60) it;
            if (!sq60Var.hasNext()) {
                return;
            } else {
                ((tls) sq60Var.next()).invoke(this.E);
            }
        }
    }

    public final void e() {
        if (this.D) {
            return;
        }
        boolean a = this.b.a();
        boolean z = this.y;
        if (!z && !a) {
            d(k5e.h);
            return;
        }
        if (!z && this.A) {
            d(k5e.d);
            return;
        }
        if (!z && !this.B) {
            d(k5e.g);
            return;
        }
        SyncController$SyncErrorSource syncController$SyncErrorSource = this.z;
        int i = syncController$SyncErrorSource == null ? -1 : m5e.a[syncController$SyncErrorSource.ordinal()];
        if (i != -1) {
            if (i == 1) {
                d(k5e.e);
                return;
            } else if (i == 2) {
                d(k5e.l);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (this.B) {
            d(k5e.k);
        } else if (this.C) {
            d(k5e.i);
        } else {
            z83.i();
            d(k5e.c);
        }
    }

    @Override // defpackage.y4e
    public final void onConnectionClosed() {
        z83.g(null, this.a, Looper.myLooper());
        this.A = false;
        this.y = false;
        e();
    }
}
