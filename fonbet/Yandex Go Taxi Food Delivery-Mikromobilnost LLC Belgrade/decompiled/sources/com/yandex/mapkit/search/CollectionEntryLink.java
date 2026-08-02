package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class CollectionEntryLink implements Serializable {
    private NativeObject nativeObject;
    private List<String> tags;
    private boolean tags__is_initialized;
    private String title;
    private boolean title__is_initialized;
    private String uri;
    private boolean uri__is_initialized;

    public CollectionEntryLink(String str, List<String> list, String str2) {
        this.title__is_initialized = false;
        this.tags__is_initialized = false;
        this.uri__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"uri\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list, str2);
        this.title = str;
        this.title__is_initialized = true;
        this.tags = list;
        this.tags__is_initialized = true;
        this.uri = str2;
        this.uri__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CollectionEntryLink";
    }

    private native List<String> getTags__Native();

    private native String getTitle__Native();

    private native String getUri__Native();

    private native NativeObject init(String str, List<String> list, String str2);

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
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            archive.add(getUri(), false);
            return;
        }
        this.title = archive.add(this.title, true);
        this.title__is_initialized = true;
        this.tags = nnm.o(archive, this.tags, false);
        this.tags__is_initialized = true;
        String add = archive.add(this.uri, false);
        this.uri = add;
        this.uri__is_initialized = true;
        this.nativeObject = init(this.title, this.tags, add);
    }

    public CollectionEntryLink() {
        this.title__is_initialized = false;
        this.tags__is_initialized = false;
        this.uri__is_initialized = false;
    }

    private CollectionEntryLink(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.tags__is_initialized = false;
        this.uri__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
