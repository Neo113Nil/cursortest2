package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.exception.PassportAutoLoginImpossibleException;
import com.yandex.passport.api.exception.PassportAutoLoginRetryRequiredException;
import com.yandex.passport.internal.a0;
import defpackage.x40;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class i extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return ((PassportAutoLoginRetryRequiredException) obj).getIntent();
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        Object e;
        if (intent == null) {
            e = new Result.Failure(new PassportAutoLoginImpossibleException("Accounts for auto login with provided filter not found"));
        } else if (i == -1) {
            e = a0.e(intent.getExtras());
        } else if (i != 13) {
            e = new Result.Failure(new PassportAutoLoginImpossibleException("Accounts for auto login with provided filter not found"));
        } else {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                if (!(serializable instanceof Exception)) {
                    serializable = null;
                }
                Exception exc = (Exception) serializable;
                if (exc != null) {
                    e = new Result.Failure(exc);
                }
            }
            e = new Result.Failure(new PassportAutoLoginImpossibleException("Accounts for auto login with provided filter not found"));
        }
        return new Result(e);
    }
}
