package com.yandex.mapkit.search;

import com.yandex.mapkit.Image;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class PartnerLink implements Serializable {
    private Image image;
    private boolean image__is_initialized;
    private NativeObject nativeObject;
    private String title;
    private boolean title__is_initialized;
    private String uri;
    private boolean uri__is_initialized;

    public PartnerLink(String str, Image image, String str2) {
        this.title__is_initialized = false;
        this.image__is_initialized = false;
        this.uri__is_initialized = false;
        if (str2 == null) {
            ny61.g("Required field \"uri\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, image, str2);
        this.title = str;
        this.title__is_initialized = true;
        this.image = image;
        this.image__is_initialized = true;
        this.uri = str2;
        this.uri__is_initialized = true;
    }

    private native Image getImage__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::PartnerLink";
    }

    private native String getTitle__Native();

    private native String getUri__Native();

    private native NativeObject init(String str, Image image, String str2);

    public synchronized Image getImage() {
        try {
            if (!this.image__is_initialized) {
                this.image = getImage__Native();
                this.image__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.image;
    }

    public synchronized String getTitle() {
        try {
            if (!this.title__is_initialized) {
                this.title = getTitle__Native();
                this.title__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.title;
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
            archive.add(getTitle(), true);
            archive.add((Archive) getImage(), true, (Class<Archive>) Image.class);
            archive.add(getUri(), false);
            return;
        }
        this.title = archive.add(this.title, true);
        this.title__is_initialized = true;
        this.image = (Image) archive.add((Archive) this.image, true, (Class<Archive>) Image.class);
        this.image__is_initialized = true;
        String add = archive.add(this.uri, false);
        this.uri = add;
        this.uri__is_initialized = true;
        this.nativeObject = init(this.title, this.image, add);
    }

    public PartnerLink() {
        this.title__is_initialized = false;
        this.image__is_initialized = false;
        this.uri__is_initialized = false;
    }

    private PartnerLink(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.image__is_initialized = false;
        this.uri__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
