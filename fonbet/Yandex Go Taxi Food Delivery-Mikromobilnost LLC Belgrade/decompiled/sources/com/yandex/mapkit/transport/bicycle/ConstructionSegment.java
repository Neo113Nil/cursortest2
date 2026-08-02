package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ConstructionSegment implements Serializable {
    private ConstructionID construction;
    private Subpolyline subpolyline;

    public ConstructionSegment(ConstructionID constructionID, Subpolyline subpolyline) {
        if (constructionID == null) {
            ny61.g("Required field \"construction\" cannot be null");
            throw null;
        }
        if (subpolyline == null) {
            ny61.g("Required field \"subpolyline\" cannot be null");
            throw null;
        }
        this.construction = constructionID;
        this.subpolyline = subpolyline;
    }

    public ConstructionID getConstruction() {
        return this.construction;
    }

    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.construction = (ConstructionID) archive.add((Archive) this.construction, false, (Class<Archive>) ConstructionID.class);
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
    }

    public ConstructionSegment() {
    }
}
