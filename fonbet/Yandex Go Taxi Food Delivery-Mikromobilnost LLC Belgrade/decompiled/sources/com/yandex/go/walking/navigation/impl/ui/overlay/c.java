package com.yandex.go.walking.navigation.impl.ui.overlay;

import com.yandex.mapkit.geometry.Point;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        e eVar = this.a;
        eVar.K = null;
        eVar.L = null;
        List list = eVar.M;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                Point point = eVar.N;
                if (point == null) {
                    point = (Point) kotlin.collections.a.P(list);
                }
                WaypointType waypointType = WaypointType.START_POINT;
                tje.N(eVar.Jg(), null, null, new WalkNavPlacemarksPresenter$preparePin$1(eVar, new WalkNavPlacemarksPresenter$prepareStartEndPins$1(eVar, null), point, waypointType, null), 3);
                tje.N(eVar.Jg(), null, null, new WalkNavPlacemarksPresenter$preparePin$1(eVar, new WalkNavPlacemarksPresenter$prepareStartEndPins$2(eVar, null), (Point) kotlin.collections.a.Z(list), WaypointType.END_POINT, null), 3);
            }
        }
        return zy11.a;
    }
}
