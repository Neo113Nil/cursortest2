package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class n7 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SearchInfoResponse$TaxiSearch.CandidateSearchState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
