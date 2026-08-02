package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.entities.Code;
import defpackage.oo31;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class z extends x2 {
    public final b b;
    public final b c;
    public final List d;
    public final o e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Bundle bundle) {
        super(MethodRef.AuthorizeByCode);
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-code");
        if (e == null) {
            xfo.g("can't get required parcelable passport-code");
            throw null;
        }
        Code code = (Code) e;
        Parcelable e2 = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "client-credential-provider");
        if (e2 == null) {
            xfo.g("can't get required parcelable client-credential-provider");
            throw null;
        }
        b bVar = new b(code);
        b bVar2 = new b((CredentialProvider) e2);
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
