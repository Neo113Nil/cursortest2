package xsna;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.left.VkCellLeft;
import com.vk.debug.ui.DebugTabsFragment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdHideReasonsView;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import xsna.dsb0;
import xsna.inv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class l44 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l44(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post R;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((com.vk.attachpicker.impl.a) obj).c();
                break;
            case 1:
                bm9 bm9Var = (bm9) ((n96) obj).getPresenter();
                if (bm9Var != null) {
                    bm9Var.H3();
                    break;
                }
                break;
            case 2:
                ur9 ur9Var = (ur9) obj;
                ?? q6 = ur9Var.q6();
                if (q6 != 0 && (R = di60.R(q6)) != null) {
                    ((NewsfeedRouter) ur9Var.F.getValue()).T(ur9Var.itemView.getContext(), R, ur9Var.u);
                    PostInteract postInteract = ur9Var.w;
                    if (postInteract != null) {
                        postInteract.zb(PostInteract.Type.caption_link_click);
                        break;
                    }
                }
                break;
            case 3:
                ArrayList arrayList = DebugTabsFragment.S;
                ((DebugTabsFragment) obj).finish();
                break;
            case 4:
                qcy<Object>[] qcyVarArr = GameUnavailableFragment.W;
                ((GameUnavailableFragment) obj).kn().onBackPressed();
                break;
            case 5:
                gzs<s3q0> gzsVar = ((inv.a) obj).i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 6:
                ((AppCompatRadioButton) obj).setChecked(!r1.isChecked());
                break;
            case 7:
                oj20 oj20Var = (oj20) obj;
                oj20Var.Mn();
                rj20 rj20Var = oj20Var.C;
                if (rj20Var != null) {
                    rj20Var.a();
                    break;
                }
                break;
            case 8:
                int i2 = MyTargetAdHideReasonsView.h;
                ((izs) obj).invoke(view);
                break;
            case 9:
                ((dcn) obj).dismiss();
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.HINT, null, null, null, null, null, 62, null), new SchemeStat$TypeClickItem(SchemeStat$TypeClickItem.Subtype.SMART_NAVIGATION_TAB_HINT_ACCEPT), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                break;
            case 10:
                gzs<s3q0> gzsVar2 = ((id80) obj).b;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            case 11:
                zsb0 zsb0Var = (zsb0) obj;
                zsb0Var.q.setVisibility(8);
                LinearLayout linearLayout = zsb0Var.o;
                int childCount = linearLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = linearLayout.getChildAt(i3);
                    childAt.setClickable(false);
                    childAt.setEnabled(false);
                }
                zsb0Var.d.invoke(dsb0.f.b);
                break;
            case 12:
                ((com.vk.story.viewer.impl.presentation.stories.view.storyview.b) obj).c();
                break;
            case 13:
                xcm0 xcm0Var = ((tcm0) obj).k;
                if (xcm0Var != null) {
                    xcm0Var.g().d();
                    break;
                }
                break;
            case 14:
                gzs gzsVar3 = (gzs) obj;
                if (gzsVar3 != null) {
                    gzsVar3.invoke();
                    break;
                }
                break;
            case 15:
                int i4 = VkCellLeft.r;
                gzs<s3q0> gzsVar4 = ((VkCell.Left.c.b) obj).a;
                if (gzsVar4 != null) {
                    gzsVar4.invoke();
                    break;
                }
                break;
            case 16:
                com.vungle.ads.internal.ui.view.n.a((com.vungle.ads.internal.ui.view.n) obj, view);
                break;
            default:
                ((mbz0) obj).c();
                break;
        }
    }

    public /* synthetic */ l44(dcn dcnVar, fd60 fd60Var) {
        this.b = 9;
        this.c = dcnVar;
    }
}
