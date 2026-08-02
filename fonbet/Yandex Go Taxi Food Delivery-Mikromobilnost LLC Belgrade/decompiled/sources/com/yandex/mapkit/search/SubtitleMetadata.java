package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class SubtitleMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<SubtitleItem> serpSubtitleItems;
    private boolean serpSubtitleItems__is_initialized;
    private List<SubtitleItem> subtitleItems;
    private boolean subtitleItems__is_initialized;

    public SubtitleMetadata(List<SubtitleItem> list, List<SubtitleItem> list2) {
        this.subtitleItems__is_initialized = false;
        this.serpSubtitleItems__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"subtitleItems\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"serpSubtitleItems\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2);
        this.subtitleItems = list;
        this.subtitleItems__is_initialized = true;
        this.serpSubtitleItems = list2;
        this.serpSubtitleItems__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SubtitleMetadata";
    }

    private native List<SubtitleItem> getSerpSubtitleItems__Native();

    private native List<SubtitleItem> getSubtitleItems__Native();

    private native NativeObject init(List<SubtitleItem> list, List<SubtitleItem> list2);

    public synchronized List<SubtitleItem> getSerpSubtitleItems() {
        try {
            if (!this.serpSubtitleItems__is_initialized) {
                this.serpSubtitleItems = getSerpSubtitleItems__Native();
                this.serpSubtitleItems__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.serpSubtitleItems;
    }

    public synchronized List<SubtitleItem> getSubtitleItems() {
        try {
            if (!this.subtitleItems__is_initialized) {
                this.subtitleItems = getSubtitleItems__Native();
                this.subtitleItems__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.subtitleItems;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getSubtitleItems(), false, (ArchivingHandler) new ClassHandler(SubtitleItem.class));
            nzs.m(SubtitleItem.class, archive, getSerpSubtitleItems(), false);
            return;
        }
        this.subtitleItems = nzs.e(SubtitleItem.class, archive, this.subtitleItems, false);
        this.subtitleItems__is_initialized = true;
        List<SubtitleItem> e = nzs.e(SubtitleItem.class, archive, this.serpSubtitleItems, false);
        this.serpSubtitleItems = e;
        this.serpSubtitleItems__is_initialized = true;
        this.nativeObject = init(this.subtitleItems, e);
    }

    public SubtitleMetadata() {
        this.subtitleItems__is_initialized = false;
        this.serpSubtitleItems__is_initialized = false;
    }

    private SubtitleMetadata(NativeObject nativeObject) {
        this.subtitleItems__is_initialized = false;
        this.serpSubtitleItems__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
