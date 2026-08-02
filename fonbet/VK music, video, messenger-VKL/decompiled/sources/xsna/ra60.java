package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.api.comments.CommentsOrder;
import com.vk.dto.common.data.LikeInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NewsEntryFeedbackCommentsPresenter.kt */
/* loaded from: classes4.dex */
public final class ra60 extends com.vk.newsfeed.impl.presenters.b {
    public final NewsEntryFeedbackCommentsFragment b0;

    public ra60(NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment, mzp0 mzp0Var) {
        super(newsEntryFeedbackCommentsFragment, mzp0Var);
        this.b0 = newsEntryFeedbackCommentsFragment;
    }

    @Override // com.vk.newsfeed.impl.presenters.b
    public final d9c0 i0() {
        return this.b0;
    }

    @Override // com.vk.newsfeed.impl.presenters.b
    public final void s2(String str, List<CommentsOrder.Item> list, NewsEntry newsEntry) {
        CoordinatorLayout coordinatorLayout;
        Object obj;
        if (newsEntry == null) {
            return;
        }
        int g0 = g0();
        boolean z = false;
        NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment = this.b0;
        if (g0 <= 0 || this.B <= 1 || list.isEmpty()) {
            View view = newsEntryFeedbackCommentsFragment.Y0;
            if (view != null) {
                bwt0.p0(view, false);
            }
            View view2 = newsEntryFeedbackCommentsFragment.Y0;
            if (view2 == null || (coordinatorLayout = newsEntryFeedbackCommentsFragment.V0) == null) {
                return;
            }
            coordinatorLayout.B(view2);
            return;
        }
        u1c0 e0 = e0(newsEntry, str, list, newsEntryFeedbackCommentsFragment.M0(), Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE);
        View view3 = newsEntryFeedbackCommentsFragment.Y0;
        if (view3 == null) {
            return;
        }
        bwt0.p0(view3, true);
        Object obj2 = e0.g;
        yfg yfgVar = obj2 instanceof yfg ? (yfg) obj2 : null;
        newsEntryFeedbackCommentsFragment.a1 = yfgVar;
        if (yfgVar == null) {
            return;
        }
        TextView textView = newsEntryFeedbackCommentsFragment.Z0;
        if (textView != null) {
            Iterator<T> it = yfgVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(yfgVar.c, ((CommentsOrder.Item) obj).b)) {
                        break;
                    }
                }
            }
            CommentsOrder.Item item = (CommentsOrder.Item) obj;
            textView.setText(item != null ? item.c : null);
        }
        TextView textView2 = newsEntryFeedbackCommentsFragment.Z0;
        if (textView2 != null) {
            if (yfgVar.b > 1 && !yfgVar.d.isEmpty()) {
                z = true;
            }
            bwt0.p0(textView2, z);
        }
        CoordinatorLayout coordinatorLayout2 = newsEntryFeedbackCommentsFragment.V0;
        if (coordinatorLayout2 != null) {
            coordinatorLayout2.B(view3);
        }
    }

    @Override // com.vk.newsfeed.impl.presenters.b
    public final void x(NewsEntry newsEntry) {
        ArrayList arrayList = new ArrayList();
        qa60 qa60Var = new qa60(this.M, 0);
        ListDataSet<u1c0> listDataSet = this.G;
        u1c0 t = listDataSet.t(qa60Var);
        if (t != null) {
            arrayList.add(t);
        }
        listDataSet.setItems(arrayList);
    }

    @Override // com.vk.newsfeed.impl.presenters.b, xsna.c9c0
    public final void D1(List<LikeInfo> list) {
    }
}
