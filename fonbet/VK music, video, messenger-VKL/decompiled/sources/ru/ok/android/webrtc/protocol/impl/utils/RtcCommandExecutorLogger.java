package ru.ok.android.webrtc.protocol.impl.utils;

import androidx.annotation.NonNull;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcResponse;

/* loaded from: classes9.dex */
public class RtcCommandExecutorLogger implements RtcCommandExecutor.Listener {
    public final String a;
    public final RTCLog b;
    public final AtomicLong c = new AtomicLong(1);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public RtcCommandExecutorLogger(@NonNull String str, @NonNull RTCLog rTCLog) {
        if (str == null) {
            throw new IllegalArgumentException("Illegal 'tag' value: null");
        }
        if (rTCLog == null) {
            throw new IllegalArgumentException("Illegal 'logger' value: null");
        }
        this.a = str;
        this.b = rTCLog;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor.Listener
    public void onRtcCommandError(@NonNull RtcCommand<?> rtcCommand, @NonNull Throwable th) {
        Long l = (Long) this.d.get(rtcCommand);
        if (l != null) {
            this.b.log(this.a, "<- [" + l + "]: " + th);
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor.Listener
    public void onRtcCommandRemoved(@NonNull RtcCommand<?> rtcCommand) {
        this.d.remove(rtcCommand);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor.Listener
    public void onRtcCommandSent(@NonNull RtcCommand<?> rtcCommand) {
        Long l = (Long) this.d.get(rtcCommand);
        if (l != null) {
            this.b.log(this.a, "-> [" + l + "]: " + rtcCommand);
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor.Listener
    public void onRtcCommandSubmit(@NonNull RtcCommand<?> rtcCommand) {
        this.d.put(rtcCommand, Long.valueOf(this.c.getAndIncrement()));
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor.Listener
    public void onRtcCommandSuccess(@NonNull RtcCommand<?> rtcCommand, @NonNull RtcResponse rtcResponse) {
        Long l = (Long) this.d.get(rtcCommand);
        if (l != null) {
            this.b.log(this.a, "<- [" + l + "]: " + rtcResponse);
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor.Listener
    public void onRtcDataReceived(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        RTCLog rTCLog = this.b;
        String str = this.a;
        StringBuilder sb = new StringBuilder("<- ");
        int i = a.a[rtcFormat.ordinal()];
        sb.append(i != 1 ? i != 2 ? "<unknown>" : Hex.toString(bArr) : new String(bArr));
        rTCLog.log(str, sb.toString());
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor.Listener
    public void onRtcDataSent(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        RTCLog rTCLog = this.b;
        String str = this.a;
        StringBuilder sb = new StringBuilder("-> ");
        int i = a.a[rtcFormat.ordinal()];
        sb.append(i != 1 ? i != 2 ? "<unknown>" : Hex.toString(bArr) : new String(bArr));
        rTCLog.log(str, sb.toString());
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor.Listener
    public void onRtcCommandError(@NonNull Throwable th) {
        this.b.log(this.a, "<- [?]: " + th);
    }
}
