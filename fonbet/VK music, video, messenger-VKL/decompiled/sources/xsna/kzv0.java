package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.clips.config.viewers.api.experiments.models.ClipsRtmpLivePlaybackSettings;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.donut.video.subscription.api.di.DonutSubscriptionVideoComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.quality.QualitySettingsInterval;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.offline.settings.api.di.VideoOfflineSettingsComponent;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import com.vk.permission.PermissionHelper;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.upload.api.router.PublishArguments;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.InitializedLazyImpl;
import kotlin.Pair;
import xsna.adt0;
import xsna.e6s0;
import xsna.eeu0;
import xsna.h7u0;
import xsna.kkt0;
import xsna.w0s0;
import xsna.w6s0;

/* compiled from: VkVideoBridge.kt */
/* loaded from: classes11.dex */
public final class kzv0 extends mq6 implements w8i {
    public final gr6 f;
    public final tq6 g;
    public final bpn0 h;
    public final bpn0 i;
    public final ezs0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final b1s0 u;

    /* compiled from: VkVideoBridge.kt */
    /* loaded from: classes7.dex */
    public static final class a implements wzs<DialogInterface, CharSequence, s3q0> {
        public final /* synthetic */ Activity b;
        public final /* synthetic */ UserId c;
        public final /* synthetic */ int d;

        public a(Activity activity, UserId userId, int i) {
            this.b = activity;
            this.c = userId;
            this.d = i;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(DialogInterface dialogInterface, CharSequence charSequence) {
            new hp0(this.b, this.c, charSequence.toString(), this.d).a();
            return s3q0.a;
        }
    }

    public kzv0(gr6 gr6Var, tq6 tq6Var, gek gekVar, bpn0 bpn0Var) {
        super(gekVar, bpn0Var);
        ezs0 c0t0Var;
        this.f = gr6Var;
        this.g = tq6Var;
        this.h = new bpn0(new bia(this, 11));
        this.i = new bpn0(new dia(this, 11));
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_OFFLINE_MANAGER;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            c0t0Var = new ozs0(new InitializedLazyImpl(((VideoOfflineSettingsComponent) ((k7m) m7m.f(this)).a(fpf0.a(VideoOfflineSettingsComponent.class))).re()), new InitializedLazyImpl(((DonutSubscriptionVideoComponent) ((k7m) m7m.f(this)).a(fpf0.a(DonutSubscriptionVideoComponent.class))).c5()), new nzv0(this));
        } else {
            c0t0Var = new c0t0(new InitializedLazyImpl(((VideoOfflineSettingsComponent) ((k7m) m7m.f(this)).a(fpf0.a(VideoOfflineSettingsComponent.class))).re()), new InitializedLazyImpl(((DonutSubscriptionVideoComponent) ((k7m) m7m.f(this)).a(fpf0.a(DonutSubscriptionVideoComponent.class))).c5()), new ozv0(this));
        }
        this.j = c0t0Var;
        this.k = new bpn0(new k03(22));
        this.l = new bpn0(new rb8(this, 8));
        this.m = new bpn0(new jb3(this, 10));
        this.n = new bpn0(new kb3(16));
        this.o = new bpn0(new q57(17));
        this.p = new bpn0(new uy2(this, 13));
        this.q = new bpn0(new ap(this, 7));
        this.r = new bpn0(new bp(this, 8));
        this.s = new bpn0(new m15(this, 14));
        this.t = new bpn0(new cia(this, 14));
        this.u = new b1s0();
        dst0 dst0Var = dst0.a;
        if (bps0.a != dst0Var) {
            bps0.a = dst0Var;
        }
    }

    @Override // xsna.g7s0
    public final void A(Activity activity, VideoFile videoFile) {
        kkt0 a2 = kkt0.a.a(videoFile, activity, (CameraClipsComponent) this.t.getValue());
        if (a2 != null) {
            a2.b();
        }
    }

    @Override // xsna.g7s0
    public final String D(String str) {
        return drm0.g0(str, "video", str);
    }

    @Override // xsna.g7s0
    public final dot0 E() {
        return (com.vk.libvideo.upload.impl.b) this.l.getValue();
    }

    @Override // xsna.g7s0
    public final void F(ContextWrapper contextWrapper, VideoFile videoFile, boolean z, String str, String str2) {
        w1s0.l(contextWrapper, videoFile, str, str2, z, 80);
    }

    @Override // xsna.g7s0
    public final void G(String str, w0s0.a aVar) {
        ((cf1) this.o.getValue()).a(str, aVar);
    }

    @Override // xsna.g7s0
    public final void H(Activity activity, VideoFile videoFile, boolean z, com.vk.movika.sdk.base.ui.s sVar) {
        ekc0 ekc0Var = new ekc0(activity, R.string.video_date_picker_title);
        ekc0Var.a(new y4v(sVar, videoFile, z));
        SimpleTimeZone simpleTimeZone = pvo0.a;
        xuo0.a.getClass();
        ckc0.c(ekc0Var, new Date(TimeUnit.SECONDS.toMillis(videoFile.k1())), null, new Date(TimeUnit.DAYS.toMillis(90L) + xuo0.a()), 2);
    }

    @Override // xsna.g7s0
    public final Pair<String, dcn> I() {
        return ((cf1) this.o.getValue()).c();
    }

    @Override // xsna.g7s0
    public final fks0 J() {
        return (qks0) this.n.getValue();
    }

    @Override // xsna.g7s0
    public final void K(Context context, String str, boolean z, long j, gzs gzsVar) {
        bpn0 bpn0Var = this.q;
        if (((mos0) bpn0Var.getValue()).b(true)) {
            ((mos0) bpn0Var.getValue()).a(context, new VideoGrowthVideoParams(str, j, false, false, 8, null), (r14 & 4) != 0 ? false : z, (r14 & 8) == 0, (r14 & 16) == 0, new lzv0(gzsVar));
        } else {
            gzsVar.invoke();
        }
    }

    @Override // xsna.g7s0
    public final void L(VideoFile videoFile, VideoScreenMode videoScreenMode) {
        this.j.F(videoFile, videoScreenMode);
    }

    @Override // xsna.g7s0
    public final void M(Activity activity, VideoFile videoFile) {
        f5k0 f5k0Var = (f5k0) this.s.getValue();
        gpt0 gpt0Var = gpt0.a;
        f5k0Var.a(activity, new SmartCropArguments(gpt0.G(videoFile), SmartCropArguments.EntryPoint.VIDEO_BOTTOM_SHEET));
    }

    @Override // xsna.g7s0
    public final void O() {
        pla.e().b().b(HintId.INFO_LIVE_BUBBLE_SWIPE.getId());
    }

    @Override // xsna.g7s0
    @SuppressLint({"CheckResult"})
    public final void P(Context context, VideoFile videoFile) {
        rsg0.y0(new oct0(videoFile.I0(), Integer.valueOf(videoFile.o0())), null, null, 3).subscribe(new mlu0(new ght0(1, videoFile), 2), new e7q0(new cae(context, 3), 10));
    }

    @Override // xsna.g7s0
    public final l1t0 Q() {
        return this.g;
    }

    @Override // xsna.g7s0
    public final void S(Context context, VideoFile videoFile) {
        Activity h = e3m.h(context);
        if (h == null) {
            cvk.u(R.string.error, false);
        } else {
            ((jcq0) this.r.getValue()).a(xa4.L(h), new PublishArguments.Edit(videoFile.a1(), null, 2, null));
        }
    }

    @Override // xsna.g7s0
    public final anz T() {
        return (gnz) this.m.getValue();
    }

    @Override // xsna.g7s0
    public final void U() {
        pla.e().b().b(HintId.INFO_VIDEO_BACKGROUND_PLAY.getId());
    }

    @Override // xsna.g7s0
    public final void V(Context context, Uri uri, VideoPublicationContext videoPublicationContext, int i) {
        Activity h = e3m.h(context);
        if (h == null || ((dag0) com.vk.core.files.a.h.getValue()).c(uri).length() == 0) {
            cvk.u(R.string.error, false);
        } else {
            if (i <= 0) {
                ((jcq0) this.r.getValue()).a(xa4.L(h), new PublishArguments.Upload(uri, videoPublicationContext, null, 4, null));
                return;
            }
            ver0.c(context, hg1.m(rsg0.y0(yfb.x(new uft0().v(i, videoPublicationContext.q())), null, null, 3), context, 0L, false, 62).subscribe(new y730(new o6i0(10, new jzv0(this, h, uri, videoPublicationContext), this), 25), new c7q0(new epj0(14), 6)));
        }
    }

    @Override // xsna.g7s0
    public final Integer W() {
        return y000.c();
    }

    @Override // xsna.g7s0
    public final ydt0 Y() {
        return this.f;
    }

    @Override // xsna.g7s0
    public final void Z(Context context, String str, boolean z) {
        i0w0 i0w0Var = i0w0.b;
        i0w0.b(context, str, z);
    }

    @Override // xsna.g7s0
    public final void a() {
        this.j.a();
    }

    @Override // xsna.g7s0
    public final void a0(Activity activity, UserId userId, String str, String str2, String str3, String str4) {
        if (q6r0.f().e(m6r0.d0)) {
            com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(str4, str3);
            aVar.f(xa4.q());
            aVar.g(StoryCameraMode.LIVE);
            aVar.q(userId, str, str2);
            aVar.C(activity);
        }
    }

    @Override // xsna.g7s0
    public final boolean c0() {
        return o25.a().d0().Ab();
    }

    @Override // xsna.g7s0
    public final void d0(Context context, izs<? super adt0.a, adt0> izsVar) {
        adt0 invoke = izsVar.invoke(new adt0.a());
        int i = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K("video");
        a2.G(invoke.c().I0());
        a2.F(invoke.c().o0());
        String b = invoke.b();
        if (b != null) {
            a2.M(b);
        }
        String r = invoke.c().r();
        if (r != null) {
            a2.J(r);
        }
        String a3 = invoke.a();
        if (a3 != null) {
            a2.I(a3);
        }
        a2.s(true);
        a2.k(context);
    }

    @Override // xsna.g7s0
    public final void e0(FragmentActivity fragmentActivity, String str, int i, UserId userId, Boolean bool, m960 m960Var, tbe0 tbe0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(i);
        new kkt0(fragmentActivity, new kkt0.b(str, bool, userId, i, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, sb.toString(), 48), (CameraClipsComponent) this.t.getValue(), m960Var, tbe0Var).b();
    }

    @Override // xsna.g7s0
    public final boolean f() {
        return pla.e().b().a(HintId.INFO_LIVE_BUBBLE_SWIPE.getId());
    }

    @Override // xsna.g7s0
    public final boolean f0(s6s0 s6s0Var) {
        if (((qks0) this.n.getValue()).X1()) {
            float f = w6s0.d;
            return w6s0.a.a(s6s0Var);
        }
        int i = e6s0.f;
        return e6s0.a.a(s6s0Var);
    }

    @Override // xsna.g7s0
    public final void g(Context context, VideoAlbum videoAlbum, boolean z) {
        int i = VideoAlbumEditorFragment.l0;
        VideoAlbumEditorFragment.a b = VideoAlbumEditorFragment.b.b(videoAlbum);
        b.y(z);
        b.k(context);
    }

    @Override // xsna.g7s0
    public final void g0(Context context, VideoFile videoFile, UserId userId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        w1s0.i(context, videoFile, userId, new rz7(izsVar, gzsVar, this, userId, videoFile));
    }

    @Override // xsna.g7s0
    public final void h(Context context, final VideoAlbum videoAlbum) {
        final Activity h = e3m.h(context);
        if (h != null) {
            int i = h7u0.p;
            h7u0.a a2 = h7u0.b.a(h);
            a2.g0(R.string.video_alert_title);
            a2.U(R.string.video_playlist_confirm_remove);
            a2.c0(R.string.delete, new DialogInterface.OnClickListener() { // from class: xsna.izv0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    VideoAlbum videoAlbum2 = videoAlbum;
                    kzv0.this.v0(h, videoAlbum2.b, videoAlbum2.c, new mlf0(videoAlbum2, 27));
                }
            });
            a2.W(R.string.cancel, null);
            a2.m();
        }
    }

    @Override // xsna.g7s0
    public final void h0(QualitySettingsType qualitySettingsType) {
        y000.k(qualitySettingsType);
    }

    @Override // xsna.g7s0
    public final void i0(Activity activity, UserId userId, int i) {
        eeu0.a.C2801a n = new h7u0.a(activity).n();
        n.f(R.string.add_video);
        n.e(R.string.attach_link);
        n.b();
        n.c(android.R.string.ok, new a(activity, userId, i), true);
        n.g();
    }

    @Override // xsna.g7s0
    public final void j(Context context, VideoFile videoFile, VideoScreenMode videoScreenMode, boolean z, boolean z2, gzs gzsVar) {
        if (videoFile.F4().j()) {
            g2v.c().l().a(context, new AttachVideo(videoFile, null, null, 0L, null, 0, 0, 0L, 0, 0L, null, null, null, null, null, 32766, null));
            return;
        }
        this.j.w(new ths0(videoFile, videoScreenMode, z2), context, z, gzsVar, new z2d0(this, context, videoFile, 6));
    }

    @Override // xsna.g7s0
    public final ClipsRtmpLivePlaybackSettings j0() {
        return tyx.a().getExperiments().i();
    }

    @Override // xsna.g7s0
    public final boolean k() {
        return !pla.e().b().a(HintId.INFO_VIDEO_BACKGROUND_PLAY.getId());
    }

    @Override // xsna.g7s0
    public final dcn k0(Activity activity, VideoFile videoFile, boolean z, UserId userId, l78 l78Var) {
        String str;
        if (z) {
            str = (String) new ScreenModeVideoStatMapper(((VideoMinimizablePlayerComponent) ((k7m) m7m.f(this)).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3()).b(videoFile, new lft0());
        } else {
            str = "PREVIEW".toLowerCase(Locale.ROOT);
        }
        return f1s0.a(activity, videoFile, z, userId, l78Var, str);
    }

    @Override // xsna.g7s0
    public final void l(Context context, VideoFile videoFile, String str, gzs gzsVar) {
        w1s0.e(context, videoFile, str, null, new xoq0(1, gzsVar));
    }

    @Override // xsna.g7s0
    public final void l0(Context context, VideoFile videoFile, String str, String str2) {
        w1s0.b(context, videoFile, str, str2, null);
    }

    @Override // xsna.g7s0
    public final void m0(Context context, VideoFile videoFile, String str, String str2, wzs<? super Boolean, ? super gmq, s3q0> wzsVar, izs<? super gmq, s3q0> izsVar) {
        enq.g(context, new VideoAttachment(videoFile), new pqq(videoFile.C1(), str, str2, null, 8), wzsVar, izsVar);
    }

    @Override // xsna.g7s0
    public final void n(Context context, UserId userId) {
        int i = VideoAlbumEditorFragment.l0;
        VideoAlbumEditorFragment.b.a(userId).k(context);
    }

    @Override // xsna.g7s0
    public final void n0() {
        io.reactivex.rxjava3.core.x<GetStoriesResponse> b = ((otl0) this.p.getValue()).b(null, false);
        int i = kwg0.a;
        b.subscribe(new iwg0(), new iwg0());
    }

    @Override // xsna.g7s0
    public final boolean o() {
        if (!o25.a().d0().zb()) {
            return false;
        }
        sr10 sr10Var = dy2.a;
        return sr10Var != null ? sr10Var.h() : true;
    }

    @Override // xsna.g7s0
    public final boolean o0() {
        return BuildInfo.q();
    }

    @Override // xsna.g7s0
    public final QualitySettingsType p0() {
        return y000.e();
    }

    @Override // xsna.g7s0
    public final void q(Context context, UserId userId, boolean z) {
        int i = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        if (z) {
            a2.K("community");
            a2.C(userId);
        } else {
            a2.K("user");
            a2.L(userId);
        }
        a2.s(true);
        a2.k(context);
    }

    @Override // xsna.g7s0
    public final void q0(QualitySettingsType qualitySettingsType) {
        y000.m(qualitySettingsType);
    }

    @Override // xsna.g7s0
    public final boolean r() {
        return Preference.j().getBoolean("video_background", true);
    }

    @Override // xsna.g7s0
    public final void r0(String str) {
        ((cf1) this.o.getValue()).b(str);
    }

    @Override // xsna.g7s0
    public final ezs0 s() {
        return this.j;
    }

    @Override // xsna.g7s0
    public final boolean s0() {
        return q6r0.f().e(m6r0.e0);
    }

    @Override // xsna.g7s0
    public final void t(VideoUploadFragment videoUploadFragment) {
        Intent intent = new Intent(videoUploadFragment.mo2getContext(), (Class<?>) PhotoVideoAttachActivity.class);
        intent.putExtra("media_type", 333);
        intent.putExtra("single_mode", true);
        intent.putExtra("request_code", IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD);
        videoUploadFragment.startActivityForResult(intent, IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD);
    }

    @Override // xsna.g7s0
    public final QualitySettingsType t0() {
        return y000.d();
    }

    @Override // xsna.g7s0
    public final boolean u() {
        return BuildInfo.t();
    }

    @Override // xsna.g7s0
    public final o0t0 u0() {
        return (p0t0) this.k.getValue();
    }

    @Override // xsna.g7s0
    public final void v(VideoUploadFragment videoUploadFragment) {
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentActivity activity = videoUploadFragment.getActivity();
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, activity, PermissionHelper.t, R.string.vk_permissions_intent_video, R.string.vk_permissions_intent_video_settings, new h8n0(videoUploadFragment, 17), new z4t0(videoUploadFragment, 6), 64);
    }

    @Override // xsna.g7s0
    @SuppressLint({"CheckResult"})
    public final void v0(Context context, int i, UserId userId, gzs<s3q0> gzsVar) {
        hg1.m(rsg0.y0(new tm4(userId, i), null, null, 3), context, 0L, false, 62).subscribe(new qgs0(new kho0(1, gzsVar), 4), new hrt0(new n0w(context, 3), 5));
    }

    @Override // xsna.g7s0
    public final void w(int i) {
        y000.j(i);
    }

    @Override // xsna.g7s0
    public final QualitySettingsInterval w0() {
        return y000.b();
    }

    @Override // xsna.g7s0
    public final void y(Context context, VideoFile videoFile, int i) {
        int i2 = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K("video_comment");
        a2.G(videoFile.I0());
        a2.F(i);
        a2.s(true);
        a2.k(context);
    }

    @Override // xsna.g7s0
    public final QualitySettingsType z() {
        return y000.f();
    }
}
