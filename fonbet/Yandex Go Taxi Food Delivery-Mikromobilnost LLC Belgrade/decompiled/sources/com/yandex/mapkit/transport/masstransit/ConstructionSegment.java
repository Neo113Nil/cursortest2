package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ConstructionSegment implements Serializable {
    private ConstructionMask constructionMask;
    private Subpolyline subpolyline;

    public ConstructionSegment(Subpolyline subpolyline, ConstructionMask constructionMask) {
        if (subpolyline == null) {
            ny61.g("Required field \"subpolyline\" cannot be null");
            throw null;
        }
        if (constructionMask == null) {
            ny61.g("Required field \"constructionMask\" cannot be null");
            throw null;
        }
        this.subpolyline = subpolyline;
        this.constructionMask = constructionMask;
    }

    public ConstructionMask getConstructionMask() {
        return this.constructionMask;
    }

    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
        this.constructionMask = (ConstructionMask) archive.add((Archive) this.constructionMask, false, (Class<Archive>) ConstructionMask.class);
    }

    public ConstructionSegment() {
    }
}
