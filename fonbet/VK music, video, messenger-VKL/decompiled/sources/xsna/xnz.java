package xsna;

import com.vk.libvideo.design.view.live.LiveView;
import ru.ok.android.webrtc.mediarecord.AudioMonitor;

/* compiled from: LiveView.java */
/* loaded from: classes2.dex */
public final class xnz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xnz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                LiveView liveView = (LiveView) this.c;
                liveView.i.setVisibility(0);
                liveView.S = null;
                break;
            default:
                AudioMonitor.access$checkAudioState((AudioMonitor) this.c);
                break;
        }
    }
}
