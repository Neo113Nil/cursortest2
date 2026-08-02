package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import xsna.thl0;

/* loaded from: classes10.dex */
public final class kn1 implements xq {
    public static final kn1 H = new kn1(new jn1());
    public static final wq I = new thl0(13);
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final rm2 i;
    public final rm2 j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;

    public kn1(jn1 jn1Var) {
        this.b = jn1Var.a;
        this.c = jn1Var.b;
        this.d = jn1Var.c;
        this.e = jn1Var.d;
        this.f = jn1Var.e;
        this.g = jn1Var.f;
        this.h = jn1Var.g;
        this.i = jn1Var.h;
        this.j = jn1Var.i;
        this.k = jn1Var.j;
        this.l = jn1Var.k;
        this.m = jn1Var.l;
        this.n = jn1Var.m;
        this.o = jn1Var.n;
        this.p = jn1Var.o;
        this.q = jn1Var.p;
        Integer num = jn1Var.q;
        this.r = num;
        this.s = num;
        this.t = jn1Var.r;
        this.u = jn1Var.s;
        this.v = jn1Var.t;
        this.w = jn1Var.u;
        this.x = jn1Var.v;
        this.y = jn1Var.w;
        this.z = jn1Var.x;
        this.A = jn1Var.y;
        this.B = jn1Var.z;
        this.C = jn1Var.A;
        this.D = jn1Var.B;
        this.E = jn1Var.C;
        this.F = jn1Var.D;
        this.G = jn1Var.E;
    }

    public static kn1 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        jn1 jn1Var = new jn1();
        jn1Var.a = bundle.getCharSequence(Integer.toString(0, 36));
        jn1Var.b = bundle.getCharSequence(Integer.toString(1, 36));
        jn1Var.c = bundle.getCharSequence(Integer.toString(2, 36));
        jn1Var.d = bundle.getCharSequence(Integer.toString(3, 36));
        jn1Var.e = bundle.getCharSequence(Integer.toString(4, 36));
        jn1Var.f = bundle.getCharSequence(Integer.toString(5, 36));
        jn1Var.g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer valueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        jn1Var.j = byteArray != null ? (byte[]) byteArray.clone() : null;
        jn1Var.k = valueOf;
        jn1Var.l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        jn1Var.w = bundle.getCharSequence(Integer.toString(22, 36));
        jn1Var.x = bundle.getCharSequence(Integer.toString(23, 36));
        jn1Var.y = bundle.getCharSequence(Integer.toString(24, 36));
        jn1Var.B = bundle.getCharSequence(Integer.toString(27, 36));
        jn1Var.C = bundle.getCharSequence(Integer.toString(28, 36));
        jn1Var.D = bundle.getCharSequence(Integer.toString(30, 36));
        jn1Var.E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            jn1Var.h = (rm2) rm2.b.fromBundle(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            jn1Var.i = (rm2) rm2.b.fromBundle(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            jn1Var.m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            jn1Var.n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            jn1Var.o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            jn1Var.p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            jn1Var.q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            jn1Var.r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            jn1Var.s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            jn1Var.t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            jn1Var.u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            jn1Var.v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            jn1Var.z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            jn1Var.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new kn1(jn1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kn1.class == obj.getClass()) {
            kn1 kn1Var = (kn1) obj;
            if (mc3.a(this.b, kn1Var.b) && mc3.a(this.c, kn1Var.c) && mc3.a(this.d, kn1Var.d) && mc3.a(this.e, kn1Var.e) && mc3.a(this.f, kn1Var.f) && mc3.a(this.g, kn1Var.g) && mc3.a(this.h, kn1Var.h) && mc3.a(this.i, kn1Var.i) && mc3.a(this.j, kn1Var.j) && Arrays.equals(this.k, kn1Var.k) && mc3.a(this.l, kn1Var.l) && mc3.a(this.m, kn1Var.m) && mc3.a(this.n, kn1Var.n) && mc3.a(this.o, kn1Var.o) && mc3.a(this.p, kn1Var.p) && mc3.a(this.q, kn1Var.q) && mc3.a(this.s, kn1Var.s) && mc3.a(this.t, kn1Var.t) && mc3.a(this.u, kn1Var.u) && mc3.a(this.v, kn1Var.v) && mc3.a(this.w, kn1Var.w) && mc3.a(this.x, kn1Var.x) && mc3.a(this.y, kn1Var.y) && mc3.a(this.z, kn1Var.z) && mc3.a(this.A, kn1Var.A) && mc3.a(this.B, kn1Var.B) && mc3.a(this.C, kn1Var.C) && mc3.a(this.D, kn1Var.D) && mc3.a(this.E, kn1Var.E) && mc3.a(this.F, kn1Var.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F});
    }
}
