package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class FeatureSet implements Serializable {
    private List<String> ids;
    private boolean ids__is_initialized;
    private NativeObject nativeObject;

    public FeatureSet(List<String> list) {
        this.ids__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"ids\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.ids = list;
        this.ids__is_initialized = true;
    }

    private native List<String> getIds__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::FeatureSet";
    }

    private native NativeObject init(List<String> list);

    public synchronized List<String> getIds() {
        try {
            if (!this.ids__is_initialized) {
                this.ids = getIds__Native();
                this.ids__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ids;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.l(archive, getIds(), false);
            return;
        }
        List<String> o = nnm.o(archive, this.ids, false);
        this.ids = o;
        this.ids__is_initialized = true;
        this.nativeObject = init(o);
    }

    public FeatureSet() {
        this.ids__is_initialized = false;
    }

    private FeatureSet(NativeObject nativeObject) {
        this.ids__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
