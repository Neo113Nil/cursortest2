package com.yandex.mapkit.location;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class LocationError implements Serializable {
    private Range lateralErrorRange;
    private boolean lateralErrorRange__is_initialized;
    private Range longitudinalErrorRange;
    private boolean longitudinalErrorRange__is_initialized;
    private NativeObject nativeObject;

    public LocationError(Range range, Range range2) {
        this.lateralErrorRange__is_initialized = false;
        this.longitudinalErrorRange__is_initialized = false;
        if (range == null) {
            ny61.g("Required field \"lateralErrorRange\" cannot be null");
            throw null;
        }
        if (range2 == null) {
            ny61.g("Required field \"longitudinalErrorRange\" cannot be null");
            throw null;
        }
        this.nativeObject = init(range, range2);
        this.lateralErrorRange = range;
        this.lateralErrorRange__is_initialized = true;
        this.longitudinalErrorRange = range2;
        this.longitudinalErrorRange__is_initialized = true;
    }

    private native Range getLateralErrorRange__Native();

    private native Range getLongitudinalErrorRange__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::location::LocationError";
    }

    private native NativeObject init(Range range, Range range2);

    public synchronized Range getLateralErrorRange() {
        try {
            if (!this.lateralErrorRange__is_initialized) {
                this.lateralErrorRange = getLateralErrorRange__Native();
                this.lateralErrorRange__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.lateralErrorRange;
    }

    public synchronized Range getLongitudinalErrorRange() {
        try {
            if (!this.longitudinalErrorRange__is_initialized) {
                this.longitudinalErrorRange = getLongitudinalErrorRange__Native();
                this.longitudinalErrorRange__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.longitudinalErrorRange;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getLateralErrorRange(), false, (Class<Archive>) Range.class);
            archive.add((Archive) getLongitudinalErrorRange(), false, (Class<Archive>) Range.class);
            return;
        }
        this.lateralErrorRange = (Range) archive.add((Archive) this.lateralErrorRange, false, (Class<Archive>) Range.class);
        this.lateralErrorRange__is_initialized = true;
        Range range = (Range) archive.add((Archive) this.longitudinalErrorRange, false, (Class<Archive>) Range.class);
        this.longitudinalErrorRange = range;
        this.longitudinalErrorRange__is_initialized = true;
        this.nativeObject = init(this.lateralErrorRange, range);
    }

    public LocationError() {
        this.lateralErrorRange__is_initialized = false;
        this.longitudinalErrorRange__is_initialized = false;
    }

    private LocationError(NativeObject nativeObject) {
        this.lateralErrorRange__is_initialized = false;
        this.longitudinalErrorRange__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
