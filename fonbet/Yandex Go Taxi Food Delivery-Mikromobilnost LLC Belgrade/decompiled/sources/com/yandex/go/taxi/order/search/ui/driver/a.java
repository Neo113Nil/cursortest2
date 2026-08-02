package com.yandex.go.taxi.order.search.ui.driver;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        d dVar = this.a;
        dVar.b.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new DriverButtonDelegate$handleCandidateSearchState$2((SearchInfoResponse$TaxiSearch.CandidateSearchState) obj, dVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
