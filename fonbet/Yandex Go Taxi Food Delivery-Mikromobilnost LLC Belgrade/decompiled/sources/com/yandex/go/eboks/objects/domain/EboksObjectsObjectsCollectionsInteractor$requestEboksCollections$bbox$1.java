package com.yandex.go.eboks.objects.domain;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.VisibleRegion;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.uc4;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luc4;", "<anonymous>", "(Ltse;)Luc4;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.domain.EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1", f = "EboksObjectsObjectsCollectionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1 extends SuspendLambda implements wls {
    final /* synthetic */ VisibleRegion $current;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1(n nVar, VisibleRegion visibleRegion, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$current = visibleRegion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1(this.this$0, this.$current, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Double valueOf;
        Double valueOf2;
        Double valueOf3;
        Double valueOf4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        n nVar = this.this$0;
        VisibleRegion visibleRegion = this.$current;
        nVar.getClass();
        List g = scc.g(visibleRegion.getTopLeft(), visibleRegion.getTopRight(), visibleRegion.getBottomRight(), visibleRegion.getBottomLeft());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : g) {
            Point point = (Point) obj2;
            if (Math.abs(point.getLatitude()) <= Double.MAX_VALUE && Math.abs(point.getLongitude()) <= Double.MAX_VALUE) {
                arrayList.add(obj2);
            }
        }
        Point point2 = (Point) kotlin.collections.a.R(arrayList);
        if (point2 == null) {
            point2 = visibleRegion.getTopLeft();
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            double latitude = ((Point) it.next()).getLatitude();
            while (it.hasNext()) {
                latitude = Math.min(latitude, ((Point) it.next()).getLatitude());
            }
            valueOf = Double.valueOf(latitude);
        } else {
            valueOf = null;
        }
        double doubleValue = valueOf != null ? valueOf.doubleValue() : point2.getLatitude();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            double longitude = ((Point) it2.next()).getLongitude();
            while (it2.hasNext()) {
                longitude = Math.min(longitude, ((Point) it2.next()).getLongitude());
            }
            valueOf2 = Double.valueOf(longitude);
        } else {
            valueOf2 = null;
        }
        zzs E = ru.yandex.taxi.map.utils.a.E(new Point(doubleValue, valueOf2 != null ? valueOf2.doubleValue() : point2.getLongitude()), null);
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            double latitude2 = ((Point) it3.next()).getLatitude();
            while (it3.hasNext()) {
                latitude2 = Math.max(latitude2, ((Point) it3.next()).getLatitude());
            }
            valueOf3 = Double.valueOf(latitude2);
        } else {
            valueOf3 = null;
        }
        double doubleValue2 = valueOf3 != null ? valueOf3.doubleValue() : point2.getLatitude();
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            double longitude2 = ((Point) it4.next()).getLongitude();
            while (it4.hasNext()) {
                longitude2 = Math.max(longitude2, ((Point) it4.next()).getLongitude());
            }
            valueOf4 = Double.valueOf(longitude2);
        } else {
            valueOf4 = null;
        }
        return new uc4(E, ru.yandex.taxi.map.utils.a.E(new Point(doubleValue2, valueOf4 != null ? valueOf4.doubleValue() : point2.getLongitude()), null));
    }
}
