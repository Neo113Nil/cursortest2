package com.yandex.mapkit.geometry;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes8.dex */
public class Polygon implements Serializable {
    private List<LinearRing> innerRings;
    private boolean innerRings__is_initialized;
    private NativeObject nativeObject;
    private LinearRing outerRing;
    private boolean outerRing__is_initialized;

    public Polygon(LinearRing linearRing, List<LinearRing> list) {
        this.outerRing__is_initialized = false;
        this.innerRings__is_initialized = false;
        if (linearRing == null) {
            ny61.g("Required field \"outerRing\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"innerRings\" cannot be null");
            throw null;
        }
        this.nativeObject = init(linearRing, list);
        this.outerRing = linearRing;
        this.outerRing__is_initialized = true;
        this.innerRings = list;
        this.innerRings__is_initialized = true;
    }

    private native List<LinearRing> getInnerRings__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::Polygon";
    }

    private native LinearRing getOuterRing__Native();

    private native NativeObject init(LinearRing linearRing, List<LinearRing> list);

    public synchronized List<LinearRing> getInnerRings() {
        try {
            if (!this.innerRings__is_initialized) {
                this.innerRings = getInnerRings__Native();
                this.innerRings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.innerRings;
    }

    public synchronized LinearRing getOuterRing() {
        try {
            if (!this.outerRing__is_initialized) {
                this.outerRing = getOuterRing__Native();
                this.outerRing__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.outerRing;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getOuterRing(), false, (Class<Archive>) LinearRing.class);
            nzs.m(LinearRing.class, archive, getInnerRings(), false);
            return;
        }
        this.outerRing = (LinearRing) archive.add((Archive) this.outerRing, false, (Class<Archive>) LinearRing.class);
        this.outerRing__is_initialized = true;
        List<LinearRing> e = nzs.e(LinearRing.class, archive, this.innerRings, false);
        this.innerRings = e;
        this.innerRings__is_initialized = true;
        this.nativeObject = init(this.outerRing, e);
    }

    public Polygon() {
        this.outerRing__is_initialized = false;
        this.innerRings__is_initialized = false;
    }

    private Polygon(NativeObject nativeObject) {
        this.outerRing__is_initialized = false;
        this.innerRings__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
