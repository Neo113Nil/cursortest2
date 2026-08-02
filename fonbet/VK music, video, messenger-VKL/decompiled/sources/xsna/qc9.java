package xsna;

import android.app.Dialog;
import androidx.camera.view.PreviewView;
import com.ironsource.C4628x1;
import com.ironsource.InterfaceC4386ja;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.log.L;
import com.vk.posting.presentation.video.VideoPickerFragment;
import com.vk.posting.presentation.video.a;
import com.vk.reefton.Reef;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.webrtc.SharedLocalMediaStreamSource;
import ru.ok.android.webrtc.protocol.RtcCommandOnSentListener;
import ru.ok.tracer.lite.performance.metrics.TracerPerformanceMetricsLite;
import ru.ok.tracer.session.TagsStorage;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class qc9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qc9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0q0 m0q0Var;
        switch (this.b) {
            case 0:
                CallsAudioManagerV3Impl.recoverDeviceByTypeRunnable$lambda$0((CallsAudioManagerV3Impl) this.c);
                break;
            case 1:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) this.c;
                aVar.Y.set(aVar.o0());
                break;
            case 2:
                qox qoxVar = (qox) this.c;
                if (qoxVar.g != null) {
                    qoxVar.c.invoke(qoxVar);
                    qoxVar.a();
                    break;
                }
                break;
            case 3:
                la60 la60Var = (la60) this.c;
                try {
                    com.vk.core.view.components.spinner.c cVar = la60Var.a;
                    if (cVar != null) {
                        cVar.dismiss();
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable unused) {
                }
                la60Var.a = null;
                break;
            case 4:
                ((SharedLocalMediaStreamSource) this.c).b();
                break;
            case 5:
                Reef m = ((hwl0) this.c).m();
                if (m != null) {
                    m.c();
                    break;
                }
                break;
            case 6:
                u6m0 u6m0Var = (u6m0) this.c;
                cvu cvuVar = u6m0Var.d;
                StoryEditText storyEditText = u6m0Var.b.j;
                cvuVar.b((storyEditText != null ? storyEditText : null).getContext(), new com.vk.movika.sdk.base.logic.interactor.m(27));
                break;
            case 7:
                nhn0 nhn0Var = (nhn0) this.c;
                PreviewView previewView = nhn0Var.i;
                nhn0Var.j = (previewView != null ? previewView : null).getDisplay().getDisplayId();
                ora b = lgd0.b(nhn0Var.requireContext());
                b.addListener(new ke9(7, nhn0Var, b), nhn0Var.requireContext().getMainExecutor());
                break;
            case 8:
                TagsStorage.setKeys$lambda$4((TagsStorage) this.c);
                break;
            case 9:
                TracerPerformanceMetricsLite.prepareUpload$lambda$1((TracerPerformanceMetricsLite) this.c);
                break;
            case 10:
                u0q0 u0q0Var = (u0q0) this.c;
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                SchemeStat$EventItem schemeStat$EventItem = uiTrackingScreen != null ? uiTrackingScreen.f : null;
                l1q0 l1q0Var = UiTracker.i;
                UiTrackingScreen uiTrackingScreen2 = new UiTrackingScreen(UiTrackingScreen.Companion.DialogType.DIALOG_ALERT);
                u0q0 u0q0Var2 = !(u0q0Var instanceof n0q0) ? u0q0Var : null;
                UiTrackingScreen b2 = u0q0Var2 != null ? UiTrackingScreen.b(uiTrackingScreen2, new WeakReference(u0q0Var2), null, 11) : UiTrackingScreen.b(uiTrackingScreen2, null, null, 15);
                WeakReference<m0q0> weakReference = b2.c;
                if (weakReference != null && (m0q0Var = weakReference.get()) != null) {
                    m0q0Var.y(b2);
                }
                l1q0Var.j(b2, true);
                u0q0Var.g = schemeStat$EventItem;
                break;
            case 11:
                VideoPickerFragment videoPickerFragment = (VideoPickerFragment) this.c;
                int i = VideoPickerFragment.V;
                a.c cVar2 = a.c.b;
                videoPickerFragment.getClass();
                xn50.a.c(videoPickerFragment, cVar2);
                break;
            case 12:
                try {
                    ((Dialog) this.c).dismiss();
                    break;
                } catch (Exception e) {
                    L.i(e);
                    return;
                }
            case 13:
                com.vk.auth.main.h hVar = (com.vk.auth.main.h) this.c;
                if (!p90.e(hVar.a)) {
                    hVar.M0();
                    break;
                }
                break;
            case 14:
                s7y0 s7y0Var = (s7y0) this.c;
                s7y0Var.d();
                r7y0 r7y0Var = s7y0Var.b;
                String str = s7y0Var.a;
                if (str != null) {
                    Preference.F(0L, "zstd_pref", "last_download_time");
                }
                if (!epx.f(str, "no_dict")) {
                    int i2 = r7y0.i;
                    r7y0Var.b.schedule(new ues(r7y0Var, str, s7y0Var, 3), 16000L, TimeUnit.MILLISECONDS);
                    break;
                } else {
                    s7y0Var.e();
                    break;
                }
            case 15:
                ivy0 ivy0Var = (ivy0) this.c;
                ivy0Var.getClass();
                try {
                    RtcCommandOnSentListener<Command, Response> rtcCommandOnSentListener = ivy0Var.d.sentListener;
                    if (rtcCommandOnSentListener != 0) {
                        rtcCommandOnSentListener.onRtcCommandSent(ivy0Var.c);
                        break;
                    }
                } catch (Throwable th) {
                    ivy0Var.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsent", th);
                    return;
                }
                break;
            case 16:
                com.vungle.ads.internal.executor.j.c((com.vungle.ads.internal.executor.j) this.c);
                break;
            default:
                C4628x1.d((InterfaceC4386ja) this.c);
                break;
        }
    }
}
