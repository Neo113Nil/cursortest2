package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.divider.VkSeparator;
import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: ProfileTabOptionAdapter.kt */
/* loaded from: classes5.dex */
public final class dvd0 extends vif0<ProfileTabOptions> {
    public final VkCell n;
    public final VkSeparator o;

    public dvd0(View view, b140 b140Var) {
        super(view);
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.item_cell);
        this.n = vkCell;
        this.o = (VkSeparator) this.itemView.findViewById(R.id.separator);
        bwt0.i0(vkCell, new com.vk.movika.sdk.base.logic.interactor.i(24, b140Var, this));
    }

    @Override // xsna.vif0
    public final void i6(ProfileTabOptions profileTabOptions) {
        ProfileTabOptions profileTabOptions2 = profileTabOptions;
        Integer num = profileTabOptions2.d;
        VkCell.Left.b a = num != null ? VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(num.intValue(), VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), (tlo0.h) null, 8)) : null;
        VkCell vkCell = this.n;
        vkCell.setLeft(a);
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        VkCell.Middle.e eVar = new VkCell.Middle.e(tq.h(tlo0.Companion, profileTabOptions2.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, profileTabOptions2.d() ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_lock_12), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (tlo0.f) null, (Size) null, 12) : null, 30);
        Integer num2 = profileTabOptions2.c;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, num2 != null ? new VkCell.Middle.d(new tlo0.f(num2.intValue()), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, null, 12));
        vkCell.setRight(profileTabOptions2.e() ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(6, null, true), null, 27) : null);
        bwt0.p0(this.o, profileTabOptions2 instanceof ProfileTabOptions.DefaultOptions);
    }
}
