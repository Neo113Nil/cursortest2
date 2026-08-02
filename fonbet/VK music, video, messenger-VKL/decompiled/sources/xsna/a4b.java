package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.banner.VkNotificationBanner;
import com.vk.core.view.components.cell.VkCell;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.g4b;
import xsna.k1u0;
import xsna.l4b;
import xsna.tlo0;

/* compiled from: ChannelMonetizationFragment.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class a4b extends FunctionReferenceImpl implements izs<l4b.a.C3231a, s3q0> {
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [xsna.izs, xsna.k1u0$a, xsna.tlo0$f] */
    @Override // xsna.izs
    public final s3q0 invoke(l4b.a.C3231a c3231a) {
        ?? r12;
        int i;
        String string;
        boolean z;
        l4b.a.C3231a c3231a2 = c3231a;
        k4b k4bVar = (k4b) this.receiver;
        Context context = k4bVar.e;
        g4b g4bVar = c3231a2.g;
        boolean z2 = c3231a2.b;
        ((VkNotificationBanner) k4bVar.h.getValue()).setVisibility(!z2 ? 0 : 8);
        VkCell vkCell = k4bVar.i;
        tlo0.f h = tq.h(tlo0.Companion, c3231a2.c ? R.string.vkim_channels_monetization_regular_support_enabled : R.string.vkim_channels_monetization_regular_support_disabled);
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.e(h, h), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 22));
        if (z2) {
            bwt0.i0(vkCell, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(k4bVar, 16));
            vkCell.setEnabled(true);
        } else {
            vkCell.setEnabled(false);
        }
        ImFeatures imFeatures = ImFeatures.VKM_CHANNEL_DONUT_REACTION;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            VkCell vkCell2 = k4bVar.j;
            boolean z3 = false ? 1 : 0;
            boolean z4 = false ? 1 : 0;
            vkCell2.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(R.string.vkim_channels_monetization_donation_reaction_title), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.h(context.getString(R.string.vkim_channels_monetization_donation_reaction_subtitle, Integer.valueOf(c3231a2.e))), (gzs) z4, 0, (TextUtils.TruncateAt) z3, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) (false ? 1 : 0), 12));
            if (g4bVar instanceof g4b.b) {
                tlo0.f fVar = new tlo0.f(R.string.vkim_channels_monetization_regular_support_disabled);
                z = false;
                vkCell2.setRight(new VkCell.Right.d(new VkCell.Right.a.e(fVar, fVar), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 22));
            } else {
                z = false;
                VkCell.Right.e eVar = null;
                VkCell.Right.ExtraAction.a aVar = null;
                vkCell2.setRight(new VkCell.Right.d(new VkCell.Right.a.f(4, new eb(k4bVar, 9), c3231a2.d), eVar, aVar, (VkCell.Right.b) null, 30));
                View findViewById = vkCell2.findViewById(R.id.ds_internal_cell_right_action_switch);
                findViewById.setClickable(false);
                findViewById.setFocusable(false);
            }
            if (z2) {
                vkCell2.setEnabled(true);
                bwt0.i0(vkCell2, new fb(k4bVar, 15));
                r12 = z;
            } else {
                vkCell2.setEnabled(false);
                r12 = z;
            }
        } else {
            r12 = 0;
        }
        VkCell vkCell3 = k4bVar.k;
        if (z2) {
            if (g4bVar instanceof g4b.a) {
                string = context.getString(R.string.vkim_channels_monetization_payments_card, ((g4b.a) g4bVar).a);
            } else if (g4bVar instanceof g4b.c) {
                string = context.getString(R.string.vkim_channels_monetization_payments_vk_pay);
            } else {
                if (!(g4bVar instanceof g4b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = context.getString(R.string.vkim_channels_monetization_payments_not_selected);
            }
            tlo0.h hVar = new tlo0.h(string);
            vkCell3.setRight(new VkCell.Right.d(new VkCell.Right.a.e(hVar, hVar), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) r12, (tlo0.f) r12, (k1u0.a) r12, 7), 22));
            bwt0.i0(vkCell3, new com.vk.im.ui.fragments.b(k4bVar, 19));
            vkCell3.setVisibility(0);
            i = 8;
        } else {
            i = 8;
            vkCell3.setVisibility(8);
        }
        boolean z5 = c3231a2.a;
        k4bVar.f.setVisibility(z5 ? 0 : i);
        k4bVar.g.setVisibility(!z5 ? 0 : i);
        return s3q0.a;
    }
}
