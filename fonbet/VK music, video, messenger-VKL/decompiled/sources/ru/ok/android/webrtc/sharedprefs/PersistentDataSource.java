package ru.ok.android.webrtc.sharedprefs;

import java.io.Serializable;

/* loaded from: classes9.dex */
public interface PersistentDataSource {
    void delete(String str);

    <T extends Serializable> T get(String str, T t);

    <T extends Serializable> T get(String str, Class<T> cls);

    <T extends Serializable> void put(String str, T t);
}
