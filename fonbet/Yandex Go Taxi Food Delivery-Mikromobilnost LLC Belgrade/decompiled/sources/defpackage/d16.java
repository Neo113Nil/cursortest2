package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class d16 implements Runnable {
    public static final gly0 z = new gly0();
    public final ao7 a;
    public final gly0 b;
    public final HashSet c;
    public final Handler w;
    public long x;
    public boolean y;

    public d16(b16 b16Var, li10 li10Var, ao7 ao7Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = new HashSet();
        this.x = 40L;
        this.a = ao7Var;
        this.b = z;
        this.w = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.getClass();
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        ao7 ao7Var = this.a;
        if (ao7Var.c == 0 || SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis >= 32) {
            if (this.y || ao7Var.c == 0) {
                return;
            }
            long j = this.x;
            this.x = Math.min(4 * j, 1000L);
            this.w.postDelayed(this, j);
            return;
        }
        ArrayList arrayList = ao7Var.b;
        if (arrayList.get(ao7Var.d) != null) {
            ny61.u();
            return;
        }
        HashMap hashMap = ao7Var.a;
        Integer num = (Integer) hashMap.get(null);
        if (num.intValue() == 1) {
            hashMap.remove(null);
            arrayList.remove(ao7Var.d);
        } else {
            hashMap.put(null, Integer.valueOf(num.intValue() - 1));
        }
        ao7Var.c--;
        ao7Var.d = arrayList.isEmpty() ? 0 : (ao7Var.d + 1) % arrayList.size();
        HashSet hashSet = this.c;
        if (hashSet.contains(null)) {
            throw null;
        }
        hashSet.add(null);
        throw null;
    }
}
