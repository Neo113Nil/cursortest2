package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.core.view.components.cell.f;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import org.chromium.base.version_info.VersionConstants;
import xsna.tlo0;

/* compiled from: ChannelMonetizationView.kt */
/* loaded from: classes16.dex */
public final class k4b implements gm50 {
    public final View b;
    public final ChannelMonetizationFragment c;
    public final com.vk.im.engine.internal.storage.delegates.messages.b d;
    public final Context e;
    public final View f;
    public final View g;
    public final bpn0 h;
    public final VkCell i;
    public final VkCell j;
    public final VkCell k;

    /* compiled from: ChannelMonetizationView.kt */
    public static final class a implements VkCell.f {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("IconViewParams(iconRes="), this.a, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k4b(View view, ChannelMonetizationFragment channelMonetizationFragment, com.vk.im.engine.internal.storage.delegates.messages.b bVar) {
        this.b = view;
        this.c = channelMonetizationFragment;
        this.d = bVar;
        this.e = view.getContext();
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.top_bar);
        View findViewById = view.findViewById(R.id.skeleton_wrapper);
        this.f = findViewById;
        View findViewById2 = view.findViewById(R.id.content_wrapper);
        this.g = findViewById2;
        this.h = new bpn0(new cb(this, 11));
        VkCell vkCell = (VkCell) view.findViewById(R.id.regular_support);
        a(this, vkCell, R.drawable.vk_icon_illustration_donut_calendar_48h);
        Object[] objArr = 0 == true ? 1 : 0;
        VkCell.Middle.c cVar = null;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.vkim_channels_monetization_regular_support_title), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.f(R.string.vkim_channels_monetization_regular_support_subtitle), (gzs) (0 == true ? 1 : 0), 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), cVar, (VkCell.Middle.Size) (0 == true ? 1 : 0), 12));
        this.i = vkCell;
        VkCell vkCell2 = (VkCell) view.findViewById(R.id.paid_reaction);
        ImFeatures imFeatures = ImFeatures.VKM_CHANNEL_DONUT_REACTION;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            a(this, vkCell2, R.drawable.vk_icon_illustration_donut_coin_heart_48h);
        } else {
            vkCell2.setVisibility(8);
        }
        this.j = vkCell2;
        VkCell vkCell3 = (VkCell) view.findViewById(R.id.payments);
        vkCell3.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(R.string.vkim_channels_monetization_payments_title), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, (VkCell.Middle.Size) (0 == true ? 1 : 0), 14));
        this.k = vkCell3;
        vkTopBar.setBack(new VkTopBar.b(new gy0(this, 13), null, null, null, null, 30));
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.vkim_channels_monetization_title), null, objArr2, null, null, 30), null, 0 == true ? 1 : 0, objArr3, 14));
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_help_circle_outline_28), 0 == true ? 1 : 0, new eu1(this, 10), null, 0 == true ? 1 : 0, null, 58), null, 6));
        VkCellSkeleton vkCellSkeleton = (VkCellSkeleton) view.findViewById(R.id.top_skeleton);
        vkCellSkeleton.setLeft(new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.b(iah0.b(24.0f), iah0.b(24.0f)), null));
        f.b bVar2 = com.vk.core.view.components.cell.f.Companion;
        float f = VersionConstants.PRODUCT_MAJOR_VERSION;
        int a2 = iah0.a(f);
        bVar2.getClass();
        vkCellSkeleton.setMiddle(new com.vk.core.view.components.cell.e(f.b.a(a2), f.b.a(iah0.a(80)), 12));
        ((VkCellSkeleton) view.findViewById(R.id.bottom_skeleton)).setMiddle(new com.vk.core.view.components.cell.e(f.b.a(iah0.a(f)), null, 14));
        findViewById.setVisibility(0);
        findViewById2.setVisibility(8);
    }

    public static void a(k4b k4bVar, VkCell vkCell, int i) {
        float f = 48;
        Size size = new Size(iah0.a(f), iah0.a(f));
        vkCell.c(new yy(9), new com.vk.movika.tools.controls.seekbar.o(2));
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.e(new a(i), size), null));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
