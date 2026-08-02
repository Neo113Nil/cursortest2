package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeDebugStatsItem;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c2r0;
import xsna.hzg0;
import xsna.k2q;
import xsna.usi0;

/* compiled from: ExchangeTokenRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class l2q implements k2q {
    public final Context a;
    public final t0f b;
    public final vwk c;
    public final bpn0 d;
    public final rar0 e;
    public final ConcurrentHashMap<UserId, String> f = new ConcurrentHashMap<>();
    public final CountDownLatch g = new CountDownLatch(1);
    public final a h = new a();

    /* compiled from: ExchangeTokenRepositoryImpl.kt */
    public static final class a {
        public final bpn0 a = new bpn0(new ag7(2));

        /* compiled from: ExchangeTokenRepositoryImpl.kt */
        /* renamed from: xsna.l2q$a$a, reason: collision with other inner class name */
        /* loaded from: classes15.dex */
        public static final class C3228a {
            public final UserId a;
            public final String b;
            public final String c;
            public final String d;

            public C3228a(UserId userId, String str, String str2, String str3) {
                this.a = userId;
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            public static C3228a a(C3228a c3228a, String str, String str2, String str3, int i) {
                UserId userId = c3228a.a;
                if ((i & 2) != 0) {
                    str = c3228a.b;
                }
                if ((i & 4) != 0) {
                    str2 = c3228a.c;
                }
                if ((i & 8) != 0) {
                    str3 = c3228a.d;
                }
                return new C3228a(userId, str, str2, str3);
            }

            public final UserId b() {
                return this.a;
            }

            public final JSONObject c() {
                return new JSONObject().put("userId", this.a.b).put("exchangeTokenFromPreference", this.b).put("exchangeTokenFromDatabase", this.c).put("exchangeTokemFromAccountManager", this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3228a)) {
                    return false;
                }
                C3228a c3228a = (C3228a) obj;
                return epx.f(this.a, c3228a.a) && epx.f(this.b, c3228a.b) && epx.f(this.c, c3228a.c) && epx.f(this.d, c3228a.d);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.a.b) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WarmUpState(userId=");
                sb.append(this.a);
                sb.append(", exchangeTokenFromPreference=");
                sb.append(this.b);
                sb.append(", exchangeTokenFromDatabase=");
                sb.append(this.c);
                sb.append(", exchangeTokenFromAccountManager=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: ExchangeTokenRepositoryImpl.kt */
        /* loaded from: classes15.dex */
        public static final class b {
            public C3228a a;

            public b(UserId userId) {
                this.a = new C3228a(userId, null, null, null);
            }

            public final C3228a a() {
                return this.a;
            }

            public final void b(String str) {
                this.a = C3228a.a(this.a, null, null, str != null ? erm0.D0(10, str) : null, 7);
            }

            public final void c(String str) {
                this.a = C3228a.a(this.a, null, str != null ? erm0.D0(10, str) : null, null, 11);
            }

            public final void d(String str) {
                this.a = C3228a.a(this.a, str != null ? erm0.D0(10, str) : null, null, null, 13);
            }
        }
    }

    public l2q(Context context, t0f t0fVar, vwk vwkVar, bpn0 bpn0Var, rar0 rar0Var) {
        this.a = context;
        this.b = t0fVar;
        this.c = vwkVar;
        this.d = bpn0Var;
        this.e = rar0Var;
    }

    public static String e(UserId userId) {
        return "exchangeToken" + userId.b;
    }

    @Override // xsna.k2q
    public final String a(UserId userId) {
        ConcurrentHashMap<UserId, String> concurrentHashMap = this.f;
        String str = concurrentHashMap.get(userId);
        if (str == null) {
            str = this.e.a(e(userId));
        }
        if (str == null) {
            r55 r55Var = r55.a;
            List<c2r0.b> h = ((yui) r55.j()).h(this.a, true);
            if (h != null) {
                for (c2r0.b bVar : h) {
                    concurrentHashMap.put(bVar.d(), bVar.a());
                }
            }
        } else {
            concurrentHashMap.put(userId, str);
        }
        String str2 = concurrentHashMap.get(userId);
        return str2 == null ? "" : str2;
    }

    @Override // xsna.k2q
    public final void b(UserId userId, String str, boolean z) {
        par0.a.getClass();
        par0.a("EXCHANGE_TOKEN_REPOSITORY: Token set for id=" + userId);
        if (!fkq0.c(userId) || drm0.N(str)) {
            return;
        }
        this.f.put(userId, str);
        String e = e(userId);
        rar0 rar0Var = this.e;
        ConcurrentHashMap concurrentHashMap = rar0Var.b;
        if (!epx.f(concurrentHashMap.get(e), str)) {
            concurrentHashMap.put(e, str);
            wqu0 wqu0Var = rar0Var.a;
            wqu0Var.c.getValue();
            hzg0.b bVar = (hzg0.b) wqu0Var.b.edit();
            bVar.putString(e, str);
            bVar.apply();
        }
        if (z) {
            j(userId, str);
        }
    }

    @Override // xsna.k2q
    public final synchronized void c() {
        try {
            if (g()) {
                r55 r55Var = r55.a;
                r55.j();
                this.g.getCount();
                new og0((mp) this.d.getValue(), this).d();
                Iterator<T> it = f().iterator();
                while (it.hasNext()) {
                    k((UserId) it.next());
                }
            }
        } finally {
            this.g.countDown();
        }
    }

    public final k2q.b d() {
        if (!g()) {
            return new k2q.b(EmptyList.b, false);
        }
        this.g.await();
        List<UserId> f = f();
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        for (UserId userId : f) {
            arrayList.add(new h2q(userId, a(userId)));
        }
        return new k2q.b(arrayList, g());
    }

    public final List<UserId> f() {
        ArrayList e = ((SessionManagementComponent) this.c.c).J2().e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(((usi0.a) it.next()).c().b());
        }
        boolean isEmpty = arrayList.isEmpty();
        Collection collection = arrayList;
        if (isEmpty) {
            collection = Collections.singletonList(((w25) this.b.invoke()).b);
        }
        return (List) collection;
    }

    public final boolean g() {
        List<UserId> f = f();
        if ((f instanceof Collection) && f.isEmpty()) {
            return false;
        }
        Iterator<T> it = f.iterator();
        while (it.hasNext()) {
            if (fkq0.c((UserId) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        a aVar = this.h;
        aVar.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ConcurrentHashMap) aVar.a.getValue()).values().iterator();
        while (it.hasNext()) {
            jSONArray.put(((a.C3228a) it.next()).c());
        }
        new x6l(new SchemeStatSak$TypeDebugStatsItem("exchange_flow_debug", null, null, jSONArray.toString(), 6, null), true).q();
    }

    public final void i(UserId userId) {
        par0.a.getClass();
        par0.a("EXCHANGE_TOKEN_REPOSITORY: Token removed for id=" + userId);
        this.f.remove(userId);
        String e = e(userId);
        rar0 rar0Var = this.e;
        ConcurrentHashMap concurrentHashMap = rar0Var.b;
        Object obj = concurrentHashMap.get(e);
        String str = rar0.c;
        if (obj != str) {
            concurrentHashMap.put(e, str);
            wqu0 wqu0Var = rar0Var.a;
            wqu0Var.c.getValue();
            hzg0.b bVar = (hzg0.b) wqu0Var.b.edit();
            bVar.remove(e);
            bVar.apply();
        }
        j(userId, "");
    }

    public final void j(UserId userId, String str) {
        mp mpVar;
        if (!fkq0.c(userId) || drm0.N(str)) {
            return;
        }
        bpn0 bpn0Var = this.d;
        mp mpVar2 = (mp) bpn0Var.getValue();
        hp e = mpVar2 != null ? mpVar2.e(userId) : null;
        if (e == null || (mpVar = (mp) bpn0Var.getValue()) == null) {
            return;
        }
        mpVar.g(hp.a(e, null, str, 895));
    }

    public final void k(UserId userId) {
        c2r0.b bVar;
        Object obj;
        hp a2;
        String a3 = this.e.a(e(userId));
        if (a3 != null) {
            this.f.put(userId, a3);
        }
        a.b bVar2 = new a.b(userId);
        bVar2.d(a3);
        mp mpVar = (mp) this.d.getValue();
        String e = (mpVar == null || (a2 = mpVar.a(userId)) == null) ? null : a2.e();
        bVar2.b(e);
        a aVar = this.h;
        if (e != null && e.length() != 0) {
            a.C3228a a4 = bVar2.a();
            ((ConcurrentHashMap) aVar.a.getValue()).put(a4.b(), a4);
            b(userId, e, false);
            return;
        }
        r55 r55Var = r55.a;
        List<c2r0.b> h = ((yui) r55.j()).h(this.a, true);
        if (h != null) {
            Iterator<T> it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((c2r0.b) obj).d(), userId)) {
                        break;
                    }
                }
            }
            bVar = (c2r0.b) obj;
        } else {
            bVar = null;
        }
        bVar2.c(bVar != null ? bVar.a() : null);
        a.C3228a a5 = bVar2.a();
        ((ConcurrentHashMap) aVar.a.getValue()).put(a5.b(), a5);
        if (bVar == null) {
            par0.a.getClass();
            par0.a("EXCHANGE_TOKEN_REPOSITORY: Used token from storage");
        } else {
            par0.a.getClass();
            par0.a("EXCHANGE_TOKEN_REPOSITORY: Used token from users store");
            b(userId, bVar.a(), true);
        }
    }
}
