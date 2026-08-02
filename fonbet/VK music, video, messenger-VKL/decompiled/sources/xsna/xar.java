package xsna;

import android.util.Log;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.webrtc.RTCLog;

/* loaded from: classes8.dex */
public final class xar {
    public static final b a = new b();
    public static volatile a b;

    public static final class a {
        public final CidLogger a;

        public a(CidLogger cidLogger) {
            this.a = cidLogger;
        }
    }

    public static final class b implements RTCLog {
        @Override // ru.ok.android.webrtc.RTCLog
        public final void logException(String str, String str2, Throwable th) {
            Log.e(str, str2, th);
        }

        @Override // ru.ok.android.webrtc.RTCLog
        public final void reportException(String str, String str2, Throwable th) {
            Log.e(str, str2, th);
        }

        @Override // ru.ok.android.webrtc.RTCLog
        public final void log(String str, String str2) {
        }
    }
}
