package com.yandex.go.scooters.ignition.data;

import defpackage.bvf0;
import defpackage.fef;
import defpackage.m2o0;
import defpackage.xdf;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes8.dex */
public final class h {
    public final xdf a;
    public final ru.yandex.taxi.widget.c b;
    public final m2o0 c;

    public h(xdf xdfVar, ru.yandex.taxi.widget.c cVar, m2o0 m2o0Var) {
        this.a = xdfVar;
        this.b = cVar;
        this.c = m2o0Var;
    }

    public final Object a(FormattedText formattedText, FormattedText formattedText2, fef fefVar, Continuation continuation) {
        return bvf0.n(new ScootersIgnitionStatusNotificationFactory$createNotificationBuilder$2(this, formattedText, fefVar, formattedText2, null), continuation);
    }
}
