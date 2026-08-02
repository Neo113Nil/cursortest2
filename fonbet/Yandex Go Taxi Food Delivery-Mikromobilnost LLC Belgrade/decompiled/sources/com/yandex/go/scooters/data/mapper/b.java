package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse;
import defpackage.bvf0;
import defpackage.f9s;
import defpackage.fef;
import defpackage.ukn0;
import defpackage.xdf;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class b {
    public final xdf a;
    public final ru.yandex.taxi.widget.utils.e b;
    public final ru.yandex.taxi.widget.c c;
    public final ukn0 d;

    public b(xdf xdfVar, ru.yandex.taxi.widget.utils.e eVar, ru.yandex.taxi.widget.c cVar, ukn0 ukn0Var) {
        this.a = xdfVar;
        this.b = eVar;
        this.c = cVar;
        this.d = ukn0Var;
    }

    public static final Object a(b bVar, FormattedText formattedText, fef fefVar, SuspendLambda suspendLambda) {
        return ru.yandex.taxi.widget.c.e(bVar.c, f9s.c(bVar.a, fefVar, formattedText), null, false, suspendLambda, 30);
    }

    public final Object b(ScootersAlternativeOfferResponse.AlternativeOffer alternativeOffer, Continuation continuation) {
        if (alternativeOffer.a.a.length() == 0 && alternativeOffer.a.b.length() == 0) {
            return null;
        }
        return bvf0.n(new ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2(this, alternativeOffer, null), continuation);
    }
}
