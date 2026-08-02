package ru.ok.android.webrtc.signaling.participant.model;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ParticipantListType {
    public static final ParticipantListType ADMIN;
    public static final ParticipantListType GRID;
    public static final ParticipantListType SIDE;
    public static final /* synthetic */ ParticipantListType[] a;
    public static final /* synthetic */ zrp b;

    static {
        ParticipantListType participantListType = new ParticipantListType(SignalingProtocol.KEY_GRID, 0);
        GRID = participantListType;
        ParticipantListType participantListType2 = new ParticipantListType(SignalingProtocol.KEY_SIDE, 1);
        SIDE = participantListType2;
        ParticipantListType participantListType3 = new ParticipantListType("ADMIN", 2);
        ADMIN = participantListType3;
        ParticipantListType[] participantListTypeArr = {participantListType, participantListType2, participantListType3};
        a = participantListTypeArr;
        b = new asp(participantListTypeArr);
    }

    public ParticipantListType(String str, int i) {
    }

    public static zrp<ParticipantListType> getEntries() {
        return b;
    }

    public static ParticipantListType valueOf(String str) {
        return (ParticipantListType) Enum.valueOf(ParticipantListType.class, str);
    }

    public static ParticipantListType[] values() {
        return (ParticipantListType[]) a.clone();
    }
}
