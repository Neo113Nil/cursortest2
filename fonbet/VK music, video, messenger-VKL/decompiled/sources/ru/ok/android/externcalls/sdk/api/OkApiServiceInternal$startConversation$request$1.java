package ru.ok.android.externcalls.sdk.api;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import xsna.s3q0;
import xsna.zzs;

/* compiled from: OkApiServiceInternal.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class OkApiServiceInternal$startConversation$request$1 extends FunctionReferenceImpl implements zzs<ConversationParticipant, List<? extends String>, StartCallApiParams, BasicApiRequest.Builder, s3q0> {
    public OkApiServiceInternal$startConversation$request$1(Object obj) {
        super(4, obj, OkApiService.class, "addCreateConversationParamsByExternalOpponentIds", "addCreateConversationParamsByExternalOpponentIds(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/api/common/BasicApiRequest$Builder;)V", 0);
    }

    @Override // xsna.zzs
    public /* bridge */ /* synthetic */ s3q0 invoke(ConversationParticipant conversationParticipant, List<? extends String> list, StartCallApiParams startCallApiParams, BasicApiRequest.Builder builder) {
        invoke2(conversationParticipant, (List<String>) list, startCallApiParams, builder);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams, BasicApiRequest.Builder builder) {
        ((OkApiService) this.receiver).addCreateConversationParamsByExternalOpponentIds(conversationParticipant, list, startCallApiParams, builder);
    }
}
