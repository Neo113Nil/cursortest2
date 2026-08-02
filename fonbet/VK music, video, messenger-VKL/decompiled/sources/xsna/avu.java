package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: PostingHashTagsAdapter.kt */
/* loaded from: classes4.dex */
public final class avu extends vfz<bvu> {
    public final izs<String, s3q0> l;
    public bvu m;
    public final TextView n;

    public avu(ViewGroup viewGroup, r7 r7Var) {
        super(R.layout.item_posting_has_htag, viewGroup);
        this.l = r7Var;
        this.n = (TextView) this.itemView.findViewById(R.id.hashtag_container);
        bwt0.i0(this.itemView, new bjk(this, 12));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(bvu bvuVar) {
        bvu bvuVar2 = bvuVar;
        this.m = bvuVar2;
        this.n.setText(bvuVar2.b);
    }
}
