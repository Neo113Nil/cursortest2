package com.yandex.passport.internal.methods;

import com.yandex.passport.api.PassportUidImpl;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class w0 extends x2 {
    public final f3 b;
    public final b c;
    public final List d;
    public final g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(PassportUidImpl passportUidImpl, String str) {
        super(MethodRef.GetAuthCookie);
        f3 f3Var = new f3(passportUidImpl);
        b bVar = new b(str, 13);
        this.b = f3Var;
        this.c = bVar;
        this.d = scc.g(f3Var, bVar);
        this.e = g.w;
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
