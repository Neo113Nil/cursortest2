package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Sort implements Serializable {
    private SortOrigin origin;
    private SortType type;

    public Sort(SortType sortType, SortOrigin sortOrigin) {
        if (sortType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        this.type = sortType;
        this.origin = sortOrigin;
    }

    public SortOrigin getOrigin() {
        return this.origin;
    }

    public SortType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (SortType) archive.add((Archive) this.type, false, (Class<Archive>) SortType.class);
        this.origin = (SortOrigin) archive.add((Archive) this.origin, true, (Class<Archive>) SortOrigin.class);
    }

    public Sort() {
    }
}
