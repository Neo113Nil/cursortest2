package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.cameraui.impl.a;
import com.vk.channelrestrictions.ChannelRestrictionsComponent;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.media.MediaFilteringStrategy;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.profile.community.details.api.di.CommunityDetailsComponent;
import com.vk.toggle.Features;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.am9;
import xsna.q0e.e;
import xsna.qg8;
import xsna.xcw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((NewsFeedComponent) ((k7m) m7m.f((ma0) obj2)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 1:
                return ((NewsFeedComponent) ((k7m) m7m.f((wf0) obj2)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 2:
                int i3 = AlbumDetailsFragment.p0;
                Parcelable parcelable2 = ((AlbumDetailsFragment) obj2).requireArguments().getParcelable("uid");
                if (parcelable2 != null) {
                    return (UserId) parcelable2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                return Float.valueOf(((s600) obj2).getProgress());
            case 4:
                ct4 ct4Var = (ct4) obj2;
                return ct4Var.d(ct4Var.h);
            case 5:
                return new tnp0(((p36) obj2).i);
            case 6:
                return (ImageView) ((cb6) obj2).itemView.findViewById(R.id.item_pay_method_logo);
            case 7:
                BookingEditScreenFragment bookingEditScreenFragment = (BookingEditScreenFragment) obj2;
                qcy<Object>[] qcyVarArr = BookingEditScreenFragment.W;
                bp80 bp80Var = new bp80((BookingScreenParams) bookingEditScreenFragment.T.getValue());
                l7m d = m7m.d(bookingEditScreenFragment);
                OnlineBookingInternalComponent.n.getClass();
                return (OnlineBookingInternalComponent) d.d(OnlineBookingInternalComponent.a.a(bp80Var)).a(fpf0.a(OnlineBookingInternalComponent.class));
            case 8:
                qcy<Object>[] qcyVarArr2 = BookingServicesScreenFragment.S;
                Bundle requireArguments = ((BookingServicesScreenFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("initParams", BookingScreenParams.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable3 = requireArguments.getParcelable("initParams");
                    obj = (BookingScreenParams) (parcelable3 instanceof BookingScreenParams ? parcelable3 : null);
                }
                if (obj != null) {
                    return (BookingScreenParams) obj;
                }
                throw new IllegalStateException("Required value was null.");
            case 9:
                return (TextView) ((ke8) obj2).f.findViewById(R.id.start_hint);
            case 10:
                pg8 pg8Var = (pg8) obj2;
                qg8.b bVar = qg8.b.a;
                if (pg8Var.m) {
                    pg8Var.l.onNext(bVar);
                }
                return s3q0.a;
            case 11:
                ((wh50) obj2).setValue(Boolean.TRUE);
                return s3q0.a;
            case 12:
                ((a89) obj2).q(xcw0.c0.a);
                return s3q0.a;
            case 13:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) obj2;
                aVar.b.w();
                CameraUIView cameraUIView = aVar.b;
                cameraUIView.u();
                a.C0443a c0443a = aVar.n;
                an9 an9Var = aVar.i;
                cameraUIView.X();
                cameraUIView.m();
                am9.a aVar2 = aVar.h.a;
                aVar2.f = "live";
                aVar2.d = "video";
                Context context = cameraUIView.getContext();
                dhr0.a.getClass();
                pe8 q = fxc0.B().T().q(new l7s(context, dhr0.u().c));
                q.getView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                cameraUIView.setBroadcast(q);
                FrameLayout frameLayout = cameraUIView.A0;
                if (frameLayout != null) {
                    frameLayout.addView(q.getView());
                }
                q.C1(cameraUIView.A0, Boolean.valueOf(cameraUIView.getPositions().getState().n));
                cameraUIView.getPositions().setBroadcast(q);
                ne8 I = fxc0.B().T().I(cameraUIView.getPositions().f(), StoryCameraMode.LIVE.h().name());
                StorySharingInfo storySharingInfo = aVar.c.f;
                I.b0(storySharingInfo != null ? storySharingInfo.f : null);
                I.g2(aVar);
                I.V1(aVar);
                I.M0(aVar);
                I.f2(an9Var.r);
                q.setPresenter(I);
                aVar.r = I;
                I.start();
                an9Var.q = true;
                an9Var.r = false;
                ufd0 Z8 = ((ContentPrivacyComponent) aVar.e.l.getValue()).Z8();
                UserId userId = c0443a.a;
                esw j = Z8.j();
                j.getClass();
                List singletonList = fkq0.b(userId) ? Collections.singletonList(j.b.a) : EmptyList.b;
                ne8 ne8Var = aVar.r;
                if (ne8Var != null) {
                    String liveNameText = cameraUIView.getLiveNameText();
                    String str = "";
                    if (liveNameText != null) {
                        bpn0 bpn0Var = ni9.a;
                        Features.Type type = Features.Type.FEATURE_CLIPS_LIVES_DEBUG_TWEAK_TARGET;
                        type.getClass();
                        if (com.vk.toggle.b.A.a(type) && (brm0.B(liveNameText, "okmp://", true) || brm0.B(liveNameText, "rtmp://", true))) {
                            str = drm0.i0('|', liveNameText, "");
                        }
                    }
                    ne8Var.D(myc0.f(str) ? "<Redirected Live>" : cameraUIView.getLiveNameText(), c0443a.a, c0443a.b, c0443a.c, c0443a.e, aVar.p, aVar.m.O(), singletonList, new fb(aVar, 11));
                }
                cameraUIView.R();
                cameraUIView.getPositions().d();
                cameraUIView.setShutterPosition(true);
                rg10 maskCallback = cameraUIView.getMaskCallback();
                if (maskCallback != null) {
                    maskCallback.setMasksAuthorClickEnabled(false);
                }
                cameraUIView.d0();
                cameraUIView.S();
                aVar.l0();
                return s3q0.a;
            case 14:
                ew9 ew9Var = (ew9) obj2;
                mzp0 mzp0Var = ew9Var.h;
                if (mzp0Var != null) {
                    mzp0Var.d(ew9Var.g);
                }
                yw90 yw90Var = ew9Var.i;
                if (yw90Var != null) {
                    yw90Var.a();
                }
                return s3q0.a;
            case 15:
                int i4 = ChannelFragment.a1;
                return ((ChannelRestrictionsComponent) m7m.d((ChannelFragment) obj2).mo408a(fpf0.a(ChannelRestrictionsComponent.class))).h2();
            case 16:
                com.vk.channels.impl.channel_screen.send_msg.a aVar3 = (com.vk.channels.impl.channel_screen.send_msg.a) obj2;
                WriteBar writeBar = aVar3.x;
                (writeBar != null ? writeBar : null).O();
                aVar3.f();
                return s3q0.a;
            case 17:
                return i5s.a(new StringBuilder(), ((wgb) obj2).s, ": loadInitial: cache is empty, remote is empty");
            case 18:
                return ((ModerationComponent) ((k7m) m7m.f((gmb) obj2)).mo408a(fpf0.a(ModerationComponent.class))).Q2();
            case 19:
                int i5 = ClipFeedListFragment.a2;
                return new hme(new qo0(4), new rxc((ClipFeedListFragment) obj2, i2));
            case 20:
                com.vk.newsfeed.common.recycler.holders.clips.a aVar4 = (com.vk.newsfeed.common.recycler.holders.clips.a) obj2;
                if (aVar4.c7()) {
                    d3m.e(aVar4.E, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                return s3q0.a;
            case 21:
                return m33.a(R.drawable.highlight_radius_8_black, ((hgd) obj2).i.getContext());
            case 22:
                q0e q0eVar = q0e.this;
                s0e s0eVar = q0eVar.l;
                Context ctx = (s0eVar != null ? s0eVar : null).getCtx();
                c9d c9dVar = q0eVar.d;
                szd szdVar = q0eVar.e;
                e2e e2eVar = q0eVar.f;
                com.vk.clips.editor.voiceover.impl.a aVar5 = new com.vk.clips.editor.voiceover.impl.a(ctx, q0eVar.new e(), c9dVar, szdVar, e2eVar, q0eVar.c);
                q0eVar.w = aVar5;
                ((mpe) e2eVar.i.e.getValue()).a(ctx, new String[]{"android.permission.RECORD_AUDIO"}, new v40(aVar5, 18), new qb(15));
                return s3q0.a;
            case 23:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj2;
                y4t y4tVar = (y4t) clipsEntryPointsFragment.R.getValue();
                Bundle bundle = new Bundle();
                dhr0.a.getClass();
                bundle.putInt("theme", dhr0.u().c);
                bundle.putInt("media_type", 111);
                bundle.putBoolean("preview_1_5", true);
                bundle.putBoolean("camera_enabled", false);
                bundle.putBoolean("show_clips_camera", true);
                bundle.putInt("total_selection_limit", 30);
                bundle.putInt("initial_padding", 0);
                bundle.putSerializable("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC_HEVC);
                bundle.putLong("story_trim_end_position", 60000L);
                bundle.putLong("video_max_length_ms", ynd.a);
                bundle.putLong("video_min_length_ms", 100L);
                bundle.putBoolean("enable_default_album_entries", false);
                bundle.putParcelable("gallery_picker_source_configuration", new GalleryPickerSourceConfiguration(false, false, null, false, false, false, true, false, null, 447, null));
                int i6 = 26;
                return new t3t(bundle, y4tVar, new sa0(clipsEntryPointsFragment, i6), new g20(clipsEntryPointsFragment, i6), new h20(clipsEntryPointsFragment, 17), new com.vk.movika.sdk.base.logic.processor.actions.d(clipsEntryPointsFragment, 19));
            case 24:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                int i7 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.getClass();
                xn50.a.c(clipsFavoriteFolderContentListFragment, a.i.b);
                return s3q0.a;
            case 25:
                qcy<Object>[] qcyVarArr3 = ClipsGridFragment.H0;
                return new tde(EmptyList.b, ((ClipsGridFragment) obj2).In(), new gcd0(13));
            case 26:
                return ((ClipsViewerComponent) ((g8m) obj2).a(fpf0.a(ClipsViewerComponent.class))).j4();
            case 27:
                qcy<Object>[] qcyVarArr4 = ClipsViewerComponentImpl.o0;
                jwe e = g620.f().e();
                ClipsConfigViewersComponent clipsConfigViewersComponent = ((ClipsViewerComponentImpl) obj2).b;
                clipsConfigViewersComponent.getExperiments().e().getClass();
                clipsConfigViewersComponent.getExperiments().e().getClass();
                return new vz50(e, false);
            case 28:
                ((ebh) obj2).d();
                return s3q0.a;
            default:
                return ((CommunityDetailsComponent) m7m.d(((o1i) obj2).b).a(fpf0.a(CommunityDetailsComponent.class))).a();
        }
    }
}
