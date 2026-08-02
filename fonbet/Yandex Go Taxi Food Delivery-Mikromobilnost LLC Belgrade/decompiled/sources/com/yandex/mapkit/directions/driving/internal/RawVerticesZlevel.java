package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RawVerticesZlevel implements Serializable {
    private NativeObject nativeObject;
    private List<RawVertexZLevel> vertexZlevel;
    private boolean vertexZlevel__is_initialized;

    public RawVerticesZlevel(List<RawVertexZLevel> list) {
        this.vertexZlevel__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"vertexZlevel\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.vertexZlevel = list;
        this.vertexZlevel__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawVerticesZlevel";
    }

    private native List<RawVertexZLevel> getVertexZlevel__Native();

    private native NativeObject init(List<RawVertexZLevel> list);

    public synchronized List<RawVertexZLevel> getVertexZlevel() {
        try {
            if (!this.vertexZlevel__is_initialized) {
                this.vertexZlevel = getVertexZlevel__Native();
                this.vertexZlevel__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.vertexZlevel;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(RawVertexZLevel.class, archive, getVertexZlevel(), false);
            return;
        }
        List<RawVertexZLevel> e = nzs.e(RawVertexZLevel.class, archive, this.vertexZlevel, false);
        this.vertexZlevel = e;
        this.vertexZlevel__is_initialized = true;
        this.nativeObject = init(e);
    }

    public RawVerticesZlevel() {
        this.vertexZlevel__is_initialized = false;
    }

    private RawVerticesZlevel(NativeObject nativeObject) {
        this.vertexZlevel__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
