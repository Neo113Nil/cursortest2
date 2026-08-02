package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Attribution;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class LineInfo implements Serializable {
    private List<Attribution> attributions;
    private boolean attributions__is_initialized;
    private Line line;
    private boolean line__is_initialized;
    private NativeObject nativeObject;
    private List<ThreadInfo> threads;
    private boolean threads__is_initialized;

    public LineInfo(Line line, List<ThreadInfo> list, List<Attribution> list2) {
        this.line__is_initialized = false;
        this.threads__is_initialized = false;
        this.attributions__is_initialized = false;
        if (line == null) {
            ny61.g("Required field \"line\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"threads\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"attributions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(line, list, list2);
        this.line = line;
        this.line__is_initialized = true;
        this.threads = list;
        this.threads__is_initialized = true;
        this.attributions = list2;
        this.attributions__is_initialized = true;
    }

    private native List<Attribution> getAttributions__Native();

    private native Line getLine__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::LineInfo";
    }

    private native List<ThreadInfo> getThreads__Native();

    private native NativeObject init(Line line, List<ThreadInfo> list, List<Attribution> list2);

    public synchronized List<Attribution> getAttributions() {
        try {
            if (!this.attributions__is_initialized) {
                this.attributions = getAttributions__Native();
                this.attributions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.attributions;
    }

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

    public synchronized List<ThreadInfo> getThreads() {
        try {
            if (!this.threads__is_initialized) {
                this.threads = getThreads__Native();
                this.threads__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.threads;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getLine(), false, (Class<Archive>) Line.class);
            archive.add((List) getThreads(), false, (ArchivingHandler) new ClassHandler(ThreadInfo.class));
            nzs.m(Attribution.class, archive, getAttributions(), false);
            return;
        }
        this.line = (Line) archive.add((Archive) this.line, false, (Class<Archive>) Line.class);
        this.line__is_initialized = true;
        this.threads = nzs.e(ThreadInfo.class, archive, this.threads, false);
        this.threads__is_initialized = true;
        List<Attribution> e = nzs.e(Attribution.class, archive, this.attributions, false);
        this.attributions = e;
        this.attributions__is_initialized = true;
        this.nativeObject = init(this.line, this.threads, e);
    }

    public LineInfo() {
        this.line__is_initialized = false;
        this.threads__is_initialized = false;
        this.attributions__is_initialized = false;
    }

    private LineInfo(NativeObject nativeObject) {
        this.line__is_initialized = false;
        this.threads__is_initialized = false;
        this.attributions__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
