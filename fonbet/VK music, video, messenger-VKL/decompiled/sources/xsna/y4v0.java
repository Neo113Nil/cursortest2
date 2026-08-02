package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.ui.modal.b;
import com.vkontakte.android.R;

/* compiled from: VkModalCard.kt */
/* loaded from: classes17.dex */
public final class y4v0 {
    public final b.a a;
    public final gzs<s3q0> b;
    public dw20 c;
    public izs<? super View, s3q0> d = new ygm0(8);

    public y4v0(b.a aVar, boolean z, tfm0 tfm0Var) {
        this.a = aVar;
        this.b = tfm0Var;
    }

    public final ViewGroup a(ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2 = (ViewGroup) tf3.b(viewGroup, R.layout.vk_internal_modal_card_containter, null, false);
        viewGroup2.addView(viewGroup, 0);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.close_button);
        if (imageView != null) {
            imageView.setOnClickListener(new z01(this, 6));
        }
        if (imageView != null) {
            awt0.v(imageView, z);
        }
        return viewGroup2;
    }
}
