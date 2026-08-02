package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class f1 extends x2 {
    public final b b;
    public final b c;
    public final u d;
    public final List e;
    public final g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Bundle bundle) {
        super(MethodRef.GetDeviceCode);
        PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) g.G.b(bundle);
        String c = n.w.c(bundle);
        a aVar = a.x;
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("client-bound"));
        b bVar = new b(passportEnvironmentImpl);
        b bVar2 = new b(c, 10);
        u uVar = new u(aVar, valueOf);
        this.b = bVar;
        this.c = bVar2;
        this.d = uVar;
        this.e = scc.g(bVar, bVar2, uVar);
        this.f = g.D;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.f;
    }
}
