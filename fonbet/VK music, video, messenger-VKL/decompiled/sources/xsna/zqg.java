package xsna;

import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.profile.MetroStation;

/* compiled from: CommunityAddressViewHolder.kt */
/* loaded from: classes5.dex */
public final class zqg extends VkMiniInfoCell.b {
    public final /* synthetic */ MetroStation b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqg(MetroStation metroStation) {
        super(true);
        this.b = metroStation;
    }

    @Override // com.vk.core.view.components.cell.VkMiniInfoCell.b, com.vk.core.view.components.cell.VkMiniInfoCell.a
    public final cut0 a(VkMiniInfoCell.Mode mode) {
        return new b8g(this.b.d);
    }
}
