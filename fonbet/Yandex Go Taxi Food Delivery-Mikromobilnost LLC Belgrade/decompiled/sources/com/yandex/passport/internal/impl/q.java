package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.c2;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import defpackage.ny61;
import defpackage.x40;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class q extends x40 {
    public final /* synthetic */ com.yandex.passport.api.e a;
    public final /* synthetic */ r b;

    public q(com.yandex.passport.api.e eVar, r rVar) {
        this.a = eVar;
        this.b = rVar;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return this.a.o(context, (c2) obj);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        Object e;
        if (intent == null) {
            e = new Result.Failure(new PassportActionForbiddenException());
        } else {
            if (i == -1) {
                this.b.getClass();
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    ny61.r("no extras in result intent");
                    return null;
                }
                e = com.yandex.passport.internal.ui.sloth.e.e(extras);
            } else if (i != 13) {
                e = new Result.Failure(new PassportActionForbiddenException());
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    Serializable serializable = extras2.getSerializable(Constants.KEY_EXCEPTION);
                    Exception exc = (Exception) (serializable instanceof Exception ? serializable : null);
                    if (exc != null) {
                        e = new Result.Failure(exc);
                    }
                }
                e = new Result.Failure(new PassportActionForbiddenException());
            }
        }
        return new Result(e);
    }
}
