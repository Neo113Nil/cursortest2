package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.scc;
import defpackage.yhl;
import java.util.List;

/* loaded from: classes8.dex */
public final class p1 extends x2 {
    public final f3 b;
    public final m c;
    public final List d;
    public final o e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1(Bundle bundle) {
        this(r0, (ClientCredentials) r3);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        Object obj = null;
        if (bundle.containsKey("client-credentials")) {
            Object parcelable = bundle.getParcelable("client-credentials");
            if (parcelable == null) {
                yhl.d("client-credentials", "can't get required parcelable ");
                throw null;
            }
            obj = parcelable;
        }
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(PassportUidImpl passportUidImpl, ClientCredentials clientCredentials) {
        super(MethodRef.GetToken);
        f3 f3Var = new f3(passportUidImpl);
        m mVar = new m(z2.w, clientCredentials);
        this.b = f3Var;
        this.c = mVar;
        this.d = scc.g(f3Var, mVar);
        this.e = o.w;
    }
}
