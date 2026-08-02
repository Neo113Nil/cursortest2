package ru.ok.android.webrtc;

import android.content.Context;
import xsna.anj;
import xsna.gp;

/* loaded from: classes9.dex */
public final class LocalMediaPermissionProvider {

    @Deprecated
    public static final String TAG = "LocalMediaPermissionProvider";
    public final Context a;
    public final RTCLog b;
    public volatile boolean c = a("android.permission.RECORD_AUDIO");
    public volatile boolean d = a("android.permission.CAMERA");

    public LocalMediaPermissionProvider(Context context, RTCLog rTCLog) {
        this.a = context;
        this.b = rTCLog;
    }

    public final boolean a(String str) {
        return anj.a(this.a, str) == 0;
    }

    public final boolean isAnyPemissionGranted() {
        if (this.d || this.c) {
            return true;
        }
        if (update()) {
            return this.d || this.c;
        }
        return false;
    }

    public final boolean isCameraPermissionGranted() {
        return this.d;
    }

    public final boolean isMicrophonePermissionGranted() {
        return this.c;
    }

    public final boolean update() {
        boolean z;
        boolean a = a("android.permission.RECORD_AUDIO");
        boolean a2 = a("android.permission.CAMERA");
        RTCLog rTCLog = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        StringBuilder c = gp.c("call permissions state updated, audio: ", "->", ", video: ", z2, a);
        c.append(z3);
        c.append("->");
        c.append(a2);
        rTCLog.log(TAG, c.toString());
        if (this.c != a) {
            this.c = a;
            z = true;
        } else {
            z = false;
        }
        if (this.d == a2) {
            return z;
        }
        this.d = a2;
        return true;
    }
}
