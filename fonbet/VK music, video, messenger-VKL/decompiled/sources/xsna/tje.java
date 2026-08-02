package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.attachments.api.publish.links.ClipsLinksAttachEntryParams;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import com.vk.clips.attachments.impl.publish.links.edit.helper.EditLinkHideReason;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.mail.libverify.g.a;
import ru.mail.libverify.j0.j;
import xsna.c5v0;
import xsna.tlo0;
import xsna.yqu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tje implements pcs, io.reactivex.rxjava3.functions.l, t8z0, j.c {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tje(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.j0.j.c
    public void a(Future future) {
        ((ru.mail.libverify.api.s) this.b).a((a.e) this.c, future);
    }

    @Override // xsna.t8z0
    public void accept(Object obj) {
        p7z0 p7z0Var = (p7z0) this.b;
        pjz0 pjz0Var = (pjz0) this.c;
        xrz0 xrz0Var = (xrz0) obj;
        if (p7z0Var.a.j == null) {
            gu8.c(null, "InstreamAdEngine: Unable to start delayed ad: player has not set");
            return;
        }
        p7z0Var.j = xrz0Var;
        p7z0Var.d.k = pjz0Var.h;
        xrz0Var.f();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        UserId userId = (UserId) this.b;
        String str = (String) this.c;
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            return rsg0.y0(yfb.y(yqu.a.b(null, null, str, null, fkq0.a(userId), null, null, null), new xsq(1)), null, null, 3);
        }
        gqu gquVar = new gqu(userId, false, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        gquVar.U0(str);
        return rsg0.y0(gquVar, null, null, 3);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        ClipsLinksControllerRootFragment clipsLinksControllerRootFragment = (ClipsLinksControllerRootFragment) this.b;
        ClipsLinksAttachEntryParams clipsLinksAttachEntryParams = (ClipsLinksAttachEntryParams) this.c;
        int i = ClipsLinksControllerRootFragment.Q;
        AttributeSet attributeSet = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("hide_reason", EditLinkHideReason.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("hide_reason");
            if (!(parcelable3 instanceof EditLinkHideReason)) {
                parcelable3 = null;
            }
            parcelable = (EditLinkHideReason) parcelable3;
        }
        EditLinkHideReason editLinkHideReason = (EditLinkHideReason) parcelable;
        if (epx.f(editLinkHideReason, EditLinkHideReason.ClickOutside.b)) {
            clipsLinksControllerRootFragment.dismiss();
            return;
        }
        if (!(editLinkHideReason instanceof EditLinkHideReason.RulesClick)) {
            if (!(editLinkHideReason instanceof EditLinkHideReason.SaveClick)) {
                if (editLinkHideReason != null) {
                    throw new NoWhenBranchMatchedException();
                }
                clipsLinksControllerRootFragment.dismiss();
                return;
            } else {
                EditLinkHideReason.SaveClick saveClick = (EditLinkHideReason.SaveClick) editLinkHideReason;
                clipsLinksControllerRootFragment.getParentFragmentManager().k0(yfb.b(new Pair(clipsLinksAttachEntryParams.d, new ClipsLinkAttachment(saveClick.c, saveClick.b))), clipsLinksAttachEntryParams.e);
                dw20 dw20Var = clipsLinksControllerRootFragment.N;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                clipsLinksControllerRootFragment.dismiss();
                return;
            }
        }
        EditLinkHideReason.RulesClick rulesClick = (EditLinkHideReason.RulesClick) editLinkHideReason;
        ClipsLinkAttachment clipsLinkAttachment = new ClipsLinkAttachment(rulesClick.b, rulesClick.c);
        VkModal.Mode mode = VkModal.Mode.Card;
        c5v0.b bVar = new c5v0.b(12, tq.h(tlo0.Companion, R.string.clips_links_item_from_publication_links_rules_title), new tlo0.f(R.string.clips_links_item_from_publication_links_rules_sub_title));
        Context requireContext = clipsLinksControllerRootFragment.requireContext();
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, requireContext);
        a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i2 = new k9x(1, 4, 1).c;
        if (1 <= i2) {
            int i3 = 1;
            while (true) {
                VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(requireContext, attributeSet, 6);
                vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_info_20), null, 6));
                vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(tq.h(tlo0.Companion, i3 != 1 ? i3 != 2 ? i3 != 3 ? R.string.clips_links_item_from_publication_links_rules_4 : R.string.clips_links_item_from_publication_links_rules_3 : R.string.clips_links_item_from_publication_links_rules_2 : R.string.clips_links_item_from_publication_links_rules_1), true, false, false, false, null, 60));
                if (i3 != i2) {
                    f4m.q(e3m.a(R.dimen.vk_ui_spacing_size_xl, vkMiniInfoCell.getContext()), vkMiniInfoCell);
                }
                a.addView(vkMiniInfoCell);
                if (i3 == i2) {
                    break;
                }
                i3++;
                attributeSet = null;
            }
        }
        clipsLinksControllerRootFragment.O = new VkModal(mode, new b.a.C0790b(null, bVar, a, new c5v0.a(new c5v0.a.C2643a(tq.h(tlo0.Companion, R.string.clips_links_item_from_publication_understandable), new sje(clipsLinksControllerRootFragment, 0), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), new c5v0.a.C2643a(new tlo0.f(R.string.clips_links_item_from_publication_links_rules_sub_title_more), new defpackage.e(clipsLinksControllerRootFragment, 22), null, VkButton.Mode.Secondary, null, false, 444), 4), 49), new xt9(clipsLinksControllerRootFragment, clipsLinkAttachment, clipsLinksAttachEntryParams, 1), false, 20).b(clipsLinksControllerRootFragment.requireContext(), "ClipsLinksAttachRulesView");
    }
}
