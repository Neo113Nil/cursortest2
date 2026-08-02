package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import xsna.iv9;

/* compiled from: CarouselPromoViewHolder.kt */
/* loaded from: classes6.dex */
public final class hv9 extends vfz<iv9.a> {
    public final a l;
    public final TextView m;
    public final VKImageController<View> n;
    public iv9.a o;

    /* compiled from: CarouselPromoViewHolder.kt */
    public interface a {
        void c(iv9.a aVar);
    }

    public hv9(ViewGroup viewGroup, a aVar) {
        super(R.layout.vk_pay_checkout_bonuses_promo_item, viewGroup);
        this.l = aVar;
        VKReplacerView vKReplacerView = (VKReplacerView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_promo_icon);
        this.m = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_promo_text);
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
        this.n = create;
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        this.itemView.setOnClickListener(new a06(this, 2));
    }

    @Override // xsna.vfz
    public final void W5(iv9.a aVar) {
        iv9.a aVar2 = aVar;
        this.o = aVar2;
        aVar2.getClass();
        VKImageController.a.a(this.n, "https://sun9-50.userapi.com/ywytsH1RsgfipAxPYeikNt1kaihXRic29stFrg/FhoNGgLJi5U.jpg");
        this.m.setText("Получайте кешбэк от 2% бонусами за каждую покупку");
    }
}
