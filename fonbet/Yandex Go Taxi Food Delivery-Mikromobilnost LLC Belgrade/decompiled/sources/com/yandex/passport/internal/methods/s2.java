package com.yandex.passport.internal.methods;

import com.yandex.passport.api.PassportUidImpl;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class s2 extends x2 {
    public final f3 b;
    public final b c;
    public final b d;
    public final List e;
    public final d3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(PassportUidImpl passportUidImpl, String str, boolean z) {
        super(MethodRef.UpdateAuthCookie);
        f3 f3Var = new f3(passportUidImpl);
        b bVar = new b(str, 13);
        b bVar2 = new b(z, 14);
        this.b = f3Var;
        this.c = bVar;
        this.d = bVar2;
        this.e = scc.g(f3Var, bVar, bVar2);
        this.f = d3.w;
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
