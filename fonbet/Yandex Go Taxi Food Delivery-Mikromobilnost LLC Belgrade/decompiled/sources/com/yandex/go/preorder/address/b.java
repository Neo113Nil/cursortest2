package com.yandex.go.preorder.address;

import defpackage.pzt0;
import defpackage.tse;
import ru.yandex.taxi.preorder.source.domain.h;

/* loaded from: classes13.dex */
public final class b {
    public final tse a;
    public final h b;
    public pzt0 c;
    public boolean d;

    public b(tse tseVar, h hVar) {
        this.a = tseVar;
        this.b = hVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        pzt0 pzt0Var = this.c;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.c = com.yandex.go.coroutines.b.g(this.a, null, null, new InitialUserLocationAddressInteractorImpl$requestInitialUserLocation$1(this, null), 3);
        }
    }
}
