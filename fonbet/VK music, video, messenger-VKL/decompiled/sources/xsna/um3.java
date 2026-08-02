package xsna;

import android.view.View;
import android.widget.Toast;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class um3 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ um3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post post;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = ArticleAuthorPageFragment.f0;
                ((ArticleAuthorPageFragment) obj).finish();
                break;
            case 1:
                k6c k6cVar = (k6c) obj;
                TabLayout tabLayout = k6cVar.m;
                if (tabLayout == null) {
                    tabLayout = null;
                }
                int tabCount = tabLayout.getTabCount();
                ViewPager2 viewPager2 = k6cVar.j;
                int currentItem = tabCount - (viewPager2 != null ? viewPager2 : null).getCurrentItem();
                i6c i6cVar = (i6c) k6cVar.h;
                if (i6cVar != null) {
                    i6cVar.i1(currentItem);
                    break;
                }
                break;
            case 2:
                ((mbc) obj).dismiss();
                break;
            case 3:
                int i3 = CommunityWidgetPreviewFragment.U;
                h3p0.b((CommunityWidgetPreviewFragment) obj);
                break;
            case 4:
                w2j w2jVar = (w2j) obj;
                dw20 dw20Var = w2jVar.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                w2jVar.b.a();
                break;
            case 5:
                ((q340) obj).l.e();
                break;
            case 6:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.performClick();
                    break;
                }
                break;
            case 7:
                ((li70) obj).d("cell");
                break;
            case 8:
                d1c0 d1c0Var = (d1c0) obj;
                if (!jjc.b() && (post = (Post) d1c0Var.q6()) != null) {
                    Integer num = post.u;
                    Integer num2 = post.v;
                    if (num != null && num2 != null) {
                        ((NewsfeedRouter) d1c0Var.G.getValue()).Y(post.n, num2.intValue(), num.intValue(), d1c0Var.itemView.getContext(), post.m);
                        break;
                    } else {
                        d1c0Var.b7(post, MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors.EntryPoint.FROM_HEADER);
                        break;
                    }
                }
                break;
            case 9:
                Toast.makeText(((b5p0) obj).itemView.getContext(), "Bubble click!", 0).show();
                break;
            case 10:
                csr0 csr0Var = (csr0) obj;
                x120 x120Var = csr0Var.r;
                if (x120Var != null) {
                    csr0Var.l.a(x120Var);
                    break;
                }
                break;
            default:
                VideoRelatedVideosFragment.mo((VideoRelatedVideosFragment) obj);
                break;
        }
    }
}
