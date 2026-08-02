package com.yandex.go.yb;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.adjust.sdk.Constants;
import com.yandex.go.yb.data.e;
import com.yandex.go.yb.domain.f0;
import com.yandex.go.yb.domain.n;
import com.yandex.go.yb.domain.q;
import com.ybsdk.api.DepositType;
import com.ybsdk.api.YBSdk;
import com.ybsdk.api.YBSdkScreenIntent$DepositAmount;
import com.ybsdk.api.YBSdkScreenIntent$DepositMoney;
import com.ybsdk.api.YBSdkScreenIntent$SplitContractDraft;
import defpackage.aw51;
import defpackage.bw51;
import defpackage.cey;
import defpackage.cw51;
import defpackage.dw51;
import defpackage.ew51;
import defpackage.fv51;
import defpackage.fva0;
import defpackage.fw51;
import defpackage.gs51;
import defpackage.gv51;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hpo0;
import defpackage.hr51;
import defpackage.hst;
import defpackage.js41;
import defpackage.jst;
import defpackage.jy31;
import defpackage.ls51;
import defpackage.lst0;
import defpackage.lv51;
import defpackage.mh51;
import defpackage.mst0;
import defpackage.nh51;
import defpackage.o400;
import defpackage.ph51;
import defpackage.ps51;
import defpackage.pzt0;
import defpackage.qq31;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.th51;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vh51;
import defpackage.w511;
import defpackage.xg;
import defpackage.yv51;
import defpackage.zv51;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes15.dex */
public final class c extends h55 {
    public final tse D;
    public final e E;
    public final FragmentActivity F;
    public final n G;
    public final hr51 H;
    public final h3y I;
    public final lv51 J;
    public final ls51 K;
    public final fw51 L;
    public final fva0 M;
    public final xg N;
    public final tt2 O;
    public final com.yandex.go.yb.domain.a P;
    public final gv51 Q;
    public final q R;
    public final f0 S;
    public pzt0 T;
    public ph51 U;

    public c(tse tseVar, e eVar, FragmentActivity fragmentActivity, n nVar, hr51 hr51Var, h3y h3yVar, lv51 lv51Var, ls51 ls51Var, fw51 fw51Var, fva0 fva0Var, xg xgVar, tt2 tt2Var, com.yandex.go.yb.domain.a aVar, gv51 gv51Var, q qVar, f0 f0Var) {
        super(null);
        this.D = tseVar;
        this.E = eVar;
        this.F = fragmentActivity;
        this.G = nVar;
        this.H = hr51Var;
        this.I = h3yVar;
        this.J = lv51Var;
        this.K = ls51Var;
        this.L = fw51Var;
        this.M = fva0Var;
        this.N = xgVar;
        this.O = tt2Var;
        this.P = aVar;
        this.Q = gv51Var;
        this.R = qVar;
        this.S = f0Var;
        cey.a(fragmentActivity.getLifecycle(), Lifecycle.Event.ON_STOP, new jy31(16, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        fv51 fv51Var = (fv51) obj;
        n nVar = this.G;
        pzt0 pzt0Var = nVar.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        nVar.l = null;
        if (fv51Var.b) {
            this.K.a.a().h();
        }
        ph51 ph51Var = this.U;
        if (ph51Var != null) {
            this.L.a.removeFirstOccurrence(ph51Var);
        }
        this.U = null;
        this.O.getClass();
        sjh sjhVar = uyj.a;
        this.T = tje.N(this.D, o400.a, null, new YbScreenRouterImpl$onDismiss$2(this, null), 2);
        r0 r0Var = this.Q.a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.N.c(this.H.a());
        com.yandex.go.yb.domain.a aVar = this.P;
        pzt0 pzt0Var2 = aVar.d;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        aVar.d = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        fv51 fv51Var = (fv51) obj;
        if (!this.E.f()) {
            r(new js41(27));
            return;
        }
        LinkedBlockingDeque linkedBlockingDeque = this.L.a;
        mh51 mh51Var = linkedBlockingDeque.isEmpty() ? null : (mh51) linkedBlockingDeque.getLast();
        if (mh51Var != null) {
            mh51Var.a(new hpo0(29, this, mh51Var, fv51Var));
        } else {
            P(fv51Var.a);
        }
    }

    public final void P(ew51 ew51Var) {
        String str;
        vh51 yBSdkScreenIntent$SplitContractDraft;
        YBSdkScreenIntent$DepositAmount yBSdkScreenIntent$DepositAmount;
        DepositType depositType;
        fva0.f(this.M, "BankScreen", PerformanceAnalytics$Type.Creating, 0L, 4);
        pzt0 pzt0Var = this.T;
        String str2 = null;
        boolean z = false;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.T = null;
        lv51 lv51Var = this.J;
        lv51Var.getClass();
        Pair pair = new Pair("open_reason", ew51Var.a().getOpenReason());
        boolean z2 = ew51Var instanceof yv51;
        if (z2) {
            str = "dashboard";
        } else if (ew51Var instanceof aw51) {
            str = "deposit";
        } else if ((ew51Var instanceof cw51) || (ew51Var instanceof dw51)) {
            str = Constants.DEEPLINK;
        } else {
            if (!(ew51Var instanceof bw51)) {
                w511.b();
                return;
            }
            str = "split_contract";
        }
        Map i = kotlin.collections.b.i(pair, new Pair(MetaDataField.SCREEN_FIELD, str), new Pair("bank_ui_session_id", UUID.randomUUID().toString()));
        int i2 = 2;
        vh51 vh51Var = th51.a;
        vh51 vh51Var2 = vh51Var;
        if (!z2) {
            if (ew51Var instanceof aw51) {
                zv51 zv51Var = ((aw51) ew51Var).a;
                if (zv51Var != null) {
                    String str3 = zv51Var.a;
                    BigDecimal bigDecimal = zv51Var.b;
                    int i3 = ps51.a[zv51Var.c.ordinal()];
                    if (i3 == 1) {
                        depositType = DepositType.ExactAmount;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return;
                        }
                        depositType = DepositType.OrderAmount;
                    }
                    yBSdkScreenIntent$DepositAmount = new YBSdkScreenIntent$DepositAmount(str3, bigDecimal, depositType, false, 8, null);
                } else {
                    yBSdkScreenIntent$DepositAmount = null;
                }
                vh51Var2 = new YBSdkScreenIntent$DepositMoney(yBSdkScreenIntent$DepositAmount, str2, i2, z ? 1 : 0);
            } else if (ew51Var instanceof cw51) {
                vh51 resolveUri = YBSdk.INSTANCE.resolveUri(Uri.parse(((cw51) ew51Var).b));
                vh51Var2 = vh51Var;
                if (resolveUri != null) {
                    yBSdkScreenIntent$SplitContractDraft = resolveUri;
                    nh51 nh51Var = (nh51) this.I.get();
                    ph51 ph51Var = new ph51(this.F, nh51Var.a, yBSdkScreenIntent$SplitContractDraft, i, nh51Var.b);
                    hst hstVar = jst.e;
                    ew51Var.toString();
                    yBSdkScreenIntent$SplitContractDraft.toString();
                    hstVar.getClass();
                    hr51 hr51Var = this.H;
                    ph51Var.b(hr51Var.a(), new gs51(i2, this, ew51Var));
                    xg.b(this.N, hr51Var.a(), null, 6);
                    i d = ((j) lv51Var.a).d("YandexBankSDK.Open");
                    d.h(i);
                    d.m();
                    this.G.b();
                    this.R.b();
                    this.L.a.addLast(ph51Var);
                    r0 r0Var = this.Q.a;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    this.P.a();
                    this.S.a();
                    this.U = ph51Var;
                    this.M.a("BankScreen", PerformanceAnalytics$Type.Creating, new qq31(28, ew51Var));
                }
            } else {
                if (!(ew51Var instanceof dw51)) {
                    if (!(ew51Var instanceof bw51)) {
                        w511.b();
                        return;
                    }
                    bw51 bw51Var = (bw51) ew51Var;
                    lst0 lst0Var = bw51Var.b;
                    List<mst0> list = lst0Var.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (mst0 mst0Var : list) {
                        arrayList.add(new YBSdkScreenIntent$SplitContractDraft.Cart.Item(mst0Var.a, mst0Var.b));
                    }
                    yBSdkScreenIntent$SplitContractDraft = new YBSdkScreenIntent$SplitContractDraft(new YBSdkScreenIntent$SplitContractDraft.Cart(arrayList, lst0Var.b), bw51Var.c, bw51Var.d, null, 8, null);
                    nh51 nh51Var2 = (nh51) this.I.get();
                    ph51 ph51Var2 = new ph51(this.F, nh51Var2.a, yBSdkScreenIntent$SplitContractDraft, i, nh51Var2.b);
                    hst hstVar2 = jst.e;
                    ew51Var.toString();
                    yBSdkScreenIntent$SplitContractDraft.toString();
                    hstVar2.getClass();
                    hr51 hr51Var2 = this.H;
                    ph51Var2.b(hr51Var2.a(), new gs51(i2, this, ew51Var));
                    xg.b(this.N, hr51Var2.a(), null, 6);
                    i d2 = ((j) lv51Var.a).d("YandexBankSDK.Open");
                    d2.h(i);
                    d2.m();
                    this.G.b();
                    this.R.b();
                    this.L.a.addLast(ph51Var2);
                    r0 r0Var2 = this.Q.a;
                    Boolean bool2 = Boolean.TRUE;
                    r0Var2.getClass();
                    r0Var2.m(null, bool2);
                    this.P.a();
                    this.S.a();
                    this.U = ph51Var2;
                    this.M.a("BankScreen", PerformanceAnalytics$Type.Creating, new qq31(28, ew51Var));
                }
                Object obj = ((dw51) ew51Var).b;
                vh51Var2 = vh51Var;
                if (obj instanceof vh51) {
                    vh51Var2 = (vh51) obj;
                }
            }
        }
        yBSdkScreenIntent$SplitContractDraft = vh51Var2;
        nh51 nh51Var22 = (nh51) this.I.get();
        ph51 ph51Var22 = new ph51(this.F, nh51Var22.a, yBSdkScreenIntent$SplitContractDraft, i, nh51Var22.b);
        hst hstVar22 = jst.e;
        ew51Var.toString();
        yBSdkScreenIntent$SplitContractDraft.toString();
        hstVar22.getClass();
        hr51 hr51Var22 = this.H;
        ph51Var22.b(hr51Var22.a(), new gs51(i2, this, ew51Var));
        xg.b(this.N, hr51Var22.a(), null, 6);
        i d22 = ((j) lv51Var.a).d("YandexBankSDK.Open");
        d22.h(i);
        d22.m();
        this.G.b();
        this.R.b();
        this.L.a.addLast(ph51Var22);
        r0 r0Var22 = this.Q.a;
        Boolean bool22 = Boolean.TRUE;
        r0Var22.getClass();
        r0Var22.m(null, bool22);
        this.P.a();
        this.S.a();
        this.U = ph51Var22;
        this.M.a("BankScreen", PerformanceAnalytics$Type.Creating, new qq31(28, ew51Var));
    }
}
