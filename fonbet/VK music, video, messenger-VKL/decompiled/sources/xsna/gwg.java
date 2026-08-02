package xsna;

import android.content.Context;
import android.util.Size;
import android.webkit.PermissionRequest;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import xsna.a3s;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gwg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gwg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 12;
        int i3 = 1;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj4;
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) obj3;
                RecyclerView recyclerView = (RecyclerView) obj2;
                int i4 = CommunityCheckListFragment.Y;
                ((VkScreenSpinner) obj5).setVisibility(8);
                swipeRefreshLayout.setRefreshing(false);
                swipeRefreshLayout.setEnabled(false);
                VkPlaceholder vkPlaceholder = communityCheckListFragment.W;
                (vkPlaceholder != null ? vkPlaceholder : null).setVisibility(0);
                if (((ovg) communityCheckListFragment.Q.getValue()).getItemCount() > 0) {
                    recyclerView.scrollToPosition(0);
                }
                break;
            case 1:
                jx2 jx2Var = new jx2(new hqu((UserId) obj5, (String) null, (String) obj4, (AdminLeaveAction) obj, (String) null), (a3s.c) obj3);
                jx2Var.g = (Context) obj2;
                jx2Var.a();
                break;
            case 2:
                UserProfile userProfile = (UserProfile) obj5;
                FriendsItemListVh friendsItemListVh = (FriendsItemListVh) obj4;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj3;
                Context context = (Context) obj2;
                userProfile.v = 2;
                jzi0 jzi0Var = friendsItemListVh.g;
                UserId userId = userProfile.c;
                ((HashSet) jzi0Var.b).add(userId);
                ((HashSet) jzi0Var.a).remove(userId);
                friendsItemListVh.e(uIBlockProfile);
                UserProfile userProfile2 = uIBlockProfile.A;
                String string = context.getString(FriendsItemListVh.d.$EnumSwitchMapping$2[userProfile2.i.ordinal()] == 1 ? R.string.friends_catalog_snackbar_unfriended_f : R.string.friends_catalog_snackbar_unfriended_m, userProfile2.e);
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.friends_catalog_snackbar_button_undo), new nn4(friendsItemListVh, context, uIBlockProfile, 4));
                aVar.n();
                break;
            default:
                PermissionRequest permissionRequest = (PermissionRequest) obj3;
                String[] strArr = (String[]) rli0.A(rli0.v(new ulp0(rli0.l(rli0.j(new i5g(((ay90) obj5).f.entrySet()), new a9((ArrayList) obj2, i3)), new l6u((List) obj, 26)), new n9w(i2)), (ArrayList) obj4)).toArray(new String[0]);
                if (strArr.length == 0) {
                    permissionRequest.deny();
                } else {
                    permissionRequest.grant(strArr);
                }
                break;
        }
        return s3q0.a;
    }
}
