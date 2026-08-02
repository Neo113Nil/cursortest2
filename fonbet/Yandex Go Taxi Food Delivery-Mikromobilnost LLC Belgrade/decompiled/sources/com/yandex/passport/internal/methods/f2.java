package com.yandex.passport.internal.methods;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class f2 extends x2 {
    public final b b;
    public final List c;
    public final d3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(Bundle bundle) {
        super(MethodRef.ProvidePushProviderSupportedPlatforms);
        b bVar = new b((ArrayList) e3.x.a(bundle), 28);
        this.b = bVar;
        this.c = Collections.singletonList(bVar);
        this.d = d3.w;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }
}
