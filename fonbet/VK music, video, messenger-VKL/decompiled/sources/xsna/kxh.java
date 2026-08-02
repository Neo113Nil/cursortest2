package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.ecomm.design.view.deletedreview.DeletedReviewView;
import com.vkontakte.android.R;

/* compiled from: CommunityReviewDeleteItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class kxh extends vfz<lxh> {
    public final a0i<mxh> l;
    public lxh m;

    /* JADX WARN: Multi-variable type inference failed */
    public kxh(ViewGroup viewGroup, boolean z, int i, a0i<? super mxh> a0iVar) {
        super(e0n.a(R.layout.community_review_delete_item, viewGroup, z));
        this.l = a0iVar;
        ((DeletedReviewView) this.itemView.findViewById(R.id.deleted_view)).setEventHandler(new wm1(this, 28));
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
    }

    @Override // xsna.vfz
    public final void W5(lxh lxhVar) {
        lxh lxhVar2 = lxhVar;
        e0n.b(this.itemView, lxhVar2.e);
        this.m = lxhVar2;
    }
}
