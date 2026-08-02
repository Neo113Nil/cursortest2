package xsna;

import android.opengl.GLES20;
import org.chromium.base.task.PostTask;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class s230 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ s230(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                GLES20.glClear(16640);
                break;
            default:
                PostTask.sPrenativeThreadPoolExecutorForTesting = null;
                break;
        }
    }
}
