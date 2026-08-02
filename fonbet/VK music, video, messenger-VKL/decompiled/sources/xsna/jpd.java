package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.cameraui.widgets.ClipsProgressView;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.camera.CameraObject$CameraMode;
import com.vk.media.ok.recording.GesturedRecording;
import com.vk.media.ok.utils.DuetAction;
import com.vk.media.recorder.RecorderBase;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCameraItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeMaskChoose;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import xsna.am9;
import xsna.bld;
import xsna.bm9;
import xsna.gbr;
import xsna.h7u0;
import xsna.mpo;
import xsna.rgd;

/* compiled from: ClipsDelegate.kt */
/* loaded from: classes16.dex */
public final class jpd implements wsi {
    public final Object A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public final eqo<mpo> H;
    public final vq3 I;
    public final com.vk.cameraui.impl.a b;
    public final CameraUIView c;
    public final vm9 d;
    public final dm9 e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final bpn0 g;
    public final io.reactivex.rxjava3.disposables.b h;
    public final wud i;
    public final lsd j;
    public final atd k;
    public final o9f l;
    public final bld m;
    public ArrayList<Long> n;
    public io.reactivex.rxjava3.disposables.c o;
    public io.reactivex.rxjava3.disposables.c p;
    public final ArrayList q;
    public boolean r;
    public int s;
    public final h1e t;
    public boolean u;
    public boolean v;
    public final zkd w;
    public final StoryCameraParams x;
    public final iod y;
    public final rgd z;

    /* compiled from: ClipsDelegate.kt */
    public final class a implements bld.a {
        public a() {
        }

        @Override // xsna.bld.a
        public final void a() {
            zd9 camera1View = jpd.this.c.getCamera1View();
            if (camera1View != null) {
                if (camera1View.q != ((int) camera1View.getDesiredCameraFps())) {
                    camera1View.L();
                }
            }
        }

        @Override // xsna.bld.a
        public final void b(boolean z) {
            jpd.this.c.setCameraGridVisible(z);
        }
    }

    /* compiled from: ClipsDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraObject$CameraMode.values().length];
            try {
                iArr[CameraObject$CameraMode.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jpd(com.vk.cameraui.impl.a aVar, CameraUIView cameraUIView, vm9 vm9Var, dm9 dm9Var) {
        this.b = aVar;
        this.c = cameraUIView;
        this.d = vm9Var;
        this.e = dm9Var;
        bpn0 bpn0Var = new bpn0(new hd(this, 19));
        this.g = bpn0Var;
        this.h = new io.reactivex.rxjava3.disposables.b();
        this.i = new wud(cameraUIView);
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        lsd lsdVar = new lsd(cameraUIView, aVar, this, new kpd(i3, (vkd) bpn0Var.getValue(), vkd.class, "buildDraftAnalyticsItem", "buildDraftAnalyticsItem(Lcom/vk/stat/scheme/MobileOfficialAppsClipsStat$TypeClipDraft;)V", i, i2));
        this.j = lsdVar;
        this.k = new atd(cameraUIView, aVar, this, lsdVar, ((ClipsViewerComponent) dm9Var.m.getValue()).pe(), new lpd(i3, (vkd) bpn0Var.getValue(), vkd.class, "buildDraftAnalyticsItem", "buildDraftAnalyticsItem(Lcom/vk/stat/scheme/MobileOfficialAppsClipsStat$TypeClipDraft;)V", i, i2));
        this.l = new o9f(cameraUIView, this);
        this.m = new bld(new a());
        this.n = new ArrayList<>();
        this.q = new ArrayList();
        cameraUIView.getContext();
        this.t = new h1e(vm9Var, o25.a());
        this.u = true;
        this.w = new zkd(dm9Var.d().w0().h(), cameraUIView.getContext());
        this.x = aVar.c;
        this.y = new iod(cameraUIView, aVar, this);
        this.z = new rgd(cameraUIView.getContext(), new rgd.a(cameraUIView, aVar, dm9Var, this));
        this.A = msy.a(LazyThreadSafetyMode.NONE, new de4(7));
        this.D = true;
        this.H = new eqo<>(cameraUIView.getContext(), DynamicTask.FILTERS, new opo(cameraUIView.getContext(), null, null, null, false, new npo()), ((eig) dm9Var.j()).f, ((eig) dm9Var.j()).g);
        this.I = new vq3(this, 4);
    }

    public static void k(jpd jpdVar, bm9.a aVar, int i) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        boolean z = (i & 2) == 0;
        com.vk.cameraui.impl.a aVar2 = (com.vk.cameraui.impl.a) jpdVar.d.c;
        com.vk.cameraui.impl.a aVar3 = jpdVar.b;
        boolean z2 = aVar != null;
        boolean z3 = aVar != null && aVar.a;
        boolean z4 = aVar3.i.e;
        if (z4 || !z2) {
            if (!z4 || z3) {
                if (!jpdVar.C || z3) {
                    if (jpdVar.i.b - jpdVar.G < 300) {
                        jpdVar.o();
                    } else {
                        if (!aVar3.q0()) {
                            L.G("recording is not available");
                            return;
                        }
                        jpdVar.r = true;
                        iod iodVar = jpdVar.y;
                        boolean z5 = iodVar.f;
                        bpn0 bpn0Var = iodVar.i;
                        if (!z5 || z || z2) {
                            r(jpdVar, 3);
                            jpdVar.x(z2);
                        } else {
                            int i2 = iodVar.e;
                            if (i2 != 0) {
                                com.vk.cameraui.impl.a aVar4 = iodVar.c;
                                aVar4.i.W = true;
                                iodVar.d.u(false);
                                CameraUIView cameraUIView = iodVar.b;
                                cameraUIView.setCountDownLayoutVisible(true);
                                iodVar.h = i2;
                                iodVar.l.run();
                                long j = i2 * 1000;
                                if ((((AudioManager) bpn0Var.getValue()).getStreamVolume(3) * 100) / ((AudioManager) bpn0Var.getValue()).getStreamMaxVolume(3) > 0) {
                                    j += 1000;
                                }
                                kme.a("clips_start_timer");
                                aVar4.h.c(StoryPublishEvent.CLIPS_START_TIMER, null);
                                cameraUIView.setStopwatchTime(i2);
                                ViewGroup viewGroup = cameraUIView.K0;
                                (viewGroup != null ? viewGroup : null).setVisibility(0);
                                StopwatchView stopwatchView = cameraUIView.M0;
                                if (stopwatchView != null) {
                                    stopwatchView.c.add(iodVar);
                                }
                                StopwatchView stopwatchView2 = cameraUIView.M0;
                                if (stopwatchView2 != null) {
                                    stopwatchView2.b();
                                }
                                ((Handler) iodVar.j.getValue()).postDelayed(iodVar.k, j);
                            } else {
                                rdi.E();
                            }
                        }
                    }
                }
                jpdVar.B = false;
            } else {
                jpdVar.r = false;
                jpdVar.y(z2);
                jpdVar.B = false;
                aVar2.I0();
            }
        } else if (!aVar3.q0()) {
            L.G("recording is not available");
            return;
        } else {
            jpdVar.B = true;
            aVar2.U(RecorderBase.RecordingType.CLIP, new nm9(false, true, aVar2, true, true, false));
        }
        System.currentTimeMillis();
    }

    public static void r(jpd jpdVar, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) == 0;
        iod iodVar = jpdVar.y;
        o9f o9fVar = jpdVar.l;
        o9fVar.d = 0;
        o9fVar.e = 3;
        if (z2) {
            jpdVar.b.h.c(StoryPublishEvent.CLIPS_CANCEL_TIMER_SETTINGS, null);
        }
        if (jpdVar.s != 0 && z && !z2) {
            CameraUIView cameraUIView = jpdVar.c;
            baf bafVar = cameraUIView.H;
            bafVar.getClass();
            qj80.a(cameraUIView, new y9f(cameraUIView, bafVar, cameraUIView));
        }
        iodVar.i(0, z ? false : iodVar.f, z ? 0 : null);
    }

    public static void v(jpd jpdVar, StoryMusicInfo storyMusicInfo) {
        rgd rgdVar = jpdVar.z;
        if (storyMusicInfo != null) {
            rgdVar.a(hxd.a(StoryMusicInfo.zb(storyMusicInfo, null, 0, 0, null, 0, 8127)));
        } else {
            rgdVar.b();
        }
    }

    public final void A(MaskLight maskLight, boolean z) {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        vkd vkdVar = (vkd) this.g.getValue();
        MobileOfficialAppsClipsStat$TypeMaskChoose mobileOfficialAppsClipsStat$TypeMaskChoose = new MobileOfficialAppsClipsStat$TypeMaskChoose(z ? MobileOfficialAppsClipsStat$TypeMaskChoose.EventType.MASK_ON : MobileOfficialAppsClipsStat$TypeMaskChoose.EventType.MASK_OFF, maskLight.b, maskLight.c.b, maskLight.d);
        kbk context = vkdVar.a.getContext();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        int i = context != null ? context.b : -1;
        if (context == null || (creationEntryPoint = context.a) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        new xkd(c, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipCameraItem(new MobileOfficialAppsClipsStat$ClipsCreateContext(i, creationEntryPoint), MobileOfficialAppsClipsStat$TypeClipCameraItem.Type.TYPE_MASK_CHOOSE, null, mobileOfficialAppsClipsStat$TypeMaskChoose, 4, null), 3)).q();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B() {
        boolean z;
        lmv clipsControls;
        lmv clipsControls2;
        lmv clipsControls3;
        lmv clipsControls4;
        boolean z2;
        bm9 presenter;
        bm9 presenter2;
        an9 state;
        an9 state2;
        boolean z3 = this.C;
        CameraUIView cameraUIView = this.c;
        if (!z3 && this.q.isEmpty() && !cameraUIView.W()) {
            an9 an9Var = this.b.i;
            if (!an9Var.X && !an9Var.M) {
                z = true;
                clipsControls = cameraUIView.getClipsControls();
                if (clipsControls != null) {
                    clipsControls.q0(z, true);
                }
                clipsControls2 = cameraUIView.getClipsControls();
                if (clipsControls2 != null) {
                    clipsControls2.u1(this.x.x0);
                }
                clipsControls3 = cameraUIView.getClipsControls();
                if (clipsControls3 != null) {
                    clipsControls3.Y0(z, true);
                }
                clipsControls4 = cameraUIView.getClipsControls();
                if (clipsControls4 != null) {
                    clipsControls4.setTimerButtonEnabled(this.i.b - this.G > 300);
                }
                z2 = !this.C;
                presenter = cameraUIView.getPresenter();
                if (presenter == null && (state2 = presenter.getState()) != null && state2.h() == z2) {
                    return;
                }
                presenter2 = cameraUIView.getPresenter();
                if (presenter2 != null && (state = presenter2.getState()) != null) {
                    state.l(z2);
                }
                cameraUIView.B.l();
            }
        }
        z = false;
        clipsControls = cameraUIView.getClipsControls();
        if (clipsControls != null) {
        }
        clipsControls2 = cameraUIView.getClipsControls();
        if (clipsControls2 != null) {
        }
        clipsControls3 = cameraUIView.getClipsControls();
        if (clipsControls3 != null) {
        }
        clipsControls4 = cameraUIView.getClipsControls();
        if (clipsControls4 != null) {
        }
        z2 = !this.C;
        presenter = cameraUIView.getPresenter();
        if (presenter == null) {
        }
        presenter2 = cameraUIView.getPresenter();
        if (presenter2 != null) {
            state.l(z2);
        }
        cameraUIView.B.l();
    }

    public final void C(Integer num) {
        int b2;
        lmv clipsControls = this.c.getClipsControls();
        if (clipsControls != null) {
            if (num != null) {
                b2 = num.intValue();
            } else {
                nsd nsdVar = fvr.c;
                b2 = nsdVar != null ? nsdVar.b() : (int) Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref");
            }
            clipsControls.S0(b2);
        }
    }

    @Override // xsna.wsi, xsna.qdc0
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        this.h.b(cVar);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(File file, StoryMusicInfo storyMusicInfo, gbr.a aVar, MaskLight maskLight, final long j, float f, boolean z) {
        io.reactivex.rxjava3.core.x k;
        CameraUIView cameraUIView = this.c;
        zd9 camera1View = cameraUIView.getCamera1View();
        if (camera1View != null) {
            camera1View.setPreferredVideoRecordQuality(new MediaUtils.g(aVar.a, aVar.b));
        }
        int i = (int) (aVar.e / f);
        zd9 camera1View2 = cameraUIView.getCamera1View();
        CameraObject$CameraMode currentMode = camera1View2 != null ? camera1View2.getCurrentMode() : null;
        final ClipVideoItem clipVideoItem = new ClipVideoItem(file.getAbsolutePath(), aVar.e, null, storyMusicInfo, maskLight, j, f, 0, i, null, (currentMode == null ? -1 : b.$EnumSwitchMapping$0[currentMode.ordinal()]) == 1 ? TranscodingState.CAMERA_FRONT : TranscodingState.CAMERA_BACK, z, null, false, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 258692, null);
        L.p("ClipsDelegate", "addVideoFile, file=" + file.getName() + ", duration=" + aVar.e + ", musicShift=" + j);
        if (j >= 0 || aVar.e + j < 300) {
            k = io.reactivex.rxjava3.core.x.k(clipVideoItem);
        } else {
            final File e = PrivateFiles.e(e8r.a, PrivateSubdir.CLIPS_CAMERA, null, "mp4", 24);
            k = new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.ipd
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v4, types: [int] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    MediaMetadataRetriever mediaMetadataRetriever;
                    ClipVideoItem clipVideoItem2 = ClipVideoItem.this;
                    String str = clipVideoItem2.b;
                    Context context = e43.a;
                    MediaMetadataRetriever mediaMetadataRetriever2 = 0;
                    MediaMetadataRetriever mediaMetadataRetriever3 = null;
                    Context context2 = context != null ? context : null;
                    File file2 = new File(str);
                    long j2 = -j;
                    File file3 = e;
                    ant0.b(context2, file2, file3, j2, -1L);
                    String absolutePath = file3.getAbsolutePath();
                    try {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        mediaMetadataRetriever.setDataSource(absolutePath);
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                        r4 = extractMetadata != null ? Long.parseLong(extractMetadata) : 0L;
                        mediaMetadataRetriever.release();
                    } catch (Exception e3) {
                        e = e3;
                        mediaMetadataRetriever3 = mediaMetadataRetriever;
                        e.toString();
                        if (mediaMetadataRetriever3 != null) {
                            mediaMetadataRetriever3.release();
                        }
                        mediaMetadataRetriever2 = (int) r4;
                        L.p("ClipsDelegate", "addVideoFile, trimmed file = " + file3.getName() + ", trimmed duration=" + ((int) mediaMetadataRetriever2));
                        Regex regex = com.vk.core.files.a.a;
                        vhk0.c(str);
                        return ClipVideoItem.a(clipVideoItem2, file3.getAbsolutePath(), mediaMetadataRetriever2, mediaMetadataRetriever2, null, 261852);
                    } catch (Throwable th2) {
                        th = th2;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        if (mediaMetadataRetriever2 != 0) {
                            mediaMetadataRetriever2.release();
                        }
                        throw th;
                    }
                    mediaMetadataRetriever2 = (int) r4;
                    L.p("ClipsDelegate", "addVideoFile, trimmed file = " + file3.getName() + ", trimmed duration=" + ((int) mediaMetadataRetriever2));
                    Regex regex2 = com.vk.core.files.a.a;
                    vhk0.c(str);
                    return ClipVideoItem.a(clipVideoItem2, file3.getAbsolutePath(), mediaMetadataRetriever2, mediaMetadataRetriever2, null, 261852);
                }
            }), new com.vk.movika.sdk.base.flow.binding.c(new defpackage.b0(9, e, clipVideoItem), 13));
        }
        zi9 zi9Var = (zi9) this.A.getValue();
        zi9Var.getClass();
        io.reactivex.rxjava3.internal.operators.single.y l = new io.reactivex.rxjava3.internal.operators.single.r(k, new iw3(new com.vk.movika.sdk.base.observable.q(zi9Var, 11), 2)).l(new yh1(new com.vk.movika.sdk.base.observable.s(8), 4));
        asu0.a.getClass();
        this.o = l.q(asu0.i()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cw(new w5(this, 20), 11));
    }

    public final void c() {
        an9 state;
        an9 state2;
        boolean z = !this.C;
        CameraUIView cameraUIView = this.c;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter == null || (state2 = presenter.getState()) == null || state2.h() != z) {
            bm9 presenter2 = cameraUIView.getPresenter();
            if (presenter2 != null && (state = presenter2.getState()) != null) {
                state.l(z);
            }
            cameraUIView.B.l();
        }
        cameraUIView.x(this.b.i.n);
        cameraUIView.setShutterPosition(true);
        cameraUIView.getPositions().d();
    }

    public final d9f d() {
        return ((ClipsTemplatesEditorComponent) this.e.n.getValue()).l4();
    }

    @Override // xsna.wsi
    public final void dispose() {
        this.h.e();
        this.z.c();
    }

    public final ArrayList e() {
        ArrayList arrayList = this.q;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(w0e.c((ClipVideoItem) it.next()));
        }
        return arrayList2;
    }

    public final void g() {
        hg1.f(this.p);
        this.p = hg1.h(d().d(TemplatesFlowScreen.CAMERA).A(200L, TimeUnit.MILLISECONDS).a0(asu0.a.d()), new l5(this, 21));
    }

    public final void h() {
        if (this.b.i.p) {
            return;
        }
        StoryCameraParams storyCameraParams = this.x;
        boolean z = storyCameraParams.y0;
        if (o25.a().b() && z && storyCameraParams.o != StoryCameraTarget.CLIP_FRAGMENT) {
            lsd lsdVar = this.j;
            lsdVar.getClass();
            ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
            v9 v9Var = new v9(lsdVar, 23);
            clipsDraftPersistentStore.getClass();
            ClipsDraftPersistentStore.o(v9Var);
            return;
        }
        CameraUIView cameraUIView = this.c;
        cameraUIView.m();
        h7u0.a aVar = new h7u0.a(cameraUIView.getContext());
        aVar.U(R.string.clips_remove_all_fragments_and_exit);
        aVar.c0(R.string.delete, new epd(this, 0));
        aVar.W(R.string.cancel, new o1c());
        aVar.a0(new fpd(this, 0));
        aVar.m();
    }

    public final void i(File file, MaskLight maskLight, long j, float f) {
        CameraUIView cameraUIView = this.c;
        s(false);
        Regex regex = com.vk.core.files.a.a;
        if (!vhk0.g(file)) {
            s(true);
            this.C = false;
            return;
        }
        try {
            gbr.a b2 = gbr.b(cameraUIView.getContext(), Uri.fromFile(file), false);
            float f2 = b2.e / f;
            ClipsProgressView clipsProgressView = cameraUIView.G0;
            StoryMusicInfo storyMusicInfo = null;
            if (clipsProgressView == null) {
                clipsProgressView = null;
            }
            clipsProgressView.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            clipsProgressView.o.add(Float.valueOf(f2));
            clipsProgressView.p += f2;
            clipsProgressView.invalidate();
            this.s = 0;
            this.f.removeCallbacks(this.I);
            rgd rgdVar = this.z;
            ClipsEditorMusicInfo d = rgdVar.d();
            ClipsEditorMusicInfo d2 = (d == null || !d.i) ? rgdVar.d() : null;
            if (d2 != null) {
                try {
                    storyMusicInfo = hxd.d(d2);
                } catch (IOException e) {
                    L.i(e);
                    s(true);
                    this.C = false;
                    cameraUIView.k0();
                    return;
                }
            }
            b(file, storyMusicInfo, b2, maskLight, j, f, this.y.f);
            this.b.i.j = true;
        } catch (IOException e2) {
            L.g("Can't fetch metadata from clip fragment", e2);
            s(true);
            this.C = false;
        }
    }

    public final void j(long j) {
        float X = j / this.b.X();
        this.c.setClipsProgress(X);
        int i = this.s;
        if (i <= 0 || i - X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.r = false;
        y(false);
    }

    public final void m(boolean z) {
        L.e(zhy0.a("onTabSelected(): ", z));
        PermissionHelper permissionHelper = PermissionHelper.a;
        CameraUIView cameraUIView = this.c;
        Activity activity = (Activity) cameraUIView.getContext();
        permissionHelper.getClass();
        if (PermissionHelper.b(activity, PermissionHelper.j)) {
            this.v = true;
            if (z) {
                if (this.E) {
                    wud wudVar = this.i;
                    int i = wudVar.b;
                    wudVar.b = i;
                    wudVar.a.setClipsProgressMaxDurationMs(i);
                    B();
                }
                atd atdVar = this.k;
                atdVar.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                ka kaVar = new ka(atdVar, 22);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(kaVar);
                C(null);
            } else {
                this.b.i.k = false;
                zd9 camera1View = cameraUIView.getCamera1View();
                if (camera1View != null) {
                    camera1View.setPreferredVideoRecordQuality(null);
                }
            }
            zd9 camera1View2 = cameraUIView.getCamera1View();
            if (camera1View2 != null) {
                camera1View2.B(z, true);
            }
            if (z) {
                StoryCameraParams storyCameraParams = this.x;
                StoryMusicInfo storyMusicInfo = storyCameraParams.e0;
                storyCameraParams.e0 = null;
                if (storyMusicInfo != null) {
                    v(this, storyMusicInfo);
                }
            }
        }
    }

    public final void n(boolean z, boolean z2) {
        com.vk.media.ok.b bVar;
        this.u = z;
        zd9 camera1View = this.c.getCamera1View();
        if (camera1View == null || (bVar = ((mo9) camera1View.getCameraPreview()).g.B) == null) {
            return;
        }
        if (z2) {
            bVar.j0 = z;
        }
        if (z2 || bVar.j0) {
            bVar.i0 = z;
            GesturedRecording gesturedRecording = bVar.f0;
            if (gesturedRecording != null) {
                gesturedRecording.l(z, bVar.n);
            }
        }
    }

    public final void o() {
        StoryCameraParams storyCameraParams = this.x;
        StoryCameraTarget storyCameraTarget = storyCameraParams.o;
        StoryCameraTarget storyCameraTarget2 = StoryCameraTarget.CLIP_FRAGMENT;
        ArrayList arrayList = this.q;
        CameraUIView cameraUIView = this.c;
        if (storyCameraTarget == storyCameraTarget2) {
            Intent intent = new Intent();
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(w0e.c((ClipVideoItem) it.next()));
            }
            intent.putExtra("clip_fragments", p4g.q(arrayList2));
            cameraUIView.O(-1, intent, false);
            return;
        }
        if (arrayList.size() == 0 && storyCameraParams.M == null) {
            L.l("There are no clip fragments to join");
            cameraUIView.t0(y8g0.e(R.string.error));
            return;
        }
        an9 an9Var = this.b.i;
        an9Var.e = false;
        an9Var.g = true;
        an9Var.i = true;
        an9Var.k = false;
        cameraUIView.getPositions().d();
        mpd mpdVar = new mpd(this);
        eqo<mpo> eqoVar = this.H;
        eqoVar.h(mpdVar);
        eqoVar.d(mpo.b.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        int i;
        zd9 camera1View;
        zd9 camera1View2;
        int i2;
        com.vk.media.ok.b bVar;
        com.vk.cameraui.impl.a aVar = this.b;
        an9 an9Var = aVar.i;
        ArrayList arrayList = this.q;
        boolean isEmpty = arrayList.isEmpty();
        CameraUIView cameraUIView = this.c;
        if (!isEmpty) {
            ClipVideoItem clipVideoItem = (ClipVideoItem) xy9.b(1, arrayList);
            int i3 = (int) (clipVideoItem.c / clipVideoItem.h);
            int i4 = this.G - i3;
            this.G = i4;
            long j = i4;
            zd9 camera1View3 = ((com.vk.cameraui.impl.a) this.d.c).b.getCamera1View();
            if (camera1View3 != null && (bVar = ((mo9) camera1View3.getCameraPreview()).g.B) != null) {
                bVar.H.applyRecordingTime(j);
            }
            rgd rgdVar = this.z;
            rgdVar.d = Math.max(0, rgdVar.d - i3);
            String str = clipVideoItem.b;
            String str2 = clipVideoItem.d;
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator it = arrayList.iterator();
                i = 0;
                while (it.hasNext()) {
                    ClipVideoItem clipVideoItem2 = (ClipVideoItem) it.next();
                    if (epx.f(clipVideoItem2.b, str) || epx.f(clipVideoItem2.d, str)) {
                        i++;
                        if (i < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
            }
            if (i == 1) {
                int i5 = 9;
                new io.reactivex.rxjava3.internal.operators.single.v(new c3d(clipVideoItem, 0)).q(asu0.a.c()).subscribe(new ez(new dz(8), i5), new iu1(new com.vk.movika.sdk.base.observable.i(i5), 7));
            } else {
                L.e("ClipItemUtils: Original file not deleted");
            }
            if (str2 != null) {
                if (arrayList.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        ClipVideoItem clipVideoItem3 = (ClipVideoItem) it2.next();
                        if ((str2.equals(clipVideoItem3.b) || str2.equals(clipVideoItem3.d)) && (i2 = i2 + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                if (i2 == 1) {
                    new io.reactivex.rxjava3.internal.operators.single.v(new d3d(clipVideoItem, 0)).q(asu0.a.c()).subscribe(new hz(new k60(13), 15), new jz(new ob(8), 13));
                    camera1View = cameraUIView.getCamera1View();
                    if (camera1View != null) {
                        camera1View.P(this.n, true);
                    }
                    an9Var.N = null;
                    if (arrayList.size() == 1 && (camera1View2 = cameraUIView.getCamera1View()) != null) {
                        camera1View2.C();
                    }
                    arrayList.remove(arrayList.size() - 1);
                    aVar.W0();
                }
            }
            L.e("ClipItemUtils: Reversed file does not exist or not deleted");
            camera1View = cameraUIView.getCamera1View();
            if (camera1View != null) {
            }
            an9Var.N = null;
            if (arrayList.size() == 1) {
                camera1View2.C();
            }
            arrayList.remove(arrayList.size() - 1);
            aVar.W0();
        }
        if (arrayList.isEmpty()) {
            zd9 camera1View4 = cameraUIView.getCamera1View();
            if (camera1View4 != null) {
                camera1View4.setPreferredVideoRecordQuality(null);
            }
            boolean z = an9Var.j;
            an9Var.j = false;
            if (z) {
                aVar.k3(true);
            }
            c();
        }
        cameraUIView.k0();
        B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r6.j == true) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z) {
        com.vk.cameraui.impl.a aVar = this.b;
        an9 an9Var = aVar.i;
        this.E = false;
        this.C = false;
        s(true);
        CameraUIView cameraUIView = this.c;
        zd9 camera1View = cameraUIView.getCamera1View();
        if (camera1View != null) {
            camera1View.setPreferredVideoRecordQuality(null);
        }
        this.q.clear();
        this.s = 0;
        boolean z2 = an9Var.j;
        an9Var.j = false;
        an9Var.k = false;
        an9Var.N = null;
        if (z2) {
            aVar.k3(true);
        }
        ClipsProgressView clipsProgressView = cameraUIView.G0;
        if (clipsProgressView == null) {
            clipsProgressView = null;
        }
        clipsProgressView.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        clipsProgressView.o.clear();
        clipsProgressView.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        clipsProgressView.invalidate();
        this.n = new ArrayList<>();
        zd9 camera1View2 = cameraUIView.getCamera1View();
        if (camera1View2 != null) {
            camera1View2.P(this.n, false);
        }
        boolean z3 = an9Var.M;
        rgd rgdVar = this.z;
        if (z3) {
            ClipsEditorMusicInfo clipsEditorMusicInfo = rgdVar.c;
            StoryMusicInfo d = clipsEditorMusicInfo != null ? hxd.d(clipsEditorMusicInfo) : null;
            if (d != null) {
            }
        }
        if (z) {
            rgdVar.d = Math.max(0, rgdVar.d - this.G);
        } else {
            rgdVar.b();
        }
        aVar.W0();
        this.G = 0;
        B();
        c();
    }

    public final void s(boolean z) {
        an9 state;
        an9 state2;
        this.D = z;
        Boolean bool = !z ? Boolean.FALSE : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : !this.C;
        CameraUIView cameraUIView = this.c;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter == null || (state2 = presenter.getState()) == null || state2.h() != booleanValue) {
            bm9 presenter2 = cameraUIView.getPresenter();
            if (presenter2 != null && (state = presenter2.getState()) != null) {
                state.l(booleanValue);
            }
            cameraUIView.B.l();
        }
        this.b.setShutterEnabled(z);
    }

    public final void u(boolean z) {
        an9 an9Var = this.b.i;
        an9Var.q = !z;
        an9Var.D = z;
        c();
    }

    public final void w() {
        this.H.g = null;
        this.z.c();
        i0q0.f(new jd(this, 24));
    }

    public final void x(boolean z) {
        com.vk.media.ok.b bVar;
        if (!this.b.i.T || this.C) {
            return;
        }
        long j = this.G;
        vm9 vm9Var = this.d;
        zd9 camera1View = ((com.vk.cameraui.impl.a) vm9Var.c).b.getCamera1View();
        if (camera1View != null && (bVar = ((mo9) camera1View.getCameraPreview()).g.B) != null) {
            bVar.H.applyRecordingTime(j);
        }
        SystemClock.elapsedRealtime();
        com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) vm9Var.c;
        an9 an9Var = aVar.i;
        DuetAction duetAction = an9Var.N;
        if (duetAction == null) {
            an9Var.N = aVar.h0;
        } else if (duetAction != aVar.h0) {
            an9Var.N = DuetAction.CANCEL;
        }
        com.vk.cameraui.impl.a.G0(aVar, true, true, 8);
        if (this.u) {
            this.e.a.getClass();
            if (xkg.b.f()) {
                l7v b2 = pla.e().b();
                HintId hintId = HintId.INFO_CLIPS_RECORD_GESTURES;
                if (b2.a(hintId.getId())) {
                    pla.e().b().b(hintId.getId());
                    this.c.t0(y8g0.e(R.string.clips_onboarding_fragment_gesture_hint));
                }
            }
        }
        nf9 nf9Var = nf9.b;
        am9.a aVar2 = new am9.a();
        aVar2.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
        b.d b3 = nf9.b(nf9Var, StoryPublishEvent.START_VIDEO, aVar2, null, null, true, null, 108);
        b3.b(Integer.valueOf(z ? 1 : 0), "is_gesture");
        b3.e();
    }

    public final void y(boolean z) {
        if (!this.B || z) {
            z();
        }
        r(this, 2);
        ((com.vk.cameraui.impl.a) this.d.c).Q0();
        nf9 nf9Var = nf9.b;
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
        b.d b2 = nf9.b(nf9Var, StoryPublishEvent.END_VIDEO, aVar, null, null, true, null, 108);
        b2.b(Integer.valueOf(z ? 1 : 0), "is_gesture");
        b2.e();
    }

    public final void z() {
        an9 state;
        CameraUIView cameraUIView = this.c;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter != null && (state = presenter.getState()) != null) {
            state.e = false;
            cameraUIView.setClipsProgressCounterVisible(false);
            boolean z = state.j;
            state.j = !this.q.isEmpty();
            if (!z) {
                this.b.k3(true);
            }
        }
        cameraUIView.getPositions().d();
        cameraUIView.setShutterPosition(true);
        cameraUIView.setShutterEnabled(false);
    }
}
