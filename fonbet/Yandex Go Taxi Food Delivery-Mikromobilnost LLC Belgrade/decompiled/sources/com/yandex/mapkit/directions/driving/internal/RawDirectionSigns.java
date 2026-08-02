package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawDirectionSigns implements Serializable {
    private NativeObject nativeObject;
    private List<RawDirectionSign> signs;
    private boolean signs__is_initialized;

    public RawDirectionSigns(List<RawDirectionSign> list) {
        this.signs__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"signs\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.signs = list;
        this.signs__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawDirectionSigns";
    }

    private native List<RawDirectionSign> getSigns__Native();

    private native NativeObject init(List<RawDirectionSign> list);

    public synchronized List<RawDirectionSign> getSigns() {
        try {
            if (!this.signs__is_initialized) {
                this.signs = getSigns__Native();
                this.signs__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.signs;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawDirectionSign.class, archive, getSigns(), false);
            return;
        }
        List<RawDirectionSign> e = nzs.e(RawDirectionSign.class, archive, this.signs, false);
        this.signs = e;
        this.signs__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawDirectionSigns() {
        this.signs__is_initialized = false;
    }

    private RawDirectionSigns(NativeObject nativeObject) {
        this.signs__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
