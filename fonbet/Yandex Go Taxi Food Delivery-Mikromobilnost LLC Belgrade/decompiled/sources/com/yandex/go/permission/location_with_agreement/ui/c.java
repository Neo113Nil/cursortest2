package com.yandex.go.permission.location_with_agreement.ui;

import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementExperiment;
import defpackage.ad5;
import defpackage.bd;
import defpackage.bk1;
import defpackage.ed;
import defpackage.fd;
import defpackage.hdz;
import defpackage.jbh;
import defpackage.jbz;
import defpackage.kdz;
import defpackage.kk5;
import defpackage.lbz;
import defpackage.naz;
import defpackage.ny61;
import defpackage.qwt;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.uyj;
import defpackage.xpy;
import defpackage.zy11;
import defpackage.zzv0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.source.domain.h;

/* loaded from: classes13.dex */
public final class c extends ad5 {
    public final kdz A;
    public final ru.yandex.taxi.systemrequeirements.location.c B;
    public final ed C;
    public final lbz D;
    public final jbz E;
    public final zzv0 F;
    public final h G;
    public final com.yandex.go.permission.location_with_agreement.analytics.a H;
    public final t1b0 I;
    public final naz x;
    public final bd y;
    public final bk1 z;

    public c(naz nazVar, bd bdVar, bk1 bk1Var, kdz kdzVar, ru.yandex.taxi.systemrequeirements.location.c cVar, ed edVar, lbz lbzVar, jbz jbzVar, zzv0 zzv0Var, h hVar, com.yandex.go.permission.location_with_agreement.analytics.a aVar, rqo rqoVar) {
        super(hdz.class);
        this.x = nazVar;
        this.y = bdVar;
        this.z = bk1Var;
        this.A = kdzVar;
        this.B = cVar;
        this.C = edVar;
        this.D = lbzVar;
        this.E = jbzVar;
        this.F = zzv0Var;
        this.G = hVar;
        this.H = aVar;
        this.I = ((jbh) rqoVar).e(ExplainingLocationPermissionScreenWithAgreementExperiment.k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r12 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(c cVar, ContinuationImpl continuationImpl) {
        LocationWithAgreementPresenter$createState$1 locationWithAgreementPresenter$createState$1;
        int i;
        kdz kdzVar;
        cVar.getClass();
        if (continuationImpl instanceof LocationWithAgreementPresenter$createState$1) {
            locationWithAgreementPresenter$createState$1 = (LocationWithAgreementPresenter$createState$1) continuationImpl;
            int i2 = locationWithAgreementPresenter$createState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationWithAgreementPresenter$createState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationWithAgreementPresenter$createState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationWithAgreementPresenter$createState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kdzVar = cVar.A;
                    t1b0 t1b0Var = cVar.I;
                    locationWithAgreementPresenter$createState$1.L$0 = kdzVar;
                    locationWithAgreementPresenter$createState$1.label = 1;
                    obj = t1b0Var.b(locationWithAgreementPresenter$createState$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kdzVar = (kdz) locationWithAgreementPresenter$createState$1.L$0;
                    kotlin.b.b(obj);
                }
                kdz kdzVar2 = kdzVar;
                bd bdVar = cVar.y;
                jbz jbzVar = cVar.E;
                locationWithAgreementPresenter$createState$1.L$0 = null;
                locationWithAgreementPresenter$createState$1.label = 2;
                kdzVar2.d.getClass();
                Object k0 = tje.k0(uyj.a, new LocationWithAgreementViewStateFactory$create$2((ExplainingLocationPermissionScreenWithAgreementExperiment) obj, jbzVar, kdzVar2, bdVar, null), locationWithAgreementPresenter$createState$1);
                return k0 != coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        locationWithAgreementPresenter$createState$1 = new LocationWithAgreementPresenter$createState$1(cVar, continuationImpl);
        Object obj2 = locationWithAgreementPresenter$createState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationWithAgreementPresenter$createState$1.label;
        if (i != 0) {
        }
        kdz kdzVar22 = kdzVar;
        bd bdVar2 = cVar.y;
        jbz jbzVar2 = cVar.E;
        locationWithAgreementPresenter$createState$1.L$0 = null;
        locationWithAgreementPresenter$createState$1.label = 2;
        kdzVar22.d.getClass();
        Object k02 = tje.k0(uyj.a, new LocationWithAgreementViewStateFactory$create$2((ExplainingLocationPermissionScreenWithAgreementExperiment) obj2, jbzVar2, kdzVar22, bdVar2, null), locationWithAgreementPresenter$createState$1);
        if (k02 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0047, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(c cVar, ContinuationImpl continuationImpl) {
        LocationWithAgreementPresenter$finalize$1 locationWithAgreementPresenter$finalize$1;
        int i;
        long j;
        cVar.getClass();
        if (continuationImpl instanceof LocationWithAgreementPresenter$finalize$1) {
            locationWithAgreementPresenter$finalize$1 = (LocationWithAgreementPresenter$finalize$1) continuationImpl;
            int i2 = locationWithAgreementPresenter$finalize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationWithAgreementPresenter$finalize$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationWithAgreementPresenter$finalize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationWithAgreementPresenter$finalize$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = cVar.I;
                    locationWithAgreementPresenter$finalize$1.label = 1;
                    obj = t1b0Var.b(locationWithAgreementPresenter$finalize$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                j = ((ExplainingLocationPermissionScreenWithAgreementExperiment) obj).i == null ? (r13.a + r13.b) * 1000 : 0L;
                if (j != 0) {
                    bd bdVar = cVar.y;
                    if (bdVar != null) {
                        ((fd) cVar.C).d(bdVar, null);
                        ((com.yandex.go.agreement.interactor.a) cVar.z).a(bdVar);
                    }
                    kk5 kk5Var = cVar.x.a;
                    if (kk5Var.u()) {
                        kk5Var.r(new xpy(27));
                    }
                    return zy11.a;
                }
                ((hdz) cVar.Dg()).Gc();
                cVar.H.e();
                o oVar = new o(e.T(e.X(com.yandex.go.coroutines.b.k(h.a(cVar.G), j, null), new LocationWithAgreementPresenter$finalize$$inlined$flatMapLatest$1(cVar, null)), 1), new LocationWithAgreementPresenter$finalize$$inlined$safeCollect$1(cVar, null));
                qwt qwtVar = new qwt(22, cVar);
                locationWithAgreementPresenter$finalize$1.L$0 = null;
                locationWithAgreementPresenter$finalize$1.J$0 = j;
                locationWithAgreementPresenter$finalize$1.label = 2;
                Object collect = oVar.collect(qwtVar, locationWithAgreementPresenter$finalize$1);
                return collect == coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        locationWithAgreementPresenter$finalize$1 = new LocationWithAgreementPresenter$finalize$1(cVar, continuationImpl);
        Object obj2 = locationWithAgreementPresenter$finalize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationWithAgreementPresenter$finalize$1.label;
        if (i != 0) {
        }
        if (((ExplainingLocationPermissionScreenWithAgreementExperiment) obj2).i == null) {
        }
        if (j != 0) {
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.H.a();
        r0 r0Var = this.D.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
