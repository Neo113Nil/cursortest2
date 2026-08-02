package com.yandex.go.platform.sdk;

import com.yandex.go.platform.di.b;
import defpackage.d0p;
import defpackage.ny61;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld0p;", "invoke", "()Ld0p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class GoPlatform$externalComponent$2 extends Lambda implements sls {
    public static final GoPlatform$externalComponent$2 w = new GoPlatform$externalComponent$2(0);

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = a.a;
        if (bVar != null) {
            return new d0p(bVar);
        }
        ny61.g("GoPlatform.init must be invoked before using Go Platform");
        return null;
    }
}
