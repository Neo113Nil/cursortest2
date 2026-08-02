package com.yandex.mapkit.search;

import com.yandex.mapkit.Image;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Author implements Serializable {
    private String description;
    private boolean description__is_initialized;
    private Image favicon;
    private boolean favicon__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private String uri;
    private boolean uri__is_initialized;

    public Author(String str, String str2, Image image, String str3) {
        this.name__is_initialized = false;
        this.description__is_initialized = false;
        this.favicon__is_initialized = false;
        this.uri__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"name\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, image, str3);
        this.name = str;
        this.name__is_initialized = true;
        this.description = str2;
        this.description__is_initialized = true;
        this.favicon = image;
        this.favicon__is_initialized = true;
        this.uri = str3;
        this.uri__is_initialized = true;
    }

    private native String getDescription__Native();

    private native Image getFavicon__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Author";
    }

    private native String getUri__Native();

    private native NativeObject init(String str, String str2, Image image, String str3);

    public synchronized String getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.description;
    }

    public synchronized Image getFavicon() {
        try {
            if (!this.favicon__is_initialized) {
                this.favicon = getFavicon__Native();
                this.favicon__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.favicon;
    }

    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.name;
    }

    public synchronized String getUri() {
        try {
            if (!this.uri__is_initialized) {
                this.uri = getUri__Native();
                this.uri__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.uri;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getName(), false);
            archive.add(getDescription(), true);
            archive.add((Archive) getFavicon(), true, (Class<Archive>) Image.class);
            archive.add(getUri(), true);
            return;
        }
        this.name = archive.add(this.name, false);
        this.name__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        this.favicon = (Image) archive.add((Archive) this.favicon, true, (Class<Archive>) Image.class);
        this.favicon__is_initialized = true;
        String add = archive.add(this.uri, true);
        this.uri = add;
        this.uri__is_initialized = true;
        this.nativeObject = init(this.name, this.description, this.favicon, add);
    }

    public Author() {
        this.name__is_initialized = false;
        this.description__is_initialized = false;
        this.favicon__is_initialized = false;
        this.uri__is_initialized = false;
    }

    private Author(NativeObject nativeObject) {
        this.name__is_initialized = false;
        this.description__is_initialized = false;
        this.favicon__is_initialized = false;
        this.uri__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
