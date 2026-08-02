package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.entities.PersonProfile;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.oo31;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class u2 extends x2 {
    public final f3 b;
    public final b c;
    public final List d;
    public final d3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Bundle bundle) {
        super(MethodRef.UpdatePersonProfile);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "person-profile");
        if (e == null) {
            xfo.g("can't get required parcelable person-profile");
            throw null;
        }
        f3 f3Var = new f3(passportUidImpl);
        b bVar = new b((PersonProfile) e);
        this.b = f3Var;
        this.c = bVar;
        this.d = scc.g(f3Var, bVar);
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
