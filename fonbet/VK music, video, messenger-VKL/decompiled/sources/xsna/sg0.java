package xsna;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.qr.OldQrAuthFragment;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCategory;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCategoryVh;
import com.vk.communities.GroupsSuggestionsFragment;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.core.view.components.search.ExpandableActionVkSearchView;
import com.vk.dto.common.Attachment;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.movika.impl.onboarding.InteractiveOnboardingModalBottomSheet;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.promo.calls.CallsPromoActivity;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stickers.roulette.StickersRouletteFragment;
import one.video.controls.views.LiveSeekView;
import xsna.b4;
import xsna.cs00;
import xsna.msf0;
import xsna.tg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sg0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var;
        gzs<s3q0> gzsVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((tg0.a) obj).l.d(b4.q.a);
                break;
            case 1:
                int i2 = BonusCatalogFragment.f0;
                ((BonusCatalogFragment) obj).io();
                break;
            case 2:
                int i3 = CallsPromoActivity.l;
                g2v.c().j().b();
                ((CallsPromoActivity) obj).finish();
                break;
            case 3:
                CommunitiesCategoryVh communitiesCategoryVh = (CommunitiesCategoryVh) obj;
                UIBlockGroupsCategory uIBlockGroupsCategory = communitiesCategoryVh.j;
                if (uIBlockGroupsCategory != null) {
                    UIBlockAction uIBlockAction = uIBlockGroupsCategory.z;
                    if (!(uIBlockAction instanceof UIBlockActionOpenSection)) {
                        com.vk.catalog2.common.ui.mvp.util.a.e(communitiesCategoryVh.e, view.getContext(), uIBlockGroupsCategory, uIBlockAction, null, 56);
                        break;
                    } else {
                        communitiesCategoryVh.f.a(new cfp0(uIBlockAction, null));
                        UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) uIBlockAction;
                        nda.e(communitiesCategoryVh.d, view.getContext(), communitiesCategoryVh.c, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, uIBlockActionOpenSection.E, null, communitiesCategoryVh.g, 96);
                        break;
                    }
                }
                break;
            case 4:
                ((ieh) obj).I.m0();
                break;
            case 5:
                ((tmo) obj).u();
                break;
            case 6:
                View.OnClickListener actionClickListener = ((ExpandableActionVkSearchView) obj).getActionClickListener();
                if (actionClickListener != null) {
                    actionClickListener.onClick(view);
                    break;
                }
                break;
            case 7:
                int i4 = GroupsSuggestionsFragment.Y;
                h3p0.b((GroupsSuggestionsFragment) obj);
                break;
            case 8:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.h.this.e.getClass();
                break;
            case 9:
                InteractiveOnboardingModalBottomSheet interactiveOnboardingModalBottomSheet = (InteractiveOnboardingModalBottomSheet) obj;
                interactiveOnboardingModalBottomSheet.g1++;
                interactiveOnboardingModalBottomSheet.Yn();
                break;
            case 10:
                LiveSeekView liveSeekView = (LiveSeekView) obj;
                LiveSeekView.b bVar = liveSeekView.b;
                if (bVar != null) {
                    bVar.b(0L);
                }
                liveSeekView.a(0L);
                break;
            case 11:
                zr00 zr00Var = (zr00) obj;
                xr00 xr00Var = zr00Var.v;
                if (xr00Var != null) {
                    zr00Var.l.a(new cs00.d(xr00Var.b, zr00Var.n));
                    break;
                }
                break;
            case 12:
                fv20 fv20Var = (fv20) obj;
                hv20<?> hv20Var = fv20Var.r1;
                (hv20Var != null ? hv20Var : null).K2(fv20Var.A1, fv20Var.eo());
                break;
            case 13:
                int i5 = OldQrAuthFragment.U;
                ((OldQrAuthFragment) obj).finish();
                break;
            case 14:
                ev90 ev90Var = (ev90) obj;
                Attachment attachment = ev90Var.d;
                if (attachment != null && (x64Var = ev90Var.o) != null) {
                    x64Var.f(attachment);
                    break;
                }
                break;
            case 15:
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                RecyclerView recyclerView = ((PostsFromNotificationsFragment) obj).Z;
                RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(0, 0);
                    break;
                }
                break;
            case 16:
                ((rsf0) obj).d.invoke(msf0.j.b);
                break;
            case 17:
                StickersRouletteFragment stickersRouletteFragment = (StickersRouletteFragment) obj;
                int i6 = StickersRouletteFragment.o0;
                ocl0 ocl0Var = (ocl0) stickersRouletteFragment.S;
                if (ocl0Var != null) {
                    Context requireContext = stickersRouletteFragment.requireContext();
                    SearchStatsLoggingInfo searchStatsLoggingInfo = stickersRouletteFragment.i0;
                    ocl0Var.J3(requireContext, searchStatsLoggingInfo != null ? searchStatsLoggingInfo.f : null, stickersRouletteFragment.j0, Integer.valueOf(stickersRouletteFragment.k0));
                    break;
                }
                break;
            case 18:
                Toast.makeText(((b5p0) obj).itemView.getContext(), "Click!", 0).show();
                break;
            case 19:
                mps0 mps0Var = (mps0) obj;
                x64 x64Var2 = mps0Var.i;
                if (x64Var2 != null) {
                    x64Var2.c(mps0Var.c);
                    break;
                }
                break;
            default:
                VkCell.Right.e.b bVar2 = (VkCell.Right.e.b) obj;
                int i7 = VkCellRight.z;
                if (bVar2.e && (gzsVar = bVar2.f) != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
