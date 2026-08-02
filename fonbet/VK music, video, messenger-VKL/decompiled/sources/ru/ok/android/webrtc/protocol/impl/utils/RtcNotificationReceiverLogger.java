package ru.ok.android.webrtc.protocol.impl.utils;

import androidx.annotation.NonNull;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.protocol.RtcNotificationReceiver;

/* loaded from: classes9.dex */
public class RtcNotificationReceiverLogger implements RtcNotificationReceiver.Listener {
    public final String a;
    public final RTCLog b;

    public RtcNotificationReceiverLogger(@NonNull String str, @NonNull RTCLog rTCLog) {
        if (str == null) {
            throw new IllegalArgumentException("Illegal 'tag' value: null");
        }
        if (rTCLog == null) {
            throw new IllegalArgumentException("Illegal 'logger' value: null");
        }
        this.a = str;
        this.b = rTCLog;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcNotificationReceiver.Listener
    public void onNotificationError(@NonNull Throwable th) {
        this.b.log(this.a, "<- " + th);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcNotificationReceiver.Listener
    public void onNotificationReceived(@NonNull RtcNotification rtcNotification) {
        this.b.log(this.a, "<- " + rtcNotification);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcNotificationReceiver.Listener
    public void onRtcDataReceived(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        RTCLog rTCLog = this.b;
        String str = this.a;
        StringBuilder sb = new StringBuilder("<- ");
        int i = b.a[rtcFormat.ordinal()];
        sb.append(i != 1 ? i != 2 ? "<unknown>" : Hex.toString(bArr) : new String(bArr));
        rTCLog.log(str, sb.toString());
    }
}
