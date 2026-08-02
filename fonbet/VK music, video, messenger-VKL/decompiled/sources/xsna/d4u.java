package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: GoodCommentsAndReviewsLoaderHolder.kt */
/* loaded from: classes18.dex */
public final class d4u extends vif0<Boolean> {
    public final View n;

    public d4u(ViewGroup viewGroup) {
        super(viewGroup, R.layout.good_comments_and_reviews_loader_view, 0);
        this.n = this.itemView.findViewById(R.id.load_more_progress);
    }

    @Override // xsna.vif0
    public final void i6(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        awt0.v(this.n, booleanValue);
        awt0.v(this.itemView, booleanValue);
    }
}
