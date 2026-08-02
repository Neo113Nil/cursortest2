package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class r1 extends x2 {
    public final f3 b;
    public final b c;
    public final List d;
    public final m3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(Bundle bundle) {
        super(MethodRef.GetTrackPayload);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        String string = bundle.getString("process_tag");
        if (string == null) {
            xfo.g("can't get required string process_tag");
            throw null;
        }
        f3 f3Var = new f3(passportUidImpl);
        b bVar = new b(string, 23);
        this.b = f3Var;
        this.c = bVar;
        this.d = scc.g(f3Var, bVar);
        this.e = m3.w;
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
