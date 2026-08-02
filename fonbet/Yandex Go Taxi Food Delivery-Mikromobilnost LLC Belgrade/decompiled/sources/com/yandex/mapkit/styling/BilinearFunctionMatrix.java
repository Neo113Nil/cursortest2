package com.yandex.mapkit.styling;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.FloatHandler;
import com.yandex.runtime.bindings.ListHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class BilinearFunctionMatrix implements Serializable {
    private NativeObject nativeObject;
    private List<List<Float>> points;
    private boolean points__is_initialized;
    private List<Float> tilts;
    private boolean tilts__is_initialized;
    private List<Float> zooms;
    private boolean zooms__is_initialized;

    public BilinearFunctionMatrix(List<Float> list, List<Float> list2, List<List<Float>> list3) {
        this.zooms__is_initialized = false;
        this.tilts__is_initialized = false;
        this.points__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"zooms\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"tilts\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"points\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2, list3);
        this.zooms = list;
        this.zooms__is_initialized = true;
        this.tilts = list2;
        this.tilts__is_initialized = true;
        this.points = list3;
        this.points__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::styling::BilinearFunctionMatrix";
    }

    private native List<List<Float>> getPoints__Native();

    private native List<Float> getTilts__Native();

    private native List<Float> getZooms__Native();

    private native NativeObject init(List<Float> list, List<Float> list2, List<List<Float>> list3);

    public synchronized List<List<Float>> getPoints() {
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

    public synchronized List<Float> getTilts() {
        try {
            if (!this.tilts__is_initialized) {
                this.tilts = getTilts__Native();
                this.tilts__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tilts;
    }

    public synchronized List<Float> getZooms() {
        try {
            if (!this.zooms__is_initialized) {
                this.zooms = getZooms__Native();
                this.zooms__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zooms;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getZooms(), false, (ArchivingHandler) new FloatHandler());
            archive.add((List) getTilts(), false, (ArchivingHandler) new FloatHandler());
            archive.add((List) getPoints(), false, (ArchivingHandler) new ListHandler(new FloatHandler()));
            return;
        }
        this.zooms = archive.add((List) this.zooms, false, (ArchivingHandler) new FloatHandler());
        this.zooms__is_initialized = true;
        this.tilts = archive.add((List) this.tilts, false, (ArchivingHandler) new FloatHandler());
        this.tilts__is_initialized = true;
        List<List<Float>> add = archive.add((List) this.points, false, (ArchivingHandler) new ListHandler(new FloatHandler()));
        this.points = add;
        this.points__is_initialized = true;
        this.nativeObject = init(this.zooms, this.tilts, add);
    }

    public BilinearFunctionMatrix() {
        this.zooms__is_initialized = false;
        this.tilts__is_initialized = false;
        this.points__is_initialized = false;
    }

    private BilinearFunctionMatrix(NativeObject nativeObject) {
        this.zooms__is_initialized = false;
        this.tilts__is_initialized = false;
        this.points__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
