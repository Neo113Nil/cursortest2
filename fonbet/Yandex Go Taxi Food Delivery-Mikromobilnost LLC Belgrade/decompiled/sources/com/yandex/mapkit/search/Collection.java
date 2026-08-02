package com.yandex.mapkit.search;

import com.yandex.mapkit.Image;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Collection implements Serializable {
    private Author author;
    private boolean author__is_initialized;
    private String description;
    private boolean description__is_initialized;
    private Image image;
    private boolean image__is_initialized;
    private Integer itemCount;
    private boolean itemCount__is_initialized;
    private NativeObject nativeObject;
    private String rubric;
    private boolean rubric__is_initialized;
    private String seoname;
    private boolean seoname__is_initialized;
    private String title;
    private boolean title__is_initialized;
    private String uri;
    private boolean uri__is_initialized;

    public Collection(String str, String str2, String str3, Image image, Integer num, String str4, Author author, String str5) {
        this.uri__is_initialized = false;
        this.title__is_initialized = false;
        this.description__is_initialized = false;
        this.image__is_initialized = false;
        this.itemCount__is_initialized = false;
        this.rubric__is_initialized = false;
        this.author__is_initialized = false;
        this.seoname__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"uri\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, image, num, str4, author, str5);
        this.uri = str;
        this.uri__is_initialized = true;
        this.title = str2;
        this.title__is_initialized = true;
        this.description = str3;
        this.description__is_initialized = true;
        this.image = image;
        this.image__is_initialized = true;
        this.itemCount = num;
        this.itemCount__is_initialized = true;
        this.rubric = str4;
        this.rubric__is_initialized = true;
        this.author = author;
        this.author__is_initialized = true;
        this.seoname = str5;
        this.seoname__is_initialized = true;
    }

    private native Author getAuthor__Native();

    private native String getDescription__Native();

    private native Image getImage__Native();

    private native Integer getItemCount__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Collection";
    }

    private native String getRubric__Native();

    private native String getSeoname__Native();

    private native String getTitle__Native();

    private native String getUri__Native();

    private native NativeObject init(String str, String str2, String str3, Image image, Integer num, String str4, Author author, String str5);

    public synchronized Author getAuthor() {
        try {
            if (!this.author__is_initialized) {
                this.author = getAuthor__Native();
                this.author__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.author;
    }

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

    public synchronized Integer getItemCount() {
        try {
            if (!this.itemCount__is_initialized) {
                this.itemCount = getItemCount__Native();
                this.itemCount__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.itemCount;
    }

    public synchronized String getRubric() {
        try {
            if (!this.rubric__is_initialized) {
                this.rubric = getRubric__Native();
                this.rubric__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.rubric;
    }

    public synchronized String getSeoname() {
        try {
            if (!this.seoname__is_initialized) {
                this.seoname = getSeoname__Native();
                this.seoname__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.seoname;
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
            archive.add(getUri(), false);
            archive.add(getTitle(), true);
            archive.add(getDescription(), true);
            archive.add((Archive) getImage(), true, (Class<Archive>) Image.class);
            archive.add(getItemCount(), true);
            archive.add(getRubric(), true);
            archive.add((Archive) getAuthor(), true, (Class<Archive>) Author.class);
            archive.add(getSeoname(), true);
            return;
        }
        this.uri = archive.add(this.uri, false);
        this.uri__is_initialized = true;
        this.title = archive.add(this.title, true);
        this.title__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        this.image = (Image) archive.add((Archive) this.image, true, (Class<Archive>) Image.class);
        this.image__is_initialized = true;
        this.itemCount = archive.add(this.itemCount, true);
        this.itemCount__is_initialized = true;
        this.rubric = archive.add(this.rubric, true);
        this.rubric__is_initialized = true;
        this.author = (Author) archive.add((Archive) this.author, true, (Class<Archive>) Author.class);
        this.author__is_initialized = true;
        String add = archive.add(this.seoname, true);
        this.seoname = add;
        this.seoname__is_initialized = true;
        this.nativeObject = init(this.uri, this.title, this.description, this.image, this.itemCount, this.rubric, this.author, add);
    }

    public Collection() {
        this.uri__is_initialized = false;
        this.title__is_initialized = false;
        this.description__is_initialized = false;
        this.image__is_initialized = false;
        this.itemCount__is_initialized = false;
        this.rubric__is_initialized = false;
        this.author__is_initialized = false;
        this.seoname__is_initialized = false;
    }

    private Collection(NativeObject nativeObject) {
        this.uri__is_initialized = false;
        this.title__is_initialized = false;
        this.description__is_initialized = false;
        this.image__is_initialized = false;
        this.itemCount__is_initialized = false;
        this.rubric__is_initialized = false;
        this.author__is_initialized = false;
        this.seoname__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
