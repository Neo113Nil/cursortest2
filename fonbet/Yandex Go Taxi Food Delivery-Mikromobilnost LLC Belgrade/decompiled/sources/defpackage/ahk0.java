package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.RideCardDriverSectionTransition;
import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import kotlin.Pair;

/* loaded from: classes14.dex */
public final class ahk0 {
    public final xhk0 a;
    public zgk0 b = new zgk0(RideCardDriverState.SEARCHING, null);

    public ahk0(xhk0 xhk0Var) {
        this.a = xhk0Var;
    }

    public final RideCardDriverSectionTransition a(RideCardDriverState rideCardDriverState, String str) {
        zgk0 zgk0Var = this.b;
        this.b = new zgk0(rideCardDriverState, str);
        RideCardDriverState rideCardDriverState2 = zgk0Var.a;
        String str2 = zgk0Var.b;
        this.a.getClass();
        if (rideCardDriverState2 == rideCardDriverState && jl40.l(str2, str)) {
            return RideCardDriverSectionTransition.PLAIN_CONTENT_CHANGE;
        }
        Pair pair = new Pair(rideCardDriverState2, rideCardDriverState);
        RideCardDriverState rideCardDriverState3 = RideCardDriverState.SEARCHING;
        RideCardDriverState rideCardDriverState4 = RideCardDriverState.WAITING_RESPONSE;
        if (pair.equals(new Pair(rideCardDriverState3, rideCardDriverState4))) {
            return RideCardDriverSectionTransition.SEARCHING_TO_WAITING_RESPONSE;
        }
        RideCardDriverState rideCardDriverState5 = RideCardDriverState.REJECTED;
        if (pair.equals(new Pair(rideCardDriverState3, rideCardDriverState5))) {
            return RideCardDriverSectionTransition.SEARCHING_TO_REJECTED;
        }
        RideCardDriverState rideCardDriverState6 = RideCardDriverState.ASSIGNED_DRIVER;
        return pair.equals(new Pair(rideCardDriverState3, rideCardDriverState6)) ? RideCardDriverSectionTransition.SEARCHING_TO_ASSIGNED_DRIVER : pair.equals(new Pair(rideCardDriverState3, rideCardDriverState3)) ? RideCardDriverSectionTransition.PLAIN_CONTENT_CHANGE : pair.equals(new Pair(rideCardDriverState4, rideCardDriverState3)) ? RideCardDriverSectionTransition.WAITING_RESPONSE_TO_SEARCHING : pair.equals(new Pair(rideCardDriverState4, rideCardDriverState5)) ? RideCardDriverSectionTransition.WAITING_RESPONSE_TO_REJECTED : pair.equals(new Pair(rideCardDriverState4, rideCardDriverState6)) ? RideCardDriverSectionTransition.WAITING_RESPONSE_TO_ASSIGNED_DRIVER : pair.equals(new Pair(rideCardDriverState4, rideCardDriverState4)) ? RideCardDriverSectionTransition.WAITING_RESPONSE_CANDIDATE_CHANGE : pair.equals(new Pair(rideCardDriverState5, rideCardDriverState3)) ? RideCardDriverSectionTransition.REJECTED_TO_SEARCHING : pair.equals(new Pair(rideCardDriverState5, rideCardDriverState4)) ? RideCardDriverSectionTransition.REJECTED_TO_WAITING_RESPONSE : pair.equals(new Pair(rideCardDriverState5, rideCardDriverState6)) ? RideCardDriverSectionTransition.REJECTED_TO_ASSIGNED_DRIVER : pair.equals(new Pair(rideCardDriverState5, rideCardDriverState5)) ? RideCardDriverSectionTransition.REJECTED_CANDIDATE_CHANGE : pair.equals(new Pair(rideCardDriverState6, rideCardDriverState3)) ? RideCardDriverSectionTransition.ASSIGNED_DRIVER_TO_SEARCHING : pair.equals(new Pair(rideCardDriverState6, rideCardDriverState5)) ? RideCardDriverSectionTransition.ASSIGNED_DRIVER_TO_REJECTED : pair.equals(new Pair(rideCardDriverState6, rideCardDriverState4)) ? RideCardDriverSectionTransition.ASSIGNED_DRIVER_TO_WAITING_RESPONSE : pair.equals(new Pair(rideCardDriverState6, rideCardDriverState6)) ? RideCardDriverSectionTransition.ASSIGNED_DRIVER_CONTENT_CHANGE : RideCardDriverSectionTransition.PLAIN_CONTENT_CHANGE;
    }
}
