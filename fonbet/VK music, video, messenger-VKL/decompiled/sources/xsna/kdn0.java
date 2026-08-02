package xsna;

import android.view.View;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.superapp.ui.widgets.SuperAppShowcaseConfirmNumberWidget;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: SuperAppWidgetShowcaseConfirmNumberHolder.kt */
/* loaded from: classes6.dex */
public final class kdn0 extends ucn0<ldn0> {
    public final u7n0 p;
    public final VkBanner q;

    public kdn0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        this.q = (VkBanner) this.itemView.findViewById(R.id.vk_confirm_number_banner);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        ldn0 ldn0Var = (ldn0) zif0Var;
        tlo0.a aVar = tlo0.Companion;
        SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget = ldn0Var.e;
        tlo0.h d = oq.d(aVar, superAppShowcaseConfirmNumberWidget.o.b);
        SuperAppShowcaseConfirmNumberWidget.Payload payload = superAppShowcaseConfirmNumberWidget.o;
        tlo0.h hVar = new tlo0.h(payload.c);
        VkBanner vkBanner = this.q;
        vkBanner.setBackgroundColor(new b8g(e3m.f(R.attr.vk_ui_background_info_tint, vkBanner.getContext())));
        tlo0.h hVar2 = new tlo0.h(payload.d);
        VkButton.Mode mode = VkButton.Mode.Primary;
        VkButton.Appearance appearance = VkButton.Appearance.Neutral;
        vkBanner.setMiddle(new VkBanner.e(d, hVar, null, new VkBanner.c(hVar2, new o7k0(2, this, ldn0Var), mode, appearance, null, null, null, 1008), new VkBanner.c(new tlo0.h(payload.e), new kg(27, this, ldn0Var), mode, appearance, null, null, null, 1008), null, 100));
        vkBanner.setTrailingImage(new ulw(R.drawable.vk_icon_illustration_phone_actual_number_100h));
    }
}
