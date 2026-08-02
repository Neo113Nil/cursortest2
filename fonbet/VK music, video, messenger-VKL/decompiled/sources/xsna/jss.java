package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsCommonVh;
import com.vk.core.view.components.cell.rich.VkRichCell;

/* compiled from: FriendsRequestsCommonVh.kt */
/* loaded from: classes16.dex */
public final class jss implements izs {
    public final /* synthetic */ FriendsRequestsCommonVh b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ UIBlockProfile d;

    public jss(FriendsRequestsCommonVh friendsRequestsCommonVh, Context context, UIBlockProfile uIBlockProfile) {
        this.b = friendsRequestsCommonVh;
        this.c = context;
        this.d = uIBlockProfile;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        FriendsRequestsCommonVh friendsRequestsCommonVh = this.b;
        VkRichCell vkRichCell = friendsRequestsCommonVh.d;
        VkRichCell vkRichCell2 = vkRichCell == null ? null : vkRichCell;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        pgv0 middle = vkRichCell.getMiddle();
        vkRichCell2.setMiddle(middle != null ? friendsRequestsCommonVh.b(middle, this.c, this.d) : null);
        return s3q0.a;
    }
}
