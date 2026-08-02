package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;
import defpackage.ua10;
import java.util.Objects;

/* loaded from: classes10.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver {
    private final String mAction;
    private final ua10 mCallback;
    private final Bundle mExtras;

    public MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle, ua10 ua10Var, Handler handler) {
        super(handler);
        this.mAction = str;
        this.mExtras = bundle;
        this.mCallback = ua10Var;
    }

    @Override // android.support.v4.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        if (this.mCallback == null) {
            return;
        }
        android.support.v4.media.session.c.a(bundle);
        if (i == -1) {
            this.mCallback.getClass();
            return;
        }
        if (i == 0) {
            this.mCallback.getClass();
        } else if (i == 1) {
            this.mCallback.getClass();
        } else {
            Objects.toString(this.mExtras);
            Objects.toString(bundle);
        }
    }
}
