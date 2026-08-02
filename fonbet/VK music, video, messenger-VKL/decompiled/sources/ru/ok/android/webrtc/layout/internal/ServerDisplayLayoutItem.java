package ru.ok.android.webrtc.layout.internal;

import androidx.annotation.NonNull;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;

/* loaded from: classes9.dex */
public class ServerDisplayLayoutItem {
    public final CallVideoTrackParticipantKey a;
    public final ServerDisplayLayout b;

    public ServerDisplayLayoutItem(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, @NonNull ServerDisplayLayout serverDisplayLayout) {
        this.a = callVideoTrackParticipantKey;
        this.b = serverDisplayLayout;
    }

    @NonNull
    public ServerDisplayLayout getLayout() {
        return this.b;
    }

    @NonNull
    public CallVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.a;
    }

    public String toString() {
        return "DisplayLayoutItem{videoTrackParticipantKey=" + this.a + ", layout=" + this.b + '}';
    }
}
