package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Vehicle implements BaseMetadata, Serializable {
    private String id;
    private boolean id__is_initialized;
    private Line line;
    private boolean line__is_initialized;
    private NativeObject nativeObject;
    private Point position;
    private boolean position__is_initialized;
    private Properties properties;
    private boolean properties__is_initialized;
    private List<VehicleStop> stops;
    private boolean stops__is_initialized;
    private String threadId;
    private boolean threadId__is_initialized;

    public Vehicle(String str, String str2, Line line, List<VehicleStop> list, Point point, Properties properties) {
        this.id__is_initialized = false;
        this.threadId__is_initialized = false;
        this.line__is_initialized = false;
        this.stops__is_initialized = false;
        this.position__is_initialized = false;
        this.properties__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"threadId\" cannot be null");
            throw null;
        }
        if (line == null) {
            ny61.g("Required field \"line\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"stops\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, line, list, point, properties);
        this.id = str;
        this.id__is_initialized = true;
        this.threadId = str2;
        this.threadId__is_initialized = true;
        this.line = line;
        this.line__is_initialized = true;
        this.stops = list;
        this.stops__is_initialized = true;
        this.position = point;
        this.position__is_initialized = true;
        this.properties = properties;
        this.properties__is_initialized = true;
    }

    private native String getId__Native();

    private native Line getLine__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Vehicle";
    }

    private native Point getPosition__Native();

    private native Properties getProperties__Native();

    private native List<VehicleStop> getStops__Native();

    private native String getThreadId__Native();

    private native NativeObject init(String str, String str2, Line line, List<VehicleStop> list, Point point, Properties properties);

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

    public synchronized Line getLine() {
        try {
            if (!this.line__is_initialized) {
                this.line = getLine__Native();
                this.line__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.line;
    }

    public synchronized Point getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.position;
    }

    public synchronized Properties getProperties() {
        try {
            if (!this.properties__is_initialized) {
                this.properties = getProperties__Native();
                this.properties__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.properties;
    }

    public synchronized List<VehicleStop> getStops() {
        try {
            if (!this.stops__is_initialized) {
                this.stops = getStops__Native();
                this.stops__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stops;
    }

    public synchronized String getThreadId() {
        try {
            if (!this.threadId__is_initialized) {
                this.threadId = getThreadId__Native();
                this.threadId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.threadId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getThreadId(), false);
            archive.add((Archive) getLine(), false, (Class<Archive>) Line.class);
            archive.add((List) getStops(), false, (ArchivingHandler) new ClassHandler(VehicleStop.class));
            archive.add((Archive) getPosition(), false, (Class<Archive>) Point.class);
            archive.add((Archive) getProperties(), true, (Class<Archive>) Properties.class);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        this.threadId = archive.add(this.threadId, false);
        this.threadId__is_initialized = true;
        this.line = (Line) archive.add((Archive) this.line, false, (Class<Archive>) Line.class);
        this.line__is_initialized = true;
        this.stops = nzs.e(VehicleStop.class, archive, this.stops, false);
        this.stops__is_initialized = true;
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.position__is_initialized = true;
        Properties properties = (Properties) archive.add((Archive) this.properties, true, (Class<Archive>) Properties.class);
        this.properties = properties;
        this.properties__is_initialized = true;
        this.nativeObject = init(this.id, this.threadId, this.line, this.stops, this.position, properties);
    }

    public static class Properties implements Serializable {
        private Boolean airConditioning;
        private boolean airConditioning__is_initialized;
        private Boolean bikesAllowed;
        private boolean bikesAllowed__is_initialized;
        private Boolean lowFloor;
        private boolean lowFloor__is_initialized;
        private NativeObject nativeObject;
        private Boolean toDepot;
        private boolean toDepot__is_initialized;
        private Boolean wheelchairAccessible;
        private boolean wheelchairAccessible__is_initialized;

        public Properties(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
            this.wheelchairAccessible__is_initialized = false;
            this.bikesAllowed__is_initialized = false;
            this.airConditioning__is_initialized = false;
            this.lowFloor__is_initialized = false;
            this.toDepot__is_initialized = false;
            this.nativeObject = init(bool, bool2, bool3, bool4, bool5);
            this.wheelchairAccessible = bool;
            this.wheelchairAccessible__is_initialized = true;
            this.bikesAllowed = bool2;
            this.bikesAllowed__is_initialized = true;
            this.airConditioning = bool3;
            this.airConditioning__is_initialized = true;
            this.lowFloor = bool4;
            this.lowFloor__is_initialized = true;
            this.toDepot = bool5;
            this.toDepot__is_initialized = true;
        }

        private native Boolean getAirConditioning__Native();

        private native Boolean getBikesAllowed__Native();

        private native Boolean getLowFloor__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::Vehicle::Properties";
        }

        private native Boolean getToDepot__Native();

        private native Boolean getWheelchairAccessible__Native();

        private native NativeObject init(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5);

        public synchronized Boolean getAirConditioning() {
            try {
                if (!this.airConditioning__is_initialized) {
                    this.airConditioning = getAirConditioning__Native();
                    this.airConditioning__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.airConditioning;
        }

        public synchronized Boolean getBikesAllowed() {
            try {
                if (!this.bikesAllowed__is_initialized) {
                    this.bikesAllowed = getBikesAllowed__Native();
                    this.bikesAllowed__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.bikesAllowed;
        }

        public synchronized Boolean getLowFloor() {
            try {
                if (!this.lowFloor__is_initialized) {
                    this.lowFloor = getLowFloor__Native();
                    this.lowFloor__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.lowFloor;
        }

        public synchronized Boolean getToDepot() {
            try {
                if (!this.toDepot__is_initialized) {
                    this.toDepot = getToDepot__Native();
                    this.toDepot__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.toDepot;
        }

        public synchronized Boolean getWheelchairAccessible() {
            try {
                if (!this.wheelchairAccessible__is_initialized) {
                    this.wheelchairAccessible = getWheelchairAccessible__Native();
                    this.wheelchairAccessible__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.wheelchairAccessible;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getWheelchairAccessible(), true);
                archive.add(getBikesAllowed(), true);
                archive.add(getAirConditioning(), true);
                archive.add(getLowFloor(), true);
                archive.add(getToDepot(), true);
                return;
            }
            this.wheelchairAccessible = archive.add(this.wheelchairAccessible, true);
            this.wheelchairAccessible__is_initialized = true;
            this.bikesAllowed = archive.add(this.bikesAllowed, true);
            this.bikesAllowed__is_initialized = true;
            this.airConditioning = archive.add(this.airConditioning, true);
            this.airConditioning__is_initialized = true;
            this.lowFloor = archive.add(this.lowFloor, true);
            this.lowFloor__is_initialized = true;
            Boolean add = archive.add(this.toDepot, true);
            this.toDepot = add;
            this.toDepot__is_initialized = true;
            this.nativeObject = init(this.wheelchairAccessible, this.bikesAllowed, this.airConditioning, this.lowFloor, add);
        }

        public Properties() {
            this.wheelchairAccessible__is_initialized = false;
            this.bikesAllowed__is_initialized = false;
            this.airConditioning__is_initialized = false;
            this.lowFloor__is_initialized = false;
            this.toDepot__is_initialized = false;
        }

        private Properties(NativeObject nativeObject) {
            this.wheelchairAccessible__is_initialized = false;
            this.bikesAllowed__is_initialized = false;
            this.airConditioning__is_initialized = false;
            this.lowFloor__is_initialized = false;
            this.toDepot__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public Vehicle() {
        this.id__is_initialized = false;
        this.threadId__is_initialized = false;
        this.line__is_initialized = false;
        this.stops__is_initialized = false;
        this.position__is_initialized = false;
        this.properties__is_initialized = false;
    }

    private Vehicle(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.threadId__is_initialized = false;
        this.line__is_initialized = false;
        this.stops__is_initialized = false;
        this.position__is_initialized = false;
        this.properties__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
