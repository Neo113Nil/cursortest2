package xsna;

import android.content.Context;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: VkWorkoutWidgetManagerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class x2w0 implements w2w0 {
    public final t2w0 a;

    public x2w0(t2w0 t2w0Var) {
        this.a = t2w0Var;
    }

    @Override // xsna.w2w0
    public final void a() {
        this.a.a();
    }

    @Override // xsna.w2w0
    public final void b(Context context) {
        this.a.b(context);
    }

    @Override // xsna.w2w0
    public final void c() {
        this.a.c(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
    }
}
