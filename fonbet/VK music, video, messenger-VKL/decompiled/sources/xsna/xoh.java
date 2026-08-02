package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.banner.VkBanner;
import com.vkontakte.android.R;
import xsna.sst0;
import xsna.tlh;

/* compiled from: CommunityProfileGrowthTrapViewHolder.kt */
/* loaded from: classes5.dex */
public final class xoh extends vif0<sst0.a> {
    public final gzs<s3q0> n;
    public final gzs<s3q0> o;
    public final VkBanner p;

    public xoh(int i, ViewGroup viewGroup, tlh.i iVar, tlh.j jVar) {
        super(s3j0.b(viewGroup, R.layout.community_item_content_growth_trap_item, viewGroup, false));
        this.n = iVar;
        this.o = jVar;
        VkBanner vkBanner = (VkBanner) this.itemView.findViewById(R.id.banner);
        f4m.q(i, vkBanner);
        vkBanner.setOnClick(new defpackage.j(this, 25));
        this.p = vkBanner;
    }

    @Override // xsna.vif0
    public final void i6(sst0.a aVar) {
        sst0.a aVar2 = aVar;
        VkBanner vkBanner = this.p;
        if (aVar2 == null) {
            f4m.j(vkBanner);
            return;
        }
        vkBanner.setBefore(aVar2.a);
        vkBanner.setAfter(aVar2.c);
        vkBanner.setMiddle(aVar2.b);
        vkBanner.setVisibility(0);
        this.o.invoke();
    }
}
