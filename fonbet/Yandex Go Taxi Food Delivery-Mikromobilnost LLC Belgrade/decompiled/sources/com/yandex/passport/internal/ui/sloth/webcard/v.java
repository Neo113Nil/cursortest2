package com.yandex.passport.internal.ui.sloth.webcard;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import defpackage.ymi0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class v implements ymi0 {
    public static final v a = new v();

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0133, code lost:
    
        if (r1 == null) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q0 b(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        l0 l0Var = l0.b;
        if (i == -1 || i == 0) {
            return l0Var;
        }
        String str = null;
        if (i == 13) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                illegalArgumentException = (Throwable) (serializable instanceof Throwable ? serializable : null);
            }
            illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
            return new n0(illegalArgumentException);
        }
        if (i == 392) {
            if (intent == null || (extras2 = intent.getExtras()) == null) {
                return new n0(new IllegalStateException("Bundle is empty"));
            }
            if (!extras2.containsKey("passport-result-environment")) {
                str = "Environment";
            } else if (!extras2.containsKey("passport-result-uid")) {
                str = "Uid";
            }
            if (str != null) {
                return new n0(new IllegalStateException("Internal error: Required response data is missing: ".concat(str)));
            }
            int i2 = extras2.getInt("passport-result-environment");
            long j = extras2.getLong("passport-result-uid");
            Environment.Companion.getClass();
            return new p0(new Uid(com.yandex.passport.common.core.a.a(i2), j));
        }
        if (i == 666) {
            return l0.a;
        }
        if (i == 17121) {
            return l0.c;
        }
        if (i != 42) {
            if (i != 43) {
                return new n0(new IllegalStateException(oyr.i(i, "Unknown resultCode=")));
            }
            if (intent == null || (extras3 = intent.getExtras()) == null) {
                ny61.r("Internal error: Bundle is empty");
                return null;
            }
            if (!extras3.containsKey("passport-result-url")) {
                return new n0(new IllegalStateException("Internal error: Required response data is missing: URL"));
            }
            String string = extras3.getString("passport-result-url");
            if (string != null) {
                return new m0(string);
            }
            ny61.r("can't get required string passport-result-url");
            return null;
        }
        Bundle extras4 = intent != null ? intent.getExtras() : null;
        String str2 = extras4 != null ? !extras4.containsKey("passport-result-url") ? "Url" : !extras4.containsKey("passport-result-purpose") ? "Purpose" : null : "Bundle is empty";
        if (str2 != null) {
            return new n0(new IllegalStateException("Internal error: Required response data is missing: ".concat(str2)));
        }
        if (extras4 == null) {
            ny61.r("Internal error");
            return null;
        }
        String string2 = extras4.getString("passport-result-url");
        if (string2 == null) {
            ny61.r("can't get required string passport-result-url");
            return null;
        }
        String string3 = extras4.getString("passport-result-purpose");
        if (string3 != null) {
            return new o0(string2, string3);
        }
        ny61.r("can't get required string passport-result-purpose");
        return null;
    }

    @Override // defpackage.ymi0
    public Object a(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        u uVar = (u) obj2;
        if (uVar instanceof s) {
            return b0.a(b0Var, null, ((s) uVar).a, null, 5);
        }
        if (uVar instanceof r) {
            return b0.a(b0Var, null, null, ((r) uVar).a, 3);
        }
        if (uVar instanceof t) {
            return b0.a(b0Var, ((t) uVar).a, null, null, 6);
        }
        w511.b();
        return null;
    }
}
