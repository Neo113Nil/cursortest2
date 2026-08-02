package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Size;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.SearchState;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.holders.podcast.PodcastOfflineVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.impl.data.db.PostingDatabase_Impl;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.reefton.Reef;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.ui.impl.catalog.GlobalSearchVideosCatalogFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stickers.keyboard.StickersView;
import com.vkontakte.android.R;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xsna.hpb0;
import xsna.lr50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kr50 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kr50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v6, types: [xsna.qi6] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                lr50 lr50Var = (lr50) obj;
                cjx cjxVar = lr50Var.J;
                return new lr50.a(cjxVar != null ? cjxVar : null, lr50Var.D);
            case 1:
                return ((PostingComponent) ((k7m) m7m.f((p860) obj)).mo408a(fpf0.a(PostingComponent.class))).H6().g();
            case 2:
                for (?? r1 : (List) obj) {
                    gv9 gv9Var = r1 instanceof gv9 ? (gv9) r1 : null;
                    if (gv9Var != null) {
                        gv9Var.p0();
                    }
                }
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return ((NewsfeedFragment) obj).On();
            case 4:
                xz70 xz70Var = (xz70) obj;
                GlobalSearchVideosCatalogFragment globalSearchVideosCatalogFragment = (GlobalSearchVideosCatalogFragment) xz70Var.a;
                ?? r12 = ((DiscoverSearchFragment) xz70Var.i.b).l0 != null;
                CatalogRootViewHolder catalogRootViewHolder = globalSearchVideosCatalogFragment.P;
                GlobalSearchVideoRootVh globalSearchVideoRootVh = catalogRootViewHolder instanceof GlobalSearchVideoRootVh ? (GlobalSearchVideoRootVh) catalogRootViewHolder : null;
                if (globalSearchVideoRootVh != null) {
                    pzh0 pzh0Var = globalSearchVideoRootVh.A;
                    ?? r4 = pzh0Var.b;
                    String j9 = r4.j9();
                    if (j9 == null) {
                        j9 = "";
                    }
                    String str = j9;
                    SearchState searchState = SearchState.Suggestion;
                    boolean d = pzh0Var.d(searchState);
                    String dc = pzh0Var.c().c.dc();
                    ?? r13 = r12 == true && !drm0.N(str);
                    ?? r6 = d && epx.f(dc, str);
                    if (r13 != false || (!drm0.N(str) && r6 == false)) {
                        searchState = SearchState.Search;
                    }
                    if (pzh0Var.d(searchState)) {
                        String j92 = r4.j9();
                        r4.ca(pzh0Var.d(SearchState.Search) && !(j92 == null || drm0.N(j92)) == true);
                    } else {
                        pzh0Var.e(searchState);
                    }
                    SearchResultsVh.cb(pzh0Var.c(), str, null, null, pzh0Var.d.j && epx.f(pzh0Var.c().b.dc(), str) && searchState == SearchState.Search, null, false, 54);
                }
                return s3q0.a;
            case 5:
                OnMediaAudioComponentProvider onMediaAudioComponentProvider = (OnMediaAudioComponentProvider) obj;
                return new k780(onMediaAudioComponentProvider.f(), onMediaAudioComponentProvider.g(), onMediaAudioComponentProvider.a());
            case 6:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 7:
                return ((PostingComponent) ((k7m) m7m.f((vp80) obj)).mo408a(fpf0.a(PostingComponent.class))).H6().f();
            case 8:
                com.vk.auth.passport.b bVar = (com.vk.auth.passport.b) obj;
                return new a3i0(bVar.a, bVar.c);
            case 9:
                lv90 lv90Var = (lv90) obj;
                lv90Var.j1.invoke(((zak0) lv90Var.l1).getValue());
                lv90Var.dismiss();
                return s3q0.a;
            case 10:
                jjc.a(new gd40((PodcastOfflineVh) obj, 9));
                return s3q0.a;
            case 11:
                hpb0.a j = ((hpb0) obj).j();
                if (j == null || (j.a.isEmpty() && j.b.isEmpty() && j.c.isEmpty())) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 12:
                return (NewsFeedBridgeComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(NewsFeedBridgeComponent.class));
            case 13:
                return new pec0((PostingDatabase_Impl) obj);
            case 14:
                return (lyk) ((PostingFragment) obj).u0.getValue();
            case 15:
                qcy<Object>[] qcyVarArr2 = PostsFromNotificationsFragment.p0;
                return ((PostsFromNotificationsFragment) obj).getActivity();
            case 16:
                return ((MarketComponent) ((rkd0) obj).e.getValue()).I8();
            case 17:
                com.vk.ecomm.product_list.presentation.a aVar = (com.vk.ecomm.product_list.presentation.a) obj;
                return ((MarketComponent) m7m.d(aVar).a(fpf0.a(MarketComponent.class))).lc().b(aVar);
            case 18:
                okhttp3.p pVar = (okhttp3.p) obj;
                return "HOST REDIRECT: " + pVar + " -> " + pVar.b + " | " + pVar.a + " | headers: " + pVar.c;
            case 19:
                com.vk.lists.c cVar = ((QuestionsListFragment) obj).U;
                if (cVar != null) {
                    cVar.p(false);
                }
                return s3q0.a;
            case 20:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 21:
                ((NewsFeedComponent) ((k7m) m7m.f((z2f0) obj)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 22:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.REGISTRATION_PASSWORD, (ArrayList) obj, null, null, 28);
                return s3q0.a;
            case 23:
                szg0 szg0Var = (szg0) obj;
                Method method = ((ClassLoader) szg0Var.c.b).loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(szg0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent")));
            case 24:
                Size size = ((r5h0) obj).a;
                return Float.valueOf((size == null || !k9q0.q(size)) ? 1.0f : size.getWidth() / size.getHeight());
            case 25:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_redesign_create_chat_button);
            case 26:
                VmojiAvatarModel vmojiAvatarModel = (VmojiAvatarModel) obj;
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                StickersDatabase.a.b().K().a(Collections.singletonList(new z5w0(vmojiAvatarModel.b, vmojiAvatarModel.c, vmojiAvatarModel.d, vmojiAvatarModel.e, vmojiAvatarModel.f, vmojiAvatarModel.g)));
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((StickersView) obj).D.a());
            case 28:
                Reef reef = ((hwl0) ((nwl0) obj).b.c).a;
                if (reef == null) {
                    tv4.b("Reef is expected to be set at this point", com.vk.metrics.eventtracking.b.a);
                }
                if (reef != null) {
                    return new knf0(reef);
                }
                return null;
            default:
                l7s l7sVar = (l7s) obj;
                Drawable a = m33.a(R.drawable.story_template_placeholder, bwt0.u(l7sVar));
                LayerDrawable layerDrawable = (LayerDrawable) (a != null ? a.mutate() : null);
                layerDrawable.findDrawableByLayerId(R.id.layer_icon).setTint(bwt0.u(l7sVar).getColor(R.color.vk_white_alpha12));
                return layerDrawable;
        }
    }

    public /* synthetic */ kr50(m9l0 m9l0Var, VmojiAvatarModel vmojiAvatarModel) {
        this.b = 26;
        this.c = vmojiAvatarModel;
    }
}
