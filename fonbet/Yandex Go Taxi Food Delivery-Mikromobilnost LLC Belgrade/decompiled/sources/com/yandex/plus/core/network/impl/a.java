package com.yandex.plus.core.network.impl;

import defpackage.ah7;
import defpackage.ch7;
import defpackage.d5j0;
import defpackage.i3y;
import defpackage.jo0;
import defpackage.m55;
import defpackage.sls;
import defpackage.tje;
import defpackage.wls;
import defpackage.yf7;
import java.util.Deque;
import java.util.LinkedList;
import kotlin.coroutines.EmptyCoroutineContext;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class a implements ah7 {
    public final ThreadLocal a = new ThreadLocal();
    public final i3y b;

    public a(m55 m55Var, m55 m55Var2, sls slsVar) {
        this.b = kotlin.a.a(new jo0(slsVar, this, m55Var, m55Var2, 7));
    }

    @Override // defpackage.ah7
    public final Object a(Object obj, wls wlsVar) {
        b().push(obj);
        try {
            return tje.Y(EmptyCoroutineContext.a, new CallFactoryWithContextImpl$withContext$result$1(wlsVar, obj, null));
        } finally {
            b().pop();
        }
    }

    public final Deque b() {
        ThreadLocal threadLocal = this.a;
        Object obj = threadLocal.get();
        if (obj == null) {
            obj = new LinkedList();
            threadLocal.set(obj);
        }
        return (Deque) obj;
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        return new ch7(((OkHttpClient) this.b.getValue()).newCall(d5j0Var));
    }
}
