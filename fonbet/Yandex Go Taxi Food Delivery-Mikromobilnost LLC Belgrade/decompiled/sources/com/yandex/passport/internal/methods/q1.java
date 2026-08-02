package com.yandex.passport.internal.methods;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class q1 extends x2 {
    public final b b;
    public final h3 c;
    public final b d;
    public final List e;
    public final g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2) {
        super(MethodRef.GetTrackFromMagic);
        b bVar = new b(passportEnvironmentImpl);
        h3 h3Var = new h3(str, 7);
        b bVar2 = new b(str2, 8);
        this.b = bVar;
        this.c = h3Var;
        this.d = bVar2;
        this.e = scc.g(bVar, h3Var, bVar2);
        this.f = g.L;
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
