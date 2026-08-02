package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.holders.ComposeHeaderVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.channel_screen.UnreadCounterDataSourceImpl;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridOwnerClipsListFragment;
import com.vk.core.ui.bottomsheet.internal.BottomSheetBehaviourExt;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.im.sync.api.di.ImSynchronizationComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.photo.editor.features.colorgrading.b;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.j9d0;
import xsna.k840;
import xsna.q0e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class v40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        File cacheDir_delegate$lambda$0;
        a.b bVar;
        com.vk.photo.editor.features.colorgrading.a H;
        a.b bVar2;
        a.b bVar3;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((zak0) ((z40) obj).g).setValue(Boolean.valueOf(!r5.b()));
                return s3q0.a;
            case 1:
                int i2 = AlbumDetailsFragment.p0;
                return ((AlbumDetailsFragment) obj).ho().Od();
            case 2:
                ((zak0) ((us1) obj).b).setValue(Boolean.TRUE);
                return s3q0.a;
            case 3:
                cacheDir_delegate$lambda$0 = AndroidCacheRepository.cacheDir_delegate$lambda$0((AndroidCacheRepository) obj);
                return cacheDir_delegate$lambda$0;
            case 4:
                return Integer.valueOf(((j96) obj).d());
            case 5:
                View view = ((ae6) obj).c;
                (view != null ? view : null).getContext();
                return Boolean.FALSE;
            case 6:
                if (((oh6) obj).a) {
                    return (com.vk.music.offline.api.domain.download.b) k840.a.r.getValue();
                }
                return null;
            case 7:
                int i3 = BasePhotoListFragment.m0;
                return ((NewsFeedComponent) m7m.d((BasePhotoListFragment) obj).a(fpf0.a(NewsFeedComponent.class))).w();
            case 8:
                BookingPreloaderFragment bookingPreloaderFragment = (BookingPreloaderFragment) obj;
                qcy<Object>[] qcyVarArr = BookingPreloaderFragment.S;
                bp80 bp80Var = new bp80((BookingScreenParams) bookingPreloaderFragment.N.getValue());
                l7m d = m7m.d(bookingPreloaderFragment);
                OnlineBookingInternalComponent.n.getClass();
                return (OnlineBookingInternalComponent) d.d(OnlineBookingInternalComponent.a.a(bp80Var)).a(fpf0.a(OnlineBookingInternalComponent.class));
            case 9:
                d98 d98Var = (d98) obj;
                BottomSheetBehaviourExt<View> bottomSheetBehaviourExt = d98Var.g;
                if (bottomSheetBehaviourExt.M == 3) {
                    d98Var.a();
                } else {
                    bottomSheetBehaviourExt.X(5);
                }
                return Boolean.TRUE;
            case 10:
                ((z89) obj).e(j9d0.j.a);
                return s3q0.a;
            case 11:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                a1w a1wVar = channelFragment.V;
                a1wVar.getClass();
                lxa lo = channelFragment.lo();
                w8b no = channelFragment.no();
                zcb zcbVar = (zcb) channelFragment.s0.getValue();
                gc4 gc4Var = channelFragment.x0;
                xbw l = ((ImRxEventObserverComponent) m7m.d(channelFragment).a(fpf0.a(ImRxEventObserverComponent.class))).l();
                jxv Ea = ((ImSynchronizationComponent) m7m.d(channelFragment).a(fpf0.a(ImSynchronizationComponent.class))).Ea();
                io.reactivex.rxjava3.disposables.b bVar4 = channelFragment.p0;
                t1w t1wVar = new t1w(l, Ea, bVar4);
                edb edbVar = new edb(channelFragment.lo(), a1wVar, bVar4);
                g2v.c().getClass();
                uza uzaVar = new uza(lo, no, zcbVar, gc4Var, t1wVar, edbVar, new UnreadCounterDataSourceImpl(channelFragment.requireContext()));
                h3g0 h3g0Var = new h3g0(channelFragment.requireContext());
                channelFragment.requireContext();
                imj0 imj0Var = new imj0();
                kpf0 kpf0Var = new kpf0(channelFragment.requireContext());
                ImSyncStateStatReporter imSyncStateStatReporter = (ImSyncStateStatReporter) channelFragment.A0.getValue();
                g2v.c().getClass();
                boolean isPostponed = channelFragment.isPostponed();
                channelFragment.requireContext();
                return new jrb(new sza(uzaVar, h3g0Var, imj0Var, kpf0Var, imSyncStateStatReporter, true, isPostponed), new tw0(new ChannelFragment.e(0, channelFragment, ChannelFragment.class, "closeScreen", "closeScreen()V", 0), new ChannelFragment.f(0, channelFragment, ChannelFragment.class, "onHeaderOrAvatarClicked", "onHeaderOrAvatarClicked()V", 0), new ChannelFragment.g(1, channelFragment, ChannelFragment.class, "showAgeRestriction", "showAgeRestriction(Lcom/vk/channelrestrictions/RestrictionBadge;)V", 0)), new vza(channelFragment.mo(), channelFragment.requireContext(), channelFragment.vo(), channelFragment.V, g2v.c(), channelFragment.uo().b()), channelFragment.wo());
            case 12:
                return new vlm(((ngb) obj).a);
            case 13:
                return jmc.a((jmc) obj);
            case 14:
                ((lrc) obj).f.invoke();
                return s3q0.a;
            case 15:
                int i4 = ClipFeedListFragment.a2;
                return ((ClipsPlaylistsComponent) m7m.d((ClipFeedListFragment) obj).mo408a(fpf0.a(ClipsPlaylistsComponent.class))).e();
            case 16:
                ((o1d) obj).x0.a(i3d.b);
                return s3q0.a;
            case 17:
                return (FrameLayout) ((hyd) obj).i().findViewById(R.id.clips_editor_preview_overlay);
            case 18:
                com.vk.clips.editor.voiceover.impl.a aVar = (com.vk.clips.editor.voiceover.impl.a) obj;
                q0e.e eVar = aVar.b;
                eVar.c(true);
                c9d c9dVar = aVar.c;
                c9dVar.d(true);
                cbr cbrVar = cbr.a;
                File b = aVar.e.j.b();
                String str = "voiceover_" + System.currentTimeMillis() + "_audio";
                cbrVar.getClass();
                File e = cbr.e(b, str, "aac");
                int i5 = ClipsEditorMusicTrack.m;
                ClipsEditorMusicTrack clipsEditorMusicTrack = new ClipsEditorMusicTrack((int) UUID.randomUUID().getLeastSignificantBits(), null, aVar.a.getString(R.string.clips_original_sound_title), 0, "", e.getAbsolutePath(), null, null, false, null, false, 1986, null);
                ClipsEditorMusicInfo clipsEditorMusicInfo = new ClipsEditorMusicInfo(clipsEditorMusicTrack, e.getAbsolutePath(), 0, ((int) bzd.z) + 1, 0, e.getAbsolutePath(), 0, false, false, null, true, VideoRecord.DEFAULT_MAX_DIMENSION, null);
                szd szdVar = aVar.d;
                aVar.l = new a1e(false, clipsEditorMusicTrack, e, szdVar.o.a.d, null, false);
                q0e q0eVar = q0e.this;
                q0eVar.P(q0e.c.a.a, false, true);
                ClipsEditorAudioItem clipsEditorAudioItem = new ClipsEditorAudioItem(clipsEditorMusicInfo, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 14);
                EmptyList emptyList = EmptyList.b;
                com.vk.clips.editor.state.model.a aVar2 = szdVar.o.a;
                ArrayList arrayList = new ArrayList(aVar2.e);
                arrayList.add(Collections.singletonList(clipsEditorAudioItem));
                szdVar.c(com.vk.clips.editor.state.model.a.c(aVar2, null, null, null, arrayList, null, null, 111), emptyList);
                s0e s0eVar = q0eVar.l;
                (s0eVar != null ? s0eVar : null).k(clipsEditorAudioItem.f);
                aVar.c(c9dVar.n());
                c9dVar.k(aVar);
                return s3q0.a;
            case 19:
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                return ((ClipsConfigAuthorsComponent) m7m.d((ClipsGridFragment) obj).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 20:
                ClipsGridOwnerClipsListFragment clipsGridOwnerClipsListFragment = (ClipsGridOwnerClipsListFragment) obj;
                int i6 = ClipsGridOwnerClipsListFragment.o0;
                return new zde("CLIPS_GRID_OWNER_CLIPS", new ClipsGridOwnerClipsListFragment.b(3, clipsGridOwnerClipsListFragment, ClipsGridOwnerClipsListFragment.class, "openClipList", "openClipList(ILjava/util/List;Lcom/vk/libvideo/api/AnimationDialogCallback;)V", 0), new ClipsGridOwnerClipsListFragment.c(2, clipsGridOwnerClipsListFragment, ClipsGridOwnerClipsListFragment.class, "showClipsGridMenuActions", "showClipsGridMenuActions(Lcom/vk/dto/common/ClipVideoFile;Ljava/lang/Integer;)V", 0), new ClipsGridOwnerClipsListFragment.d(2, clipsGridOwnerClipsListFragment, ClipsGridOwnerClipsListFragment.class, "showClipsGridShortMenuActions", "showClipsGridShortMenuActions(Lcom/vk/dto/common/ClipVideoFile;Ljava/lang/Integer;)V", 0), clipsGridOwnerClipsListFragment.no(), new ClipsGridOwnerClipsListFragment.e(clipsGridOwnerClipsListFragment, ClipsGridOwnerClipsListFragment.class, "selectedProfileId", "getSelectedProfileId()Lcom/vk/dto/common/id/UserId;", 0), new ClipsGridOwnerClipsListFragment.f(0, (ide) clipsGridOwnerClipsListFragment.getParentFragment(), ide.class, "getTabsCount", "getTabsCount()I", 0), clipsGridOwnerClipsListFragment.getViewLifecycleOwner(), clipsGridOwnerClipsListFragment.k0);
            case 21:
                int i7 = ClipsInterestsFragment.Y;
                return (FrameLayout) ((ClipsInterestsFragment.b) obj).i();
            case 22:
                ClipsDraftPersistentStore.b.getClass();
                ClipsDraftPersistentStore.c(true);
                ClipsDraftPersistentStore.s();
                ((y7f) obj).a.finish();
                return s3q0.a;
            case 23:
                final ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return new p20() { // from class: xsna.eof
                    @Override // xsna.p20
                    public final SchemeStat$EventItem.Type a(String str2) {
                        qcy<Object>[] qcyVarArr4 = ClipsViewerComponentImpl.o0;
                        ClipsViewerComponentImpl.this.Mf().getClass();
                        return q20.a(str2);
                    }
                };
            case 24:
                ColorGradingTool colorGradingTool = (ColorGradingTool) obj;
                v3p v3pVar = colorGradingTool.c;
                com.vk.photo.editor.features.colorgrading.a H2 = ColorGradingTool.H(v3pVar.d());
                if (H2 != null) {
                    com.vk.photo.editor.features.colorgrading.a H3 = ColorGradingTool.H(v3pVar.d());
                    Object[] objArr = (H3 == null || (bVar3 = H3.k) == null || !bVar3.b()) ? false : true;
                    com.vk.photo.editor.features.colorgrading.a H4 = ColorGradingTool.H(v3pVar.d());
                    Object[] objArr2 = H4 == null || (bVar = H4.k) == null || bVar.b != 0 || (H = ColorGradingTool.H(v3pVar.d())) == null || (bVar2 = H.k) == null || bVar2.a != 0;
                    if (objArr != false && objArr2 != false) {
                        v3pVar.d().a(new EditorMessage.i(com.vk.photo.editor.features.colorgrading.a.a(H2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, new a.b(0), 4095), EditorMessage.Source.UserInput, 4));
                    }
                }
                colorGradingTool.n.b(b.n.a);
                v3pVar.c(true);
                return s3q0.a;
            case 25:
                return (VkText) ((uqg) obj).findViewById(R.id.community_address_info_cell_subtitle);
            case 26:
                xa80 xa80Var = (xa80) obj;
                if (xa80Var != null) {
                    xa80Var.b();
                }
                return s3q0.a;
            case 27:
                return ((LinksBridgeComponent) ((h7m) obj).a(fpf0.a(LinksBridgeComponent.class))).p().getBrowser();
            case 28:
                ComposeHeaderVh composeHeaderVh = (ComposeHeaderVh) obj;
                qcy<Object>[] qcyVarArr4 = ComposeHeaderVh.n;
                if (!jjc.d().a()) {
                    qcy<Object>[] qcyVarArr5 = ComposeHeaderVh.n;
                    composeHeaderVh.b(ClickType.SHOW_ALL);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            default:
                com.vk.im.ui.components.contacts.a aVar3 = (com.vk.im.ui.components.contacts.a) obj;
                if (o25.b(o25.a()) && !aVar3.r) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
