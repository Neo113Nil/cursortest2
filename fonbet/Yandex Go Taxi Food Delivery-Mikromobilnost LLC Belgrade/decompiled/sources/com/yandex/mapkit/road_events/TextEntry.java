package com.yandex.mapkit.road_events;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TextEntry implements Serializable {
    private String text;

    public TextEntry(String str) {
        if (str != null) {
            this.text = str;
        } else {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
    }

    public String getText() {
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.text = archive.add(this.text, false);
    }

    public TextEntry() {
    }
}
