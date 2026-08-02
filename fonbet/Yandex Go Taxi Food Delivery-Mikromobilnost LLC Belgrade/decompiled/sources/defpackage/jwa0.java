package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.iwa0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class jwa0 implements vff0 {
    public final Handler a = new Handler();
    public final c370 b;
    public HashMap c;

    public jwa0(c370 c370Var, wff0 wff0Var) {
        this.b = c370Var;
        wff0Var.a(this);
    }

    public final void a(long j, String str) {
        d(TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - j), str);
    }

    @Override // defpackage.vff0
    public final synchronized void b() {
        this.a.removeCallbacksAndMessages(null);
        c();
    }

    public final synchronized void c() {
        try {
            z83.g(null, Looper.myLooper(), this.a.getLooper());
            if (this.c == null) {
                return;
            }
            kwa0 kwa0Var = new kwa0();
            kwa0Var.stats = new iwa0[this.c.size()];
            int i = 0;
            for (Map.Entry entry : this.c.entrySet()) {
                iwa0[] iwa0VarArr = kwa0Var.stats;
                int i2 = i + 1;
                iwa0.a aVar = (iwa0.a) entry.getValue();
                aVar.getClass();
                iwa0 iwa0Var = new iwa0();
                iwa0Var.tag = aVar.a;
                int i3 = aVar.c;
                if (i3 > 0) {
                    long[] jArr = new long[i3];
                    System.arraycopy(aVar.b, 0, jArr, 0, i3);
                    iwa0Var.timesMcs = jArr;
                }
                iwa0VarArr[i] = iwa0Var;
                i = i2;
            }
            c370 c370Var = this.b;
            c370Var.getClass();
            t8o t8oVar = new t8o();
            t8oVar.environment = c370Var.a.a();
            t8oVar.origin = c370Var.f;
            t8oVar.performanceStats = kwa0Var;
            c370Var.d(t8oVar);
            this.c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(long j, String str) {
        try {
            if (this.c == null) {
                this.a.postDelayed(new op70(24, this), 5000L);
                this.c = new HashMap();
            }
            iwa0.a aVar = (iwa0.a) this.c.get(str);
            if (aVar == null) {
                aVar = new iwa0.a();
                aVar.a = str;
                this.c.put(str, aVar);
            }
            long[] jArr = aVar.b;
            int i = aVar.c;
            int i2 = i + 1;
            aVar.c = i2;
            z83.h(null, i <= jArr.length);
            if (i2 > jArr.length) {
                long[] jArr2 = new long[i <= 4 ? 8 : i * 2];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                jArr = jArr2;
            }
            jArr[i] = j;
            aVar.b = jArr;
        } catch (Throwable th) {
            throw th;
        }
    }
}
