package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: SeparatorTopHolder.kt */
/* loaded from: classes4.dex */
public final class qki0 extends qi6<NewsEntry> {
    public final View C;
    public int D;

    public qki0(ViewGroup viewGroup) {
        super(R.layout.separator_top_layout, viewGroup);
        this.C = this.itemView.findViewById(R.id.separator_container);
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        boolean z = u1c0Var instanceof p890;
        if (this.D != (z ? ((p890) u1c0Var).q : 0)) {
            int i = z ? ((p890) u1c0Var).q : 0;
            this.D = i;
            this.C.setMinimumHeight(i);
        }
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
    }
}
