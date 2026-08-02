package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class InclineSection implements Serializable {
    private Subpolyline subpolyline;
    private InclineType type;

    public InclineSection(InclineType inclineType, Subpolyline subpolyline) {
        if (inclineType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        if (subpolyline == null) {
            ny61.g("Required field \"subpolyline\" cannot be null");
            throw null;
        }
        this.type = inclineType;
        this.subpolyline = subpolyline;
    }

    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    public InclineType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (InclineType) archive.add((Archive) this.type, false, (Class<Archive>) InclineType.class);
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
    }

    public InclineSection() {
    }
}
