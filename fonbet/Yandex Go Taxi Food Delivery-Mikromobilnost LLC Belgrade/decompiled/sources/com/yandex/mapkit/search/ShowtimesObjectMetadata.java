package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class ShowtimesObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<Showtime> showtimes;
    private boolean showtimes__is_initialized;
    private String title;
    private boolean title__is_initialized;

    public ShowtimesObjectMetadata(String str, List<Showtime> list) {
        this.title__is_initialized = false;
        this.showtimes__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"title\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"showtimes\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.title = str;
        this.title__is_initialized = true;
        this.showtimes = list;
        this.showtimes__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ShowtimesObjectMetadata";
    }

    private native List<Showtime> getShowtimes__Native();

    private native String getTitle__Native();

    private native NativeObject init(String str, List<Showtime> list);

    public synchronized List<Showtime> getShowtimes() {
        try {
            if (!this.showtimes__is_initialized) {
                this.showtimes = getShowtimes__Native();
                this.showtimes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showtimes;
    }

    public synchronized String getTitle() {
        try {
            if (!this.title__is_initialized) {
                this.title = getTitle__Native();
                this.title__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.title;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getTitle(), false);
            nzs.m(Showtime.class, archive, getShowtimes(), false);
            return;
        }
        this.title = archive.add(this.title, false);
        this.title__is_initialized = true;
        List<Showtime> e = nzs.e(Showtime.class, archive, this.showtimes, false);
        this.showtimes = e;
        this.showtimes__is_initialized = true;
        this.nativeObject = init(this.title, e);
    }

    public ShowtimesObjectMetadata() {
        this.title__is_initialized = false;
        this.showtimes__is_initialized = false;
    }

    private ShowtimesObjectMetadata(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.showtimes__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
