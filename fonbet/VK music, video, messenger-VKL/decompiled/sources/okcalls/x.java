package okcalls;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.participant.CallParticipants;
import xsna.gzs;

/* loaded from: classes8.dex */
public final /* synthetic */ class x extends FunctionReferenceImpl implements gzs {
    @Override // xsna.gzs
    public final Object invoke() {
        return Integer.valueOf(((CallParticipants) this.receiver).size());
    }
}
