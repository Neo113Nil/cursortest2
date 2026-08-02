package com.yandex.quark.core.common.internal.supportedfeatures;

import com.yandex.quark.utils.Disposable;
import defpackage.gtq0;
import defpackage.jqr;
import defpackage.olw0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class b {
    public final com.yandex.quark.lite.supportedfeatures.a a;
    public final tse b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();
    public final LinkedHashMap d = new LinkedHashMap();

    public b(com.yandex.quark.lite.supportedfeatures.a aVar, tse tseVar) {
        this.a = aVar;
        this.b = tseVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.quark.core.common.internal.supportedfeatures.a] */
    public final a a(olw0 olw0Var) {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        final pzt0 H = e.H(this.b, new jqr(olw0Var.j(), new SupportedFeaturesManager$registerProvider$job$1(this, linkedHashSet, null), 3));
        return new Disposable() { // from class: com.yandex.quark.core.common.internal.supportedfeatures.a
            @Override // com.yandex.quark.utils.Disposable
            public final void dispose() {
                pzt0.this.a(null);
                b bVar = this;
                tje.N(bVar.b, null, null, new SupportedFeaturesManager$registerProvider$1$1(bVar, linkedHashSet, null), 3);
            }
        };
    }
}
