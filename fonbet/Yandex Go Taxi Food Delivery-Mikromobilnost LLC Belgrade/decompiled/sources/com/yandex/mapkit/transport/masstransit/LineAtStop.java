package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class LineAtStop implements Serializable {
    private Line line;
    private boolean line__is_initialized;
    private NativeObject nativeObject;
    private List<ThreadAtStop> threadsAtStop;
    private boolean threadsAtStop__is_initialized;

    public LineAtStop(Line line, List<ThreadAtStop> list) {
        this.line__is_initialized = false;
        this.threadsAtStop__is_initialized = false;
        if (line == null) {
            ny61.g("Required field \"line\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"threadsAtStop\" cannot be null");
            throw null;
        }
        this.nativeObject = init(line, list);
        this.line = line;
        this.line__is_initialized = true;
        this.threadsAtStop = list;
        this.threadsAtStop__is_initialized = true;
    }

    private native Line getLine__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::LineAtStop";
    }

    private native List<ThreadAtStop> getThreadsAtStop__Native();

    private native NativeObject init(Line line, List<ThreadAtStop> list);

    public synchronized Line getLine() {
        try {
            if (!this.line__is_initialized) {
                this.line = getLine__Native();
                this.line__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.line;
    }

    public synchronized List<ThreadAtStop> getThreadsAtStop() {
        try {
            if (!this.threadsAtStop__is_initialized) {
                this.threadsAtStop = getThreadsAtStop__Native();
                this.threadsAtStop__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.threadsAtStop;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getLine(), false, (Class<Archive>) Line.class);
            nzs.m(ThreadAtStop.class, archive, getThreadsAtStop(), false);
            return;
        }
        this.line = (Line) archive.add((Archive) this.line, false, (Class<Archive>) Line.class);
        this.line__is_initialized = true;
        List<ThreadAtStop> e = nzs.e(ThreadAtStop.class, archive, this.threadsAtStop, false);
        this.threadsAtStop = e;
        this.threadsAtStop__is_initialized = true;
        this.nativeObject = init(this.line, e);
    }

    public LineAtStop() {
        this.line__is_initialized = false;
        this.threadsAtStop__is_initialized = false;
    }

    private LineAtStop(NativeObject nativeObject) {
        this.line__is_initialized = false;
        this.threadsAtStop__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
