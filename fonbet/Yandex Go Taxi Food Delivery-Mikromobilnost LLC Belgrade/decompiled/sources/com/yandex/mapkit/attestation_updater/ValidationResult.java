package com.yandex.mapkit.attestation_updater;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ValidationResult implements Serializable {
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private String status;
    private boolean status__is_initialized;

    public ValidationResult(String str, String str2) {
        this.status__is_initialized = false;
        this.id__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"status\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2);
        this.status = str;
        this.status__is_initialized = true;
        this.id = str2;
        this.id__is_initialized = true;
    }

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::attestation_updater::ValidationResult";
    }

    private native String getStatus__Native();

    private native NativeObject init(String str, String str2);

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

    public synchronized String getStatus() {
        try {
            if (!this.status__is_initialized) {
                this.status = getStatus__Native();
                this.status__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.status;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getStatus(), false);
            archive.add(getId(), true);
            return;
        }
        this.status = archive.add(this.status, false);
        this.status__is_initialized = true;
        String add = archive.add(this.id, true);
        this.id = add;
        this.id__is_initialized = true;
        this.nativeObject = init(this.status, add);
    }

    public ValidationResult() {
        this.status__is_initialized = false;
        this.id__is_initialized = false;
    }

    private ValidationResult(NativeObject nativeObject) {
        this.status__is_initialized = false;
        this.id__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
