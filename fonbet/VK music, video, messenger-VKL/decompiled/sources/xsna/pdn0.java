package xsna;

import android.view.View;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: SuperAppWidgetShowcasePromoHolder.kt */
/* loaded from: classes6.dex */
public final class pdn0 extends ucn0<qdn0> {
    public final u7n0 p;
    public final VkImage q;
    public final View r;

    public pdn0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        this.q = (VkImage) this.itemView.findViewById(R.id.image);
        this.r = this.itemView.findViewById(R.id.close);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        qdn0 qdn0Var = (qdn0) zif0Var;
        VkCard vkCard = (VkCard) this.itemView;
        vkCard.setBackgroundColorAttr(R.attr.vk_ui_image_placeholder);
        vkCard.setCardRadius(cn70.a() * 12.0f);
        float a = cn70.a() * 12.0f;
        VkImage vkImage = this.q;
        vkImage.setCornerRadius(a);
        vkImage.setPlaceholderImage(R.drawable.vk_default_placeholder_12);
        vkImage.setPaintFilterBitmap(true);
        ii4 ii4Var = new ii4(7, vkImage, qdn0Var.e.p);
        ii4Var.run();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = vkImage.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = vkImage.getMeasuredHeight();
        f4m.a(vkImage, new odn0(vkImage, ref$IntRef, ref$IntRef2, ii4Var));
        bwt0.i0(this.r, new by5(26, this, qdn0Var));
        bwt0.i0(vkImage, new ab(22, qdn0Var, this));
        this.itemView.setElevation(cn70.a() * 0.7f);
    }
}
