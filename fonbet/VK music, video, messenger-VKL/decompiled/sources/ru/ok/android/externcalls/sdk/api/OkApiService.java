package ru.ok.android.externcalls.sdk.api;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import xsna.j5g;
import xsna.ozl;

/* compiled from: OkApiService.kt */
/* loaded from: classes9.dex */
public class OkApiService {
    public OkApiService() {
    }

    @ozl
    public void addCreateConversationParams(ConversationParticipant conversationParticipant, List<Long> list, StartCallApiParams startCallApiParams, BasicApiRequest.Builder builder) {
        if (list.isEmpty()) {
            return;
        }
        builder.param(ApiProtocol.PARAM_UIDS, j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
    }

    public void addCreateConversationParamsByExternalOpponentIds(ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams, BasicApiRequest.Builder builder) {
        if (list.isEmpty()) {
            return;
        }
        builder.param("externalIds", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
    }

    @ozl
    public OkApiService(RxApiClient rxApiClient) {
        this();
    }

    public void addJoinToConversationParams(StartCallApiParams startCallApiParams, BasicApiRequest.Builder builder) {
    }
}
