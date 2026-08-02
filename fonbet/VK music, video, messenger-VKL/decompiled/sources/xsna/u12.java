package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.view.Surface;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.i;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.validation.b;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.log.L;
import com.vk.media.ok.encoder.VideoAudioEncoderException;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.media.PublisherImpl;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.VideoCBRMode;
import xsna.dw20;
import xsna.gzf;
import xsna.mxy0;
import xsna.sy70;
import xsna.v2s0;
import xsna.v2s0.a;
import xsna.v2s0.b;
import xsna.v2s0.c;
import xsna.v2s0.f;
import xsna.v2s0.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u12 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u12(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator listener;
        float f;
        Pair create;
        MediaFormat mediaFormat;
        int i = 0;
        int i2 = 1;
        switch (this.b) {
            case 0:
                w12 w12Var = (w12) this.c;
                try {
                    try {
                        w12Var.b();
                    } finally {
                        w12Var.g = null;
                    }
                } catch (Exception e) {
                    L.LogType logType = L.LogType.e;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    L.s(logType, "VkContactManager", message, e);
                }
                return;
            case 1:
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                AppStartTrace appStartTrace = (AppStartTrace) this.c;
                i.b bVar = appStartTrace.e;
                if (appStartTrace.l != null) {
                    return;
                }
                Timer b = AppStartTrace.b();
                appStartTrace.l = new Timer();
                bVar.n(b.b);
                bVar.o(b.e(appStartTrace.l));
                i.b z = com.google.firebase.perf.v1.i.z();
                z.p("_experiment_classLoadTime");
                z.n(FirebasePerfProvider.getAppStartTime().b);
                z.o(FirebasePerfProvider.getAppStartTime().e(appStartTrace.l));
                bVar.f(z.build());
                i.b z2 = com.google.firebase.perf.v1.i.z();
                z2.p("_experiment_uptimeMillis");
                z2.n(b.b);
                z2.o(appStartTrace.l.d - b.d);
                bVar.f(z2.build());
                bVar.d(appStartTrace.n.d());
                if (appStartTrace.m == null || appStartTrace.l == null) {
                    return;
                }
                AppStartTrace.r.execute(new n93(appStartTrace, i));
                if (appStartTrace.b) {
                    appStartTrace.d();
                    return;
                }
                return;
            case 3:
                qu4 qu4Var = (qu4) this.c;
                d3m.e(qu4Var.b, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            case 4:
                fh5 fh5Var = (fh5) this.c;
                fh5Var.x0 = true;
                fh5Var.C0(true, true);
                return;
            case 5:
                com.vk.clips.editor.templates.impl.player.a.k((com.vk.clips.editor.templates.impl.player.a) this.c);
                return;
            case 6:
                ((r2g) this.c).e.k();
                return;
            case 7:
                ((k2l) this.c).b = true;
                return;
            case 8:
                GroupVh groupVh = (GroupVh) this.c;
                ImageView imageView = groupVh.A;
                ViewPropertyAnimator animate = imageView != null ? imageView.animate() : null;
                groupVh.G = animate;
                if (animate == null || (alpha = animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) == null || (listener = alpha.setListener(new w38(groupVh, i2))) == null) {
                    return;
                }
                listener.start();
                return;
            case 9:
                Streamer streamer = (Streamer) this.c;
                VideoCBRMode videoCBRMode = sy70.c0;
                sy70.a.b(streamer);
                return;
            case 10:
                ((PublisherImpl) this.c).lambda$stopPublishing$7();
                return;
            case 11:
                ((j3n0) this.c).d();
                return;
            case 12:
                ((zjn0) this.c).d.cancel(true);
                return;
            case 13:
                ((VerificationController) this.c).lambda$prepare2StepAuthCheck$13();
                return;
            case 14:
                v2s0 v2s0Var = (v2s0) this.c;
                if (v2s0Var.k.get()) {
                    AtomicReference atomicReference = new AtomicReference();
                    gzf.c cVar = v2s0Var.c.b;
                    System.currentTimeMillis();
                    HandlerThread handlerThread = new HandlerThread("v2s0");
                    v2s0Var.C = handlerThread;
                    try {
                        handlerThread.start();
                        v2s0Var.G = v2s0Var.new f();
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        new Handler(v2s0Var.C.getLooper()).post(new rfw(v2s0Var, atomicReference, countDownLatch, 4));
                        try {
                            countDownLatch.await();
                            if (atomicReference.get() != null) {
                                MediaFormat inputFormat = ((MediaCodec) atomicReference.get()).getInputFormat();
                                float f2 = 1.0f;
                                v2s0.g gVar = v2s0Var.c.c == 1.0f ? new v2s0.g(v2s0Var, inputFormat) : v2s0Var.new h(inputFormat);
                                System.currentTimeMillis();
                                vhf0 vhf0Var = v2s0Var.c;
                                gzf.a aVar = vhf0Var.a;
                                gb4 gb4Var = v2s0Var.v;
                                if (gb4Var != null) {
                                    gzf d = gzf.d(gb4Var.a, v2s0Var.f, v2s0Var.e, 1.0f / vhf0Var.c);
                                    v2s0Var.z = d;
                                    create = Pair.create(Long.valueOf(d != null ? d.c : 0L), 0L);
                                    f = 1.0f;
                                } else {
                                    gb4 gb4Var2 = null;
                                    long j = 0;
                                    long j2 = 0;
                                    while (true) {
                                        if (aVar != null) {
                                            f = f2;
                                            gzf d2 = gzf.d(aVar, v2s0Var.f, v2s0Var.e, f / v2s0Var.c.c);
                                            v2s0Var.z = d2;
                                            gb4Var2 = d2 != null ? new gb4(d2.b) : null;
                                            gzf gzfVar = v2s0Var.z;
                                            j += gzfVar != null ? gzfVar.c : 0L;
                                            j2 += gb4Var2 != null ? gb4Var2.b : 0L;
                                            if (gzfVar == null || gb4Var2.c == null) {
                                                if (gzfVar != null) {
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    gzf.c(gzfVar.a);
                                                    gzfVar.d = System.currentTimeMillis() - currentTimeMillis;
                                                    v2s0Var.z = null;
                                                }
                                                if (gb4Var2 != null) {
                                                    gb4Var2.a();
                                                    gb4Var2 = null;
                                                }
                                                if (aVar.b == 2 && v2s0Var.q) {
                                                    f2 = f;
                                                    aVar = new gzf.a(aVar.a, aVar.e, 1, aVar.c, aVar.d);
                                                } else {
                                                    aVar = null;
                                                    f2 = f;
                                                }
                                            }
                                        } else {
                                            f = f2;
                                        }
                                    }
                                    if (gb4Var2 != null) {
                                        synchronized (v2s0Var.j) {
                                            v2s0Var.w = true;
                                            v2s0Var.v = gb4Var2;
                                        }
                                    }
                                    create = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                                }
                                ((Long) create.first).getClass();
                                ((Long) create.second).getClass();
                                if (v2s0Var.z == null) {
                                    v2s0Var.d((MediaCodec) atomicReference.get(), v2s0Var.g);
                                    Surface surface = v2s0Var.D;
                                    if (surface != null) {
                                        surface.release();
                                        v2s0Var.D = null;
                                    }
                                    v2s0Var.c(new VideoAudioEncoderException("failed to create audio"), true);
                                    return;
                                }
                                v2s0Var.B = v2s0Var.new a();
                                gzf gzfVar2 = v2s0Var.z;
                                gzfVar2.getClass();
                                try {
                                    mediaFormat = gzfVar2.a.getInputFormat();
                                } catch (IllegalStateException e2) {
                                    com.vk.metrics.eventtracking.b.a.a(new RuntimeException("failed to get input media format", e2));
                                    mediaFormat = gzfVar2.b;
                                }
                                vhf0 vhf0Var2 = v2s0Var.c;
                                v2s0Var.A = (vhf0Var2.c == f && vhf0Var2.a.e == f) ? v2s0Var.new b(v2s0Var.v, gVar, mediaFormat) : v2s0Var.new c(v2s0Var.v, gVar, mediaFormat);
                                if (!v2s0Var.k.get()) {
                                    v2s0Var.d((MediaCodec) atomicReference.get(), v2s0Var.g);
                                    Surface surface2 = v2s0Var.D;
                                    if (surface2 != null) {
                                        surface2.release();
                                        v2s0Var.D = null;
                                    }
                                    v2s0.b bVar2 = v2s0Var.A;
                                    if (bVar2 != null) {
                                        bVar2.f();
                                        v2s0Var.A = null;
                                    }
                                    gzf gzfVar3 = v2s0Var.z;
                                    if (gzfVar3 != null) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        gzf.c(gzfVar3.a);
                                        gzfVar3.d = System.currentTimeMillis() - currentTimeMillis2;
                                        v2s0Var.z = null;
                                        return;
                                    }
                                    return;
                                }
                                if (atomicReference.get() != null) {
                                    synchronized (v2s0Var.j) {
                                        v2s0Var.E = (MediaCodec) atomicReference.get();
                                        v2s0Var.F = gVar;
                                    }
                                }
                                if (v2s0Var.n.get() != null) {
                                    v2s0Var.b();
                                    return;
                                }
                                File file = v2s0Var.u;
                                if (file != null) {
                                    try {
                                        file.mkdirs();
                                        File createTempFile = File.createTempFile("vae", null, v2s0Var.u);
                                        createTempFile.deleteOnExit();
                                        v2s0Var.t.set(v2s0Var.a(createTempFile, false));
                                        return;
                                    } catch (Exception e3) {
                                        v2s0Var.c(new VideoAudioEncoderException("failed to create temp muxer file", e3), false);
                                        return;
                                    }
                                }
                                return;
                            }
                        } catch (InterruptedException e4) {
                            L.j(e4, "waiting for start of video encoder was interrupted");
                        }
                        v2s0Var.d((MediaCodec) atomicReference.get(), v2s0Var.g);
                        Surface surface3 = v2s0Var.D;
                        if (surface3 != null) {
                            surface3.release();
                            v2s0Var.D = null;
                        }
                        v2s0Var.c(new VideoAudioEncoderException("failed to start video encoder"), true);
                        return;
                    } catch (OutOfMemoryError e5) {
                        v2s0Var.c(new VideoAudioEncoderException("OOM when starting video encoder handler thread", e5), true);
                        return;
                    }
                }
                return;
            case 15:
                b.a aVar2 = (b.a) this.c;
                com.vk.registration.funnels.b bVar3 = com.vk.registration.funnels.b.a;
                bVar3.getClass();
                com.vk.registration.funnels.b.z(bVar3, SchemeStatSak$EventScreen.ALERT_SUCCESS_UNLINK_PHONE_NUMBER, null, null, null, 30);
                Activity activity = aVar2.b.get();
                if (activity != null) {
                    Context a = hnj.a(activity);
                    Drawable e6 = enj.e(R.drawable.vk_icon_report_outline_56, R.attr.vk_ui_background_negative, a);
                    Drawable e7 = enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_medium, a);
                    dw20.b bVar4 = new dw20.b(activity, null);
                    cbq.a(bVar4);
                    dw20.b bVar5 = (dw20.b) dw20.a.Q(((dw20.b) bVar4.M0().N(e6).w().F(e7, null)).b0(new ksg0(aVar2, 25)).v0(R.string.vk_service_validation_confirmation_unlink_result), R.string.vk_service_validation_confirmation_unlink_explanation);
                    aVar2.d((dw20.b) dw20.a.k0(bVar5, bVar5.c.getString(R.string.vk_service_validation_confirmation_approve_good), new ew20(new ikk0(aVar2, 21)), null, Integer.valueOf(R.drawable.vkui_bg_button_red), 4), "successUnbind");
                    return;
                }
                return;
            case 16:
                ((com.ironsource.lifecycle.b) this.c).g();
                return;
            case 17:
                mxy0.a aVar3 = ((mxy0) this.c).h;
                if (aVar3.d != 0) {
                    return;
                }
                aVar3.d = 2;
                tnf tnfVar = aVar3.e;
                if (tnfVar != null) {
                    o8z0.g.removeCallbacks(tnfVar);
                    aVar3.e = null;
                }
                aVar3.a.run();
                return;
            case 18:
                ((fjz0) this.c).a();
                return;
            default:
                com.vungle.ads.internal.ui.z.a(true, (com.vungle.ads.internal.ui.z) this.c);
                return;
        }
    }
}
