package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.oo31;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class c1 extends x2 {
    public final f3 b;
    public final b c;
    public final List d;
    public final g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Bundle bundle) {
        super(MethodRef.GetCodeByUid);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "client-credential-provider");
        if (e == null) {
            xfo.g("can't get required parcelable client-credential-provider");
            throw null;
        }
        f3 f3Var = new f3(passportUidImpl);
        b bVar = new b((CredentialProvider) e);
        this.b = f3Var;
        this.c = bVar;
        this.d = scc.g(f3Var, bVar);
        this.e = g.A;
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
