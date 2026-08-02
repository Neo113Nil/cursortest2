package ru.ok.android.webrtc.protocol.impl.serializers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import org.msgpack.core.b;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.d;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.protocol.RtcNotificationSerializer;
import ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException;
import ru.ok.android.webrtc.protocol.impl.utils.Hex;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.protocol.notifications.AudioActivityNotification;
import ru.ok.android.webrtc.protocol.notifications.IdMappingNotification;
import ru.ok.android.webrtc.protocol.notifications.NetworkStatusNotification;
import ru.ok.android.webrtc.protocol.notifications.SpeakerChangedNotification;
import ru.ok.android.webrtc.protocol.notifications.StalledParticipantsNotification;
import ru.ok.android.webrtc.protocol.notifications.VideoQualityUpdateNotification;
import ru.ok.android.webrtc.protocol.notifications.WatchTogetherUpdateNotification;
import ru.ok.android.webrtc.protocol.notifications.handlers.videoquality.VideoQualityUpdateNotificationParser;
import ru.ok.android.webrtc.protocol.notifications.parser.WatchTogetherUpdateNotificationParser;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;

/* loaded from: classes9.dex */
public class RtcNotificationsMsgPackSerializer implements RtcNotificationSerializer {
    public final MappingProcessor a;
    public final WatchTogetherUpdateNotificationParser b;
    public final VideoQualityUpdateNotificationParser c;

    public RtcNotificationsMsgPackSerializer(@NonNull MappingProcessor mappingProcessor, @NonNull RTCLog rTCLog) {
        this.a = mappingProcessor;
        this.b = new WatchTogetherUpdateNotificationParser(mappingProcessor, rTCLog);
        this.c = new VideoQualityUpdateNotificationParser(rTCLog);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcNotificationSerializer
    @Nullable
    public RtcNotification deserialize(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) throws RtcNotificationSerializeException {
        if (bArr == null) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Illegal 'value' value: null"));
        }
        if (rtcFormat == null) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (rtcFormat != RtcFormat.BINARY) {
            throw new RtcNotificationSerializeException(new UnsupportedOperationException("Only binary format is supported"));
        }
        try {
            b.c cVar = b.c;
            cVar.getClass();
            d dVar = new d(new ArrayBufferInput(bArr), cVar);
            try {
                int i = 0;
                switch (dVar.z()) {
                    case 1:
                        int E = dVar.E();
                        HashMap hashMap = new HashMap();
                        while (i < E) {
                            CallVideoTrackParticipantKey parseVideoTrackParticipantKey = SignalingProtocol.parseVideoTrackParticipantKey(dVar.I());
                            int z = dVar.z();
                            if (parseVideoTrackParticipantKey != null) {
                                hashMap.put(Integer.valueOf(z), parseVideoTrackParticipantKey);
                            }
                            i++;
                        }
                        this.a.update(hashMap);
                        IdMappingNotification idMappingNotification = new IdMappingNotification(hashMap);
                        dVar.close();
                        return idMappingNotification;
                    case 2:
                        int x = dVar.x();
                        ArrayList arrayList = new ArrayList();
                        while (i < x) {
                            CallParticipant.ParticipantId query = this.a.query(dVar.z());
                            if (query != null) {
                                arrayList.add(query);
                            }
                            i++;
                        }
                        AudioActivityNotification audioActivityNotification = new AudioActivityNotification(arrayList);
                        dVar.close();
                        return audioActivityNotification;
                    case 3:
                        SpeakerChangedNotification speakerChangedNotification = new SpeakerChangedNotification(this.a.query(dVar.z()));
                        dVar.close();
                        return speakerChangedNotification;
                    case 4:
                        int x2 = dVar.x();
                        ArrayList arrayList2 = new ArrayList();
                        while (i < x2) {
                            CallParticipant.ParticipantId query2 = this.a.query(dVar.z());
                            if (query2 != null) {
                                arrayList2.add(query2);
                            }
                            i++;
                        }
                        StalledParticipantsNotification stalledParticipantsNotification = new StalledParticipantsNotification(arrayList2);
                        dVar.close();
                        return stalledParticipantsNotification;
                    case 5:
                        VideoQualityUpdateNotification parse = this.c.parse(dVar);
                        dVar.close();
                        return parse;
                    case 6:
                        int E2 = dVar.E();
                        HashMap hashMap2 = new HashMap();
                        while (i < E2) {
                            hashMap2.put(this.a.query(dVar.z()), Float.valueOf(dVar.z() / 100.0f));
                            i++;
                        }
                        NetworkStatusNotification networkStatusNotification = new NetworkStatusNotification(hashMap2);
                        dVar.close();
                        return networkStatusNotification;
                    case 7:
                    default:
                        dVar.close();
                        return null;
                    case 8:
                        WatchTogetherUpdateNotification parse2 = this.b.parse(dVar);
                        dVar.close();
                        return parse2;
                }
            } finally {
            }
        } catch (Throwable th) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Unable to decode notification body: " + Hex.toString(bArr), th));
        }
    }
}
