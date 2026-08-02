package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class FeatureGroup implements Serializable {
    private List<String> ids;
    private boolean ids__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;

    public FeatureGroup(String str, List<String> list) {
        this.name__is_initialized = false;
        this.ids__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"ids\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.name = str;
        this.name__is_initialized = true;
        this.ids = list;
        this.ids__is_initialized = true;
    }

    private native List<String> getIds__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::FeatureGroup";
    }

    private native NativeObject init(String str, List<String> list);

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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getName(), true);
            nzs.l(archive, getIds(), false);
            return;
        }
        this.name = archive.add(this.name, true);
        this.name__is_initialized = true;
        List<String> o = nnm.o(archive, this.ids, false);
        this.ids = o;
        this.ids__is_initialized = true;
        this.nativeObject = init(this.name, o);
    }

    public FeatureGroup() {
        this.name__is_initialized = false;
        this.ids__is_initialized = false;
    }

    private FeatureGroup(NativeObject nativeObject) {
        this.name__is_initialized = false;
        this.ids__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
