package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.xcu0;

/* compiled from: VkAuthSyncInteractor.kt */
/* loaded from: classes.dex */
public final class wcu0 implements xcu0 {
    public final mp a;
    public final pon0 b;
    public final mxi0 c;
    public final k2q d;
    public final bpn0 e = new bpn0(new wfl(8));

    public wcu0(mp mpVar, pon0 pon0Var, mxi0 mxi0Var, k2q k2qVar) {
        this.a = mpVar;
        this.b = pon0Var;
        this.c = mxi0Var;
        this.d = k2qVar;
    }

    @Override // xsna.xcu0
    public final List a(ArrayList arrayList) {
        mp mpVar = this.a;
        if (mpVar == null) {
            return EmptyList.b;
        }
        List<hp> D0 = j5g.D0(new vcu0(), mpVar.f());
        if (arrayList.isEmpty() && D0.isEmpty()) {
            return EmptyList.b;
        }
        if (arrayList.isEmpty() && !D0.isEmpty()) {
            return c(D0);
        }
        if (D0.isEmpty() && !arrayList.isEmpty()) {
            b(arrayList);
            return gn00.c(arrayList);
        }
        if (arrayList.size() != D0.size()) {
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.setStackTrace(Thread.currentThread().getStackTrace());
            String A = mnh0.A(runtimeException);
            this.c.a(pn00.k(new Pair("action", "AccountManager authDataInternal.size != authDataExternal.size"), new Pair("stacktrace", A.substring(0, Math.min(A.length(), 2000)))));
        }
        if (D0.size() > arrayList.size()) {
            return c(D0);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xcu0.a aVar = (xcu0.a) it.next();
            for (hp hpVar : D0) {
                if (epx.f(aVar.a().e, hpVar.j()) && (!epx.f(aVar.c(), hpVar.k()) || !epx.f(aVar.a().a, hpVar.b()) || aVar.b() != hpVar.h())) {
                    b(Collections.singletonList(aVar));
                }
            }
        }
        return gn00.c(arrayList);
    }

    public final void b(List<xcu0.a> list) {
        List<xcu0.a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (xcu0.a aVar : list2) {
            k2q k2qVar = this.d;
            String a = k2qVar != null ? k2qVar.a(aVar.a().e) : null;
            if (a == null) {
                a = "";
            }
            arrayList.add(gn00.a(aVar, a));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hp hpVar = (hp) it.next();
            mp mpVar = this.a;
            if (mpVar != null) {
                mpVar.d(hpVar);
            }
        }
    }

    public final ArrayList c(List list) {
        this.b.a(list);
        if (((AtomicBoolean) this.e.getValue()).compareAndSet(false, true)) {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.TOKEN_RELOAD_FROM_AM, null, null, null, null, null, null, 254);
        }
        return gn00.d(list);
    }
}
