package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.internal.credentials.CredentialProvider;
import defpackage.oo31;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class a1 extends x2 {
    public final l b;
    public final c3 c;
    public final b d;
    public final g e;
    public final List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Bundle bundle) {
        super(MethodRef.GetChildCodeByUidParent);
        g gVar = g.z;
        PassportUidImpl passportUidImpl = (PassportUidImpl) gVar.b(bundle);
        g gVar2 = g.F;
        PassportUidImpl passportUidImpl2 = (PassportUidImpl) gVar2.b(bundle);
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "client-credential-provider");
        if (e == null) {
            xfo.g("can't get required parcelable client-credential-provider");
            throw null;
        }
        l lVar = new l(gVar, passportUidImpl);
        c3 c3Var = new c3(gVar2, passportUidImpl2);
        b bVar = new b((CredentialProvider) e);
        this.b = lVar;
        this.c = c3Var;
        this.d = bVar;
        this.e = g.A;
        this.f = scc.g(lVar, c3Var, bVar);
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.e;
    }
}
