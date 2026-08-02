package com.yandex.go.scooters.qr.unavailable_scooter.ui;

import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import defpackage.bvf0;
import defpackage.k7x0;
import defpackage.krl0;
import defpackage.n7p0;
import defpackage.qqo0;
import defpackage.scc;
import defpackage.tqo0;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class d {
    public final k7x0 a;
    public final e b;

    public d(k7x0 k7x0Var, e eVar) {
        this.a = k7x0Var;
        this.b = eVar;
    }

    public final Object a(n7p0 n7p0Var, ScootersQrUnavailableScooterExperiment scootersQrUnavailableScooterExperiment, Continuation continuation) {
        krl0 krl0Var = n7p0Var.b;
        return krl0Var != null ? scc.g(new tqo0((CharSequence) krl0Var.a), new qqo0((CharSequence) krl0Var.b)) : scootersQrUnavailableScooterExperiment != null ? bvf0.n(new ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2(this, scootersQrUnavailableScooterExperiment.e, scootersQrUnavailableScooterExperiment, null), continuation) : EmptyList.a;
    }
}
