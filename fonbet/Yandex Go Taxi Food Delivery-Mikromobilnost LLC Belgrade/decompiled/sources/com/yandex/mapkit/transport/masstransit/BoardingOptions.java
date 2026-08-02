package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class BoardingOptions implements Serializable {
    private List<BoardingArea> area;
    private boolean area__is_initialized;
    private NativeObject nativeObject;
    private RailwayOptions railwayOptions;
    private boolean railwayOptions__is_initialized;

    public BoardingOptions(List<BoardingArea> list, RailwayOptions railwayOptions) {
        this.area__is_initialized = false;
        this.railwayOptions__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"area\" cannot be null");
            throw null;
        }
        if (railwayOptions == null) {
            ny61.g("Required field \"railwayOptions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, railwayOptions);
        this.area = list;
        this.area__is_initialized = true;
        this.railwayOptions = railwayOptions;
        this.railwayOptions__is_initialized = true;
    }

    private native List<BoardingArea> getArea__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::BoardingOptions";
    }

    private native RailwayOptions getRailwayOptions__Native();

    private native NativeObject init(List<BoardingArea> list, RailwayOptions railwayOptions);

    public synchronized List<BoardingArea> getArea() {
        try {
            if (!this.area__is_initialized) {
                this.area = getArea__Native();
                this.area__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.area;
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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getArea(), false, (ArchivingHandler) new ClassHandler(BoardingArea.class));
            archive.add((Archive) getRailwayOptions(), false, (Class<Archive>) RailwayOptions.class);
            return;
        }
        this.area = nzs.e(BoardingArea.class, archive, this.area, false);
        this.area__is_initialized = true;
        RailwayOptions railwayOptions = (RailwayOptions) archive.add((Archive) this.railwayOptions, false, (Class<Archive>) RailwayOptions.class);
        this.railwayOptions = railwayOptions;
        this.railwayOptions__is_initialized = true;
        this.nativeObject = init(this.area, railwayOptions);
    }

    public static class BoardingArea implements Serializable {
        private String id;
        private boolean id__is_initialized;
        private NativeObject nativeObject;

        public BoardingArea(String str) {
            this.id__is_initialized = false;
            this.nativeObject = init(str);
            this.id = str;
            this.id__is_initialized = true;
        }

        private native String getId__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::BoardingOptions::BoardingArea";
        }

        private native NativeObject init(String str);

        public synchronized String getId() {
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

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getId(), true);
                return;
            }
            String add = archive.add(this.id, true);
            this.id = add;
            this.id__is_initialized = true;
            this.nativeObject = init(add);
        }

        public BoardingArea() {
            this.id__is_initialized = false;
        }

        private BoardingArea(NativeObject nativeObject) {
            this.id__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public BoardingOptions() {
        this.area__is_initialized = false;
        this.railwayOptions__is_initialized = false;
    }

    private BoardingOptions(NativeObject nativeObject) {
        this.area__is_initialized = false;
        this.railwayOptions__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
