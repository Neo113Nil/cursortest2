package ru.ok.android.webrtc.videotracks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.movie.MovieId;

/* loaded from: classes9.dex */
public class CallVideoTrackParticipantKey {
    public final VideoTrackType a;
    public final CallParticipant.ParticipantId b;
    public final MovieId c;

    public static class Builder {
        public CallParticipant.ParticipantId a;
        public VideoTrackType b = VideoTrackType.VIDEO;
        public MovieId c;

        public CallVideoTrackParticipantKey build() {
            Objects.requireNonNull(this.a);
            Objects.requireNonNull(this.b);
            return new CallVideoTrackParticipantKey(this);
        }

        public Builder setMovieId(@Nullable MovieId movieId) {
            this.c = movieId;
            return this;
        }

        public Builder setParticipantId(@NonNull CallParticipant.ParticipantId participantId) {
            this.a = participantId;
            return this;
        }

        public Builder setType(@NonNull VideoTrackType videoTrackType) {
            this.b = videoTrackType;
            return this;
        }
    }

    public CallVideoTrackParticipantKey(Builder builder) {
        this.a = builder.b;
        this.b = builder.a;
        this.c = builder.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CallVideoTrackParticipantKey callVideoTrackParticipantKey = (CallVideoTrackParticipantKey) obj;
            if (this.a == callVideoTrackParticipantKey.a && this.b.equals(callVideoTrackParticipantKey.b) && Objects.equals(this.c, callVideoTrackParticipantKey.c)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public MovieId getMovieId() {
        return this.c;
    }

    @NonNull
    public CallParticipant.ParticipantId getParticipantId() {
        return this.b;
    }

    @NonNull
    public VideoTrackType getType() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    @NonNull
    public String toString() {
        return "CallVideoTrackParticipantKey{" + this.b + ", type=" + this.a + ", mid=" + this.c + "}";
    }
}
