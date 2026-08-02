package yads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes10.dex */
public abstract class w73 implements xq {
    public static final s73 b = new s73();

    public abstract int a();

    public abstract int a(Object obj);

    public int a(boolean z) {
        return c() ? -1 : 0;
    }

    public abstract Object a(int i);

    public abstract t73 a(int i, t73 t73Var, boolean z);

    public abstract v73 a(int i, v73 v73Var, long j);

    public abstract int b();

    public int b(boolean z) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(Object obj) {
        int b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w73)) {
            return false;
        }
        w73 w73Var = (w73) obj;
        if (w73Var.b() != b() || w73Var.a() != a()) {
            return false;
        }
        v73 v73Var = new v73();
        t73 t73Var = new t73();
        v73 v73Var2 = new v73();
        t73 t73Var2 = new t73();
        for (int i = 0; i < b(); i++) {
            if (!a(i, v73Var, 0L).equals(w73Var.a(i, v73Var2, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < a(); i2++) {
            if (!a(i2, t73Var, true).equals(w73Var.a(i2, t73Var2, true))) {
                return false;
            }
        }
        int a = a(true);
        if (a != w73Var.a(true) || (b2 = b(true)) != w73Var.b(true)) {
            return false;
        }
        while (a != b2) {
            int a2 = a(a, 0, true);
            if (a2 != w73Var.a(a, 0, true)) {
                return false;
            }
            a = a2;
        }
        return true;
    }

    public final int hashCode() {
        v73 v73Var = new v73();
        t73 t73Var = new t73();
        int b2 = b() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i = 0; i < b(); i++) {
            b2 = (b2 * 31) + a(i, v73Var, 0L).hashCode();
        }
        int a = a() + (b2 * 31);
        for (int i2 = 0; i2 < a(); i2++) {
            a = (a * 31) + a(i2, t73Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            a = (a * 31) + a2;
            a2 = a(a2, 0, true);
        }
        return a;
    }

    public final int a(int i, t73 t73Var, v73 v73Var, int i2, boolean z) {
        int i3 = a(i, t73Var, false).d;
        if (a(i3, v73Var, 0L).q != i) {
            return i + 1;
        }
        int a = a(i3, i2, z);
        if (a == -1) {
            return -1;
        }
        return a(a, v73Var, 0L).p;
    }

    public int b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? b(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == b(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == b(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final t73 a(int i, t73 t73Var) {
        return a(i, t73Var, false);
    }

    public t73 a(Object obj, t73 t73Var) {
        return a(a(obj), t73Var, true);
    }

    public final Pair a(v73 v73Var, t73 t73Var, int i, long j) {
        Pair a = a(v73Var, t73Var, i, j, 0L);
        a.getClass();
        return a;
    }

    public final Pair a(v73 v73Var, t73 t73Var, int i, long j, long j2) {
        ni.a(i, b());
        a(i, v73Var, j2);
        if (j == C.TIME_UNSET) {
            j = v73Var.n;
            if (j == C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = v73Var.p;
        a(i2, t73Var, false);
        while (i2 < v73Var.q && t73Var.f != j) {
            int i3 = i2 + 1;
            if (a(i3, t73Var, false).f > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, t73Var, true);
        long j3 = j - t73Var.f;
        long j4 = t73Var.e;
        if (j4 != C.TIME_UNSET) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = t73Var.c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public final v73 a(int i, v73 v73Var) {
        return a(i, v73Var, 0L);
    }
}
