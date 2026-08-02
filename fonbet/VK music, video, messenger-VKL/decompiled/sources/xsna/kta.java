package xsna;

import java.util.concurrent.locks.ReentrantLock;
import ru.ok.gl.tf.TensorflowModel;

/* compiled from: ChangeableEncryptionTensorflowLoader.kt */
/* loaded from: classes3.dex */
public final class kta {
    public final gzs<Boolean> a;
    public final gzs<TensorflowModel[]> b;
    public final ReentrantLock c = new ReentrantLock();
    public boolean d;
    public iao0 e;

    public kta(gzs<Boolean> gzsVar, gzs<TensorflowModel[]> gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    public final iao0 a() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            boolean booleanValue = this.a.invoke().booleanValue();
            iao0 iao0Var = this.e;
            if (iao0Var != null && this.d == booleanValue) {
                return iao0Var;
            }
            iao0 iao0Var2 = new iao0(booleanValue, this.b.invoke());
            this.e = iao0Var2;
            this.d = booleanValue;
            return iao0Var2;
        } finally {
            reentrantLock.unlock();
        }
    }
}
