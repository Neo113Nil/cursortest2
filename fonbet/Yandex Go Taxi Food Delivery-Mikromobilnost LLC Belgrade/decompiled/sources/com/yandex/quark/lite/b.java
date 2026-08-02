package com.yandex.quark.lite;

import com.yandex.quark.utils.Disposable;
import defpackage.a6h;
import defpackage.ate0;
import defpackage.b64;
import defpackage.bhg0;
import defpackage.cbg0;
import defpackage.ct1;
import defpackage.ds1;
import defpackage.dt1;
import defpackage.e8h;
import defpackage.evu0;
import defpackage.feh;
import defpackage.gj41;
import defpackage.gp50;
import defpackage.ike;
import defpackage.ilu;
import defpackage.jhg0;
import defpackage.jyj0;
import defpackage.k6h;
import defpackage.khg0;
import defpackage.lyj0;
import defpackage.ms1;
import defpackage.nig0;
import defpackage.nm3;
import defpackage.nre;
import defpackage.o6h;
import defpackage.olw0;
import defpackage.ope;
import defpackage.p530;
import defpackage.pa41;
import defpackage.phg0;
import defpackage.q5z;
import defpackage.qhg0;
import defpackage.rig0;
import defpackage.roc;
import defpackage.rpe;
import defpackage.sya0;
import defpackage.syj0;
import defpackage.thg0;
import defpackage.tqe;
import defpackage.tse;
import defpackage.u5h;
import defpackage.uqe;
import defpackage.v2n;
import defpackage.vjd;
import defpackage.vx;
import defpackage.w5h;
import defpackage.x8o;
import defpackage.xa20;
import defpackage.xch;
import defpackage.xl60;
import defpackage.y3h;
import defpackage.y5e;
import defpackage.y5h;
import defpackage.yei0;
import defpackage.zoc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import kotlin.NoWhenBranchMatchedException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class b {
    private static final qhg0 Companion = new qhg0();
    public final bhg0 a;
    public final tse b;
    public final x8o c;
    public final xa20 d;
    public final roc e;
    public QuarkImpl$State f = QuarkImpl$State.INITIAL;
    public final ArrayList g = new ArrayList();
    public final com.yandex.quark.lite.js.a h;
    public final com.yandex.quark.core.common.internal.consumer.a i;
    public final gp50 j;
    public final com.yandex.quark.core.common.internal.supportedfeatures.b k;
    public ms1 l;
    public feh m;

    public b(bhg0 bhg0Var, ike ikeVar, x8o x8oVar, xa20 xa20Var, ilu iluVar, vx vxVar, y3h y3hVar, sya0 sya0Var, gj41 gj41Var, k6h k6hVar, y5h y5hVar, o6h o6hVar, a6h a6hVar, w5h w5hVar, xl60 xl60Var, xch xchVar, roc rocVar, ate0 ate0Var) {
        this.a = bhg0Var;
        this.b = ikeVar;
        this.c = x8oVar;
        this.d = xa20Var;
        this.e = rocVar;
        this.h = new com.yandex.quark.lite.js.a(ikeVar, xa20Var);
        e8h e8hVar = new e8h();
        ds1 ds1Var = bhg0Var.f;
        String str = ds1Var.a;
        String str2 = bhg0Var.d;
        String str3 = bhg0Var.e;
        String str4 = ds1Var.c;
        str4 = evu0.J(str4) ? null : str4;
        com.yandex.quark.core.common.internal.consumer.a aVar = new com.yandex.quark.core.common.internal.consumer.a(new zoc(str, str2, str3, str4 != null ? new ct1(str4) : dt1.a, bhg0Var.c, bhg0Var.b), new pa41(), this, x8oVar, xa20Var, iluVar, xchVar, sya0Var, gj41Var, vxVar, y3hVar, k6hVar, y5hVar, o6hVar, a6hVar, new u5h(), w5hVar, xl60Var, new phg0());
        e8hVar.a = aVar;
        aVar.d(new v2n());
        aVar.n(e8hVar);
        aVar.j(e8hVar);
        this.i = aVar;
        this.j = new gp50(12, aVar);
        this.k = new com.yandex.quark.core.common.internal.supportedfeatures.b(new com.yandex.quark.lite.supportedfeatures.a(aVar, ikeVar), ikeVar);
    }

    public final synchronized void a(rig0 rig0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        try {
            this.e.a.add(rig0Var);
            rig0Var.init();
            if (this.f.compareTo(QuarkImpl$State.PREPARED) >= 0) {
                syj0 syj0Var = (syj0) rig0Var.b(this).get();
                jyj0 jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
                if (jyj0Var != null && (obj3 = jyj0Var.a) != null) {
                    this.c.c("QuarkImpl", "Failed to prepare module " + rig0Var.getClass().getName() + Extension.COLON_SPACE + ((p530) obj3).a());
                }
            }
            if (this.f.compareTo(QuarkImpl$State.STARTED) >= 0) {
                syj0 syj0Var2 = (syj0) rig0Var.a(this).get();
                lyj0 lyj0Var = syj0Var2 instanceof lyj0 ? (lyj0) syj0Var2 : null;
                if (lyj0Var != null && (obj2 = lyj0Var.a) != null) {
                    this.d.b(new rpe(rig0Var.getName(), 0));
                }
                jyj0 jyj0Var2 = syj0Var2 instanceof jyj0 ? (jyj0) syj0Var2 : null;
                if (jyj0Var2 != null && (obj = jyj0Var2.a) != null) {
                    this.c.c("QuarkImpl", "Failed to start module " + rig0Var.getClass().getName() + Extension.COLON_SPACE + ((p530) obj).a());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final nig0 b() {
        com.yandex.quark.core.common.internal.consumer.a aVar = this.i;
        xa20 xa20Var = this.d;
        nm3 nm3Var = new nm3(aVar, xa20Var);
        com.yandex.quark.lite.js.a aVar2 = this.h;
        ms1 ms1Var = new ms1(aVar2, xa20Var);
        this.l = ms1Var;
        aVar.t(ms1Var);
        feh fehVar = new feh(aVar2, this.c, xa20Var);
        this.m = fehVar;
        return new nig0(ms1Var, nm3Var, fehVar, xa20Var);
    }

    public final synchronized CompletableFuture c() {
        Object obj;
        QuarkImpl$State quarkImpl$State = this.f;
        QuarkImpl$State quarkImpl$State2 = QuarkImpl$State.PREPARED;
        if (quarkImpl$State.compareTo(quarkImpl$State2) >= 0) {
            return CompletableFuture.completedFuture(y5e.u(yei0.z, ""));
        }
        syj0 d = d();
        jyj0 jyj0Var = d instanceof jyj0 ? (jyj0) d : null;
        if (jyj0Var != null && (obj = jyj0Var.a) != null) {
            return CompletableFuture.completedFuture(new jyj0((jhg0) obj));
        }
        this.f = quarkImpl$State2;
        return CompletableFuture.completedFuture(q5z.N());
    }

    public final syj0 d() {
        Object obj;
        Iterator it = this.e.b.iterator();
        while (it.hasNext()) {
            rig0 rig0Var = (rig0) it.next();
            syj0 syj0Var = (syj0) rig0Var.b(this).get();
            jyj0 jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
            if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                return y5e.u(yei0.a, "Failed to prepare module " + rig0Var.getClass().getName() + Extension.COLON_SPACE + ((p530) obj).a());
            }
        }
        return q5z.N();
    }

    public final syj0 e(khg0 khg0Var) {
        syj0 lyj0Var;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String name = khg0Var.getClass().getName();
        String concat = "Attempt to register feature ".concat(name);
        x8o x8oVar = this.c;
        x8oVar.c("QuarkImpl", concat);
        vjd vjdVar = new vjd();
        syj0 p = this.i.p(khg0Var);
        lyj0 lyj0Var2 = p instanceof lyj0 ? (lyj0) p : null;
        if (lyj0Var2 != null && (obj4 = lyj0Var2.a) != null) {
            vjdVar.a((Disposable) obj4);
        }
        jyj0 jyj0Var = p instanceof jyj0 ? (jyj0) p : null;
        if (jyj0Var == null || (obj3 = jyj0Var.a) == null) {
            if (khg0Var instanceof thg0) {
                ((thg0) khg0Var).f(this.h);
            }
            if (khg0Var instanceof olw0) {
                vjdVar.a(this.k.a((olw0) khg0Var));
            }
            lyj0Var = new lyj0(vjdVar);
        } else {
            lyj0Var = new jyj0((jhg0) obj3);
        }
        jyj0 jyj0Var2 = lyj0Var instanceof jyj0 ? (jyj0) lyj0Var : null;
        if (jyj0Var2 != null && (obj2 = jyj0Var2.a) != null) {
            x8oVar.c("QuarkImpl", b64.l("Failed to register feature ", name, Extension.COLON_SPACE, ((jhg0) obj2).b));
        }
        lyj0 lyj0Var3 = lyj0Var instanceof lyj0 ? (lyj0) lyj0Var : null;
        if (lyj0Var3 != null && (obj = lyj0Var3.a) != null) {
            x8oVar.c("QuarkImpl", "Success to register feature ".concat(name));
        }
        return lyj0Var;
    }

    public final synchronized CompletableFuture f() {
        Object obj;
        CompletableFuture completedFuture;
        Iterator it;
        Object obj2;
        int i = a.a[this.f.ordinal()];
        if (i == 1) {
            syj0 syj0Var = (syj0) c().get();
            jyj0 jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
            if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                return CompletableFuture.completedFuture(new jyj0((jhg0) obj));
            }
        } else if (i != 2) {
            if (i == 3) {
                return CompletableFuture.completedFuture(y5e.u(yei0.A, ""));
            }
            throw new NoWhenBranchMatchedException();
        }
        try {
            this.d.b(new rpe(this.a.d, 1));
            this.d.c("quasar_platform", this.a.d);
            this.d.c("quark_version", "1.160.0-lite");
            if (this.a.c.b) {
                this.d.b(nre.d);
            }
            it = this.g.iterator();
        } catch (Exception e) {
            this.c.a("QuarkImpl", "Failed to start quark", e);
            xa20 xa20Var = this.d;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            xa20Var.a(new tqe(message), e);
            yei0 yei0Var = yei0.w;
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            completedFuture = CompletableFuture.completedFuture(y5e.u(yei0Var, message2));
        }
        if (it.hasNext()) {
            if (it.next() == null) {
                throw null;
            }
            throw new ClassCastException();
        }
        ((com.yandex.quark.core.common.internal.consumer.a) this.j.b).m(this.a.j);
        syj0 g = g();
        jyj0 jyj0Var2 = g instanceof jyj0 ? (jyj0) g : null;
        if (jyj0Var2 != null && (obj2 = jyj0Var2.a) != null) {
            jhg0 jhg0Var = (jhg0) obj2;
            this.d.e(new tqe(jhg0Var.b));
            return CompletableFuture.completedFuture(new jyj0(jhg0Var));
        }
        this.f = QuarkImpl$State.STARTED;
        nig0 b = b();
        this.d.b(uqe.d);
        completedFuture = CompletableFuture.completedFuture(new lyj0(b));
        return completedFuture;
    }

    public final syj0 g() {
        Object obj;
        Object obj2;
        Iterator it = this.e.b.iterator();
        while (it.hasNext()) {
            rig0 rig0Var = (rig0) it.next();
            syj0 syj0Var = (syj0) rig0Var.a(this).get();
            lyj0 lyj0Var = syj0Var instanceof lyj0 ? (lyj0) syj0Var : null;
            if (lyj0Var != null && (obj2 = lyj0Var.a) != null) {
                this.d.b(new rpe(rig0Var.getName(), 0));
            }
            jyj0 jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
            if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                return y5e.u(yei0.c, "Failed to start module " + rig0Var.getClass().getName() + Extension.COLON_SPACE + ((p530) obj).a());
            }
        }
        return q5z.N();
    }

    public final synchronized void h() {
        Iterator it;
        Object obj;
        try {
            if (this.f.compareTo(QuarkImpl$State.STARTED) < 0) {
                CompletableFuture.completedFuture(y5e.u(yei0.B, ""));
                return;
            }
            try {
                it = this.g.iterator();
            } catch (Exception e) {
                this.c.a("QuarkImpl", "Failed to stop quark", e);
                yei0 yei0Var = yei0.x;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                CompletableFuture.completedFuture(y5e.u(yei0Var, message));
                this.d.b(ope.d);
            }
            if (it.hasNext()) {
                b64.D(it.next());
                throw null;
            }
            kotlinx.coroutines.a.g(this.b.getCoroutineContext(), null);
            ms1 ms1Var = this.l;
            if (ms1Var != null) {
                ms1Var.dispose();
            }
            this.l = null;
            feh fehVar = this.m;
            if (fehVar != null) {
                fehVar.dispose();
            }
            this.m = null;
            this.i.a();
            syj0 i = i();
            jyj0 jyj0Var = i instanceof jyj0 ? (jyj0) i : null;
            if (jyj0Var == null || (obj = jyj0Var.a) == null) {
                CompletableFuture.completedFuture(q5z.N());
                this.d.b(ope.d);
                this.f = QuarkImpl$State.PREPARED;
            } else {
                CompletableFuture.completedFuture(new jyj0((jhg0) obj));
                this.d.b(ope.d);
                this.f = QuarkImpl$State.PREPARED;
            }
        } catch (Throwable th) {
            this.d.b(ope.d);
            this.f = QuarkImpl$State.PREPARED;
            throw th;
        }
    }

    public final syj0 i() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.b.iterator();
        while (it.hasNext()) {
            syj0 syj0Var = (syj0) ((rig0) it.next()).stop().get();
            jyj0 jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
            if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                arrayList.add((p530) obj);
            }
        }
        return arrayList.isEmpty() ? q5z.N() : y5e.u(yei0.x, "Failed to stop modules: ".concat(kotlin.collections.a.X(arrayList, null, null, null, new cbg0(16), 31)));
    }
}
