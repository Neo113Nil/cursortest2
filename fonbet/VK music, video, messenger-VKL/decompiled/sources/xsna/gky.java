package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.goh0;
import xsna.qr60;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gky implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ gky(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId userId;
        switch (this.b) {
            case 0:
                return i5s.a(new StringBuilder("\""), ((zk10) obj).b().get(1), "\":\"<HIDE>\"");
            case 1:
                return EmptyList.b;
            case 2:
                return Boolean.valueOf(((View) obj) instanceof VideoFullscreenBottomBarView);
            case 3:
                return io.reactivex.rxjava3.core.q.T(Integer.valueOf(((VideoGetCommentsExtendedResponseDto) obj).getCount()));
            case 4:
                qs00 qs00Var = new qs00(R.layout.market_all_reviews_items_for_review_shimmer_view_holder, (ViewGroup) obj);
                ((ShimmerFrameLayout) qs00Var.itemView.findViewById(R.id.market_all_reviews_shimmer_view)).b(((Shimmer.a) ((Shimmer.a) ((Shimmer.a) new Shimmer.a().c(true).h()).i()).d()).g(0.08f).a());
                return qs00Var;
            case 5:
                return af10.a((TagsGetListResponseDto) obj);
            case 6:
                VkGroupHeader vkGroupHeader = new VkGroupHeader((Context) obj, null, 6);
                vkGroupHeader.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                VkOnboardingHighlighter vkOnboardingHighlighter = new VkOnboardingHighlighter(vkGroupHeader.getContext(), null, 6);
                vkOnboardingHighlighter.setAutoHighlight(false);
                vkGroupHeader.setHighlighter(vkOnboardingHighlighter);
                return vkGroupHeader;
            case 7:
                return new HashSet();
            case 8:
                return Integer.valueOf(((MsgSyncState) obj).j());
            case 9:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 10:
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockMusicTrack) {
                    UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
                    return new UIBlockMusicTrack(uIBlockMusicTrack, uIBlockMusicTrack.z, CatalogMusicTrackLocalState.zb(uIBlockMusicTrack.C, true, false, 6), null, 8, null);
                }
                if (!(uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack)) {
                    return uIBlock;
                }
                UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock;
                return new UIBlockSearchHistory.UIBlockSearchHistoryTrack(uIBlockSearchHistoryTrack, uIBlockSearchHistoryTrack.A, CatalogMusicTrackLocalState.zb(uIBlockSearchHistoryTrack.C, true, false, 6));
            case 11:
                j170 j170Var = (j170) obj;
                return new kv60(new qr60.a.f(j170Var.a, j170Var.b, j170Var.d));
            case 12:
                return Boolean.valueOf(((nov) obj) instanceof unm0);
            case 13:
                return Integer.valueOf(((List) obj).size());
            case 14:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, true, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67108351);
            case 15:
                qgi0.r((tgi0) obj, "mvi_catalog_header_action_btn_test_tag");
                return s3q0.a;
            case 16:
                int i = PodcastEpisodeFragment.u0;
                qgi0.r((tgi0) obj, "toolbar_title");
                return s3q0.a;
            case 17:
                View view = new View((Context) obj);
                view.setId(R.id.play_pause);
                return view;
            case 18:
                return Boolean.valueOf(((u1c0) obj).c == 302);
            case 19:
                Publisher publisher = ((PostingState.Editing) obj).c.e;
                return (publisher == null || (userId = publisher.b) == null) ? UserId.d : userId;
            case 20:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 21:
                qyg0 V0 = ((hyg0) obj).V0("SELECT COUNT(*) FROM promoted_stickers");
                try {
                    int i2 = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i2);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 22:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 23:
                return ((goh0.a) obj).b.a.e;
            case 24:
                qgi0.r((tgi0) obj, "storefront_service_price");
                return s3q0.a;
            case 25:
                u7j0 u7j0Var = (u7j0) obj;
                List<n9j0> list = u7j0Var.d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (n9j0 n9j0Var : list) {
                    arrayList.add(new r9j0(n9j0Var.a, n9j0Var.b));
                }
                return new u9j0(j5g.O0(arrayList), new i9j0(u7j0Var.e, u7j0Var.f));
            case 26:
                id3 id3Var = (id3) obj;
                hd3.a(id3Var, btm0.b);
                hd3.b(id3Var, "✅");
                return s3q0.a;
            case 27:
                int i3 = kwg0.a;
                return s3q0.a;
            case 28:
                List list2 = (List) obj;
                return new y6p0(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue());
            default:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.a);
        }
    }
}
