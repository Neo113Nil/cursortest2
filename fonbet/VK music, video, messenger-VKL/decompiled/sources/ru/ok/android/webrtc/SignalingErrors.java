package ru.ok.android.webrtc;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public final class SignalingErrors {
    public static final String CALL_UNFEASIBLE = "call-unfeasible";
    public static final String CONVERSATION_ENDED = "conversation-ended";
    public static final String CONVERSATION_NOT_FOUND = "conversation-not-found";
    public static final String CONVERSATION_RECORDING = "conversation-recording";
    public static final String FEATURE_IS_DISABLED = "feature-is-disabled";
    public static final String ILLEGAL_CONVERSATION_STATE = "illegal-conversation-state";
    public static final String ILLEGAL_PARTICIPANT_STATE = "illegal-participant-state";
    public static final String INTERNAL_ERROR = "internal-error";
    public static final String INVALID_REQUEST = "invalid-request";
    public static final String INVALID_TOKEN = "invalid-token";
    public static final String NO_CALL = "no-call";
    public static final String PARTICIPANTS_LIMIT_REACHED = "participants-limit-reached";
    public static final String PARTICIPANT_NOT_FOUND = "participant-not-found";
    public static final String SERVICE_UNAVAILABLE = "service-unavailable";

    public static final class CallIsUnfeasibleError extends GenericError {
        public final CallFeasibilityStatus status;

        public CallIsUnfeasibleError(CallFeasibilityStatus callFeasibilityStatus, String str, long j, long j2) {
            super("call-unfeasible", str, j, j2);
            this.status = callFeasibilityStatus;
        }
    }

    public static class GenericError extends Exception {
        public final long seq;
        public final long stamp;

        @NonNull
        public final String type;

        public GenericError(@NonNull String str, String str2, long j, long j2) {
            super(str2);
            this.type = str;
            this.stamp = j;
            this.seq = j2;
        }
    }

    public static final class RecordError extends GenericError {
        public final String description;
        public final long recordMovieId;

        public RecordError(String str, long j, String str2, long j2, long j3) {
            super("conversation-recording", str2, j2, j3);
            this.description = str;
            this.recordMovieId = j;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }
}
