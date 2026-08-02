package defpackage;

import org.webrtc.EglThread;

/* loaded from: classes4.dex */
public final /* synthetic */ class fqn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EglThread b;

    public /* synthetic */ fqn(EglThread eglThread, int i) {
        this.a = i;
        this.b = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EglThread eglThread = this.b;
        switch (i) {
            case 0:
                eglThread.lambda$onRenderWindowOpen$2();
                break;
            default:
                eglThread.lambda$onRenderWindowClose$3();
                break;
        }
    }
}
