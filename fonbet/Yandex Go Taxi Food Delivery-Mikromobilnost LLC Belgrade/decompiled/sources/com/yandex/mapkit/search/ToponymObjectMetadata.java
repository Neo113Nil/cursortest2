package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ToponymObjectMetadata implements BaseMetadata, Serializable {
    private Address address;
    private boolean address__is_initialized;
    private Point balloonPoint;
    private boolean balloonPoint__is_initialized;
    private String formerName;
    private boolean formerName__is_initialized;
    private int geoId;
    private boolean geoId__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private Precision precision;
    private boolean precision__is_initialized;

    public ToponymObjectMetadata(Address address, Precision precision, String str, Point point, int i, String str2) {
        this.address__is_initialized = false;
        this.precision__is_initialized = false;
        this.formerName__is_initialized = false;
        this.balloonPoint__is_initialized = false;
        this.geoId__is_initialized = false;
        this.id__is_initialized = false;
        if (address == null) {
            ny61.g("Required field \"address\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"balloonPoint\" cannot be null");
            throw null;
        }
        this.nativeObject = init(address, precision, str, point, i, str2);
        this.address = address;
        this.address__is_initialized = true;
        this.precision = precision;
        this.precision__is_initialized = true;
        this.formerName = str;
        this.formerName__is_initialized = true;
        this.balloonPoint = point;
        this.balloonPoint__is_initialized = true;
        this.geoId = i;
        this.geoId__is_initialized = true;
        this.id = str2;
        this.id__is_initialized = true;
    }

    private native Address getAddress__Native();

    private native Point getBalloonPoint__Native();

    private native String getFormerName__Native();

    private native int getGeoId__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ToponymObjectMetadata";
    }

    private native Precision getPrecision__Native();

    private native NativeObject init(Address address, Precision precision, String str, Point point, int i, String str2);

    public synchronized Address getAddress() {
        try {
            if (!this.address__is_initialized) {
                this.address = getAddress__Native();
                this.address__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.address;
    }

    public synchronized Point getBalloonPoint() {
        try {
            if (!this.balloonPoint__is_initialized) {
                this.balloonPoint = getBalloonPoint__Native();
                this.balloonPoint__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.balloonPoint;
    }

    public synchronized String getFormerName() {
        try {
            if (!this.formerName__is_initialized) {
                this.formerName = getFormerName__Native();
                this.formerName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.formerName;
    }

    public synchronized int getGeoId() {
        try {
            if (!this.geoId__is_initialized) {
                this.geoId = getGeoId__Native();
                this.geoId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.geoId;
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

    public synchronized Precision getPrecision() {
        try {
            if (!this.precision__is_initialized) {
                this.precision = getPrecision__Native();
                this.precision__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.precision;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAddress(), false, (Class<Archive>) Address.class);
            archive.add((Archive) getPrecision(), true, (Class<Archive>) Precision.class);
            archive.add(getFormerName(), true);
            archive.add((Archive) getBalloonPoint(), false, (Class<Archive>) Point.class);
            archive.add(getGeoId());
            archive.add(getId(), true);
            return;
        }
        this.address = (Address) archive.add((Archive) this.address, false, (Class<Archive>) Address.class);
        this.address__is_initialized = true;
        this.precision = (Precision) archive.add((Archive) this.precision, true, (Class<Archive>) Precision.class);
        this.precision__is_initialized = true;
        this.formerName = archive.add(this.formerName, true);
        this.formerName__is_initialized = true;
        this.balloonPoint = (Point) archive.add((Archive) this.balloonPoint, false, (Class<Archive>) Point.class);
        this.balloonPoint__is_initialized = true;
        this.geoId = archive.add(this.geoId);
        this.geoId__is_initialized = true;
        String add = archive.add(this.id, true);
        this.id = add;
        this.id__is_initialized = true;
        this.nativeObject = init(this.address, this.precision, this.formerName, this.balloonPoint, this.geoId, add);
    }

    public ToponymObjectMetadata() {
        this.address__is_initialized = false;
        this.precision__is_initialized = false;
        this.formerName__is_initialized = false;
        this.balloonPoint__is_initialized = false;
        this.geoId__is_initialized = false;
        this.id__is_initialized = false;
    }

    private ToponymObjectMetadata(NativeObject nativeObject) {
        this.address__is_initialized = false;
        this.precision__is_initialized = false;
        this.formerName__is_initialized = false;
        this.balloonPoint__is_initialized = false;
        this.geoId__is_initialized = false;
        this.id__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
