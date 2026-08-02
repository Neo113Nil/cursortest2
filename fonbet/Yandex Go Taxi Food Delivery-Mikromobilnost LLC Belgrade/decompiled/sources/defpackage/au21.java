package defpackage;

import android.os.Handler;
import com.yandex.messaging.core.net.entities.proto.message.UserStatusMessage;
import com.yandex.messaging.domain.statuses.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public final class au21 {
    public static final /* synthetic */ kgx[] p;
    public final x0j0 a;
    public final yt21 b;
    public final ut21 c;
    public final xdf0 d;
    public final kse e;
    public final w3c f;
    public final xt21 g;
    public final Handler h;
    public final vtq0 i;
    public final ArrayList j = new ArrayList();
    public final op3 k = new op3();
    public long l;
    public bh11 m;
    public long n;
    public String o;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("userStatusCall", 0, "getUserStatusCall()Lcom/yandex/messaging/domain/statuses/UserStatusSubscriptionManager$UserStatusCall;", au21.class);
        qoi0.a.getClass();
        p = new kgx[]{mutablePropertyReference1Impl};
    }

    public au21(x0j0 x0j0Var, yt21 yt21Var, ut21 ut21Var, xdf0 xdf0Var, kse kseVar, w3c w3cVar, xt21 xt21Var, Handler handler, vtq0 vtq0Var) {
        this.a = x0j0Var;
        this.b = yt21Var;
        this.c = ut21Var;
        this.d = xdf0Var;
        this.e = kseVar;
        this.f = w3cVar;
        this.g = xt21Var;
        this.h = handler;
        this.i = vtq0Var;
        o430 o430Var = e3n.b;
        this.n = e3n.c;
        this.o = "";
    }

    public static final void a(au21 au21Var) {
        ut21 ut21Var = au21Var.c;
        op3 op3Var = au21Var.k;
        kse.a(au21Var.e);
        boolean isEmpty = au21Var.b().isEmpty();
        kgx[] kgxVarArr = p;
        if (isEmpty) {
            ut21Var.getClass();
            kgx kgxVar = kgxVarArr[0];
            op3Var.b(null);
            return;
        }
        kgx kgxVar2 = kgxVarArr[0];
        l lVar = (l) op3Var.a();
        Object obj = lVar != null ? lVar.a : EmptySet.a;
        if (obj.equals(au21Var.b())) {
            return;
        }
        Set b = au21Var.b();
        obj.toString();
        b.toString();
        ut21Var.getClass();
        au21Var.c();
    }

    public final Set b() {
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zt21) it.next()).a);
        }
        return a.N0(arrayList2);
    }

    public final void c() {
        l lVar;
        this.f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.l;
        if (currentTimeMillis < j) {
            lVar = new l(this, b(), Math.max(j - System.currentTimeMillis(), 1000L));
        } else {
            lVar = new l(this, b(), 0L);
        }
        kgx kgxVar = p[0];
        this.k.b(lVar);
        this.l = Math.max(this.l, System.currentTimeMillis() + 1000);
    }

    public final void d(UserStatusMessage userStatusMessage, String str, long j) {
        o430 o430Var = e3n.b;
        long e = e3n.e(kp50.V(j, DurationUnit.MICROSECONDS));
        long e2 = e3n.e(kp50.U(userStatusMessage.getDuration(), DurationUnit.SECONDS));
        vtq0 vtq0Var = this.i;
        vtq0Var.a.getClass();
        long currentTimeMillis = System.currentTimeMillis() + vtq0Var.b;
        long j2 = e + e2;
        boolean z = currentTimeMillis < j2;
        long j3 = j2 - currentTimeMillis;
        if (!z || j3 >= e3n.e(this.n) || userStatusMessage.getDuration() == 0 || str.equals(this.o)) {
            return;
        }
        bh11 bh11Var = this.m;
        Handler handler = this.h;
        if (bh11Var != null) {
            handler.removeCallbacks(bh11Var);
        }
        this.m = null;
        bh11 bh11Var2 = new bh11(13, this);
        this.o = str;
        this.n = kp50.V(j3, DurationUnit.MILLISECONDS);
        handler.postDelayed(bh11Var2, j3);
        this.m = bh11Var2;
    }
}
