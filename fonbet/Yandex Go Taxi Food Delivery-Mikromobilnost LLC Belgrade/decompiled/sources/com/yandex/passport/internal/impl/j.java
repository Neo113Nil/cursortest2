package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.passport.api.a0;
import com.yandex.passport.api.c0;
import com.yandex.passport.api.c2;
import com.yandex.passport.api.d2;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.e2;
import com.yandex.passport.api.e3;
import com.yandex.passport.api.f1;
import com.yandex.passport.api.i2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.o0;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;

/* loaded from: classes15.dex */
public final class j implements com.yandex.passport.api.e {
    public final g a;

    public j(g gVar) {
        this.a = gVar;
    }

    @Override // com.yandex.passport.api.e
    public final Intent a(Context context, f1 f1Var) {
        return this.a.a(context, f1Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent b(Context context, k2 k2Var) {
        return this.a.b(context, k2Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent c(Context context) {
        this.a.c(context);
        throw null;
    }

    @Override // com.yandex.passport.api.e
    public final Intent d(Context context, o0 o0Var) {
        return this.a.d(context, o0Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent e(Context context, c0 c0Var) {
        return this.a.e(context, c0Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent f(Context context, e2 e2Var) {
        return this.a.f(context, e2Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent g(Context context, d2 d2Var) {
        return this.a.g(context, d2Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent h(Context context, i2 i2Var) {
        return this.a.h(context, i2Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent i(Context context, e1 e1Var) {
        return this.a.i(context, e1Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent j(Context context, e3 e3Var) {
        return this.a.j(context, e3Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent k(Context context, k2 k2Var, a0 a0Var) {
        return this.a.k(context, k2Var, a0Var);
    }

    @Override // com.yandex.passport.api.e
    public final Intent l(Context context, com.yandex.passport.api.p pVar) {
        return this.a.l(context, pVar);
    }

    @Override // com.yandex.passport.api.e
    public final Intent m(Context context, Uri uri) {
        return this.a.m(context, uri);
    }

    @Override // com.yandex.passport.api.e
    public final Intent n(Context context, com.yandex.passport.api.k kVar) {
        return this.a.n(context, kVar);
    }

    @Override // com.yandex.passport.api.e
    public final Intent o(Context context, c2 c2Var) {
        return this.a.o(context, c2Var);
    }

    public final Intent p(Context context, AutoLoginProperties autoLoginProperties, UserCredentials userCredentials, boolean z) {
        g gVar = this.a;
        gVar.a.x();
        try {
            Intent intent = new Intent(context, (Class<?>) AutoLoginRetryActivity.class);
            AutoLoginProperties.Companion.getClass();
            intent.putExtras(com.yandex.passport.internal.properties.e.b(autoLoginProperties).toBundle());
            UserCredentials.Companion.getClass();
            intent.putExtra(AutoLoginRetryActivity.KEY_USER_CREDENTIALS, com.yandex.passport.internal.entities.r.a(userCredentials));
            intent.putExtra(AutoLoginRetryActivity.KEY_IS_ERROR_TEMPORARY, z);
            return intent;
        } catch (RuntimeException e) {
            gVar.a.k(e);
            throw e;
        }
    }
}
