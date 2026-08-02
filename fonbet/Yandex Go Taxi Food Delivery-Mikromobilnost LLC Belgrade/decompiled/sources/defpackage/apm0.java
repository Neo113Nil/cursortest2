package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;
import ru.yandex.taxi.carplates.ui.services.ScootersCarIndexContainerView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class apm0 extends x3 {
    public apm0(ListItemComponent listItemComponent) {
        super(listItemComponent, new ScootersCarIndexContainerView(listItemComponent.getContext()));
    }

    public final void Ug(Context context, Bitmap bitmap, String str) {
        CarIndexContainerView carIndexContainerView = (CarIndexContainerView) this.b;
        avc0 avc0Var = new avc0();
        avc0Var.b = str;
        i3y i3yVar = yom0.a;
        int t = qje.t(xng0.controlMinor, context);
        int u = qje.u(context.getTheme(), xng0.textMain);
        w610 g = ((Regex) yom0.a.getValue()).g(str);
        avc0Var.c = new a78(t, u, g != null ? gw00.e(new Pair(((u1l) g.a()).get(2), new w68(0.0f, context.getResources().getDimensionPixelSize(mrg0.component_text_size_body), 24))) : gw00.e(new Pair(str, new w68(0.0f, context.getResources().getDimensionPixelSize(mrg0.component_text_size_subtitle), 24))));
        bvc0 bvc0Var = new bvc0(avc0Var);
        ScootersCarIndexContainerView scootersCarIndexContainerView = carIndexContainerView instanceof ScootersCarIndexContainerView ? (ScootersCarIndexContainerView) carIndexContainerView : null;
        if (scootersCarIndexContainerView != null) {
            scootersCarIndexContainerView.bindScootersData(bvc0Var, bitmap);
        }
        carIndexContainerView.setContentDescription(a0b1.b(context, str));
    }
}
