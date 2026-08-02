package ru.ok.android.externcalls.sdk.id.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.utils.MiscHelper;
import xsna.jgp;
import xsna.zcl;

/* compiled from: ExternalToInternalIdsMapper.kt */
/* loaded from: classes9.dex */
public final class ExternalToInternalIdsMapper implements IdsMapper<ParticipantId, CallParticipant.ParticipantId> {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "ExternalToInternalIdsMapper";
    private final OkApiServiceInternal okApiService;
    private final RTCLog rtcLog;

    /* compiled from: ExternalToInternalIdsMapper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ExternalToInternalIdsMapper(OkApiServiceInternal okApiServiceInternal, RTCLog rTCLog) {
        this.okApiService = okApiServiceInternal;
        this.rtcLog = rTCLog;
    }

    private final List<ParticipantId> filterEmptyParticipantIds(Collection<ParticipantId> collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            ParticipantId participantId = (ParticipantId) obj;
            if (participantId.id.length() == 0) {
                this.rtcLog.reportException(LOG_TAG, "Empty participant id", new IllegalArgumentException("Empty participant id"));
            }
            if (participantId.id.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // ru.ok.android.externcalls.sdk.id.mapping.IdsMapper
    public Map<ParticipantId, CallParticipant.ParticipantId> map(Collection<? extends ParticipantId> collection, MappingContext mappingContext) {
        LinkedHashMap linkedHashMap;
        Map<ParticipantId, CallParticipant.ParticipantId> map;
        mappingContext.logContextIfNeeded();
        MiscHelper.throwIfNotBgThread();
        List<ParticipantId> filterEmptyParticipantIds = filterEmptyParticipantIds(collection);
        boolean isEmpty = filterEmptyParticipantIds.isEmpty();
        jgp jgpVar = jgp.b;
        if (isEmpty) {
            return jgpVar;
        }
        try {
            List<BatchInternalIdResponse> c = this.okApiService.getOkIdsByExternalIds(filterEmptyParticipantIds).c();
            ArrayList arrayList = new ArrayList();
            for (BatchInternalIdResponse batchInternalIdResponse : c) {
                if (batchInternalIdResponse == null || (map = batchInternalIdResponse.externalToInternalIdsMap) == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<ParticipantId, CallParticipant.ParticipantId> entry : map.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap != null) {
                    arrayList.add(linkedHashMap);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap2.putAll((Map) it.next());
            }
            return linkedHashMap2;
        } catch (Throwable th) {
            this.rtcLog.logException(LOG_TAG, "Can't map external ids to internal", th);
            return jgpVar;
        }
    }
}
