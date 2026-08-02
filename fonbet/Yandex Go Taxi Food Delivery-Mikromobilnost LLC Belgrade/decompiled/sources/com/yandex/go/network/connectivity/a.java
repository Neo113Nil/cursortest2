package com.yandex.go.network.connectivity;

import android.content.Context;
import defpackage.cma1;
import defpackage.csz;
import defpackage.ffx;
import defpackage.i3y;
import defpackage.t060;
import defpackage.tc60;
import defpackage.tpr;
import defpackage.ts50;
import defpackage.us50;
import defpackage.vs50;
import defpackage.zy11;
import java.util.Arrays;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;

/* loaded from: classes8.dex */
public final class a implements tc60, vs50 {
    public final Context a;
    public final i3y b = kotlin.a.a(new csz(14, this));
    public final n0 c = ffx.c(0, 0, null, 7);

    public a(Context context) {
        this.a = context;
    }

    @Override // defpackage.vs50
    public final void a(us50 us50Var) {
        if (us50Var instanceof ts50) {
            this.c.g(zy11.a);
        }
    }

    @Override // defpackage.tc60
    public final void b(cma1 cma1Var, ObserveStrategy observeStrategy) {
        if (cma1Var instanceof t060) {
            this.c.g(zy11.a);
        }
    }

    public final h c() {
        return e.K((tpr[]) Arrays.copyOf(new tpr[]{this.c, e.g(new NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1(this, null))}, 2));
    }
}
