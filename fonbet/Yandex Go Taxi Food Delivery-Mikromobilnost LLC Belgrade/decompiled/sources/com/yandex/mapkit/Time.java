package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public class Time implements Serializable {
    private String text;
    private int tzOffset;
    private long value;

    public Time(long j, int i, String str) {
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        this.value = j;
        this.tzOffset = i;
        this.text = str;
    }

    public String getText() {
        return this.text;
    }

    public int getTzOffset() {
        return this.tzOffset;
    }

    public long getValue() {
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.value = archive.add(this.value);
        this.tzOffset = archive.add(this.tzOffset);
        this.text = archive.add(this.text, false);
    }

    public Time() {
    }
}
