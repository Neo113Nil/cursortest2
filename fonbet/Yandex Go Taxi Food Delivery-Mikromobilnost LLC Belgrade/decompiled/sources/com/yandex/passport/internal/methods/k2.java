package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class k2 extends x2 {
    public final f3 b;
    public final i c;
    public final List d;
    public final d3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Bundle bundle) {
        super(MethodRef.SetAutoLoginDisabled);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        boolean z = bundle.getBoolean("is-auto-login-disabled");
        f3 f3Var = new f3(passportUidImpl);
        i iVar = new i(z);
        this.b = f3Var;
        this.c = iVar;
        this.d = scc.g(f3Var, iVar);
        this.e = d3.w;
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
