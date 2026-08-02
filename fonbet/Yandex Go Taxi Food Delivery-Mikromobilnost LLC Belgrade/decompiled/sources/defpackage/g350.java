package defpackage;

import android.app.Activity;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import com.yandex.go.payments.shared.business.accountcreation.d;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.Arrays;
import kotlin.Pair;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.bugreport.router.b;
import ru.yandex.taxi.cashback.router.real.typed.screen.TypedScreen;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.settings.main.NativeMenuState;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;
import ru.yandex.taxi.sharedpayments.c;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class g350 {
    public final ComponentActivity a;
    public final h15 b;
    public final h3y c;
    public final yvf0 d;
    public final h3y e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;
    public final yvf0 k;
    public final yvf0 l;
    public final yvf0 m;
    public final h3y n;
    public final h3y o;
    public final yvf0 p;
    public final jj3 q;
    public final yvf0 r;
    public final yvf0 s;
    public final gr6 t;
    public final yvf0 u;
    public final yvf0 v;
    public final w7u w;
    public final y50 x;
    public final oep0 y;
    public final o3h z;

    public g350(ComponentActivity componentActivity, h15 h15Var, h3y h3yVar, yvf0 yvf0Var, h3y h3yVar2, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, h3y h3yVar3, h3y h3yVar4, yvf0 yvf0Var10, jj3 jj3Var, yvf0 yvf0Var11, yvf0 yvf0Var12, yvf0 yvf0Var13, gr6 gr6Var, yvf0 yvf0Var14, yvf0 yvf0Var15, w7u w7uVar, y50 y50Var, oep0 oep0Var, o3h o3hVar) {
        this.a = componentActivity;
        this.b = h15Var;
        this.c = h3yVar;
        this.d = yvf0Var;
        this.e = h3yVar2;
        this.f = yvf0Var2;
        this.g = yvf0Var3;
        this.h = yvf0Var4;
        this.i = yvf0Var5;
        this.j = yvf0Var6;
        this.k = yvf0Var7;
        this.l = yvf0Var8;
        this.m = yvf0Var9;
        this.n = h3yVar3;
        this.o = h3yVar4;
        this.p = yvf0Var10;
        this.q = jj3Var;
        this.r = yvf0Var12;
        this.s = yvf0Var13;
        this.t = gr6Var;
        this.u = yvf0Var14;
        this.v = yvf0Var15;
        this.w = w7uVar;
        this.x = y50Var;
        this.y = oep0Var;
        this.z = o3hVar;
    }

    public final void a(String str) {
        dap dapVar = (dap) this.e.get();
        i6r i6rVar = (i6r) dapVar.a.get();
        w030 a = dapVar.b.a();
        i6rVar.getClass();
        a.getClass();
        tzf tzfVar = new tzf(i6rVar, 27);
        tzf tzfVar2 = new tzf(i6rVar, 16);
        tzf tzfVar3 = new tzf(i6rVar, 20);
        tzf tzfVar4 = new tzf(i6rVar, 15);
        tzf tzfVar5 = new tzf(i6rVar, 24);
        tzf tzfVar6 = new tzf(i6rVar, 22);
        wif wifVar = new wif((Object) tzfVar5, (xvf0) tzfVar6, 8);
        tzf tzfVar7 = new tzf(i6rVar, 25);
        tzf tzfVar8 = new tzf(i6rVar, 23);
        tzf tzfVar9 = new tzf(i6rVar, 19);
        n3w a2 = n3w.a(new lbp(new oo2(tzfVar3, tzfVar4, new ee(wifVar, tzfVar7, tzfVar8, tzfVar9, 25), new kxa0((v7p) new c8w(new tzf(i6rVar, 21), wifVar, tzfVar7, tzfVar8, new tzf(i6rVar, 26), tzfVar9), (xvf0) tzfVar6, (xvf0) new tzf(i6rVar, 17), (xvf0) tzfVar9, 4), tzfVar9)));
        xvf0 a3 = dhs0.a(new p9p(new tzf(i6rVar, 18), 2));
        gf41 gf41Var = new gf41(i5m.a(tzfVar));
        c0g c0gVar = (c0g) i6rVar;
        zzf zzfVar = c0gVar.z;
        fn21 fn21Var = (fn21) zzfVar.a0.get();
        q5z.h(fn21Var);
        g V1 = c0gVar.V1();
        q5z.h(V1);
        a aVar = (a) zzfVar.C3.get();
        q5z.h(aVar);
        c cVar = (c) c0gVar.A.a.J3.get();
        q5z.h(cVar);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        cda0 cda0Var = (cda0) zzfVar.j1.get();
        q5z.h(cda0Var);
        xbp xbpVar = (xbp) zzfVar.N9.get();
        q5z.h(xbpVar);
        o b = zzfVar.b();
        m2s m2sVar = (m2s) zzfVar.Cq.get();
        q5z.h(m2sVar);
        z9p m2 = c0gVar.m2();
        lbp lbpVar = (lbp) a2.a;
        j5z j5zVar = (j5z) zzfVar.f0.get();
        q5z.h(j5zVar);
        ((pep0) this.y).f(new com.yandex.go.payments.shared.family.web.c(gf41Var, fn21Var, V1, aVar, cVar, Z1, cda0Var, xbpVar, b, tzfVar2, m2sVar, m2, lbpVar, j5zVar, i5m.a(a3)), new cap(str), hxx.a);
    }

    public final void b(tis0 tis0Var) {
        if (((hes) this.n.get()).c()) {
            return;
        }
        ((k) this.o.get()).f.l(NativeMenuState.CLOSING);
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry = (MainMenuProcessor$MenuEntry) tis0Var.c;
        Object obj = tis0Var.w;
        int i = f350.a[mainMenuProcessor$MenuEntry.ordinal()];
        yvf0 yvf0Var = this.g;
        oep0 oep0Var = this.y;
        yvf0 yvf0Var2 = this.j;
        yvf0 yvf0Var3 = this.p;
        switch (i) {
            case 1:
                ((pep0) oep0Var).f((m950) this.s.get(), new hr21(UserPhotoUploadingEntryPoint.MENU, false, 4), hxx.a);
                break;
            case 2:
                this.q.c(new um3(Events$Zalogin$LoginContext.FAVORITES, new qzj0(null, new t130(27, this, tis0Var)), false, false, 28));
                break;
            case 3:
                if (obj != null) {
                    try {
                        throw new ClassCastException();
                    } catch (ClassCastException e) {
                        jst.e.x(e, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(i470.class).d()}, 1)));
                        return;
                    }
                }
                jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                break;
            case 4:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        umr0 umr0Var = (umr0) obj;
                        tmr0 tmr0Var = umr0Var.a;
                        SharedPaymentsOpenReason sharedPaymentsOpenReason = umr0Var.b;
                        y yVar = (y) yvf0Var3.get();
                        Uri uri = umr0Var.c;
                        yVar.g();
                        yVar.f(tmr0Var, sharedPaymentsOpenReason, new d82(1), uri);
                        break;
                    } catch (ClassCastException e2) {
                        jst.e.x(e2, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(umr0.class).d()}, 1)));
                        return;
                    }
                }
            case 5:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        umr0 umr0Var2 = (umr0) obj;
                        ((y) ((tnr0) ((d) this.f.get()).d.get())).k(umr0Var2.a, umr0Var2.b);
                        break;
                    } catch (ClassCastException e3) {
                        jst.e.x(e3, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(umr0.class).d()}, 1)));
                        return;
                    }
                }
            case 6:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        nmr0 nmr0Var = (nmr0) obj;
                        if (((v) this.c.get()).l()) {
                            ((y) yvf0Var3.get()).m(nmr0Var);
                        } else {
                            y yVar2 = (y) yvf0Var3.get();
                            yVar2.getClass();
                            yVar2.i(new at20(new il(null, nmr0Var.a, nmr0Var.b, nmr0Var.c), nmr0Var.d), SharedPaymentsOpenReason.MENU);
                        }
                        break;
                    } catch (ClassCastException e4) {
                        jst.e.x(e4, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(nmr0.class).d()}, 1)));
                        return;
                    }
                }
            case 7:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        mmr0 mmr0Var = (mmr0) obj;
                        y yVar3 = (y) yvf0Var3.get();
                        yVar3.getClass();
                        yVar3.c.a().d(new bl(mmr0Var.a, mmr0Var.b, new pgk0(28, yVar3)));
                        break;
                    } catch (ClassCastException e5) {
                        jst.e.x(e5, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(mmr0.class).d()}, 1)));
                        return;
                    }
                }
            case 8:
                this.b.a(this.a);
                break;
            case 9:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        ((s3d0) ((z300) yvf0Var2.get()).a.get()).a((qxx0) obj);
                        break;
                    } catch (ClassCastException e6) {
                        jst.e.x(e6, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(qxx0.class).d()}, 1)));
                        return;
                    }
                }
            case 10:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        z300 z300Var = (z300) yvf0Var2.get();
                        z300Var.getClass();
                        ((pep0) z300Var.c).f(new xx70(6, (oo11) z300Var.b.get(), new k200(1, z300Var)), new jo11(TypedScreen.PLUS_BURNS, (String) obj, null), hxx.a);
                        break;
                    } catch (ClassCastException e7) {
                        jst.e.x(e7, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(String.class).d()}, 1)));
                        return;
                    }
                }
            case 11:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        ((pep0) oep0Var).f((m950) this.u.get(), (itl0) obj, hxx.a);
                        break;
                    } catch (ClassCastException e8) {
                        jst.e.x(e8, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(itl0.class).d()}, 1)));
                        return;
                    }
                }
            case 12:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        ((ft41) ((dt41) this.k.get())).Q((UiWebViewConfig) obj);
                        break;
                    } catch (ClassCastException e9) {
                        jst.e.x(e9, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(UiWebViewConfig.class).d()}, 1)));
                        return;
                    }
                }
            case 13:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        ((pep0) oep0Var).f((m950) this.d.get(), new j000((MultiTransportChooseStationCardAnalytics$OpenReasonV2) obj), hxx.a);
                        break;
                    } catch (ClassCastException e10) {
                        jst.e.x(e10, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(MultiTransportChooseStationCardAnalytics$OpenReasonV2.class).d()}, 1)));
                        return;
                    }
                }
            case 14:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        a((String) obj);
                        break;
                    } catch (ClassCastException e11) {
                        jst.e.x(e11, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(String.class).d()}, 1)));
                        return;
                    }
                }
            case 15:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        aff0 aff0Var = (aff0) obj;
                        ((pep0) oep0Var).f((m950) this.l.get(), new ym10(aff0Var.a, aff0Var.b, false), hxx.a);
                        break;
                    } catch (ClassCastException e12) {
                        jst.e.x(e12, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(aff0.class).d()}, 1)));
                        return;
                    }
                }
            case 16:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        Pair pair = (Pair) obj;
                        ((pep0) oep0Var).f((y4c0) this.w.get(), new h600((UiWebViewConfig) pair.getFirst(), (siw0) pair.getSecond()), hxx.a);
                        break;
                    } catch (ClassCastException e13) {
                        jst.e.x(e13, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(Pair.class).d()}, 1)));
                        return;
                    }
                }
            case 17:
                ((pep0) oep0Var).f((m950) yvf0Var.get(), new qrf0(new mrf0(obj instanceof Uri ? (Uri) obj : null, (v770) null, 6)), hxx.a);
                break;
            case 18:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        ((pep0) oep0Var).f((m950) yvf0Var.get(), new qrf0(new nrf0(2, ((kni0) obj).a)), hxx.a);
                        break;
                    } catch (ClassCastException e14) {
                        jst.e.x(e14, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(kni0.class).d()}, 1)));
                        return;
                    }
                }
            case 19:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        Pair pair2 = (Pair) obj;
                        ((pep0) oep0Var).f((m950) this.i.get(), new la0((xqw) pair2.getFirst(), (v770) pair2.getSecond(), null), hxx.a);
                        break;
                    } catch (ClassCastException e15) {
                        jst.e.x(e15, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(Pair.class).d()}, 1)));
                        return;
                    }
                }
            case 20:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        ((pep0) oep0Var).f((m950) this.h.get(), (rm10) obj, hxx.a);
                        break;
                    } catch (ClassCastException e16) {
                        jst.e.x(e16, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(rm10.class).d()}, 1)));
                        return;
                    }
                }
            case 21:
                c(idr0.a);
                break;
            case 22:
                c(new ldr0("menu"));
                break;
            case 23:
                c(jdr0.a);
                break;
            case 24:
                if (obj == null) {
                    jst.e.x(new NullPointerException("attachment is null"), "attachment must not be null");
                    break;
                } else {
                    try {
                        c(new kdr0((PushSettingsOpenReason) obj));
                        break;
                    } catch (ClassCastException e17) {
                        jst.e.x(e17, String.format("wrong class for attachment, must be %s", Arrays.copyOf(new Object[]{qoi0.a(PushSettingsOpenReason.class).d()}, 1)));
                        return;
                    }
                }
            case 25:
                gr6 gr6Var = this.t;
                i6r i6rVar = (i6r) gr6Var.a.get();
                Activity activity = gr6Var.c;
                w030 a = gr6Var.b.a();
                i6rVar.getClass();
                activity.getClass();
                a.getClass();
                hwf hwfVar = new hwf(i6rVar, 13);
                hwf hwfVar2 = new hwf(i6rVar, 12);
                c0g c0gVar = (c0g) i6rVar;
                jj3 jj3Var = (jj3) c0gVar.T7.get();
                q5z.h(jj3Var);
                zzf zzfVar = c0gVar.z;
                a aVar = (a) zzfVar.C3.get();
                q5z.h(aVar);
                gf41 gf41Var = new gf41(i5m.a(hwfVar));
                o b = zzfVar.b();
                rqo l2 = c0gVar.l2();
                q5z.h(l2);
                oep0.b(oep0Var, new b(jj3Var, aVar, gf41Var, b, new pr6(l2, 0), hwfVar2));
                break;
            case 26:
                ((pep0) oep0Var).f((m950) this.m.get(), bff.a, hxx.a);
                break;
            case 27:
                ((pux0) this.z).getClass();
                ((a60) this.x).c(b64.j(pux0.c, "://information"), v770.p);
                break;
            case 28:
                d(null);
                break;
            default:
                w511.b();
                break;
        }
    }

    public final void c(mdr0 mdr0Var) {
        ((pep0) this.y).f((m950) this.r.get(), mdr0Var, hxx.a);
    }

    public final void d(sls slsVar) {
        ((k) this.o.get()).f.l(NativeMenuState.CLOSING);
        this.q.c(new um3(Events$Zalogin$LoginContext.MENU, new qzj0(null, new e350(0, slsVar)), false, false, 28));
    }
}
