package xsna;

import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.fullscreenvideo.ControlsState;

/* compiled from: VideoTopBarView.kt */
/* loaded from: classes2.dex */
public final class q8p0 {
    public final boolean a;
    public final boolean b;
    public final VideoFile c;
    public final DonutVideoUiModel d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ControlsState.CastStatus i;

    public q8p0(boolean z, boolean z2, VideoFile videoFile, DonutVideoUiModel donutVideoUiModel, boolean z3, boolean z4, boolean z5, boolean z6, ControlsState.CastStatus castStatus) {
        this.a = z;
        this.b = z2;
        this.c = videoFile;
        this.d = donutVideoUiModel;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = castStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8p0)) {
            return false;
        }
        q8p0 q8p0Var = (q8p0) obj;
        return this.a == q8p0Var.a && this.b == q8p0Var.b && epx.f(this.c, q8p0Var.c) && epx.f(this.d, q8p0Var.d) && this.e == q8p0Var.e && this.f == q8p0Var.f && this.g == q8p0Var.g && this.h == q8p0Var.h && this.i == q8p0Var.i;
    }

    public final int hashCode() {
        int b = jq.b(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
        DonutVideoUiModel donutVideoUiModel = this.d;
        return this.i.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((b + (donutVideoUiModel == null ? 0 : donutVideoUiModel.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "TopControlsState(isLandscape=" + this.a + ", isFullscreen=" + this.b + ", videoFile=" + this.c + ", donutVideoUiModel=" + this.d + ", isShowSubscribe=" + this.e + ", isSubscribed=" + this.f + ", isAutoPlayEnabled=" + this.g + ", isAutoPlayInactive=" + this.h + ", castStatus=" + this.i + ')';
    }
}
