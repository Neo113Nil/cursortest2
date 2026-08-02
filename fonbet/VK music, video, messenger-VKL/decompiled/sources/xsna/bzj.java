package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.debug.ui.dev.DebugMockApiResponsesFragment;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vk.importcontacts.api.di.ImportContactsComponent;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.snippet.ui.presentation.MusicSnippetsFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.multiaccount.api.RelatedProfileComponent;
import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bzj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bzj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.disposables.c cVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                czj czjVar = (czj) obj;
                return czjVar.O(new dzj(czjVar.j));
            case 1:
                int i2 = DebugMockApiResponsesFragment.O;
                return ((BridgeComponent) m7m.d((DebugMockApiResponsesFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 2:
                DescriptionState descriptionState = (DescriptionState) obj;
                return Boolean.valueOf(!epx.f(descriptionState.c, descriptionState.b));
            case 3:
                qkr0 qkr0Var = ((zam) obj).h;
                if (qkr0Var != null && (cVar = qkr0Var.a.r) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 4:
                View view = ((gfm) obj).d.g;
                LinearInterpolator linearInterpolator = gfm.n;
                return new vtt0(view, linearInterpolator, linearInterpolator, 200L, 16);
            case 5:
                ((hym) obj).U6();
                return s3q0.a;
            case 6:
                Context context = ((s3n) obj).a.getContext();
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d(context));
            case 7:
                int i3 = txo.q1;
                return ((RelatedProfileComponent) ((k7m) m7m.f((txo) obj)).a(fpf0.a(RelatedProfileComponent.class))).db();
            case 8:
                int i4 = EntriesListFragment.m0;
                return ((StoryViewerComponent) m7m.d((EntriesListFragment) obj).a(fpf0.a(StoryViewerComponent.class))).w9();
            case 9:
                return qq2.b(((cdr) obj).itemView, woo.o, 1.0f, 0.75f, 200.0f);
            case 10:
                f6s f6sVar = (f6s) obj;
                q6s j7 = f6sVar.j7();
                if (j7 != null) {
                    f6sVar.p7(j7, new j4(12, f6sVar, j7)).invoke();
                }
                return s3q0.a;
            case 11:
                int i5 = FriendsRecommendationsFragment.b0;
                return ((FriendsRecommendationsFragment) obj).io().e;
            case 12:
                return new bbx(((evs) obj).E.E);
            case 13:
                twt0.c(((fzt) obj).i, 100L, null, 6);
                return s3q0.a;
            case 14:
                return ((GlobalSearchVideoRootVh) obj).q;
            case 15:
                return ((y4u) obj).h.xf();
            case 16:
                return new vxu((wxu) obj);
            case 17:
                return new hyv((nsd0) obj);
            case 18:
                int i6 = ImportContactsFragment.Q;
                return ((ImportContactsComponent) ((k7m) m7m.f((ImportContactsFragment) obj)).mo408a(fpf0.a(ImportContactsComponent.class))).a();
            case 19:
                return (SearchUiComponent) ((gxw) obj).c().a(fpf0.a(SearchUiComponent.class));
            case 20:
                return ((wex) obj).itemView.findViewById(R.id.video_wrap);
            case 21:
                return new tvp(((p3y) obj).e);
            case 22:
                return (TextView) ((oly) obj).a.findViewById(R.id.nativeads_rating);
            case 23:
                LiveView liveView = (LiveView) obj;
                d3m.e(liveView.l, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                liveView.Q.E();
                return s3q0.a;
            case 24:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) obj;
                return new po00(bVar.j, bVar.l);
            case 25:
                int i7 = MarketEditAlbumCoverFragment.d0;
                return ((BridgeComponent) m7m.d((MarketEditAlbumCoverFragment) obj).a(fpf0.a(BridgeComponent.class))).id();
            case 26:
                int i8 = MarketEditAlbumGoodsFragment.c1;
                ((MarketEditAlbumGoodsFragment) obj).No();
                return s3q0.a;
            case 27:
                return (ScrollToBottomView) ((ViewStub) ((vm30) obj).t.findViewById(R.id.scroll_to_bottom_view_stub)).inflate();
            case 28:
                ((rw40) obj).y.I0();
                return s3q0.a;
            default:
                int i9 = MusicSnippetsFragment.Y;
                return ((PlayerAnalyticsComponent) m7m.d((MusicSnippetsFragment) obj).a(fpf0.a(PlayerAnalyticsComponent.class))).a1();
        }
    }
}
