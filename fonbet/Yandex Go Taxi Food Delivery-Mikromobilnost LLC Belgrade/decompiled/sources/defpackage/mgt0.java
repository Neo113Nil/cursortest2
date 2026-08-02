package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.preorder.source.data.TaxiMainControlElementEvent;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lmgt0;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface mgt0 extends l050 {
    void hideRouteSelector();

    boolean isMapMoving();

    boolean isOnMainScreen();

    boolean noModalViews();

    boolean routeSelectorShown();

    void setDrivingRoute(zlm zlmVar, boolean z);

    void setMapToPoint(zzs zzsVar);

    void showPlusHome();

    void updateControlElements(TaxiMainControlElementEvent taxiMainControlElementEvent);
}
