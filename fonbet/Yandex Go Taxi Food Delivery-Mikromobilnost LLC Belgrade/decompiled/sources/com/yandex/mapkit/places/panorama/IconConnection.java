package com.yandex.mapkit.places.panorama;

import com.yandex.mapkit.geometry.Direction;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class IconConnection implements Serializable {
    private Direction angularPosition;
    private boolean angularPosition__is_initialized;
    private String iconId;
    private boolean iconId__is_initialized;
    private NativeObject nativeObject;
    private String panoramaId;
    private boolean panoramaId__is_initialized;

    public IconConnection(Direction direction, String str, String str2) {
        this.angularPosition__is_initialized = false;
        this.iconId__is_initialized = false;
        this.panoramaId__is_initialized = false;
        if (direction == null) {
            ny61.g("Required field \"angularPosition\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"iconId\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"panoramaId\" cannot be null");
            throw null;
        }
        this.nativeObject = init(direction, str, str2);
        this.angularPosition = direction;
        this.angularPosition__is_initialized = true;
        this.iconId = str;
        this.iconId__is_initialized = true;
        this.panoramaId = str2;
        this.panoramaId__is_initialized = true;
    }

    private native Direction getAngularPosition__Native();

    private native String getIconId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::panorama::IconConnection";
    }

    private native String getPanoramaId__Native();

    private native NativeObject init(Direction direction, String str, String str2);

    public synchronized Direction getAngularPosition() {
        try {
            if (!this.angularPosition__is_initialized) {
                this.angularPosition = getAngularPosition__Native();
                this.angularPosition__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.angularPosition;
    }

    public synchronized String getIconId() {
        try {
            if (!this.iconId__is_initialized) {
                this.iconId = getIconId__Native();
                this.iconId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.iconId;
    }

    public synchronized String getPanoramaId() {
        try {
            if (!this.panoramaId__is_initialized) {
                this.panoramaId = getPanoramaId__Native();
                this.panoramaId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.panoramaId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAngularPosition(), false, (Class<Archive>) Direction.class);
            archive.add(getIconId(), false);
            archive.add(getPanoramaId(), false);
            return;
        }
        this.angularPosition = (Direction) archive.add((Archive) this.angularPosition, false, (Class<Archive>) Direction.class);
        this.angularPosition__is_initialized = true;
        this.iconId = archive.add(this.iconId, false);
        this.iconId__is_initialized = true;
        String add = archive.add(this.panoramaId, false);
        this.panoramaId = add;
        this.panoramaId__is_initialized = true;
        this.nativeObject = init(this.angularPosition, this.iconId, add);
    }

    public IconConnection() {
        this.angularPosition__is_initialized = false;
        this.iconId__is_initialized = false;
        this.panoramaId__is_initialized = false;
    }

    private IconConnection(NativeObject nativeObject) {
        this.angularPosition__is_initialized = false;
        this.iconId__is_initialized = false;
        this.panoramaId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
