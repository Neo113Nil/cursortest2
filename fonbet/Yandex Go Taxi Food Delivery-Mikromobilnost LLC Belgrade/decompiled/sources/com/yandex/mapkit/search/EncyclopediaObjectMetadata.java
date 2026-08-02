package com.yandex.mapkit.search;

import com.yandex.mapkit.Attribution;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class EncyclopediaObjectMetadata implements BaseMetadata, Serializable {
    private Attribution attribution;
    private boolean attribution__is_initialized;
    private String description;
    private boolean description__is_initialized;
    private NativeObject nativeObject;
    private String title;
    private boolean title__is_initialized;

    public EncyclopediaObjectMetadata(String str, String str2, Attribution attribution) {
        this.title__is_initialized = false;
        this.description__is_initialized = false;
        this.attribution__is_initialized = false;
        this.nativeObject = init(str, str2, attribution);
        this.title = str;
        this.title__is_initialized = true;
        this.description = str2;
        this.description__is_initialized = true;
        this.attribution = attribution;
        this.attribution__is_initialized = true;
    }

    private native Attribution getAttribution__Native();

    private native String getDescription__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::EncyclopediaObjectMetadata";
    }

    private native String getTitle__Native();

    private native NativeObject init(String str, String str2, Attribution attribution);

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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getTitle(), true);
            archive.add(getDescription(), true);
            archive.add((Archive) getAttribution(), true, (Class<Archive>) Attribution.class);
            return;
        }
        this.title = archive.add(this.title, true);
        this.title__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        Attribution attribution = (Attribution) archive.add((Archive) this.attribution, true, (Class<Archive>) Attribution.class);
        this.attribution = attribution;
        this.attribution__is_initialized = true;
        this.nativeObject = init(this.title, this.description, attribution);
    }

    public EncyclopediaObjectMetadata() {
        this.title__is_initialized = false;
        this.description__is_initialized = false;
        this.attribution__is_initialized = false;
    }

    private EncyclopediaObjectMetadata(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.description__is_initialized = false;
        this.attribution__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
