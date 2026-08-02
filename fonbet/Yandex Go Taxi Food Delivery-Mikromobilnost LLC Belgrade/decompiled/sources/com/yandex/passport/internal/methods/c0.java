package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class c0 extends x2 {
    public final b b;
    public final h3 c;
    public final List d;
    public final o e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Bundle bundle) {
        super(MethodRef.AuthorizeByRawJson);
        PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) g.G.b(bundle);
        String string = bundle.getString("oauth-token");
        if (string == null) {
            xfo.g("can't get required string oauth-token");
            throw null;
        }
        b bVar = new b(passportEnvironmentImpl);
        h3 h3Var = new h3(string, 0);
        this.b = bVar;
        this.c = h3Var;
        this.d = scc.g(bVar, h3Var);
        this.e = o.y;
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
