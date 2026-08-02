package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class kse {
    public final g6u a;
    public final g6u b;
    public final sjh c;
    public final mdh d;
    public final g6u e;
    public final g6u f;
    public final g6u g;

    public kse(Looper looper, Looper looper2) {
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        this.a = g6uVar;
        this.b = g6uVar.x;
        this.c = uyj.a;
        this.d = mdh.b;
        g6u d = i6u.d(new Handler(looper), "Logic Dispatcher");
        this.e = d;
        this.f = d.x;
        this.g = i6u.d(new Handler(looper2), "DB Dispatcher").x;
    }

    public static void a(kse kseVar) {
        kseVar.getClass();
        Looper.myLooper();
        z83.i();
    }

    public static void b(kse kseVar) {
        kseVar.getClass();
        Looper.myLooper();
        Looper.getMainLooper();
        z83.i();
    }

    public final ike c() {
        return g8e.f(this.a);
    }
}
