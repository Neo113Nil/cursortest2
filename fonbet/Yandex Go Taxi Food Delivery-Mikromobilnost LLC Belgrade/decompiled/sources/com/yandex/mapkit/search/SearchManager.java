package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.BookingSearchSession;
import com.yandex.mapkit.search.DeleteAllPersonalSuggestSession;
import com.yandex.mapkit.search.GoodsRegisterSession;
import com.yandex.mapkit.search.Session;
import java.util.List;

/* loaded from: classes15.dex */
public interface SearchManager {
    DeleteAllPersonalSuggestSession clearPersonalData(DeleteAllPersonalSuggestSession.PersonalSuggestListener personalSuggestListener);

    SuggestSession createSuggestSession();

    BookingSearchSession findBookingOffers(String str, BookingRequestParams bookingRequestParams, BookingSearchSession.BookingSearchListener bookingSearchListener);

    GoodsRegisterSession requestGoodsRegister(String str, GoodsRegisterSession.GoodsRegisterListener goodsRegisterListener);

    Session resolveURI(String str, SearchOptions searchOptions, Session.SearchListener searchListener);

    Session searchByBusinessOids(List<String> list, SearchOptions searchOptions, Session.SearchListener searchListener);

    Session searchByURI(String str, SearchOptions searchOptions, Session.SearchListener searchListener);

    Session submit(Point point, Integer num, SearchOptions searchOptions, Session.SearchListener searchListener);

    Session submit(String str, Geometry geometry, SearchOptions searchOptions, Session.SearchListener searchListener);

    Session submit(String str, Polyline polyline, Geometry geometry, SearchOptions searchOptions, Session.SearchListener searchListener);
}
