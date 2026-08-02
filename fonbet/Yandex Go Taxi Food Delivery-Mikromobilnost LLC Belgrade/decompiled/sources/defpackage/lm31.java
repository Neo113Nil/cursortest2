package defpackage;

import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoOutput$SourceState;
import androidx.camera.video.a;

/* loaded from: classes10.dex */
public interface lm31 {
    void a(znw0 znw0Var);

    default void b(znw0 znw0Var, Timebase timebase, boolean z) {
        a(znw0Var);
    }

    default gq60 c() {
        return w6e.b;
    }

    default gq60 d() {
        return a.f;
    }

    default void e(VideoOutput$SourceState videoOutput$SourceState) {
    }

    default yk31 f(ar7 ar7Var, int i) {
        return yk31.a;
    }

    default gq60 g() {
        return new w6e(Boolean.FALSE);
    }
}
