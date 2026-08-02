package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.picture.c;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.quu0;

/* compiled from: DonutPostPollHolder.kt */
/* loaded from: classes4.dex */
public final class q1o extends rp6<g1o, NewsEntry> {
    public final quu0 E;
    public final Object F;

    public q1o(ViewGroup viewGroup) {
        super(new quu0(viewGroup.getContext()), viewGroup);
        quu0 quu0Var = (quu0) this.itemView;
        this.E = quu0Var;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new nh0(13));
        int a = e3m.a(R.dimen.vk_ui_spacing_size_m, this.itemView.getContext());
        f4m.B(a, a, quu0Var);
        quu0Var.setPictureContent(new c.a(R.drawable.vk_icon_poll_outline_24, R.attr.vk_ui_icon_tertiary));
        quu0Var.setRight(quu0.a.C3574a.a);
        quu0Var.setOnClickListener(new nn9(this, 3));
    }

    @Override // xsna.rp6
    public final void R6(g1o g1oVar) {
        String str = g1oVar.h;
        quu0 quu0Var = this.E;
        quu0Var.setTitle(str);
        quu0Var.setSubtitle(this.itemView.getContext().getString(R.string.feed_donut_teaser_poll_title));
    }
}
