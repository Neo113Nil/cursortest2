package yads;

import android.os.Looper;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class gh1 implements hh1 {
    public static final ah1 d = new ah1(2, C.TIME_UNSET);
    public static final ah1 e = new ah1(3, C.TIME_UNSET);
    public final ExecutorService a;
    public bh1 b;
    public IOException c;

    public gh1(String str) {
        this.a = mc3.d("ExoPlayer:Loader:".concat(str));
    }

    @Override // yads.hh1
    public final void a() {
        a(Integer.MIN_VALUE);
    }

    public final boolean b() {
        return this.b != null;
    }

    public final void a(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        bh1 bh1Var = this.b;
        if (bh1Var != null) {
            if (i == Integer.MIN_VALUE) {
                i = bh1Var.b;
            }
            IOException iOException2 = bh1Var.f;
            if (iOException2 != null && bh1Var.g > i) {
                throw iOException2;
            }
        }
    }

    public final void a(dh1 dh1Var) {
        bh1 bh1Var = this.b;
        if (bh1Var != null) {
            bh1Var.a(true);
        }
        if (dh1Var != null) {
            this.a.execute(new eh1(dh1Var));
        }
        this.a.shutdown();
    }

    public final long a(ch1 ch1Var, zg1 zg1Var, int i) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bh1 bh1Var = new bh1(this, myLooper, ch1Var, zg1Var, i, elapsedRealtime);
            if (this.b == null) {
                this.b = bh1Var;
                bh1Var.f = null;
                this.a.execute(bh1Var);
                return elapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
