package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class b0 extends x2 {
    public final b b;
    public final b c;
    public final List d;
    public final o e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Bundle bundle) {
        super(MethodRef.AuthorizeByDeviceCode);
        PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) g.G.b(bundle);
        String string = bundle.getString("device-code");
        if (string == null) {
            xfo.g("can't get required string device-code");
            throw null;
        }
        b bVar = new b(passportEnvironmentImpl);
        b bVar2 = new b(string, 9);
        this.b = bVar;
        this.c = bVar2;
        this.d = scc.g(bVar, bVar2);
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
