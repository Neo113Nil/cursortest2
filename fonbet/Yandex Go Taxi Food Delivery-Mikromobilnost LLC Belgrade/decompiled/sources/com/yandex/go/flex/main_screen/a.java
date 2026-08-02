package com.yandex.go.flex.main_screen;

import com.yandex.go.flex.main_screen.domain.h;
import defpackage.f0m;
import defpackage.fxl;
import defpackage.n9p;
import defpackage.tje;
import defpackage.tls;
import defpackage.u1m;
import defpackage.xzl;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class a implements fxl {
    public final h a;
    public final n9p b;

    public a(h hVar, n9p n9pVar) {
        this.a = hVar;
        this.b = n9pVar;
    }

    @Override // defpackage.fxl
    public final xzl a(u1m u1mVar, tls tlsVar) {
        return new xzl(this.b.a(((Boolean) tje.Y(EmptyCoroutineContext.a, new ShimmeringDocumentCallbackProvider$getFallbackForQuery$1(this, null))).booleanValue()), null, new f0m(0L), 26);
    }
}
