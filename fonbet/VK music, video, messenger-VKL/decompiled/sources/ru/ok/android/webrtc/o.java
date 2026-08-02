package ru.ok.android.webrtc;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.webrtc.LocalMediaStreamSource;

/* loaded from: classes9.dex */
public final class o {
    public LocalMediaStreamSource.OnScreenSizeChangedListener a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final n c = new n(this);
    public final /* synthetic */ LocalMediaStreamAdapter d;

    public o(LocalMediaStreamAdapter localMediaStreamAdapter) {
        this.d = localMediaStreamAdapter;
    }
}
