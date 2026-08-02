package com.yandex.mapkit.geometry;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class LinearRing implements Serializable {
    private NativeObject nativeObject;
    private List<Point> points;
    private boolean points__is_initialized;

    public LinearRing(List<Point> list) {
        this.points__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"points\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.points = list;
        this.points__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::LinearRing";
    }

    private native List<Point> getPoints__Native();

    private native NativeObject init(List<Point> list);

    public synchronized List<Point> getPoints() {
        try {
            if (!this.points__is_initialized) {
                this.points = getPoints__Native();
                this.points__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.points;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Point.class, archive, getPoints(), false);
            return;
        }
        List<Point> e = nzs.e(Point.class, archive, this.points, false);
        this.points = e;
        this.points__is_initialized = true;
        this.nativeObject = init(e);
    }

    public LinearRing() {
        this.points__is_initialized = false;
    }

    private LinearRing(NativeObject nativeObject) {
        this.points__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
