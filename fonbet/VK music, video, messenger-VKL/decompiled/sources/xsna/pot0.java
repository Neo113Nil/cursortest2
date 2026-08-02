package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: VideoUploadSnackBarManager.kt */
/* loaded from: classes.dex */
public final class pot0 implements e5z {
    public final /* synthetic */ qot0 b;

    public pot0(qot0 qot0Var) {
        this.b = qot0Var;
    }

    @androidx.lifecycle.o(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        qot0 qot0Var = this.b;
        if (qot0Var.p) {
            return;
        }
        qot0Var.o = null;
        qot0Var.p = true;
    }
}
