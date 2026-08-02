package yads;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import xsna.hsi0;
import xsna.vul0;

/* loaded from: classes10.dex */
public final class v73 implements xq {
    public static final Object s = new Object();
    public static final Object t = new Object();
    public static final gn1 u;
    public static final wq v;
    public Object c;
    public Object e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public zm1 l;
    public boolean m;
    public long n;
    public long o;
    public int p;
    public int q;
    public long r;
    public Object b = s;
    public gn1 d = u;

    static {
        bn1 bn1Var;
        tm1 tm1Var = new tm1();
        wm1 wm1Var = new wm1();
        List list = Collections.EMPTY_LIST;
        tn2 tn2Var = tn2.f;
        dn1 dn1Var = dn1.d;
        Uri uri = Uri.EMPTY;
        if (wm1Var.b != null && wm1Var.a == null) {
            throw new IllegalStateException();
        }
        xm1 xm1Var = null;
        if (uri != null) {
            if (wm1Var.a != null) {
                xm1Var = new xm1(wm1Var);
            }
            bn1Var = new bn1(uri, null, xm1Var, list, null, tn2Var, null);
        } else {
            bn1Var = null;
        }
        u = new gn1("com.monetization.ads.exoplayer2.Timeline", new vm1(tm1Var), bn1Var, new zm1(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), kn1.H, dn1Var);
        v = new hsi0(7);
    }

    public static v73 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        gn1 gn1Var = bundle2 != null ? (gn1) gn1.h.fromBundle(bundle2) : null;
        long j = bundle.getLong(Integer.toString(2, 36), C.TIME_UNSET);
        long j2 = bundle.getLong(Integer.toString(3, 36), C.TIME_UNSET);
        long j3 = bundle.getLong(Integer.toString(4, 36), C.TIME_UNSET);
        boolean z = bundle.getBoolean(Integer.toString(5, 36), false);
        boolean z2 = bundle.getBoolean(Integer.toString(6, 36), false);
        Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
        zm1 zm1Var = bundle3 != null ? (zm1) zm1.h.fromBundle(bundle3) : null;
        boolean z3 = bundle.getBoolean(Integer.toString(8, 36), false);
        long j4 = bundle.getLong(Integer.toString(9, 36), 0L);
        long j5 = bundle.getLong(Integer.toString(10, 36), C.TIME_UNSET);
        int i = bundle.getInt(Integer.toString(11, 36), 0);
        int i2 = bundle.getInt(Integer.toString(12, 36), 0);
        long j6 = bundle.getLong(Integer.toString(13, 36), 0L);
        v73 v73Var = new v73();
        v73Var.a(t, gn1Var, null, j, j2, j3, z, z2, zm1Var, j4, j5, i, i2, j6);
        v73Var.m = z3;
        return v73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v73.class.equals(obj.getClass())) {
            v73 v73Var = (v73) obj;
            if (mc3.a(this.b, v73Var.b) && mc3.a(this.d, v73Var.d) && mc3.a(this.e, v73Var.e) && mc3.a(this.l, v73Var.l) && this.f == v73Var.f && this.g == v73Var.g && this.h == v73Var.h && this.i == v73Var.i && this.j == v73Var.j && this.m == v73Var.m && this.n == v73Var.n && this.o == v73Var.o && this.p == v73Var.p && this.q == v73Var.q && this.r == v73Var.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + vul0.a(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 31, this.b)) * 31;
        Object obj = this.e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        zm1 zm1Var = this.l;
        int hashCode3 = (hashCode2 + (zm1Var != null ? zm1Var.hashCode() : 0)) * 31;
        long j = this.f;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
        long j4 = this.n;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.o;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.p) * 31) + this.q) * 31;
        long j6 = this.r;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final boolean a() {
        boolean z = this.k;
        zm1 zm1Var = this.l;
        if (z == (zm1Var != null)) {
            return zm1Var != null;
        }
        throw new IllegalStateException();
    }

    public final v73 a(Object obj, gn1 gn1Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zm1 zm1Var, long j4, long j5, int i, int i2, long j6) {
        bn1 bn1Var;
        this.b = obj;
        this.d = gn1Var != null ? gn1Var : u;
        this.c = (gn1Var == null || (bn1Var = gn1Var.c) == null) ? null : bn1Var.g;
        this.e = obj2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = z;
        this.j = z2;
        this.k = zm1Var != null;
        this.l = zm1Var;
        this.n = j4;
        this.o = j5;
        this.p = i;
        this.q = i2;
        this.r = j6;
        this.m = false;
        return this;
    }
}
