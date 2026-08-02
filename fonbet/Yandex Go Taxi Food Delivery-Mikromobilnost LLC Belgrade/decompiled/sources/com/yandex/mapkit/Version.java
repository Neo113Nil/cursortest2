package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Version implements Serializable {
    private String str;

    public Version(String str) {
        if (str != null) {
            this.str = str;
        } else {
            ny61.g("Required field \"str\" cannot be null");
            throw null;
        }
    }

    public String getStr() {
        return this.str;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.str = archive.add(this.str, false);
    }

    public Version() {
    }
}
