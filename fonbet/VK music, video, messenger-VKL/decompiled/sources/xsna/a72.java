package xsna;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adapters.fyber.rewarded.FyberRewardedAdapter;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.auth.ui.consent.VkConsentView;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.dto.common.RecommendedProfile;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.media.recorder.f;
import com.vk.permission.PermissionHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import one.video.view.OneVideoPlayerView;
import org.chromium.net.impl.JavaUploadDataSinkBase;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.UploadStarter;
import ru.ok.android.webrtc.Call;
import ru.ok.face.morphing.FaceMorphingProcessor;
import ru.ok.gleffects.EffectHolder;
import ru.ok.media.StreamingLaunchScheduler;
import ru.ok.tracer.crash.report.AnrWatchdogThread;
import xsna.ol6;
import xsna.pg30;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a72 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a72(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        int[] iArr2;
        switch (this.b) {
            case 0:
                b72 b72Var = (b72) this.c;
                boolean e = b72Var.e();
                p52 p52Var = b72Var.b;
                if (e) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        p52Var.a(true);
                        pg50<jgi0> pg50Var = b72Var.m;
                        int[] iArr3 = pg50Var.b;
                        long[] jArr = pg50Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    int i3 = r3;
                                    while (i3 < i2) {
                                        if ((255 & j) < 128) {
                                            int i4 = iArr3[(i << 3) + i3];
                                            if (!b72Var.d().a(i4)) {
                                                iArr2 = iArr3;
                                                b72Var.e.add(new tfj(i4, b72Var.l, ufj.VIEW_DISAPPEAR, null));
                                                b72Var.i.f(s3q0.a);
                                                j >>= 8;
                                                i3++;
                                                iArr3 = iArr2;
                                            }
                                        }
                                        iArr2 = iArr3;
                                        j >>= 8;
                                        i3++;
                                        iArr3 = iArr2;
                                    }
                                    iArr = iArr3;
                                    if (i2 == 8) {
                                    }
                                } else {
                                    iArr = iArr3;
                                }
                                if (i != length) {
                                    i++;
                                    iArr3 = iArr;
                                    r3 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        b72Var.g(p52Var.getSemanticsOwner().a(), b72Var.n);
                        s3q0 s3q0Var = s3q0.a;
                        Trace.endSection();
                        b72Var.b(b72Var.d());
                        b72Var.k();
                        b72Var.o = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                ((AnrWatchdogThread) this.c).onBgWatchdog();
                return;
            case 2:
                ol6.a aVar = (ol6.a) this.c;
                j1e0 j1e0Var = aVar.d.get();
                if (j1e0Var != null) {
                    RecommendedProfile recommendedProfile = aVar.b;
                    nl6 nl6Var = new nl6(r3, j1e0Var, aVar);
                    ArrayList arrayList = new ArrayList(j1e0Var.getCurrentList());
                    if (ttp0.a(arrayList).remove(recommendedProfile)) {
                        j1e0Var.submitList(arrayList, nl6Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((Call) this.c).d();
                return;
            case 4:
                xk9 xk9Var = (xk9) this.c;
                f.a aVar2 = xk9Var.d0;
                if (aVar2 != null) {
                    com.vk.media.recorder.f.this.M((syf0) xk9Var.l.b);
                }
                com.vk.media.ok.a aVar3 = xk9Var.G;
                if (aVar3 != null) {
                    aVar3.q();
                    return;
                }
                return;
            case 5:
                com.vk.cameraui.impl.a aVar4 = (com.vk.cameraui.impl.a) this.c;
                p5p Y = aVar4.Y();
                if (Y != null) {
                    Y.m();
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context context = aVar4.b.getContext();
                    permissionHelper.getClass();
                    if (PermissionHelper.b(context, PermissionHelper.j)) {
                        Y.A();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ClipSearchRootVh clipSearchRootVh = (ClipSearchRootVh) this.c;
                g3a.a(clipSearchRootVh.A, clipSearchRootVh);
                return;
            case 7:
                cfm cfmVar = (cfm) this.c;
                cfmVar.K.m = false;
                cfmVar.C();
                return;
            case 8:
                ((Lambda) this.c).invoke();
                return;
            case 9:
                ((EffectHolder) this.c).lambda$onStartRecording$3();
                return;
            case 10:
                ((FaceMorphingProcessor) this.c).lambda$initGPUResources$3();
                return;
            case 11:
                FyberRewardedAdapter.destroyAd$lambda$4((FyberRewardedAdapter) this.c);
                return;
            case 12:
                ((JavaUploadDataSinkBase) this.c).lambda$readFromProvider$2();
                return;
            case 13:
                ((rg30) this.c).a.a(pg30.e.a);
                return;
            case 14:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                bVar.i.release(bVar.A);
                return;
            case 15:
                ma maVar = (ma) this.c;
                int i5 = OneVideoPlayerView.j;
                maVar.invoke(null);
                return;
            case 16:
                ((y0a0) this.c).c();
                return;
            case 17:
                View view = (View) this.c;
                int i6 = StoryFragment.X;
                view.setPadding(0, (((int) (view.getHeight() * 0.66d)) - iah0.a(64)) / 2, 0, 0);
                return;
            case 18:
                ((skm0.a) this.c).m();
                return;
            case 19:
                StreamingLaunchScheduler.handlePauseResume$lambda$4((StreamingLaunchScheduler) this.c);
                return;
            case 20:
                com.vk.lists.c cVar = ((com.vk.superapp.ui.a) this.c).I;
                if (cVar != null) {
                    cVar.p(true);
                    return;
                }
                return;
            case 21:
                UnityAdsImplementation.lambda$load$2((InternalLoadListener) this.c);
                return;
            case 22:
                UploadStarter.resumeUpload$lambda$0((EventChannel) this.c);
                return;
            case 23:
                ppr0 ppr0Var = (ppr0) this.c;
                ppr0Var.k.T4();
                f4m.j(ppr0Var.k);
                return;
            case 24:
                ((g8s0) this.c).v();
                return;
            case 25:
                try {
                    ((ozs0) this.c).L();
                    return;
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                    return;
                }
            case 26:
                com.vk.libvideo.screen.a aVar5 = (com.vk.libvideo.screen.a) this.c;
                if (!aVar5.b.t7() || aVar5.m.g) {
                    return;
                }
                aVar5.a(aVar5.j.getConfiguration());
                return;
            case 27:
                VideoView videoView = (VideoView) this.c;
                VideoFullscreenBottomBarView fullscreenBottomBar = videoView.getFullscreenBottomBar();
                if (fullscreenBottomBar != null) {
                    fullscreenBottomBar.setVisibility(videoView.J0() ? 4 : 0);
                    return;
                }
                return;
            case 28:
                gzs<s3q0> gzsVar = ((VkConsentView) this.c).s;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    return;
                }
                return;
            default:
                WebView webView = ((lyy0) this.c).b;
                if (webView == null) {
                    return;
                }
                try {
                    webView.destroy();
                    return;
                } catch (Throwable th2) {
                    lyy0.c(th2);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a72(gzs gzsVar) {
        this.b = 8;
        this.c = (Lambda) gzsVar;
    }
}
