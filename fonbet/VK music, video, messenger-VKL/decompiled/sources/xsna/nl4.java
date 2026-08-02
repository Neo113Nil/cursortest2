package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: AudioBufferingThreadHandler.kt */
/* loaded from: classes3.dex */
public final class nl4 extends Handler {
    public final WeakReference<ml4> a;

    public nl4(Looper looper, WeakReference<ml4> weakReference) {
        super(looper);
        this.a = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ml4 ml4Var = this.a.get();
        if (ml4Var == null) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            ml4Var.d();
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) message.obj).intValue();
            ml4Var.e(ml4Var.h, new hl4(intValue, 0), new il4(ml4Var, intValue));
        } else if (i == 3) {
            el4 el4Var = (el4) message.obj;
            ml4Var.e(ml4Var.i, new d7(el4Var, 5), new jl4(0, ml4Var, el4Var));
        } else {
            throw new IllegalStateException("unknown message with type " + message.what);
        }
    }
}
