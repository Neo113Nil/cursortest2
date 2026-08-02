package com.yandex.mapkit.atom;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Link implements Serializable {
    private String href;
    private String rel;
    private String type;

    public Link(String str, String str2, String str3) {
        if (str == null) {
            ny61.g("Required field \"href\" cannot be null");
            throw null;
        }
        this.href = str;
        this.rel = str2;
        this.type = str3;
    }

    public String getHref() {
        return this.href;
    }

    public String getRel() {
        return this.rel;
    }

    public String getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.href = archive.add(this.href, false);
        this.rel = archive.add(this.rel, true);
        this.type = archive.add(this.type, true);
    }

    public Link() {
    }
}
