package xsna;

import android.content.Context;
import android.os.Parcelable;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponentImpl;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.ui.BookingNavHostFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.msg.BombView;
import com.vk.log.L;
import com.vk.music.bottomsheets.audiobook.di.AudioBookBottomSheetComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.ikv0;
import xsna.xf8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ng1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ng1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AlbumDetailsFragment.p0;
                return ((BridgeComponent) ((AlbumDetailsFragment) obj).f0.getValue()).h8();
            case 1:
                int i3 = ArchiveFragment.e0;
                Parcelable parcelable = ((ArchiveFragment) obj).requireArguments().getParcelable("uid");
                if (parcelable != null) {
                    return (UserId) parcelable;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                return zr.a("AssertionTracker(system: ov_sdk, subSystem: ", (String) obj, ") already registered");
            case 3:
                return ((AudioBookBottomSheetComponentImpl) obj).c.Le();
            case 4:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 5:
                int i4 = ug6.j1;
                return ((VoipAnalyticsInternalComponent) m7m.d((ug6) obj).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df();
            case 6:
                return ((NewsFeedComponent) ((k7m) m7m.f((rx6) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 7:
                int i5 = BlacklistFragment.V;
                h3p0.b((BlacklistFragment) obj);
                return s3q0.a;
            case 8:
                return new BombView.a(((BombView) obj).e);
            case 9:
                return ((BookingEditScreenState.InfoBlock) ((mtk0) obj).getValue()).f;
            case 10:
                BookingNavHostFragment bookingNavHostFragment = (BookingNavHostFragment) obj;
                int i6 = BookingNavHostFragment.S;
                bp80 bp80Var = new bp80(new BookingScreenParams(bookingNavHostFragment.eo(), 0, null, null, null, false, null, null, null, null, 0, null, 0, null, null, null, null, 131070, null));
                l7m d = m7m.d(bookingNavHostFragment);
                OnlineBookingInternalComponent.n.getClass();
                return (OnlineBookingInternalComponent) d.d(OnlineBookingInternalComponent.a.a(bp80Var)).a(fpf0.a(OnlineBookingInternalComponent.class));
            case 11:
                ((wf8) obj).d(xf8.b.a);
                return s3q0.a;
            case 12:
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = ((q49) obj).b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().q();
                }
                return s3q0.a;
            case 13:
                Context context = ((com.vk.channels.impl.list.f) obj).n;
                return Boolean.FALSE;
            case 14:
                ChatFragment chatFragment = (ChatFragment) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                return up2.g(m7m.d(chatFragment), chatFragment.requireContext());
            case 15:
                ((wh50) obj).setValue(Boolean.valueOf(!((Boolean) r4.getValue()).booleanValue()));
                return s3q0.a;
            case 16:
                ((bmc) obj).b.a(h5d.b);
                return s3q0.a;
            case 17:
                cfd cfdVar = (cfd) obj;
                VkTooltip vkTooltip = cfdVar.P0;
                if (vkTooltip != null) {
                    vkTooltip.dismiss();
                }
                if (cfdVar.Q0) {
                    d3m.e(cfdVar.J0, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                return s3q0.a;
            case 18:
                return (ClipsDownloadComponent) ((k7m) m7m.f((ekd) obj)).a(fpf0.a(ClipsDownloadComponent.class));
            case 19:
                qcy<Object>[] qcyVarArr = ClipsCoauthorsComponentImpl.d;
                return new imd((ClipsCoauthorsInternalComponent) obj);
            case 20:
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                ((ClipsGridFragment) obj).mo().e2(true);
                return s3q0.a;
            case 21:
                return ((ClipsPlaylistsComponent) ((k7m) m7m.f((kke) obj)).mo408a(fpf0.a(ClipsPlaylistsComponent.class))).b();
            case 22:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((r5f) obj)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 23:
                return new n0e(((y7f) obj).a.getVideoView().a);
            case 24:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj;
                String str = ClipsUploadFragmentImpl.a0;
                return new pef(clipsUploadFragmentImpl.kn(), g5z.a(clipsUploadFragmentImpl), clipsUploadFragmentImpl.fo().e(), m7m.d(clipsUploadFragmentImpl));
            case 25:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((mlf) obj)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 26:
                return new e25(((ClipsViewersSdkComponentImpl) obj).a.s());
            case 27:
                return ((v3p) obj).u();
            case 28:
                ((CommunitiesSearchTopBarVh) obj).b.invoke(a.c.a);
                return s3q0.a;
            default:
                cfh cfhVar = (cfh) obj;
                Context context2 = cfhVar.a;
                ikv0.a aVar = new ikv0.a(context2);
                aVar.t = ikv0.c.f.a;
                aVar.u = new ikv0.d(context2.getString(R.string.community_add_contacts_saved), (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
                aVar.k = 1;
                pkv0.g(aVar, 300L);
                cfhVar.c.invoke(new CommunityProfileAction.o(false));
                return s3q0.a;
        }
    }
}
