package ru.mail.libverify.platform.storage;

/* compiled from: KeyValueStorage.kt */
/* loaded from: classes9.dex */
public interface KeyValueStorage {
    KeyValueStorage clear();

    void commit();

    void commitSync();

    Integer getIntegerValue(String str, Integer num);

    Long getLongValue(String str, Long l);

    String getValue(String str);

    KeyValueStorage putValue(String str, int i);

    KeyValueStorage putValue(String str, long j);

    KeyValueStorage putValue(String str, String str2);

    KeyValueStorage removeValue(String str);
}
