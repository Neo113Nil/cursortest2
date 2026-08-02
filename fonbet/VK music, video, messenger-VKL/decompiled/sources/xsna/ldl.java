package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.widget.ViewAnimator;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vk.friends.recommendations.impl.presentation.SearchFriendsItem;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.home.HomeFragment2;
import com.vk.imageloader.view.VKImageView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.fragment.impl.MusicAddTrackToPlaylistLauncherImpl;
import com.vk.music.fragment.impl.MusicAddTrackToPlaylistLauncherImpl.b;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vk.photo.editor.gl.GlShaderId;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.CatalogFeatures;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.f0p;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ldl implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ldl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        InputStream openRawResource;
        List<izs<gzs<s3q0>, s3q0>> putIfAbsent;
        com.vk.lists.c cVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Resources resources = (Resources) ((cfl) obj).invoke();
                if (resources == null || (openRawResource = resources.openRawResource(R.raw.d_tap_like_red)) == null) {
                    str = "";
                } else {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, emb.b), 8192);
                    try {
                        str = a0a.b(bufferedReader);
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ro.e(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                String str2 = str;
                Pair c = yse0.c(str2);
                return new x6o(cn70.b(((Number) c.i()).intValue()), "dTap_Like_Red", str2, cn70.b(((Number) c.j()).intValue()), false);
            case 1:
                Context context = ((asm) obj).a;
                return Boolean.FALSE;
            case 2:
                return ((DiscoverMediaTabFragment2) obj).s0;
            case 3:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) obj;
                ViewPager2 viewPager2 = discoverSearchFragment.g0;
                if (viewPager2 != null) {
                    discoverSearchFragment.ko(viewPager2.getCurrentItem());
                }
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                return new AtomicReference(((w6n) ((DiscoverSimilarFeedFragment) obj).N.getValue()).e);
            case 5:
                int i2 = DisplayAudioBookChaptersFragment.b0;
                return ((MusicKidsModeComponent) m7m.d((DisplayAudioBookChaptersFragment) obj).a(fpf0.a(MusicKidsModeComponent.class))).n();
            case 6:
                p0u p0uVar = (p0u) ((bgn) obj).a;
                String value = p0uVar.a(GlShaderId.Vertext).getValue();
                int glCreateShader = GLES20.glCreateShader(35633);
                GLES20.glShaderSource(glCreateShader, value);
                GLES20.glCompileShader(glCreateShader);
                String value2 = p0uVar.a(GlShaderId.Main).getValue();
                int glCreateShader2 = GLES20.glCreateShader(35632);
                GLES20.glShaderSource(glCreateShader2, value2);
                GLES20.glCompileShader(glCreateShader2);
                return new ksj0(glCreateShader, glCreateShader2);
            case 7:
                f0p f0pVar = (f0p) obj;
                i0p i0pVar = f0pVar.B;
                f0p.d dVar = f0pVar.L;
                if (f0p.d.a(dVar.g).isEmpty() || f0p.d.a(dVar.g).length() >= dVar.p) {
                    return s3q0.a;
                }
                i0pVar.m(f0p.d.a(dVar.g));
                i0pVar.setDescription(f0p.d.a(dVar.h));
                i0pVar.w();
                ViewAnimator viewAnimator = f0pVar.J;
                viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(f0pVar.K));
                return s3q0.a;
            case 8:
                String str3 = (String) obj;
                l3p.b.put(str3, Boolean.FALSE);
                ConcurrentHashMap<String, List<izs<gzs<s3q0>, s3q0>>> concurrentHashMap = l3p.a;
                List<izs<gzs<s3q0>, s3q0>> list = concurrentHashMap.get(str3);
                if (list == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str3, (list = new ArrayList<>()))) != null) {
                    list = putIfAbsent;
                }
                izs izsVar = (izs) g5g.H(list);
                if (izsVar != null) {
                    l3p.a(str3, izsVar);
                }
                return s3q0.a;
            case 9:
                int i3 = EntriesListFragment.m0;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = ((EntriesListFragment) obj).mo2getContext();
                aVar.s = sf2Var.a();
                return aVar.a();
            case 10:
                gzs<s3q0> gzsVar = ((txq) obj).g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 11:
                int i4 = FeedReactionsStack.r;
                return new o93((FeedReactionsStack) obj, 16);
            case 12:
                dw20 dw20Var = ((udr) obj).a;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return Boolean.TRUE;
            case 13:
                return (VKImageView) ((wls) obj).itemView.findViewById(R.id.trailing_image_view);
            case 14:
                FriendsRecommendationsFragment friendsRecommendationsFragment = (FriendsRecommendationsFragment) obj;
                if (epx.f(friendsRecommendationsFragment.V, "authors_rec")) {
                    Item.Type type = Item.Type.SEARCH_LIST;
                    int i5 = hrv.p;
                    return Collections.singletonList(new Item(type, 0, null, Collections.singletonList(new SearchFriendsItem(SearchFriendsItem.Type.ICON_TEXT, 0, R.drawable.vk_icon_search_outline_28, R.string.friends_recommendations_find_by_name)), 6));
                }
                if (!friendsRecommendationsFragment.W) {
                    CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
                    catalogFeatures.getClass();
                    if (!com.vk.toggle.b.A.a(catalogFeatures)) {
                        SearchFriendsItem searchFriendsItem = new SearchFriendsItem(SearchFriendsItem.Type.SPACE, 0, 0, 0);
                        int i6 = hrv.p;
                        SearchFriendsItem.Type type2 = SearchFriendsItem.Type.ICON_TEXT;
                        return e43.l(new Item(Item.Type.SEARCH_LIST, 0, null, e43.l(searchFriendsItem, new SearchFriendsItem(type2, 0, R.drawable.vk_icon_search_outline_28, R.string.friends_recommendations_find_by_name), new SearchFriendsItem(type2, 2, R.drawable.vk_icon_scan_viewfinder_outline_28, R.string.friends_recommendations_find_by_qr_code)), 6), new Item(Item.Type.IMPORTS, 0, null, null, 14));
                    }
                }
                return EmptyList.b;
            case 15:
                ((evs) obj).T(false);
                return s3q0.a;
            case 16:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj;
                if (galleryFragmentImpl.v0 != null && (cVar = galleryFragmentImpl.f0) != null) {
                    cVar.p(false);
                }
                return s3q0.a;
            case 17:
                int i7 = GamesCatalogFragment.i0;
                return ((VkClientMultiAccountComponent) m7m.d((GamesCatalogFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 18:
                return ((piu) obj).findViewById(R.id.close_icon);
            case 19:
                int i8 = HomeFragment2.x0;
                return ((NewsFeedComponent) m7m.d((HomeFragment2) obj).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 20:
                return ((StoriesComponent) ((k7m) m7m.f((zex) obj)).a(fpf0.a(StoriesComponent.class))).b();
            case 21:
                return (VkOnboardingStat$Delegate) ((tiy) obj).b.invoke(VkOnboardingStat$Type.Tooltip, "music:kids_section_superapp_tooltip");
            case 22:
                yfz yfzVar = (yfz) obj;
                BoundingBox boundingBox = yfzVar.a.d;
                boundingBox.getClass();
                float o = boundingBox.o();
                BoundingBox boundingBox2 = yfzVar.b.d;
                boundingBox2.getClass();
                return Float.valueOf(boundingBox2.o() + o);
            case 23:
                r500 r500Var = (r500) obj;
                return Long.valueOf(r500Var.b - r500Var.a);
            case 24:
                WriteBar writeBar = ((MarketItemCommentsFragment) obj).T;
                if (writeBar != null) {
                    return writeBar.getBottomSheetContainer();
                }
                return null;
            case 25:
                return (CallMemberId) ((it80) obj).a;
            case 26:
                ((zak0) ((az20) obj).n).setValue(Boolean.valueOf(!r3.i()));
                return s3q0.a;
            case 27:
                return ((MusicAddTrackToPlaylistLauncherImpl) obj).new b();
            case 28:
                com.vk.catalog2.feature.music.configuration.b bVar = (com.vk.catalog2.feature.music.configuration.b) obj;
                return ((Boolean) bVar.J.getValue()).booleanValue() ? new r9a(new bpn0(new l35(20)), (c1a) bVar.M.getValue()) : new r9a(new bpn0(new re0(25)), new ida[0]);
            default:
                return ((g850) obj).a.findViewById(R.id.nativeads_advertising_dot);
        }
    }
}
