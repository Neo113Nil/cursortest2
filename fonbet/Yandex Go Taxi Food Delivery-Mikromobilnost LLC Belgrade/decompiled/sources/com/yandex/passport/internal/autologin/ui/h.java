package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.c0;
import com.yandex.passport.api.d2;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.e3;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.api.exception.PassportTurboAppAuthException;
import com.yandex.passport.api.f1;
import com.yandex.passport.api.i2;
import com.yandex.passport.api.k;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.o0;
import com.yandex.passport.api.p;
import com.yandex.passport.internal.impl.r;
import defpackage.b64;
import defpackage.d6z;
import defpackage.x40;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class h extends x40 {
    public final /* synthetic */ int a;
    public final com.yandex.passport.api.e b;

    public h(com.yandex.passport.api.e eVar, r rVar) {
        this.a = 7;
        this.b = eVar;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        int i = this.a;
        com.yandex.passport.api.e eVar = this.b;
        switch (i) {
            case 0:
                g gVar = (g) obj;
                return eVar.k(context, gVar.a().getUid(), gVar.b());
            case 1:
                return eVar.n(context, (k) obj);
            case 2:
                return eVar.i(context, (e1) obj);
            case 3:
                return eVar.l(context, (p) obj);
            case 4:
                return eVar.e(context, (c0) obj);
            case 5:
                return eVar.m(context, (Uri) obj);
            case 6:
                b64.D(obj);
                return eVar.c(context);
            case 7:
                return eVar.h(context, (i2) obj);
            case 8:
                return eVar.g(context, (d2) obj);
            case 9:
                return eVar.b(context, (k2) obj);
            case 10:
                return eVar.d(context, (o0) obj);
            case 11:
                return eVar.a(context, (f1) obj);
            default:
                return eVar.j(context, (e3) obj);
        }
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        Object failure;
        Object obj;
        Object failure2;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                if (intent != null) {
                    try {
                        bundle = intent.getExtras();
                    } catch (Exception unused) {
                        failure = new Result.Failure(new IllegalStateException("Internal error: Required response data is missing: uid"));
                    }
                }
                failure = d6z.d(com.yandex.passport.internal.ui.sloth.e.e(bundle));
                return new Result(failure);
            case 1:
                return com.yandex.passport.api.r.d(i, intent);
            case 2:
                return com.yandex.passport.api.r.d(i, intent);
            case 3:
                return com.yandex.passport.api.r.d(i, intent);
            case 4:
                return com.yandex.passport.api.r.d(i, intent);
            case 5:
                return com.yandex.passport.api.r.e(i, intent);
            case 6:
                if (intent == null) {
                    obj = new Result.Failure(new PassportActionForbiddenException());
                } else if (i == -1) {
                    obj = zy11.a;
                } else if (i != 13) {
                    obj = new Result.Failure(new PassportActionForbiddenException());
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                        Exception exc = (Exception) (serializable instanceof Exception ? serializable : null);
                        if (exc != null) {
                            obj = new Result.Failure(exc);
                        }
                    }
                    obj = new Result.Failure(new PassportActionForbiddenException());
                }
                return new Result(obj);
            case 7:
                EmptyList emptyList = EmptyList.a;
                if (intent == null) {
                    failure2 = new Result.Failure(new PassportTurboAppAuthException("Activity result parsing failed", emptyList));
                } else if (i == -1) {
                    try {
                        failure2 = com.yandex.passport.api.h.b(intent);
                    } catch (Throwable th) {
                        failure2 = new Result.Failure(th);
                    }
                } else if (i != 13) {
                    failure2 = new Result.Failure(new PassportTurboAppAuthException("Activity result parsing failed", emptyList));
                } else {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        Serializable serializable2 = extras2.getSerializable(Constants.KEY_EXCEPTION);
                        Exception exc2 = (Exception) (serializable2 instanceof Exception ? serializable2 : null);
                        if (exc2 != null) {
                            failure2 = new Result.Failure(exc2);
                        }
                    }
                    failure2 = new Result.Failure(new PassportTurboAppAuthException("Activity result parsing failed", emptyList));
                }
                return new Result(failure2);
            case 8:
                if (intent == null) {
                    return Boolean.valueOf(i == -1);
                }
                if (i == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i == -1);
            case 9:
                return com.yandex.passport.api.r.f(i, intent);
            case 10:
                return com.yandex.passport.api.r.f(i, intent);
            case 11:
                return com.yandex.passport.api.r.h(i, intent);
            default:
                return com.yandex.passport.api.r.i(i, intent);
        }
    }

    public /* synthetic */ h(com.yandex.passport.api.e eVar, int i, boolean z) {
        this.a = i;
        this.b = eVar;
    }

    public /* synthetic */ h(com.yandex.passport.api.e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }
}
