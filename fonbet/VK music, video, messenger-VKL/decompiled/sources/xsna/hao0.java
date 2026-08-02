package xsna;

import com.vk.ml.a;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.tensorflow.tflite.ModelDataProvider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hao0 implements ModelDataProvider {
    public final /* synthetic */ iao0 a;
    public final /* synthetic */ TensorflowModel b;

    public /* synthetic */ hao0(iao0 iao0Var, TensorflowModel tensorflowModel) {
        this.a = iao0Var;
        this.b = tensorflowModel;
    }

    @Override // ru.ok.tensorflow.tflite.ModelDataProvider
    public final ByteBuffer getModelData() {
        try {
            a.InterfaceC1280a a = com.vk.ml.a.a(this.a.b(this.b));
            try {
                FileInputStream fileInputStream = new FileInputStream(a.I3());
                try {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) new File(a.I3()).length());
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            allocateDirect.rewind();
                            fileInputStream.close();
                            jgj0.a(a);
                            return allocateDirect;
                        }
                        allocateDirect.put(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
