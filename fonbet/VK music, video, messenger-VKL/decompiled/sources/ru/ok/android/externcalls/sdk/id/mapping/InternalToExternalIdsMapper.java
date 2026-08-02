package ru.ok.android.externcalls.sdk.id.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.utils.MiscHelper;
import xsna.jgp;
import xsna.zcl;

/* compiled from: InternalToExternalIdsMapper.kt */
/* loaded from: classes9.dex */
public final class InternalToExternalIdsMapper implements IdsMapper<CallParticipant.ParticipantId, ParticipantId> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "InternalToExternalIdsMapper";
    private final OkApiServiceInternal okApiService;
    private final RTCLog rtcLog;

    /* compiled from: InternalToExternalIdsMapper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public InternalToExternalIdsMapper(OkApiServiceInternal okApiServiceInternal, RTCLog rTCLog) {
        this.okApiService = okApiServiceInternal;
        this.rtcLog = rTCLog;
    }

    @Override // ru.ok.android.externcalls.sdk.id.mapping.IdsMapper
    public Map<CallParticipant.ParticipantId, ParticipantId> map(Collection<? extends CallParticipant.ParticipantId> collection, MappingContext mappingContext) {
        LinkedHashMap linkedHashMap;
        Map<CallParticipant.ParticipantId, ParticipantId> mapping;
        mappingContext.logContextIfNeeded();
        MiscHelper.throwIfNotBgThread();
        boolean isEmpty = collection.isEmpty();
        jgp jgpVar = jgp.b;
        if (isEmpty) {
            return jgpVar;
        }
        try {
            List<ExternalIdsResponse> c = this.okApiService.getExternalIdsByOkIds(collection).c();
            ArrayList arrayList = new ArrayList();
            for (ExternalIdsResponse externalIdsResponse : c) {
                if (externalIdsResponse == null || (mapping = externalIdsResponse.getMapping()) == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<CallParticipant.ParticipantId, ParticipantId> entry : mapping.entrySet()) {
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
            this.rtcLog.logException(TAG, "Can't map internal ids to external", th);
            return jgpVar;
        }
    }
}
