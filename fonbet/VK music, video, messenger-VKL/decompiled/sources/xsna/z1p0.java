package xsna;

import java.util.LinkedHashSet;
import kotlin.Pair;

/* compiled from: TokenExponentialBackoff.kt */
/* loaded from: classes.dex */
public final class z1p0 {
    public static final Pair<Long, String> f = new Pair<>(0L, "");
    public final vx5 a;
    public final ag7 b;
    public final long c;
    public final tx5 d;
    public final LinkedHashSet e;

    public z1p0() {
        throw null;
    }

    public z1p0(vx5 vx5Var, long j, long j2, long j3, tx5 tx5Var, int i) {
        ag7 ag7Var = new ag7(8);
        tx5Var = (i & 64) != 0 ? new kaq(j, j2, j3) : tx5Var;
        this.a = vx5Var;
        this.b = ag7Var;
        this.c = 0L;
        this.d = tx5Var;
        this.e = new LinkedHashSet();
    }

    public final void a(String str, String str2) {
        vx5 vx5Var = this.a;
        long longValue = ((Number) this.b.invoke()).longValue();
        synchronized (vx5Var.b) {
            try {
                wx5 wx5Var = vx5Var.a.get(str);
                if (wx5Var == null) {
                    wx5Var = new wx5();
                }
                wx5Var.b++;
                wx5Var.a = longValue;
                wx5Var.c = str2;
                vx5Var.a.put(str, wx5Var);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Number) this.b.invoke()).longValue() < this.c) {
            this.e.add(str);
        }
    }

    public final Pair<Long, String> b(String str) {
        vx5 vx5Var = this.a;
        if (vx5Var.a.containsKey(str)) {
            ag7 ag7Var = this.b;
            if (((Number) ag7Var.invoke()).longValue() >= this.c || this.e.contains(str)) {
                wx5 wx5Var = vx5Var.a.get(str);
                if (wx5Var == null) {
                    wx5Var = new wx5();
                }
                long j = wx5Var.a;
                int i = wx5Var.b;
                String str2 = wx5Var.c;
                long longValue = ((Number) ag7Var.invoke()).longValue() - j;
                long a = this.d.a(i);
                if (longValue >= 0) {
                    long j2 = a - longValue;
                    return new Pair<>(Long.valueOf(j2 >= 0 ? j2 : 0L), str2);
                }
            }
        }
        return f;
    }
}
