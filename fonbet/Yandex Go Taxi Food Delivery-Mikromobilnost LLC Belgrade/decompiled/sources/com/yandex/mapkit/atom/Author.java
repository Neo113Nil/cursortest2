package com.yandex.mapkit.atom;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Author implements Serializable {
    private String email;
    private String name;
    private String uri;

    public Author(String str, String str2, String str3) {
        if (str == null) {
            ny61.g("Required field \"name\" cannot be null");
            throw null;
        }
        this.name = str;
        this.uri = str2;
        this.email = str3;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getUri() {
        return this.uri;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
        this.uri = archive.add(this.uri, true);
        this.email = archive.add(this.email, true);
    }

    public Author() {
    }
}
