package ru.ok.android.externcalls.sdk.layout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.videotracks.VideoTrackType;

/* loaded from: classes9.dex */
public class ConversationVideoTrackParticipantKey {

    @Nullable
    private final MovieId movieId;

    @NonNull
    private final ParticipantId participantId;

    @NonNull
    private final VideoTrackType type;

    public static class Builder {
        private MovieId movieId;
        private ParticipantId participantId;
        private VideoTrackType type = VideoTrackType.VIDEO;

        public ConversationVideoTrackParticipantKey build() {
            Objects.requireNonNull(this.participantId);
            Objects.requireNonNull(this.type);
            return new ConversationVideoTrackParticipantKey(this, 0);
        }

        public Builder setMovieId(@Nullable MovieId movieId) {
            this.movieId = movieId;
            return this;
        }

        public Builder setParticipantId(@NonNull ParticipantId participantId) {
            this.participantId = participantId;
            return this;
        }

        public Builder setType(@NonNull VideoTrackType videoTrackType) {
            this.type = videoTrackType;
            return this;
        }
    }

    public /* synthetic */ ConversationVideoTrackParticipantKey(Builder builder, int i) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = (ConversationVideoTrackParticipantKey) obj;
            if (this.participantId.equals(conversationVideoTrackParticipantKey.participantId) && this.type == conversationVideoTrackParticipantKey.type && Objects.equals(this.movieId, conversationVideoTrackParticipantKey.movieId)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public MovieId getMovieId() {
        return this.movieId;
    }

    @NonNull
    public ParticipantId getParticipantId() {
        return this.participantId;
    }

    @NonNull
    public VideoTrackType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.participantId, this.type, this.movieId);
    }

    @NonNull
    public String toString() {
        return "ConversationVideoTrackParticipantKey{participantId=" + this.participantId + ", type=" + this.type + ", movieId=" + this.movieId + '}';
    }

    private ConversationVideoTrackParticipantKey(@NonNull Builder builder) {
        this.participantId = builder.participantId;
        this.type = builder.type;
        this.movieId = builder.movieId;
    }
}
