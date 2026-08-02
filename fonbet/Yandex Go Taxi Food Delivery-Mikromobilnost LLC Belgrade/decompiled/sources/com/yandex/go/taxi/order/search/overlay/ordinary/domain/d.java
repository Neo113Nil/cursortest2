package com.yandex.go.taxi.order.search.overlay.ordinary.domain;

import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a58;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.gpc;
import defpackage.hbp0;
import defpackage.ike;
import defpackage.iup0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ud80;
import defpackage.uyj;
import defpackage.v48;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class d {
    public final iup0 a;
    public final gpc b;
    public final ud80 c;
    public final ru.yandex.taxi.map.a d;
    public final com.yandex.go.navigation.screen.c e;
    public final ike f;
    public pzt0 g;
    public final r0 h;
    public final gci0 i;
    public final r0 j;
    public final gci0 k;

    public d(iup0 iup0Var, gpc gpcVar, ud80 ud80Var, ru.yandex.taxi.map.a aVar, com.yandex.go.navigation.screen.c cVar, tt2 tt2Var) {
        this.a = iup0Var;
        this.b = gpcVar;
        this.c = ud80Var;
        this.d = aVar;
        this.e = cVar;
        tt2Var.getClass();
        this.f = bvf0.a(uyj.a.plus(jl40.a()));
        r0 c = bvf0.c(Boolean.TRUE);
        this.h = c;
        this.i = e.d(c);
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.j = c2;
        this.k = e.d(c2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, DriverCandidate driverCandidate, ContinuationImpl continuationImpl) {
        OrdinarySearchInteractor$createCandidateImageProvider$1 ordinarySearchInteractor$createCandidateImageProvider$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof OrdinarySearchInteractor$createCandidateImageProvider$1) {
            ordinarySearchInteractor$createCandidateImageProvider$1 = (OrdinarySearchInteractor$createCandidateImageProvider$1) continuationImpl;
            int i2 = ordinarySearchInteractor$createCandidateImageProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordinarySearchInteractor$createCandidateImageProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ordinarySearchInteractor$createCandidateImageProvider$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordinarySearchInteractor$createCandidateImageProvider$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (driverCandidate == null) {
                        return null;
                    }
                    v48 v48Var = new v48(driverCandidate.d, driverCandidate.b, null);
                    ru.yandex.taxi.map.a aVar = dVar.d;
                    ordinarySearchInteractor$createCandidateImageProvider$1.L$0 = null;
                    ordinarySearchInteractor$createCandidateImageProvider$1.L$1 = null;
                    ordinarySearchInteractor$createCandidateImageProvider$1.label = 1;
                    obj = aVar.a(v48Var, ordinarySearchInteractor$createCandidateImageProvider$1);
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
                return ImageProvider.fromBitmap(((a58) obj).a);
            }
        }
        ordinarySearchInteractor$createCandidateImageProvider$1 = new OrdinarySearchInteractor$createCandidateImageProvider$1(dVar, continuationImpl);
        Object obj2 = ordinarySearchInteractor$createCandidateImageProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordinarySearchInteractor$createCandidateImageProvider$1.label;
        if (i != 0) {
        }
        return ImageProvider.fromBitmap(((a58) obj2).a);
    }

    public final void b() {
        ud80 ud80Var = this.c;
        if (ud80Var.h == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            hbp0 hbp0Var = ud80Var.a.a;
            ud80Var.b.getClass();
            ud80Var.h = tje.N(hbp0Var, uyj.a, null, new OrdinarySearchAnalytics$registerForCurrentSearchState$1(ud80Var, linkedHashMap, linkedHashMap2, null), 2);
        }
        this.g = tje.N(this.f, null, null, new OrdinarySearchInteractor$registerUpdates$1(this, null), 3);
    }
}
