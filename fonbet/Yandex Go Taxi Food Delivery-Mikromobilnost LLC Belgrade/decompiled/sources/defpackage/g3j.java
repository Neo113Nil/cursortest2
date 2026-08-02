package defpackage;

import com.yandex.go.taxi.order.detailed_price.analytics.DetailedPriceAnalytics$OrderStatus;
import com.yandex.go.taxi.order.detailed_price.domain.c;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class g3j extends ad5 {
    public final pj A;
    public final i3j x;
    public final c y;
    public final h3j z;

    public g3j(i3j i3jVar, c cVar, h3j h3jVar, pj pjVar) {
        super(e3j.class);
        this.x = i3jVar;
        this.y = cVar;
        this.z = h3jVar;
        this.A = pjVar;
    }

    public static DetailedPriceAnalytics$OrderStatus Kg(DriveState driveState) {
        switch (f3j.a[driveState.ordinal()]) {
            case 1:
                return DetailedPriceAnalytics$OrderStatus.Preorder;
            case 2:
                return DetailedPriceAnalytics$OrderStatus.Search;
            case 3:
                return DetailedPriceAnalytics$OrderStatus.Scheduling;
            case 4:
                return DetailedPriceAnalytics$OrderStatus.Scheduled;
            case 5:
                return DetailedPriceAnalytics$OrderStatus.CheckIn;
            case 6:
                return DetailedPriceAnalytics$OrderStatus.Driving;
            case 7:
                return DetailedPriceAnalytics$OrderStatus.Waiting;
            case 8:
                return DetailedPriceAnalytics$OrderStatus.Transporting;
            case 9:
                return DetailedPriceAnalytics$OrderStatus.Complete;
            case 10:
                return DetailedPriceAnalytics$OrderStatus.Cancelled;
            case 11:
                return DetailedPriceAnalytics$OrderStatus.Failed;
            case 12:
                return DetailedPriceAnalytics$OrderStatus.Expired;
            default:
                w511.b();
                return null;
        }
    }
}
