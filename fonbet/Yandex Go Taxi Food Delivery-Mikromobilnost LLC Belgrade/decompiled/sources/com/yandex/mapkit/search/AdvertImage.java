package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class AdvertImage implements Serializable {
    private NativeObject nativeObject;
    private List<String> tags;
    private boolean tags__is_initialized;
    private String url;
    private boolean url__is_initialized;

    public AdvertImage(String str, List<String> list) {
        this.url__is_initialized = false;
        this.tags__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"url\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.url = str;
        this.url__is_initialized = true;
        this.tags = list;
        this.tags__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::AdvertImage";
    }

    private native List<String> getTags__Native();

    private native String getUrl__Native();

    private native NativeObject init(String str, List<String> list);

    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tags;
    }

    public synchronized String getUrl() {
        try {
            if (!this.url__is_initialized) {
                this.url = getUrl__Native();
                this.url__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.url;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getUrl(), false);
            nzs.l(archive, getTags(), false);
            return;
        }
        this.url = archive.add(this.url, false);
        this.url__is_initialized = true;
        List<String> o = nnm.o(archive, this.tags, false);
        this.tags = o;
        this.tags__is_initialized = true;
        this.nativeObject = init(this.url, o);
    }

    public AdvertImage() {
        this.url__is_initialized = false;
        this.tags__is_initialized = false;
    }

    private AdvertImage(NativeObject nativeObject) {
        this.url__is_initialized = false;
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
