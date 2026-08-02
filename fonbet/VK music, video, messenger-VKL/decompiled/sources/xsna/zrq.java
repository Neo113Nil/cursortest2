package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vkontakte.android.R;

/* compiled from: FaveSellerProductHolder.kt */
/* loaded from: classes4.dex */
public final class zrq extends rm6 {
    public final ImageView P;

    public zrq(ViewGroup viewGroup) {
        super(viewGroup, R.layout.fave_seller_product);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.snippet_actions);
        this.P = imageView;
        imageView.setOnClickListener(new uzb(this, 4));
    }

    @Override // xsna.rm6
    public final View X6() {
        return this.I;
    }
}
