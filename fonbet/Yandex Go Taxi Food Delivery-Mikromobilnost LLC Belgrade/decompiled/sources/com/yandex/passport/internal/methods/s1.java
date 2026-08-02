package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class s1 extends x2 {
    public final b b;
    public final b c;
    public final List d;
    public final g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(Bundle bundle) {
        super(MethodRef.GetTurboAppUserInfo);
        PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) g.G.b(bundle);
        String string = bundle.getString("oauth-token");
        if (string == null) {
            xfo.g("can't get required string oauth-token");
            throw null;
        }
        b bVar = new b(passportEnvironmentImpl);
        b bVar2 = new b(string, 19);
        this.b = bVar;
        this.c = bVar2;
        this.d = scc.g(bVar, bVar2);
        this.e = g.E;
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
