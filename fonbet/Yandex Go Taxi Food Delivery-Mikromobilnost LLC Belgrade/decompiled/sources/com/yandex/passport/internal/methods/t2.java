package com.yandex.passport.internal.methods;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class t2 extends x2 {
    public final f3 b;
    public final p3 c;
    public final List d;
    public final d3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Bundle bundle) {
        super(MethodRef.UpdateAvatar);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        g gVar = g.P;
        Uri uri = (Uri) gVar.b(bundle);
        f3 f3Var = new f3(passportUidImpl);
        p3 p3Var = new p3(gVar, uri);
        this.b = f3Var;
        this.c = p3Var;
        this.d = scc.g(f3Var, p3Var);
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
