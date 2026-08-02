package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class c2 extends x2 {
    public final b b;
    public final List c;
    public final g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(String str, Bundle bundle) {
        super(MethodRef.OnPushMessageReceived);
        s sVar = new s(c.y, str);
        b bVar = new b(bundle);
        this.b = bVar;
        this.c = scc.g(sVar, bVar);
        this.d = g.K;
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
