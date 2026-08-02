package com.yandex.passport.internal.push;

import android.content.Context;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class s implements r {
    public static final s a = new s();

    @Override // com.yandex.passport.internal.push.r
    public Object a(Continuation continuation) {
        return zy11.a;
    }

    public n0 b(Context context) {
        n0 n0Var;
        n0 n0Var2 = n0.d;
        if (n0Var2 != null) {
            return n0Var2;
        }
        synchronized (this) {
            n0Var = n0.d;
            if (n0Var == null) {
                n0Var = new n0(context.getApplicationContext());
                n0.d = n0Var;
            }
        }
        return n0Var;
    }
}
