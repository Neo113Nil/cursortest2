package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.BookingRequestParams;
import com.yandex.mapkit.search.BookingSearchSession;
import com.yandex.mapkit.search.DeleteAllPersonalSuggestSession;
import com.yandex.mapkit.search.GoodsRegisterSession;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Session;
import com.yandex.mapkit.search.SuggestSession;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class SearchManagerBinding implements SearchManager {
    private final NativeObject nativeObject;

    public SearchManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.SearchManager
    public native DeleteAllPersonalSuggestSession clearPersonalData(DeleteAllPersonalSuggestSession.PersonalSuggestListener personalSuggestListener);

    @Override // com.yandex.mapkit.search.SearchManager
    public native SuggestSession createSuggestSession();

    @Override // com.yandex.mapkit.search.SearchManager
    public native BookingSearchSession findBookingOffers(String str, BookingRequestParams bookingRequestParams, BookingSearchSession.BookingSearchListener bookingSearchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    public native GoodsRegisterSession requestGoodsRegister(String str, GoodsRegisterSession.GoodsRegisterListener goodsRegisterListener);

    @Override // com.yandex.mapkit.search.SearchManager
    public native Session resolveURI(String str, SearchOptions searchOptions, Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    public native Session searchByBusinessOids(List<String> list, SearchOptions searchOptions, Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    public native Session searchByURI(String str, SearchOptions searchOptions, Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    public native Session submit(Point point, Integer num, SearchOptions searchOptions, Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    public native Session submit(String str, Geometry geometry, SearchOptions searchOptions, Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    public native Session submit(String str, Polyline polyline, Geometry geometry, SearchOptions searchOptions, Session.SearchListener searchListener);
}
