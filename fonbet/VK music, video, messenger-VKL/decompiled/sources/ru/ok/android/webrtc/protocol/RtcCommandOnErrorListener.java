package ru.ok.android.webrtc.protocol;

import androidx.annotation.NonNull;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcResponse;

/* loaded from: classes9.dex */
public interface RtcCommandOnErrorListener<Command extends RtcCommand<Response>, Response extends RtcResponse> {
    void onRtcCommandError(@NonNull Command command, @NonNull Throwable th);
}
