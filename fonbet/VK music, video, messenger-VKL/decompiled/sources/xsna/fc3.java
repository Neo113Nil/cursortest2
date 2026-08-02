package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebFriendsUseApp;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vkontakte.android.R;
import xsna.jp20;
import xsna.ngv0;
import xsna.tgv0;
import xsna.tlo0;
import xsna.x7a;

/* compiled from: AppViewHolder.kt */
/* loaded from: classes6.dex */
public final class fc3 extends e9r0<x7a.d.e> {
    public static final int n = iah0.a(72);
    public static final int o = iah0.a(16);
    public final VkRichCell m;

    public fc3(ViewGroup viewGroup, d9r0 d9r0Var) {
        super(R.layout.vk_item_apps_catalog_details_app_item, viewGroup);
        View view = this.itemView;
        this.m = (VkRichCell) view;
        jjc.g(view, new du0(1, d9r0Var, this));
    }

    @Override // xsna.v96
    public final void W5(Object obj) {
        SectionAppItem sectionAppItem = ((x7a.d.e) obj).e;
        WebApiApplication webApiApplication = sectionAppItem.b;
        lp20 lp20Var = new lp20();
        VkRichCell vkRichCell = this.m;
        vkRichCell.setLeftMainPictureController(lp20Var);
        String str = webApiApplication.d.a(n).b;
        if (str == null) {
            str = "";
        }
        vkRichCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new jp20.a(str), VkCell.Left.Main.Size.Large), null));
        BadgeInfo badgeInfo = sectionAppItem.e;
        int i = badgeInfo != null ? badgeInfo.e : 0;
        boolean z = badgeInfo != null ? badgeInfo.d : false;
        if (i > 0) {
            vkRichCell.setRight(new VkCell.Right.d(new VkCell.Right.a.d(i, VkCounter.CounterAppearance.Appearance.AccentRed, 4), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        } else if (z) {
            vkRichCell.setRight(new VkCell.Right.d(new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.AccentRed), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        }
        WebFriendsUseApp webFriendsUseApp = webApiApplication.L;
        tgv0.a aVar = webFriendsUseApp == null ? null : new tgv0.a(rli0.A(new ulp0(rli0.y(rli0.t(new i5g(webFriendsUseApp.c), new nt(1)), 3), new v7(5))), null, oq.d(tlo0.Companion, webFriendsUseApp.b), VkUserStack.Size.Small, null, 90);
        vgv0 vgv0Var = new vgv0(oq.d(tlo0.Companion, webApiApplication.c), (ngv0.a) null, (ngv0) null, 1, 22);
        String str2 = webApiApplication.h;
        vkRichCell.setMiddle(new pgv0(vgv0Var, null, str2 != null ? new qgv0(new tlo0.h(str2), (ngv0.a) null, (ngv0.a) null, 1, 22) : null, aVar, null, null, 490));
    }
}
