package com.yandex.go.taxi.order.details.v1.elements.source;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.e;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DetailsCardSourceStyleInteractor$special$$inlined$map$1$2$1 detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1;
        int i;
        boolean z;
        if (continuation instanceof DetailsCardSourceStyleInteractor$special$$inlined$map$1$2$1) {
            detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1 = (DetailsCardSourceStyleInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((e) it.next()).getB() == ChangeOrderState$Source.SOURCE_POINT) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    Boolean valueOf = Boolean.valueOf(z);
                    detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1 = new DetailsCardSourceStyleInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardSourceStyleInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
