package ru.ok.android.webrtc.topology;

import java.util.Map;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.topology.StatsCallback;
import xsna.zcl;

/* loaded from: classes9.dex */
public interface ExtendedStatsCallback extends StatsCallback {

    public static final class ExtendedStats {
        public final StatsCallback.Stats a;
        public final RTCStat b;
        public final Ssrc[] c;
        public final MediaTrackMapping[] d;
        public final Map e;
        public final CallTopology f;

        public ExtendedStats(StatsCallback.Stats stats, RTCStat rTCStat, Ssrc[] ssrcArr, MediaTrackMapping[] mediaTrackMappingArr, Map<CallParticipant.ParticipantId, ? extends ScreenshareRecvStat> map, CallTopology callTopology) {
            this.a = stats;
            this.b = rTCStat;
            this.c = ssrcArr;
            this.d = mediaTrackMappingArr;
            this.e = map;
            this.f = callTopology;
        }

        public final MediaTrackMapping[] getMediaMappings() {
            return this.d;
        }

        public final RTCStat getRtcStat() {
            return this.b;
        }

        public final Map<CallParticipant.ParticipantId, ScreenshareRecvStat> getScreenshareRecvStatMap() {
            return this.e;
        }

        public final Ssrc[] getSsrcs() {
            return this.c;
        }

        public final StatsCallback.Stats getStats() {
            return this.a;
        }

        public final CallTopology getTopology() {
            return this.f;
        }
    }

    public static final class MediaTrackMapping {
        public static final Companion Companion = new Companion(null);
        public final CallParticipant a;
        public final boolean b;

        public static final class Companion {
            public Companion(zcl zclVar) {
            }

            public final MediaTrackMapping forAudioMix() {
                return new MediaTrackMapping(null, true);
            }

            public final MediaTrackMapping forCallParticipant(CallParticipant callParticipant) {
                return new MediaTrackMapping(callParticipant, false);
            }
        }

        public MediaTrackMapping(CallParticipant callParticipant, boolean z) {
            this.a = callParticipant;
            this.b = z;
        }

        public static final MediaTrackMapping forAudioMix() {
            return Companion.forAudioMix();
        }

        public static final MediaTrackMapping forCallParticipant(CallParticipant callParticipant) {
            return Companion.forCallParticipant(callParticipant);
        }

        public final CallParticipant getCallParticipant() {
            return this.a;
        }

        public final ScreenshareRecvStat getScreenshareRecvStat() {
            return null;
        }

        public final boolean isAudioMixTrack() {
            return this.b;
        }
    }

    @Override // ru.ok.android.webrtc.topology.StatsCallback
    default void onStatsReady(StatsCallback.Stats stats) {
    }

    default void onStatsReady(ExtendedStats extendedStats) {
        onStatsReady(extendedStats.getStats());
    }
}
