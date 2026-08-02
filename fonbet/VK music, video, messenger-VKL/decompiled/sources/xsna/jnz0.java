package xsna;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class jnz0 extends com.google.android.gms.internal.base.zar {
    public final /* synthetic */ knz0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnz0(knz0 knz0Var, Looper looper) {
        super(looper);
        this.a = knz0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 59);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i);
            Log.e("TransformedResultImpl", sb.toString());
            return;
        }
        cv90 cv90Var = (cv90) message.obj;
        knz0 knz0Var = this.a;
        synchronized (knz0Var.c) {
            try {
                knz0 knz0Var2 = knz0Var.a;
                exc0.i(knz0Var2);
                if (cv90Var == null) {
                    knz0Var2.d(new Status(13, "Transform returned null"));
                } else if (cv90Var instanceof gnz0) {
                    knz0Var2.d(null);
                } else {
                    synchronized (knz0Var2.c) {
                        knz0Var2.b = cv90Var;
                        knz0Var2.c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
