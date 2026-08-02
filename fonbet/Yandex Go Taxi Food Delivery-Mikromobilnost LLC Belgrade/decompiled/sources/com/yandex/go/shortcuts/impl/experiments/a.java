package com.yandex.go.shortcuts.impl.experiments;

import defpackage.bvf0;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class a {
    public final ru.yandex.taxi.address.experiment.d a;

    public a(ru.yandex.taxi.address.experiment.d dVar) {
        this.a = dVar;
    }

    public final Object a(Continuation continuation) {
        return bvf0.n(new OpenSuggestsOnTaxiMainRepository$obtainSuggestType$2(this, null), continuation);
    }
}
