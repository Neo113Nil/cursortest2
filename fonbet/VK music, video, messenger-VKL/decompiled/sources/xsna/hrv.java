package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.cell.VkCell;
import com.vk.friends.recommendations.impl.presentation.SearchFriendsItem;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: IconTextHolder.kt */
/* loaded from: classes16.dex */
public final class hrv extends vif0<SearchFriendsItem> implements View.OnClickListener {
    public static final /* synthetic */ int p = 0;
    public final BaseFragment n;
    public final VkCell o;

    public hrv(BaseFragment baseFragment, ViewGroup viewGroup) {
        super(new VkCell(viewGroup.getContext(), null, 6, 0), viewGroup);
        this.n = baseFragment;
        VkCell vkCell = (VkCell) this.itemView;
        this.o = vkCell;
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        jjc.f(this, this.itemView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(SearchFriendsItem searchFriendsItem) {
        SearchFriendsItem searchFriendsItem2 = searchFriendsItem;
        int i = searchFriendsItem2.c;
        VkCell vkCell = this.o;
        if (i != 0) {
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(searchFriendsItem2.c, VkCell.Left.Main.Size.Small, (k1u0) null, (tlo0.h) null, 12), null));
        }
        VkCell.Middle.d dVar = null;
        VkCell.Middle.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, searchFriendsItem2.d), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, cVar, (VkCell.Middle.Size) objArr, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        ViewGroup viewGroup = this.l;
        if (viewGroup == null || (context = viewGroup.getContext()) == null || (h = e3m.h(context)) == null) {
            return;
        }
        int i = ((SearchFriendsItem) this.m).b;
        if (i == 0) {
            ((NewsFeedBridgeComponent) m7m.d(this.n).a(fpf0.a(NewsFeedBridgeComponent.class))).Ad().y1(h);
        } else {
            if (i != 2) {
                return;
            }
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            permissionHelper.d(h, PermissionHelper.l, R.string.vk_permissions_camera, R.string.vk_permissions_camera, new xyh(h, 20), null);
        }
    }
}
