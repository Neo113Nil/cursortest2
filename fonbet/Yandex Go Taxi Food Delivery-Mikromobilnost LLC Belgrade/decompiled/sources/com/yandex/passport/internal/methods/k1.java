package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class k1 extends x2 {
    public final f3 b;
    public final y2 c;
    public final List d;
    public final g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Bundle bundle) {
        super(MethodRef.GetPersonProfile);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        a aVar = a.A;
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("need-display-name-variants"));
        f3 f3Var = new f3(passportUidImpl);
        y2 y2Var = new y2(aVar, valueOf);
        this.b = f3Var;
        this.c = y2Var;
        this.d = scc.g(f3Var, y2Var);
        this.e = g.I;
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
