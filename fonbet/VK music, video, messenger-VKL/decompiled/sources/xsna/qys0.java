package xsna;

import com.vk.libvideo.autoplay.AutoPlayMinifiedState;

/* compiled from: VideoNotificationTaskRemovedCallback.kt */
/* loaded from: classes2.dex */
public final class qys0 implements y4s0 {
    public yg5 a;

    @Override // xsna.y4s0
    public final void onTaskRemoved() {
        yg5 yg5Var;
        yg5 yg5Var2 = this.a;
        if ((yg5Var2 != null ? yg5Var2.R0() : null) == AutoPlayMinifiedState.PIP || (yg5Var = this.a) == null) {
            return;
        }
        yg5Var.C(true);
    }
}
