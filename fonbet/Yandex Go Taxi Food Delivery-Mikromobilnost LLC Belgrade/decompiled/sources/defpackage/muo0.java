package defpackage;

import com.yandex.go.scooters.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.scooters.data.p;

/* loaded from: classes13.dex */
public final class muo0 implements sy60 {
    public final /* synthetic */ d a;
    public final /* synthetic */ clo0 b;
    public final /* synthetic */ sls c;

    public muo0(d dVar, clo0 clo0Var, sls slsVar) {
        this.a = dVar;
        this.b = clo0Var;
        this.c = slsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.c.invoke();
    }

    public final void n1(s6k0 s6k0Var) {
        Object obj;
        zzs zzsVar;
        d dVar = this.a;
        h6o0 h6o0Var = dVar.L;
        m0o0 m0o0Var = dVar.J;
        pxm0 pxm0Var = (pxm0) s6k0Var.b;
        List<e3n0> list = (List) s6k0Var.a;
        cyn0 b = m0o0Var.a.b.b();
        if (b != null && b.e == null) {
            pxm0Var = new pxm0("summary", "multimodal");
        }
        h6o0Var.getClass();
        for (e3n0 e3n0Var : list) {
            r7p0 r7p0Var = e3n0Var.a;
            String str = e3n0Var.b;
            u8w u8wVar = h6o0Var.c;
            String str2 = pxm0Var.b;
            String str3 = pxm0Var.a;
            String str4 = r7p0Var.a;
            u8wVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("open_reason", str2);
            hashMap.put("from_screen", str3);
            u8wVar.a.a("ScootersOrder.Created", hashMap, 1, x4e.q(hashMap, "scooter_number", str4, "order_id", str));
            ((na1) h6o0Var.a).getClass();
            String v = as6.v();
            if (v.length() > 0) {
                ((j) h6o0Var.b).v(v);
            }
        }
        p2n0 p2n0Var = (p2n0) s6k0Var.c;
        if (list.size() > 1) {
            dVar.P();
            return;
        }
        e3n0 e3n0Var2 = (e3n0) a.R(list);
        String str5 = e3n0Var2 != null ? e3n0Var2.b : null;
        if (str5 == null) {
            zgz.a(null, new IllegalArgumentException("No offerId after booking for opening detailed order"));
            dVar.P();
            return;
        }
        Iterator it = uh6.C(dVar.Q.a()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (jl40.l(((zuo0) obj).m(), str5)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zuo0 zuo0Var = (zuo0) obj;
        if (zuo0Var == null) {
            zgz.a(null, new IllegalStateException("No session with the offerId after booking for opening detailed order"));
            dVar.P();
            return;
        }
        m0o0 m0o0Var2 = dVar.J;
        String sessionId = zuo0Var.getSessionId();
        if (p2n0Var != null) {
            m0o0Var2.getClass();
        } else {
            nyn0 nyn0Var = m0o0Var2.a;
            p pVar = nyn0Var.b;
            cyn0 b2 = pVar.b();
            if (b2 != null) {
                if (sessionId != null && b2.e == null) {
                    cyn0 a = cyn0.a(b2, sessionId);
                    pVar.c = true;
                    pVar.b.l(a);
                }
                pVar.a();
                nyn0Var.c.a(new fyn0());
            }
        }
        if (p2n0Var != null) {
            zzsVar = p2n0Var.a;
        } else {
            if (p2n0Var != null) {
                w511.b();
                return;
            }
            zzsVar = null;
        }
        d.W(dVar, new e6o0(zzsVar != null ? new len0(zzsVar) : null), zuo0Var.getSessionId(), null, 4);
    }
}
