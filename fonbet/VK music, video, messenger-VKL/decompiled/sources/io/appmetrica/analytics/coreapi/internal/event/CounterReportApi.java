package io.appmetrica.analytics.coreapi.internal.event;

import java.util.Map;

/* loaded from: classes8.dex */
public interface CounterReportApi {
    int getBytesTruncated();

    int getCustomType();

    Map<String, byte[]> getExtras();

    String getName();

    int getType();

    String getValue();

    byte[] getValueBytes();

    void setBytesTruncated(int i);

    void setCustomType(int i);

    void setExtras(Map<String, byte[]> map);

    void setName(String str);

    void setType(int i);

    void setValue(String str);

    void setValueBytes(byte[] bArr);
}
