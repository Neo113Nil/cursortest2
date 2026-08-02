package com.yandex.div.data;

/* compiled from: Hashable.kt */
/* loaded from: classes7.dex */
public interface Hashable {
    int hash();

    default int propertiesHash() {
        return hash();
    }
}
