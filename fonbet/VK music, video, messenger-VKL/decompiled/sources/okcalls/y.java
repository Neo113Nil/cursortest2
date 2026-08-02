package okcalls;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes8.dex */
public final /* synthetic */ class y extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        return ((CallParticipants) this.receiver).getActiveRoomId();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        ((CallParticipants) this.receiver).setActiveRoomId((SessionRoomId) obj);
    }
}
