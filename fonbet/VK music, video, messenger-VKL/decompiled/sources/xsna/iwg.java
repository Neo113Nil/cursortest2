package xsna;

import android.util.TypedValue;
import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vk.ecomm.design.view.DiscreteProgressBar;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: CommunityCheckListHeaderViewHolder.kt */
/* loaded from: classes18.dex */
public final class iwg extends vfz<hwg> {
    public final VkText l;
    public final VkText m;
    public final VKImageView n;
    public final VkText o;
    public final DiscreteProgressBar p;

    public iwg(ViewGroup viewGroup) {
        super(R.layout.community_check_list_header_item, viewGroup);
        this.l = (VkText) this.itemView.findViewById(R.id.title);
        this.m = (VkText) this.itemView.findViewById(R.id.description);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.image);
        this.n = vKImageView;
        this.o = (VkText) this.itemView.findViewById(R.id.progress_title);
        this.p = (DiscreteProgressBar) this.itemView.findViewById(R.id.progress_bar);
        vKImageView.setActualScaleType(f5h0.m.a);
    }

    @Override // xsna.vfz
    public final void W5(hwg hwgVar) {
        hwg hwgVar2 = hwgVar;
        ey2.h(this.l, hwgVar2.d);
        ey2.h(this.m, hwgVar2.e);
        ey2.h(this.o, hwgVar2.f);
        int i = hwgVar2.h;
        DiscreteProgressBar discreteProgressBar = this.p;
        discreteProgressBar.setMax(i);
        discreteProgressBar.setProgress(hwgVar2.g);
        TypedValue typedValue = krv0.a;
        this.n.load(krv0.j() ? hwgVar2.b : hwgVar2.c);
    }
}
