package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RouteDistancesObjectMetadata implements BaseMetadata, Serializable {
    private AbsoluteDistance absolute;
    private boolean absolute__is_initialized;
    private NativeObject nativeObject;
    private RelativeDistance relative;
    private boolean relative__is_initialized;

    public RouteDistancesObjectMetadata(AbsoluteDistance absoluteDistance, RelativeDistance relativeDistance) {
        this.absolute__is_initialized = false;
        this.relative__is_initialized = false;
        this.nativeObject = init(absoluteDistance, relativeDistance);
        this.absolute = absoluteDistance;
        this.absolute__is_initialized = true;
        this.relative = relativeDistance;
        this.relative__is_initialized = true;
    }

    private native AbsoluteDistance getAbsolute__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::RouteDistancesObjectMetadata";
    }

    private native RelativeDistance getRelative__Native();

    private native NativeObject init(AbsoluteDistance absoluteDistance, RelativeDistance relativeDistance);

    public synchronized AbsoluteDistance getAbsolute() {
        try {
            if (!this.absolute__is_initialized) {
                this.absolute = getAbsolute__Native();
                this.absolute__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.absolute;
    }

    public synchronized RelativeDistance getRelative() {
        try {
            if (!this.relative__is_initialized) {
                this.relative = getRelative__Native();
                this.relative__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.relative;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAbsolute(), true, (Class<Archive>) AbsoluteDistance.class);
            archive.add((Archive) getRelative(), true, (Class<Archive>) RelativeDistance.class);
            return;
        }
        this.absolute = (AbsoluteDistance) archive.add((Archive) this.absolute, true, (Class<Archive>) AbsoluteDistance.class);
        this.absolute__is_initialized = true;
        RelativeDistance relativeDistance = (RelativeDistance) archive.add((Archive) this.relative, true, (Class<Archive>) RelativeDistance.class);
        this.relative = relativeDistance;
        this.relative__is_initialized = true;
        this.nativeObject = init(this.absolute, relativeDistance);
    }

    public RouteDistancesObjectMetadata() {
        this.absolute__is_initialized = false;
        this.relative__is_initialized = false;
    }

    private RouteDistancesObjectMetadata(NativeObject nativeObject) {
        this.absolute__is_initialized = false;
        this.relative__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
