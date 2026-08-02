package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsCommonVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.activities.EventActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class l90 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializer.StreamParcelable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l90(int i, Serializer.StreamParcelable streamParcelable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = streamParcelable;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Serializer.StreamParcelable streamParcelable = this.c;
        switch (i) {
            case 0:
                Post post = (Post) obj4;
                m90 m90Var = (m90) obj3;
                String str = (String) obj2;
                ((EventActivity) streamParcelable).f = 0;
                UserId userId = post.m;
                if (epx.f(userId, fkq0.e((UserId) obj))) {
                    j6r0.c(0, m90Var.G);
                    j6r0.c(8, m90Var.H);
                }
                String str2 = com.vk.newsfeed.common.util.k.a;
                com.vk.newsfeed.common.util.k.l(post.n, userId, str, "activity", true);
                break;
            default:
                UserProfile userProfile = (UserProfile) streamParcelable;
                FriendsRequestsCommonVh friendsRequestsCommonVh = (FriendsRequestsCommonVh) obj4;
                Context context = (Context) obj3;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj2;
                if (((Boolean) obj).booleanValue()) {
                    cvk.u(R.string.friends_catalog_report_sent, false);
                    userProfile.m = true;
                    VkRichCell vkRichCell = friendsRequestsCommonVh.d;
                    VkRichCell vkRichCell2 = vkRichCell == null ? null : vkRichCell;
                    if (vkRichCell == null) {
                        vkRichCell = null;
                    }
                    pgv0 middle = vkRichCell.getMiddle();
                    vkRichCell2.setMiddle(middle != null ? friendsRequestsCommonVh.b(middle, context, uIBlockProfile) : null);
                }
                break;
        }
        return s3q0.a;
    }
}
