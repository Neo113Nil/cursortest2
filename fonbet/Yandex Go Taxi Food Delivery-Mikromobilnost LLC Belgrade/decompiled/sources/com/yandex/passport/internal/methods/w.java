package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class w extends x2 {
    public final f3 b;
    public final h3 c;
    public final b d;
    public final List e;
    public final d3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Bundle bundle) {
        super(MethodRef.AcceptDeviceAuthorization);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        String string = bundle.getString("user-code");
        if (string == null) {
            xfo.g("can't get required string user-code");
            throw null;
        }
        String c = n.c.c(bundle);
        f3 f3Var = new f3(passportUidImpl);
        h3 h3Var = new h3(string, 9);
        b bVar = new b(c, 3);
        this.b = f3Var;
        this.c = h3Var;
        this.d = bVar;
        this.e = scc.g(f3Var, h3Var, bVar);
        this.f = d3.w;
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
