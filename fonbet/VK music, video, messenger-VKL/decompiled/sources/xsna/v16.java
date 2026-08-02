package xsna;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabsVh;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.money.MoneyTransfersFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.sharing.core.view.l;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.subscriptions.SubscriptionFragment;
import xsna.pnb0;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class v16 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v16(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Dialog dialog;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                z16 z16Var = (z16) obj;
                n16 n16Var = z16Var.A;
                if (n16Var != null) {
                    n16Var.c(z16Var.t.getContext());
                    break;
                }
                break;
            case 1:
                zk6 zk6Var = (zk6) obj;
                otu0 un = zk6Var.un();
                Context requireContext = zk6Var.requireContext();
                SchemeStatSak$EventScreen u5 = zk6Var.u5();
                un.getClass();
                otu0.b(requireContext, u5);
                break;
            case 2:
                int i2 = BaseSharingExternalActivity.Z;
                ((BaseSharingExternalActivity) obj).w.t1(null);
                break;
            case 3:
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                RecyclerView recyclerView = ((DiscoverSimilarFeedFragment) obj).b0;
                Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(0, 0);
                    break;
                }
                break;
            case 4:
                mjq mjqVar = (mjq) obj;
                mjqVar.l.l(mjqVar.p);
                break;
            case 5:
                int i3 = MoneyTransfersFragment.b1;
                ((MoneyTransfersFragment) obj).Lo();
                break;
            case 6:
                com.vk.attachpicker.a aVar = ((PhotoVideoAttachActivity) obj).c0;
                if (aVar != null && aVar.f) {
                    aVar.c(false);
                    break;
                }
                break;
            case 7:
                PollEditorModalBottomSheet pollEditorModalBottomSheet = (PollEditorModalBottomSheet) obj;
                tzp0.c.a aVar2 = PollEditorModalBottomSheet.o1;
                if (pollEditorModalBottomSheet.n && (dialog = pollEditorModalBottomSheet.s) != null && dialog.isShowing()) {
                    xn50.a.c(pollEditorModalBottomSheet, new pnb0.c.h(false));
                    break;
                }
                break;
            case 8:
                l.a aVar3 = ((com.vk.sharing.core.view.f) obj).D;
                if (aVar3 != null) {
                    aVar3.D2();
                    break;
                }
                break;
            case 9:
                int i4 = SubscriptionFragment.W;
                ((n9m0) obj).invoke(view);
                break;
            case 10:
                gzs<s3q0> gzsVar = ((ToolBottomView) obj).g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 11:
                ((com.vk.attachpicker.screen.p) obj).m();
                break;
            default:
                VkTabs vkTabs = ((VkTabsVh) obj).j;
                (vkTabs != null ? vkTabs : null).j();
                break;
        }
    }
}
