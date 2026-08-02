package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardSelectTariffSource;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.afw;
import defpackage.apw;
import defpackage.axm;
import defpackage.b64;
import defpackage.bei;
import defpackage.bvf0;
import defpackage.ck31;
import defpackage.ckw;
import defpackage.dkw;
import defpackage.fnx0;
import defpackage.gau;
import defpackage.gjw;
import defpackage.glw;
import defpackage.hjw;
import defpackage.hz40;
import defpackage.ibn;
import defpackage.ilw;
import defpackage.jl40;
import defpackage.jlw;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.kcw;
import defpackage.khe;
import defpackage.klw;
import defpackage.mi31;
import defpackage.mp60;
import defpackage.mth;
import defpackage.nnw;
import defpackage.ny61;
import defpackage.onw;
import defpackage.oow;
import defpackage.pgw;
import defpackage.pkw;
import defpackage.pnw;
import defpackage.qgw;
import defpackage.qnw;
import defpackage.qow;
import defpackage.qpa1;
import defpackage.qtb1;
import defpackage.rgw;
import defpackage.rnw;
import defpackage.sgw;
import defpackage.taw;
import defpackage.tgw;
import defpackage.tpr;
import defpackage.ugw;
import defpackage.ujw;
import defpackage.uze0;
import defpackage.vaw;
import defpackage.vgw;
import defpackage.w511;
import defpackage.w9w;
import defpackage.waw;
import defpackage.whw;
import defpackage.xaw;
import defpackage.xfw;
import defpackage.xge;
import defpackage.y1s;
import defpackage.yfw;
import defpackage.za31;
import defpackage.zew;
import defpackage.zhw;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class f {
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a a;
    public final vgw b;
    public final com.yandex.go.taxi.intercity.dashboard.impl.experiment.c c;
    public final klw d;
    public final whw e;
    public final axm f;
    public final y1s g;
    public final com.yandex.go.route.interactor.c h;
    public final com.yandex.go.route.interactor.b i;
    public final com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j j;
    public final ck31 k;
    public final uze0 l;
    public final ru.yandex.taxi.deeplinks.e m;
    public final jtq0 n;
    public final g o;
    public final zhw p;
    public final m q;
    public final RequirementsChangedNotifier r;
    public final ibn s;
    public final o t;
    public final apw u;
    public final oow v;
    public final w9w w;

    public f(com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, vgw vgwVar, com.yandex.go.taxi.intercity.dashboard.impl.experiment.c cVar, klw klwVar, whw whwVar, axm axmVar, y1s y1sVar, com.yandex.go.route.interactor.c cVar2, com.yandex.go.route.interactor.b bVar, com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar, ck31 ck31Var, uze0 uze0Var, ru.yandex.taxi.deeplinks.e eVar, jtq0 jtq0Var, g gVar, zhw zhwVar, m mVar, RequirementsChangedNotifier requirementsChangedNotifier, ibn ibnVar, o oVar, apw apwVar, oow oowVar, w9w w9wVar) {
        this.a = aVar;
        this.b = vgwVar;
        this.c = cVar;
        this.d = klwVar;
        this.e = whwVar;
        this.f = axmVar;
        this.g = y1sVar;
        this.h = cVar2;
        this.i = bVar;
        this.j = jVar;
        this.k = ck31Var;
        this.l = uze0Var;
        this.m = eVar;
        this.n = jtq0Var;
        this.o = gVar;
        this.p = zhwVar;
        this.q = mVar;
        this.r = requirementsChangedNotifier;
        this.s = ibnVar;
        this.t = oVar;
        this.u = apwVar;
        this.v = oowVar;
        this.w = w9wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(tgw tgwVar, tgw tgwVar2) {
        if (!(tgwVar instanceof pgw) || !(tgwVar2 instanceof pgw)) {
            return false;
        }
        pgw pgwVar = (pgw) tgwVar;
        pgw pgwVar2 = (pgw) tgwVar2;
        return qpa1.d(pgwVar.a() - pgwVar2.a()) && qpa1.d(pgwVar.b() - pgwVar2.b());
    }

    public static boolean e(ugw ugwVar, ugw ugwVar2) {
        if (d(ugwVar != null ? ugwVar.a : null, ugwVar2 != null ? ugwVar2.a : null)) {
            return d(ugwVar != null ? ugwVar.b : null, ugwVar2 != null ? ugwVar2.b : null);
        }
        return false;
    }

    public static boolean k(za31 za31Var, String str) {
        List list = za31Var.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((mi31) it.next()).f, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ugw ugwVar, ContinuationImpl continuationImpl) {
        IntercityDashboardInteractor$changeDashboardPoints$1 intercityDashboardInteractor$changeDashboardPoints$1;
        int i;
        Object value;
        Object value2;
        if (continuationImpl instanceof IntercityDashboardInteractor$changeDashboardPoints$1) {
            intercityDashboardInteractor$changeDashboardPoints$1 = (IntercityDashboardInteractor$changeDashboardPoints$1) continuationImpl;
            int i2 = intercityDashboardInteractor$changeDashboardPoints$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardInteractor$changeDashboardPoints$1.label = i2 - Integer.MIN_VALUE;
                IntercityDashboardInteractor$changeDashboardPoints$1 intercityDashboardInteractor$changeDashboardPoints$12 = intercityDashboardInteractor$changeDashboardPoints$1;
                Object obj = intercityDashboardInteractor$changeDashboardPoints$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardInteractor$changeDashboardPoints$12.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if (ugwVar != null) {
                    com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = this.a;
                    if (!e(ugwVar, aVar.a().d)) {
                        r0 r0Var = aVar.b;
                        do {
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, yfw.a((yfw) value, null, null, null, ugwVar, null, null, 119)));
                        r0 r0Var2 = this.d.b;
                        do {
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, ilw.a));
                        intercityDashboardInteractor$changeDashboardPoints$12.L$0 = null;
                        intercityDashboardInteractor$changeDashboardPoints$12.label = 1;
                        Object f = f(ugwVar, intercityDashboardInteractor$changeDashboardPoints$12);
                        return f == obj2 ? obj2 : f;
                    }
                }
                if (ugwVar != null) {
                    intercityDashboardInteractor$changeDashboardPoints$12.L$0 = null;
                    intercityDashboardInteractor$changeDashboardPoints$12.label = 2;
                    if (o(ugwVar, intercityDashboardInteractor$changeDashboardPoints$12) == obj2) {
                    }
                }
                return zy11Var;
            }
        }
        intercityDashboardInteractor$changeDashboardPoints$1 = new IntercityDashboardInteractor$changeDashboardPoints$1(this, continuationImpl);
        IntercityDashboardInteractor$changeDashboardPoints$1 intercityDashboardInteractor$changeDashboardPoints$122 = intercityDashboardInteractor$changeDashboardPoints$1;
        Object obj3 = intercityDashboardInteractor$changeDashboardPoints$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardInteractor$changeDashboardPoints$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final Object b(Continuation continuation) {
        waw wawVar;
        jlw a = this.d.a();
        taw tawVar = null;
        glw glwVar = a instanceof glw ? (glw) a : null;
        if (glwVar != null) {
            String str = glwVar.a;
            xaw xawVar = glwVar.d;
            hz40 hz40Var = xawVar.b;
            if (str == null || !hz40Var.a(new ckw(str))) {
                wawVar = xawVar.a;
            } else {
                ckw ckwVar = new ckw(str);
                vaw vawVar = vaw.g;
                wawVar = (waw) hz40Var.e(ckwVar, new waw(vawVar, vawVar));
            }
            vaw vawVar2 = wawVar.a;
            if (vawVar2.f) {
                tawVar = vawVar2.d;
            } else {
                vaw vawVar3 = wawVar.b;
                if (vawVar3.f) {
                    tawVar = vawVar3.d;
                }
            }
            if (tawVar != null) {
                return this.w.a.emit(tawVar, continuation);
            }
        }
        return zy11.a;
    }

    public final void c(ugw ugwVar) {
        ugw j = j();
        r(ugwVar.a, j != null ? j.a : null, PointType.SOURCE);
        r(ugwVar.b, j != null ? j.b : null, PointType.DESTINATION);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:(1:(1:(1:(3:14|15|16)(2:18|19))(4:20|21|22|(1:24)(1:25)))(10:26|27|28|29|(4:30|(4:52|(1:54)|55|(2:57|34))(1:32)|33|34)|38|(1:(3:41|(2:45|46)|47)(1:50))(1:51)|(2:49|24)|22|(0)(0)))(5:58|59|60|(1:62)(1:70)|(9:65|(3:67|(2:69|24)|28)|29|(4:30|(0)(0)|33|34)|38|(0)(0)|(0)|22|(0)(0))(2:64|25)))(2:71|72))(3:81|82|(2:84|24))|73|(2:74|(1:77)(1:76))|78|(2:80|24)|60|(0)(0)|(0)(0)))|98|6|7|(0)(0)|73|(3:74|(0)(0)|76)|78|(0)|60|(0)(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01dd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01de, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0059, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b3, code lost:
    
        if (defpackage.s8o.A(r0) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c4, code lost:
    
        defpackage.jst.e.k(r0, "Error finalizing dashboard content");
        r0 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cd, code lost:
    
        r1 = r0.getValue();
        r2 = (defpackage.jlw) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        ((defpackage.qow) r7).a(defpackage.xge.e.c);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b A[Catch: all -> 0x0059, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x0059, blocks: (B:15:0x0055, B:21:0x007b, B:22:0x0192, B:27:0x0090, B:28:0x0128, B:29:0x012a, B:30:0x012c, B:34:0x014b, B:38:0x0151, B:45:0x017e, B:46:0x0183, B:47:0x0184, B:51:0x018b, B:52:0x0136, B:55:0x013b, B:59:0x009d, B:60:0x00f8, B:62:0x00fc, B:65:0x0104, B:67:0x0114, B:72:0x00a5, B:73:0x00c0, B:74:0x00cb, B:78:0x00ea, B:82:0x00b4), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136 A[Catch: all -> 0x0059, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x0059, blocks: (B:15:0x0055, B:21:0x007b, B:22:0x0192, B:27:0x0090, B:28:0x0128, B:29:0x012a, B:30:0x012c, B:34:0x014b, B:38:0x0151, B:45:0x017e, B:46:0x0183, B:47:0x0184, B:51:0x018b, B:52:0x0136, B:55:0x013b, B:59:0x009d, B:60:0x00f8, B:62:0x00fc, B:65:0x0104, B:67:0x0114, B:72:0x00a5, B:73:0x00c0, B:74:0x00cb, B:78:0x00ea, B:82:0x00b4), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc A[Catch: all -> 0x0059, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x0059, blocks: (B:15:0x0055, B:21:0x007b, B:22:0x0192, B:27:0x0090, B:28:0x0128, B:29:0x012a, B:30:0x012c, B:34:0x014b, B:38:0x0151, B:45:0x017e, B:46:0x0183, B:47:0x0184, B:51:0x018b, B:52:0x0136, B:55:0x013b, B:59:0x009d, B:60:0x00f8, B:62:0x00fc, B:65:0x0104, B:67:0x0114, B:72:0x00a5, B:73:0x00c0, B:74:0x00cb, B:78:0x00ea, B:82:0x00b4), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104 A[Catch: all -> 0x0059, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x0059, blocks: (B:15:0x0055, B:21:0x007b, B:22:0x0192, B:27:0x0090, B:28:0x0128, B:29:0x012a, B:30:0x012c, B:34:0x014b, B:38:0x0151, B:45:0x017e, B:46:0x0183, B:47:0x0184, B:51:0x018b, B:52:0x0136, B:55:0x013b, B:59:0x009d, B:60:0x00f8, B:62:0x00fc, B:65:0x0104, B:67:0x0114, B:72:0x00a5, B:73:0x00c0, B:74:0x00cb, B:78:0x00ea, B:82:0x00b4), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab A[LOOP:1: B:74:0x00cb->B:76:0x01ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea A[EDGE_INSN: B:77:0x00ea->B:78:0x00ea BREAK  A[LOOP:1: B:74:0x00cb->B:76:0x01ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ugw ugwVar, ContinuationImpl continuationImpl) {
        IntercityDashboardInteractor$finalizeDashboardContent$1 intercityDashboardInteractor$finalizeDashboardContent$1;
        Object obj;
        Object obj2;
        int i;
        ugw ugwVar2;
        r0 r0Var;
        Object value;
        ugw ugwVar3;
        glw glwVar;
        r0 r0Var2;
        Object value2;
        jlw jlwVar;
        int i2;
        Object m;
        ugw ugwVar4 = ugwVar;
        if (continuationImpl instanceof IntercityDashboardInteractor$finalizeDashboardContent$1) {
            intercityDashboardInteractor$finalizeDashboardContent$1 = (IntercityDashboardInteractor$finalizeDashboardContent$1) continuationImpl;
            int i3 = intercityDashboardInteractor$finalizeDashboardContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                intercityDashboardInteractor$finalizeDashboardContent$1.label = i3 - Integer.MIN_VALUE;
                obj = intercityDashboardInteractor$finalizeDashboardContent$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardInteractor$finalizeDashboardContent$1.label;
                klw klwVar = this.d;
                oow oowVar = this.v;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ((qow) oowVar).d(xge.e);
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = ugwVar4;
                    intercityDashboardInteractor$finalizeDashboardContent$1.label = 1;
                    obj = o(ugwVar4, intercityDashboardInteractor$finalizeDashboardContent$1);
                    if (obj == obj2) {
                    }
                } else if (i == 1) {
                    ugwVar4 = (ugw) intercityDashboardInteractor$finalizeDashboardContent$1.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    kotlin.b.b(obj);
                    glwVar = obj instanceof glw ? (glw) obj : null;
                    if (glwVar != null) {
                        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) ((com.yandex.go.taxi.tariffs.internal.repository.k) this.l).j.c.getValue();
                        if (priceUpdate$PriceLoadingState != null) {
                            m mVar = this.q;
                            intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = null;
                            intercityDashboardInteractor$finalizeDashboardContent$1.L$1 = null;
                            intercityDashboardInteractor$finalizeDashboardContent$1.L$2 = null;
                            intercityDashboardInteractor$finalizeDashboardContent$1.L$3 = null;
                            intercityDashboardInteractor$finalizeDashboardContent$1.label = 3;
                            obj = mVar.c(glwVar, priceUpdate$PriceLoadingState, intercityDashboardInteractor$finalizeDashboardContent$1);
                            if (obj == obj2) {
                            }
                            glwVar = (glw) obj;
                        }
                        r0Var2 = klwVar.b;
                        do {
                            value2 = r0Var2.getValue();
                            jlwVar = (jlw) value2;
                            if (glwVar != null) {
                            }
                            jlwVar = glwVar;
                        } while (!r0Var2.k(value2, jlwVar));
                        afw afwVar = glwVar.f;
                        String str = afwVar.b;
                        String str2 = afwVar.a;
                        IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource = IntercityDashboardSelectTariffSource.UPDATE_DASHBOARD_CONTENT;
                        com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar = this.j;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$1 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$2 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$3 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$4 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$5 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.label = 4;
                        jVar.getClass();
                        i2 = dkw.a[intercityDashboardSelectTariffSource.ordinal()];
                        if (i2 != 1) {
                        }
                        if (m == obj2) {
                        }
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$1 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$2 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$3 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$4 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$5 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.label = 5;
                        if (b(intercityDashboardInteractor$finalizeDashboardContent$1) == obj2) {
                        }
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b64.D(intercityDashboardInteractor$finalizeDashboardContent$1.L$5);
                            kotlin.b.b(obj);
                            return obj3;
                        }
                        b64.D(intercityDashboardInteractor$finalizeDashboardContent$1.L$5);
                        kotlin.b.b(obj);
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$1 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$2 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$3 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$4 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.L$5 = null;
                        intercityDashboardInteractor$finalizeDashboardContent$1.label = 5;
                        return b(intercityDashboardInteractor$finalizeDashboardContent$1) == obj2 ? obj2 : obj3;
                    }
                    kotlin.b.b(obj);
                    glwVar = (glw) obj;
                    r0Var2 = klwVar.b;
                    do {
                        value2 = r0Var2.getValue();
                        jlwVar = (jlw) value2;
                        if (glwVar != null) {
                            String str3 = glwVar.a;
                            if (str3 == null) {
                                str3 = null;
                            }
                            if (!jl40.l(str3, klwVar.a.a().g)) {
                            }
                        }
                        jlwVar = glwVar;
                    } while (!r0Var2.k(value2, jlwVar));
                    afw afwVar2 = glwVar.f;
                    String str4 = afwVar2.b;
                    String str22 = afwVar2.a;
                    IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource2 = IntercityDashboardSelectTariffSource.UPDATE_DASHBOARD_CONTENT;
                    com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar2 = this.j;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$1 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$2 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$3 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$4 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$5 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.label = 4;
                    jVar2.getClass();
                    i2 = dkw.a[intercityDashboardSelectTariffSource2.ordinal()];
                    if (i2 != 1) {
                        m = jVar2.m(str4, str22, intercityDashboardInteractor$finalizeDashboardContent$1);
                    } else if (i2 != 2) {
                        if (i2 != 3 && i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m = jVar2.j(str4, str22, intercityDashboardSelectTariffSource2, intercityDashboardInteractor$finalizeDashboardContent$1);
                    } else {
                        m = obj3;
                    }
                    if (m == obj2) {
                    }
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$1 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$2 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$3 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$4 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.L$5 = null;
                    intercityDashboardInteractor$finalizeDashboardContent$1.label = 5;
                    if (b(intercityDashboardInteractor$finalizeDashboardContent$1) == obj2) {
                    }
                }
                ugwVar2 = (ugw) obj;
                c(ugwVar4);
                r0Var = this.a.b;
                while (true) {
                    value = r0Var.getValue();
                    ugwVar3 = ugwVar2;
                    if (!r0Var.k(value, yfw.a((yfw) value, null, null, null, ugwVar2, null, null, 119))) {
                        break;
                    }
                    ugwVar2 = ugwVar3;
                }
                intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = null;
                intercityDashboardInteractor$finalizeDashboardContent$1.L$1 = null;
                intercityDashboardInteractor$finalizeDashboardContent$1.label = 2;
                obj = n(ugwVar3, intercityDashboardInteractor$finalizeDashboardContent$1);
                if (obj == obj2) {
                }
                if (obj instanceof glw) {
                }
                if (glwVar != null) {
                }
            }
        }
        intercityDashboardInteractor$finalizeDashboardContent$1 = new IntercityDashboardInteractor$finalizeDashboardContent$1(this, continuationImpl);
        obj = intercityDashboardInteractor$finalizeDashboardContent$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardInteractor$finalizeDashboardContent$1.label;
        klw klwVar2 = this.d;
        oow oowVar2 = this.v;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        ugwVar2 = (ugw) obj;
        c(ugwVar4);
        r0Var = this.a.b;
        while (true) {
            value = r0Var.getValue();
            ugwVar3 = ugwVar2;
            if (!r0Var.k(value, yfw.a((yfw) value, null, null, null, ugwVar2, null, null, 119))) {
            }
            ugwVar2 = ugwVar3;
        }
        intercityDashboardInteractor$finalizeDashboardContent$1.L$0 = null;
        intercityDashboardInteractor$finalizeDashboardContent$1.L$1 = null;
        intercityDashboardInteractor$finalizeDashboardContent$1.label = 2;
        obj = n(ugwVar3, intercityDashboardInteractor$finalizeDashboardContent$1);
        if (obj == obj2) {
        }
        if (obj instanceof glw) {
        }
        if (glwVar != null) {
        }
    }

    public final kcw g() {
        Calendar b = this.f.b();
        if (b != null) {
            return new kcw(b, false);
        }
        if (this.g.a()) {
            return new kcw(null, true);
        }
        return null;
    }

    public final tpr h() {
        return com.yandex.go.coroutines.b.d(new c(this.f.c, this), new IntercityDashboardInteractor$getDueFlow$2(this, null));
    }

    public final ujw i() {
        mi31 mi31Var;
        fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.j.g).n();
        if (n == null || (mi31Var = n.a) == null) {
            return null;
        }
        return new ujw(mi31Var.b, mi31Var.f);
    }

    public final ugw j() {
        com.yandex.go.route.interactor.c cVar = this.h;
        Address g = cVar.g();
        sgw sgwVar = g != null ? new sgw(g) : null;
        Address d = cVar.d();
        sgw sgwVar2 = d != null ? new sgw(d) : null;
        if (sgwVar == null && sgwVar2 == null) {
            return null;
        }
        return new ugw(sgwVar, sgwVar2);
    }

    public final Object l(rnw rnwVar, Continuation continuation) {
        tgw qgwVar;
        tgw tgwVar;
        String b = this.j.b();
        if (b == null || (!b.equals("intercity") && !b.equals("intercity_preorder") && !b.equals("intercity_preorder_combo") && !b.equals("intercity_shuttle"))) {
            axm axmVar = this.f;
            if (axmVar.c()) {
                this.g.b(false);
                axmVar.a(qtb1.D);
            }
        }
        qnw qnwVar = rnwVar.a;
        pnw pnwVar = rnwVar.b;
        ugw j = j();
        tgw tgwVar2 = null;
        if (jl40.l(qnwVar, bei.G)) {
            if (j != null) {
                tgwVar = j.a;
            }
            tgwVar = null;
        } else {
            if (qnwVar instanceof nnw) {
                nnw nnwVar = (nnw) qnwVar;
                qgwVar = new rgw(nnwVar.a, nnwVar.b);
            } else if (qnwVar instanceof onw) {
                qgwVar = new qgw(((onw) qnwVar).a);
            } else {
                if (qnwVar != null) {
                    w511.b();
                    return null;
                }
                tgwVar = null;
            }
            tgwVar = qgwVar;
        }
        if (pnwVar instanceof nnw) {
            nnw nnwVar2 = (nnw) pnwVar;
            tgwVar2 = new rgw(nnwVar2.a, nnwVar2.b);
        } else if (pnwVar instanceof onw) {
            tgwVar2 = new qgw(((onw) pnwVar).a);
        } else if (pnwVar != null) {
            w511.b();
            return null;
        }
        return a(new ugw(tgwVar, tgwVar2), (ContinuationImpl) continuation);
    }

    public final Object m(boolean z, SuspendLambda suspendLambda) {
        Object value;
        Object value2;
        ugw j = j();
        if (j != null) {
            com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = this.a;
            if (!z || !e(aVar.a().d, j)) {
                r0 r0Var = aVar.b;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, yfw.a((yfw) value, null, null, null, j, null, null, 119)));
                r0 r0Var2 = this.d.b;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, ilw.a));
                return f(j, suspendLambda);
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ugw ugwVar, ContinuationImpl continuationImpl) {
        IntercityDashboardInteractor$requestDashboardContentLoading$1 intercityDashboardInteractor$requestDashboardContentLoading$1;
        int i;
        IntercityDashboardResponseDto intercityDashboardResponseDto;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof IntercityDashboardInteractor$requestDashboardContentLoading$1) {
            intercityDashboardInteractor$requestDashboardContentLoading$1 = (IntercityDashboardInteractor$requestDashboardContentLoading$1) continuationImpl;
            int i2 = intercityDashboardInteractor$requestDashboardContentLoading$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardInteractor$requestDashboardContentLoading$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = intercityDashboardInteractor$requestDashboardContentLoading$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardInteractor$requestDashboardContentLoading$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    intercityDashboardInteractor$requestDashboardContentLoading$1.L$0 = null;
                    intercityDashboardInteractor$requestDashboardContentLoading$1.label = 1;
                    obj3 = this.o.b(ugwVar, intercityDashboardInteractor$requestDashboardContentLoading$1);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                yfw yfwVar = (yfw) obj3;
                intercityDashboardResponseDto = yfwVar.c;
                if (intercityDashboardResponseDto != null) {
                    String str = intercityDashboardResponseDto.b;
                    String str2 = intercityDashboardResponseDto.a;
                    com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) this.k;
                    Iterator it = kVar.j().a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((za31) obj).d, str2)) {
                            break;
                        }
                    }
                    za31 za31Var = (za31) obj;
                    if (za31Var == null || !k(za31Var, str)) {
                        Iterator it2 = kVar.j().a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (k((za31) obj2, str)) {
                                break;
                            }
                        }
                        za31 za31Var2 = (za31) obj2;
                        String str3 = za31Var2 != null ? za31Var2.d : null;
                        jst.e.getClass();
                        yfwVar = yfw.a(yfwVar, null, null, new IntercityDashboardResponseDto(str3, intercityDashboardResponseDto.b, intercityDashboardResponseDto.c, intercityDashboardResponseDto.d, intercityDashboardResponseDto.e, intercityDashboardResponseDto.f, intercityDashboardResponseDto.g), null, null, null, HProv.PP_PASSWD_TERM);
                    }
                }
                return this.p.b(yfwVar);
            }
        }
        intercityDashboardInteractor$requestDashboardContentLoading$1 = new IntercityDashboardInteractor$requestDashboardContentLoading$1(this, continuationImpl);
        Object obj32 = intercityDashboardInteractor$requestDashboardContentLoading$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardInteractor$requestDashboardContentLoading$1.label;
        if (i != 0) {
        }
        yfw yfwVar2 = (yfw) obj32;
        intercityDashboardResponseDto = yfwVar2.c;
        if (intercityDashboardResponseDto != null) {
        }
        return this.p.b(yfwVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(ugw ugwVar, ContinuationImpl continuationImpl) {
        IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1 intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1;
        int i;
        if (continuationImpl instanceof IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1) {
            intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1 = (IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1) continuationImpl;
            int i2 = intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(ugwVar.a instanceof rgw) && !(ugwVar.b instanceof rgw)) {
                        return ugwVar;
                    }
                    IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1 intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1 = new IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1(ugwVar, this, null);
                    intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1.L$0 = null;
                    intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1.label = 1;
                    obj = bvf0.n(intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1, intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (ugw) obj;
            }
        }
        intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1 = new IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1(this, continuationImpl);
        Object obj2 = intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$1.label;
        if (i != 0) {
        }
        return (ugw) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r2 == r4) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Address address, PointType pointType, ContinuationImpl continuationImpl) {
        IntercityDashboardInteractor$setResolvedAddress$1 intercityDashboardInteractor$setResolvedAddress$1;
        Object obj;
        int i;
        ugw ugwVar;
        Object value;
        r0 r0Var;
        Object value2;
        Address address2 = address;
        if (continuationImpl instanceof IntercityDashboardInteractor$setResolvedAddress$1) {
            intercityDashboardInteractor$setResolvedAddress$1 = (IntercityDashboardInteractor$setResolvedAddress$1) continuationImpl;
            int i2 = intercityDashboardInteractor$setResolvedAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardInteractor$setResolvedAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = intercityDashboardInteractor$setResolvedAddress$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardInteractor$setResolvedAddress$1.label;
                com.yandex.go.route.interactor.b bVar = this.i;
                com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = zew.a[pointType.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        bVar.l(address2);
                        sgw sgwVar = new sgw(address2);
                        ugw ugwVar2 = aVar.a().d;
                        ugwVar = ugwVar2 != null ? new ugw(ugwVar2.a, sgwVar) : new ugw(null, sgwVar);
                        r0 r0Var2 = aVar.b;
                        do {
                            value = r0Var2.getValue();
                        } while (!r0Var2.k(value, yfw.a((yfw) value, null, null, null, ugwVar, null, null, 119)));
                        intercityDashboardInteractor$setResolvedAddress$1.L$0 = null;
                        intercityDashboardInteractor$setResolvedAddress$1.L$1 = null;
                        intercityDashboardInteractor$setResolvedAddress$1.L$2 = null;
                        intercityDashboardInteractor$setResolvedAddress$1.label = 2;
                        Object f = f(ugwVar, intercityDashboardInteractor$setResolvedAddress$1);
                        return f == obj ? obj : f;
                    }
                    mth c = this.t.c();
                    intercityDashboardInteractor$setResolvedAddress$1.L$0 = address2;
                    intercityDashboardInteractor$setResolvedAddress$1.L$1 = null;
                    intercityDashboardInteractor$setResolvedAddress$1.label = 1;
                    obj2 = kotlinx.coroutines.flow.e.y(c, intercityDashboardInteractor$setResolvedAddress$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    address2 = (Address) intercityDashboardInteractor$setResolvedAddress$1.L$0;
                    kotlin.b.b(obj2);
                }
                bVar.m(new ZoneAddress(address2, (Zone) obj2), null);
                sgw sgwVar2 = new sgw(address2);
                ugw ugwVar3 = aVar.a().d;
                ugwVar = ugwVar3 == null ? new ugw(sgwVar2, ugwVar3.b) : new ugw(sgwVar2, null);
                r0Var = aVar.b;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, yfw.a((yfw) value2, null, null, null, ugwVar, null, null, 119)));
                intercityDashboardInteractor$setResolvedAddress$1.L$0 = null;
                intercityDashboardInteractor$setResolvedAddress$1.L$1 = null;
                intercityDashboardInteractor$setResolvedAddress$1.L$2 = null;
                intercityDashboardInteractor$setResolvedAddress$1.label = 2;
                Object f2 = f(ugwVar, intercityDashboardInteractor$setResolvedAddress$1);
                if (f2 == obj) {
                }
            }
        }
        intercityDashboardInteractor$setResolvedAddress$1 = new IntercityDashboardInteractor$setResolvedAddress$1(this, continuationImpl);
        Object obj22 = intercityDashboardInteractor$setResolvedAddress$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardInteractor$setResolvedAddress$1.label;
        com.yandex.go.route.interactor.b bVar2 = this.i;
        com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar2 = this.a;
        if (i != 0) {
        }
        bVar2.m(new ZoneAddress(address2, (Zone) obj22), null);
        sgw sgwVar22 = new sgw(address2);
        ugw ugwVar32 = aVar2.a().d;
        ugwVar = ugwVar32 == null ? new ugw(sgwVar22, ugwVar32.b) : new ugw(sgwVar22, null);
        r0Var = aVar2.b;
        do {
            value2 = r0Var.getValue();
        } while (!r0Var.k(value2, yfw.a((yfw) value2, null, null, null, ugwVar, null, null, 119)));
        intercityDashboardInteractor$setResolvedAddress$1.L$0 = null;
        intercityDashboardInteractor$setResolvedAddress$1.L$1 = null;
        intercityDashboardInteractor$setResolvedAddress$1.L$2 = null;
        intercityDashboardInteractor$setResolvedAddress$1.label = 2;
        Object f22 = f(ugwVar, intercityDashboardInteractor$setResolvedAddress$1);
        if (f22 == obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ContinuationImpl continuationImpl) {
        IntercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1 intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1;
        int i;
        boolean i2;
        yfw a;
        Object value;
        if (continuationImpl instanceof IntercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1) {
            intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1 = (IntercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1) continuationImpl;
            int i3 = intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1.label = i3 - Integer.MIN_VALUE;
                Object obj = intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1.label;
                com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar = this.j;
                if (i != 0) {
                    kotlin.b.b(obj);
                    intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1.label = 1;
                    String b = jVar.b();
                    Object obj2 = zy11.a;
                    if (b != null) {
                        jlw a2 = this.d.a();
                        String str = a2 instanceof glw ? ((glw) a2).f.a : null;
                        IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource = IntercityDashboardSelectTariffSource.SUMMARY;
                        int i4 = dkw.a[intercityDashboardSelectTariffSource.ordinal()];
                        if (i4 == 1) {
                            obj2 = jVar.m(b, str, intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1);
                        } else if (i4 != 2) {
                            if (i4 != 3 && i4 != 4) {
                                w511.b();
                                return null;
                            }
                            obj2 = jVar.j(b, str, intercityDashboardSelectTariffSource, intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1);
                        }
                    }
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                i2 = jVar.i();
                axm axmVar = this.f;
                if (i2) {
                    this.g.b(false);
                    axmVar.a(qtb1.D);
                }
                com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = this.a;
                a = aVar.a();
                if (a.c != null) {
                    return Boolean.FALSE;
                }
                ugw j = j();
                Calendar b2 = axmVar.b();
                Integer a3 = this.u.a(a.c, a.g);
                boolean z = (jl40.l(j, a.d) && jl40.l(b2, a.e) && jl40.l(a3, a.j)) ? false : true;
                if (z) {
                    r0 r0Var = aVar.b;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, yfw.a((yfw) value, null, a3, null, j, b2, null, 101)));
                }
                return Boolean.valueOf(!z);
            }
        }
        intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1 = new IntercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1(this, continuationImpl);
        Object obj3 = intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardInteractor$updateDashboardParamsOnReturnFromSummary$1.label;
        com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar2 = this.j;
        if (i != 0) {
        }
        i2 = jVar2.i();
        axm axmVar2 = this.f;
        if (i2) {
        }
        com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar2 = this.a;
        a = aVar2.a();
        if (a.c != null) {
        }
    }

    public final void r(tgw tgwVar, tgw tgwVar2, PointType pointType) {
        com.yandex.go.route.interactor.b bVar = this.i;
        if (tgwVar == null && tgwVar2 != null && pointType == PointType.DESTINATION) {
            bVar.j();
            return;
        }
        if (!(tgwVar instanceof sgw) || d(tgwVar2, tgwVar)) {
            return;
        }
        int i = zew.a[pointType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                bVar.l(((sgw) tgwVar).a);
                return;
            } else {
                w511.b();
                return;
            }
        }
        Address address = ((sgw) tgwVar).a;
        Zone f = this.t.f(address.getZoneName());
        if (f != null) {
            bVar.m(new ZoneAddress(address, f), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x009c, code lost:
    
        if (r2 == r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d9, code lost:
    
        if (r7 == r4) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, ContinuationImpl continuationImpl) {
        IntercityDashboardInteractor$updatePriceLoadingState$1 intercityDashboardInteractor$updatePriceLoadingState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        int i3;
        Object obj;
        gjw gjwVar;
        List list;
        List list2;
        Iterator it;
        IntercityDashboardResponseDto intercityDashboardResponseDto;
        Object obj2;
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
        String str;
        String str2;
        r0 r0Var;
        Object value;
        int i4;
        List list3;
        Iterator it2;
        Object obj3;
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto selectorItemDto;
        if (continuationImpl instanceof IntercityDashboardInteractor$updatePriceLoadingState$1) {
            intercityDashboardInteractor$updatePriceLoadingState$1 = (IntercityDashboardInteractor$updatePriceLoadingState$1) continuationImpl;
            int i5 = intercityDashboardInteractor$updatePriceLoadingState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                intercityDashboardInteractor$updatePriceLoadingState$1.label = i5 - Integer.MIN_VALUE;
                Object obj4 = intercityDashboardInteractor$updatePriceLoadingState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardInteractor$updatePriceLoadingState$1.label;
                com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar = this.j;
                Object obj5 = zy11.a;
                klw klwVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    if (priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING) {
                        ((qow) this.v).d(khe.e);
                    }
                    jlw a = klwVar.a();
                    glw glwVar = a instanceof glw ? (glw) a : null;
                    if (glwVar == null) {
                        return obj5;
                    }
                    intercityDashboardInteractor$updatePriceLoadingState$1.L$0 = null;
                    intercityDashboardInteractor$updatePriceLoadingState$1.L$1 = null;
                    intercityDashboardInteractor$updatePriceLoadingState$1.label = 1;
                    obj4 = this.q.c(glwVar, priceUpdate$PriceLoadingState, intercityDashboardInteractor$updatePriceLoadingState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj4);
                            return obj4;
                        }
                        kotlin.b.b(obj4);
                        intercityDashboardInteractor$updatePriceLoadingState$1.L$0 = null;
                        intercityDashboardInteractor$updatePriceLoadingState$1.L$1 = null;
                        intercityDashboardInteractor$updatePriceLoadingState$1.L$2 = null;
                        intercityDashboardInteractor$updatePriceLoadingState$1.L$3 = null;
                        intercityDashboardInteractor$updatePriceLoadingState$1.label = 3;
                        Object f = jVar.f(intercityDashboardInteractor$updatePriceLoadingState$1);
                        return f == coroutineSingletons ? coroutineSingletons : f;
                    }
                    kotlin.b.b(obj4);
                }
                glw glwVar2 = (glw) obj4;
                klwVar.b(new gau(22, glwVar2));
                mp60 mp60Var = glwVar2.c;
                Object[] objArr = mp60Var.a;
                i2 = mp60Var.b;
                i3 = 0;
                while (true) {
                    if (i3 < i2) {
                        obj = null;
                        break;
                    }
                    obj = objArr[i3];
                    if (((hjw) obj) instanceof gjw) {
                        break;
                    }
                    i3++;
                }
                if (!(obj instanceof gjw)) {
                    obj = null;
                }
                gjwVar = (gjw) obj;
                if (gjwVar != null && (list = gjwVar.b) != null) {
                    list2 = list;
                    if ((list2 instanceof Collection) || !list2.isEmpty()) {
                        it = list2.iterator();
                        while (it.hasNext()) {
                            if (((pkw) it.next()).c) {
                                break;
                            }
                        }
                    }
                    intercityDashboardInteractor$updatePriceLoadingState$1.L$0 = null;
                    intercityDashboardInteractor$updatePriceLoadingState$1.L$1 = null;
                    intercityDashboardInteractor$updatePriceLoadingState$1.L$2 = null;
                    intercityDashboardInteractor$updatePriceLoadingState$1.L$3 = null;
                    intercityDashboardInteractor$updatePriceLoadingState$1.label = 2;
                    com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = this.a;
                    intercityDashboardResponseDto = aVar.a().c;
                    if (intercityDashboardResponseDto != null) {
                        intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity = null;
                    } else {
                        Iterator it3 = intercityDashboardResponseDto.d.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            if (((i0) obj2) instanceof IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity) {
                                break;
                            }
                        }
                        if (!(obj2 instanceof IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity)) {
                            obj2 = null;
                        }
                        intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity) obj2;
                    }
                    str = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity == null ? intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.b : null;
                    if (intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity != null && (list3 = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.a) != null) {
                        it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (jl40.l(((IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto) obj3).a, str)) {
                                break;
                            }
                        }
                        selectorItemDto = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto) obj3;
                        if (selectorItemDto != null) {
                            str2 = selectorItemDto.b;
                            if (str != null && str2 != null) {
                                r0Var = aVar.b;
                                do {
                                    value = r0Var.getValue();
                                } while (!r0Var.k(value, yfw.a((yfw) value, new xfw(str, str2), null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD)));
                                IntercityDashboardResponseDto intercityDashboardResponseDto2 = aVar.a().c;
                                String str3 = intercityDashboardResponseDto2 == null ? intercityDashboardResponseDto2.a : null;
                                IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource = IntercityDashboardSelectTariffSource.UPDATE_DASHBOARD_CONTENT;
                                jVar.getClass();
                                i4 = dkw.a[intercityDashboardSelectTariffSource.ordinal()];
                                if (i4 != 1) {
                                    obj5 = jVar.m(str2, str3, intercityDashboardInteractor$updatePriceLoadingState$1);
                                } else if (i4 == 2) {
                                    pkw d = com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j.d(jVar.e(), str);
                                    if (d != null) {
                                        String str4 = d.b;
                                        jVar.k(d, intercityDashboardSelectTariffSource);
                                        jVar.a.c(d.a, str4);
                                        if (jVar.h(str4)) {
                                            obj5 = jVar.l(str4, str3, SelectionOrigin.USER, intercityDashboardInteractor$updatePriceLoadingState$1);
                                        }
                                    }
                                } else {
                                    if (i4 != 3 && i4 != 4) {
                                        w511.b();
                                        return null;
                                    }
                                    obj5 = jVar.j(str2, str3, intercityDashboardSelectTariffSource, intercityDashboardInteractor$updatePriceLoadingState$1);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != null) {
                        r0Var = aVar.b;
                        do {
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, yfw.a((yfw) value, new xfw(str, str2), null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD)));
                        IntercityDashboardResponseDto intercityDashboardResponseDto22 = aVar.a().c;
                        if (intercityDashboardResponseDto22 == null) {
                        }
                        IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource2 = IntercityDashboardSelectTariffSource.UPDATE_DASHBOARD_CONTENT;
                        jVar.getClass();
                        i4 = dkw.a[intercityDashboardSelectTariffSource2.ordinal()];
                        if (i4 != 1) {
                        }
                    }
                }
                intercityDashboardInteractor$updatePriceLoadingState$1.L$0 = null;
                intercityDashboardInteractor$updatePriceLoadingState$1.L$1 = null;
                intercityDashboardInteractor$updatePriceLoadingState$1.L$2 = null;
                intercityDashboardInteractor$updatePriceLoadingState$1.L$3 = null;
                intercityDashboardInteractor$updatePriceLoadingState$1.label = 3;
                Object f2 = jVar.f(intercityDashboardInteractor$updatePriceLoadingState$1);
                if (f2 == coroutineSingletons) {
                }
            }
        }
        intercityDashboardInteractor$updatePriceLoadingState$1 = new IntercityDashboardInteractor$updatePriceLoadingState$1(this, continuationImpl);
        Object obj42 = intercityDashboardInteractor$updatePriceLoadingState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardInteractor$updatePriceLoadingState$1.label;
        com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar2 = this.j;
        Object obj52 = zy11.a;
        klw klwVar2 = this.d;
        if (i != 0) {
        }
        glw glwVar22 = (glw) obj42;
        klwVar2.b(new gau(22, glwVar22));
        mp60 mp60Var2 = glwVar22.c;
        Object[] objArr2 = mp60Var2.a;
        i2 = mp60Var2.b;
        i3 = 0;
        while (true) {
            if (i3 < i2) {
            }
            i3++;
        }
        if (!(obj instanceof gjw)) {
        }
        gjwVar = (gjw) obj;
        if (gjwVar != null) {
            list2 = list;
            if (list2 instanceof Collection) {
            }
            it = list2.iterator();
            while (it.hasNext()) {
            }
            intercityDashboardInteractor$updatePriceLoadingState$1.L$0 = null;
            intercityDashboardInteractor$updatePriceLoadingState$1.L$1 = null;
            intercityDashboardInteractor$updatePriceLoadingState$1.L$2 = null;
            intercityDashboardInteractor$updatePriceLoadingState$1.L$3 = null;
            intercityDashboardInteractor$updatePriceLoadingState$1.label = 2;
            com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar2 = this.a;
            intercityDashboardResponseDto = aVar2.a().c;
            if (intercityDashboardResponseDto != null) {
            }
            if (intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity == null) {
            }
            if (intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity != null) {
                it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                selectorItemDto = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto) obj3;
                if (selectorItemDto != null) {
                }
            }
            str2 = null;
            if (str != null) {
            }
        }
        intercityDashboardInteractor$updatePriceLoadingState$1.L$0 = null;
        intercityDashboardInteractor$updatePriceLoadingState$1.L$1 = null;
        intercityDashboardInteractor$updatePriceLoadingState$1.L$2 = null;
        intercityDashboardInteractor$updatePriceLoadingState$1.L$3 = null;
        intercityDashboardInteractor$updatePriceLoadingState$1.label = 3;
        Object f22 = jVar2.f(intercityDashboardInteractor$updatePriceLoadingState$1);
        if (f22 == coroutineSingletons) {
        }
    }
}
