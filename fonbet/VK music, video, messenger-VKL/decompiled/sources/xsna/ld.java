package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.accountmanager.di.VideoAccountHolderComponent;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh;
import com.vk.channelrestrictions.ChannelRestrictionsComponent;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridUploadListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenVkApp;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.lists.DefaultErrorView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.community.impl.ui.cover.redesign.delegate.BaseCommunityLiveCoverItemDelegate;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeOwnerButtonAppRenderItem;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import xsna.eyd.b;
import xsna.j9d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ld implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ld(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerView recyclerView;
        int paddingBottom;
        int i = this.b;
        int i2 = 4;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i3 = AbstractClipsGridUploadListFragment.i0;
                return ((ClipsConfigAuthorsComponent) m7m.d((AbstractClipsGridUploadListFragment) obj).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 1:
                int i4 = AlbumDetailsFragment.p0;
                return (PhotosComponent) m7m.d((AlbumDetailsFragment) obj).a(fpf0.a(PhotosComponent.class));
            case 2:
                int i5 = AlbumsFragment.j0;
                return ((PhotosComponent) ((AlbumsFragment) obj).T.getValue()).r4();
            case 3:
                rv1 rv1Var = (rv1) obj;
                rv1Var.e.a();
                ld20 ld20Var = rv1Var.a;
                SignUpRouter signUpRouter = (SignUpRouter) ld20Var.b;
                SignUpDataHolder signUpDataHolder = (SignUpDataHolder) ld20Var.c;
                SignUpRouter.a.a(signUpRouter, signUpDataHolder.p, null, null, signUpDataHolder.I, 6);
                return s3q0.a;
            case 4:
                int i6 = AppChannelFragment.l1;
                return ((ChannelRestrictionsComponent) m7m.d((AppChannelFragment) obj).mo408a(fpf0.a(ChannelRestrictionsComponent.class))).ad();
            case 5:
                int i7 = ArchiveFragment.e0;
                return ((ArchiveFragment) obj).fo().r4();
            case 6:
                int i8 = nh4.n1;
                return (BridgeComponent) m7m.d((nh4) obj).a(fpf0.a(BridgeComponent.class));
            case 7:
                j96 j96Var = (j96) obj;
                return new u3l0(j96Var.b, j96Var.getStickersDrawingView(), new u40(j96Var, i2), new v40(j96Var, i2), new w40(j96Var, 9));
            case 8:
                izs<? super FeedbackResult, s3q0> izsVar = ((zn6) obj).g;
                if (izsVar != null) {
                    izsVar.invoke(FeedbackResult.STAR_5);
                }
                return s3q0.a;
            case 9:
                return ((BookingEditScreenState.InfoBlock) ((mtk0) obj).getValue()).a;
            case 10:
                ((es7) obj).d(true);
                return s3q0.a;
            case 11:
                return ((VideoAccountHolderComponent) ((k7m) m7m.f((dg8) obj)).a(fpf0.a(VideoAccountHolderComponent.class))).x9();
            case 12:
                return (VoipMainMenuFragmentBase) obj;
            case 13:
                ((z89) obj).e(j9d0.d.a);
                return s3q0.a;
            case 14:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) obj;
                aVar.b.I0(0L);
                an9 an9Var = aVar.i;
                an9Var.e = true;
                an9Var.h = true;
                CameraUIView cameraUIView = aVar.b;
                cameraUIView.getPositions().d();
                cameraUIView.setShutterPosition(true);
                cameraUIView.n(0.12f, 550L);
                zd9 camera1View = cameraUIView.getCamera1View();
                if (camera1View != null) {
                    camera1View.setMaxRecordingLengthMs(Integer.MAX_VALUE);
                }
                aVar.F0();
                aVar.l0();
                return s3q0.a;
            case 15:
                pua puaVar = (pua) obj;
                puaVar.e.k().z(puaVar.b, 389490);
                return s3q0.a;
            case 16:
                int i9 = ChannelFragment.a1;
                return Long.valueOf(((ChannelFragment) obj).requireArguments().getLong("channel_id"));
            case 17:
                r5b r5bVar = (r5b) obj;
                RecyclerView recyclerView2 = r5bVar.h;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.setVisibility(4);
                RecyclerView recyclerView3 = r5bVar.h;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                recyclerView3.stopScroll();
                View view = r5bVar.i;
                if (view == null) {
                    view = null;
                }
                if (f4m.g(view)) {
                    View view2 = r5bVar.i;
                    d3m.c(view2 == null ? null : view2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 100L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                View view3 = r5bVar.i;
                if (view3 == null) {
                    view3 = null;
                }
                view3.setVisibility(0);
                View view4 = r5bVar.j;
                if (view4 == null) {
                    view4 = null;
                }
                view4.setVisibility(4);
                DefaultErrorView defaultErrorView = r5bVar.k;
                (defaultErrorView != null ? defaultErrorView : null).setVisibility(4);
                return s3q0.a;
            case 18:
                i9b i9bVar = (i9b) obj;
                io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
                ph3 ph3Var = new ph3(new u8(i9bVar, 17), 12);
                int i10 = kwg0.a;
                i9bVar.p.b(fVar.subscribe(ph3Var, new jwg0("ChannelProfileInfoModel")));
                return fVar;
            case 19:
                ChannelsListFragment channelsListFragment = (ChannelsListFragment) obj;
                int i11 = channelsListFragment.c0;
                channelsListFragment.c0 = i11;
                View view5 = channelsListFragment.getView();
                if (view5 != null && (recyclerView = (RecyclerView) view5.findViewById(R.id.im_channel_list)) != null) {
                    Integer num = channelsListFragment.d0;
                    if (num != null) {
                        paddingBottom = num.intValue();
                    } else {
                        paddingBottom = recyclerView.getPaddingBottom();
                        channelsListFragment.d0 = Integer.valueOf(paddingBottom);
                    }
                    h48.a(recyclerView, paddingBottom, i11, iah0.a(16));
                }
                return s3q0.a;
            case 20:
                return ((ChatFragment) obj).r0.m();
            case 21:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i12 = ClipFeedListFragment.a2;
                o0r0 o0r0Var = (o0r0) clipFeedListFragment.P1.getValue();
                ClipFeedTab.Discover discover = ClipFeedTab.Discover.b;
                ClipFeedTab Ka = clipFeedListFragment.Ka();
                discover.getClass();
                return new dym0(o0r0Var, ClipFeedTab.Eb(Ka));
            case 22:
                eyd eydVar = (eyd) obj;
                hyd hydVar = eydVar.f;
                return new vik((hydVar != null ? hydVar : null).getCtx(), new s1(eydVar, 23), (o0e) eydVar.g.getValue(), eydVar.new b());
            case 23:
                return ((ClipsEntryPointsComponentImpl) obj).a.p9();
            case 24:
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                return (ClipsViewerComponentImpl) ((ClipsViewerComponent) ((ClipsGridFragment) obj).a0.getValue());
            case 25:
                return (VkText) ((cxg) obj).findViewById(R.id.progress_title);
            case 26:
                Action action = ((r0h) obj).b.b;
                if (action instanceof ActionOpenVkApp) {
                    long j = ((ActionOpenVkApp) action).d;
                    Set<String> set = p0e0.a;
                    new iid0(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeOwnerButtonAppRenderItem((int) j), 3)).q();
                }
                return s3q0.a;
            case 27:
                com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar2 = (com.vk.profile.community.impl.ui.cover.redesign.delegate.a) obj;
                aVar2.a.getImageView().clear();
                aVar2.b(BaseCommunityLiveCoverItemDelegate.ViewState.COMMON);
                aVar2.f();
                return s3q0.a;
            case 28:
                ComposeHeaderShowAllVh composeHeaderShowAllVh = (ComposeHeaderShowAllVh) obj;
                qcy<Object>[] qcyVarArr2 = ComposeHeaderShowAllVh.x;
                if (!jjc.d().a()) {
                    qcy<Object>[] qcyVarArr3 = ComposeHeaderShowAllVh.x;
                    composeHeaderShowAllVh.b(ClickType.SHOW_ALL_CHEVRON);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            default:
                aui auiVar = (aui) obj;
                Iterable iterable = auiVar.b;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f64) it.next()).a.n());
                }
                return new lk50(auiVar, arrayList);
        }
    }
}
