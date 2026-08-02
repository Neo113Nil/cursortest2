package com.yandex.go.pickup_from_photo.data;

import com.yandex.go.pickup_from_photo.data.model.PhotoCoordinates;
import defpackage.atd0;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.gh00;
import defpackage.h2t;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.tcc;
import defpackage.vmb0;
import defpackage.wgb0;
import defpackage.y4a0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.search.suggest.PointAddressInteractor$updatePhotoAddressFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class b {
    public final atd0 a;
    public final h2t b;
    public final po21 c;
    public final e2t d;
    public final i e;
    public final y4a0 f;
    public final vmb0 g;
    public volatile g2t h;
    public volatile pv0 i;
    public pv0 j;
    public g2t k;

    public b(atd0 atd0Var, h2t h2tVar, po21 po21Var, e2t e2tVar, i iVar, y4a0 y4a0Var, vmb0 vmb0Var) {
        this.a = atd0Var;
        this.b = h2tVar;
        this.c = po21Var;
        this.d = e2tVar;
        this.e = iVar;
        this.f = y4a0Var;
        this.g = vmb0Var;
    }

    public final void a() {
        pv0 pv0Var = (pv0) this.e.i().orElse(null);
        if (pv0Var != null) {
            this.f.w(pv0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[LOOP:0: B:23:0x0079->B:25:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        PickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1 pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1;
        int i;
        atd0 atd0Var;
        List list2;
        if (continuationImpl instanceof PickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1) {
            pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1 = (PickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1) continuationImpl;
            int i2 = pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    atd0Var = this.a;
                    po21 po21Var = this.c;
                    pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.L$0 = list;
                    pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.L$1 = atd0Var;
                    pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.label = 1;
                    obj = ((e) po21Var).f(pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1);
                    if (obj != coroutineSingletons) {
                        list2 = list;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    Pair pair = (Pair) obj;
                    g2t g2tVar = (g2t) pair.getFirst();
                    pv0 pv0Var = (pv0) pair.getSecond();
                    this.h = g2tVar;
                    this.g.a = g2tVar.a.a.n;
                    this.i = pv0Var;
                    pv0Var.j = null;
                    pv0 pv0Var2 = this.i;
                    if (pv0Var2 != null) {
                        this.f.w(pv0Var2);
                    }
                    g2t g2tVar2 = this.h;
                    if (g2tVar2 != null) {
                        ((f2t) ((e2t) this.b.a)).b(g2tVar2);
                    }
                    return pv0Var;
                }
                atd0Var = (atd0) pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.L$1;
                list2 = (List) pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.L$0;
                kotlin.b.b(obj);
                zzs a = ((mo21) obj).a();
                RoutePointType routePointType = RoutePointType.POINT_A;
                List<PhotoCoordinates> list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (PhotoCoordinates photoCoordinates : list3) {
                    arrayList.add(new wgb0(new Float(photoCoordinates.a), new Float(photoCoordinates.b), new Float(photoCoordinates.c)));
                }
                i iVar = (i) atd0Var;
                g X = kotlinx.coroutines.flow.e.X(ru.yandex.taxi.persuggest.domain.g.l(iVar.e, a, routePointType, "auto", iVar.b.m(), null, PositionInitAction.AUTO_LOCATION, Float.valueOf(((gh00) iVar.g).j()), Action.PHOTO_FLOW, arrayList, null, 512), new PointAddressInteractor$updatePhotoAddressFlow$$inlined$flatMapLatest$1(null, iVar));
                pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.L$0 = null;
                pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.L$1 = null;
                pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.label = 2;
                obj = kotlinx.coroutines.flow.e.y(X, pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1);
            }
        }
        pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1 = new PickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1(this, continuationImpl);
        Object obj2 = pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        RoutePointType routePointType2 = RoutePointType.POINT_A;
        List<PhotoCoordinates> list32 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list32, 10));
        while (r6.hasNext()) {
        }
        i iVar2 = (i) atd0Var;
        g X2 = kotlinx.coroutines.flow.e.X(ru.yandex.taxi.persuggest.domain.g.l(iVar2.e, a2, routePointType2, "auto", iVar2.b.m(), null, PositionInitAction.AUTO_LOCATION, Float.valueOf(((gh00) iVar2.g).j()), Action.PHOTO_FLOW, arrayList2, null, 512), new PointAddressInteractor$updatePhotoAddressFlow$$inlined$flatMapLatest$1(null, iVar2));
        pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.L$0 = null;
        pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.L$1 = null;
        pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1.label = 2;
        obj2 = kotlinx.coroutines.flow.e.y(X2, pickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1);
    }

    public final void c() {
        pv0 pv0Var = this.j;
        if (pv0Var != null) {
            this.f.w(pv0Var);
        }
        g2t g2tVar = this.k;
        if (g2tVar != null) {
            ((f2t) ((e2t) this.b.a)).b(g2tVar);
        }
    }
}
