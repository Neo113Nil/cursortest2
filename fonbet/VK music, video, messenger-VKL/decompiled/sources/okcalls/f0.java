package okcalls;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final /* synthetic */ class f0 extends FunctionReferenceImpl implements izs {
    public f0(CallSessionRoomsManager callSessionRoomsManager) {
        super(1, callSessionRoomsManager, CallSessionRoomsManager.class, "onAllRoomsLoadError", "onAllRoomsLoadError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ((CallSessionRoomsManager) this.receiver).a.logException("CallSessionRoomsManager", "All rooms load error", (Throwable) obj);
        return s3q0.a;
    }
}
