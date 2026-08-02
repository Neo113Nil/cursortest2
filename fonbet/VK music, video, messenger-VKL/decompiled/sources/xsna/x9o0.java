package xsna;

import ru.ok.gl.tf.Tensorflow;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class x9o0 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ x9o0(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Tensorflow.lambda$preparePipelines$10();
                break;
            default:
                atw0.d = true;
                break;
        }
    }
}
