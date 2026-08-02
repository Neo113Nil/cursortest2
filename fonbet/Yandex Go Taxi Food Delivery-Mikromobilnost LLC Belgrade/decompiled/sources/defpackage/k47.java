package defpackage;

import com.yandex.go.chargers.multiorder.ui.a;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class k47 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pav b;

    public /* synthetic */ k47(pav pavVar, int i) {
        this.a = i;
        this.b = pavVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new a((ButtonComponent) obj, this.b);
            case 1:
                return new nj1((GoImageView) obj, this.b);
            case 2:
                return new com.yandex.go.scooters.passes.details.a((ListItemComponent) obj, this.b);
            default:
                return new com.yandex.go.taxi.order.support.ui.support_menu.adapter.a((ListItemComponent) obj, this.b);
        }
    }
}
