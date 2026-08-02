package com.yandex.mapkit.location;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class TimeInterval implements Serializable {
    private long from;
    private boolean from__is_initialized;
    private NativeObject nativeObject;
    private long to;
    private boolean to__is_initialized;

    public TimeInterval(long j, long j2) {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
        this.nativeObject = init(j, j2);
        this.from = j;
        this.from__is_initialized = true;
        this.to = j2;
        this.to__is_initialized = true;
    }

    private native long getFrom__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::location::TimeInterval";
    }

    private native long getTo__Native();

    private native NativeObject init(long j, long j2);

    public synchronized long getFrom() {
        try {
            if (!this.from__is_initialized) {
                this.from = getFrom__Native();
                this.from__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.from;
    }

    public synchronized long getTo() {
        try {
            if (!this.to__is_initialized) {
                this.to = getTo__Native();
                this.to__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.to;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getFrom());
            archive.add(getTo());
            return;
        }
        this.from = archive.add(this.from);
        this.from__is_initialized = true;
        long add = archive.add(this.to);
        this.to = add;
        this.to__is_initialized = true;
        this.nativeObject = init(this.from, add);
    }

    public TimeInterval() {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
    }

    private TimeInterval(NativeObject nativeObject) {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
