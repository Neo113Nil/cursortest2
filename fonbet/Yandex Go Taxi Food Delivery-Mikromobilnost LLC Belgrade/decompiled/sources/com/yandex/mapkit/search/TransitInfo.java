package com.yandex.mapkit.search;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class TransitInfo implements Serializable {
    private LocalizedValue duration;
    private boolean duration__is_initialized;
    private NativeObject nativeObject;
    private int transferCount;
    private boolean transferCount__is_initialized;

    public TransitInfo(LocalizedValue localizedValue, int i) {
        this.duration__is_initialized = false;
        this.transferCount__is_initialized = false;
        if (localizedValue == null) {
            ny61.g("Required field \"duration\" cannot be null");
            throw null;
        }
        this.nativeObject = init(localizedValue, i);
        this.duration = localizedValue;
        this.duration__is_initialized = true;
        this.transferCount = i;
        this.transferCount__is_initialized = true;
    }

    private native LocalizedValue getDuration__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::TransitInfo";
    }

    private native int getTransferCount__Native();

    private native NativeObject init(LocalizedValue localizedValue, int i);

    public synchronized LocalizedValue getDuration() {
        try {
            if (!this.duration__is_initialized) {
                this.duration = getDuration__Native();
                this.duration__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.duration;
    }

    public synchronized int getTransferCount() {
        try {
            if (!this.transferCount__is_initialized) {
                this.transferCount = getTransferCount__Native();
                this.transferCount__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transferCount;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getDuration(), false, (Class<Archive>) LocalizedValue.class);
            archive.add(getTransferCount());
            return;
        }
        this.duration = (LocalizedValue) archive.add((Archive) this.duration, false, (Class<Archive>) LocalizedValue.class);
        this.duration__is_initialized = true;
        int add = archive.add(this.transferCount);
        this.transferCount = add;
        this.transferCount__is_initialized = true;
        this.nativeObject = init(this.duration, add);
    }

    public TransitInfo() {
        this.duration__is_initialized = false;
        this.transferCount__is_initialized = false;
    }

    private TransitInfo(NativeObject nativeObject) {
        this.duration__is_initialized = false;
        this.transferCount__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
