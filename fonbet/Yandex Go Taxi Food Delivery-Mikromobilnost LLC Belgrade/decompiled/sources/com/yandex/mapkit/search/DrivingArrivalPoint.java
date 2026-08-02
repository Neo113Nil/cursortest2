package com.yandex.mapkit.search;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class DrivingArrivalPoint implements Serializable {
    private Point anchor;
    private boolean anchor__is_initialized;
    private String description;
    private boolean description__is_initialized;
    private Geometry geometry;
    private boolean geometry__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private ParkingAttributes parkingAttributes;
    private boolean parkingAttributes__is_initialized;
    private List<String> tags;
    private boolean tags__is_initialized;
    private LocalizedValue walkingTime;
    private boolean walkingTime__is_initialized;

    public DrivingArrivalPoint(String str, Point point, Geometry geometry, LocalizedValue localizedValue, String str2, List<String> list, ParkingAttributes parkingAttributes) {
        this.id__is_initialized = false;
        this.anchor__is_initialized = false;
        this.geometry__is_initialized = false;
        this.walkingTime__is_initialized = false;
        this.description__is_initialized = false;
        this.tags__is_initialized = false;
        this.parkingAttributes__is_initialized = false;
        if (point == null) {
            ny61.g("Required field \"anchor\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, point, geometry, localizedValue, str2, list, parkingAttributes);
        this.id = str;
        this.id__is_initialized = true;
        this.anchor = point;
        this.anchor__is_initialized = true;
        this.geometry = geometry;
        this.geometry__is_initialized = true;
        this.walkingTime = localizedValue;
        this.walkingTime__is_initialized = true;
        this.description = str2;
        this.description__is_initialized = true;
        this.tags = list;
        this.tags__is_initialized = true;
        this.parkingAttributes = parkingAttributes;
        this.parkingAttributes__is_initialized = true;
    }

    private native Point getAnchor__Native();

    private native String getDescription__Native();

    private native Geometry getGeometry__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::DrivingArrivalPoint";
    }

    private native ParkingAttributes getParkingAttributes__Native();

    private native List<String> getTags__Native();

    private native LocalizedValue getWalkingTime__Native();

    private native NativeObject init(String str, Point point, Geometry geometry, LocalizedValue localizedValue, String str2, List<String> list, ParkingAttributes parkingAttributes);

    public synchronized Point getAnchor() {
        try {
            if (!this.anchor__is_initialized) {
                this.anchor = getAnchor__Native();
                this.anchor__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.anchor;
    }

    public synchronized String getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.description;
    }

    public synchronized Geometry getGeometry() {
        try {
            if (!this.geometry__is_initialized) {
                this.geometry = getGeometry__Native();
                this.geometry__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.geometry;
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

    public synchronized ParkingAttributes getParkingAttributes() {
        try {
            if (!this.parkingAttributes__is_initialized) {
                this.parkingAttributes = getParkingAttributes__Native();
                this.parkingAttributes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.parkingAttributes;
    }

    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tags;
    }

    public synchronized LocalizedValue getWalkingTime() {
        try {
            if (!this.walkingTime__is_initialized) {
                this.walkingTime = getWalkingTime__Native();
                this.walkingTime__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.walkingTime;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), true);
            archive.add((Archive) getAnchor(), false, (Class<Archive>) Point.class);
            archive.add((Archive) getGeometry(), true, (Class<Archive>) Geometry.class);
            archive.add((Archive) getWalkingTime(), true, (Class<Archive>) LocalizedValue.class);
            archive.add(getDescription(), true);
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            archive.add((Archive) getParkingAttributes(), true, (Class<Archive>) ParkingAttributes.class);
            return;
        }
        this.id = archive.add(this.id, true);
        this.id__is_initialized = true;
        this.anchor = (Point) archive.add((Archive) this.anchor, false, (Class<Archive>) Point.class);
        this.anchor__is_initialized = true;
        this.geometry = (Geometry) archive.add((Archive) this.geometry, true, (Class<Archive>) Geometry.class);
        this.geometry__is_initialized = true;
        this.walkingTime = (LocalizedValue) archive.add((Archive) this.walkingTime, true, (Class<Archive>) LocalizedValue.class);
        this.walkingTime__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        this.tags = nnm.o(archive, this.tags, false);
        this.tags__is_initialized = true;
        ParkingAttributes parkingAttributes = (ParkingAttributes) archive.add((Archive) this.parkingAttributes, true, (Class<Archive>) ParkingAttributes.class);
        this.parkingAttributes = parkingAttributes;
        this.parkingAttributes__is_initialized = true;
        this.nativeObject = init(this.id, this.anchor, this.geometry, this.walkingTime, this.description, this.tags, parkingAttributes);
    }

    public DrivingArrivalPoint() {
        this.id__is_initialized = false;
        this.anchor__is_initialized = false;
        this.geometry__is_initialized = false;
        this.walkingTime__is_initialized = false;
        this.description__is_initialized = false;
        this.tags__is_initialized = false;
        this.parkingAttributes__is_initialized = false;
    }

    private DrivingArrivalPoint(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.anchor__is_initialized = false;
        this.geometry__is_initialized = false;
        this.walkingTime__is_initialized = false;
        this.description__is_initialized = false;
        this.tags__is_initialized = false;
        this.parkingAttributes__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
