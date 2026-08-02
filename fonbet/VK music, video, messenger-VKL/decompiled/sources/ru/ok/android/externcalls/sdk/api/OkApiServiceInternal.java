package ru.ok.android.externcalls.sdk.api;

import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.video.calls.sdk.internal.api.request.UploadType;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.methods.batch.execute.BatchApiResult;
import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.request.BatchRequestKt;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;
import ru.ok.android.externcalls.sdk.api.request.GetConversationParams;
import ru.ok.android.externcalls.sdk.api.request.GetExternalIdsByOkIds;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdsByExternalIds;
import ru.ok.android.externcalls.sdk.api.request.GetSettings;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.api.request.JoinConversationByLink;
import ru.ok.android.externcalls.sdk.api.request.StartConversation;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.utils.time.TimeProviderExtKt;
import xsna.c5g;
import xsna.f0z;
import xsna.j5g;
import xsna.kst;
import xsna.mst;
import xsna.s3q0;
import xsna.xgv;
import xsna.zcl;

/* compiled from: OkApiServiceInternal.kt */
/* loaded from: classes9.dex */
public final class OkApiServiceInternal {
    private static final String BATCH_PREFIX = "batch.execute/";
    private static final Companion Companion = new Companion(null);
    private static final int MAX_EXTERNAL_IDS_PER_REQUEST = 200;
    private static final int MAX_OK_IDS_PER_REQUEST = 100;
    private ApiStats apiStats;
    private final OkApiService okApiService;
    private RTCLog rtcLog;
    private final RxApiClient rxApiClient;
    private TimeProvider timeProvider;

    /* compiled from: OkApiServiceInternal.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public OkApiServiceInternal(RxApiClient rxApiClient, OkApiService okApiService, ApiStats apiStats, RTCLog rTCLog, TimeProvider timeProvider) {
        this.rxApiClient = rxApiClient;
        this.okApiService = okApiService;
        this.apiStats = apiStats;
        this.rtcLog = rTCLog;
        this.timeProvider = timeProvider;
    }

    public static /* synthetic */ x getConversationParams$default(OkApiServiceInternal okApiServiceInternal, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return okApiServiceInternal.getConversationParams(str, z, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 getExternalIdsByOkIds$lambda$0(OkApiServiceInternal okApiServiceInternal, long j) {
        ApiStats apiStats = okApiServiceInternal.apiStats;
        if (apiStats != null) {
            apiStats.reportExecutionTime("batch.execute/vchat.getExternalIdsByOkIds", j);
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 getOkIdsByExternalIds$lambda$0(OkApiServiceInternal okApiServiceInternal, long j) {
        ApiStats apiStats = okApiServiceInternal.apiStats;
        if (apiStats != null) {
            apiStats.reportExecutionTime("batch.execute/vchat.getOkIdsByExternalIds", j);
        }
        return s3q0.a;
    }

    public final x<ConversationParams> getConversationParams(String str, boolean z, String str2) {
        x<ConversationParams> execute = this.rxApiClient.execute((ApiExecutableRequest) new GetConversationParams.Request(str, str2));
        if (z) {
            RetryKt.retryApiCallForFastWorkRequired(execute, this.rtcLog);
        } else {
            RetryKt.retryApiCallForBackgroundWork(execute, this.rtcLog);
        }
        return execute;
    }

    public final x<List<ExternalIdsResponse>> getExternalIdsByOkIds(Collection<CallParticipant.ParticipantId> collection) {
        ArrayList U0 = j5g.U0(collection, 200, 200, true);
        final ArrayList arrayList = new ArrayList(c5g.u(U0, 10));
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            arrayList.add(new GetExternalIdsByOkIds.Request((List) it.next()));
        }
        return RetryKt.retryApiCallForFastWorkRequired(TimeProviderExtKt.measureExecutionTime(this.rxApiClient.execute((ApiExecutableRequest) BatchRequestKt.toBatchRequest(arrayList)), this.timeProvider, new xgv(this, 18)).l(new l() { // from class: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal$getExternalIdsByOkIds$2
            @Override // io.reactivex.rxjava3.functions.l
            public final List<ExternalIdsResponse> apply(BatchApiResult batchApiResult) {
                return BatchRequestKt.parseBatchResponse(batchApiResult, arrayList);
            }
        }), this.rtcLog);
    }

    public final x<GetOkIdByExternalId.Response> getOkIdByExternalId(String str) {
        return RetryKt.retryApiCallForFastWorkRequired(this.rxApiClient.execute((ApiExecutableRequest) new GetOkIdByExternalId.Request(str, false, 2, null)), this.rtcLog);
    }

    public final x<List<BatchInternalIdResponse>> getOkIdsByExternalIds(Collection<ParticipantId> collection) {
        ArrayList U0 = j5g.U0(collection, 100, 100, true);
        final ArrayList arrayList = new ArrayList(c5g.u(U0, 10));
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            arrayList.add(new GetOkIdsByExternalIds.Request((List) it.next()));
        }
        return RetryKt.retryApiCallForFastWorkRequired(TimeProviderExtKt.measureExecutionTime(this.rxApiClient.execute((ApiExecutableRequest) BatchRequestKt.toBatchRequest(arrayList)), this.timeProvider, new f0z(this, 17)).l(new l() { // from class: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal$getOkIdsByExternalIds$2
            @Override // io.reactivex.rxjava3.functions.l
            public final List<BatchInternalIdResponse> apply(BatchApiResult batchApiResult) {
                return BatchRequestKt.parseBatchResponse(batchApiResult, arrayList);
            }
        }), this.rtcLog);
    }

    public final x<Map<String, String>> getSettings(Set<String> set) {
        return this.rxApiClient.execute((ApiExecutableRequest) new GetSettings.Request(set));
    }

    public final Map<String, String> getSettingsBlocking(Set<String> set) {
        return (Map) this.rxApiClient.executeBlocking((ApiExecutableRequest) new GetSettings.Request(set));
    }

    public final x<HangupConversation.Response> hangupConversation(String str, HangupReason hangupReason, String str2) {
        return this.rxApiClient.execute((ApiExecutableRequest) new HangupConversation.Request(str, hangupReason, str2));
    }

    public final x<ConversationParams> joinConversationByLink(String str, String str2, long j, StartCallApiParams startCallApiParams) {
        return RetryKt.retryApiCallForJoining(this.rxApiClient.execute((ApiExecutableRequest) new JoinConversationByLink.Request(str, str2, j, startCallApiParams)), this.rtcLog).l(new l() { // from class: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal$joinConversationByLink$1
            @Override // io.reactivex.rxjava3.functions.l
            public final ConversationParams apply(JoinByLinkResponse joinByLinkResponse) {
                return joinByLinkResponse.toParams();
            }
        });
    }

    public final x<JoinConversation.Response> joinToConversation(String str, long j, StartCallApiParams startCallApiParams) {
        return RetryKt.retryApiCallForJoining(this.rxApiClient.execute((ApiExecutableRequest) new JoinConversation.Request(str, j, startCallApiParams, new OkApiServiceInternal$joinToConversation$request$1(this.okApiService))), this.rtcLog);
    }

    public final x<mst> requestUploadUrl(String str, UploadType uploadType, String str2) {
        return RetryKt.retryApiCallForBackgroundWork(this.rxApiClient.execute((ApiExecutableRequest) new kst(str, uploadType, str2)), this.rtcLog);
    }

    public final x<ClientSupportedCodecs.Response> sendSupportedCodecsStatistics(JSONObject jSONObject) {
        return RetryKt.retryApiCallForBackgroundWork(this.rxApiClient.execute((ApiExecutableRequest) new ClientSupportedCodecs.Request(jSONObject)), this.rtcLog);
    }

    public final x<CallInfo> startConversation(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams) {
        return RetryKt.retryApiCallForOutgoing(this.rxApiClient.execute((ApiExecutableRequest) new StartConversation.Request(str, str2, z, conversationParticipant, list, startCallApiParams, new OkApiServiceInternal$startConversation$request$1(this.okApiService))), this.rtcLog);
    }

    public /* synthetic */ OkApiServiceInternal(RxApiClient rxApiClient, OkApiService okApiService, ApiStats apiStats, RTCLog rTCLog, TimeProvider timeProvider, int i, zcl zclVar) {
        this(rxApiClient, (i & 2) != 0 ? new OkApiService() : okApiService, (i & 4) != 0 ? null : apiStats, (i & 8) != 0 ? RTCLog.NoOp.INSTANCE : rTCLog, (i & 16) != 0 ? TimeProviderExtKt.newInstance(TimeProvider.Companion) : timeProvider);
    }
}
