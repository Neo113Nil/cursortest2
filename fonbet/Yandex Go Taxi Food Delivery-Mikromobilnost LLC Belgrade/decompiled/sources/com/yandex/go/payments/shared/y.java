package com.yandex.go.payments.shared;

import android.app.Activity;
import android.net.Uri;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import defpackage.a90;
import defpackage.ai10;
import defpackage.at20;
import defpackage.bc;
import defpackage.cda0;
import defpackage.cor0;
import defpackage.d82;
import defpackage.d90;
import defpackage.dpr0;
import defpackage.fga0;
import defpackage.h3y;
import defpackage.hwo0;
import defpackage.il;
import defpackage.iw6;
import defpackage.j3j0;
import defpackage.jor0;
import defpackage.kyh0;
import defpackage.lxo0;
import defpackage.m2v;
import defpackage.nk;
import defpackage.nmr0;
import defpackage.op70;
import defpackage.pzt0;
import defpackage.q3f;
import defpackage.qor0;
import defpackage.r3k0;
import defpackage.rmr0;
import defpackage.sn8;
import defpackage.sor0;
import defpackage.sw6;
import defpackage.tmr0;
import defpackage.tnr0;
import defpackage.tor0;
import defpackage.u500;
import defpackage.uor0;
import defpackage.vor0;
import defpackage.w511;
import defpackage.wl;
import defpackage.wor0;
import defpackage.ynr0;
import defpackage.yu31;
import defpackage.yue;
import defpackage.yvf0;
import defpackage.zor0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class y implements tnr0 {
    public final Activity a;
    public final u500 b;
    public final dpr0 c;
    public final fga0 d;
    public final cda0 e;
    public final h3y f;
    public final yvf0 g;
    public final v h;
    public final a i;
    public final yvf0 j;
    public final yvf0 k;
    public final sw6 l;
    public final d90 m;
    public final f n;
    public final zor0 o;
    public final g p;
    public pzt0 q;

    public y(Activity activity, u500 u500Var, dpr0 dpr0Var, fga0 fga0Var, cda0 cda0Var, h3y h3yVar, yvf0 yvf0Var, v vVar, a aVar, yvf0 yvf0Var2, yvf0 yvf0Var3, sw6 sw6Var, d90 d90Var, f fVar, zor0 zor0Var, g gVar) {
        this.a = activity;
        this.b = u500Var;
        this.c = dpr0Var;
        this.d = fga0Var;
        this.e = cda0Var;
        this.f = h3yVar;
        this.g = yvf0Var;
        this.h = vVar;
        this.i = aVar;
        this.j = yvf0Var2;
        this.k = yvf0Var3;
        this.l = sw6Var;
        this.m = d90Var;
        this.n = fVar;
        this.o = zor0Var;
        this.p = gVar;
    }

    public static final void a(y yVar, List list) {
        ru.yandex.taxi.transition.c cVar = yVar.c.a().c;
        yu31 yu31Var = cVar.k;
        yu31Var.a.c(yu31Var.b);
        ru.yandex.taxi.transition.b bVar = cVar.e;
        if (bVar != null) {
            bVar.M1(new AttachableViewHolder.b(5, null));
            cVar.e = null;
        }
        u500 u500Var = yVar.b;
        m2v m2vVar = new m2v(yVar.m.a(), (String) null);
        m2vVar.b = new r3k0(9, yVar, list);
        a90 a90Var = new a90(m2vVar);
        u500Var.getClass();
        u500Var.d(MainMenuProcessor$MenuEntry.ADD_CARD, new Pair(a90Var, null));
    }

    public static final void b(y yVar, il ilVar, MemberListMode memberListMode, ynr0 ynr0Var) {
        dpr0 dpr0Var = yVar.c;
        ai10 ai10Var = new ai10(memberListMode, new hwo0(memberListMode, yVar, ilVar, ynr0Var, 10), ynr0Var.g, ynr0Var.h, ilVar);
        int i = sor0.a[memberListMode.ordinal()];
        if (i == 1) {
            dpr0Var.a().d(ai10Var);
        } else if (i == 2 || i == 3 || i == 4) {
            dpr0Var.a().c(ai10Var);
        } else {
            w511.b();
        }
    }

    public final void c() {
        dpr0 dpr0Var = this.c;
        if (dpr0Var.c == null) {
            return;
        }
        dpr0Var.a().c.a(null);
        dpr0Var.c = null;
    }

    public final void d() {
        dpr0 dpr0Var = this.c;
        if (dpr0Var.a().c.c.size() > 1) {
            dpr0Var.a().a();
        } else {
            c();
        }
    }

    public final void e(tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, op70 op70Var) {
        a aVar = this.i;
        aVar.getClass();
        if (tmr0Var.a() == SharedAccountType.BUSINESS) {
            aVar.a.e(sharedPaymentsOpenReason, false);
        }
        f(tmr0Var, sharedPaymentsOpenReason, op70Var, null);
    }

    public final void f(tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable, Uri uri) {
        if (tmr0Var.a() == SharedAccountType.BUSINESS) {
            ((com.yandex.go.payments.shared.business.accountcreation.d) this.k.get()).c(tmr0Var, sharedPaymentsOpenReason, runnable, uri);
            return;
        }
        pzt0 pzt0Var = this.q;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.q = g.a(this.p, new SharedPaymentsController$openAccount$2(this, tmr0Var, sharedPaymentsOpenReason, null));
    }

    public final void g() {
        fga0 fga0Var = this.d;
        if (((Boolean) fga0Var.D.getValue()).booleanValue()) {
            return;
        }
        r0 r0Var = fga0Var.D;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        fga0Var.a.u(fga0Var.w, true);
    }

    public final void h() {
        ru.yandex.taxi.transition.b bVar = this.c.a().c.e;
        if (bVar != null) {
            bVar.requestFocus();
        }
    }

    public final void i(at20 at20Var, SharedPaymentsOpenReason sharedPaymentsOpenReason) {
        il ilVar = (il) at20Var.a;
        if (ilVar.d != SharedAccountType.BUSINESS) {
            j(at20Var, sharedPaymentsOpenReason, this.h.h(ilVar.b));
            return;
        }
        lxo0 lxo0Var = new lxo0(12, this, at20Var, sharedPaymentsOpenReason);
        sw6 sw6Var = this.l;
        g.a(sw6Var.d, new BusinessAccountLaunchInteractor$launchWhenExperimentReady$1(sw6Var, lxo0Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(at20 at20Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, tmr0 tmr0Var) {
        nk nkVar;
        il ilVar = (il) at20Var.a;
        rmr0 rmr0Var = tmr0Var.j;
        ynr0 ynr0Var = tmr0Var.r;
        if (rmr0Var == null || !rmr0Var.a) {
            nkVar = new nk(ilVar, new vor0(this, ynr0Var));
        } else {
            iw6 iw6Var = new iw6(tmr0Var, new tor0(this, ynr0Var), sharedPaymentsOpenReason, ynr0Var.f);
            iw6Var.e = ilVar;
            nkVar = iw6Var;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nkVar);
        SharedAccountScreen sharedAccountScreen = (SharedAccountScreen) at20Var.b;
        if (sharedAccountScreen == SharedAccountScreen.PAYMENT_METHOD) {
            arrayList.add(new sn8(new bc(ilVar.a != null ? ilVar.b().e.b : null, new uor0(this), ilVar, SharedPaymentContext.DETAILS)));
        } else if (sharedAccountScreen == SharedAccountScreen.REPORT) {
            vor0 vor0Var = new vor0(this, ynr0Var);
            arrayList.add(new jor0(vor0Var, ilVar, ynr0Var.b));
            arrayList.add(new j3j0(ilVar, vor0Var, ynr0Var.a));
            arrayList.add(new wl(ilVar, new wor0(this)));
        }
        qor0 a = this.c.a();
        List J0 = kotlin.collections.a.J0(arrayList);
        ru.yandex.taxi.transition.c cVar = a.c;
        cVar.c(cVar.c.size(), J0);
    }

    public final void k(tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason) {
        if (tmr0Var.a() != SharedAccountType.BUSINESS) {
            l(tmr0Var, sharedPaymentsOpenReason, tmr0Var.j);
            return;
        }
        lxo0 lxo0Var = new lxo0(11, this, tmr0Var, sharedPaymentsOpenReason);
        sw6 sw6Var = this.l;
        g.a(sw6Var.d, new BusinessAccountLaunchInteractor$launchWhenExperimentReady$1(sw6Var, lxo0Var, null));
    }

    public final void l(tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, rmr0 rmr0Var) {
        ynr0 ynr0Var = tmr0Var.r;
        this.c.a().d((rmr0Var == null || !rmr0Var.a) ? new q3f(tmr0Var, new tor0(this, ynr0Var)) : new iw6(tmr0Var, new tor0(this, ynr0Var), sharedPaymentsOpenReason, ynr0Var.f));
        g();
    }

    public final void m(nmr0 nmr0Var) {
        String str = nmr0Var.a;
        at20 at20Var = new at20(new il(null, str, nmr0Var.b, nmr0Var.c), nmr0Var.d);
        tmr0 h = this.h.h(str);
        fga0 fga0Var = this.d;
        fga0Var.a.u(fga0Var.y, true);
        ((com.yandex.go.payments.paymentlist.data.c) this.e).e();
        this.c.a().d(new cor0(new uor0(this), new at20(at20Var, new uor0(this)), h.r.c));
    }

    public final void n(String str, boolean z) {
        new AlertDialog(this.a).setMessage(str).setPositiveButton(kyh0.common_got_it).setDismissListener(z ? new yue(this, 1) : new d82(1)).show();
    }
}
