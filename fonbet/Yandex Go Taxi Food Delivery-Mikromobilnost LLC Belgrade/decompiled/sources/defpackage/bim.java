package defpackage;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class bim {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SearchInfoResponse$TaxiSearch.CandidateSearchState.values().length];
        try {
            iArr[SearchInfoResponse$TaxiSearch.CandidateSearchState.REJECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SearchInfoResponse$TaxiSearch.CandidateSearchState.WAITING_RESPONSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
