package com.yandex.mapkit.road_events;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class FeedbackReason implements Serializable {
    private String id;
    private String localized_name;

    public FeedbackReason(String str, String str2) {
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"localized_name\" cannot be null");
            throw null;
        }
        this.id = str;
        this.localized_name = str2;
    }

    public String getId() {
        return this.id;
    }

    public String getLocalized_name() {
        return this.localized_name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.id = archive.add(this.id, false);
        this.localized_name = archive.add(this.localized_name, false);
    }

    public FeedbackReason() {
    }
}
