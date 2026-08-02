package defpackage;

import com.yandex.go.scooters.offers.v2.surge.info.a;
import com.yandex.go.scooters.offers.v2.surge.info.j;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final /* synthetic */ class ko4 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ ko4(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ListItemComponent listItemComponent = (ListItemComponent) obj;
        switch (this.a) {
            case 0:
                return new a(listItemComponent, this.b);
            case 1:
                return new j(listItemComponent, this.b);
            default:
                return new com.yandex.go.scooters.zones.legend.ui.e(listItemComponent, this.b);
        }
    }
}
