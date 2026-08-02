package xsna;

import com.vk.api.generated.fave.dto.FaveGetPagesTypeDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.entities.FaveType;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.a9q0;
import xsna.ds60;
import xsna.ipq;
import xsna.jm50;
import xsna.qr60;
import xsna.rpq;
import xsna.xoq;
import xsna.yo60;

/* compiled from: FaveFeedMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class gpq extends evg0<kpq, on50, rpq.c, rpq, ipq, xoq> {
    public final cqq f;
    public final eh60 g;
    public final aqw h;
    public final io.reactivex.rxjava3.internal.schedulers.d i;
    public final qn60 j;
    public final pn60 k;

    /* compiled from: FaveFeedMviPagingTaskExecutor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[FaveType.values().length];
    }

    public gpq(cqq cqqVar, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = cqqVar;
        this.g = cqqVar.e;
        this.h = cqqVar.i;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.i = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
        this.j = cqqVar.c;
        this.k = cqqVar.d;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        rpq.c cVar = (rpq.c) hn50Var;
        boolean z = cVar instanceof rpq.c.a;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.i;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            s();
            c(new xoq.a(yo60.j.c.a));
            e(new hpq(new qr60.a.e(ListLoadingState.RELOADING)));
            kpq kpqVar = (kpq) nn50Var.getCurrentState();
            FaveTag faveTag = kpqVar.c;
            return g(v(w(x(io.reactivex.rxjava3.core.x.x(new dzw(new yve(this, 22)).b(t(kpqVar, faveTag != null ? Integer.valueOf(faveTag.b) : null, null).m(dVar))))).l(new zj0(new fpq(a9q0.a.a, true), 12))), new defpackage.i0(this, 20), new js1(this, 28));
        }
        boolean z2 = cVar instanceof rpq.c.b;
        a9q0.c cVar2 = a9q0.c.a;
        if (!z2) {
            if (!(cVar instanceof rpq.c.C3623c)) {
                throw new NoWhenBranchMatchedException();
            }
            FaveTag faveTag2 = ((rpq.c.C3623c) cVar).b;
            s();
            e(new ipq.b.a(faveTag2));
            e(new hpq(new qr60.a.e(ListLoadingState.REFRESHING)));
            return g(v(w(x(t((kpq) nn50Var.getCurrentState(), faveTag2 != null ? Integer.valueOf(faveTag2.b) : null, null).m(dVar))).l(new zj0(new fpq(cVar2, true), 12))), new defpackage.i0(this, 20), new p41(this, 20));
        }
        ds60.f fVar = ((rpq.c.b) cVar).b;
        if ((fVar instanceof ds60.f.c) || (fVar instanceof ds60.f.d)) {
            s();
            c(new xoq.a(yo60.j.c.a));
            e(new hpq(new qr60.a.e(ListLoadingState.RELOADING)));
            kpq kpqVar2 = (kpq) nn50Var.getCurrentState();
            FaveTag faveTag3 = kpqVar2.c;
            return g(v(w(x(io.reactivex.rxjava3.core.x.x(new dzw(new sop(this, 1)).b(t(kpqVar2, faveTag3 != null ? Integer.valueOf(faveTag3.b) : null, null).m(dVar))))).l(new zj0(new fpq(cVar2, false), 12))), new defpackage.i0(this, 20), new xz(this, 21));
        }
        if (fVar instanceof ds60.f.b) {
            s();
            c(new xoq.a(yo60.j.c.a));
            e(new hpq(new qr60.a.e(ListLoadingState.REFRESHING)));
            kpq kpqVar3 = (kpq) nn50Var.getCurrentState();
            FaveTag faveTag4 = kpqVar3.c;
            return g(v(w(x(t(kpqVar3, faveTag4 != null ? Integer.valueOf(faveTag4.b) : null, null).m(dVar))).l(new zj0(new fpq(a9q0.b.a, false), 12))), new defpackage.i0(this, 20), new is1(this, 26));
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new hpq(new qr60.a.e(ListLoadingState.LOADING)));
        kpq kpqVar4 = (kpq) nn50Var.getCurrentState();
        FaveTag faveTag5 = kpqVar4.c;
        return g(new io.reactivex.rxjava3.internal.operators.single.r(x(io.reactivex.rxjava3.core.x.x(new eqz(this.j, this.k, new l2k(this, 10)).b(t(kpqVar4, faveTag5 != null ? Integer.valueOf(faveTag5.b) : null, kpqVar4.h.d).m(dVar)))), new rj4(new yad(this, 23), 13)).l(new qs6(new xr0(28), 13)), new defpackage.i0(this, 20), new wn(this, 26));
    }

    public final void s() {
        n().a(ypq.a);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.internal.operators.single.y t(kpq kpqVar, Integer num, String str) {
        String str2;
        int i;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        FaveSource faveSource;
        rsg0 z;
        FaveType faveType = kpqVar.b;
        int i2 = faveType == null ? -1 : a.$EnumSwitchMapping$0[faveType.ordinal()];
        aqw aqwVar = this.h;
        String str3 = "burger";
        if (i2 != -1) {
            FaveTag faveTag = kpqVar.c;
            Integer valueOf = faveTag != null ? Integer.valueOf(faveTag.b) : null;
            FaveType faveType2 = kpqVar.b;
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            switch (c != null ? irq.$EnumSwitchMapping$0[c.ordinal()] : -1) {
                case 1:
                    str2 = "burger";
                    break;
                case 2:
                    str2 = "marketplace";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    str2 = "bookmarks";
                    break;
                case 18:
                    str2 = "market_item";
                    break;
                case 19:
                    str2 = "market_item_album";
                    break;
                case 20:
                    str2 = "market";
                    break;
                case 21:
                    str2 = "cart";
                    break;
                default:
                    str2 = "other";
                    break;
            }
            return aqwVar.f(valueOf, faveType2, new pqq(null, str2, null, kpqVar.d, 5), str).l(new t34(new b40(18), 15));
        }
        boolean z2 = false;
        if (str != null) {
            bpn0 bpn0Var = cqm0.a;
            try {
                i = Integer.parseInt(str);
            } catch (Throwable unused) {
            }
            mobileOfficialAppsCoreNavStat$EventScreen = kpqVar.f;
            switch (mobileOfficialAppsCoreNavStat$EventScreen != null ? irq.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()] : -1) {
                case 1:
                    break;
                case 2:
                    str3 = "marketplace";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    str3 = "bookmarks";
                    break;
                case 18:
                    str3 = "market_item";
                    break;
                case 19:
                    str3 = "market_item_album";
                    break;
                case 20:
                    str3 = "market";
                    break;
                case 21:
                    str3 = "cart";
                    break;
                default:
                    str3 = "other";
                    break;
            }
            faveSource = kpqVar.d;
            String str4 = (5 & 2) == 0 ? null : str3;
            if ((5 & 8) != 0) {
                faveSource = null;
            }
            aqwVar.getClass();
            if (faveSource != null && faveSource == FaveSource.SNACKBAR) {
                z2 = true;
            }
            if (i != 0) {
                hz2 z3 = yfb.z(fdi.r(new fdi(), null, num, null, Integer.valueOf(i), 30, kqq.b, Boolean.valueOf(z2), str4, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE), new ob(28));
                z3.C(1, "photo_sizes");
                hz2 z4 = yfb.z(new fdi().s(Integer.valueOf(i), 30, num == null ? FaveGetPagesTypeDto.HINTS : null, kqq.a, num, str4), new xsq(4));
                z4.C(1, "photo_sizes");
                z = new hrt(z3, z4);
                z.q = 1;
            } else {
                z = yfb.z(fdi.r(new fdi(), null, num, null, Integer.valueOf(i), 30, kqq.b, Boolean.valueOf(z2), str4, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE), new gv3(24));
                z.C(1, "photo_sizes");
                z.q = 1;
            }
            return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.D0(z), new ho1(new la2(aqwVar), 21)).l(new sj4(new iz0(this, 29), 13));
        }
        i = 0;
        mobileOfficialAppsCoreNavStat$EventScreen = kpqVar.f;
        switch (mobileOfficialAppsCoreNavStat$EventScreen != null ? irq.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()] : -1) {
        }
        faveSource = kpqVar.d;
        if ((5 & 2) == 0) {
        }
        if ((5 & 8) != 0) {
        }
        aqwVar.getClass();
        if (faveSource != null) {
            z2 = true;
        }
        if (i != 0) {
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.D0(z), new ho1(new la2(aqwVar), 21)).l(new sj4(new iz0(this, 29), 13));
    }

    public final io.reactivex.rxjava3.internal.operators.single.o v(io.reactivex.rxjava3.internal.operators.single.y yVar) {
        return new io.reactivex.rxjava3.internal.operators.single.o(yVar, new qz(new ozh(this, 14), 15));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r w(io.reactivex.rxjava3.internal.operators.single.l lVar) {
        return new io.reactivex.rxjava3.internal.operators.single.r(lVar, new u5(new bhh(this, 14), 13));
    }

    public final io.reactivex.rxjava3.internal.operators.single.l x(io.reactivex.rxjava3.core.x xVar) {
        return xVar.h(new j41(new ayo(this, 2), 16));
    }
}
