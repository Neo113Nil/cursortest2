package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class j63 implements xv {
    public final m63 a(Looper looper, Handler.Callback callback) {
        return new m63(new Handler(looper, callback));
    }
}
