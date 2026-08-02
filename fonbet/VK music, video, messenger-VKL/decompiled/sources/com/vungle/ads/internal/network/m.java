package com.vungle.ads.internal.network;

import kotlin.Result;
import okhttp3.u;
import okhttp3.v;
import xsna.s3q0;
import xsna.vl8;

/* loaded from: classes7.dex */
public final class m {
    public final okhttp3.d a;
    public final com.vungle.ads.internal.network.converters.a b;

    static {
        new h();
    }

    public m(okhttp3.d dVar, com.vungle.ads.internal.network.converters.a aVar) {
        this.a = dVar;
        this.b = aVar;
    }

    public final void a(a aVar) {
        okhttp3.d dVar;
        synchronized (this) {
            dVar = this.a;
            s3q0 s3q0Var = s3q0.a;
        }
        dVar.f9(new l(this, aVar));
    }

    public final o a() {
        okhttp3.d dVar;
        Object failure;
        synchronized (this) {
            dVar = this.a;
            s3q0 s3q0Var = s3q0.a;
        }
        try {
            failure = a(dVar.execute());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("[execute] Failed to parse response:  ");
            a2.append(a.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", a2.toString());
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (o) failure;
    }

    public final o a(okhttp3.u uVar) {
        okhttp3.v vVar = uVar.h;
        if (vVar == null) {
            return null;
        }
        u.a w = uVar.w();
        w.g = new k(vVar.contentType(), vVar.contentLength());
        okhttp3.u c = w.c();
        int i = c.e;
        if (i >= 200 && i < 300) {
            if (i != 204 && i != 205) {
                j jVar = new j(vVar);
                try {
                    return n.a(this.b.a(jVar), c);
                } catch (Throwable th) {
                    jVar.a();
                    throw th;
                }
            }
            vVar.close();
            return n.a(null, c);
        }
        try {
            vl8 vl8Var = new vl8();
            vVar.source().z3(vl8Var);
            v.b bVar = okhttp3.v.Companion;
            okhttp3.m contentType = vVar.contentType();
            long contentLength = vVar.contentLength();
            bVar.getClass();
            new okhttp3.w(contentType, contentLength, vl8Var);
            o a = n.a(c);
            vVar.close();
            return a;
        } finally {
        }
    }
}
