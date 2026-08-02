package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.u1o;

/* compiled from: DonutVideoTeaserHolder.kt */
/* loaded from: classes4.dex */
public final class h5o extends rp6<j5o, NewsEntry> {
    public final u1o E;
    public final Object F;

    public h5o(ViewGroup viewGroup) {
        super(new u1o(viewGroup.getContext()), viewGroup);
        u1o u1oVar = (u1o) this.itemView;
        this.E = u1oVar;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new re0(11));
        u1oVar.setContentDescription(this.itemView.getContext().getString(R.string.feed_donut_teaser_video_accessibility));
        u1oVar.setOnClickListener(new vw0(this, 6));
        u1oVar.setOnSupportBadgeClick(new yce(this, 16));
    }

    @Override // xsna.rp6
    public final void R6(j5o j5oVar) {
        j5o j5oVar2 = j5oVar;
        float f = j5oVar2.h;
        Float valueOf = Float.valueOf(f);
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == -1.0f) {
            valueOf = null;
        }
        float f2 = 1.8f;
        if (valueOf != null) {
            float floatValue = valueOf.floatValue();
            if (floatValue <= 1.8f) {
                f2 = floatValue;
            }
        }
        u1o.a aVar = new u1o.a(f2, new w5h(j5oVar2, 2));
        u1o u1oVar = this.E;
        u1oVar.setCoverImage(aVar);
        String m = gpt0.m(this.itemView.getContext(), j5oVar2.i, true, false);
        u1oVar.setDuration(m.length() != 0 ? m : null);
        DonutPriceTemplate donutPriceTemplate = j5oVar2.j;
        u1oVar.setSupportBadgeTitle(donutPriceTemplate != null ? y1o.b(donutPriceTemplate, this.itemView.getContext()) : j5oVar2.k);
    }
}
