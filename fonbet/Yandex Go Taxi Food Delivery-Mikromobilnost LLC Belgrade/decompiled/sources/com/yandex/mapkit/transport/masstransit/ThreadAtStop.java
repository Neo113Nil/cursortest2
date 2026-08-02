package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ThreadAtStop implements Serializable {
    private NativeObject nativeObject;
    private boolean noBoarding;
    private boolean noBoarding__is_initialized;
    private boolean noDropOff;
    private boolean noDropOff__is_initialized;
    private RailwayOptions railwayOptions;
    private boolean railwayOptions__is_initialized;
    private Schedule schedule;
    private boolean schedule__is_initialized;
    private Thread thread;
    private boolean thread__is_initialized;

    public ThreadAtStop(Thread thread, boolean z, boolean z2, Schedule schedule, RailwayOptions railwayOptions) {
        this.thread__is_initialized = false;
        this.noBoarding__is_initialized = false;
        this.noDropOff__is_initialized = false;
        this.schedule__is_initialized = false;
        this.railwayOptions__is_initialized = false;
        if (thread == null) {
            ny61.g("Required field \"thread\" cannot be null");
            throw null;
        }
        if (schedule == null) {
            ny61.g("Required field \"schedule\" cannot be null");
            throw null;
        }
        if (railwayOptions == null) {
            ny61.g("Required field \"railwayOptions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(thread, z, z2, schedule, railwayOptions);
        this.thread = thread;
        this.thread__is_initialized = true;
        this.noBoarding = z;
        this.noBoarding__is_initialized = true;
        this.noDropOff = z2;
        this.noDropOff__is_initialized = true;
        this.schedule = schedule;
        this.schedule__is_initialized = true;
        this.railwayOptions = railwayOptions;
        this.railwayOptions__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::ThreadAtStop";
    }

    private native boolean getNoBoarding__Native();

    private native boolean getNoDropOff__Native();

    private native RailwayOptions getRailwayOptions__Native();

    private native Schedule getSchedule__Native();

    private native Thread getThread__Native();

    private native NativeObject init(Thread thread, boolean z, boolean z2, Schedule schedule, RailwayOptions railwayOptions);

    public synchronized boolean getNoBoarding() {
        try {
            if (!this.noBoarding__is_initialized) {
                this.noBoarding = getNoBoarding__Native();
                this.noBoarding__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.noBoarding;
    }

    public synchronized boolean getNoDropOff() {
        try {
            if (!this.noDropOff__is_initialized) {
                this.noDropOff = getNoDropOff__Native();
                this.noDropOff__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.noDropOff;
    }

    public synchronized RailwayOptions getRailwayOptions() {
        try {
            if (!this.railwayOptions__is_initialized) {
                this.railwayOptions = getRailwayOptions__Native();
                this.railwayOptions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.railwayOptions;
    }

    public synchronized Schedule getSchedule() {
        try {
            if (!this.schedule__is_initialized) {
                this.schedule = getSchedule__Native();
                this.schedule__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.schedule;
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
            archive.add(getNoBoarding());
            archive.add(getNoDropOff());
            archive.add((Archive) getSchedule(), false, (Class<Archive>) Schedule.class);
            archive.add((Archive) getRailwayOptions(), false, (Class<Archive>) RailwayOptions.class);
            return;
        }
        this.thread = (Thread) archive.add((Archive) this.thread, false, (Class<Archive>) Thread.class);
        this.thread__is_initialized = true;
        this.noBoarding = archive.add(this.noBoarding);
        this.noBoarding__is_initialized = true;
        this.noDropOff = archive.add(this.noDropOff);
        this.noDropOff__is_initialized = true;
        this.schedule = (Schedule) archive.add((Archive) this.schedule, false, (Class<Archive>) Schedule.class);
        this.schedule__is_initialized = true;
        RailwayOptions railwayOptions = (RailwayOptions) archive.add((Archive) this.railwayOptions, false, (Class<Archive>) RailwayOptions.class);
        this.railwayOptions = railwayOptions;
        this.railwayOptions__is_initialized = true;
        this.nativeObject = init(this.thread, this.noBoarding, this.noDropOff, this.schedule, railwayOptions);
    }

    public ThreadAtStop() {
        this.thread__is_initialized = false;
        this.noBoarding__is_initialized = false;
        this.noDropOff__is_initialized = false;
        this.schedule__is_initialized = false;
        this.railwayOptions__is_initialized = false;
    }

    private ThreadAtStop(NativeObject nativeObject) {
        this.thread__is_initialized = false;
        this.noBoarding__is_initialized = false;
        this.noDropOff__is_initialized = false;
        this.schedule__is_initialized = false;
        this.railwayOptions__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
