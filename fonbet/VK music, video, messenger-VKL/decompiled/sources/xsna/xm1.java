package xsna;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.clip.ClipSearchFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.design.view.preview.ClipsVideoAndPhotoView;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.categories.impl.presentation.CategoriesFragment;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.community.suggestions.api.di.CommunitySuggestionsComponent;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.video.stability.api.di.VideoAppStabilityComponent;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import one.video.view.OneVideoPlayerView;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.hgd.b;
import xsna.va9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xm1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xm1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r0v69, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Drawable mutate;
        SdkVideoFile sdkVideoFile;
        List<SdkVideoFile> list;
        VideoFile A;
        switch (this.b) {
            case 0:
                AlbumsFragment albumsFragment = (AlbumsFragment) this.c;
                int i = AlbumsFragment.j0;
                return ((PhotosComponent) albumsFragment.T.getValue()).d3();
            case 1:
                wek wekVar = ((dg3) this.c).a;
                ReentrantLock reentrantLock = wekVar.a;
                reentrantLock.lock();
                try {
                    CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.NATIVE_BUFFER;
                    Object[] objArr = {"obtain " + wekVar.b.size()};
                    qek qekVar = vek.a;
                    if (qekVar != null) {
                        qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
                    }
                    ByteBuffer l = wekVar.b.l();
                    if (l == null) {
                        Object[] objArr2 = {"createBuffer " + wekVar.b.size()};
                        qek qekVar2 = vek.a;
                        if (qekVar2 != null) {
                            qekVar2.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr2, 1));
                        }
                        l = ByteBuffer.allocateDirect(8192);
                    }
                    return l;
                } finally {
                    reentrantLock.unlock();
                }
            case 2:
                ct4 ct4Var = (ct4) this.c;
                return ct4Var.d(ct4Var.h);
            case 3:
                return ((VideoAppStabilityComponent) ((k7m) m7m.f(((com.vk.libvideo.autoplay.b) this.c).d)).a(fpf0.a(VideoAppStabilityComponent.class))).G7();
            case 4:
                return new tnp0(((p36) this.c).h);
            case 5:
                return ((BridgeComponent) ((k7m) m7m.f((u440) this.c)).a(fpf0.a(BridgeComponent.class))).t().b();
            case 6:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                int i2 = BasePhotoListFragment.l0;
                return new BasePhotoListFragment.c(basePhotoListFragment);
            case 7:
                BookingEditScreenFragment bookingEditScreenFragment = (BookingEditScreenFragment) this.c;
                qcy<Object>[] qcyVarArr = BookingEditScreenFragment.W;
                Bundle requireArguments = bookingEditScreenFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("initParams", BookingScreenParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable5 = requireArguments.getParcelable("initParams");
                    parcelable = (BookingScreenParams) (parcelable5 instanceof BookingScreenParams ? parcelable5 : null);
                }
                if (parcelable != null) {
                    return (BookingScreenParams) parcelable;
                }
                throw new IllegalStateException("Required value was null.");
            case 8:
                return CallModuleImpl.c((CallModuleImpl) this.c);
            case 9:
                ((va9) this.c).h.onNext(new va9.g(va9.r, true));
                return s3q0.a;
            case 10:
                ((NewsFeedComponent) ((k7m) m7m.f((ur9) this.c)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 11:
                CategoriesFragment categoriesFragment = (CategoriesFragment) this.c;
                qcy<Object>[] qcyVarArr2 = CategoriesFragment.P;
                Bundle requireArguments2 = categoriesFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = requireArguments2.getParcelable("tracking_data", MarketAnalyticsParams.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    ?? parcelable6 = requireArguments2.getParcelable("tracking_data");
                    parcelable3 = (MarketAnalyticsParams) (parcelable6 instanceof MarketAnalyticsParams ? parcelable6 : null);
                }
                MarketAnalyticsParams marketAnalyticsParams = (MarketAnalyticsParams) parcelable3;
                return marketAnalyticsParams == null ? new MarketAnalyticsParams(null, null, null, null, null, null, null, false, null, false, false, null, false, 8191, null) : marketAnalyticsParams;
            case 12:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i3 = ChannelFragment.a1;
                if (channelFragment.isPostponed()) {
                    return null;
                }
                return new q4b((a3b) channelFragment.H0.getValue(), channelFragment.V.r().h);
            case 13:
                return i5s.a(new StringBuilder(), ((wgb) this.c).s, ": loadNextInternal: started");
            case 14:
                return ((ModerationComponent) ((k7m) m7m.f((gmb) this.c)).mo408a(fpf0.a(ModerationComponent.class))).bd();
            case 15:
                ynb ynbVar = (ynb) this.c;
                Drawable e = krv0.e(R.drawable.vk_icon_check_circle_outline_24, ynbVar.getContext());
                if (e == null || (mutate = e.mutate()) == null) {
                    return null;
                }
                mutate.setTint(krv0.m(R.attr.vk_ui_icon_primary, ynbVar.getContext()));
                return mutate;
            case 16:
                return (v8s) this.c;
            case 17:
                ((y5p0) this.c).r();
                return s3q0.a;
            case 18:
                qnc qncVar = (qnc) this.c;
                int i4 = inc.l1;
                return aoc.a(qncVar.getCurrentState());
            case 19:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i5 = ClipFeedListFragment.a2;
                SchemeStat$TypeClipViewerItem.ScreenType b = fzc.b(clipFeedListFragment.Ka());
                lie lieVar = new lie();
                ufd ufdVar = new ufd((cro0) clipFeedListFragment.mo2getContext(), fzc.b(clipFeedListFragment.Ka()), new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(clipFeedListFragment, 25), ((nbs) clipFeedListFragment.H0.getValue()).getLifecycle());
                qoc qocVar = new qoc((lt00) clipFeedListFragment.f0.getValue());
                qcd qcdVar = new qcd();
                zlc zlcVar = new zlc((ki0) clipFeedListFragment.k0.getValue());
                ycd ycdVar = new ycd(fzc.b(clipFeedListFragment.Ka()));
                g2z g2zVar = new g2z(clipFeedListFragment.Ka());
                Parcelable Ka = clipFeedListFragment.Ka();
                if (Ka instanceof ClipFeedTab.c) {
                    sdkVideoFile = ((ClipFeedTab.c) Ka).A();
                } else {
                    kwc kwcVar = clipFeedListFragment.T;
                    if (kwcVar == null || (list = kwcVar.a) == null) {
                        sdkVideoFile = null;
                    } else {
                        sdkVideoFile = (SdkVideoFile) j5g.b0(kwcVar != null ? kwcVar.c : 0, list);
                    }
                }
                if (sdkVideoFile != null && (A = k15.A(sdkVideoFile)) != null) {
                    r4 = gls0.a(A);
                }
                return new svc(b, lieVar, ufdVar, qocVar, qcdVar, zlcVar, ycdVar, new lzc(g2zVar, r4), new n8d(fzc.b(clipFeedListFragment.Ka())), (q20) clipFeedListFragment.v0.getValue());
            case 20:
                ClipSearchFragment clipSearchFragment = (ClipSearchFragment) this.c;
                int i6 = ClipSearchFragment.Q;
                return clipSearchFragment.getViewLifecycleOwner();
            case 21:
                return ((hgd) this.c).new b();
            case 22:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) this.c;
                return new com.vk.clips.entrypoints.ui.d((q7v0) clipsEntryPointsFragment.W.getValue(), new ClipsEntryPointsFragment.e(1, clipsEntryPointsFragment, ClipsEntryPointsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
            case 23:
                return new gwe((hwe) this.c);
            case 24:
                ClipsVideoAndPhotoView clipsVideoAndPhotoView = (ClipsVideoAndPhotoView) this.c;
                float f = ClipsVideoAndPhotoView.e;
                return (OneVideoPlayerView) clipsVideoAndPhotoView.findViewById(R.id.player_view);
            case 25:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return clipsViewerComponentImpl.Jf().a() ? q370.a : new iwe(g620.f().e());
            case 26:
                cch cchVar = (cch) this.c;
                mre mreVar = cchVar.j;
                if (mreVar != null) {
                    mreVar.invoke(cchVar.g.b);
                }
                return s3q0.a;
            case 27:
                return ((CommunitySuggestionsComponent) m7m.d(((o1i) this.c).b).mo408a(fpf0.a(CommunitySuggestionsComponent.class))).a();
            case 28:
                return ((oaj) this.c).itemView.getContext().getString(R.string.vkim_contact_invite);
            default:
                oul oulVar = (oul) this.c;
                if (((Boolean) ovi.a(oulVar, qer0.a)).booleanValue()) {
                    return qer0.b;
                }
                return ((ylu0) ovi.a(oulVar, rrv0.a)).s() ? ((double) f870.E(((l5g) ovi.a(oulVar, yfj.a)).a)) > 0.5d ? jlg0.d : jlg0.e : jlg0.f;
        }
    }
}
