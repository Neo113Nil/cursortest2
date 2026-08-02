package com.ybsdk.feature.main.internal.screens.sbpPartners;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenBankSearchResult;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.main.internal.data.network.c;
import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;
import com.ybsdk.feature.main.internal.screens.sbpPartners.a;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.a8g0;
import defpackage.b3z;
import defpackage.bza1;
import defpackage.c9v;
import defpackage.cfj0;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.fu5;
import defpackage.gao;
import defpackage.gim0;
import defpackage.gu5;
import defpackage.h791;
import defpackage.him0;
import defpackage.i5z0;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.krl0;
import defpackage.lrp0;
import defpackage.mv3;
import defpackage.n800;
import defpackage.np41;
import defpackage.o430;
import defpackage.ohm0;
import defpackage.oim0;
import defpackage.phm0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q400;
import defpackage.r8j0;
import defpackage.s6k0;
import defpackage.s8j0;
import defpackage.shm0;
import defpackage.sls;
import defpackage.t8j0;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u2g;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.v4m0;
import defpackage.vem0;
import defpackage.vf51;
import defpackage.w511;
import defpackage.wem0;
import defpackage.x4c;
import defpackage.y5e;
import defpackage.ycm0;
import defpackage.yvf0;
import defpackage.z94;
import defpackage.zka1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final c B;
    public final n800 C;
    public final tfl0 D;
    public final a8g0 E;
    public final c9v F;
    public final b3z G;
    public final krl0 H;
    public final Context I;
    public final s6k0 J;
    public pzt0 K;
    public Boolean L;

    public a(c cVar, n800 n800Var, tfl0 tfl0Var, a8g0 a8g0Var, c9v c9vVar, shm0 shm0Var, b3z b3zVar, krl0 krl0Var, Context context) {
        super(new v4m0(6), new oim0());
        this.B = cVar;
        this.C = n800Var;
        this.D = tfl0Var;
        this.E = a8g0Var;
        this.F = c9vVar;
        this.G = b3zVar;
        this.H = krl0Var;
        this.I = context;
        krl0 krl0Var2 = shm0Var.a;
        this.J = new s6k0((tfl0) ((u2g) krl0Var2.a).get(), (a8g0) ((u2g) krl0Var2.b).get(), this);
        b3zVar.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, this, 27));
        k5c a = ds31.a(this);
        n0 n0Var = (n0) krl0Var.b;
        o430 o430Var = e3n.b;
        com.ybsdk.core.utils.ext.c.a(e.q(n0Var, kp50.U(200, DurationUnit.MILLISECONDS)), a, new cfj0(24, krl0Var));
        tje.N(ds31.a(this), null, null, new SbpPartnersViewModel$loadPartners$1(this, null), 3);
    }

    public final void b0() {
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = null;
        s6k0 s6k0Var = this.J;
        List c = s6k0Var.c();
        ArrayList arrayList = new ArrayList(tcc.n(c, 10));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            s6k0Var.b(((ohm0) it.next()).a.b, Status.DEFAULT);
            arrayList.add(zy11.a);
        }
    }

    public final void c0() {
        String supportUrl;
        u8j0 u8j0Var = ((vem0) X()).a;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        q400 q400Var = (q400) this.C;
        h791.f(q400Var.a, supportUrl, com.ybsdk.feature.webview.api.a.b(q400Var.b, supportUrl, null, null, 6));
    }

    public final void d0() {
        this.D.e();
    }

    public final void e0(String str) {
        r0 r0Var;
        Object value;
        wem0 wem0Var = (wem0) ((vem0) X()).a.a();
        if (wem0Var == null) {
            return;
        }
        ArrayList arrayList = wem0Var.e;
        ArrayList b = bza1.b(str, wem0Var.a);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new vem0(zka1.d(((vem0) value).a, new ycm0(str, this, arrayList, b)))));
        boolean isEmpty = b.isEmpty();
        krl0 krl0Var = this.H;
        if (isEmpty) {
            z94.p(((AppAnalyticsReporter) krl0Var.a).G, str, LinkingAccountEvents$LinkingAccountListOfBanksScreenBankSearchResult.ERROR);
        } else {
            ((n0) krl0Var.b).g(str);
        }
    }

    public final void f0(String str) {
        if (str != null) {
            c9v c9vVar = this.F;
            h791.f((j3h) ((yvf0) c9vVar.b).get(), str, ((com.ybsdk.feature.webview.internal.a) ((np41) c9vVar.c)).f(str));
            i5z0.a.a("open WebViewScreen", new Object[0]);
        }
    }

    public final void g0(final phm0 phm0Var) {
        lrp0 lrp0Var = lrp0.C;
        String str = phm0Var.h;
        wem0 wem0Var = (wem0) ((vem0) X()).a.a();
        if (wem0Var == null) {
            x4c.g("No common bottom sheet to bind sbp account", null, null, Collections.singletonList(lrp0Var), 6);
            return;
        }
        fu5 fu5Var = wem0Var.c;
        wem0 wem0Var2 = (wem0) ((vem0) X()).a.a();
        final int i = 0;
        krl0 krl0Var = this.H;
        if (wem0Var2 != null) {
            Iterator it = wem0Var2.a.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (jl40.l(((ohm0) it.next()).a.b, str)) {
                    break;
                } else {
                    i2++;
                }
            }
            z94 z94Var = ((AppAnalyticsReporter) krl0Var.a).G;
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(y5e.o(y5e.R), Integer.valueOf(i2));
            linkedHashMap.put(y5e.o(y5e.W), str);
            z94Var.a.a(y5e.o(y5e.N), linkedHashMap);
        } else {
            x4c.g("Not found yb in filteredBanks by its id", null, str, Collections.singletonList(lrp0Var), 2);
        }
        vf51 vf51Var = phm0Var.j;
        if (vf51Var != null) {
            fu5 fu5Var2 = vf51Var.a;
            if (fu5Var2 == null) {
                tje.N(ds31.a(this), null, null, new SbpPartnersViewModel$onListItemClick$3(this, phm0Var, null), 3);
                return;
            }
            BottomSheetDialogView.State state = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(fu5Var2.a, fu5Var2.b, null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(fu5Var2.c, null, null, null, null, null, null, false, false, null, 4094), null, null, null, fu5Var2.d, null, null, null, 130036);
            final int i3 = 1;
            Z(new gim0(state, new sls(this) { // from class: cim0
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    phm0 phm0Var2 = phm0Var;
                    a aVar = this.b;
                    switch (i4) {
                        case 0:
                            krl0 krl0Var2 = aVar.H;
                            ((AppAnalyticsReporter) krl0Var2.a).G.q(phm0Var2.h, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme.CONFIRM_OPEN_APP);
                            break;
                        default:
                            krl0 krl0Var3 = aVar.H;
                            ((AppAnalyticsReporter) krl0Var3.a).G.q(phm0Var2.h, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme.NO_YB_ACCOUNT);
                            break;
                    }
                    return zy11Var;
                }
            }, phm0Var.j, null, 8));
            ((AppAnalyticsReporter) krl0Var.a).G.r(str, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme.NO_YB_ACCOUNT);
            return;
        }
        gu5 gu5Var = phm0Var.i;
        Text text = gu5Var.c;
        if (text == null) {
            text = fu5Var.c;
        }
        YbButtonView.a aVar = new YbButtonView.a(text, null, null, null, null, null, null, false, false, null, 4094);
        Text text2 = gu5Var.a;
        if (text2 == null) {
            text2 = fu5Var.a;
        }
        Text text3 = text2;
        Text text4 = gu5Var.b;
        if (text4 == null) {
            text4 = fu5Var.b;
        }
        BottomSheetDialogView.State.a aVar2 = new BottomSheetDialogView.State.a(text3, text4, null, null, null, null, HProv.PP_SAME_MEDIA);
        Text text5 = gu5Var.d;
        if (text5 == null) {
            text5 = fu5Var.d;
        }
        Z(new gim0(new BottomSheetDialogView.State(aVar2, aVar, null, null, null, text5, null, null, null, 130036), new sls(this) { // from class: cim0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i;
                zy11 zy11Var = zy11.a;
                phm0 phm0Var2 = phm0Var;
                a aVar3 = this.b;
                switch (i4) {
                    case 0:
                        krl0 krl0Var2 = aVar3.H;
                        ((AppAnalyticsReporter) krl0Var2.a).G.q(phm0Var2.h, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme.CONFIRM_OPEN_APP);
                        break;
                    default:
                        krl0 krl0Var3 = aVar3.H;
                        ((AppAnalyticsReporter) krl0Var3.a).G.q(phm0Var2.h, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme.NO_YB_ACCOUNT);
                        break;
                }
                return zy11Var;
            }
        }, null, phm0Var.h, 4));
        ((AppAnalyticsReporter) krl0Var.a).G.r(str, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme.CONFIRM_OPEN_APP);
    }

    public final void h0() {
        tje.N(ds31.a(this), null, null, new SbpPartnersViewModel$loadPartners$1(this, null), 3);
    }

    public final void i0(String str) {
        if (((q400) this.C).a(str)) {
            return;
        }
        Z(new him0(gao.e(null, null, null, 7)));
    }

    public final void j0(String str, YbButtonView.a aVar) {
        if (str == null) {
            x4c.g("Nspk id is null when binding another yb account", null, "onPrimaryButtonClickBindingAnotherBank() in SbpBanksViewModel", Collections.singletonList(lrp0.C), 2);
            Z(new him0(gao.e(null, null, null, 7)));
        } else {
            pzt0 pzt0Var = this.K;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.K = tje.N(ds31.a(this), null, null, new SbpPartnersViewModel$bindAnotherBankAccount$1(this, str, aVar, null), 3);
        }
    }

    public final void k0() {
        r0 r0Var;
        Object value;
        u8j0 t8j0Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            u8j0 u8j0Var = ((vem0) value).a;
            if (u8j0Var instanceof r8j0) {
                r8j0 r8j0Var = (r8j0) u8j0Var;
                t8j0Var = new r8j0(wem0.a((wem0) r8j0Var.a, null, null, false, 7), r8j0Var.b, r8j0Var.c, r8j0Var.d);
            } else if (u8j0Var instanceof s8j0) {
                t8j0Var = new s8j0(((s8j0) u8j0Var).a);
            } else {
                if (!(u8j0Var instanceof t8j0)) {
                    w511.b();
                    return;
                }
                t8j0Var = new t8j0();
            }
        } while (!r0Var.k(value, new vem0(t8j0Var)));
    }
}
