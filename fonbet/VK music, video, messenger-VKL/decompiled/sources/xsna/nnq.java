package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: FaveDividerHolder.kt */
/* loaded from: classes4.dex */
public final class nnq extends rp6<onq, NewsEntry> {
    public final View E;

    public nnq(ViewGroup viewGroup) {
        super(R.layout.fave_divider_holder, viewGroup);
        this.D = t980.a;
        this.E = this.itemView.findViewById(R.id.v_fave_divider);
    }

    @Override // xsna.rp6
    public final void R6(onq onqVar) {
        f4m.q(onqVar.h ? y8g0.a(R.dimen.fave_divider_margin_bottom) : 0, this.E);
    }
}
