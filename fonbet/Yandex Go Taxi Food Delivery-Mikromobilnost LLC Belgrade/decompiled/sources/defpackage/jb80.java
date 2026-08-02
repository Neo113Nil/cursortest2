package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffButtonView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class jb80 implements zo31 {
    public final OrderWithTariffButtonView a;
    public final GoFrameLayout b;
    public final ButtonComponent c;
    public final ButtonComponent d;
    public final GoView e;

    public jb80(OrderWithTariffButtonView orderWithTariffButtonView, GoFrameLayout goFrameLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, GoView goView) {
        this.a = orderWithTariffButtonView;
        this.b = goFrameLayout;
        this.c = buttonComponent;
        this.d = buttonComponent2;
        this.e = goView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
