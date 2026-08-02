package com.yandex.mapkit.directions.traffic_lights;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class FeedbackReason implements Serializable {
    private String id;
    private String localizedName;

    public FeedbackReason(String str, String str2) {
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"localizedName\" cannot be null");
            throw null;
        }
        this.id = str;
        this.localizedName = str2;
    }

    public String getId() {
        return this.id;
    }

    public String getLocalizedName() {
        return this.localizedName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.id = archive.add(this.id, false);
        this.localizedName = archive.add(this.localizedName, false);
    }

    public FeedbackReason() {
    }
}
