package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.scc;
import defpackage.xfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class x extends x2 {
    public final b b;
    public final b c;
    public final b d;
    public final List e;
    public final o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Bundle bundle) {
        super(MethodRef.AddAccount);
        PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) g.G.b(bundle);
        String string = bundle.getString("master-token");
        if (string == null) {
            xfo.g("can't get required string master-token");
            throw null;
        }
        List c = d.b.c(bundle);
        b bVar = new b(passportEnvironmentImpl);
        b bVar2 = new b(string, 17);
        b bVar3 = new b((ArrayList) c, 1);
        this.b = bVar;
        this.c = bVar2;
        this.d = bVar3;
        this.e = scc.g(bVar, bVar2, bVar3);
        this.f = o.y;
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
