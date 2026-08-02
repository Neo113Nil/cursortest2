package xsna;

import android.content.Context;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.internal.nps.api.di.ClipsInternalNpsComponent;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.documents.impl.TypedDocumentsListFragment;
import com.vk.documents.impl.TypedDocumentsListFragment.b;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.method.selector.api.MethodSelectorComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import ru.ok.media.OkmpStreamPublisher;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class jz70 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jz70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 fail$lambda$40;
        PhotoAlbum photoAlbum;
        ww50<?> Y;
        l7m d;
        VkOnboardingComponent vkOnboardingComponent;
        switch (this.b) {
            case 0:
                fail$lambda$40 = OkmpStreamPublisher.fail$lambda$40((OkmpStreamPublisher) this.c);
                return fail$lambda$40;
            case 1:
                return ((UserProfileComponent) ((k7m) m7m.f((x180) this.c)).mo408a(fpf0.a(UserProfileComponent.class))).mc();
            case 2:
                return "LivePlayerImpl.onTransferEnd() - state= " + wl80.this.G;
            case 3:
                return ((MethodSelectorComponent) m7m.d((vl90) this.c).mo408a(fpf0.a(MethodSelectorComponent.class))).a();
            case 4:
                PhotoAlbumFragment photoAlbumFragment = (PhotoAlbumFragment) this.c;
                int i = PhotoAlbumFragment.r0;
                VkTopBar vkTopBar = photoAlbumFragment.X;
                Rect n = zjq.n(vkTopBar.getRightMainRect());
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                vkTopBar.getContext();
                e.c cVar = new e.c(null, n, vkTopBar, l, 1);
                f5a0 f5a0Var = photoAlbumFragment.p0;
                if (f5a0Var != null && (photoAlbum = f5a0Var.g) != null) {
                    boolean d2 = xg5.a().d(photoAlbum.c);
                    if (d02.k(photoAlbum)) {
                        VkContextMenu.c.c(cVar, R.string.add_photo, null, false, null, new x850(photoAlbumFragment, 6), 30);
                    }
                    if (photoAlbum.b > 0 && d2) {
                        VkContextMenu.c.c(cVar, R.string.edit, null, false, null, new com.vk.voip.a(22, photoAlbum, photoAlbumFragment), 30);
                        if (photoAlbum.t) {
                            VkContextMenu.c.c(cVar, R.string.delete, null, false, null, new wf40(photoAlbumFragment, 8), 30);
                        }
                    }
                    if (photoAlbum.b > -9001) {
                        VkContextMenu.c.c(cVar, R.string.copy_link, null, false, null, new lo10(photoAlbumFragment, 12), 30);
                    }
                }
                cVar.j();
                return s3q0.a;
            case 5:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i2 = PhotoFlowFragment.m0;
                return photoFlowFragment.fo().Y5();
            case 6:
                y9a0 y9a0Var = (y9a0) this.c;
                return new h2r(y9a0Var.b, new uq50(y9a0Var, 11));
            case 7:
                return ((NewsFeedComponent) ((k7m) m7m.f((ffb0) this.c)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 8:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i3 = PostingFragment.L0;
                return ((NewsFeedComponent) ((k7m) m7m.f(postingFragment)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 9:
                return ((PostingComponent) ((k7m) m7m.f((ikc0) this.c)).mo408a(fpf0.a(PostingComponent.class))).C();
            case 10:
                enc0 enc0Var = (enc0) this.c;
                float f = enc0Var.S;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= 1.0f) {
                    f2 = f;
                }
                enc0Var.k(f2, f);
                return s3q0.a;
            case 11:
                g5d0 g5d0Var = (g5d0) this.c;
                qcy<Object>[] qcyVarArr = g5d0.k1;
                Context mo2getContext = g5d0Var.mo2getContext();
                ey50 ey50Var = mo2getContext instanceof ey50 ? (ey50) mo2getContext : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                    Y.S(g5d0Var);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 12:
                return ((MarketComponent) ((zqd0) this.c).b.getValue()).I8();
            case 13:
                com.vk.profile.core.tabs.ui.music.c cVar2 = (com.vk.profile.core.tabs.ui.music.c) this.c;
                j15 j15Var = (j15) cVar2.t;
                if (j15Var != null) {
                    cVar2.E.b(j15Var);
                }
                return s3q0.a;
            case 14:
                PublishFragmentInternalComponent publishFragmentInternalComponent = (PublishFragmentInternalComponent) this.c;
                Context context = publishFragmentInternalComponent.c.a;
                nwy nwyVar = publishFragmentInternalComponent.i;
                qcy<Object> qcyVar = PublishFragmentInternalComponent.w[0];
                return new vee0(context, (fks0) nwyVar.c());
            case 15:
                aqe0 aqe0Var = (aqe0) this.c;
                int i4 = aqe0.m1;
                return (ClipsInternalNpsComponentImpl) ((k7m) m7m.f(aqe0Var)).a(fpf0.a(ClipsInternalNpsComponent.class));
            case 16:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) this.c;
                return new uq60(reactionsFeedFragment, reactionsFeedFragment.W, reactionsFeedFragment.eo().a.Y, reactionsFeedFragment.eo().f);
            case 17:
                RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.c;
                Object tag = recyclerPaginatedView.getTag(R.id.vk_pending_decoration);
                RecyclerView.n nVar = tag instanceof RecyclerView.n ? (RecyclerView.n) tag : null;
                if (nVar != null) {
                    recyclerPaginatedView.setItemDecoration(nVar);
                    recyclerPaginatedView.setTag(R.id.vk_pending_decoration, null);
                }
                return s3q0.a;
            case 18:
                ((dzf0) this.c).a();
                return s3q0.a;
            case 19:
                ych0 ych0Var = (ych0) this.c;
                ych0Var.l.c(ych0Var.b.t);
                return s3q0.a;
            case 20:
                return ((SearchUiComponent) ((k7m) m7m.f((jth0) this.c)).a(fpf0.a(SearchUiComponent.class))).W(new irh0(false, false, 495));
            case 21:
                dw20 dw20Var = ((com.vk.newsfeed.impl.items.posting.item.modals.d) this.c).e;
                if (dw20Var == null || (d = m7m.d(dw20Var)) == null || (vkOnboardingComponent = (VkOnboardingComponent) d.a(fpf0.a(VkOnboardingComponent.class))) == null) {
                    return null;
                }
                return vkOnboardingComponent.p3();
            case 22:
                guj0 guj0Var = (guj0) this.c;
                guj0Var.a.c(guj0Var.b.getState(), null, true);
                huj0 huj0Var = guj0Var.c;
                (huj0Var != null ? huj0Var : null).d();
                return s3q0.a;
            case 23:
                lii0 lii0Var = (lii0) ((s6k0) this.c).a;
                if (lii0Var != null) {
                    lii0Var.e();
                }
                return s3q0.a;
            case 24:
                return StoryStatisticsStickersFragment.go((StoryStatisticsStickersFragment) this.c);
            case 25:
                yjm0 yjm0Var = (yjm0) this.c;
                o1l0 o1l0Var = yjm0Var.f;
                if (o1l0Var != null) {
                    ((kdl0) o1l0Var).a(yjm0Var);
                }
                return s3q0.a;
            case 26:
                ((com.vk.movika.sdk.base.flow.binding.l) this.c).invoke();
                return s3q0.a;
            case 27:
                ((oya) this.c).a();
                return s3q0.a;
            case 28:
                TypedDocumentsListFragment typedDocumentsListFragment = (TypedDocumentsListFragment) this.c;
                int i5 = TypedDocumentsListFragment.e0;
                return typedDocumentsListFragment.new b();
            default:
                return ((VkOnboardingComponent) ((k7m) m7m.f((mxq0) this.c)).a(fpf0.a(VkOnboardingComponent.class))).p3();
        }
    }
}
