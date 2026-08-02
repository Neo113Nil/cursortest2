package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.comments.core.BoardComment;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;

/* compiled from: MarketItemCommentsAdapter.kt */
/* loaded from: classes17.dex */
public final class l010 extends zoj0<j010, RecyclerView.e0> {
    public final yeg e;
    public final o010 f;
    public final g3f0 g;

    public l010(yeg yegVar, o010 o010Var) {
        g3f0 g3f0Var = new g3f0((z2f0) null, 3);
        this.e = yegVar;
        this.f = o010Var;
        this.g = g3f0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object obj = ((j010) this.c.c(i)).b;
        if (obj instanceof iag) {
            return 1;
        }
        return obj instanceof rvl ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        Object obj = ((j010) this.c.c(i)).b;
        if (e0Var instanceof y010) {
            ((y010) e0Var).V5((x010) obj);
        } else if (e0Var instanceof svl) {
            ((svl) e0Var).V5((rvl) obj);
        } else if (e0Var instanceof d8q) {
            ((d8q) e0Var).V5((BoardComment) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new y010(viewGroup);
        }
        if (i != 2) {
            return new d8q(viewGroup, this.e, this.g, new y84(7), false);
        }
        svl svlVar = new svl(e0n.a(R.layout.market_item_deleted_comment_view_holder, viewGroup, true));
        VKCircleImageView vKCircleImageView = (VKCircleImageView) svlVar.itemView.findViewById(R.id.user_photo_iv);
        TextView textView = (TextView) svlVar.itemView.findViewById(R.id.restore_comment_tv);
        vKCircleImageView.y0(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        bwt0.i0(textView, new gb(14, svlVar, this.f));
        return svlVar;
    }
}
