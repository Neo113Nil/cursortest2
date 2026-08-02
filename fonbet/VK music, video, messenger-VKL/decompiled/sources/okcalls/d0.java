package okcalls;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final /* synthetic */ class d0 extends FunctionReferenceImpl implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ((CallSessionRoomsManager) this.receiver).a.logException("CallSessionRoomsManager", "All participants load error", (Throwable) obj);
        return s3q0.a;
    }
}
