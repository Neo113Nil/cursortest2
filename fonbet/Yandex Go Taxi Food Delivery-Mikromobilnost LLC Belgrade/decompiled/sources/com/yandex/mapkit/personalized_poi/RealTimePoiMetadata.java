package com.yandex.mapkit.personalized_poi;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RealTimePoiMetadata implements BaseMetadata, Serializable {
    private Boolean isBranded;
    private boolean isBranded__is_initialized;
    private Boolean isGeoproduct;
    private boolean isGeoproduct__is_initialized;
    private NativeObject nativeObject;

    public RealTimePoiMetadata(Boolean bool, Boolean bool2) {
        this.isGeoproduct__is_initialized = false;
        this.isBranded__is_initialized = false;
        this.nativeObject = init(bool, bool2);
        this.isGeoproduct = bool;
        this.isGeoproduct__is_initialized = true;
        this.isBranded = bool2;
        this.isBranded__is_initialized = true;
    }

    private native Boolean getIsBranded__Native();

    private native Boolean getIsGeoproduct__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::RealTimePoiMetadata";
    }

    private native NativeObject init(Boolean bool, Boolean bool2);

    public synchronized Boolean getIsBranded() {
        try {
            if (!this.isBranded__is_initialized) {
                this.isBranded = getIsBranded__Native();
                this.isBranded__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isBranded;
    }

    public synchronized Boolean getIsGeoproduct() {
        try {
            if (!this.isGeoproduct__is_initialized) {
                this.isGeoproduct = getIsGeoproduct__Native();
                this.isGeoproduct__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isGeoproduct;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getIsGeoproduct(), true);
            archive.add(getIsBranded(), true);
            return;
        }
        this.isGeoproduct = archive.add(this.isGeoproduct, true);
        this.isGeoproduct__is_initialized = true;
        Boolean add = archive.add(this.isBranded, true);
        this.isBranded = add;
        this.isBranded__is_initialized = true;
        this.nativeObject = init(this.isGeoproduct, add);
    }

    public RealTimePoiMetadata() {
        this.isGeoproduct__is_initialized = false;
        this.isBranded__is_initialized = false;
    }

    private RealTimePoiMetadata(NativeObject nativeObject) {
        this.isGeoproduct__is_initialized = false;
        this.isBranded__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
