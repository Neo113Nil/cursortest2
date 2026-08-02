package xsna;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.reviews.api.model.ReviewsModalBottomSheetArguments;
import com.vk.lists.DefaultEmptyView;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import xsna.dt1;
import xsna.ntl;
import xsna.tt9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class w5h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w5h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        View findViewByPosition;
        int i = this.b;
        Integer num2 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = z5h.j1;
                ((z5h) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ntl.a aVar = (ntl.a) obj3;
                EditText editText = (EditText) obj;
                TextView textView = (TextView) obj2;
                editText.setText(aVar.b);
                Integer num3 = aVar.c;
                if (num3 != null) {
                    editText.setInputType(num3.intValue());
                }
                editText.setLines(aVar.d);
                editText.addTextChangedListener(new ntl.b(textView));
                return s3q0.a;
            case 2:
                ImageSize imageSize = (ImageSize) ixj0.c(((j5o) obj3).i.e1().b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                if (imageSize != null) {
                    return imageSize.d.d;
                }
                return null;
            case 3:
                ((Integer) obj2).getClass();
                ((lb40) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                MusicDownloadsHistoryCatalogRootVh musicDownloadsHistoryCatalogRootVh = (MusicDownloadsHistoryCatalogRootVh) obj3;
                String str = (String) obj;
                musicDownloadsHistoryCatalogRootVh.i8(myc0.f(str) ? vyh0.a : alj.a);
                SearchResultsVh.cb(musicDownloadsHistoryCatalogRootVh.C, str, null, null, false, null, false, 60);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((k150) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultEmptyView defaultEmptyView = ((PostponedPostsFragment) obj3).d0;
                if (defaultEmptyView != null) {
                    defaultEmptyView.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                nud0.c((tt9.b.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 8:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) obj3;
                sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = reactionsFeedFragment.Z;
                if (recyclerView == null) {
                    return s3q0.a;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (sq60Var.e) {
                    num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                        r5 = findViewByPosition.getTop();
                    }
                    num2 = Integer.valueOf(r5);
                }
                reactionsFeedFragment.eo().a().H0(recyclerView, new k0(10, reactionsFeedFragment, sq60Var), new krc0(num, num2, linearLayoutManager, reactionsFeedFragment, sq60Var, 1), sq60Var.a, sq60Var.c);
                return s3q0.a;
            case 9:
                pig0 pig0Var = (pig0) obj3;
                ReviewsModalBottomSheetArguments reviewsModalBottomSheetArguments = pig0Var.h;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-605815547, intValue, -1, "com.vk.ecomm.reviews.impl.bottomsheets.ReviewsModalBottomSheetBuilder.<anonymous> (ReviewsModalBottomSheetBuilder.kt:18)");
                    }
                    tig0.d(pg90.a(reviewsModalBottomSheetArguments.b, 0, aVar2), null, reviewsModalBottomSheetArguments.c, reviewsModalBottomSheetArguments.d, reviewsModalBottomSheetArguments.e, reviewsModalBottomSheetArguments.f, reviewsModalBottomSheetArguments.g, pig0Var.i, reviewsModalBottomSheetArguments.h, aVar2, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 10:
                fcn0 fcn0Var = (fcn0) obj3;
                ((Integer) obj).getClass();
                WebAction webAction = (WebAction) obj2;
                u7n0 u7n0Var = fcn0Var.p;
                Context context = fcn0Var.itemView.getContext();
                Object obj4 = fcn0Var.l;
                if (obj4 == null) {
                    obj4 = null;
                }
                u7n0Var.b(context, webAction, (f9n0) obj4, null);
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                int i3 = VideoProfileCreatorOnboardingVideoCounterView.o;
                ((VideoProfileCreatorOnboardingVideoCounterView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                return jnx0.B((jnx0) obj3, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
            default:
                return new h9x((((dt1.c) obj3).a(0, (int) (((q9x) obj).a & 4294967295L)) & 4294967295L) | (0 << 32));
        }
    }

    public /* synthetic */ w5h(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
