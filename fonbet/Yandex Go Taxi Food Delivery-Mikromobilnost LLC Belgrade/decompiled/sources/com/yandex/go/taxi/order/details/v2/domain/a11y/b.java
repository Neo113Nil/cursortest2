package com.yandex.go.taxi.order.details.v2.domain.a11y;

import android.content.Context;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.bvf0;
import defpackage.o2y0;
import defpackage.tt2;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes14.dex */
public final class b {
    public final Context a;
    public final o2y0 b;
    public final e c;
    public final c d;
    public final tt2 e;

    public b(Context context, o2y0 o2y0Var, e eVar, c cVar, tt2 tt2Var) {
        this.a = context;
        this.b = o2y0Var;
        this.c = eVar;
        this.d = cVar;
        this.e = tt2Var;
    }

    public final void a(RideCardPresentationType rideCardPresentationType) {
        e eVar = this.c;
        ArrayList arrayList = eVar.i;
        RideCardPresentationType rideCardPresentationType2 = RideCardPresentationType.DETAILS;
        if (rideCardPresentationType == rideCardPresentationType2) {
            eVar.a(rideCardPresentationType2);
            eVar.b(RideCardPresentationType.COMPACT);
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        if (arrayList.isEmpty()) {
            eVar.b.c.remove(eVar.j);
        }
    }

    public final Object b(RideCardPresentationType rideCardPresentationType, SuspendLambda suspendLambda) {
        return bvf0.n(new RideCardAccessibilityInteractor$startA11y$2(this, rideCardPresentationType, null), suspendLambda);
    }
}
