package okcalls;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import ru.ok.android.webrtc.signaling.sessionroom.event.SignalingSessionRooms;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final /* synthetic */ class e0 extends FunctionReferenceImpl implements izs {
    public e0(CallSessionRoomsManager callSessionRoomsManager) {
        super(1, callSessionRoomsManager, CallSessionRoomsManager.class, "onAllRoomsLoaded", "onAllRoomsLoaded(Lru/ok/android/webrtc/signaling/sessionroom/event/SignalingSessionRooms;)V", 0);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ((CallSessionRoomsManager) this.receiver).onRoomsState((SignalingSessionRooms) obj);
        return s3q0.a;
    }
}
