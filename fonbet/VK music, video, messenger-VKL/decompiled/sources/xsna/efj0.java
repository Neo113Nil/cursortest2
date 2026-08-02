package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import xsna.xn50;

/* compiled from: ShopsClipsGridBlockMviViewHolder.kt */
/* loaded from: classes17.dex */
public final class efj0 extends vfz<FeedItem.h.a> {
    public final com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public efj0(Context context, dfj0 dfj0Var) {
        super(r0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = (FrameLayout) this.itemView;
        com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar = new com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b(context, new tc10(dfj0Var.n), dfj0Var);
        this.l = bVar;
        frameLayout2.addView(bVar);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(FeedItem.h.a aVar) {
        FeedItem.h.a aVar2 = aVar;
        this.l.getFeature().C(new lae(aVar2.b, aVar2.c, aVar2.d, aVar2.e));
    }

    @Override // xsna.vfz
    public final void g6() {
        this.l.getFeature().C(mae.b);
    }

    public final void h6(boolean z) {
        com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar = this.l;
        bVar.getClass();
        if (z) {
            xn50.a.c(bVar, ClipsGridBlockAction.HandleOnBlockFocusChanged.FOCUSED);
        } else {
            xn50.a.c(bVar, ClipsGridBlockAction.HandleOnBlockFocusChanged.UNFOCUSED);
        }
    }
}
