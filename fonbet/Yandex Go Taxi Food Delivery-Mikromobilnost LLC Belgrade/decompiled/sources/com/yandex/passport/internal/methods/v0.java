package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.properties.TurboAppAuthProperties;
import defpackage.oo31;
import defpackage.xfo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class v0 extends x2 {
    public final h3 b;
    public final List c;
    public final g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Bundle bundle) {
        super(MethodRef.GetAnonymizedUserInfo);
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "turbo_app_auth_properties");
        if (e == null) {
            xfo.g("can't get required parcelable turbo_app_auth_properties");
            throw null;
        }
        h3 h3Var = new h3((TurboAppAuthProperties) e);
        this.b = h3Var;
        this.c = Collections.singletonList(h3Var);
        this.d = g.E;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }
}
