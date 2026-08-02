package ru.ok.android.externcalls.sdk.record;

import java.util.Map;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.gzs;
import xsna.izs;
import xsna.pzl;
import xsna.s3q0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: RecordManager.kt */
/* loaded from: classes9.dex */
public interface RecordManager {

    /* compiled from: RecordManager.kt */
    public static class RecordError extends RuntimeException {
        private final String errorJson;
        private final String errorMessage;

        public RecordError(String str, String str2, String str3) {
            super(pzl.b(str, " ", str3));
            this.errorJson = str2;
            this.errorMessage = str3;
        }

        public final String getErrorJson() {
            return this.errorJson;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }

    /* compiled from: RecordManager.kt */
    public static final class RecordStartError extends RecordError {
        public RecordStartError(String str, String str2) {
            super("Can't start record", str, str2);
        }
    }

    /* compiled from: RecordManager.kt */
    public static final class RecordStopError extends RecordError {
        public RecordStopError(String str, String str2) {
            super("Can't stop record", str, str2);
        }
    }

    /* compiled from: RecordManager.kt */
    public static final class StartParams {
        private final String albumId;
        private final CharSequence description;
        private final Long groupId;
        private final boolean isStream;
        private final Long movieId;
        private final CharSequence name;
        private final izs<Throwable, s3q0> onError;
        private final izs<StartRecordInfo, s3q0> onSuccess;
        private final String privacy;
        private final SessionRoomId sessionRoomId;

        public /* synthetic */ StartParams(boolean z, Long l, String str, SessionRoomId sessionRoomId, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, izs izsVar, izs izsVar2, zcl zclVar) {
            this(z, l, str, sessionRoomId, charSequence, charSequence2, l2, str2, izsVar, izsVar2);
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final CharSequence getDescription() {
            return this.description;
        }

        public final Long getGroupId() {
            return this.groupId;
        }

        public final Long getMovieId() {
            return this.movieId;
        }

        public final CharSequence getName() {
            return this.name;
        }

        public final izs<Throwable, s3q0> getOnError() {
            return this.onError;
        }

        public final izs<StartRecordInfo, s3q0> getOnSuccess() {
            return this.onSuccess;
        }

        public final String getPrivacy() {
            return this.privacy;
        }

        public final SessionRoomId getSessionRoomId() {
            return this.sessionRoomId;
        }

        public final boolean isStream() {
            return this.isStream;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private StartParams(boolean z, Long l, String str, SessionRoomId sessionRoomId, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, izs<? super StartRecordInfo, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
            this.isStream = z;
            this.movieId = l;
            this.albumId = str;
            this.sessionRoomId = sessionRoomId;
            this.name = charSequence;
            this.description = charSequence2;
            this.groupId = l2;
            this.privacy = str2;
            this.onSuccess = izsVar;
            this.onError = izsVar2;
        }

        /* compiled from: RecordManager.kt */
        public static final class Builder {
            private String albumId;
            private Long groupId;
            private boolean isStream;
            private Long movieId;
            private CharSequence name;
            private izs<? super Throwable, s3q0> onError;
            private izs<? super StartRecordInfo, s3q0> onSuccess;
            private SessionRoomId sessionRoomId;
            private CharSequence description = "";
            private String privacy = Privacy.PUBLIC;

            public final StartParams build() {
                boolean z = this.isStream;
                Long l = this.movieId;
                SessionRoomId sessionRoomId = this.sessionRoomId;
                CharSequence charSequence = this.name;
                CharSequence charSequence2 = this.description;
                String str = this.privacy;
                return new StartParams(z, l, this.albumId, sessionRoomId, charSequence, charSequence2, this.groupId, str, this.onSuccess, this.onError, null);
            }

            public final Builder isStream(boolean z) {
                this.isStream = z;
                return this;
            }

            public final Builder withAlbumId(String str) {
                this.albumId = str;
                return this;
            }

            public final Builder withCallOnError(izs<? super Throwable, s3q0> izsVar) {
                this.onError = izsVar;
                return this;
            }

            public final Builder withCallOnSuccess(izs<? super StartRecordInfo, s3q0> izsVar) {
                this.onSuccess = izsVar;
                return this;
            }

            public final Builder withDescription(CharSequence charSequence) {
                this.description = charSequence;
                return this;
            }

            public final Builder withGroupId(Long l) {
                this.groupId = l;
                return this;
            }

            public final Builder withMovieId(Long l) {
                this.movieId = l;
                return this;
            }

            public final Builder withName(CharSequence charSequence) {
                this.name = charSequence;
                return this;
            }

            public final Builder withPrivacy(String str) {
                this.privacy = str;
                return this;
            }

            public final Builder withSessionRoomId(SessionRoomId sessionRoomId) {
                this.sessionRoomId = sessionRoomId;
                return this;
            }

            private static /* synthetic */ void getPrivacy$annotations() {
            }
        }
    }

    /* compiled from: RecordManager.kt */
    public static final class StartRecordInfo {
    }

    /* compiled from: RecordManager.kt */
    public static final class StopParams {
        private final izs<Throwable, s3q0> onError;
        private final izs<StopRecordInfo, s3q0> onSuccess;
        private final boolean removeRecord;
        private final SessionRoomId sessionRoomId;

        public StopParams() {
            this(null, false, null, null, 15, null);
        }

        public final izs<Throwable, s3q0> getOnError() {
            return this.onError;
        }

        public final izs<StopRecordInfo, s3q0> getOnSuccess() {
            return this.onSuccess;
        }

        public final boolean getRemoveRecord() {
            return this.removeRecord;
        }

        public final SessionRoomId getSessionRoomId() {
            return this.sessionRoomId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StopParams(SessionRoomId sessionRoomId, boolean z, izs<? super StopRecordInfo, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
            this.sessionRoomId = sessionRoomId;
            this.removeRecord = z;
            this.onSuccess = izsVar;
            this.onError = izsVar2;
        }

        public /* synthetic */ StopParams(SessionRoomId sessionRoomId, boolean z, izs izsVar, izs izsVar2, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : sessionRoomId, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : izsVar, (i & 8) != 0 ? null : izsVar2);
        }
    }

    /* compiled from: RecordManager.kt */
    public static final class StopRecordInfo {
        private final RemoveResult removeResult;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RecordManager.kt */
        public static final class RemoveResult {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ RemoveResult[] $VALUES;
            public static final RemoveResult NOT_REQUESTED = new RemoveResult("NOT_REQUESTED", 0);
            public static final RemoveResult REMOVED = new RemoveResult(SignalingProtocol.HUNGUP_REASON_REMOVED, 1);
            public static final RemoveResult NOT_SUPPORTED = new RemoveResult("NOT_SUPPORTED", 2);
            public static final RemoveResult NOT_REMOVED = new RemoveResult("NOT_REMOVED", 3);

            private static final /* synthetic */ RemoveResult[] $values() {
                return new RemoveResult[]{NOT_REQUESTED, REMOVED, NOT_SUPPORTED, NOT_REMOVED};
            }

            static {
                RemoveResult[] $values = $values();
                $VALUES = $values;
                $ENTRIES = new asp($values);
            }

            private RemoveResult(String str, int i) {
            }

            public static zrp<RemoveResult> getEntries() {
                return $ENTRIES;
            }

            public static RemoveResult valueOf(String str) {
                return (RemoveResult) Enum.valueOf(RemoveResult.class, str);
            }

            public static RemoveResult[] values() {
                return (RemoveResult[]) $VALUES.clone();
            }
        }

        public StopRecordInfo(RemoveResult removeResult) {
            this.removeResult = removeResult;
        }

        public static /* synthetic */ StopRecordInfo copy$default(StopRecordInfo stopRecordInfo, RemoveResult removeResult, int i, Object obj) {
            if ((i & 1) != 0) {
                removeResult = stopRecordInfo.removeResult;
            }
            return stopRecordInfo.copy(removeResult);
        }

        public final RemoveResult component1() {
            return this.removeResult;
        }

        public final StopRecordInfo copy(RemoveResult removeResult) {
            return new StopRecordInfo(removeResult);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopRecordInfo) && this.removeResult == ((StopRecordInfo) obj).removeResult;
        }

        public final RemoveResult getRemoveResult() {
            return this.removeResult;
        }

        public int hashCode() {
            return this.removeResult.hashCode();
        }

        public String toString() {
            return "StopRecordInfo(removeResult=" + this.removeResult + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void startRecord$default(RecordManager recordManager, StartParams startParams, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRecord");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        recordManager.startRecord(startParams, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void stopRecord$default(RecordManager recordManager, StopParams stopParams, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecord");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        recordManager.stopRecord(stopParams, gzsVar, izsVar);
    }

    void addRecordListener(RecordEventListener recordEventListener);

    RecordDescription getRecordDescription();

    Map<SessionRoomId, RecordDescriptionHistory> getRecordDescriptionHistory();

    void removeRecordListener(RecordEventListener recordEventListener);

    void startRecord(StartParams startParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void stopRecord(StopParams stopParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
