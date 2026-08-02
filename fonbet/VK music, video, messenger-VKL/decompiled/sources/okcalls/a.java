package okcalls;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.izs;

/* loaded from: classes8.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return Boolean.valueOf(AnimojiCore.access$shouldRenderLocally((AnimojiCore) this.receiver, (CallParticipant.ParticipantId) obj));
    }
}
