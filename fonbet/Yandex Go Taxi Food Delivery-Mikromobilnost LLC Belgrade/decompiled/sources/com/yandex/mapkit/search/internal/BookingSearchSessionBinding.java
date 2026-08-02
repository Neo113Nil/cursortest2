package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.BookingSearchSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class BookingSearchSessionBinding implements BookingSearchSession {
    private final NativeObject nativeObject;

    public BookingSearchSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.BookingSearchSession
    public native void cancel();

    @Override // com.yandex.mapkit.search.BookingSearchSession
    public native void retry(BookingSearchSession.BookingSearchListener bookingSearchListener);
}
