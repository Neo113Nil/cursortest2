package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class HdSection implements Serializable {
    private NativeObject nativeObject;
    private Subpolyline position;
    private boolean position__is_initialized;

    public HdSection(Subpolyline subpolyline) {
        this.position__is_initialized = false;
        if (subpolyline == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        this.nativeObject = init(subpolyline);
        this.position = subpolyline;
        this.position__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::HdSection";
    }

    private native Subpolyline getPosition__Native();

    private native NativeObject init(Subpolyline subpolyline);

    public synchronized Subpolyline getPosition() {
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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPosition(), false, (Class<Archive>) Subpolyline.class);
            return;
        }
        Subpolyline subpolyline = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
        this.position = subpolyline;
        this.position__is_initialized = true;
        this.nativeObject = init(subpolyline);
    }

    public HdSection() {
        this.position__is_initialized = false;
    }

    private HdSection(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
