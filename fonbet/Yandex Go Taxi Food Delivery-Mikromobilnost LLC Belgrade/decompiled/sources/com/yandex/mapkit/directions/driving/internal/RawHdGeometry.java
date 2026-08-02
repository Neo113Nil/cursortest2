package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.IntegerHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawHdGeometry implements Serializable {
    private List<RawHdGeometryPart> hdGeometryPart;
    private boolean hdGeometryPart__is_initialized;
    private NativeObject nativeObject;
    private List<Integer> sdPointToHdPoint;
    private boolean sdPointToHdPoint__is_initialized;

    public RawHdGeometry(List<RawHdGeometryPart> list, List<Integer> list2) {
        this.hdGeometryPart__is_initialized = false;
        this.sdPointToHdPoint__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"hdGeometryPart\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"sdPointToHdPoint\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2);
        this.hdGeometryPart = list;
        this.hdGeometryPart__is_initialized = true;
        this.sdPointToHdPoint = list2;
        this.sdPointToHdPoint__is_initialized = true;
    }

    private native List<RawHdGeometryPart> getHdGeometryPart__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawHdGeometry";
    }

    private native List<Integer> getSdPointToHdPoint__Native();

    private native NativeObject init(List<RawHdGeometryPart> list, List<Integer> list2);

    public synchronized List<RawHdGeometryPart> getHdGeometryPart() {
        try {
            if (!this.hdGeometryPart__is_initialized) {
                this.hdGeometryPart = getHdGeometryPart__Native();
                this.hdGeometryPart__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hdGeometryPart;
    }

    public synchronized List<Integer> getSdPointToHdPoint() {
        try {
            if (!this.sdPointToHdPoint__is_initialized) {
                this.sdPointToHdPoint = getSdPointToHdPoint__Native();
                this.sdPointToHdPoint__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.sdPointToHdPoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getHdGeometryPart(), false, (ArchivingHandler) new ClassHandler(RawHdGeometryPart.class));
            archive.add((List) getSdPointToHdPoint(), false, (ArchivingHandler) new IntegerHandler());
            return;
        }
        this.hdGeometryPart = nzs.e(RawHdGeometryPart.class, archive, this.hdGeometryPart, false);
        this.hdGeometryPart__is_initialized = true;
        List<Integer> add = archive.add((List) this.sdPointToHdPoint, false, (ArchivingHandler) new IntegerHandler());
        this.sdPointToHdPoint = add;
        this.sdPointToHdPoint__is_initialized = true;
        this.nativeObject = init(this.hdGeometryPart, add);
    }

    public RawHdGeometry() {
        this.hdGeometryPart__is_initialized = false;
        this.sdPointToHdPoint__is_initialized = false;
    }

    private RawHdGeometry(NativeObject nativeObject) {
        this.hdGeometryPart__is_initialized = false;
        this.sdPointToHdPoint__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
