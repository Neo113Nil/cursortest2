package com.yandex.go.scooters.ignition.data;

import defpackage.bvf0;
import defpackage.m2o0;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes8.dex */
public final class c {
    public final q a;
    public final ru.yandex.taxi.widget.c b;
    public final m2o0 c;

    public c(q qVar, ru.yandex.taxi.widget.c cVar, m2o0 m2o0Var) {
        this.a = qVar;
        this.b = cVar;
        this.c = m2o0Var;
    }

    public final Object a(FormattedText formattedText, FormattedText formattedText2, Continuation continuation) {
        return bvf0.n(new ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2(this, formattedText, formattedText2, null), continuation);
    }
}
