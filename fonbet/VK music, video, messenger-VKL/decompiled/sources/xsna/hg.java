package xsna;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.a;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDelayedPublishListFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.medianative.MediaNative;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.player.analytics.impl.tracker.di.AbstractPlayerAnalyticsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.m6e;
import xsna.wzd;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.recyclerview.widget.o0, xsna.e4o0] */
    @Override // xsna.gzs
    public final Object invoke() {
        ArticleAuthorPageSortType articleAuthorPageSortType;
        int i = 0;
        switch (this.b) {
            case 0:
                OfflineAudioComponent offlineAudioComponent = (OfflineAudioComponent) this.c;
                qcy<Object>[] qcyVarArr = AbstractPlayerAnalyticsComponent.g;
                return new ev40(offlineAudioComponent.U8());
            case 1:
                return (ViewGroup) ((com.vk.libvideo.design.view.actionlink.a) this.c).findViewById(R.id.vkl_action_link_product_short);
            case 2:
                Context context = ((mg0) this.c).a;
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                return (valueOf != null && valueOf.intValue() == dhr0.u().c) ? context : new l7s(context, dhr0.u().c);
            case 3:
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.photos.root.albumdetails.presentation.c) this.c)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 4:
                gn3 gn3Var = ((ArticleAuthorPageFragment) this.c).a0;
                return (gn3Var == null || (articleAuthorPageSortType = gn3Var.f) == null) ? ArticleAuthorPageSortType.VIEWS : articleAuthorPageSortType;
            case 5:
                return ((VideoRestrictedUserActionsComponent) ((k7m) m7m.f(((com.vk.libvideo.autoplay.b) this.c).d)).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 6:
                BaseCommentsFragment baseCommentsFragment = (BaseCommentsFragment) this.c;
                int i2 = BaseCommentsFragment.l0;
                Bundle arguments = baseCommentsFragment.getArguments();
                if (arguments == null) {
                    return null;
                }
                int i3 = arguments.getInt("forced_theme");
                Integer valueOf2 = Integer.valueOf(i3);
                if (i3 > 0) {
                    return valueOf2;
                }
                return null;
            case 7:
                return "UPLOAD_TRACE getOriginalVideoFileInfoFromAttach: localFileUri is empty for attach " + ((qr6) this.c).c;
            case 8:
                return ((StoryEditorComponent) ((k7m) m7m.c((u48) this.c)).a(fpf0.a(StoryEditorComponent.class))).ff();
            case 9:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                float f = CameraUIView.w1;
                zd9 camera1View = cameraUIView.getCamera1View();
                if (camera1View != null) {
                    mk9 mk9Var = ((mo9) camera1View.getCameraPreview()).g;
                    mk9Var.getClass();
                    if (MediaNative.isGLEffectsLibSupported()) {
                        mk9Var.C = true;
                    } else {
                        L.l("CameraRenderBase", "Failed to create okEffects, dynamic library is not ready");
                    }
                }
                return s3q0.a;
            case 10:
                RecyclerPaginatedView l = ((CatalogBasePaginatedListVh) this.c).l();
                if (l != null) {
                    return l.getContext();
                }
                return null;
            case 11:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i4 = ChannelFragment.a1;
                return new v1o(channelFragment.requireContext(), ((DonutPriceComponent) m7m.d(channelFragment).a(fpf0.a(DonutPriceComponent.class))).kf());
            case 12:
                return i5s.a(new StringBuilder(), ((wgb) this.c).s, ": loadNextInternal: illegal loader state");
            case 13:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                chatFragment.vo();
                return s3q0.a;
            case 14:
                return ChatProfileActionsView.P4((ChatProfileActionsView) this.c);
            case 15:
                return ((MarketOrdersComponent) ((r4c) this.c).a.a(fpf0.a(MarketOrdersComponent.class))).S4();
            case 16:
                List<ClickableSticker> list = ((ClickableStickers) this.c).d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((ClickableSticker) it.next()) instanceof ClickableQuestion) {
                            return Boolean.valueOf(r1);
                        }
                    }
                }
                r1 = false;
                return Boolean.valueOf(r1);
            case 17:
                isc iscVar = (isc) this.c;
                qcy<Object>[] qcyVarArr2 = isc.t1;
                return new zrc((Application) iscVar.requireContext().getApplicationContext(), iscVar.eo().j());
            case 18:
                SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) ((ClipFeedListFragment) this.c).m0.getValue();
                if (searchStatsLoggingInfo != null) {
                    return new uyc(searchStatsLoggingInfo);
                }
                return null;
            case 19:
                ClipFeedSideControlsView clipFeedSideControlsView = (ClipFeedSideControlsView) this.c;
                m7e m7eVar = ClipFeedSideControlsView.r;
                nwy nwyVar = ((ClipsViewerComponentImpl) ((k7m) m7m.c(clipFeedSideControlsView)).a(fpf0.a(ClipsViewerComponent.class))).X;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[36];
                return (q2e) nwyVar.c();
            case 20:
                j0e j0eVar = (j0e) this.c;
                rzd rzdVar = j0eVar.c;
                com.vk.clips.editor.state.model.a b = rzdVar.b();
                if (b != null) {
                    rzdVar.c(b, Collections.singletonList(new wzd.c(0)));
                }
                k0e k0eVar = j0eVar.d;
                (k0eVar != null ? k0eVar : null).a();
                return s3q0.a;
            case 21:
                m6e.a aVar = (m6e.a) this.c;
                ClipFeedListFragment clipFeedListFragment = ClipFeedListFragment.this;
                int i5 = ClipFeedListFragment.a2;
                iwc vo = clipFeedListFragment.vo();
                r1 = vo != null && vo.d(clipFeedListFragment);
                n0f<Item> n0fVar = aVar.i;
                com.vk.movika.sdk.base.logic.processor.actions.g gVar = n0fVar.b;
                n0fVar.l(((m6e.a) gVar.c).a);
                if (!n0fVar.g && r1) {
                    n0fVar.m(((m6e.a) gVar.c).a);
                }
                p2f p2fVar = aVar.g;
                if (p2fVar.a.getScrollState() == 0) {
                    z3o0 z3o0Var = p2fVar.d;
                    View findSnapView = z3o0Var.a.b().findSnapView(z3o0Var.c);
                    z3o0Var.d = findSnapView == null ? 0 : z3o0Var.b.getChildLayoutPosition(findSnapView);
                }
                i1e i1eVar = p2fVar.b;
                i1eVar.f(false);
                i1eVar.e();
                gxc gxcVar = aVar.c;
                if (gxcVar != null) {
                    ClipFeedListFragment clipFeedListFragment2 = gxcVar.a;
                    q8e q8eVar = gxcVar.b;
                    boolean z = gxcVar.c;
                    if (clipFeedListFragment2.vo() != null) {
                        ((xe90) clipFeedListFragment2.U0.getValue()).l(q8eVar);
                        if (z) {
                            ((rie) clipFeedListFragment2.a0.getValue()).l(q8eVar);
                        }
                    }
                }
                return s3q0.a;
            case 22:
                a.C0712a c0712a = (a.C0712a) this.c;
                ClipsGridDelayedPublishListFragment.a aVar2 = new ClipsGridDelayedPublishListFragment.a(ClipsGridDelayedPublishListFragment.class, null, null);
                aVar2.j.putBoolean("ClipsGridListFragment.force_dark_theme", c0712a.a);
                return aVar2.f();
            case 23:
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) this.c;
                Object obj = ClipsOwnerSwipeFragment.k0;
                return ((ClipsConfigViewersComponent) m7m.d(clipsOwnerSwipeFragment).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 24:
                xvy xvyVar = (xvy) this.c;
                if (!xvyVar.c() && !xvyVar.e()) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 25:
                ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) this.c;
                int i6 = ClipsVideoAttachmentPickerFragment.W;
                a.e eVar = a.e.b;
                clipsVideoAttachmentPickerFragment.getClass();
                xn50.a.c(clipsVideoAttachmentPickerFragment, eVar);
                return s3q0.a;
            case 26:
                ArrayList arrayList = (ArrayList) this.c;
                StringBuilder sb = new StringBuilder("cluster: clusters.size=");
                sb.append(arrayList.size());
                sb.append(", all points count is ");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i += ((akt) it2.next()).c.size();
                }
                sb.append(i);
                return sb.toString();
            case 27:
                return new n0g((com.vk.attachpicker.screen.f) this.c);
            case 28:
                ((fuv0) this.c).show();
                return s3q0.a;
            default:
                return (VkMiniInfoCell) ((arg) this.c).a.findViewById(R.id.community_address_metro_mini_info_cell);
        }
    }
}
