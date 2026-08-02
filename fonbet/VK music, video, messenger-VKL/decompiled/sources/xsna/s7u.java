package xsna;

import android.view.ViewGroup;
import com.vk.ecomm.design.view.deletedreview.DeletedReviewView;
import com.vkontakte.android.R;

/* compiled from: GoodReviewDeleteItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class s7u extends vfz<t7u> {
    public final h780 l;
    public t7u m;

    public s7u(ViewGroup viewGroup, h780 h780Var) {
        super(R.layout.good_review_delete_item, viewGroup);
        this.l = h780Var;
        ((DeletedReviewView) this.itemView).setEventHandler(new maj(this, 20));
    }

    @Override // xsna.vfz
    public final void W5(t7u t7uVar) {
        this.m = t7uVar;
    }
}
