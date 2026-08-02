package androidx.compose.foundation.text.selection;

import android.content.ClipDescription;
import androidx.compose.foundation.text.HandleState;
import defpackage.amb1;
import defpackage.aoy0;
import defpackage.asy0;
import defpackage.ay11;
import defpackage.bkq0;
import defpackage.boy0;
import defpackage.bwc0;
import defpackage.c3c;
import defpackage.c530;
import defpackage.ckq0;
import defpackage.dfq0;
import defpackage.dis0;
import defpackage.dkq0;
import defpackage.dry0;
import defpackage.eja1;
import defpackage.ery0;
import defpackage.f530;
import defpackage.gy31;
import defpackage.hoy0;
import defpackage.i2t0;
import defpackage.iv60;
import defpackage.iz21;
import defpackage.jl40;
import defpackage.kk2;
import defpackage.lvc0;
import defpackage.mtw;
import defpackage.ny61;
import defpackage.oay;
import defpackage.oly0;
import defpackage.oz40;
import defpackage.p4a1;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.v3a1;
import defpackage.w6u;
import defpackage.w72;
import defpackage.wnb1;
import defpackage.wu60;
import defpackage.y8b1;
import defpackage.yur;
import defpackage.z6u;
import defpackage.zoy0;
import defpackage.zqe;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class j {
    public final aoy0 A;
    public boolean B;
    public final ay11 a;
    public iv60 b;
    public tls c;
    public oay d;
    public final oz40 e;
    public gy31 f;
    public sls g;
    public c3c h;
    public tse i;
    public bwc0 j;
    public w6u k;
    public yur l;
    public final oz40 m;
    public final oz40 n;
    public long o;
    public asy0 p;
    public long q;
    public final oz40 r;
    public final oz40 s;
    public int t;
    public hoy0 u;
    public dis0 v;
    public asy0 w;
    public final oz40 x;
    public final androidx.compose.foundation.text.contextmenu.modifier.c y;
    public final boy0 z;

    public j(ay11 ay11Var) {
        this.a = ay11Var;
        this.b = iz21.a;
        this.c = new mtw(23);
        this.e = androidx.compose.runtime.f.j(new hoy0((String) null, 0L, 7));
        this.f = zoy0.w;
        Boolean bool = Boolean.TRUE;
        this.m = androidx.compose.runtime.f.j(bool);
        this.n = androidx.compose.runtime.f.j(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = androidx.compose.runtime.f.j(null);
        this.s = androidx.compose.runtime.f.j(null);
        this.t = -1;
        this.u = new hoy0((String) null, 0L, 7);
        this.x = androidx.compose.runtime.f.j(Boolean.FALSE);
        this.y = new androidx.compose.foundation.text.contextmenu.modifier.c();
        this.z = new boy0(this);
        this.A = new aoy0(this);
    }

    public static final Pair a(j jVar) {
        String str;
        asy0 asy0Var;
        kk2 n = jVar.n();
        if (n == null || (str = n.b) == null || (asy0Var = jVar.w) == null) {
            return null;
        }
        long j = asy0Var.a;
        return new Pair(str, new asy0(eja1.c(jVar.b.r((int) (j >> 32)), jVar.b.r((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))));
    }

    public static final void b(j jVar, asy0 asy0Var) {
        kk2 n;
        String str;
        tse tseVar;
        if (asy0Var == null) {
            return;
        }
        long j = asy0Var.a;
        bwc0 bwc0Var = jVar.j;
        if (bwc0Var == null || (n = jVar.n()) == null || (str = n.b) == null) {
            return;
        }
        iv60 iv60Var = jVar.b;
        long c = eja1.c(iv60Var.r((int) (j >> 32)), iv60Var.r((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        if (str.length() <= 0 || asy0.c(c) || (tseVar = jVar.i) == null) {
            return;
        }
        tje.N(tseVar, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(bwc0Var, str, c, asy0Var, jVar, iv60Var, null), 3);
    }

    public static final long c(j jVar, hoy0 hoy0Var, long j, boolean z, boolean z2, dkq0 dkq0Var, boolean z3, z6u z6uVar) {
        ery0 d;
        long j2;
        long j3;
        ckq0 ckq0Var;
        boolean z4;
        boolean z5;
        w6u w6uVar;
        int i;
        oay oayVar = jVar.d;
        if (oayVar == null || (d = oayVar.d()) == null) {
            return asy0.b;
        }
        iv60 iv60Var = jVar.b;
        long j4 = hoy0Var.b;
        kk2 kk2Var = hoy0Var.a;
        int i2 = asy0.c;
        long c = eja1.c(iv60Var.r((int) (j4 >> 32)), jVar.b.r((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        int b = d.b(j, false);
        int i3 = (z2 || z) ? b : (int) (c >> 32);
        int i4 = (!z2 || z) ? b : (int) (c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        dis0 dis0Var = jVar.v;
        int i5 = (z || dis0Var == null || (i = jVar.t) == -1) ? -1 : i;
        dry0 dry0Var = d.a;
        if (z) {
            j3 = j4;
            j2 = 4294967295L;
            ckq0Var = null;
        } else {
            j2 = 4294967295L;
            int i6 = (int) (c >> 32);
            j3 = j4;
            bkq0 bkq0Var = new bkq0(y8b1.d(dry0Var, i6), i6, 1L);
            int i7 = (int) (c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            ckq0Var = new ckq0(bkq0Var, new bkq0(y8b1.d(dry0Var, i7), i7, 1L), asy0.g(c));
        }
        dis0 dis0Var2 = new dis0(z2, 1, 1, ckq0Var, new dfq0(1L, 1, i3, i4, i5, dry0Var));
        if (!dis0Var2.h(dis0Var)) {
            return j3;
        }
        jVar.v = dis0Var2;
        jVar.t = b;
        ckq0 a = dkq0Var.a(dis0Var2);
        long c2 = eja1.c(jVar.b.j(a.a.b), jVar.b.j(a.b.b));
        long j5 = j3;
        if (asy0.b(c2, j5)) {
            return j5;
        }
        boolean z6 = asy0.g(c2) != asy0.g(j5) && asy0.b(eja1.c((int) (c2 & j2), (int) (c2 >> 32)), j5);
        boolean z7 = asy0.c(c2) && asy0.c(j5);
        if (z3 && kk2Var.b.length() > 0 && !z6 && !z7 && z6uVar != null && (w6uVar = jVar.k) != null) {
            ((lvc0) w6uVar).a(z6uVar.a);
        }
        jVar.c.invoke(e(kk2Var, c2));
        jVar.w = new asy0(c2);
        if (!z3) {
            jVar.u(!asy0.c(c2));
        }
        oay oayVar2 = jVar.d;
        if (oayVar2 != null) {
            oayVar2.q.setValue(Boolean.valueOf(z3));
        }
        oay oayVar3 = jVar.d;
        if (oayVar3 != null) {
            oayVar3.m.setValue(Boolean.valueOf(!asy0.c(c2) && amb1.f(jVar, true)));
        }
        oay oayVar4 = jVar.d;
        if (oayVar4 != null) {
            if (asy0.c(c2)) {
                z4 = false;
            } else {
                z4 = false;
                if (amb1.f(jVar, false)) {
                    z5 = true;
                    oayVar4.n.setValue(Boolean.valueOf(z5));
                }
            }
            z5 = z4;
            oayVar4.n.setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        oay oayVar5 = jVar.d;
        if (oayVar5 != null) {
            oayVar5.o.setValue(Boolean.valueOf((asy0.c(c2) && amb1.f(jVar, true)) ? true : z4));
        }
        return c2;
    }

    public static hoy0 e(kk2 kk2Var, long j) {
        return new hoy0(kk2Var, j, (asy0) null);
    }

    public final pzt0 d(boolean z) {
        tse tseVar = this.i;
        if (tseVar != null) {
            return tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, z, null), 1);
        }
        return null;
    }

    public final void f() {
        tse tseVar = this.i;
        if (tseVar != null) {
            tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
    }

    public final void g(wu60 wu60Var) {
        if (!asy0.c(o().b)) {
            oay oayVar = this.d;
            ery0 d = oayVar != null ? oayVar.d() : null;
            int e = (wu60Var == null || d == null) ? asy0.e(o().b) : this.b.j(d.b(wu60Var.a, true));
            hoy0 a = hoy0.a(o(), null, eja1.c(e, e), 5);
            this.c.invoke(a);
            this.w = new asy0(a.b);
        }
        r((wu60Var == null || o().a.b.length() <= 0) ? HandleState.None : HandleState.Cursor);
        u(false);
    }

    public final void h(boolean z) {
        yur yurVar;
        oay oayVar = this.d;
        if (oayVar != null && !oayVar.b() && (yurVar = this.l) != null) {
            yur.b(yurVar);
        }
        this.u = o();
        u(z);
        r(HandleState.Selection);
    }

    public final f530 i() {
        if (!l()) {
            return c530.a;
        }
        return p4a1.d(v3a1.d(new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.y, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new zqe(this, 2));
    }

    public final wu60 j() {
        return (wu60) this.s.getValue();
    }

    public final boolean k() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean l() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long m(boolean z) {
        ery0 d;
        dry0 dry0Var;
        kk2 n;
        long j;
        oay oayVar = this.d;
        if (oayVar == null || (d = oayVar.d()) == null || (dry0Var = d.a) == null || (n = n()) == null) {
            return 9205357640488583168L;
        }
        if (!jl40.l(n.b, dry0Var.a.a.b)) {
            return 9205357640488583168L;
        }
        hoy0 o = o();
        if (z) {
            long j2 = o.b;
            int i = asy0.c;
            j = j2 >> 32;
        } else {
            long j3 = o.b;
            int i2 = asy0.c;
            j = j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        }
        return wnb1.c(dry0Var, this.b.r((int) j), z, asy0.g(o().b));
    }

    public final kk2 n() {
        oay oayVar = this.d;
        if (oayVar != null) {
            return oayVar.a.a;
        }
        return null;
    }

    public final hoy0 o() {
        return (hoy0) this.e.getValue();
    }

    public final void p() {
        pzt0 pzt0Var;
        oly0 oly0Var = this.y.a;
        if (oly0Var == null || (pzt0Var = oly0Var.z) == null) {
            return;
        }
        pzt0Var.a(null);
        oly0Var.z = null;
    }

    public final void q() {
        tse tseVar = this.i;
        if (tseVar != null) {
            tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
    }

    public final void r(HandleState handleState) {
        oay oayVar = this.d;
        if (oayVar != null) {
            if (oayVar.a() == handleState) {
                oayVar = null;
            }
            if (oayVar != null) {
                oayVar.k.setValue(handleState);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (((java.lang.Boolean) r3.q.getValue()).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            if (l()) {
                oay oayVar = this.d;
                if (oayVar != null) {
                }
                tje.W(D, O, e);
                this.y.a();
            }
        } finally {
            tje.W(D, O, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ContinuationImpl continuationImpl) {
        TextFieldSelectionManager$updateClipboardEntry$1 textFieldSelectionManager$updateClipboardEntry$1;
        int i;
        if (continuationImpl instanceof TextFieldSelectionManager$updateClipboardEntry$1) {
            textFieldSelectionManager$updateClipboardEntry$1 = (TextFieldSelectionManager$updateClipboardEntry$1) continuationImpl;
            int i2 = textFieldSelectionManager$updateClipboardEntry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionManager$updateClipboardEntry$1.label = i2 - Integer.MIN_VALUE;
                Object obj = textFieldSelectionManager$updateClipboardEntry$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textFieldSelectionManager$updateClipboardEntry$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c3c c3cVar = this.h;
                    if (c3cVar != null) {
                        textFieldSelectionManager$updateClipboardEntry$1.L$0 = this;
                        textFieldSelectionManager$updateClipboardEntry$1.label = 1;
                        ClipDescription primaryClipDescription = ((w72) c3cVar).a.a().getPrimaryClipDescription();
                        obj = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (j) textFieldSelectionManager$updateClipboardEntry$1.L$0;
                kotlin.b.b(obj);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.x.setValue(bool);
                return zy11.a;
            }
        }
        textFieldSelectionManager$updateClipboardEntry$1 = new TextFieldSelectionManager$updateClipboardEntry$1(this, continuationImpl);
        Object obj3 = textFieldSelectionManager$updateClipboardEntry$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textFieldSelectionManager$updateClipboardEntry$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        this.x.setValue(bool2);
        return zy11.a;
    }

    public final void u(boolean z) {
        oay oayVar = this.d;
        if (oayVar != null) {
            oayVar.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            p();
        }
    }

    public j() {
        this(null);
    }
}
