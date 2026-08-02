package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Arrays;
import xsna.k1u0;
import xsna.ngv0;
import xsna.tlo0;

/* compiled from: CommunityStrikesInfoItem.kt */
/* loaded from: classes5.dex */
public final class s2i extends we6 {
    public final t2i g;
    public final ynh h;
    public final int i = -224;

    /* compiled from: CommunityStrikesInfoItem.kt */
    public static final class a extends vif0<s2i> {
        public final VkRichCell n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r2, viewGroup);
            int a = e3m.a(R.dimen.vk_ui_cardgrid_padding_vertical, viewGroup.getContext());
            VkRichCell vkRichCell = new VkRichCell(viewGroup.getContext(), null, 6, 0);
            vkRichCell.setId(R.id.vk_community_strike_card);
            vkRichCell.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            bwt0.f0(vkRichCell, 0, a, 0, a, 5);
            this.n = (VkRichCell) this.itemView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00f0, code lost:
        
            if (r0.intValue() != 0) goto L20;
         */
        @Override // xsna.vif0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(s2i s2iVar) {
            int i;
            Integer num;
            s2i s2iVar2 = s2iVar;
            ExtendedCommunityProfile.g gVar = s2iVar2.g.b;
            pgv0 v = ahn.v(new vgv0(oq.d(tlo0.Companion, gVar.c), (ngv0.a) null, (ngv0) null, 0, 30), null, new qgv0(new tlo0.h(s2iVar2.h.e().d(gVar.d, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, new ogv0(new tlo0.h(gVar.e), new yq1(5, s2iVar2, this), null, VkButton.Size.Small, VkButton.Mode.Link, VkButton.Appearance.Accent, false, false, 796), null, 442);
            VkRichCell vkRichCell = this.n;
            vkRichCell.setMiddle(v);
            Context context = vkRichCell.getContext();
            try {
                i = context.getResources().getIdentifier(String.format("vk_icon_%s_%s", Arrays.copyOf(new Object[]{gVar.a, String.valueOf(28)}, 2)), "drawable", context.getPackageName());
            } catch (Throwable unused) {
                i = 0;
            }
            VkCell.Left.b bVar = null;
            r4 = null;
            Integer num2 = null;
            if (i != 0) {
                VkCell.Left.a aVar = VkCell.Left.Companion;
                gko gkoVar = new gko(i);
                VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
                Context context2 = vkRichCell.getContext();
                String str = gVar.b;
                if (str != null) {
                    try {
                        try {
                            num = Integer.valueOf(context2.getResources().getIdentifier(String.format("vk_ui_%s", Arrays.copyOf(new Object[]{str}, 1)), "attr", context2.getPackageName()));
                        } catch (Throwable th) {
                            L.e(th);
                            num = null;
                        }
                        if (num == null) {
                        }
                        num2 = num;
                    } catch (Throwable unused2) {
                        num2 = 0;
                    }
                }
                bVar = VkCell.Left.a.a(aVar, new VkCell.Left.Main.c(gkoVar, size, num2 == null ? k1u0.c.a : new k1u0.a(new x7g(num2.intValue())), 8));
            }
            vkRichCell.setLeft(bVar);
        }
    }

    public s2i(t2i t2iVar, ynh ynhVar) {
        this.g = t2iVar;
        this.h = ynhVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
