package xsna;

import android.os.Handler;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.data.b;
import xsna.am9;

/* compiled from: ClipsCountDownController.kt */
/* loaded from: classes16.dex */
public final class iod implements StopwatchView.a {
    public final CameraUIView b;
    public final com.vk.cameraui.impl.a c;
    public final jpd d;
    public int e;
    public boolean f;
    public rxo0 g;
    public int h;
    public final bpn0 i = new bpn0(new kr6(3));
    public final bpn0 j = new bpn0(new d4(9));
    public final gs2 k = new gs2(this, 7);
    public final hod l = new hod(this, 0);

    public iod(CameraUIView cameraUIView, com.vk.cameraui.impl.a aVar, jpd jpdVar) {
        this.b = cameraUIView;
        this.c = aVar;
        this.d = jpdVar;
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void a(StopwatchView stopwatchView) {
        rxo0 rxo0Var = this.g;
        if (rxo0Var != null && !rxo0Var.b.get()) {
            rxo0Var.e.post(new kl2(rxo0Var, 10));
        }
        this.b.setCountDownLayoutVisible(false);
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void b(StopwatchView stopwatchView) {
        rxo0 rxo0Var = this.g;
        if (rxo0Var != null && !rxo0Var.b.get()) {
            rxo0Var.e.post(new tnf(rxo0Var, 13));
        }
        this.b.E0(this);
        f4m.j(stopwatchView);
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void c() {
        rxo0 rxo0Var = this.g;
        if (rxo0Var == null || rxo0Var.b.get()) {
            return;
        }
        rxo0Var.e.post(new id(rxo0Var, 12));
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void d(StopwatchView stopwatchView) {
        rxo0 rxo0Var = this.g;
        if (rxo0Var != null && !rxo0Var.b.get()) {
            rxo0Var.e.post(new id(rxo0Var, 12));
        }
        stopwatchView.setVisibility(0);
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void f(StopwatchView stopwatchView) {
        f4m.j(stopwatchView);
    }

    public final void g() {
        int i = this.h;
        this.b.E0(this);
        h();
        nf9 nf9Var = nf9.b;
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
        b.d b = nf9.b(nf9Var, StoryPublishEvent.CANCEL_TIMER, aVar, null, null, true, null, 108);
        b.b(Integer.valueOf(i), "countdown");
        b.e();
    }

    public final void h() {
        CameraUIView cameraUIView = this.b;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter != null) {
            presenter.t4(true, false);
        }
        this.c.i.W = false;
        bpn0 bpn0Var = this.j;
        ((Handler) bpn0Var.getValue()).removeCallbacks(this.l);
        ((Handler) bpn0Var.getValue()).removeCallbacks(this.k);
        this.d.u(true);
        cameraUIView.setCountDownLayoutVisible(false);
    }

    public final void i(int i, boolean z, Integer num) {
        CameraUIView cameraUIView = this.b;
        if (!z) {
            rxo0 rxo0Var = this.g;
            if (rxo0Var != null) {
                rxo0Var.b.set(true);
                rxo0Var.d.quitSafely();
                rxo0Var.a.release();
            }
            this.g = null;
        } else if (this.g == null) {
            this.g = new rxo0(cameraUIView.getContext());
        }
        this.f = z;
        jpd jpdVar = this.d;
        jpdVar.s = i;
        jpdVar.c.setClipsCountDownMarker(i != 0 ? Long.valueOf(i) : null);
        if (num != null) {
            this.e = num.intValue();
            lmv clipsControls = cameraUIView.getClipsControls();
            if (clipsControls != null) {
                clipsControls.setCountDownIcon(num.intValue());
            }
        }
    }

    @Override // com.vk.clips.design.view.recording.StopwatchView.a
    public final void e() {
    }
}
