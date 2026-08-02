package xsna;

import android.os.Handler;
import android.os.Message;
import com.vk.core.snackbar.HideReason;
import xsna.flv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class elv0 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        Object obj = flv0.a;
        flv0.b bVar = (flv0.b) message.obj;
        synchronized (flv0.a) {
            try {
                if (!epx.f(flv0.c, bVar)) {
                    if (epx.f(flv0.d, bVar)) {
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                flv0.a(bVar, HideReason.Timeout);
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
