package xsna;

import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.i5e0;

/* compiled from: VhPromoLink.kt */
/* loaded from: classes2.dex */
public final class xur0 extends vfz<k5e0> {
    public i5e0.a l;
    public lj0 m;

    /* compiled from: VhPromoLink.kt */
    public interface a {
        void I(i5e0.a aVar);

        void u(i5e0.a aVar);
    }

    @Override // xsna.vfz
    /* renamed from: h6, reason: merged with bridge method [inline-methods] */
    public final void W5(k5e0 k5e0Var) {
        i5e0.a aVar = this.l;
        i5e0.a aVar2 = k5e0Var.b;
        if (aVar == aVar2) {
            return;
        }
        this.l = aVar2;
        TextView textView = (TextView) this.itemView.findViewById(R.id.promo_link_title);
        textView.setText(aVar2.b);
        textView.setTextSize(2, 17.0f);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.promo_link_text);
        textView2.setText(aVar2.c);
        textView2.setTextSize(2, 15.0f);
        awt0.v(this.itemView.findViewById(R.id.promo_link_is_new), aVar2.e);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.promo_link_logo);
        bwt0.m0(cn70.b(58), cn70.b(58), vKImageView);
        vKImageView.setRound(true);
        vKImageView.load(aVar2.d);
        jjc.g(this.itemView, new dnh0(9, this, k5e0Var));
        bwt0.k0(this.itemView, new il7(25, this, k5e0Var));
    }
}
