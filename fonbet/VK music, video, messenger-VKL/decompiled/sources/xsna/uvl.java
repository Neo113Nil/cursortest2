package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;

/* compiled from: DeletedReplyItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class uvl extends vfz<tvl> {
    public final eig0<d4g0> l;
    public tvl m;

    public /* synthetic */ uvl(ViewGroup viewGroup, eig0 eig0Var) {
        this(viewGroup, eig0Var, true, 0);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(tvl tvlVar) {
        tvl tvlVar2 = tvlVar;
        this.m = tvlVar2;
        e0n.b(this.itemView, tvlVar2.e);
    }

    public uvl(ViewGroup viewGroup, eig0<d4g0> eig0Var, boolean z, int i) {
        super(e0n.a(R.layout.reply_deleted_item_view_holder, viewGroup, z));
        this.l = eig0Var;
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.user_photo_iv);
        TextView textView = (TextView) this.itemView.findViewById(R.id.restore_reply);
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        vKCircleImageView.y0(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        bwt0.i0(textView, new wze(this, 14));
    }
}
