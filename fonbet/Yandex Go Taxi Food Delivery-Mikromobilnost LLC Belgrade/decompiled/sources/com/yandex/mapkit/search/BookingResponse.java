package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class BookingResponse implements Serializable {
    private NativeObject nativeObject;
    private List<BookingOffer> offers;
    private boolean offers__is_initialized;
    private BookingParams params;
    private boolean params__is_initialized;

    public BookingResponse(BookingParams bookingParams, List<BookingOffer> list) {
        this.params__is_initialized = false;
        this.offers__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"offers\" cannot be null");
            throw null;
        }
        this.nativeObject = init(bookingParams, list);
        this.params = bookingParams;
        this.params__is_initialized = true;
        this.offers = list;
        this.offers__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BookingResponse";
    }

    private native List<BookingOffer> getOffers__Native();

    private native BookingParams getParams__Native();

    private native NativeObject init(BookingParams bookingParams, List<BookingOffer> list);

    public synchronized List<BookingOffer> getOffers() {
        try {
            if (!this.offers__is_initialized) {
                this.offers = getOffers__Native();
                this.offers__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.offers;
    }

    public synchronized BookingParams getParams() {
        try {
            if (!this.params__is_initialized) {
                this.params = getParams__Native();
                this.params__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.params;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getParams(), true, (Class<Archive>) BookingParams.class);
            nzs.m(BookingOffer.class, archive, getOffers(), false);
            return;
        }
        this.params = (BookingParams) archive.add((Archive) this.params, true, (Class<Archive>) BookingParams.class);
        this.params__is_initialized = true;
        List<BookingOffer> e = nzs.e(BookingOffer.class, archive, this.offers, false);
        this.offers = e;
        this.offers__is_initialized = true;
        this.nativeObject = init(this.params, e);
    }

    public BookingResponse() {
        this.params__is_initialized = false;
        this.offers__is_initialized = false;
    }

    private BookingResponse(NativeObject nativeObject) {
        this.params__is_initialized = false;
        this.offers__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
