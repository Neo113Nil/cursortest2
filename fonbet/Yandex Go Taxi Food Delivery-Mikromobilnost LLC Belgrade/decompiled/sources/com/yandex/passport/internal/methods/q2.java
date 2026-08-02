package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.scc;
import defpackage.xfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes8.dex */
public final class q2 extends x2 {
    public final f3 b;
    public final h3 c;
    public final b d;
    public final List e;
    public final com.yandex.passport.internal.flags.experiments.d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Bundle bundle) {
        super(MethodRef.TryAddPlusDevice);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        String string = bundle.getString(Constants.KEY_SERVICE);
        if (string == null) {
            xfo.g("can't get required string service");
            throw null;
        }
        String string2 = bundle.getString("brand");
        if (string2 == null) {
            xfo.g("can't get required string brand");
            throw null;
        }
        f3 f3Var = new f3(passportUidImpl);
        h3 h3Var = new h3(string, 1);
        b bVar = new b(string2, 2);
        this.b = f3Var;
        this.c = h3Var;
        this.d = bVar;
        this.e = scc.g(f3Var, h3Var, bVar);
        this.f = new com.yandex.passport.internal.flags.experiments.d("has_plus_device_added");
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
