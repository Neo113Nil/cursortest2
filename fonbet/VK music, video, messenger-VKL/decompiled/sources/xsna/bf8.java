package xsna;

import android.text.TextUtils;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.live.api.view.BroadcastContract$State;

/* compiled from: BroadcastErrorPresenter.java */
/* loaded from: classes3.dex */
public final class bf8 implements ze8 {
    public qh8 b;

    @Override // xsna.ze8
    public final void cancel() {
        qh8 qh8Var = this.b;
        if (qh8Var != null) {
            qh8Var.close();
        }
    }

    @Override // xsna.ze8
    public final void e() {
        VideoFile videoFile;
        qh8 qh8Var = this.b;
        if (qh8Var == null || (videoFile = qh8Var.m) == null || TextUtils.isEmpty(videoFile.C3())) {
            return;
        }
        r6m.a.getClass();
        if (!r6m.j()) {
            cvk.w("Проверьте подключение", false);
            return;
        }
        qh8Var.X = false;
        qh8Var.g.S(false);
        qh8Var.Q(BroadcastContract$State.LIVE);
        qh8Var.d();
        qh8Var.W(500L);
        qh8Var.a2();
        qh8Var.v2();
        qh8Var.u2(false);
    }

    @Override // xsna.pk6
    public final void start() {
    }
}
