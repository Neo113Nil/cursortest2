package com.yandex.go.ypay.impl.auth;

import androidx.lifecycle.p;
import defpackage.bvf0;
import defpackage.ej51;
import defpackage.jp90;
import defpackage.n4u0;
import defpackage.nu11;
import defpackage.tje;
import defpackage.zzf;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.g;

/* loaded from: classes15.dex */
public final class a implements jp90 {
    public final r0 a = bvf0.c(nu11.a);
    public final g b;

    public a(ej51 ej51Var, p pVar) {
        this.b = (g) ((zzf) ej51Var).W0.get();
        tje.N(pVar, null, null, new YPayPassportUidProviderImpl$1(this, null), 3);
    }

    @Override // defpackage.jp90
    public final n4u0 e() {
        return e.d(this.a);
    }
}
