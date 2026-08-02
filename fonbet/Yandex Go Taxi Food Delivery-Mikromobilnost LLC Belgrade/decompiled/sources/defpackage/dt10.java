package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class dt10 implements e1k {
    public final String a;
    public final gt10 b;
    public final /* synthetic */ et10 c;

    public dt10(et10 et10Var, String str, gt10 gt10Var) {
        this.c = et10Var;
        z83.g(null, et10Var.c, Looper.myLooper());
        this.a = str;
        this.b = gt10Var;
        et10Var.a.b(this);
        if (et10Var.b.contains(str)) {
            z83.g(null, (Looper) gt10Var.w.c, Looper.myLooper());
            gt10Var.b.post(new ft10(gt10Var, 0));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        et10 et10Var = this.c;
        z83.g(null, et10Var.c, Looper.myLooper());
        et10Var.a.d(this);
    }
}
