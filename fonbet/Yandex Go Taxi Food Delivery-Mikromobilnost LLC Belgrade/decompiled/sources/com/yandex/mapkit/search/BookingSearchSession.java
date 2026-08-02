package com.yandex.mapkit.search;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface BookingSearchSession {

    public interface BookingSearchListener {
        void onBookingSearchError(Error error);

        void onBookingSearchResponse(BookingResponse bookingResponse);
    }

    void cancel();

    void retry(BookingSearchListener bookingSearchListener);
}
