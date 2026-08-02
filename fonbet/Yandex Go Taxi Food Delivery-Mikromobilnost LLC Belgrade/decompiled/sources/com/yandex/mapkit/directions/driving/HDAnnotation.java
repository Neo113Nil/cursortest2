package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class HDAnnotation implements Serializable {
    private LinearRing actionArea;
    private boolean actionArea__is_initialized;
    private NativeObject nativeObject;
    private Polyline trajectory;
    private boolean trajectory__is_initialized;

    public HDAnnotation(LinearRing linearRing, Polyline polyline) {
        this.actionArea__is_initialized = false;
        this.trajectory__is_initialized = false;
        this.nativeObject = init(linearRing, polyline);
        this.actionArea = linearRing;
        this.actionArea__is_initialized = true;
        this.trajectory = polyline;
        this.trajectory__is_initialized = true;
    }

    private native LinearRing getActionArea__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::HDAnnotation";
    }

    private native Polyline getTrajectory__Native();

    private native NativeObject init(LinearRing linearRing, Polyline polyline);

    public synchronized LinearRing getActionArea() {
        try {
            if (!this.actionArea__is_initialized) {
                this.actionArea = getActionArea__Native();
                this.actionArea__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.actionArea;
    }

    public synchronized Polyline getTrajectory() {
        try {
            if (!this.trajectory__is_initialized) {
                this.trajectory = getTrajectory__Native();
                this.trajectory__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.trajectory;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getActionArea(), true, (Class<Archive>) LinearRing.class);
            archive.add((Archive) getTrajectory(), true, (Class<Archive>) Polyline.class);
            return;
        }
        this.actionArea = (LinearRing) archive.add((Archive) this.actionArea, true, (Class<Archive>) LinearRing.class);
        this.actionArea__is_initialized = true;
        Polyline polyline = (Polyline) archive.add((Archive) this.trajectory, true, (Class<Archive>) Polyline.class);
        this.trajectory = polyline;
        this.trajectory__is_initialized = true;
        this.nativeObject = init(this.actionArea, polyline);
    }

    public HDAnnotation() {
        this.actionArea__is_initialized = false;
        this.trajectory__is_initialized = false;
    }

    private HDAnnotation(NativeObject nativeObject) {
        this.actionArea__is_initialized = false;
        this.trajectory__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
