package xsna;

import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.media.ok.recording.GesturedRecording;
import ru.ok.android.webrtc.protocol.impl.notifications.RtcNotificationReceiverImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tw70 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tw70(RtcNotificationReceiverImpl rtcNotificationReceiverImpl, boolean z) {
        this.d = rtcNotificationReceiverImpl;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.d;
                if (!this.c) {
                    StopwatchView stopwatchView = bVar.b0;
                    if (stopwatchView != null) {
                        stopwatchView.c();
                    }
                    StopwatchView stopwatchView2 = bVar.b0;
                    if (stopwatchView2 != null) {
                        stopwatchView2.setVisibility(8);
                    }
                    bVar.g0 = System.currentTimeMillis();
                    break;
                } else {
                    bVar.h0 = System.currentTimeMillis();
                    GesturedRecording gesturedRecording = bVar.f0;
                    if (gesturedRecording != null && !gesturedRecording.l && gesturedRecording.s) {
                        gesturedRecording.a();
                        break;
                    }
                }
                break;
            default:
                ((RtcNotificationReceiverImpl) this.d).a(this.c);
                break;
        }
    }

    public /* synthetic */ tw70(boolean z, com.vk.media.ok.b bVar) {
        this.c = z;
        this.d = bVar;
    }
}
