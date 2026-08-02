package yads;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import xsna.kft0;

/* loaded from: classes10.dex */
public final class t73 implements xq {
    public static final wq i = new kft0(4);
    public Object b;
    public Object c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public e6 h = e6.h;

    public static t73 a(Bundle bundle) {
        int i2 = bundle.getInt(Integer.toString(0, 36), 0);
        long j = bundle.getLong(Integer.toString(1, 36), C.TIME_UNSET);
        long j2 = bundle.getLong(Integer.toString(2, 36), 0L);
        boolean z = bundle.getBoolean(Integer.toString(3, 36));
        Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
        e6 e6Var = bundle2 != null ? (e6) e6.j.fromBundle(bundle2) : e6.h;
        t73 t73Var = new t73();
        t73Var.a(null, null, i2, j, j2, e6Var, z);
        return t73Var;
    }

    public final int b(long j) {
        int i2;
        e6 e6Var = this.h;
        long j2 = this.e;
        int i3 = e6Var.c - 1;
        while (i3 >= 0 && j != Long.MIN_VALUE) {
            long j3 = e6Var.a(i3).b;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i3--;
            } else {
                if (j2 != C.TIME_UNSET && j >= j2) {
                    break;
                }
                i3--;
            }
        }
        if (i3 >= 0) {
            d6 a = e6Var.a(i3);
            if (a.c != -1) {
                while (i2 < a.c) {
                    int i4 = a.e[i2];
                    i2 = (i4 == 0 || i4 == 1) ? 0 : i2 + 1;
                }
            }
            return i3;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t73.class.equals(obj.getClass())) {
            t73 t73Var = (t73) obj;
            if (mc3.a(this.b, t73Var.b) && mc3.a(this.c, t73Var.c) && this.d == t73Var.d && this.e == t73Var.e && this.f == t73Var.f && this.g == t73Var.g && mc3.a(this.h, t73Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31;
        Object obj2 = this.c;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.d) * 31;
        long j = this.e;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        return this.h.hashCode() + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31);
    }

    public final long a(int i2, int i3) {
        d6 a = this.h.a(i2);
        return a.c != -1 ? a.f[i3] : C.TIME_UNSET;
    }

    public final int a(long j) {
        e6 e6Var = this.h;
        long j2 = this.e;
        e6Var.getClass();
        if (j != Long.MIN_VALUE && (j2 == C.TIME_UNSET || j < j2)) {
            int i2 = e6Var.f;
            while (i2 < e6Var.c) {
                if (e6Var.a(i2).b == Long.MIN_VALUE || e6Var.a(i2).b > j) {
                    d6 a = e6Var.a(i2);
                    if (a.c == -1 || a.a(-1) < a.c) {
                        break;
                    }
                }
                i2++;
            }
            if (i2 < e6Var.c) {
                return i2;
            }
        }
        return -1;
    }

    public final int a(int i2) {
        return this.h.a(i2).a(-1);
    }

    public final long a() {
        return this.f;
    }

    public final t73 a(Object obj, Object obj2, int i2, long j, long j2, e6 e6Var, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.h = e6Var;
        this.g = z;
        return this;
    }
}
