package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class IndoorLevel implements Serializable {
    private String levelId;
    private String levelName;

    public IndoorLevel(String str, String str2) {
        if (str == null) {
            ny61.g("Required field \"levelId\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"levelName\" cannot be null");
            throw null;
        }
        this.levelId = str;
        this.levelName = str2;
    }

    public String getLevelId() {
        return this.levelId;
    }

    public String getLevelName() {
        return this.levelName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.levelId = archive.add(this.levelId, false);
        this.levelName = archive.add(this.levelName, false);
    }

    public IndoorLevel() {
    }
}
