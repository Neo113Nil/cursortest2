package com.yandex.plus.home.feature.webviews.internal.bridge;

import com.yandex.plus.home.common.utils.c;
import defpackage.a441;
import defpackage.ey4;
import defpackage.tls;
import defpackage.tse;
import defpackage.y821;

/* loaded from: classes2.dex */
public final class b {
    public final y821 a;
    public final tls b;

    public b(y821 y821Var, tls tlsVar) {
        this.a = y821Var;
        this.b = tlsVar;
    }

    public final void a(tse tseVar) {
        c.c((ey4) ((a441) this.a).b, tseVar, new UpdateTargetHandler$subscribeToUpdates$1(this, null));
    }
}
