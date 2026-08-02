package ru.ok.tracer.upload;

import java.util.Map;
import ru.ok.tracer.SystemState;
import xsna.pn00;

/* compiled from: SampleUploadWorker.kt */
/* loaded from: classes9.dex */
public final class SampleUploadWorkerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemState withCustomProperties(SystemState systemState, Map<String, String> map) {
        return map.isEmpty() ? systemState : SystemState.copy$default(systemState, null, 0L, null, null, null, null, null, null, null, null, false, null, false, pn00.n(map, systemState.getProperties()), null, 24575, null);
    }
}
