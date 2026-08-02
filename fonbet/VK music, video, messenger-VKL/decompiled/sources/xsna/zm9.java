package xsna;

import android.content.Context;
import android.media.AudioTrack;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.masks.Mask;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.libvideo.live.api.base.RecorderStatus;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import xsna.mo9;
import xsna.tam0;

/* compiled from: CameraUIPresenter.kt */
/* loaded from: classes16.dex */
public final class zm9 implements qj9 {
    public final /* synthetic */ com.vk.cameraui.impl.a a;

    /* compiled from: CameraUIPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryCameraMode.values().length];
            try {
                iArr[StoryCameraMode.STORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryCameraMode.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryCameraMode.PING_PONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryCameraMode.STORY_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryCameraMode.CLIPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zm9(com.vk.cameraui.impl.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.qj9
    public final void a(long j, long j2) {
        AudioTrack audioTrack;
        com.vk.cameraui.impl.a aVar = this.a;
        if (aVar.c4() == StoryCameraMode.VIDEO) {
            aVar.b.I0(j);
        }
        if (aVar.c4().i()) {
            aVar.p0.j(j);
        }
        long c = (aVar.e0.isInitialized() && (audioTrack = aVar.Z().d) != null && audioTrack.getPlayState() == 3) ? aVar.Z().c() : -1L;
        if (c >= 0) {
            aVar.f0.a(c);
        }
    }

    @Override // xsna.qj9
    public final void b(nhf0 nhf0Var) {
        L.e("onTimings");
        com.vk.cameraui.impl.a aVar = this.a;
        aVar.c0 = nhf0Var;
        if (aVar.e0.isInitialized()) {
            nhf0Var.a = new WeakReference<>(this.a.Z());
        }
    }

    @Override // xsna.qj9
    public final void c(long j, long j2) {
        AudioTrack audioTrack;
        com.vk.cameraui.impl.a aVar = this.a;
        if (aVar.c4() == StoryCameraMode.VIDEO) {
            aVar.b.I0(j);
        }
        if (aVar.c4().i()) {
            aVar.p0.j(j);
        }
        long c = (aVar.e0.isInitialized() && (audioTrack = aVar.Z().d) != null && audioTrack.getPlayState() == 3) ? aVar.Z().c() : -1L;
        if (c >= 0) {
            aVar.f0.a(c);
        }
    }

    @Override // xsna.qj9
    public final void d() {
        com.vk.cameraui.impl.a aVar = this.a;
        if (aVar.e0.isInitialized()) {
            vky Z = aVar.Z();
            Z.i.post(new sc4(Z, 9));
        }
    }

    @Override // xsna.qj9
    public final void e(int i) {
        mo9.b bVar;
        com.vk.cameraui.impl.a aVar = this.a;
        if (i == 800) {
            L.e("MEDIA_RECORDER_INFO_MAX_DURATION_REACHED");
            aVar.L0();
            return;
        }
        switch (i) {
            case -1006:
                ne8 ne8Var = aVar.r;
                if (ne8Var != null) {
                    ne8Var.W1(RecorderStatus.RECORDER_INFO_STREAMING_DISCONNECTED);
                }
                L.e("RECORDER_INFO_STREAMING_DISCONNETCED");
                break;
            case -1005:
                ne8 ne8Var2 = aVar.r;
                if (ne8Var2 != null) {
                    ne8Var2.W1(RecorderStatus.RECORDER_INFO_STREAMING_CONNECTED);
                }
                L.e("RECORDER_INFO_STREAMING_CONNECTED");
                break;
            case -1004:
                L.e("RECORDER_INFO_STREAMING_STARTED");
                break;
            case -1003:
                io.reactivex.rxjava3.disposables.c cVar = aVar.B;
                if (cVar != null) {
                    cVar.dispose();
                }
                L.e("RECORDER_INFO_PROCESSING_ENDED");
                break;
            case -1002:
                L.e("RECORDER_INFO_PROCESSING_STARTED");
                aVar.i.g = true;
                aVar.b.getPositions().d();
                aVar.R();
                break;
            case -1001:
                L.e("RECORDER_INFO_RECORDING_STARTED");
                zd9 camera1View = aVar.b.getCamera1View();
                if (camera1View != null && (bVar = camera1View.s) != null && bVar.a()) {
                    ho9.e(camera1View.getActivity(), true);
                    camera1View.b.post(new jk9(camera1View, 0));
                }
                aVar.b.S();
                break;
            case -1000:
                L.e("RECORDER_INFO_RECORDING_PREPARED");
                io.reactivex.rxjava3.subjects.f<Boolean> fVar = aVar.D;
                if (fVar != null) {
                    fVar.onNext(Boolean.TRUE);
                }
                io.reactivex.rxjava3.subjects.f<Boolean> fVar2 = aVar.D;
                if (fVar2 != null) {
                    fVar2.onComplete();
                }
                aVar.D = null;
                break;
        }
    }

    @Override // xsna.qj9
    public final void f(File file, boolean z) {
        com.vk.cameraui.impl.a aVar = this.a;
        if (!aVar.c4().i()) {
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(file);
        }
        int i = a.$EnumSwitchMapping$0[aVar.c4().ordinal()];
        if (i == 1) {
            aVar.I0();
            return;
        }
        if (i == 2) {
            aVar.J0();
            return;
        }
        if (i == 3) {
            aVar.H0();
            return;
        }
        if (i == 4) {
            aVar.I0();
            return;
        }
        if (i != 5) {
            return;
        }
        jpd jpdVar = aVar.p0;
        float X = aVar.X();
        jpdVar.getClass();
        if (z && file != null) {
            jpdVar.r = false;
            jpdVar.z();
            jpdVar.i(file, null, 0L, X);
            return;
        }
        jpdVar.C = false;
        jpdVar.s(true);
        if (!jpdVar.q.isEmpty()) {
            jpdVar.c();
        }
        jpdVar.c.setClipsProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        jpdVar.s = 0;
        Regex regex2 = com.vk.core.files.a.a;
        vhk0.b(file);
        jpdVar.f.postDelayed(new id(jpdVar, 4), 400L);
    }

    @Override // xsna.qj9
    public final void onError(int i) {
        com.vk.cameraui.impl.a aVar = this.a;
        io.reactivex.rxjava3.disposables.c cVar = aVar.B;
        if (cVar != null) {
            cVar.dispose();
        }
        aVar.w0();
        aVar.b.g0();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    @Override // xsna.qj9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFinish(File file) {
        boolean z;
        Boolean b;
        nov novVar;
        boolean z2;
        nov novVar2;
        com.vk.cameraui.impl.a aVar = this.a;
        if (file != null) {
            StoryCameraMode c4 = aVar.c4();
            CameraUIView cameraUIView = aVar.b;
            if (c4.i()) {
                jpd jpdVar = aVar.p0;
                Mask selectedMask = cameraUIView.getSelectedMask();
                jpdVar.i(file, selectedMask != null ? selectedMask.Hb() : null, aVar.d0, aVar.X());
            } else {
                aVar.N0();
                zcl0 stickersState = cameraUIView.getStickersState();
                boolean t = stickersState.t();
                CopyOnWriteArrayList<nov> copyOnWriteArrayList = stickersState.a;
                if (!t && !stickersState.s()) {
                    int i = 0;
                    while (true) {
                        if (i == copyOnWriteArrayList.size()) {
                            novVar2 = null;
                            break;
                        } else {
                            if (copyOnWriteArrayList.get(i) instanceof r8m0) {
                                novVar2 = copyOnWriteArrayList.get(i);
                                break;
                            }
                            i++;
                        }
                    }
                    if (((r8m0) novVar2) == null) {
                        z = false;
                        b = aVar.e0().b();
                        if (b == null) {
                            z2 = b.booleanValue();
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 == copyOnWriteArrayList.size()) {
                                    novVar = null;
                                    break;
                                } else {
                                    if (copyOnWriteArrayList.get(i2) instanceof blj) {
                                        novVar = copyOnWriteArrayList.get(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            z2 = ((blj) novVar) != null;
                        }
                        Mask selectedMask2 = cameraUIView.getSelectedMask();
                        String Db = selectedMask2 != null ? selectedMask2.Db() : null;
                        Boolean a2 = aVar.e0().a();
                        com.vk.cameraui.impl.a.k0(aVar, tam0.a.a(file, z, Db, z2, a2 == null ? a2.booleanValue() : aVar.n0(), 32), false, false, 14);
                    }
                }
                z = true;
                b = aVar.e0().b();
                if (b == null) {
                }
                Mask selectedMask22 = cameraUIView.getSelectedMask();
                String Db2 = selectedMask22 != null ? selectedMask22.Db() : null;
                Boolean a22 = aVar.e0().a();
                com.vk.cameraui.impl.a.k0(aVar, tam0.a.a(file, z, Db2, z2, a22 == null ? a22.booleanValue() : aVar.n0(), 32), false, false, 14);
            }
        }
        aVar.W0();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qj9
    public final void onStart() {
        com.vk.cameraui.impl.a aVar = this.a;
        an9 an9Var = aVar.i;
        if (aVar.c4() == StoryCameraMode.VIDEO) {
            an9Var.h = true;
            aVar.b.I0(0L);
        } else {
            an9Var.h = false;
        }
        if (aVar.c4().i()) {
            jpd jpdVar = aVar.p0;
            zi9 zi9Var = (zi9) jpdVar.A.getValue();
            Context context = jpdVar.c.getContext();
            hg1.f(zi9Var.a);
            zi9Var.a = hg1.i(new io.reactivex.rxjava3.internal.operators.single.d0(kzz.d(context).K(), new com.vk.movika.sdk.android.defaultplayer.interactive.c(6), null).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.schedulers.a.b()), new ec(zi9Var, 15));
            jpdVar.C = true;
            com.vk.cameraui.impl.a aVar2 = jpdVar.b;
            aVar2.i.k = false;
            if (aVar2.getCurrentState() == StoryCameraMode.CLIPS) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar3 = new Event.a();
                aVar3.g("clips_record_start");
                aVar3.d(jgp.b);
                aVar3.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
                bVar.k(aVar3.e());
            }
            jpdVar.B();
        }
    }

    @Override // xsna.qj9
    public final void onStop() {
        boolean z;
        int b;
        int i;
        int averageMeasure;
        com.vk.cameraui.impl.a aVar = this.a;
        aVar.d0 = 0L;
        if (!aVar.c4().i()) {
            this.a.N0();
            return;
        }
        com.vk.cameraui.impl.a aVar2 = this.a;
        nhf0 nhf0Var = aVar2.c0;
        if (nhf0Var != null) {
            fza0 fza0Var = aVar2.f0;
            synchronized (fza0Var) {
                z = fza0Var.b != Long.MAX_VALUE;
            }
            if (z) {
                if (aVar2.e0.isInitialized()) {
                    vky Z = aVar2.Z();
                    Context context = aVar2.b.getContext();
                    Z.getClass();
                    try {
                        b = Z.d != null ? ((Integer) AudioTrack.class.getMethod("getLatency", null).invoke(Z.d, null)).intValue() : vky.b(context);
                    } catch (Exception e) {
                        L.g("LLAudioPlayer", e);
                        b = vky.b(context);
                    }
                    L.p("LLAudioPlayer", lhg.a(b, "expected latency = "));
                } else {
                    b = vky.b(aVar2.b.getContext());
                }
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long j = (-timeUnit.toMillis(nhf0Var.b)) - b;
                if (aVar2.g0) {
                    synchronized (nhf0Var.e) {
                        averageMeasure = (int) nhf0Var.c.getAverageMeasure();
                    }
                    i = bn10.c((int) timeUnit.toMillis(averageMeasure), 0, 120);
                } else {
                    i = 0;
                }
                aVar2.d0 = j - i;
                L.p(efz.b(aVar2.d0, " ms", new StringBuilder("Audio track shift = ")));
            }
            s3q0 s3q0Var = s3q0.a;
        }
        this.a.p0.z();
        fza0 fza0Var2 = this.a.f0;
        synchronized (fza0Var2) {
            try {
                fza0Var2.b = Long.MAX_VALUE;
                int length = fza0Var2.c.length;
                for (int i2 = 0; i2 < length; i2++) {
                    fza0Var2.c[i2] = Long.MAX_VALUE;
                }
                fza0Var2.d = 0;
            } finally {
            }
        }
        if (this.a.e0.isInitialized()) {
            vky Z2 = this.a.Z();
            Z2.i.post(new rc4(Z2, 9));
        }
    }
}
