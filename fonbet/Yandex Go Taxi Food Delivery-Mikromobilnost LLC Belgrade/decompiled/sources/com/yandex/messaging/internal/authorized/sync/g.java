package com.yandex.messaging.internal.authorized.sync;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import com.yandex.messaging.domain.statuses.j;
import com.yandex.messaging.extension.ContextExtensionsKt$makeReceiver$1;
import defpackage.a5e;
import defpackage.at2;
import defpackage.atq0;
import defpackage.b020;
import defpackage.bvf0;
import defpackage.c18;
import defpackage.cvu0;
import defpackage.dia0;
import defpackage.dta0;
import defpackage.dye;
import defpackage.e1k;
import defpackage.fzg;
import defpackage.gci0;
import defpackage.gta0;
import defpackage.h3y;
import defpackage.i0x0;
import defpackage.i7b;
import defpackage.jh10;
import defpackage.jhu0;
import defpackage.k020;
import defpackage.k7d0;
import defpackage.kgx;
import defpackage.kse;
import defpackage.l020;
import defpackage.lqo;
import defpackage.lxd0;
import defpackage.ml21;
import defpackage.n420;
import defpackage.n5e;
import defpackage.n8z0;
import defpackage.nxd0;
import defpackage.ny61;
import defpackage.o0x0;
import defpackage.o420;
import defpackage.p370;
import defpackage.pjs0;
import defpackage.psa0;
import defpackage.py10;
import defpackage.qeb;
import defpackage.qke;
import defpackage.qp3;
import defpackage.r4e;
import defpackage.rsa0;
import defpackage.sgu;
import defpackage.sgx;
import defpackage.tcc;
import defpackage.tgu;
import defpackage.tje;
import defpackage.tz10;
import defpackage.tzt;
import defpackage.u0x0;
import defpackage.u9u0;
import defpackage.v2b0;
import defpackage.vf4;
import defpackage.vff0;
import defpackage.vgu;
import defpackage.wf4;
import defpackage.wff0;
import defpackage.wra0;
import defpackage.x22;
import defpackage.xdf0;
import defpackage.xi3;
import defpackage.xv10;
import defpackage.xxd0;
import defpackage.xy10;
import defpackage.yvf0;
import defpackage.z7b0;
import defpackage.z83;
import defpackage.zbf;
import defpackage.zf4;
import defpackage.zgu;
import defpackage.zq60;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class g implements vff0 {
    public final n5e A;
    public final wff0 B;
    public final xy10 C;
    public final n8z0 D;
    public final r4e E;
    public final pjs0 F;
    public final o0x0 G;
    public final qeb H;
    public final fzg I;
    public final py10 J;
    public final zf4 K;
    public final vgu L;
    public final zgu M;
    public final com.yandex.messaging.internal.net.a N;
    public final yvf0 O;
    public final x22 P;
    public final jh10 Q;
    public final xv10 R;
    public final Looper S;
    public final zq60 T;
    public c18 U;
    public boolean V;
    public final r0 W;
    public final gci0 Z;
    public final com.yandex.messaging.contacts.sync.b a;
    public final n420 a0;
    public final yvf0 b;
    public final k020 c;
    public final rsa0 w;
    public final gta0 x;
    public final a5e y;
    public final sgx z;

    public g(com.yandex.messaging.contacts.sync.b bVar, yvf0 yvf0Var, k020 k020Var, o420 o420Var, rsa0 rsa0Var, gta0 gta0Var, a5e a5eVar, sgx sgxVar, n5e n5eVar, wff0 wff0Var, xy10 xy10Var, n8z0 n8z0Var, r4e r4eVar, pjs0 pjs0Var, o0x0 o0x0Var, qeb qebVar, fzg fzgVar, py10 py10Var, zf4 zf4Var, vgu vguVar, zgu zguVar, com.yandex.messaging.internal.net.a aVar, yvf0 yvf0Var2, yvf0 yvf0Var3, Handler handler, x22 x22Var, lqo lqoVar, jh10 jh10Var, xv10 xv10Var) {
        this.a = bVar;
        this.b = yvf0Var;
        this.c = k020Var;
        this.w = rsa0Var;
        this.x = gta0Var;
        this.y = a5eVar;
        this.z = sgxVar;
        this.A = n5eVar;
        this.B = wff0Var;
        this.C = xy10Var;
        this.D = n8z0Var;
        this.E = r4eVar;
        this.F = pjs0Var;
        this.G = o0x0Var;
        this.H = qebVar;
        this.I = fzgVar;
        this.J = py10Var;
        this.K = zf4Var;
        this.L = vguVar;
        this.M = zguVar;
        this.N = aVar;
        this.O = yvf0Var3;
        this.P = x22Var;
        this.Q = jh10Var;
        this.R = xv10Var;
        Looper looper = handler.getLooper();
        this.S = looper;
        this.T = new zq60();
        r0 c = bvf0.c(Boolean.FALSE);
        this.W = c;
        this.Z = kotlinx.coroutines.flow.e.d(c);
        z83.g(null, o420Var.a, Looper.myLooper());
        this.a0 = new n420(o420Var, this);
        z83.g(null, looper, Looper.myLooper());
        bVar.K.b(this);
        if (lqoVar.a(tz10.q)) {
            xxd0 xxd0Var = (xxd0) yvf0Var2.get();
            ConcurrentHashMap concurrentHashMap = xxd0Var.b;
            List<dta0> list = (List) androidx.room.util.a.b(xxd0Var.a.a, true, false, new dia0(7));
            int i = 10;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (dta0 dta0Var : list) {
                Pair pair = new Pair(dta0Var.b, Long.valueOf(dta0Var.a));
                k7d0 k7d0Var = new k7d0(i, dta0Var);
                lxd0 lxd0Var = new lxd0();
                k7d0Var.invoke(lxd0Var);
                if (lxd0Var.a == null) {
                    ny61.g("message timestamp should be presented");
                    throw null;
                }
                if (lxd0Var.b == null) {
                    ny61.g("message chat id should be presented");
                    throw null;
                }
                Long l = lxd0Var.e;
                if (!(l == null && lxd0Var.f == null) && (lxd0Var.f == null || l == null)) {
                    ny61.g("defining at least one attribute of forward message you should define 2 others");
                    throw null;
                }
                arrayList.add(new Pair(pair, new nxd0(lxd0Var)));
            }
            kotlin.collections.b.p(concurrentHashMap, arrayList);
        }
        this.B.a(this);
    }

    public final void a() {
        n8z0 n8z0Var = this.D;
        n8z0Var.getClass();
        Looper.myLooper();
        z83.i();
        n8z0Var.e = 0L;
        n8z0Var.f = "";
        c18 c18Var = this.U;
        if (c18Var != null) {
            c18Var.cancel();
        }
        this.U = null;
        this.V = false;
    }

    @Override // defpackage.vff0
    public final void b() {
        z83.g(null, this.S, Looper.myLooper());
        this.B.c(this);
        a();
    }

    public final i0x0 c(boolean z, boolean z2, SyncSource syncSource) {
        z83.g(null, this.S, Looper.myLooper());
        this.P.d(syncSource.getLogName(), (String) new b020().b.getValue(), Integer.valueOf(this.A.E.a), Boolean.valueOf(z), Boolean.valueOf(z2));
        if (this.V) {
            this.a.d();
        } else {
            this.N.c();
        }
        n8z0 n8z0Var = this.D;
        n8z0Var.getClass();
        Looper.myLooper();
        z83.i();
        n8z0Var.f = syncSource.getLogName();
        r4e r4eVar = this.E;
        z83.g(null, r4eVar.a, Looper.myLooper());
        if (r4eVar.x == 0) {
            r4eVar.b.getClass();
            r4eVar.x = SystemClock.elapsedRealtime();
            r4eVar.z = 0L;
        }
        rsa0 rsa0Var = this.w;
        kse.a(rsa0Var.a);
        gta0 gta0Var = rsa0Var.g;
        gta0 gta0Var2 = this.x;
        if (gta0Var != gta0Var2) {
            z83.f(gta0Var, null);
            rsa0Var.g = gta0Var2;
            List b = rsa0Var.f.b();
            ArrayList arrayList = new ArrayList(tcc.n(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((wra0) it.next()).b);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                psa0 b2 = rsa0Var.b((ChatRequest) it2.next());
                i7b i7bVar = b2 != null ? b2.b : null;
                if (i7bVar != null) {
                    rsa0Var.a(b2, i7bVar);
                }
            }
        }
        zf4 zf4Var = this.K;
        vf4 vf4Var = zf4Var.x;
        if (vf4Var != null) {
            vf4Var.close();
            zf4Var.x = null;
        }
        wf4 wf4Var = (wf4) zf4Var.a.get();
        z83.g(null, wf4Var.c, Looper.myLooper());
        zf4Var.x = new vf4(wf4Var, zf4Var, wf4Var.z);
        this.a0.e();
        zbf zbfVar = (zbf) this.O.get();
        qp3 qp3Var = zbfVar.g;
        kgx[] kgxVarArr = zbf.h;
        kgx kgxVar = kgxVarArr[0];
        if (((e1k) qp3Var.a()) == null) {
            zbfVar.a("go online", new Pair[0]);
            Context context = zbfVar.a;
            String str = (String) zbfVar.f.getValue();
            ContextExtensionsKt$makeReceiver$1 contextExtensionsKt$makeReceiver$1 = new ContextExtensionsKt$makeReceiver$1(new dye(8, zbfVar));
            qke.z(context, contextExtensionsKt$makeReceiver$1, new IntentFilter(str), 2);
            xi3 xi3Var = new xi3(6, context, contextExtensionsKt$makeReceiver$1);
            qp3 qp3Var2 = zbfVar.g;
            kgx kgxVar2 = kgxVarArr[0];
            qp3Var2.b(xi3Var);
        }
        return new i0x0(this, z, z2);
    }

    public final void d() {
        String str;
        int i = 0;
        z83.h(null, this.y.d != null);
        a();
        e eVar = (e) ((u0x0) this.b.get());
        eVar.H = tje.N(eVar.G, null, null, new HistorySyncer$performSync$1(eVar, new jhu0(this), null), 3);
        int i2 = 5;
        this.U = new c18(i, new tzt(i2, eVar));
        xv10 xv10Var = this.R;
        if (((u9u0) ((h3y) xv10Var.w).get()).w) {
            z7b0 z7b0Var = (z7b0) androidx.room.util.a.b(((at2) xv10Var.c).k0().a, true, false, new dia0(19));
            xv10Var.x = (z7b0Var == null || (str = z7b0Var.b) == null) ? null : kotlinx.coroutines.flow.e.H((xdf0) xv10Var.b, ((j) ((h3y) xv10Var.a).get()).a(str));
        }
        n8z0 n8z0Var = this.D;
        n8z0Var.getClass();
        Looper.myLooper();
        z83.i();
        if (n8z0Var.e == 0) {
            n8z0Var.a.getClass();
            n8z0Var.e = SystemClock.elapsedRealtime();
        }
        n5e n5eVar = this.A;
        z83.g(null, n5eVar.a, Looper.myLooper());
        n5eVar.B = true;
        n5eVar.C = false;
        n5eVar.e();
        zgu zguVar = this.M;
        ml21 ml21Var = zguVar.b;
        SharedPreferences sharedPreferences = zguVar.c;
        z83.g(null, zguVar.a, Looper.myLooper());
        if (!zguVar.e && !sharedPreferences.contains("local_hidden_private_chats_migration_done")) {
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                String key = entry.getKey();
                if (key != null && cvu0.x(key, "hide_", false) && key.length() == 78 && (entry.getValue() instanceof Long)) {
                    String substring = key.substring(i2, 41);
                    String substring2 = key.substring(42);
                    if (substring.equals(ml21Var.a)) {
                        substring = substring2;
                    }
                    if (!substring.equals(ml21Var.a)) {
                        hashMap.put(substring, (Long) entry.getValue());
                        hashSet.add(key);
                    }
                    i2 = 5;
                }
            }
            if (hashMap.isEmpty()) {
                sharedPreferences.edit().putBoolean("local_hidden_private_chats_migration_done", true).apply();
            } else {
                vgu vguVar = zguVar.d;
                z83.g(null, vguVar.a, Looper.myLooper());
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    long longValue = ((Number) entry2.getValue()).longValue();
                    tgu tguVar = new tgu(0);
                    tguVar.hideChat = new sgu(str2, longValue);
                    arrayList.add(tguVar);
                    p370 p370Var = vguVar.d;
                    ((v2b0) p370Var.w).f((String) p370Var.b, UUID.randomUUID().toString(), ((atq0) p370Var.c).b(tguVar));
                }
                k020 k020Var = vguVar.c;
                k020Var.getClass();
                HiddenPrivateChatsBucket hiddenPrivateChatsBucket = new HiddenPrivateChatsBucket();
                at2 at2Var = k020Var.b;
                hiddenPrivateChatsBucket.bucketValue = at2Var.l0().c();
                hiddenPrivateChatsBucket.version = at2Var.S().a("local_hidden_private_chats");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    vgu.b(hiddenPrivateChatsBucket, (tgu) it.next());
                }
                l020 C = k020Var.C();
                try {
                    C.D(hiddenPrivateChatsBucket);
                    C.s();
                    C.close();
                    vguVar.c();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        edit.remove((String) it2.next());
                    }
                    edit.putBoolean("local_hidden_private_chats_migration_done", true);
                    edit.apply();
                } finally {
                }
            }
        }
        this.L.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        boolean z;
        Object obj;
        zq60 zq60Var = this.T;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                obj = null;
                break;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                int i3 = i + 1;
                obj = arrayList.get(i);
                if (((i0x0) obj).b) {
                    break;
                } else {
                    i = i3;
                }
            }
        }
    }
}
