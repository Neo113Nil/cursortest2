package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ConnectYClientsReviewsViewHolder.kt */
/* loaded from: classes18.dex */
public final class r3j extends vfz<j3j> {
    public final z0h l;
    public final drg m;

    public r3j(ViewGroup viewGroup, int i, z0h z0hVar, drg drgVar) {
        super(R.layout.connect_yclients_reviews_item_view, viewGroup);
        this.l = z0hVar;
        this.m = drgVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.more_details_button);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.hide_button);
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        f4m.l(i, i, this.itemView);
        bwt0.i0(textView, new fgh(this, 3));
        bwt0.i0(imageView, new l2i(this, 1));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final /* bridge */ /* synthetic */ void i6(j3j j3jVar) {
    }
}
