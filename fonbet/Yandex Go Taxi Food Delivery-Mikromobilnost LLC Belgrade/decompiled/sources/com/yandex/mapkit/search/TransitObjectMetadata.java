package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class TransitObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private String routeId;
    private boolean routeId__is_initialized;
    private List<String> types;
    private boolean types__is_initialized;

    public TransitObjectMetadata(String str, List<String> list) {
        this.routeId__is_initialized = false;
        this.types__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"routeId\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"types\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.routeId = str;
        this.routeId__is_initialized = true;
        this.types = list;
        this.types__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::TransitObjectMetadata";
    }

    private native String getRouteId__Native();

    private native List<String> getTypes__Native();

    private native NativeObject init(String str, List<String> list);

    public synchronized String getRouteId() {
        try {
            if (!this.routeId__is_initialized) {
                this.routeId = getRouteId__Native();
                this.routeId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.routeId;
    }

    public synchronized List<String> getTypes() {
        try {
            if (!this.types__is_initialized) {
                this.types = getTypes__Native();
                this.types__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.types;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getRouteId(), false);
            nzs.l(archive, getTypes(), false);
            return;
        }
        this.routeId = archive.add(this.routeId, false);
        this.routeId__is_initialized = true;
        List<String> o = nnm.o(archive, this.types, false);
        this.types = o;
        this.types__is_initialized = true;
        this.nativeObject = init(this.routeId, o);
    }

    public TransitObjectMetadata() {
        this.routeId__is_initialized = false;
        this.types__is_initialized = false;
    }

    private TransitObjectMetadata(NativeObject nativeObject) {
        this.routeId__is_initialized = false;
        this.types__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
