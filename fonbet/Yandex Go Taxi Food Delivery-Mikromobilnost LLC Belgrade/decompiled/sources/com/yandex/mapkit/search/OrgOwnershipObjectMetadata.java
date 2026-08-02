package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class OrgOwnershipObjectMetadata implements BaseMetadata, Serializable {
    private Boolean canBeClaimed;
    private boolean canBeClaimed__is_initialized;
    private NativeObject nativeObject;

    public OrgOwnershipObjectMetadata(Boolean bool) {
        this.canBeClaimed__is_initialized = false;
        this.nativeObject = init(bool);
        this.canBeClaimed = bool;
        this.canBeClaimed__is_initialized = true;
    }

    private native Boolean getCanBeClaimed__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::OrgOwnershipObjectMetadata";
    }

    private native NativeObject init(Boolean bool);

    public synchronized Boolean getCanBeClaimed() {
        try {
            if (!this.canBeClaimed__is_initialized) {
                this.canBeClaimed = getCanBeClaimed__Native();
                this.canBeClaimed__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.canBeClaimed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getCanBeClaimed(), true);
            return;
        }
        Boolean add = archive.add(this.canBeClaimed, true);
        this.canBeClaimed = add;
        this.canBeClaimed__is_initialized = true;
        this.nativeObject = init(add);
    }

    public OrgOwnershipObjectMetadata() {
        this.canBeClaimed__is_initialized = false;
    }

    private OrgOwnershipObjectMetadata(NativeObject nativeObject) {
        this.canBeClaimed__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
