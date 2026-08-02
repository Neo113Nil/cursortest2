package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class OrgOfferImage implements Serializable {
    private String url;

    public OrgOfferImage(String str) {
        if (str != null) {
            this.url = str;
        } else {
            ny61.g("Required field \"url\" cannot be null");
            throw null;
        }
    }

    public String getUrl() {
        return this.url;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.url = archive.add(this.url, false);
    }

    public OrgOfferImage() {
    }
}
