package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vkontakte.android.R;

/* compiled from: BannerItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class d26 extends p1u0 {
    public final /* synthetic */ int a;
    public final com.vk.channels.impl.list.f b;

    public /* synthetic */ d26(com.vk.channels.impl.list.f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // xsna.p1u0
    public final vfz b(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return new e26(bwt0.I(R.layout.im_channels_banner_item, viewGroup, false), this.b);
            default:
                return new g3n0((VkRichCell) bwt0.I(R.layout.vkapp_suggested_channels_list_item, viewGroup, false), this.b);
        }
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        switch (this.a) {
            case 0:
                return hfzVar instanceof k26;
            default:
                return hfzVar instanceof f3n0;
        }
    }
}
