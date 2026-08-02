package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.gf10;

/* loaded from: classes10.dex */
final class MediaSessionCompat$RegistrationCallbackHandler extends Handler {
    private static final int MSG_CALLBACK_REGISTERED = 1001;
    private static final int MSG_CALLBACK_UNREGISTERED = 1002;
    private final gf10 mCallback;

    public MediaSessionCompat$RegistrationCallbackHandler(Looper looper, gf10 gf10Var) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 1001) {
            throw null;
        }
        if (i == 1002) {
            throw null;
        }
    }

    public void postCallbackRegistered(int i, int i2) {
        obtainMessage(1001, i, i2).sendToTarget();
    }

    public void postCallbackUnregistered(int i, int i2) {
        obtainMessage(1002, i, i2).sendToTarget();
    }
}
