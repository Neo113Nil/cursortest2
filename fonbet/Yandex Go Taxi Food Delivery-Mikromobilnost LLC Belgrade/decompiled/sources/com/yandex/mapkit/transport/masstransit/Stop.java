package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Stop implements BaseMetadata, Serializable {
    private String additionalName;
    private boolean additionalName__is_initialized;
    private StopFeatureMask features;
    private boolean features__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private List<TransportContour> transportContours;
    private boolean transportContours__is_initialized;

    public Stop(String str, String str2, String str3, StopFeatureMask stopFeatureMask, List<TransportContour> list) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"name\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"transportContours\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, stopFeatureMask, list);
        this.id = str;
        this.id__is_initialized = true;
        this.name = str2;
        this.name__is_initialized = true;
        this.additionalName = str3;
        this.additionalName__is_initialized = true;
        this.features = stopFeatureMask;
        this.features__is_initialized = true;
        this.transportContours = list;
        this.transportContours__is_initialized = true;
    }

    private native String getAdditionalName__Native();

    private native StopFeatureMask getFeatures__Native();

    private native String getId__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Stop";
    }

    private native List<TransportContour> getTransportContours__Native();

    private native NativeObject init(String str, String str2, String str3, StopFeatureMask stopFeatureMask, List<TransportContour> list);

    public synchronized String getAdditionalName() {
        try {
            if (!this.additionalName__is_initialized) {
                this.additionalName = getAdditionalName__Native();
                this.additionalName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.additionalName;
    }

    public synchronized StopFeatureMask getFeatures() {
        try {
            if (!this.features__is_initialized) {
                this.features = getFeatures__Native();
                this.features__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.features;
    }

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

    public synchronized List<TransportContour> getTransportContours() {
        try {
            if (!this.transportContours__is_initialized) {
                this.transportContours = getTransportContours__Native();
                this.transportContours__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transportContours;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getName(), false);
            archive.add(getAdditionalName(), true);
            archive.add((Archive) getFeatures(), true, (Class<Archive>) StopFeatureMask.class);
            nzs.m(TransportContour.class, archive, getTransportContours(), false);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        this.name = archive.add(this.name, false);
        this.name__is_initialized = true;
        this.additionalName = archive.add(this.additionalName, true);
        this.additionalName__is_initialized = true;
        this.features = (StopFeatureMask) archive.add((Archive) this.features, true, (Class<Archive>) StopFeatureMask.class);
        this.features__is_initialized = true;
        List<TransportContour> e = nzs.e(TransportContour.class, archive, this.transportContours, false);
        this.transportContours = e;
        this.transportContours__is_initialized = true;
        this.nativeObject = init(this.id, this.name, this.additionalName, this.features, e);
    }

    public Stop() {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
    }

    private Stop(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
