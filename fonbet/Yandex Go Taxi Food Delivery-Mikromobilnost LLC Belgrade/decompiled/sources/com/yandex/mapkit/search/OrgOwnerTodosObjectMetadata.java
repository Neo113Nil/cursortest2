package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class OrgOwnerTodosObjectMetadata implements BaseMetadata, Serializable {
    private Boolean hasActiveTodos;
    private boolean hasActiveTodos__is_initialized;
    private NativeObject nativeObject;

    public OrgOwnerTodosObjectMetadata(Boolean bool) {
        this.hasActiveTodos__is_initialized = false;
        this.nativeObject = init(bool);
        this.hasActiveTodos = bool;
        this.hasActiveTodos__is_initialized = true;
    }

    private native Boolean getHasActiveTodos__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::OrgOwnerTodosObjectMetadata";
    }

    private native NativeObject init(Boolean bool);

    public synchronized Boolean getHasActiveTodos() {
        try {
            if (!this.hasActiveTodos__is_initialized) {
                this.hasActiveTodos = getHasActiveTodos__Native();
                this.hasActiveTodos__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hasActiveTodos;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getHasActiveTodos(), true);
            return;
        }
        Boolean add = archive.add(this.hasActiveTodos, true);
        this.hasActiveTodos = add;
        this.hasActiveTodos__is_initialized = true;
        this.nativeObject = init(add);
    }

    public OrgOwnerTodosObjectMetadata() {
        this.hasActiveTodos__is_initialized = false;
    }

    private OrgOwnerTodosObjectMetadata(NativeObject nativeObject) {
        this.hasActiveTodos__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
