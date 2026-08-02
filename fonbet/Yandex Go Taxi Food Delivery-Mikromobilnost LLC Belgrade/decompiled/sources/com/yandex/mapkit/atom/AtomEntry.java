package com.yandex.mapkit.atom;

import com.yandex.mapkit.Attribution;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class AtomEntry implements Serializable {
    private Attribution attribution;
    private boolean attribution__is_initialized;
    private Author author;
    private boolean author__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private List<Link> links;
    private boolean links__is_initialized;
    private NativeObject nativeObject;
    private String updateTime;
    private boolean updateTime__is_initialized;

    public AtomEntry(String str, String str2, Author author, Attribution attribution, List<Link> list) {
        this.id__is_initialized = false;
        this.updateTime__is_initialized = false;
        this.author__is_initialized = false;
        this.attribution__is_initialized = false;
        this.links__is_initialized = false;
        if (author == null) {
            ny61.g("Required field \"author\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"links\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, author, attribution, list);
        this.id = str;
        this.id__is_initialized = true;
        this.updateTime = str2;
        this.updateTime__is_initialized = true;
        this.author = author;
        this.author__is_initialized = true;
        this.attribution = attribution;
        this.attribution__is_initialized = true;
        this.links = list;
        this.links__is_initialized = true;
    }

    private native Attribution getAttribution__Native();

    private native Author getAuthor__Native();

    private native String getId__Native();

    private native List<Link> getLinks__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::atom::Entry";
    }

    private native String getUpdateTime__Native();

    private native NativeObject init(String str, String str2, Author author, Attribution attribution, List<Link> list);

    public synchronized Attribution getAttribution() {
        try {
            if (!this.attribution__is_initialized) {
                this.attribution = getAttribution__Native();
                this.attribution__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.attribution;
    }

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

    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.id;
    }

    public synchronized List<Link> getLinks() {
        try {
            if (!this.links__is_initialized) {
                this.links = getLinks__Native();
                this.links__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.links;
    }

    public synchronized String getUpdateTime() {
        try {
            if (!this.updateTime__is_initialized) {
                this.updateTime = getUpdateTime__Native();
                this.updateTime__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.updateTime;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), true);
            archive.add(getUpdateTime(), true);
            archive.add((Archive) getAuthor(), false, (Class<Archive>) Author.class);
            archive.add((Archive) getAttribution(), true, (Class<Archive>) Attribution.class);
            nzs.m(Link.class, archive, getLinks(), false);
            return;
        }
        this.id = archive.add(this.id, true);
        this.id__is_initialized = true;
        this.updateTime = archive.add(this.updateTime, true);
        this.updateTime__is_initialized = true;
        this.author = (Author) archive.add((Archive) this.author, false, (Class<Archive>) Author.class);
        this.author__is_initialized = true;
        this.attribution = (Attribution) archive.add((Archive) this.attribution, true, (Class<Archive>) Attribution.class);
        this.attribution__is_initialized = true;
        List<Link> e = nzs.e(Link.class, archive, this.links, false);
        this.links = e;
        this.links__is_initialized = true;
        this.nativeObject = init(this.id, this.updateTime, this.author, this.attribution, e);
    }

    public AtomEntry() {
        this.id__is_initialized = false;
        this.updateTime__is_initialized = false;
        this.author__is_initialized = false;
        this.attribution__is_initialized = false;
        this.links__is_initialized = false;
    }

    private AtomEntry(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.updateTime__is_initialized = false;
        this.author__is_initialized = false;
        this.attribution__is_initialized = false;
        this.links__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
