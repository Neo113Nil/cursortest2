package com.yandex.mapkit.search;

import com.yandex.mapkit.Time;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class BookingParams implements Serializable {
    private Time checkIn;
    private boolean checkIn__is_initialized;
    private NativeObject nativeObject;
    private int nights;
    private boolean nights__is_initialized;
    private int persons;
    private boolean persons__is_initialized;

    public BookingParams(Time time, int i, int i2) {
        this.checkIn__is_initialized = false;
        this.nights__is_initialized = false;
        this.persons__is_initialized = false;
        if (time == null) {
            ny61.g("Required field \"checkIn\" cannot be null");
            throw null;
        }
        this.nativeObject = init(time, i, i2);
        this.checkIn = time;
        this.checkIn__is_initialized = true;
        this.nights = i;
        this.nights__is_initialized = true;
        this.persons = i2;
        this.persons__is_initialized = true;
    }

    private native Time getCheckIn__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BookingParams";
    }

    private native int getNights__Native();

    private native int getPersons__Native();

    private native NativeObject init(Time time, int i, int i2);

    public synchronized Time getCheckIn() {
        try {
            if (!this.checkIn__is_initialized) {
                this.checkIn = getCheckIn__Native();
                this.checkIn__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.checkIn;
    }

    public synchronized int getNights() {
        try {
            if (!this.nights__is_initialized) {
                this.nights = getNights__Native();
                this.nights__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.nights;
    }

    public synchronized int getPersons() {
        try {
            if (!this.persons__is_initialized) {
                this.persons = getPersons__Native();
                this.persons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.persons;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getCheckIn(), false, (Class<Archive>) Time.class);
            archive.add(getNights());
            archive.add(getPersons());
            return;
        }
        this.checkIn = (Time) archive.add((Archive) this.checkIn, false, (Class<Archive>) Time.class);
        this.checkIn__is_initialized = true;
        this.nights = archive.add(this.nights);
        this.nights__is_initialized = true;
        int add = archive.add(this.persons);
        this.persons = add;
        this.persons__is_initialized = true;
        this.nativeObject = init(this.checkIn, this.nights, add);
    }

    public BookingParams() {
        this.checkIn__is_initialized = false;
        this.nights__is_initialized = false;
        this.persons__is_initialized = false;
    }

    private BookingParams(NativeObject nativeObject) {
        this.checkIn__is_initialized = false;
        this.nights__is_initialized = false;
        this.persons__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
