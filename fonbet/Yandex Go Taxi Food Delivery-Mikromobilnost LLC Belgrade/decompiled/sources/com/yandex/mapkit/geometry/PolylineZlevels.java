package com.yandex.mapkit.geometry;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.IntegerHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class PolylineZlevels implements Serializable {
    private NativeObject nativeObject;
    private List<PolylinePosition> zlevelBreakpoints;
    private boolean zlevelBreakpoints__is_initialized;
    private List<Integer> zlevels;
    private boolean zlevels__is_initialized;

    public PolylineZlevels(List<Integer> list, List<PolylinePosition> list2) {
        this.zlevels__is_initialized = false;
        this.zlevelBreakpoints__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"zlevels\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"zlevelBreakpoints\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2);
        this.zlevels = list;
        this.zlevels__is_initialized = true;
        this.zlevelBreakpoints = list2;
        this.zlevelBreakpoints__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::PolylineZlevels";
    }

    private native List<PolylinePosition> getZlevelBreakpoints__Native();

    private native List<Integer> getZlevels__Native();

    private native NativeObject init(List<Integer> list, List<PolylinePosition> list2);

    public synchronized List<PolylinePosition> getZlevelBreakpoints() {
        try {
            if (!this.zlevelBreakpoints__is_initialized) {
                this.zlevelBreakpoints = getZlevelBreakpoints__Native();
                this.zlevelBreakpoints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zlevelBreakpoints;
    }

    public synchronized List<Integer> getZlevels() {
        try {
            if (!this.zlevels__is_initialized) {
                this.zlevels = getZlevels__Native();
                this.zlevels__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zlevels;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getZlevels(), false, (ArchivingHandler) new IntegerHandler());
            nzs.m(PolylinePosition.class, archive, getZlevelBreakpoints(), false);
            return;
        }
        this.zlevels = archive.add((List) this.zlevels, false, (ArchivingHandler) new IntegerHandler());
        this.zlevels__is_initialized = true;
        List<PolylinePosition> e = nzs.e(PolylinePosition.class, archive, this.zlevelBreakpoints, false);
        this.zlevelBreakpoints = e;
        this.zlevelBreakpoints__is_initialized = true;
        this.nativeObject = init(this.zlevels, e);
    }

    public PolylineZlevels() {
        this.zlevels__is_initialized = false;
        this.zlevelBreakpoints__is_initialized = false;
    }

    private PolylineZlevels(NativeObject nativeObject) {
        this.zlevels__is_initialized = false;
        this.zlevelBreakpoints__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
