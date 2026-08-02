package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class m1 extends x2 {
    public final b b;
    public final b c;
    public final List d;
    public final g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Bundle bundle) {
        super(MethodRef.GetQrLink);
        PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) g.G.b(bundle);
        String c = n.C.c(bundle);
        b bVar = new b(passportEnvironmentImpl);
        b bVar2 = new b(c, 29);
        this.b = bVar;
        this.c = bVar2;
        this.d = scc.g(bVar, bVar2);
        this.e = g.H;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.e;
    }
}
