package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;

/* compiled from: MarketAllReviewsRestoreGoodViewHolder.kt */
/* loaded from: classes18.dex */
public final class dt00 extends vfz<ct00> {
    public final ds00<cs00> l;
    public final View m;
    public final VKImageView n;
    public final TextView o;
    public final View p;
    public ct00 q;

    /* JADX WARN: Multi-variable type inference failed */
    public dt00(ViewGroup viewGroup, ds00<? super cs00> ds00Var) {
        super(R.layout.market_all_reviews_good_restore_view_holder_item, viewGroup);
        this.l = ds00Var;
        this.m = this.itemView.findViewById(R.id.container_view_holder);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.good_photo_iv);
        this.n = vKImageView;
        this.o = (TextView) this.itemView.findViewById(R.id.good_name_tv);
        View findViewById = this.itemView.findViewById(R.id.restore_review_iv);
        this.p = findViewById;
        bwt0.i0(findViewById, new qpj(this, 27));
        vKImageView.y0(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(ct00 ct00Var) {
        ct00 ct00Var2 = ct00Var;
        this.q = ct00Var2;
        this.m.setBackgroundResource(ct00Var2.e);
        BaseImageDto baseImageDto = ct00Var2.c;
        if (baseImageDto != null) {
            List singletonList = Collections.singletonList(baseImageDto);
            VKImageView vKImageView = this.n;
            bwt0.S(vKImageView, new cpo0(singletonList, vKImageView));
        }
        this.o.setText(ct00Var2.d);
    }
}
