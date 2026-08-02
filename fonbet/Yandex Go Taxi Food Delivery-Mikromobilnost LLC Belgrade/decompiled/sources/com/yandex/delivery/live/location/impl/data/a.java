package com.yandex.delivery.live.location.impl.data;

import defpackage.a0t;
import defpackage.awy;
import defpackage.h3y;
import defpackage.xci;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes.dex */
public final class a extends c implements awy {
    public final h3y i;

    public a(h3y h3yVar) {
        super(new xci(2), 0L, 12);
        this.i = h3yVar;
    }

    public final Object b(a0t a0tVar, Continuation continuation) {
        return a(new LiveLocationRequestInteractorImpl$sendLocation$2(this, a0tVar, null), continuation);
    }
}
