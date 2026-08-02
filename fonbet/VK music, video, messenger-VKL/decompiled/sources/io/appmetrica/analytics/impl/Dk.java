package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* loaded from: classes8.dex */
public final class Dk {
    public static C4722b6 a(ServiceModuleCounterReport serviceModuleCounterReport) {
        String value;
        C4722b6 c4722b6 = new C4722b6("", "", 0);
        c4722b6.d = serviceModuleCounterReport.getType();
        String name = serviceModuleCounterReport.getName();
        if (name != null) {
            c4722b6.a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            c4722b6.b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            c4722b6.setValueBytes(valueBytes);
        }
        return c4722b6;
    }
}
