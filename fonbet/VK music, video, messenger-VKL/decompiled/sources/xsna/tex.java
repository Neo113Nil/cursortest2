package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.aex;

/* compiled from: InterestingStoriesBlockShowAllItemHolder.kt */
/* loaded from: classes4.dex */
public final class tex extends vif0<aex.b> {
    public final pdx n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tex(ViewGroup viewGroup, zex zexVar) {
        super(viewGroup, R.layout.news_discover_block_show_all_item, 0);
        viewGroup.getContext();
        this.n = zexVar;
        this.itemView.setClipToOutline(true);
        this.itemView.getContext();
        this.itemView.setOutlineProvider(new t0w0(6, cn70.c(12), false, false));
        jjc.g(this.itemView, new cqv(this, 4));
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(aex.b bVar) {
    }
}
