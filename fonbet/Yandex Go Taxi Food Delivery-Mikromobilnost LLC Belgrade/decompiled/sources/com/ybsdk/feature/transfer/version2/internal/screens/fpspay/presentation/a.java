package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation;

import android.net.Uri;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenSbpayConnectToSbpayAppResult;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.feature.deeplink.api.actions.OpenUrlAction;
import defpackage.cbs;
import defpackage.ds31;
import defpackage.f42;
import defpackage.fl1;
import defpackage.g8e;
import defpackage.h791;
import defpackage.hu01;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.l3h;
import defpackage.nas;
import defpackage.ou01;
import defpackage.pas;
import defpackage.pz40;
import defpackage.qq7;
import defpackage.qu01;
import defpackage.r8j0;
import defpackage.rm01;
import defpackage.ro01;
import defpackage.s8j0;
import defpackage.sxo;
import defpackage.t8j0;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.v5r;
import defpackage.vas;
import defpackage.w511;
import defpackage.was;
import defpackage.x4c;
import defpackage.xvq;
import defpackage.zka1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final FpsPayScreenParams B;
    public final com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.a C;
    public final j3h D;
    public final ro01 E;
    public final hu01 F;
    public final tfl0 G;
    public final f42 H;
    public final rm01 I;

    public a(cbs cbsVar, FpsPayScreenParams fpsPayScreenParams, com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.a aVar, j3h j3hVar, ro01 ro01Var, hu01 hu01Var, tfl0 tfl0Var, f42 f42Var, rm01 rm01Var) {
        super(new v5r(21), cbsVar);
        this.B = fpsPayScreenParams;
        this.C = aVar;
        this.D = j3hVar;
        this.E = ro01Var;
        this.F = hu01Var;
        this.G = tfl0Var;
        this.H = f42Var;
        this.I = rm01Var;
        m0();
    }

    public final void b0() {
        was wasVar = (was) ((u8j0) X()).a();
        if (wasVar == null) {
            return;
        }
        String action = wasVar.a.f.getAction();
        if (action != null) {
            this.H.b.l.a.a("card.main_screen.sbpay.connect.upgrade_screen.click", null);
            if (h791.e(this.D, action, false, null, 14) != null) {
                return;
            }
        }
        h0(null);
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zka1.d((u8j0) value, new xvq(20))));
    }

    public final void d0() {
        u8j0 t8j0Var;
        vas vasVar;
        Object obj;
        r0 r0Var;
        Object value;
        Object t8j0Var2;
        was wasVar = (was) ((u8j0) X()).a();
        u8j0 u8j0Var = (u8j0) X();
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            t8j0Var = new r8j0(((was) r8j0Var.a).c, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        } else if (u8j0Var instanceof s8j0) {
            t8j0Var = new s8j0(((s8j0) u8j0Var).a);
        } else {
            if (!(u8j0Var instanceof t8j0)) {
                w511.b();
                return;
            }
            t8j0Var = new t8j0();
        }
        nas nasVar = (nas) t8j0Var.a();
        if (nasVar == null) {
            x4c.g("[fps-pay] onBottomSheetPrimaryAction null bottomSheetState", null, null, null, 14);
            return;
        }
        if (wasVar != null && (vasVar = wasVar.a) != null) {
            Iterator it = vasVar.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((fl1) obj).a, nasVar.a.a)) {
                        break;
                    }
                }
            }
            fl1 fl1Var = (fl1) obj;
            if (fl1Var != null) {
                this.H.b.l.a.a("card.main_screen.sbpay.connecting_account.changed", g8e.w(1, "account_type", fl1Var.b));
                pz40 Y = Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    u8j0 u8j0Var2 = (u8j0) value;
                    if (u8j0Var2 instanceof r8j0) {
                        r8j0 r8j0Var2 = (r8j0) u8j0Var2;
                        t8j0Var2 = new r8j0(was.a((was) r8j0Var2.a, fl1Var, null, null, false, HProv.PP_DELETE_KEYSET), r8j0Var2.b, r8j0Var2.c, r8j0Var2.d);
                    } else if (u8j0Var2 instanceof s8j0) {
                        t8j0Var2 = new s8j0(((s8j0) u8j0Var2).a);
                    } else {
                        if (!(u8j0Var2 instanceof t8j0)) {
                            w511.b();
                            return;
                        }
                        t8j0Var2 = new t8j0();
                    }
                } while (!r0Var.k(value, t8j0Var2));
                c0();
                return;
            }
        }
        x4c.g("[fps-pay] Couldn't find fps pay account in available accounts", null, null, null, 14);
    }

    public final void e0() {
        was wasVar = (was) ((u8j0) X()).a();
        if (wasVar != null) {
            ArrayList arrayList = wasVar.a.h;
            qq7 qq7Var = this.H.b.l;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((fl1) it.next()).b);
            }
            qq7Var.a.a("card.main_screen.sbpay.connecting_account.open", g8e.w(1, "accounts_list", new JSONArray((Collection) arrayList2).toString()));
        }
    }

    public final void f0() {
        this.G.e();
    }

    public final void g0(String str, String str2) {
        String p = g8e.p(str, ". ", str2);
        qq7 qq7Var = this.H.b.l;
        qq7Var.a.a("card.main_screen.sbpay.connect.error", g8e.w(1, "error", p));
    }

    public final void h0(String str) {
        r0 r0Var;
        Object value;
        Object t8j0Var;
        this.H.b.l.a.a("card.main_screen.sbpay.connect.click", null);
        was wasVar = (was) ((u8j0) X()).a();
        if (wasVar == null || wasVar.f) {
            return;
        }
        if (str == null) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                u8j0 u8j0Var = (u8j0) value;
                if (u8j0Var instanceof r8j0) {
                    r8j0 r8j0Var = (r8j0) u8j0Var;
                    t8j0Var = new r8j0(was.a((was) r8j0Var.a, null, null, null, false, 111), r8j0Var.b, r8j0Var.c, r8j0Var.d);
                } else if (u8j0Var instanceof s8j0) {
                    t8j0Var = new s8j0(((s8j0) u8j0Var).a);
                } else {
                    if (!(u8j0Var instanceof t8j0)) {
                        w511.b();
                        return;
                    }
                    t8j0Var = new t8j0();
                }
            } while (!r0Var.k(value, t8j0Var));
        }
        tje.N(ds31.a(this), null, null, new FpsPayEnrollViewModel$onEnrollButtonClick$2(this, str, null), 3);
    }

    public final void i0() {
        m0();
    }

    public final void j0(String str) {
        this.H.b.l.a.a("card.main_screen.sbpay.docs.intiated", null);
        ou01 ou01Var = (ou01) this.I;
        h791.f(ou01Var.a, str, ((com.ybsdk.feature.webview.internal.a) ou01Var.b).f(str));
    }

    public final void k0() {
        n0(FpsPayEnrollViewModel$ReturnToSbpStatus.FAILED);
    }

    public final void l0() {
        r0 r0Var;
        Object value;
        was wasVar = (was) ((u8j0) X()).a();
        if (wasVar != null && wasVar.d) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zka1.d((u8j0) value, new sxo(18, wasVar, this))));
        }
    }

    public final void m0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        this.H.b.l.a.a("card.main_screen.sbpay.intiated", null);
        tje.N(ds31.a(this), null, null, new FpsPayEnrollViewModel$requestData$2(this, null), 3);
    }

    public final void n0(FpsPayEnrollViewModel$ReturnToSbpStatus fpsPayEnrollViewModel$ReturnToSbpStatus) {
        CardMainScreenEvents$CardMainScreenSbpayConnectToSbpayAppResult cardMainScreenEvents$CardMainScreenSbpayConnectToSbpayAppResult;
        Uri.Builder buildUpon = Uri.parse(((qu01) this.E).a).buildUpon();
        buildUpon.appendEncodedPath(this.B.getTokenIntentId());
        buildUpon.appendEncodedPath(fpsPayEnrollViewModel$ReturnToSbpStatus.getResult());
        String uri = buildUpon.build().toString();
        qq7 qq7Var = this.H.b.l;
        int i = pas.a[fpsPayEnrollViewModel$ReturnToSbpStatus.ordinal()];
        if (i == 1) {
            cardMainScreenEvents$CardMainScreenSbpayConnectToSbpayAppResult = CardMainScreenEvents$CardMainScreenSbpayConnectToSbpayAppResult.FAILED;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            cardMainScreenEvents$CardMainScreenSbpayConnectToSbpayAppResult = CardMainScreenEvents$CardMainScreenSbpayConnectToSbpayAppResult.SUCCESS;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardMainScreenEvents$CardMainScreenSbpayConnectToSbpayAppResult.getOriginalValue());
        qq7Var.a.a("card.main_screen.sbpay.connect.to_sbpay_app", linkedHashMap);
        ((l3h) this.D).d(com.ybsdk.feature.deeplink.api.a.a(new OpenUrlAction(uri, null, 2, null), DeeplinkNavigation.Add.INSTANCE));
        this.G.e();
    }
}
