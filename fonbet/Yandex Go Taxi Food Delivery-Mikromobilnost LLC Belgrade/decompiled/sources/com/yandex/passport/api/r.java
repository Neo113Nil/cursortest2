package com.yandex.passport.api;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFormatException;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.entities.TurboAuthParams;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import defpackage.ny61;
import defpackage.oyr;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;

/* loaded from: classes15.dex */
public final class r {
    public static TurboAuthParams a() {
        return new TurboAuthParams(null, null, null, null);
    }

    public static s0 b(int i) {
        return new s0(i);
    }

    public static com.yandex.passport.internal.entities.j c(Intent intent) {
        return com.yandex.passport.internal.a0.e(intent.getExtras());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        if (r6 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w d(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        String str = "Uid";
        if (i == -1) {
            Bundle extras2 = intent != null ? intent.getExtras() : null;
            if (extras2 == null) {
                str = "Bundle is empty";
            } else if (!extras2.containsKey("passport-login-result-environment")) {
                str = "Environment";
            } else if (extras2.containsKey("passport-login-result-uid")) {
                if (extras2.containsKey("passport-login-action")) {
                    PassportAccountImpl.Companion.getClass();
                    str = !extras2.containsKey("passport-account") ? "Account data" : null;
                } else {
                    str = "Login Action";
                }
            }
            if (str != null) {
                return new s(new IllegalStateException("Internal error: Required response data is missing: ".concat(str)));
            }
            if (extras2 == null) {
                ny61.r("Internal error");
                return null;
            }
            int i2 = extras2.getInt("passport-login-result-environment");
            long j = extras2.getLong("passport-login-result-uid");
            int i3 = extras2.getInt("passport-login-action");
            String string = extras2.getString("passport-login-additional-action");
            PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(i2), j);
            PassportAccountImpl.Companion.getClass();
            extras2.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
            PassportAccountImpl passportAccountImpl = (PassportAccountImpl) extras2.getParcelable("passport-account");
            if (passportAccountImpl != null) {
                return new u(passportUidImpl, passportAccountImpl, PassportLoginAction.values()[i3], string != null ? string : null, extras2.getString("phone-number"));
            }
            throw new ParcelFormatException("Invalid parcelable PassportAccountImpl in the bundle");
        }
        if (i == 0) {
            return q.a;
        }
        if (i == 6) {
            return t.a;
        }
        if (i == 13) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                illegalArgumentException = (Throwable) (serializable instanceof Throwable ? serializable : null);
            }
            illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
            return new s(illegalArgumentException);
        }
        if (i != 42) {
            return new s(new IllegalStateException(oyr.i(i, "Unknown resultCode=")));
        }
        Bundle extras3 = intent != null ? intent.getExtras() : null;
        if (extras3 == null) {
            str = "Bundle is empty";
        } else if (!extras3.containsKey("passport-result-url")) {
            str = "Environment";
        } else if (extras3.containsKey("passport-result-purpose")) {
            str = null;
        }
        if (str != null) {
            return new s(new IllegalStateException("Internal error: Required response data is missing: ".concat(str)));
        }
        if (extras3 == null) {
            ny61.r("Internal error");
            return null;
        }
        String string2 = extras3.getString("passport-result-url");
        if (string2 == null) {
            ny61.r("can't get required string passport-result-url");
            return null;
        }
        String string3 = extras3.getString("passport-result-purpose");
        if (string3 != null) {
            return new v(string2, string3);
        }
        ny61.r("can't get required string passport-result-purpose");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
    
        if (r1 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m0 e(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        if (i == -1 || i == 0) {
            return l0.a;
        }
        if (i == 13) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                illegalArgumentException = (Throwable) (serializable instanceof Throwable ? serializable : null);
            }
            illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
            return new j0(illegalArgumentException);
        }
        if (i != 42) {
            return new j0(new IllegalStateException(oyr.i(i, "Unknown resultCode=")));
        }
        Bundle extras2 = intent != null ? intent.getExtras() : null;
        String str = extras2 == null ? "Bundle is empty" : !extras2.containsKey("passport-result-url") ? "Environment" : !extras2.containsKey("passport-result-purpose") ? "Uid" : null;
        if (str != null) {
            return new j0(new IllegalStateException("Internal error: Required response data is missing: ".concat(str)));
        }
        if (extras2 == null) {
            ny61.r("Internal error");
            return null;
        }
        String string = extras2.getString("passport-result-url");
        if (string == null) {
            ny61.r("can't get required string passport-result-url");
            return null;
        }
        String string2 = extras2.getString("passport-result-purpose");
        if (string2 != null) {
            return new k0(string, string2);
        }
        ny61.r("can't get required string passport-result-purpose");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r0 f(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        if (i == -1) {
            return p0.c;
        }
        if (i == 0) {
            return p0.a;
        }
        if (i == 6) {
            return p0.b;
        }
        if (i != 13) {
            return new q0(new IllegalStateException(oyr.i(i, "Unknown resultCode=")));
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
            if (!(serializable instanceof Throwable)) {
                serializable = null;
            }
            illegalArgumentException = (Throwable) serializable;
        }
        illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
        return new q0(illegalArgumentException);
    }

    public static x0 g(int i, Intent intent) {
        String str;
        Bundle extras;
        Object obj;
        Object serializable;
        Bundle extras2;
        Object obj2;
        Object serializable2;
        PassportException passportException = null;
        passportException = null;
        if (i != -1) {
            if (i != 2) {
                return new v0(null);
            }
            if (intent != null && (extras2 = intent.getExtras()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable2 = extras2.getSerializable(EsiaBindActivity.EXTRA_EXCEPTION, PassportException.class);
                    obj2 = serializable2;
                } else {
                    Object serializable3 = extras2.getSerializable(EsiaBindActivity.EXTRA_EXCEPTION);
                    obj2 = (PassportException) (serializable3 instanceof PassportException ? serializable3 : null);
                }
                passportException = (PassportException) obj2;
            }
            return new v0(passportException);
        }
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable(EsiaBindActivity.EXTRA_TASK_ID, String.class);
                obj = serializable;
            } else {
                Object serializable4 = extras.getSerializable(EsiaBindActivity.EXTRA_TASK_ID);
                if (!(serializable4 instanceof String)) {
                    serializable4 = null;
                }
                obj = (String) serializable4;
            }
            str = (String) obj;
        }
        return str != null ? new w0(str) : new v0(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        if (r2 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k1 h(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        if (i == -1) {
            return j1.a;
        }
        if (i == 0 || i == 4) {
            return g1.a;
        }
        if (i != 13) {
            return i1.a;
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
            if (!(serializable instanceof Throwable)) {
                serializable = null;
            }
            illegalArgumentException = (Throwable) serializable;
        }
        illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
        return new h1(illegalArgumentException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r1 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j3 i(int i, Intent intent) {
        Bundle extras;
        String string;
        Throwable illegalArgumentException;
        Bundle extras2;
        Bundle extras3;
        String string2;
        String string3;
        if (i == -1) {
            if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("item", null)) == null) {
                return new g3(new IllegalArgumentException("Item is missing in data"));
            }
            Bundle extras4 = intent.getExtras();
            return new h3(string, extras4 != null ? extras4.getString("params", null) : null);
        }
        if (i == 0) {
            return f3.a;
        }
        if (i == 13) {
            if (intent != null && (extras2 = intent.getExtras()) != null) {
                Serializable serializable = extras2.getSerializable(Constants.KEY_EXCEPTION);
                illegalArgumentException = (Throwable) (serializable instanceof Throwable ? serializable : null);
            }
            illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
            return new g3(illegalArgumentException);
        }
        if (i != 42) {
            return new g3(new IllegalStateException(oyr.i(i, "Unknown resultCode=")));
        }
        if (intent == null || (extras3 = intent.getExtras()) == null || (string2 = extras3.getString("url", null)) == null) {
            return new g3(new IllegalArgumentException("Url is missing in data"));
        }
        Bundle extras5 = intent.getExtras();
        String str = "";
        if (extras5 != null && (string3 = extras5.getString("purpose", "")) != null) {
            str = string3;
        }
        return new i3(string2, str);
    }
}
