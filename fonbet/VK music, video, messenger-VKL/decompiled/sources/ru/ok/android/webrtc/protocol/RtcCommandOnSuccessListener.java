package ru.ok.android.webrtc.protocol;

import androidx.annotation.NonNull;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcResponse;

/* loaded from: classes9.dex */
public interface RtcCommandOnSuccessListener<Command extends RtcCommand<Response>, Response extends RtcResponse> {
    void onRtcCommandSuccess(@NonNull Command command, @NonNull Response response);
}
