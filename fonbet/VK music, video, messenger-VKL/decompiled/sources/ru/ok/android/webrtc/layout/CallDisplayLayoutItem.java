package ru.ok.android.webrtc.layout;

import androidx.annotation.NonNull;
import java.util.Objects;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;

/* loaded from: classes9.dex */
public final class CallDisplayLayoutItem {
    public final CallVideoTrackParticipantKey a;
    public final VideoDisplayLayout b;

    public CallDisplayLayoutItem(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, @NonNull VideoDisplayLayout videoDisplayLayout) {
        this.a = callVideoTrackParticipantKey;
        this.b = videoDisplayLayout;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CallDisplayLayoutItem.class == obj.getClass()) {
            CallDisplayLayoutItem callDisplayLayoutItem = (CallDisplayLayoutItem) obj;
            if (this.a.equals(callDisplayLayoutItem.a) && this.b.equals(callDisplayLayoutItem.b)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public VideoDisplayLayout getLayout() {
        return this.b;
    }

    @NonNull
    public CallVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        return "DisplayLayoutItem{videoTrackParticipantKey=" + this.a + ", layout=" + this.b + '}';
    }
}
