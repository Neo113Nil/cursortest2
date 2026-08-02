package com.yandex.mapkit.geometry;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class MultiPolygon implements Serializable {
    private NativeObject nativeObject;
    private List<Polygon> polygons;
    private boolean polygons__is_initialized;

    public MultiPolygon(List<Polygon> list) {
        this.polygons__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"polygons\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.polygons = list;
        this.polygons__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::MultiPolygon";
    }

    private native List<Polygon> getPolygons__Native();

    private native NativeObject init(List<Polygon> list);

    public synchronized List<Polygon> getPolygons() {
        try {
            if (!this.polygons__is_initialized) {
                this.polygons = getPolygons__Native();
                this.polygons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.polygons;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(Polygon.class, archive, getPolygons(), false);
            return;
        }
        List<Polygon> e = nzs.e(Polygon.class, archive, this.polygons, false);
        this.polygons = e;
        this.polygons__is_initialized = true;
        this.nativeObject = init(e);
    }

    public MultiPolygon() {
        this.polygons__is_initialized = false;
    }

    private MultiPolygon(NativeObject nativeObject) {
        this.polygons__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
