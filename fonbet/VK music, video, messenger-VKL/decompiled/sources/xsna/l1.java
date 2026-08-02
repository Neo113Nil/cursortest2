package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.registry.api.di.CatalogRegistryComponent;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.search.ChannelMsgSearchFragment;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridPaginatedView;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleScopedComponent;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponentImpl;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinContainer;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinScrollView;
import xsna.lzd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        a1w a1wVar;
        boolean z;
        FragmentManager supportFragmentManager;
        r2 = null;
        a1w a1wVar2 = null;
        switch (this.b) {
            case 0:
                AboutAppFragment aboutAppFragment = (AboutAppFragment) this.c;
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                return (ApiApplication) aboutAppFragment.requireArguments().getParcelable("APP_ITEM");
            case 1:
                AbstractClipsGridListFragment abstractClipsGridListFragment = (AbstractClipsGridListFragment) this.c;
                ClipsGridPaginatedView clipsGridPaginatedView = abstractClipsGridListFragment.X;
                if (clipsGridPaginatedView == null) {
                    clipsGridPaginatedView = null;
                }
                RecyclerView.o layoutManager = clipsGridPaginatedView.getRecyclerView().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    hee heeVar = abstractClipsGridListFragment.Z;
                    (heeVar != null ? heeVar : null).l(linearLayoutManager);
                }
                return s3q0.a;
            case 2:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) this.c;
                int i = AlbumDetailsFragment.p0;
                return (PhotoAlbum) albumDetailsFragment.requireArguments().getParcelable("album");
            case 3:
                ml2 ml2Var = (ml2) this.c;
                ml2Var.l = true;
                ml2Var.g(false);
                return s3q0.a;
            case 4:
                st2 st2Var = (st2) this.c;
                AnonymCallJoinContainer anonymCallJoinContainer = st2Var.e;
                if (anonymCallJoinContainer != null) {
                    anonymCallJoinContainer.setLogoCollapsed(false);
                }
                AnonymCallJoinScrollView anonymCallJoinScrollView = st2Var.g;
                if (anonymCallJoinScrollView != null) {
                    anonymCallJoinScrollView.postDelayed(st2Var.y, 300L);
                }
                return s3q0.a;
            case 5:
                AppChannelFragment appChannelFragment = (AppChannelFragment) this.c;
                int i2 = AppChannelFragment.l1;
                return ((StoriesComponent) m7m.d(appChannelFragment).a(fpf0.a(StoriesComponent.class))).V5();
            case 6:
                ArchiveFragment archiveFragment = (ArchiveFragment) this.c;
                int i3 = ArchiveFragment.e0;
                return Boolean.valueOf(archiveFragment.requireArguments().getBoolean("FROM_PHOTO_FLOW", false));
            case 7:
                return new wk3((Object[]) this.c);
            case 8:
                AttachmentMappersComponentImpl attachmentMappersComponentImpl = (AttachmentMappersComponentImpl) this.c;
                nwy nwyVar = attachmentMappersComponentImpl.e;
                qcy<Object> qcyVar = AttachmentMappersComponentImpl.g[2];
                return new pax0((it4) nwyVar.c(), attachmentMappersComponentImpl.g4());
            case 9:
                j96 j96Var = (j96) this.c;
                ke90 ke90Var = j96Var.e;
                z9l0.a((u76) ke90Var.invoke());
                if (((psj0) j96Var.i.getValue()).d(WebStickerType.MARKET_ITEM)) {
                    return new z5m0((Activity) j96Var.c.invoke(), j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke(), (u76) ke90Var.invoke(), ((ProductsMultipickerComponent) ((k7m) m7m.c((View) j96Var.g.invoke())).a(fpf0.a(ProductsMultipickerComponent.class))).a());
                }
                return null;
            case 10:
                int a = ((x17) this.c).a();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (a > 0) {
                    f = swe0.f(((Number) ((zak0) r0.e).getValue()).intValue() / r0.a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                }
                return Float.valueOf(f);
            case 11:
                return ((u59) this.c).b.f();
            case 12:
                CatalogRootViewHolder catalogRootViewHolder = (CatalogRootViewHolder) this.c;
                return ((CatalogRegistryComponent) ((k7m) m7m.f(catalogRootViewHolder)).b(fpf0.a(CatalogRegistryComponent.class), new vca(catalogRootViewHolder.m.b.a))).ga();
            case 13:
                return ((VideoMinimizablePlayerComponent) ((k7m) m7m.f((zga) ((aha) this.c).i.getValue())).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3();
            case 14:
                ((com.vk.im.channelcreation.impl.h) this.c).O(g.k.b);
                return s3q0.a;
            case 15:
                ChannelMsgSearchFragment channelMsgSearchFragment = (ChannelMsgSearchFragment) this.c;
                int i4 = ChannelMsgSearchFragment.Q;
                String string = channelMsgSearchFragment.requireArguments().getString("text");
                return string == null ? "" : string;
            case 16:
                ChannelsListFragment channelsListFragment = (ChannelsListFragment) this.c;
                int i5 = ChannelsListFragment.f0;
                Bundle arguments = channelsListFragment.getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("without_toolbar") : false);
            case 17:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                Peer no = chatFragment.no();
                if (!BuildInfo.s() || !no.Ab(Peer.Type.GROUP) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) {
                    a1wVar2 = a1wVar;
                }
                Peer no2 = chatFragment.no();
                no2.getClass();
                if (no2.Ab(Peer.Type.GROUP)) {
                    l7m d = m7m.d(chatFragment);
                    ((ImEngineLifecycleScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), no2, d).a(fpf0.a(ImEngineLifecycleScopedComponent.class))).N().e(chatFragment.ko().c().g(no2), EngineInvalidateSource.UPDATE_COMMUNITY);
                }
                return a1wVar2;
            case 18:
                View view = ((ttb) this.c).o;
                return new bzb0((view != null ? view : null).getContext());
            case 19:
                io.reactivex.rxjava3.disposables.c cVar = ((cxb) this.c).x.k;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 20:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i6 = ClipFeedListFragment.a2;
                return clipFeedListFragment.no().x();
            case 21:
                h0d h0dVar = (h0d) this.c;
                return new o0d(h0dVar.a, h0dVar.b);
            case 22:
                return (nwa0) ((mtk0) this.c).getValue();
            case 23:
                Context context = ((ebd) this.c).h;
                while (true) {
                    z = context instanceof AppCompatActivity;
                    if (!z && (context instanceof ContextWrapper)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                AppCompatActivity appCompatActivity = (AppCompatActivity) (z ? (Activity) context : null);
                if (appCompatActivity != null && (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.f("picker_bs_result_req_key");
                }
                return s3q0.a;
            case 24:
                return ((ClipsViewerComponent) ((k7m) m7m.f((cfd) this.c)).a(fpf0.a(ClipsViewerComponent.class))).Xb();
            case 25:
                return ((ClipsViewerComponent) ((ekd) this.c).g.getValue()).p5();
            case 26:
                ClipsEditorFragment clipsEditorFragment = (ClipsEditorFragment) this.c;
                Integer num = ClipsEditorFragment.W;
                return ((CameraClipsComponent) m7m.d(clipsEditorFragment).a(fpf0.a(CameraClipsComponent.class))).p9();
            case 27:
                ((lzd.a) this.c).c = null;
                return s3q0.a;
            case 28:
                ClipsEntryPointsComponentImpl clipsEntryPointsComponentImpl = (ClipsEntryPointsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = ClipsEntryPointsComponentImpl.f;
                return new q1e(new bpn0(new ld(clipsEntryPointsComponentImpl, 23)));
            default:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) this.c;
                return new sbe(bVar, new obe(1, bVar.getFeature(), com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        }
    }
}
