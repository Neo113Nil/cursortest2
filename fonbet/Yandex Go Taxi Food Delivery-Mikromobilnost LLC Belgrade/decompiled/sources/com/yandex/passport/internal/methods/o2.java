package com.yandex.passport.internal.methods;

import com.yandex.passport.api.PassportUidImpl;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class o2 extends x2 {
    public final f3 b;
    public final h3 c;
    public final h3 d;
    public final List e;
    public final d3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(PassportUidImpl passportUidImpl, String str, String str2) {
        super(MethodRef.StashValue);
        f3 f3Var = new f3(passportUidImpl);
        h3 h3Var = new h3(str, 2);
        h3 h3Var2 = new h3(str2, 3);
        this.b = f3Var;
        this.c = h3Var;
        this.d = h3Var2;
        this.e = scc.g(f3Var, h3Var, h3Var2);
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
