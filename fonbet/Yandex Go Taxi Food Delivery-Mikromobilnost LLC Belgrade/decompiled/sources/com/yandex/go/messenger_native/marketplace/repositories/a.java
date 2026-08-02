package com.yandex.go.messenger_native.marketplace.repositories;

import defpackage.csz;
import defpackage.i3y;
import defpackage.rol0;
import defpackage.rqo;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes8.dex */
public final class a {
    public final rqo a;
    public final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new csz(2, this));

    public a(rqo rqoVar) {
        this.a = rqoVar;
    }

    public final rol0 a() {
        return new rol0(new MarketplaceOpenAllChatsExperimentRepository$fullExperimentFlow$1(this, null));
    }
}
