package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Line implements Serializable {
    private String name;

    public Line(String str) {
        if (str != null) {
            this.name = str;
        } else {
            ny61.g("Required field \"name\" cannot be null");
            throw null;
        }
    }

    public String getName() {
        return this.name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
    }

    public Line() {
    }
}
