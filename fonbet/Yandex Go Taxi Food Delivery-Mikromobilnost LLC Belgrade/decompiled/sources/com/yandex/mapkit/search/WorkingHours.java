package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class WorkingHours implements Serializable {
    private List<Availability> availabilities;
    private boolean availabilities__is_initialized;
    private NativeObject nativeObject;
    private State state;
    private boolean state__is_initialized;
    private String text;
    private boolean text__is_initialized;

    public WorkingHours(String str, List<Availability> list, State state) {
        this.text__is_initialized = false;
        this.availabilities__is_initialized = false;
        this.state__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"availabilities\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list, state);
        this.text = str;
        this.text__is_initialized = true;
        this.availabilities = list;
        this.availabilities__is_initialized = true;
        this.state = state;
        this.state__is_initialized = true;
    }

    private native List<Availability> getAvailabilities__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::WorkingHours";
    }

    private native State getState__Native();

    private native String getText__Native();

    private native NativeObject init(String str, List<Availability> list, State state);

    public synchronized List<Availability> getAvailabilities() {
        try {
            if (!this.availabilities__is_initialized) {
                this.availabilities = getAvailabilities__Native();
                this.availabilities__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.availabilities;
    }

    public synchronized State getState() {
        try {
            if (!this.state__is_initialized) {
                this.state = getState__Native();
                this.state__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.state;
    }

    public synchronized String getText() {
        try {
            if (!this.text__is_initialized) {
                this.text = getText__Native();
                this.text__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getText(), false);
            archive.add((List) getAvailabilities(), false, (ArchivingHandler) new ClassHandler(Availability.class));
            archive.add((Archive) getState(), true, (Class<Archive>) State.class);
            return;
        }
        this.text = archive.add(this.text, false);
        this.text__is_initialized = true;
        this.availabilities = nzs.e(Availability.class, archive, this.availabilities, false);
        this.availabilities__is_initialized = true;
        State state = (State) archive.add((Archive) this.state, true, (Class<Archive>) State.class);
        this.state = state;
        this.state__is_initialized = true;
        this.nativeObject = init(this.text, this.availabilities, state);
    }

    public WorkingHours() {
        this.text__is_initialized = false;
        this.availabilities__is_initialized = false;
        this.state__is_initialized = false;
    }

    private WorkingHours(NativeObject nativeObject) {
        this.text__is_initialized = false;
        this.availabilities__is_initialized = false;
        this.state__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
