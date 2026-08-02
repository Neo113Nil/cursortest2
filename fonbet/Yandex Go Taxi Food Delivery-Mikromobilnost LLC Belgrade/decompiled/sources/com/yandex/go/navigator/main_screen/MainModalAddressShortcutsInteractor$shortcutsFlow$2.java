package com.yandex.go.navigator.main_screen;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.geometry.Point;
import defpackage.cwa1;
import defpackage.h71;
import defpackage.i71;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/yandex/go/address/models/PlainAddress;", "addresses", "Lcom/yandex/mapkit/geometry/Point;", "srcPoint", "Li71;", "<anonymous>", "(Ljava/util/List;Lcom/yandex/mapkit/geometry/Point;)Li71;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainModalAddressShortcutsInteractor$shortcutsFlow$2", f = "MainModalAddressShortcutsInteractor.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainModalAddressShortcutsInteractor$shortcutsFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainModalAddressShortcutsInteractor$shortcutsFlow$2(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainModalAddressShortcutsInteractor$shortcutsFlow$2 mainModalAddressShortcutsInteractor$shortcutsFlow$2 = new MainModalAddressShortcutsInteractor$shortcutsFlow$2(this.this$0, (Continuation) obj3);
        mainModalAddressShortcutsInteractor$shortcutsFlow$2.L$0 = (List) obj;
        mainModalAddressShortcutsInteractor$shortcutsFlow$2.L$1 = (Point) obj2;
        return mainModalAddressShortcutsInteractor$shortcutsFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00b5 -> B:5:0x00b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        Iterator it;
        Collection collection;
        LocalizedValue timeWithTraffic;
        List list = (List) this.L$0;
        Point point = (Point) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (list == null || list.isEmpty()) {
                return null;
            }
            HashMap hashMap = this.this$0.a.e;
            Iterator it2 = hashMap.values().iterator();
            while (it2.hasNext()) {
                ((DrivingSession) it2.next()).cancel();
            }
            hashMap.clear();
            List list2 = list;
            f fVar2 = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            fVar = fVar2;
            it = list2.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = (Collection) this.L$9;
            PlainAddress plainAddress = (PlainAddress) this.L$8;
            it = (Iterator) this.L$6;
            Collection collection2 = (Collection) this.L$5;
            fVar = (f) this.L$3;
            kotlin.b.b(obj);
            DrivingRoute drivingRoute = (DrivingRoute) obj;
            collection.add(new h71(plainAddress, String.valueOf((drivingRoute != null || (timeWithTraffic = drivingRoute.getMetadata().getWeight().getTimeWithTraffic()) == null) ? null : fVar.b.a((long) timeWithTraffic.getValue()))));
            collection = collection2;
            if (it.hasNext()) {
                plainAddress = (PlainAddress) it.next();
                com.yandex.go.navigator.utils.d dVar = fVar.a;
                Point d = cwa1.d(plainAddress.getAddress().a);
                this.L$0 = null;
                this.L$1 = point;
                this.L$2 = null;
                this.L$3 = fVar;
                this.L$4 = null;
                this.L$5 = collection;
                this.L$6 = it;
                this.L$7 = null;
                this.L$8 = plainAddress;
                this.L$9 = collection;
                this.label = 1;
                obj = dVar.a(point, d, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                collection2 = collection;
                DrivingRoute drivingRoute2 = (DrivingRoute) obj;
                collection.add(new h71(plainAddress, String.valueOf((drivingRoute2 != null || (timeWithTraffic = drivingRoute2.getMetadata().getWeight().getTimeWithTraffic()) == null) ? null : fVar.b.a((long) timeWithTraffic.getValue()))));
                collection = collection2;
                if (it.hasNext()) {
                    return new i71((List) collection);
                }
            }
        }
    }
}
