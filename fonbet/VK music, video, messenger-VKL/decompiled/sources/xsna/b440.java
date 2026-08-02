package xsna;

import android.os.Handler;
import android.os.Message;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.tensorflow.visualization.MultiBoxVisualizer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class b440 implements Handler.Callback {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b440(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean accept;
        boolean handleTensorflow;
        switch (this.b) {
            case 0:
                accept = ((MultiBoxVisualizer) this.c).accept(message);
                return accept;
            default:
                handleTensorflow = ((Tensorflow) this.c).handleTensorflow(message);
                return handleTensorflow;
        }
    }
}
