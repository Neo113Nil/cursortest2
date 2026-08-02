package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: ReviewsFooterLoadingItem.kt */
/* loaded from: classes18.dex */
public final class iig0 extends vfz<hig0> {
    public iig0(ViewGroup viewGroup, int i) {
        super(R.layout.reviews_pagination_loading_view_holder_layout, viewGroup);
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
    }

    @Override // xsna.vfz
    public final /* bridge */ /* synthetic */ void W5(hig0 hig0Var) {
    }
}
