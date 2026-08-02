package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Schedule implements Serializable {
    private NativeObject nativeObject;
    private List<ScheduleEntry> scheduleEntries;
    private boolean scheduleEntries__is_initialized;

    public Schedule(List<ScheduleEntry> list) {
        this.scheduleEntries__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"scheduleEntries\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.scheduleEntries = list;
        this.scheduleEntries__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Schedule";
    }

    private native List<ScheduleEntry> getScheduleEntries__Native();

    private native NativeObject init(List<ScheduleEntry> list);

    public synchronized List<ScheduleEntry> getScheduleEntries() {
        try {
            if (!this.scheduleEntries__is_initialized) {
                this.scheduleEntries = getScheduleEntries__Native();
                this.scheduleEntries__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.scheduleEntries;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(ScheduleEntry.class, archive, getScheduleEntries(), false);
            return;
        }
        List<ScheduleEntry> e = nzs.e(ScheduleEntry.class, archive, this.scheduleEntries, false);
        this.scheduleEntries = e;
        this.scheduleEntries__is_initialized = true;
        this.nativeObject = init(e);
    }

    public static class ScheduleEntry implements Serializable {
        private NativeObject nativeObject;
        private Periodical periodical;
        private boolean periodical__is_initialized;
        private Scheduled scheduled;
        private boolean scheduled__is_initialized;

        public ScheduleEntry(Periodical periodical, Scheduled scheduled) {
            this.periodical__is_initialized = false;
            this.scheduled__is_initialized = false;
            this.nativeObject = init(periodical, scheduled);
            this.periodical = periodical;
            this.periodical__is_initialized = true;
            this.scheduled = scheduled;
            this.scheduled__is_initialized = true;
        }

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::Schedule::ScheduleEntry";
        }

        private native Periodical getPeriodical__Native();

        private native Scheduled getScheduled__Native();

        private native NativeObject init(Periodical periodical, Scheduled scheduled);

        public synchronized Periodical getPeriodical() {
            try {
                if (!this.periodical__is_initialized) {
                    this.periodical = getPeriodical__Native();
                    this.periodical__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.periodical;
        }

        public synchronized Scheduled getScheduled() {
            try {
                if (!this.scheduled__is_initialized) {
                    this.scheduled = getScheduled__Native();
                    this.scheduled__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.scheduled;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add((Archive) getPeriodical(), true, (Class<Archive>) Periodical.class);
                archive.add((Archive) getScheduled(), true, (Class<Archive>) Scheduled.class);
                return;
            }
            this.periodical = (Periodical) archive.add((Archive) this.periodical, true, (Class<Archive>) Periodical.class);
            this.periodical__is_initialized = true;
            Scheduled scheduled = (Scheduled) archive.add((Archive) this.scheduled, true, (Class<Archive>) Scheduled.class);
            this.scheduled = scheduled;
            this.scheduled__is_initialized = true;
            this.nativeObject = init(this.periodical, scheduled);
        }

        public ScheduleEntry() {
            this.periodical__is_initialized = false;
            this.scheduled__is_initialized = false;
        }

        private ScheduleEntry(NativeObject nativeObject) {
            this.periodical__is_initialized = false;
            this.scheduled__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public Schedule() {
        this.scheduleEntries__is_initialized = false;
    }

    private Schedule(NativeObject nativeObject) {
        this.scheduleEntries__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
