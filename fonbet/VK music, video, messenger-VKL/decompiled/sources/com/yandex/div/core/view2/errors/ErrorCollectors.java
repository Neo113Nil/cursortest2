package com.yandex.div.core.view2.errors;

import com.yandex.div.DivDataTag;
import com.yandex.div2.j3;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ErrorCollectors.kt */
/* loaded from: classes7.dex */
public class ErrorCollectors {
    private final Map<String, ErrorCollector> collectors = new LinkedHashMap();

    public ErrorCollector getOrCreate(DivDataTag divDataTag, j3 j3Var) {
        ErrorCollector errorCollector;
        synchronized (this.collectors) {
            try {
                Map<String, ErrorCollector> map = this.collectors;
                String id = divDataTag.getId();
                ErrorCollector errorCollector2 = map.get(id);
                if (errorCollector2 == null) {
                    errorCollector2 = new ErrorCollector();
                    map.put(id, errorCollector2);
                }
                errorCollector2.attachParsingErrors(j3Var);
                errorCollector = errorCollector2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return errorCollector;
    }

    public ErrorCollector getOrNull(DivDataTag divDataTag, j3 j3Var) {
        ErrorCollector errorCollector;
        synchronized (this.collectors) {
            errorCollector = this.collectors.get(divDataTag.getId());
            if (errorCollector != null) {
                errorCollector.attachParsingErrors(j3Var);
            } else {
                errorCollector = null;
            }
        }
        return errorCollector;
    }
}
