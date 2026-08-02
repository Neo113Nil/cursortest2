package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Entrance implements Serializable {
    private Direction direction;
    private boolean direction__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private Point point;
    private boolean point__is_initialized;

    public Entrance(String str, Point point, Direction direction) {
        this.name__is_initialized = false;
        this.point__is_initialized = false;
        this.direction__is_initialized = false;
        if (point == null) {
            ny61.g("Required field \"point\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, point, direction);
        this.name = str;
        this.name__is_initialized = true;
        this.point = point;
        this.point__is_initialized = true;
        this.direction = direction;
        this.direction__is_initialized = true;
    }

    private native Direction getDirection__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Entrance";
    }

    private native Point getPoint__Native();

    private native NativeObject init(String str, Point point, Direction direction);

    public synchronized Direction getDirection() {
        try {
            if (!this.direction__is_initialized) {
                this.direction = getDirection__Native();
                this.direction__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.direction;
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

    public synchronized Point getPoint() {
        try {
            if (!this.point__is_initialized) {
                this.point = getPoint__Native();
                this.point__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.point;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getName(), true);
            archive.add((Archive) getPoint(), false, (Class<Archive>) Point.class);
            archive.add((Archive) getDirection(), true, (Class<Archive>) Direction.class);
            return;
        }
        this.name = archive.add(this.name, true);
        this.name__is_initialized = true;
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
        this.point__is_initialized = true;
        Direction direction = (Direction) archive.add((Archive) this.direction, true, (Class<Archive>) Direction.class);
        this.direction = direction;
        this.direction__is_initialized = true;
        this.nativeObject = init(this.name, this.point, direction);
    }

    public Entrance() {
        this.name__is_initialized = false;
        this.point__is_initialized = false;
        this.direction__is_initialized = false;
    }

    private Entrance(NativeObject nativeObject) {
        this.name__is_initialized = false;
        this.point__is_initialized = false;
        this.direction__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
