package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.masstransit.model.BoardingWagon;

/* loaded from: classes6.dex */
public final class hio {
    public final Map a;

    public hio(zuj0 zuj0Var) {
        BoardingWagon boardingWagon = BoardingWagon.HEAD;
        BoardingWagon boardingWagon2 = BoardingWagon.NEAR_THE_HEAD;
        BoardingWagon boardingWagon3 = BoardingWagon.MIDDLE;
        BoardingWagon boardingWagon4 = BoardingWagon.NEAR_THE_TAIL;
        BoardingWagon boardingWagon5 = BoardingWagon.TAIL;
        avj0 avj0Var = (avj0) zuj0Var;
        this.a = b.i(new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon2, boardingWagon3, boardingWagon4, boardingWagon5}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_all)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon3, boardingWagon5}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_center_last)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon2, boardingWagon5}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_closertofirst_last)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon4, boardingWagon5}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_closertolast_last)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon2, boardingWagon3}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_closertofirst_center)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon3, boardingWagon4, boardingWagon5}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_center_closertolast_last)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon3, boardingWagon4}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_center_closertolast_last)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon3}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_closertofirst_center)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon3, boardingWagon5}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_center_closertolast_last)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon3, boardingWagon2}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_closertofirst_center)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon2}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_closertofirst)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon2, boardingWagon4}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_closertofirst_closertolast)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon4}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_closertofirst_closertolast)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon, boardingWagon5}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_last)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon4, boardingWagon5}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_closertolast_last)), new Pair(j73.f0(new BoardingWagon[]{boardingWagon4, boardingWagon}), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first_closertolast_last)), new Pair(Collections.singleton(boardingWagon), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_first)), new Pair(Collections.singleton(boardingWagon2), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_closertofirst)), new Pair(Collections.singleton(boardingWagon3), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_center)), new Pair(Collections.singleton(boardingWagon4), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_closertolast)), new Pair(Collections.singleton(boardingWagon5), avj0Var.h(kyh0.mt_details_metro_car_boarding_positions_last)));
    }

    public Map a() {
        return this.a;
    }

    public hio(vwu vwuVar, uwu uwuVar) {
        this.a = b.i(new Pair(Boolean.FALSE, vwuVar), new Pair(Boolean.TRUE, uwuVar));
    }

    public hio(String str, long j, String str2) {
        this.a = b.i(new Pair("scheme_name", "plus_payment_analytic"), new Pair("event_id", str), new Pair(ClidProvider.TIMESTAMP, Long.valueOf(j)), new Pair("puid", str2));
    }

    public hio(PayUIEvgenAnalyticsPlatform payUIEvgenAnalyticsPlatform) {
        this.a = g8e.z("platform", payUIEvgenAnalyticsPlatform.getEventValue());
    }
}
