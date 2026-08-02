package com.yandex.messaging.internal.net;

import android.os.Looper;
import defpackage.d5j0;
import defpackage.g0c;
import defpackage.kci0;
import defpackage.kse;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.ryj;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w1k0;
import defpackage.x1k0;
import defpackage.xw50;
import defpackage.y1k0;
import defpackage.yf7;
import defpackage.z83;
import defpackage.zq60;
import defpackage.zy11;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import okhttp3.OkHttpClient;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes15.dex */
public final class a {
    public final OkHttpClient a;
    public final kse b;
    public final Looper c = Looper.myLooper();
    public zq60 d = new zq60();

    public a(xw50 xw50Var, OkHttpClient okHttpClient, kse kseVar) {
        this.a = okHttpClient;
        this.b = kseVar;
        x1k0 x1k0Var = new x1k0(this, xw50Var.a());
        z83.g(null, xw50Var.w.getLooper(), Looper.myLooper());
        xw50Var.b.b(x1k0Var);
    }

    public final Object a(Continuation continuation) {
        Object k0 = tje.k0(this.b.e, new RetryManager$awaitConnectionEstablished$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void b() {
        List<yf7> unmodifiableList;
        RealConnection connectionToCancel;
        ryj ryjVar = this.a.a;
        synchronized (ryjVar) {
            try {
                ArrayDeque arrayDeque = ryjVar.f;
                ArrayDeque arrayDeque2 = ryjVar.e;
                ArrayList arrayList = new ArrayList(tcc.n(arrayDeque2, 10));
                Iterator it = arrayDeque2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kci0) it.next()).c);
                }
                unmodifiableList = Collections.unmodifiableList(kotlin.collections.a.m0(arrayList, arrayDeque));
            } catch (Throwable th) {
                throw th;
            }
        }
        for (yf7 yf7Var : unmodifiableList) {
            d5j0 k = yf7Var.k();
            k.getClass();
            g0c a = qoi0.a(Object.class);
            if (a.a().cast(k.e.o(a)) == HttpRequestTag.YaDiskFileRequest) {
                nci0 nci0Var = yf7Var instanceof nci0 ? (nci0) yf7Var : null;
                if (nci0Var != null && (connectionToCancel = nci0Var.getConnectionToCancel()) != null) {
                    connectionToCancel.cancel();
                }
            }
        }
    }

    public final void c() {
        boolean z;
        z83.g(null, this.c, Looper.myLooper());
        zq60 zq60Var = this.d;
        this.d = new zq60();
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((y1k0) arrayList.get(i)).a.a();
                i++;
            }
        }
    }

    public final y1k0 d(w1k0 w1k0Var) {
        z83.g(null, this.c, Looper.myLooper());
        return new y1k0(this, w1k0Var);
    }
}
