package com.yandex.messaging.internal.authorized.chat;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import defpackage.a9b;
import defpackage.an8;
import defpackage.aq80;
import defpackage.ct21;
import defpackage.el21;
import defpackage.h3y;
import defpackage.i9b;
import defpackage.j9b;
import defpackage.jqr;
import defpackage.kse;
import defpackage.o1b0;
import defpackage.p1b0;
import defpackage.tje;
import defpackage.wls;
import defpackage.xdf0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final h3y a;
    public final com.yandex.messaging.internal.authorized.j b;
    public final el21 c;
    public final p1b0 d;
    public final i9b e;
    public final kse f;
    public final xdf0 g;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    public b(h3y h3yVar, com.yandex.messaging.internal.authorized.j jVar, el21 el21Var, p1b0 p1b0Var, i9b i9bVar, kse kseVar, xdf0 xdf0Var) {
        this.a = h3yVar;
        this.b = jVar;
        this.c = el21Var;
        this.d = p1b0Var;
        this.e = i9bVar;
        this.f = kseVar;
        this.g = xdf0Var;
    }

    public final Object a(ChatRequest chatRequest, ContinuationImpl continuationImpl) {
        return kotlinx.coroutines.flow.e.y(kotlinx.coroutines.flow.e.F(b(chatRequest), this.f.e), continuationImpl);
    }

    public final jqr b(ChatRequest chatRequest) {
        return new jqr(kotlinx.coroutines.flow.e.X(com.yandex.messaging.internal.authorized.i.b(this.c), new ChatScopeBridge$chatComponentFlow$$inlined$flatMapLatest$1(chatRequest, null)), new ChatScopeBridge$chatComponentFlow$2(this, chatRequest, null), 3);
    }

    public final j9b c(ChatRequest chatRequest) {
        kse.b(this.f);
        return f(chatRequest);
    }

    public final Object d(ChatRequest chatRequest, wls wlsVar, ContinuationImpl continuationImpl) {
        return tje.k0(this.g.b, new ChatScopeBridge$performSync$2(wlsVar, this, chatRequest, null), continuationImpl);
    }

    public final ct21 e(ChatRequest chatRequest, a9b a9bVar) {
        tje.e();
        j9b f = f(chatRequest);
        if (f != null) {
            a9bVar.B(f);
        }
        an8 an8Var = new an8(this, chatRequest, a9bVar);
        com.yandex.messaging.internal.authorized.j jVar = this.b;
        jVar.getClass();
        return new ct21(jVar, an8Var);
    }

    public final j9b f(ChatRequest chatRequest) {
        j9b j9bVar;
        tje.e();
        HashMap hashMap = this.i;
        o1b0 o1b0Var = (o1b0) hashMap.get(chatRequest);
        if (o1b0Var == null) {
            p1b0 p1b0Var = this.d;
            o1b0Var = p1b0Var.a.T() ? (o1b0) chatRequest.handle(new aq80(p1b0Var)) : null;
            if (o1b0Var != null) {
                hashMap.put(chatRequest, o1b0Var);
            } else {
                o1b0Var = null;
            }
            if (o1b0Var == null) {
                return null;
            }
        }
        HashMap hashMap2 = this.j;
        WeakReference weakReference = (WeakReference) hashMap2.get(o1b0Var);
        if (weakReference != null && (j9bVar = (j9b) weakReference.get()) != null) {
            return j9bVar;
        }
        j9b a = this.e.a(o1b0Var);
        hashMap2.put(o1b0Var, new WeakReference(a));
        return a;
    }
}
