package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.Time;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Periodical implements Serializable {
    private Time begin;
    private boolean begin__is_initialized;
    private Time end;
    private boolean end__is_initialized;
    private List<Estimation> estimations;
    private boolean estimations__is_initialized;
    private LocalizedValue frequency;
    private boolean frequency__is_initialized;
    private NativeObject nativeObject;

    public Periodical(LocalizedValue localizedValue, Time time, Time time2, List<Estimation> list) {
        this.frequency__is_initialized = false;
        this.begin__is_initialized = false;
        this.end__is_initialized = false;
        this.estimations__is_initialized = false;
        if (localizedValue == null) {
            ny61.g("Required field \"frequency\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"estimations\" cannot be null");
            throw null;
        }
        this.nativeObject = init(localizedValue, time, time2, list);
        this.frequency = localizedValue;
        this.frequency__is_initialized = true;
        this.begin = time;
        this.begin__is_initialized = true;
        this.end = time2;
        this.end__is_initialized = true;
        this.estimations = list;
        this.estimations__is_initialized = true;
    }

    private native Time getBegin__Native();

    private native Time getEnd__Native();

    private native List<Estimation> getEstimations__Native();

    private native LocalizedValue getFrequency__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Periodical";
    }

    private native NativeObject init(LocalizedValue localizedValue, Time time, Time time2, List<Estimation> list);

    public synchronized Time getBegin() {
        try {
            if (!this.begin__is_initialized) {
                this.begin = getBegin__Native();
                this.begin__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.begin;
    }

    public synchronized Time getEnd() {
        try {
            if (!this.end__is_initialized) {
                this.end = getEnd__Native();
                this.end__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.end;
    }

    public synchronized List<Estimation> getEstimations() {
        try {
            if (!this.estimations__is_initialized) {
                this.estimations = getEstimations__Native();
                this.estimations__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.estimations;
    }

    public synchronized LocalizedValue getFrequency() {
        try {
            if (!this.frequency__is_initialized) {
                this.frequency = getFrequency__Native();
                this.frequency__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.frequency;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getFrequency(), false, (Class<Archive>) LocalizedValue.class);
            archive.add((Archive) getBegin(), true, (Class<Archive>) Time.class);
            archive.add((Archive) getEnd(), true, (Class<Archive>) Time.class);
            nzs.m(Estimation.class, archive, getEstimations(), false);
            return;
        }
        this.frequency = (LocalizedValue) archive.add((Archive) this.frequency, false, (Class<Archive>) LocalizedValue.class);
        this.frequency__is_initialized = true;
        this.begin = (Time) archive.add((Archive) this.begin, true, (Class<Archive>) Time.class);
        this.begin__is_initialized = true;
        this.end = (Time) archive.add((Archive) this.end, true, (Class<Archive>) Time.class);
        this.end__is_initialized = true;
        List<Estimation> e = nzs.e(Estimation.class, archive, this.estimations, false);
        this.estimations = e;
        this.estimations__is_initialized = true;
        this.nativeObject = init(this.frequency, this.begin, this.end, e);
    }

    public Periodical() {
        this.frequency__is_initialized = false;
        this.begin__is_initialized = false;
        this.end__is_initialized = false;
        this.estimations__is_initialized = false;
    }

    private Periodical(NativeObject nativeObject) {
        this.frequency__is_initialized = false;
        this.begin__is_initialized = false;
        this.end__is_initialized = false;
        this.estimations__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
