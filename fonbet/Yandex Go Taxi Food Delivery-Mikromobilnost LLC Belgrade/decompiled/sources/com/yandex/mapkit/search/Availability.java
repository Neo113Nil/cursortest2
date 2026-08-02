package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Availability implements Serializable {
    private int days;
    private boolean days__is_initialized;
    private NativeObject nativeObject;
    private List<TimeRange> timeRanges;
    private boolean timeRanges__is_initialized;

    public Availability(int i, List<TimeRange> list) {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"timeRanges\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, list);
        this.days = i;
        this.days__is_initialized = true;
        this.timeRanges = list;
        this.timeRanges__is_initialized = true;
    }

    private native int getDays__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Availability";
    }

    private native List<TimeRange> getTimeRanges__Native();

    private native NativeObject init(int i, List<TimeRange> list);

    public synchronized int getDays() {
        try {
            if (!this.days__is_initialized) {
                this.days = getDays__Native();
                this.days__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.days;
    }

    public synchronized List<TimeRange> getTimeRanges() {
        try {
            if (!this.timeRanges__is_initialized) {
                this.timeRanges = getTimeRanges__Native();
                this.timeRanges__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.timeRanges;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(Integer.valueOf(getDays()), false);
            nzs.m(TimeRange.class, archive, getTimeRanges(), false);
            return;
        }
        this.days = archive.add(Integer.valueOf(this.days), false).intValue();
        this.days__is_initialized = true;
        List<TimeRange> e = nzs.e(TimeRange.class, archive, this.timeRanges, false);
        this.timeRanges = e;
        this.timeRanges__is_initialized = true;
        this.nativeObject = init(this.days, e);
    }

    public Availability() {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
    }

    private Availability(NativeObject nativeObject) {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
