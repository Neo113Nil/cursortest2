package ru.ok.android.webrtc.signaling.sessionroom.event;

import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.asr.CallAsrInfo;
import ru.ok.android.webrtc.signaling.participant.model.SignalingParticipantListChunk;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordInfo;
import ru.ok.android.webrtc.signaling.urlsharing.SignalingUrlSharingInfo;

/* loaded from: classes9.dex */
public final class SignalingSessionRoom {
    public final int a;
    public final String b;
    public final Boolean c;
    public final List d;
    public final List e;
    public final List f;
    public final Integer g;
    public final Long h;
    public final Integer i;
    public final SignalingRecordInfo j;
    public final CallAsrInfo k;
    public final Map l;
    public final SignalingParticipantListChunk m;
    public final CallParticipant.ParticipantId n;
    public final SignalingUrlSharingInfo o;

    public SignalingSessionRoom(int i, String str, Boolean bool, List<CallParticipant.ParticipantId> list, List<CallParticipant.ParticipantId> list2, List<CallParticipant.ParticipantId> list3, Integer num, Long l, Integer num2, SignalingRecordInfo signalingRecordInfo, CallAsrInfo callAsrInfo, Map<MediaOption, ? extends MediaOptionState> map, SignalingParticipantListChunk signalingParticipantListChunk, CallParticipant.ParticipantId participantId, SignalingUrlSharingInfo signalingUrlSharingInfo) {
        this.a = i;
        this.b = str;
        this.c = bool;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = num;
        this.h = l;
        this.i = num2;
        this.j = signalingRecordInfo;
        this.k = callAsrInfo;
        this.l = map;
        this.m = signalingParticipantListChunk;
        this.n = participantId;
        this.o = signalingUrlSharingInfo;
    }

    public final List<CallParticipant.ParticipantId> getAddParticipantIds() {
        return this.e;
    }

    public final CallAsrInfo getAsrRecordInfo() {
        return this.k;
    }

    public final Integer getCountdownSec() {
        return this.g;
    }

    public final int getId() {
        return this.a;
    }

    public final Map<MediaOption, MediaOptionState> getMuteStates() {
        return this.l;
    }

    public final String getName() {
        return this.b;
    }

    public final Integer getParticipantCount() {
        return this.i;
    }

    public final List<CallParticipant.ParticipantId> getParticipantIds() {
        return this.d;
    }

    public final SignalingParticipantListChunk getParticipants() {
        return this.m;
    }

    public final CallParticipant.ParticipantId getPinnedParticipantId() {
        return this.n;
    }

    public final SignalingRecordInfo getRecordInfo() {
        return this.j;
    }

    public final List<CallParticipant.ParticipantId> getRemoveParticipantIds() {
        return this.f;
    }

    public final Long getTimeoutMs() {
        return this.h;
    }

    public final SignalingUrlSharingInfo getUrlSharingInfo() {
        return this.o;
    }

    public final Boolean isActive() {
        return this.c;
    }
}
