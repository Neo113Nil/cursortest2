package com.yandex.go.scooters.promocodes.data.mapper;

import com.yandex.go.scooters.promocodes.data.model.ScootersPromocodesUseResponse;
import defpackage.bvf0;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final zuj0 a;
    public final e b;

    public a(zuj0 zuj0Var, e eVar) {
        this.a = zuj0Var;
        this.b = eVar;
    }

    public final Object a(ScootersPromocodesUseResponse scootersPromocodesUseResponse, Continuation continuation) {
        return bvf0.n(new ScootersPromocodesUseMapper$mapResponseToUseResult$2(this, scootersPromocodesUseResponse, null), continuation);
    }
}
