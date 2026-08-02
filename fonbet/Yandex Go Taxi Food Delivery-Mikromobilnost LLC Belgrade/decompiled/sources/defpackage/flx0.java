package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.taxi.order.y;
import com.yandex.go.urbanads.b;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.a;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input.BudgetChargesUinInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.requisites.BudgetChargesRequisitesFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.AutoPullsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.d;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.e;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.c;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.n;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.summary.requirements.list.interactors.l0;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes3.dex */
public final class flx0 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;

    public /* synthetic */ flx0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
    }

    public static ju01 a(uu01 uu01Var, tw51 tw51Var) {
        uu01Var.getClass();
        qbg qbgVar = new qbg(tw51Var, 12);
        xvf0 b = i5m.b(new vu01(qbgVar, 2));
        xvf0 b2 = i5m.b(new vu01(qbgVar, 0));
        qbg qbgVar2 = new qbg(tw51Var, 4);
        qbg qbgVar3 = new qbg(tw51Var, 8);
        int i = 19;
        flx0 flx0Var = new flx0(qbgVar2, qbgVar3, i);
        y501 y501Var = new y501(new qbg(tw51Var, 7), 23);
        qbg qbgVar4 = new qbg(tw51Var, 13);
        qbg qbgVar5 = new qbg(tw51Var, 24);
        qcz0 qcz0Var = new qcz0(b, 14);
        qcz0 qcz0Var2 = new qcz0(i5m.b(new vu01(qbgVar, 3)), 17);
        qcz0 qcz0Var3 = new qcz0(i5m.b(new vu01(qbgVar, 1)), 15);
        ibz0 ibz0Var = new ibz0(b2, b, 11);
        qbg qbgVar6 = new qbg(tw51Var, 22);
        qbg qbgVar7 = new qbg(tw51Var, i);
        int i2 = 21;
        n3w a = n3w.a(new rg01(new hlx0(ibz0Var, qbgVar6, qbgVar7, qbgVar3, new gpx0(qbgVar3, new y501(new y501(qbgVar3, 18), i2), new qbg(tw51Var, i2), 20), 7)));
        qbg qbgVar8 = new qbg(tw51Var, 0);
        qbg qbgVar9 = new qbg(tw51Var, 10);
        n3w a2 = n3w.a(new tg01(new w040(qcz0Var, qcz0Var2, qcz0Var3, ibz0Var, a, qbgVar8, qbgVar9, new qbg(tw51Var, 1))));
        hag hagVar = new hag(tw51Var, 29);
        n3w a3 = n3w.a(new vfy0(new ufy0(hagVar)));
        n3w a4 = n3w.a(new rj01(new a201(4, hagVar, a3)));
        qbg qbgVar10 = new qbg(tw51Var, 28);
        qbg qbgVar11 = new qbg(tw51Var, 26);
        qbg qbgVar12 = new qbg(tw51Var, 23);
        qbg qbgVar13 = new qbg(tw51Var, 5);
        c4 c4Var = new c4(new hag(tw51Var, 28), new qbg(tw51Var, 3), qbgVar9, 8);
        rbg rbgVar = new rbg(tw51Var, 2);
        qbg qbgVar14 = new qbg(tw51Var, 17);
        qbg qbgVar15 = new qbg(tw51Var, 15);
        qbg qbgVar16 = new qbg(tw51Var, 9);
        flx0 flx0Var2 = new flx0(n3w.a(new sl01(new ik0(flx0Var, y501Var, qbgVar4, qbgVar5, a2, a4, qbgVar10, qbgVar11, qbgVar12, qbgVar13, c4Var, rbgVar, qbgVar14, qbgVar15, qbgVar16, qbgVar3))), new qbg(tw51Var, 2), 18);
        np6 np6Var = new np6(qbgVar2, 4);
        qbg qbgVar17 = new qbg(tw51Var, 6);
        int i3 = 29;
        v8c0 v8c0Var = new v8c0(n3w.a(new om01(new uio0((Object) np6Var, (Object) qbgVar17, (Object) new mvy(b, 23), (Object) qbgVar4, (Object) y501Var, (Object) new rut(hagVar, qbgVar2, i3)))), i3);
        rbg rbgVar2 = new rbg(tw51Var, 1);
        vs3 vs3Var = new vs3(hagVar, 6);
        mvy mvyVar = new mvy(b, 24);
        mvy mvyVar2 = new mvy(b, 25);
        uas uasVar = new uas(n3w.a(new im01(new vmn0(qbgVar4, rbgVar2, qbgVar5, qbgVar17, vs3Var, n3w.a(new u910(new e100(8, mvyVar, mvyVar2, qbgVar7)))))), rbgVar2, 2);
        gpx0 gpx0Var = new gpx0(n3w.a(new rk01(new fn6(new np6(qbgVar2, 3), qbgVar4, new qbg(tw51Var, 20), rbgVar2, qbgVar5, a2, n3w.a(new ur01(new cjw0(new vs3(hagVar, 7), hagVar, a3))), new qbg(tw51Var, 27), qbgVar17, qbgVar14, qbgVar15, new qbg(tw51Var, 29)))), rbgVar2, new rbg(tw51Var, 3), 19);
        xvf0 b3 = i5m.b(new np6(qbgVar2, 6));
        f2i f2iVar = new f2i(n3w.a(new an01(new ufy0(hagVar))), n3w.a(new th01(new ufy0(hagVar))), 4);
        qbg qbgVar18 = new qbg(tw51Var, 11);
        n3w a5 = n3w.a(new qh01(new c1x0(new srb(new y501(qbgVar11, 22), 14))));
        ln01 ln01Var = new ln01(a5, 0);
        int i4 = 1;
        ht20 ht20Var = new ht20(n3w.a(new e(new d(b3, qbgVar2, qbgVar10, a2, f2iVar, qbgVar18, ln01Var, qbgVar4, qbgVar5, qbgVar11, qbgVar17, y501Var, qbgVar16))), qbgVar18, i4);
        ln01 ln01Var2 = new ln01(n3w.a(new com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.d(new c(qbgVar4, y501Var, bo01.a, qbgVar16))), i4);
        np6 np6Var2 = new np6(qbgVar2, 5);
        qcz0 qcz0Var4 = new qcz0(b, 16);
        n3w a6 = n3w.a(new or01(new wpy0(12, hagVar)));
        erj0 erj0Var = drj0.a;
        n3w a7 = n3w.a(new g3b0(new y94(erj0Var)));
        n3w a8 = n3w.a(new vay(new rw8(erj0Var)));
        n3w a9 = n3w.a(new p8u(new y94(erj0Var)));
        yyf yyfVar = new yyf();
        yyfVar.a = a7;
        yyfVar.b = a8;
        yyfVar.c = a9;
        ln01 ln01Var3 = new ln01(n3w.a(new lr01(new sbm0(np6Var2, qbgVar4, (xvf0) erj0Var, qcz0Var4, a6, qbgVar2, qbgVar17, qbgVar11, n3w.a(new u4s(yyfVar))))), 2);
        int i5 = 4;
        uas uasVar2 = new uas(n3w.a(new p910(new q4g(n3w.a(new j910(new e100(7, mvyVar2, qbgVar8, qbgVar9))), rbgVar2, qbgVar4, qbgVar5, new vs3(hagVar, i5), 28))), rbgVar2, 1);
        int i6 = 21;
        lk lkVar = new lk(i6, new t4(ct3.a, qbgVar4, new tl3(b, i5), new vs3(hagVar, 0), 12));
        uas uasVar3 = new uas(n3w.a(new bbs(new w3i(new np6(qbgVar2, 1), new c4p(b, (xvf0) qbgVar7, 24), qbgVar17, qbgVar11, rbgVar2, qbgVar4, new vs3(hagVar, 2), qbgVar5, 23))), rbgVar2, 0);
        y501 y501Var2 = new y501(new qcz0(b, 21), 24);
        vs3 vs3Var2 = new vs3(hagVar, 8);
        ubq0 ubq0Var = new ubq0(n3w.a(new yv01(new z4m0(qbgVar11, qbgVar17, y501Var2, new z6x0(hagVar, vs3Var2, qbgVar11, qbgVar2, 16), new qbg(tw51Var, 18), qbgVar14, new p4((Object) qbgVar11, (xvf0) new rbg(tw51Var, 0), 23), 12))), new qbg(tw51Var, 25), qbgVar11, vs3Var2, qbgVar14, new qbg(tw51Var, 14), new ln01(n3w.a(tw51Var), 4), 17);
        q720 q720Var = new q720(b, 23);
        vs3 vs3Var3 = new vs3(hagVar, 5);
        aos aosVar = new aos(n3w.a(new ju20(new xv10(pu20.a, q720Var, qbgVar5, vs3Var3, qbgVar17))), 15);
        ht20 ht20Var2 = new ht20(n3w.a(new nt20(new m(new aos(a5, 14), b3, qbgVar18, qbgVar10, new q720(b, 22), qbgVar4, y501Var, qbgVar5, vs3Var3, qbgVar17))), qbgVar18, 0);
        k1w k1wVar = new k1w(b, 7);
        vs3 vs3Var4 = new vs3(hagVar, 3);
        aos aosVar2 = new aos(n3w.a(new xtw(new wrr(stw.a, k1wVar, qbgVar5, qbgVar4, y501Var, vs3Var4, qbgVar17, 4))), 4);
        aos aosVar3 = new aos(n3w.a(new jtw(new v920(new np6(qbgVar2, 2), new k1w(b, 6), qbgVar5, qbgVar4, y501Var, vs3Var4))), 3);
        np6 np6Var3 = new np6(qbgVar2, 0);
        p4 p4Var = new p4((Object) new tl3(b, 27), (xvf0) qbgVar9, 26);
        vs3 vs3Var5 = new vs3(hagVar, 1);
        pg5 pg5Var = new pg5(new ht0((Object) np6Var3, (xvf0) p4Var, (xvf0) qbgVar5, (xvf0) qbgVar17, (xvf0) qbgVar4, (xvf0) y501Var, (xvf0) vs3Var5, 8), 19);
        kk kkVar = new kk(n3w.a(new xo6(new v920(p4Var, new qbg(tw51Var, 16), qbgVar5, qbgVar17, qbgVar4, vs3Var5))), 5);
        kk kkVar2 = new kk(n3w.a(new ip6(new boj0(bp6.a, p4Var, qbgVar5, qbgVar17, qbgVar4, vs3Var5, 4))), 6);
        aos aosVar4 = new aos(n3w.a(new fos(new wjm(qbgVar4, qbgVar12, los.a, a2, 10))), 0);
        h9g h9gVar = (h9g) tw51Var;
        a aVar = new a(oti.a(h9gVar.a, h9gVar));
        ci90 b4 = g680.b(h9gVar.l, h9gVar);
        y5e.i(19, "expectedSize");
        ImmutableMap.a aVar2 = new ImmutableMap.a(19);
        aVar2.b(TransferMainFragment.class, flx0Var2);
        aVar2.b(TransferMe2MeConfirmFragment.class, v8c0Var);
        aVar2.b(TransferMe2MeConfirmPullFragment.class, uasVar);
        aVar2.b(TransferMainResultFragment.class, gpx0Var);
        aVar2.b(TransferPhoneInputFragment.class, ht20Var);
        aVar2.b(TransferReceiverNameFragment.class, ln01Var2);
        aVar2.b(TransferRequisiteFragment.class, ln01Var3);
        aVar2.b(Me2MeDebitResultFragment.class, uasVar2);
        aVar2.b(AutoPullsFragment.class, lkVar);
        aVar2.b(FpsPayEnrollFragment.class, uasVar3);
        aVar2.b(TransfersDashboardFragment.class, ubq0Var);
        aVar2.b(MobileProvidersListFragment.class, aosVar);
        aVar2.b(MobilePaymentSelectContactFragment.class, ht20Var2);
        aVar2.b(InternetPaymentSelectProviderFragment.class, aosVar2);
        aVar2.b(InternetPaymentFormInputFragment.class, aosVar3);
        aVar2.b(BudgetChargesUinInputFragment.class, pg5Var);
        aVar2.b(BudgetChargesRequisitesFragment.class, kkVar);
        aVar2.b(BudgetChargesSearchStatusFragment.class, kkVar2);
        aVar2.b(FundDocsNoticeFragment.class, aosVar4);
        return new ju01(aVar, b4, aVar2.a());
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new zxs0((pbx0) ((g3b) obj).get(), (ndl0) ((ivo0) xvf0Var).get());
            case 1:
                return new vlx0((SummaryStateTracker) ((xvf0) obj).get(), (ulx0) ((q02) xvf0Var).get());
            case 2:
                return new hhs0(23, (l0) ((u6o0) obj).get(), (kdd0) ((vfg0) xvf0Var).get());
            case 3:
                return new jsx0((xvf0) obj, (p6m) xvf0Var);
            case 4:
                return new sux0((tse) ((xvf0) obj).get(), (tux0) ((jag) xvf0Var).get());
            case 5:
                return new com.yandex.go.taxi.order.infosharing.domain.a((zuj0) ((abg) obj).get(), (ru.yandex.taxi.widget.utils.e) ((abg) xvf0Var).get());
            case 6:
                return new j4y0((w030) ((xvf0) obj).get(), (zxs0) ((fat0) xvf0Var).get());
            case 7:
                return new com.yandex.go.taxi.order.infosharing.domain.e((com.yandex.go.taxi.order.infosharing.domain.a) ((flx0) obj).get(), (pwy0) ((abg) xvf0Var).get());
            case 8:
                return new yay0((tt2) ((t4g) obj).get(), (y) ((u4g) xvf0Var).get());
            case 9:
                gzh gzhVar = (gzh) ((xvf0) obj).get();
                jhu0 jhu0Var = (jhu0) ((uzu0) xvf0Var).get();
                cjw0 cjw0Var = new cjw0();
                cjw0Var.a = gzhVar;
                cjw0Var.b = jhu0Var;
                return cjw0Var;
            case 10:
                return new kcz0((itc) ((xki) obj).get(), (i130) xvf0Var.get());
            case 11:
                return new cjw0((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((xvf0) obj).get(), (j00) ((c1) xvf0Var).get());
            case 12:
                return new kcz0((jwh) ((xvf0) obj).get(), (c1x0) ((uzu0) xvf0Var).get());
            case 13:
                return new n((b) ((hbg) obj).get(), (com.yandex.delivery.utils.storage.impl.c) ((ibg) xvf0Var).get());
            case 14:
                return new com.yandex.go.taxi.order.map.overlay.traffic.a((zuj0) ((v4g) obj).get(), (tt2) xvf0Var.get());
            case 15:
                return new m901((p) ((k4g) obj).get(), (com.yandex.go.navigator.analitycs.a) ((e840) xvf0Var).get());
            case 16:
                return new lc01((on2) ((r3g) xvf0Var).get(), (tt2) ((r3g) obj).get());
            case 17:
                return new zh01((jtq0) ((pbg) obj).get(), (j5z) ((pbg) xvf0Var).get());
            case 18:
                return new TransferMainFragment((kl01) ((n3w) obj).a, (qg6) ((qbg) xvf0Var).get());
            case 19:
                return new yl01((Context) ((qbg) obj).get(), (w530) ((qbg) xvf0Var).get());
            case 20:
                return new kcz0((ru.yandex.taxi.orderforanother.repository.a) ((pbg) obj).get(), (aw70) ((pbg) xvf0Var).get());
            case 21:
                return new vp01((dqe0) ((w0g) obj).get(), (qn01) xvf0Var.get());
            case 22:
                return new kcz0((ih01) ((y501) obj).get(), (dqe0) ((pbg) xvf0Var).get());
            case 23:
                return new a201(6, (com.ybsdk.feature.autotopup.internal.domain.a) ((hag) obj).get(), (us3) ((qm01) xvf0Var).get());
            case 24:
                return new TransferResultFragment((ps01) ((n3w) obj).a, (fyp0) ((hag) xvf0Var).get());
            case 25:
                return a((uu01) obj, (tw51) xvf0Var.get());
            case 26:
                return new z111((tse) ((xvf0) obj).get(), (a211) ((jag) xvf0Var).get());
            case 27:
                return new com.yandex.go.taxi.summary.mobilityhub.repository.b((jtq0) ((l3g) obj).get(), (f410) ((h3g) xvf0Var).get());
            case 28:
                return new bb11((pwy0) ((xvf0) obj).get(), (com.yandex.go.taxi.summary.mobilityhub.mapper.c) ((qcz0) xvf0Var).get());
            default:
                return new a201(7, (String) ((fxf) obj).get(), (u1n) ((k0n) xvf0Var).get());
        }
    }
}
