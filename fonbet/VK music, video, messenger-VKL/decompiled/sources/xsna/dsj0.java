package xsna;

import one.video.calls.sdk.experiments.ExperimentsInterface;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;
import xsna.y1d0;

/* compiled from: SimplePrepare.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class dsj0 extends y1d0<z1d0> {
    public final OkApiServiceInternal i;
    public final ConversationIdProvider j;
    public final ConversationParams k;

    public dsj0(OkApiServiceInternal okApiServiceInternal, ConversationIdProvider conversationIdProvider, ConversationParams conversationParams, InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, RTCLog rTCLog, ConversationParticipant conversationParticipant, ExperimentsInterface experimentsInterface) {
        super(internalIdsResolver, externalIdsResolver, conversationPreparedStat, z, z2, rTCLog, conversationParticipant, experimentsInterface);
        this.i = okApiServiceInternal;
        this.j = conversationIdProvider;
        this.k = conversationParams;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public final io.reactivex.rxjava3.core.x<y1d0.b> execute(ActionParams actionParams) {
        return a(false, new bi80(this, 20));
    }
}
