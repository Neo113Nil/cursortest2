package ru.ok.android.webrtc.topology;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;

@Deprecated
/* loaded from: classes9.dex */
public interface StatsObserver {
    public static final String KEY_AUDIO_OUTPUT_LEVEL = "audioOutputLevel";
    public static final String KEY_BYTES_RECEIVED = "bytesReceived";
    public static final String KEY_BYTES_SENT = "bytesSent";
    public static final String KEY_CODEC_IMPL_NAME = "codecImplementationName";
    public static final String KEY_GOOG_CODEC_NAME = "googCodecName";
    public static final String KEY_MEDIA_TYPE = "mediaType";
    public static final String KEY_PACKETS_LOST = "packetsLost";
    public static final String KEY_PACKETS_RECEIVED = "packetsReceived";
    public static final String KEY_PACKETS_SENT = "packetsSent";
    public static final String KEY_RTT = "googRtt";
    public static final String KEY_SSRC = "ssrc";
    public static final String KEY_TRACK_ID = "googTrackId";
    public static final String SUFFIX_RECEIVE = "_recv";
    public static final String TYPE_SSRC = "ssrc";
    public static final String VAL_AUDIO = "audio";
    public static final String VAL_VIDEO = "video";

    public static class MediaTrackMapping {
        public final CallParticipant a;
        public final boolean b;
        public volatile ScreenshareRecvStat c;

        public MediaTrackMapping(CallParticipant callParticipant, boolean z) {
            this.a = callParticipant;
            this.b = z;
        }

        public static MediaTrackMapping forAudioMix() {
            return new MediaTrackMapping(null, true);
        }

        public static MediaTrackMapping forCallParticipant(@NonNull CallParticipant callParticipant) {
            return new MediaTrackMapping(callParticipant, false);
        }

        @Nullable
        public CallParticipant getCallParticipant() {
            return this.a;
        }

        @Nullable
        public ScreenshareRecvStat getScreenshareRecvStat() {
            return this.c;
        }

        public boolean isAudioMixTrack() {
            return this.b;
        }

        public void setScreenshareRecvStat(ScreenshareRecvStat screenshareRecvStat) {
            this.c = screenshareRecvStat;
        }
    }

    void onComplete(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, MediaTrackMapping[] mediaTrackMappingArr, Map<CallParticipant.ParticipantId, ScreenshareRecvStat> map, @NonNull CallTopology callTopology);
}
