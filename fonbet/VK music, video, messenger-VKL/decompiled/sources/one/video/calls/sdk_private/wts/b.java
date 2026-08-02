package one.video.calls.sdk_private.wts;

import one.video.calls.sdk.net.signaling.wt.nal.NALLog;
import ru.ok.android.webrtc.RTCLog;

/* compiled from: r8-map-id-b60fecdec90728a8a3a0c07eda950c1720c8e7dcb79a20187f93a68f412a0d42 */
/* loaded from: classes8.dex */
public final class b implements NALLog {
    public final /* synthetic */ RTCLog a;

    public b(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALLog
    public final void log(String str, String str2) {
        this.a.log(str, str2);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALLog
    public final void logException(String str, String str2, Throwable th) {
        this.a.logException(str, str2, th);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALLog
    public final void reportException(String str, String str2, Throwable th) {
        this.a.reportException(str, str2, th);
    }
}
