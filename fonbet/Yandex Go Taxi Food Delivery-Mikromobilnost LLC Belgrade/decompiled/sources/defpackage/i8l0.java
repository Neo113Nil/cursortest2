package defpackage;

import com.yandex.go.taxi.order.map.route.a;
import com.yandex.mapkit.directions.driving.ConditionsListener;

/* loaded from: classes14.dex */
public final class i8l0 implements ConditionsListener {
    public final /* synthetic */ a a;

    public i8l0(a aVar) {
        this.a = aVar;
    }

    @Override // com.yandex.mapkit.directions.driving.ConditionsListener
    public final void onConditionsOutdated() {
    }

    @Override // com.yandex.mapkit.directions.driving.ConditionsListener
    public final void onConditionsUpdated() {
        this.a.a();
    }
}
