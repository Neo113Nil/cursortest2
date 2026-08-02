package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class ThreadInfo implements Serializable {
    private BoundingBox boundingBox;
    private boolean boundingBox__is_initialized;
    private NativeObject nativeObject;
    private List<Polyline> stages;
    private boolean stages__is_initialized;
    private List<ThreadStop> stops;
    private boolean stops__is_initialized;
    private Thread thread;
    private boolean thread__is_initialized;

    public ThreadInfo(Thread thread, List<ThreadStop> list, List<Polyline> list2, BoundingBox boundingBox) {
        this.thread__is_initialized = false;
        this.stops__is_initialized = false;
        this.stages__is_initialized = false;
        this.boundingBox__is_initialized = false;
        if (thread == null) {
            ny61.g("Required field \"thread\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"stops\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"stages\" cannot be null");
            throw null;
        }
        if (boundingBox == null) {
            ny61.g("Required field \"boundingBox\" cannot be null");
            throw null;
        }
        this.nativeObject = init(thread, list, list2, boundingBox);
        this.thread = thread;
        this.thread__is_initialized = true;
        this.stops = list;
        this.stops__is_initialized = true;
        this.stages = list2;
        this.stages__is_initialized = true;
        this.boundingBox = boundingBox;
        this.boundingBox__is_initialized = true;
    }

    private native BoundingBox getBoundingBox__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::ThreadInfo";
    }

    private native List<Polyline> getStages__Native();

    private native List<ThreadStop> getStops__Native();

    private native Thread getThread__Native();

    private native NativeObject init(Thread thread, List<ThreadStop> list, List<Polyline> list2, BoundingBox boundingBox);

    public synchronized BoundingBox getBoundingBox() {
        try {
            if (!this.boundingBox__is_initialized) {
                this.boundingBox = getBoundingBox__Native();
                this.boundingBox__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.boundingBox;
    }

    public synchronized List<Polyline> getStages() {
        try {
            if (!this.stages__is_initialized) {
                this.stages = getStages__Native();
                this.stages__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stages;
    }

    public synchronized List<ThreadStop> getStops() {
        try {
            if (!this.stops__is_initialized) {
                this.stops = getStops__Native();
                this.stops__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stops;
    }

    public synchronized Thread getThread() {
        try {
            if (!this.thread__is_initialized) {
                this.thread = getThread__Native();
                this.thread__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.thread;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getThread(), false, (Class<Archive>) Thread.class);
            archive.add((List) getStops(), false, (ArchivingHandler) new ClassHandler(ThreadStop.class));
            archive.add((List) getStages(), false, (ArchivingHandler) new ClassHandler(Polyline.class));
            archive.add((Archive) getBoundingBox(), false, (Class<Archive>) BoundingBox.class);
            return;
        }
        this.thread = (Thread) archive.add((Archive) this.thread, false, (Class<Archive>) Thread.class);
        this.thread__is_initialized = true;
        this.stops = nzs.e(ThreadStop.class, archive, this.stops, false);
        this.stops__is_initialized = true;
        this.stages = nzs.e(Polyline.class, archive, this.stages, false);
        this.stages__is_initialized = true;
        BoundingBox boundingBox = (BoundingBox) archive.add((Archive) this.boundingBox, false, (Class<Archive>) BoundingBox.class);
        this.boundingBox = boundingBox;
        this.boundingBox__is_initialized = true;
        this.nativeObject = init(this.thread, this.stops, this.stages, boundingBox);
    }

    public ThreadInfo() {
        this.thread__is_initialized = false;
        this.stops__is_initialized = false;
        this.stages__is_initialized = false;
        this.boundingBox__is_initialized = false;
    }

    private ThreadInfo(NativeObject nativeObject) {
        this.thread__is_initialized = false;
        this.stops__is_initialized = false;
        this.stages__is_initialized = false;
        this.boundingBox__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
