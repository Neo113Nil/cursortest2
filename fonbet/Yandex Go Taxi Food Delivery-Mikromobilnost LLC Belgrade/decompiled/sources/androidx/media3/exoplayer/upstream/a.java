package androidx.media3.exoplayer.upstream;

import android.os.Looper;
import android.os.SystemClock;
import defpackage.d6z;
import defpackage.h0n;
import defpackage.i8m;
import defpackage.oyy;
import defpackage.pyy;
import defpackage.qir;
import defpackage.qyy;
import defpackage.tsi0;
import defpackage.tw21;
import defpackage.tyy;
import defpackage.ywd;
import java.io.IOException;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class a implements tyy {
    public static final h0n d = new h0n(false, 0, -9223372036854775807L);
    public static final h0n e = new h0n(false, 2, -9223372036854775807L);
    public static final h0n f = new h0n(false, 3, -9223372036854775807L);
    public final tsi0 a;
    public Loader$LoadTask b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str) {
        this(new tsi0(Executors.newSingleThreadExecutor(new ywd(r3, 2)), new qir(27)));
        String concat = "ExoPlayer:Loader:".concat(str);
        int i = tw21.a;
    }

    public final void a() {
        Loader$LoadTask loader$LoadTask = this.b;
        d6z.z(loader$LoadTask);
        loader$LoadTask.cancel(false);
    }

    @Override // defpackage.tyy
    public final void b() {
        e(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        Loader$LoadTask loader$LoadTask = this.b;
        if (loader$LoadTask != null) {
            if (i == Integer.MIN_VALUE) {
                i = loader$LoadTask.defaultMinRetryCount;
            }
            loader$LoadTask.maybeThrowError(i);
        }
    }

    public final void f(qyy qyyVar) {
        Loader$LoadTask loader$LoadTask = this.b;
        if (loader$LoadTask != null) {
            loader$LoadTask.cancel(true);
        }
        tsi0 tsi0Var = this.a;
        if (qyyVar != null) {
            tsi0Var.execute(new i8m(23, qyyVar));
        }
        tsi0Var.b.accept(tsi0Var.a);
    }

    public final void g(pyy pyyVar, oyy oyyVar, int i) {
        Looper myLooper = Looper.myLooper();
        d6z.z(myLooper);
        this.c = null;
        new Loader$LoadTask(this, myLooper, pyyVar, oyyVar, i, SystemClock.elapsedRealtime()).start(0L);
    }

    public a(tsi0 tsi0Var) {
        this.a = tsi0Var;
    }
}
