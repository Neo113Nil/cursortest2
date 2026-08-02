package com.yandex.messaging.input.voice.record.api;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.VMInspector.OpenList;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u000b\f\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder;", "", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Listener;", "listener", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Subscription;", "startAndSubscribe", "(Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Listener;)Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Subscription;", "Lzy11;", OpenList.STR_OPEN, "()V", "close", "Listener", "Result", "Subscription", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VoiceRecorder {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Listener;", "", "Lzy11;", "onRecordingStarted", "()V", "onRecognitionStarted", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result;", TarifficatorScenarioActivity.RESULT_KEY, "onRecordingFinished", "(Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result;)V", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onRecognitionStarted();

        void onRecordingFinished(Result result);

        void onRecordingStarted();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Subscription;", "", "Lzy11;", "cancel", "()V", "close", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Subscription {
        void cancel();

        void close();
    }

    void close();

    void open();

    Subscription startAndSubscribe(Listener listener);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result;", "", "isIntrinsic", "", "<init>", "(Z)V", "()Z", "VoiceRecord", "Cancel", "IntrinsicCancel", "Error", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result$Cancel;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result$Error;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result$IntrinsicCancel;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result$VoiceRecord;", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Result {
        private final boolean isIntrinsic;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result$Cancel;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Cancel extends Result {
            public static final Cancel INSTANCE = new Cancel();

            private Cancel() {
                super(false, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Cancel);
            }

            public int hashCode() {
                return -1938257290;
            }

            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result$Error;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends Result {
            public static final Error INSTANCE = new Error();

            private Error() {
                super(true, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -1999829364;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result$IntrinsicCancel;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class IntrinsicCancel extends Result {
            public static final IntrinsicCancel INSTANCE = new IntrinsicCancel();

            private IntrinsicCancel() {
                super(true, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof IntrinsicCancel);
            }

            public int hashCode() {
                return 677798755;
            }

            public String toString() {
                return "IntrinsicCancel";
            }
        }

        private Result(boolean z) {
            this.isIntrinsic = z;
        }

        /* renamed from: isIntrinsic, reason: from getter */
        public final boolean getIsIntrinsic() {
            return this.isIntrinsic;
        }

        public /* synthetic */ Result(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000f\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result$VoiceRecord;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder$Result;", "fileCacheId", "", "durationInMills", "", "wasRecognized", "", "recognizedText", "waveform", "", "isOvertime", "disabledRecognition", "<init>", "(Ljava/lang/String;JZLjava/lang/String;[BZZ)V", "getFileCacheId", "()Ljava/lang/String;", "getDurationInMills", "()J", "getWasRecognized", "()Z", "getRecognizedText", "getWaveform", "()[B", "getDisabledRecognition", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class VoiceRecord extends Result {
            private final boolean disabledRecognition;
            private final long durationInMills;
            private final String fileCacheId;
            private final boolean isOvertime;
            private final String recognizedText;
            private final boolean wasRecognized;
            private final byte[] waveform;

            public VoiceRecord(String str, long j, boolean z, String str2, byte[] bArr, boolean z2, boolean z3) {
                super(z2, null);
                this.fileCacheId = str;
                this.durationInMills = j;
                this.wasRecognized = z;
                this.recognizedText = str2;
                this.waveform = bArr;
                this.isOvertime = z2;
                this.disabledRecognition = z3;
            }

            public final boolean getDisabledRecognition() {
                return this.disabledRecognition;
            }

            public final long getDurationInMills() {
                return this.durationInMills;
            }

            public final String getFileCacheId() {
                return this.fileCacheId;
            }

            public final String getRecognizedText() {
                return this.recognizedText;
            }

            public final boolean getWasRecognized() {
                return this.wasRecognized;
            }

            public final byte[] getWaveform() {
                return this.waveform;
            }

            /* renamed from: isOvertime, reason: from getter */
            public final boolean getIsOvertime() {
                return this.isOvertime;
            }

            public /* synthetic */ VoiceRecord(String str, long j, boolean z, String str2, byte[] bArr, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, j, z, str2, bArr, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3);
            }
        }
    }
}
