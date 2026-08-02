package com.yandex.mapkit.uri;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Uri implements Serializable {
    private String value;

    public Uri(String str) {
        if (str != null) {
            this.value = str;
        } else {
            ny61.g("Required field \"value\" cannot be null");
            throw null;
        }
    }

    public String getValue() {
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.value = archive.add(this.value, false);
    }

    public Uri() {
    }
}
