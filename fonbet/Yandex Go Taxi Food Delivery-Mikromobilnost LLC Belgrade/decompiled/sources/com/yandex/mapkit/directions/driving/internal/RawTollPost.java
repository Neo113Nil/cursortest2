package com.yandex.mapkit.directions.driving.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class RawTollPost implements Serializable {
    private Long id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private Boolean non_transactional;
    private boolean non_transactional__is_initialized;
    private int position;
    private boolean position__is_initialized;
    private Double time_with_traffic;
    private boolean time_with_traffic__is_initialized;

    public RawTollPost(int i, Long l, Double d, Boolean bool) {
        this.position__is_initialized = false;
        this.id__is_initialized = false;
        this.time_with_traffic__is_initialized = false;
        this.non_transactional__is_initialized = false;
        this.nativeObject = init(i, l, d, bool);
        this.position = i;
        this.position__is_initialized = true;
        this.id = l;
        this.id__is_initialized = true;
        this.time_with_traffic = d;
        this.time_with_traffic__is_initialized = true;
        this.non_transactional = bool;
        this.non_transactional__is_initialized = true;
    }

    private native Long getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::internal::RawTollPost";
    }

    private native Boolean getNon_transactional__Native();

    private native int getPosition__Native();

    private native Double getTime_with_traffic__Native();

    private native NativeObject init(int i, Long l, Double d, Boolean bool);

    public synchronized Long getId() {
        try {
            if (!this.id__is_initialized) {
                this.id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.id;
    }

    public synchronized Boolean getNon_transactional() {
        try {
            if (!this.non_transactional__is_initialized) {
                this.non_transactional = getNon_transactional__Native();
                this.non_transactional__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.non_transactional;
    }

    public synchronized int getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.position;
    }

    public synchronized Double getTime_with_traffic() {
        try {
            if (!this.time_with_traffic__is_initialized) {
                this.time_with_traffic = getTime_with_traffic__Native();
                this.time_with_traffic__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.time_with_traffic;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPosition());
            archive.add(getId(), true);
            archive.add(getTime_with_traffic(), true);
            archive.add(getNon_transactional(), true);
            return;
        }
        this.position = archive.add(this.position);
        this.position__is_initialized = true;
        this.id = archive.add(this.id, true);
        this.id__is_initialized = true;
        this.time_with_traffic = archive.add(this.time_with_traffic, true);
        this.time_with_traffic__is_initialized = true;
        Boolean add = archive.add(this.non_transactional, true);
        this.non_transactional = add;
        this.non_transactional__is_initialized = true;
        this.nativeObject = init(this.position, this.id, this.time_with_traffic, add);
    }

    public RawTollPost() {
        this.position__is_initialized = false;
        this.id__is_initialized = false;
        this.time_with_traffic__is_initialized = false;
        this.non_transactional__is_initialized = false;
    }

    private RawTollPost(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.id__is_initialized = false;
        this.time_with_traffic__is_initialized = false;
        this.non_transactional__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
