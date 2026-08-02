package ru.ok.android.webrtc.animoji.util;

import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;

/* loaded from: classes9.dex */
public final class ParticipantResolver {
    public final Call a;
    public final MappingProcessor b;

    public ParticipantResolver(Call call, MappingProcessor mappingProcessor) {
        this.a = call;
        this.b = mappingProcessor;
    }

    public final Call getCall() {
        return this.a;
    }

    public final MappingProcessor getProcessor() {
        return this.b;
    }

    public final CallParticipant.ParticipantId resolve(int i) {
        return !this.a.isGroupCall() ? this.a.getOpponentIdSafe() : this.b.query(i);
    }
}
