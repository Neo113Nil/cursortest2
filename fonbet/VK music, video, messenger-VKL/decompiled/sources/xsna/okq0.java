package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c5v0;
import xsna.tlo0;

/* compiled from: UserLinksClickControllerImpl.kt */
/* loaded from: classes16.dex */
public final class okq0 implements nkq0 {

    /* compiled from: UserLinksClickControllerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipLinkModerationStatus.values().length];
            try {
                iArr[ClipLinkModerationStatus.REJECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipLinkModerationStatus.APPROVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, xsna.dw20] */
    @Override // xsna.nkq0
    public final void a(Activity activity, ClipVideoFile clipVideoFile, ActionLink actionLink) {
        int i = a.$EnumSwitchMapping$0[clipVideoFile.K1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            maz.c(xwk.d().e(), activity, actionLink.e, new LaunchContext(false, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null, null, 24);
            return;
        }
        if (clipVideoFile.F) {
            ActionLink actionLink2 = clipVideoFile.Y;
            c5v0.a.C2643a c2643a = null;
            if ("clips_user_link".equals(actionLink2 != null ? actionLink2.c : null)) {
                l7s u = bwt0.u(activity);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                VkModal.Mode mode = VkModal.Mode.Card;
                c5v0.b bVar = new c5v0.b(12, tq.h(tlo0.Companion, R.string.clip_link_rejected_modal_title), new tlo0.f(R.string.clip_link_rejected_modal_subtitle));
                LinearLayout linearLayout = new LinearLayout(u);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                int i2 = 6;
                int i3 = new k9x(1, 2, 1).c;
                if (1 <= i3) {
                    int i4 = 1;
                    while (true) {
                        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(u, null, 6);
                        vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_info_20), null, 6));
                        vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(tq.h(tlo0.Companion, i4 == 1 ? R.string.clip_link_rejected_modal_reason_1 : R.string.clip_link_rejected_modal_reason_2), true, false, false, false, null, 60));
                        if (i4 != i3) {
                            f4m.q(e3m.a(R.dimen.vk_ui_spacing_size_xl, vkMiniInfoCell.getContext()), vkMiniInfoCell);
                        }
                        linearLayout.addView(vkMiniInfoCell);
                        if (i4 == i3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                ref$ObjectRef.element = new VkModal(mode, new b.a.C0790b(null, bVar, linearLayout, new c5v0.a(new c5v0.a.C2643a(tq.h(tlo0.Companion, R.string.clip_link_rejected_understandable), new dck0(ref$ObjectRef, 9), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), c2643a, i2), 49), null, false, 28).b(u, "ClipsLinksAttachDisabledView");
            }
        }
    }
}
