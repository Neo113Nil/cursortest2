package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.ah00;
import defpackage.cwa1;
import defpackage.d0l0;
import defpackage.fvr;
import defpackage.gh00;
import defpackage.j73;
import defpackage.mo21;
import defpackage.nk2;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tcc;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class k {
    public final ah00 a;
    public final fvr b;
    public final com.yandex.go.route.interactor.b c;
    public final po21 d;

    public k(ah00 ah00Var, fvr fvrVar, com.yandex.go.route.interactor.b bVar, po21 po21Var) {
        this.a = ah00Var;
        this.b = fvrVar;
        this.c = bVar;
        this.d = po21Var;
    }

    public final void a() {
        BoundingBox a;
        d0l0 c = this.c.c();
        Address h = c.h();
        zzs B = h != null ? h.B() : null;
        Address b = c.b();
        List A = j73.A(new zzs[]{B, b != null ? b.B() : null});
        if (((ArrayList) A).isEmpty()) {
            a = null;
        } else {
            ArrayList arrayList = new ArrayList(tcc.n(A, 10));
            Iterator it = A.iterator();
            while (it.hasNext()) {
                arrayList.add(cwa1.d((zzs) it.next()));
            }
            a = ru.yandex.taxi.map_common.map.k.a(new nk2(arrayList, 7));
        }
        if (a == null) {
            return;
        }
        ((gh00) this.a).A(a, null);
        this.b.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MobilityHubMapCameraInteractor$focusOnUserLocation$1 mobilityHubMapCameraInteractor$focusOnUserLocation$1;
        int i;
        if (continuationImpl instanceof MobilityHubMapCameraInteractor$focusOnUserLocation$1) {
            mobilityHubMapCameraInteractor$focusOnUserLocation$1 = (MobilityHubMapCameraInteractor$focusOnUserLocation$1) continuationImpl;
            int i2 = mobilityHubMapCameraInteractor$focusOnUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubMapCameraInteractor$focusOnUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubMapCameraInteractor$focusOnUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubMapCameraInteractor$focusOnUserLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobilityHubMapCameraInteractor$focusOnUserLocation$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.d).g(mobilityHubMapCameraInteractor$focusOnUserLocation$1);
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
                ((gh00) this.a).D(ru.yandex.taxi.map.utils.a.G((mo21) obj), 17.0f, 300.0f, null);
                this.b.a(true);
                return zy11.a;
            }
        }
        mobilityHubMapCameraInteractor$focusOnUserLocation$1 = new MobilityHubMapCameraInteractor$focusOnUserLocation$1(this, continuationImpl);
        Object obj2 = mobilityHubMapCameraInteractor$focusOnUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubMapCameraInteractor$focusOnUserLocation$1.label;
        if (i != 0) {
        }
        ((gh00) this.a).D(ru.yandex.taxi.map.utils.a.G((mo21) obj2), 17.0f, 300.0f, null);
        this.b.a(true);
        return zy11.a;
    }
}
