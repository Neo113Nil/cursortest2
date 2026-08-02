package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.autoplay.background.controller.c;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.catalog.b;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.f;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.vmoji.character.recommendations.VmojiRecommendationsFragment;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.awn0;
import xsna.c99;
import xsna.gm50;
import xsna.hjl0;
import xsna.j3v0;
import xsna.khm0;
import xsna.naw0;
import xsna.tj50;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qjl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qjl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.vk.dto.newsfeed.FaveTag, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((b5u) obj).a.b == ((hjl0.a.l) ((hjl0.a) obj2)).b.a.b);
            case 1:
                ((dsl0) obj2).a();
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((StoryViewAction) obj2) == ((xwl0) obj).a);
            case 3:
                tj50.a aVar = (tj50.a) obj;
                t50 t50Var = new t50((igm0) obj2, 15);
                ao8 ao8Var = ao8.d;
                return new khm0.a(aVar.a(t50Var, ao8Var), aVar.a(ngm0.b, ao8Var));
            case 4:
                ((nvn0) obj2).T(new awn0.e(true, false));
                return s3q0.a;
            case 5:
                j0o0 j0o0Var = (j0o0) obj2;
                ?? r13 = (FaveTag) j0o0Var.m;
                defpackage.m0 m0Var = j0o0Var.o;
                AppBarLayout appBarLayout = epx.f(r13, (FaveTag) m0Var.get()) ? null : r13;
                m0Var.set(appBarLayout);
                j0o0Var.n.invoke(appBarLayout);
                return s3q0.a;
            case 6:
                ((u9q0) obj2).b((List) obj);
                return s3q0.a;
            case 7:
                ((tra0.a) obj).q((tra0) obj2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 8:
                g8r0 g8r0Var = (g8r0) obj2;
                RecyclerPaginatedView recyclerPaginatedView = g8r0Var.e;
                if (recyclerPaginatedView == null) {
                    recyclerPaginatedView = null;
                }
                RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || linearLayoutManager.s() != 0) {
                    RecyclerPaginatedView recyclerPaginatedView2 = g8r0Var.e;
                    if (recyclerPaginatedView2 == null) {
                        recyclerPaginatedView2 = null;
                    }
                    recyclerPaginatedView2.getRecyclerView().scrollToPosition(0);
                    AppBarLayout appBarLayout2 = g8r0Var.c;
                    (appBarLayout2 != null ? appBarLayout2 : null).g(true, true, true);
                }
                return s3q0.a;
            case 9:
                c.C1211c c1211c = (c.C1211c) obj2;
                VideoPipStateHolder.State state = (VideoPipStateHolder.State) obj;
                int i2 = state == null ? -1 : c.d.$EnumSwitchMapping$0[state.ordinal()];
                if (i2 == 1) {
                    c1211c.f();
                } else if (i2 == 2) {
                    c1211c.g();
                }
                return s3q0.a;
            case 10:
                ((acd) obj2).invoke();
                return s3q0.a;
            case 11:
                sfs0 sfs0Var = (sfs0) obj;
                return new b.a.C1968b((VideoDiscoveryCatalogSourceArgs) obj2, sfs0Var.a, sfs0Var.b);
            case 12:
                VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
                ((exi0) obj2).invoke(new rbt0(0, 50, videoListWithTotalCount.c, 48, com.vk.video.ui.discovery.minimizable.related_videos.d.b(videoListWithTotalCount.b)));
                return s3q0.a;
            case 13:
                VideoEpisodesFragment videoEpisodesFragment = (VideoEpisodesFragment) obj2;
                int i3 = VideoEpisodesFragment.V;
                gm50.a.a(videoEpisodesFragment, ((f.a) obj).a, new c3k0(videoEpisodesFragment, 11));
                return s3q0.a;
            case 14:
                qgi0.h((tgi0) obj, ((VideoMetaViewState.a) obj2).h.b);
                return s3q0.a;
            case 15:
                lat0 lat0Var = (lat0) obj;
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = ((VideoMinimizableDiscoveryFragment) obj2).X;
                if (miniPlayerControllersWrapper != null) {
                    miniPlayerControllersWrapper.L2(lat0Var);
                }
                return s3q0.a;
            case 16:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                L.i((Throwable) obj);
                ((VideoView) obj2).getViewBinding().d.setImageBitmap(null);
                return s3q0.a;
            case 17:
                ((xiu0) obj2).f = (wjc) obj;
                return s3q0.a;
            case 18:
                j3v0.b bVar = new j3v0.b((qow) obj2);
                dhr0.f(bVar);
                return new j3v0.c(bVar);
            case 19:
                ((VmojiRecommendationsFragment.b) obj2).invoke(naw0.a.b);
                return s3q0.a;
            case 20:
                ((m99) obj2).b(c99.l0.a);
                return s3q0.a;
            case 21:
                bgw0 bgw0Var = (bgw0) obj2;
                ?? r0 = bgw0Var.g;
                ?? r6 = bgw0Var.f;
                VoipCallByLinkViewState.ContentDialog contentDialog = (VoipCallByLinkViewState.ContentDialog) obj;
                int i4 = VoipCallByLinkFragment.T;
                if (contentDialog.equals(VoipCallByLinkViewState.ContentDialog.b.a)) {
                    dw20 dw20Var = bgw0Var.h;
                    if (dw20Var != null) {
                        dw20Var.hide();
                    }
                    bgw0Var.h = null;
                    bgw0Var.a().setLayoutManager(null);
                    bgw0Var.a().setAdapter(null);
                    ((vfw0) r6.getValue()).setItems(EmptyList.b);
                } else if (contentDialog.equals(VoipCallByLinkViewState.ContentDialog.a.a)) {
                    dw20 dw20Var2 = bgw0Var.h;
                    if (dw20Var2 != null) {
                        dw20Var2.hide();
                    }
                    bgw0Var.h = null;
                } else if (contentDialog.equals(VoipCallByLinkViewState.ContentDialog.c.a)) {
                    bgw0Var.c();
                    if (bgw0Var.b().getDisplayedChild() != 0) {
                        bgw0Var.b().setDisplayedChild(0);
                    }
                } else {
                    if (!(contentDialog instanceof VoipCallByLinkViewState.ContentDialog.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VoipCallByLinkViewState.ContentDialog.d dVar = (VoipCallByLinkViewState.ContentDialog.d) contentDialog;
                    bgw0Var.c();
                    Context context = bgw0Var.a;
                    if (bgw0Var.b().getDisplayedChild() != 1) {
                        bgw0Var.b().setDisplayedChild(1);
                    }
                    if (bgw0Var.a().getLayoutManager() == null || bgw0Var.a().getAdapter() == null) {
                        bgw0Var.a().setLayoutManager(new LinearLayoutManager());
                        bgw0Var.a().setAdapter((vfw0) r6.getValue());
                    }
                    ((vfw0) r6.getValue()).setItems(dVar.a);
                    TextView textView = (TextView) r0.getValue();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ylw ylwVar = new ylw(R.drawable.vk_icon_phone_24);
                    ylwVar.e = -1.0f;
                    ylwVar.d = true;
                    ylwVar.f = cn70.b(2);
                    ylwVar.c = 3;
                    spannableStringBuilder.append((CharSequence) ylwVar.b(context));
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) context.getString(R.string.voip_call_by_link_start_call));
                    SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
                    textView.setText(new SpannableString(spannableStringBuilder));
                    bwt0.i0((TextView) r0.getValue(), new xau0(bgw0Var, 4));
                }
                return s3q0.a;
            case 22:
                ((mjw0) obj2).K0.run();
                return s3q0.a;
            default:
                Post post = (Post) obj2;
                Post R = di60.R((NewsEntry) obj);
                return R == null ? post : R;
        }
    }

    public /* synthetic */ qjl0(exi0 exi0Var, com.vk.video.ui.discovery.minimizable.related_videos.d dVar) {
        this.b = 12;
        this.c = exi0Var;
    }
}
