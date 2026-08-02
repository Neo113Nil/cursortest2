package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.fragment.GraffitiFragment;
import com.vk.biometric.auth.api.di.BiometricAuthComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupFragment;
import com.vk.bridges.ImageViewer;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.external.nps.api.di.ClipsExternalNpsComponent;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.newsfeed.common.PostActions;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.posting.presentation.album.AlbumPickerFragment;
import com.vk.posting.presentation.articlepicker.ArticlePickerFragment;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.g9h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rj1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rj1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s980 s980Var;
        Object obj;
        Object parcelable;
        View view;
        int i = this.b;
        int i2 = 3;
        r4 = null;
        Context context = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i3 = AlbumPickerFragment.V;
                return new djl(new com.vk.movika.sdk.base.logic.interactor.h((AlbumPickerFragment) obj2, i2));
            case 1:
                int i4 = AlbumsFragment.j0;
                Parcelable parcelable2 = ((AlbumsFragment) obj2).requireArguments().getParcelable("uid");
                if (parcelable2 != null) {
                    return (UserId) parcelable2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                ((zak0) ((us1) obj2).b).setValue(Boolean.FALSE);
                return s3q0.a;
            case 3:
                int i5 = ArticlePickerFragment.V;
                UserId userId = (UserId) ((ArticlePickerFragment) obj2).requireArguments().getParcelable("user_id_article");
                return userId == null ? UserId.d : userId;
            case 4:
                com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) obj2;
                aVar.getClass();
                GraffitiFragment graffitiFragment = new GraffitiFragment();
                Bundle bundle = new Bundle();
                String str = aVar.T;
                if (str != null) {
                    bundle.putString("graffiti_avatar", str);
                }
                String str2 = aVar.U;
                if (str2 != null) {
                    bundle.putString("graffiti_title", str2);
                }
                graffitiFragment.setArguments(bundle);
                return graffitiFragment;
            case 5:
                return ((AvatarView) obj2).m.f();
            case 6:
                j96 j96Var = (j96) obj2;
                return new p5m0((Activity) j96Var.c.invoke(), (u76) j96Var.e.invoke(), j96Var.getStickersDrawingView(), ((psj0) j96Var.i.getValue()).e());
            case 7:
                int i6 = BiometricsLockSecuritySetupFragment.W;
                return ((BiometricAuthComponent) ((k7m) m7m.f((BiometricsLockSecuritySetupFragment) obj2)).mo408a(fpf0.a(BiometricAuthComponent.class))).Y6();
            case 8:
                df7 df7Var = (df7) obj2;
                u1c0 j6 = df7Var.j6();
                NewsEntry newsEntry = j6 != null ? j6.a : null;
                if (newsEntry == null) {
                    newsEntry = null;
                }
                if (newsEntry == null) {
                    newsEntry = df7Var.p;
                }
                if (epx.f(newsEntry != null ? Boolean.valueOf(newsEntry.e) : null, Boolean.FALSE) && !jjc.b()) {
                    u1c0 J0 = df7Var.J0();
                    int i7 = J0 != null ? J0.k : 0;
                    ?? q6 = df7Var.q6();
                    if (q6 != 0 && (s980Var = df7Var.y) != 0) {
                        s980Var.d9(q6, df7Var.t6(), PostActions.ACTION_IGNORE.h(), i7);
                    }
                }
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr = BookingCalendarScreenFragment.U;
                Bundle requireArguments = ((BookingCalendarScreenFragment) obj2).requireArguments();
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
            case 10:
                return CallModuleImpl.b((CallModuleImpl) obj2);
            case 11:
                CameraUIView cameraUIView = (CameraUIView) obj2;
                gm9 gm9Var = cameraUIView.B;
                gm9Var.I = cameraUIView.i0;
                gm9Var.J = cameraUIView.h0;
                gm9Var.K = cameraUIView.w0;
                gm9Var.L = cameraUIView.p0;
                gm9Var.M = cameraUIView.q0;
                gm9Var.r = cameraUIView.o0;
                gm9Var.E = cameraUIView.j0;
                gm9Var.D = cameraUIView.k0;
                MasksWrap masksWrap = cameraUIView.b0;
                gm9Var.s = masksWrap != null ? masksWrap.getMasksView() : null;
                MasksWrap masksWrap2 = cameraUIView.b0;
                gm9Var.o = masksWrap2 != null ? masksWrap2.getAuthorActionHolder() : null;
                gm9Var.F = cameraUIView.f0;
                gm9Var.a0 = cameraUIView.c1;
                gm9Var.N = cameraUIView.u0;
                gm9Var.U = cameraUIView.P0;
                QrScannerUi qrScannerUi = cameraUIView.Q0;
                if (qrScannerUi != null) {
                    qrScannerUi.f(gm9Var);
                }
                gm9Var.V();
                gm9Var.b();
                gm9Var.a();
                gm9Var.d();
                cameraUIView.requestFocus();
                bwt0.o(cameraUIView, new defpackage.i(cameraUIView, 12));
                return s3q0.a;
            case 12:
                ChannelFragment channelFragment = (ChannelFragment) obj2;
                int i8 = ChannelFragment.a1;
                return new gza(channelFragment.kn(), channelFragment.N0, (ImageViewer) channelFragment.k0.getValue(), new defpackage.g(channelFragment, 16));
            case 13:
                com.vk.im.design.view.pagination.pin.b bVar = ((m8b) obj2).s;
                if (bVar != null && (view = bVar.getView()) != null) {
                    context = view.getContext();
                }
                if (context != null) {
                    return new com.vk.im.ui.formatters.a(context);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 14:
                io.reactivex.rxjava3.disposables.c cVar = ((cxb) obj2).x.j;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 15:
                q0c q0cVar = (q0c) ((r0c) obj2).a;
                if (q0cVar != null) {
                    q0cVar.e();
                }
                return s3q0.a;
            case 16:
                return ((StoryViewerComponent) ((k7m) m7m.f((qkc) obj2)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 17:
                ClipCtaWithDonutFragment clipCtaWithDonutFragment = (ClipCtaWithDonutFragment) obj2;
                qcy<Object>[] qcyVarArr2 = ClipCtaWithDonutFragment.T;
                return new upc(new dpc(clipCtaWithDonutFragment.eo().b, clipCtaWithDonutFragment.eo().c, clipCtaWithDonutFragment.eo().d.b, clipCtaWithDonutFragment.eo().d.c, clipCtaWithDonutFragment.eo().d.d, clipCtaWithDonutFragment.eo().e, (q7v0) clipCtaWithDonutFragment.P.getValue(), clipCtaWithDonutFragment.eo().d.e, clipCtaWithDonutFragment.eo().d.f, clipCtaWithDonutFragment.eo().h, clipCtaWithDonutFragment.eo().i), new m3a(new ngj0()), (lbk) clipCtaWithDonutFragment.Q.getValue());
            case 18:
                int i9 = ClipFeedListFragment.a2;
                return ((ClipsExternalNpsComponent) ((ClipFeedListFragment) obj2).W.getValue()).Id();
            case 19:
                s1d s1dVar = (s1d) obj2;
                return new ph5(new du0(i2, s1dVar, "clip_mvi_item_vh" + s1dVar.hashCode()), s1dVar, new ka(s1dVar, 20));
            case 20:
                sbd sbdVar = (sbd) obj2;
                if (sbdVar.b7()) {
                    d3m.c(sbdVar.E, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
            case 21:
                return ((ClipsAttachmentsComponent) obj2).Hd();
            case 22:
                return ((hyd) obj2).i().findViewById(R.id.fullscreen_editor_title);
            case 23:
                int i10 = ClipsEntryPointsFragment.i0;
                return ((ClipsTemplatesEditorComponent) m7m.d((ClipsEntryPointsFragment) obj2).a(fpf0.a(ClipsTemplatesEditorComponent.class))).l4();
            case 24:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj2;
                String str3 = ClipsUploadFragmentImpl.a0;
                return new gjf(new ovu(clipsUploadFragmentImpl.requireContext()), clipsUploadFragmentImpl.fo().c());
            case 25:
                return new xkj(((ujg) obj2).a);
            case 26:
                return new oo((g9h.a) obj2, 28);
            case 27:
                return new qih(((cih) obj2).d);
            case 28:
                return ((CommunityReviewsView) obj2).f;
            default:
                CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) obj2;
                int i11 = CommunitySuggestionsFragment.X;
                return c7h.a(((CommunitySubscriptionComponent) m7m.d(communitySuggestionsFragment).mo408a(fpf0.a(CommunitySubscriptionComponent.class))).D6(), communitySuggestionsFragment.requireContext(), communitySuggestionsFragment, (b3i) communitySuggestionsFragment.T.getValue(), null, new CommunitySuggestionsFragment.d(2, communitySuggestionsFragment, CommunitySuggestionsFragment.class, "updateGroupSubscriptionState", "updateGroupSubscriptionState(Lcom/vk/dto/common/id/UserId;I)V", 0), 8);
        }
    }
}
