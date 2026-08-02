package ru.ok.android.webrtc.protocol;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;

/* loaded from: classes9.dex */
public interface RtcCommandSerializer {

    public static final class DeserializeResult {
        public final long commandId;

        @NonNull
        public final RtcResponse commandResponse;

        public DeserializeResult(long j, @NonNull RtcResponse rtcResponse) {
            if (rtcResponse == null) {
                throw new IllegalArgumentException("Illegal 'commandResponse' value: null");
            }
            this.commandId = j;
            this.commandResponse = rtcResponse;
        }
    }

    public static final class SerializeResult {

        @NonNull
        public final RtcFormat format;

        @NonNull
        public final byte[] value;

        public SerializeResult(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
            if (bArr == null) {
                throw new IllegalArgumentException("Illegal 'value' value: null");
            }
            if (rtcFormat == null) {
                throw new IllegalArgumentException("Illegal 'format' value: null");
            }
            this.value = bArr;
            this.format = rtcFormat;
        }
    }

    @Nullable
    DeserializeResult deserialize(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) throws RtcCommandException;

    @NonNull
    SerializeResult serialize(long j, @NonNull RtcCommand rtcCommand) throws RtcCommandException;
}
