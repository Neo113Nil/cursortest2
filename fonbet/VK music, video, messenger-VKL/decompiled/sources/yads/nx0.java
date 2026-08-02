package yads;

import android.os.Bundle;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.g7r0;
import xsna.h5s;

/* loaded from: classes10.dex */
public final class nx0 implements xq {
    public static final nx0 H = new nx0(new mx0());
    public static final wq I = new g7r0(6);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public int G;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final ut1 k;
    public final String l;
    public final String m;
    public final int n;
    public final List o;
    public final lk0 p;
    public final long q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    public final byte[] w;
    public final int x;
    public final mx y;
    public final int z;

    public nx0(mx0 mx0Var) {
        this.b = mx0Var.a;
        this.c = mx0Var.b;
        this.d = mc3.e(mx0Var.c);
        this.e = mx0Var.d;
        this.f = mx0Var.e;
        int i = mx0Var.f;
        this.g = i;
        int i2 = mx0Var.g;
        this.h = i2;
        this.i = i2 != -1 ? i2 : i;
        this.j = mx0Var.h;
        this.k = mx0Var.i;
        this.l = mx0Var.j;
        this.m = mx0Var.k;
        this.n = mx0Var.l;
        List list = mx0Var.m;
        this.o = list == null ? Collections.EMPTY_LIST : list;
        lk0 lk0Var = mx0Var.n;
        this.p = lk0Var;
        this.q = mx0Var.o;
        this.r = mx0Var.p;
        this.s = mx0Var.q;
        this.t = mx0Var.r;
        int i3 = mx0Var.s;
        this.u = i3 == -1 ? 0 : i3;
        float f = mx0Var.t;
        this.v = f == -1.0f ? 1.0f : f;
        this.w = mx0Var.u;
        this.x = mx0Var.v;
        this.y = mx0Var.w;
        this.z = mx0Var.x;
        this.A = mx0Var.y;
        this.B = mx0Var.z;
        int i4 = mx0Var.A;
        this.C = i4 == -1 ? 0 : i4;
        int i5 = mx0Var.B;
        this.D = i5 != -1 ? i5 : 0;
        this.E = mx0Var.C;
        int i6 = mx0Var.D;
        if (i6 != 0 || lk0Var == null) {
            this.F = i6;
        } else {
            this.F = 1;
        }
    }

    public final int a() {
        int i;
        int i2 = this.r;
        if (i2 == -1 || (i = this.s) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && nx0.class == obj.getClass()) {
            nx0 nx0Var = (nx0) obj;
            int i2 = this.G;
            if ((i2 == 0 || (i = nx0Var.G) == 0 || i2 == i) && this.e == nx0Var.e && this.f == nx0Var.f && this.g == nx0Var.g && this.h == nx0Var.h && this.n == nx0Var.n && this.q == nx0Var.q && this.r == nx0Var.r && this.s == nx0Var.s && this.u == nx0Var.u && this.x == nx0Var.x && this.z == nx0Var.z && this.A == nx0Var.A && this.B == nx0Var.B && this.C == nx0Var.C && this.D == nx0Var.D && this.E == nx0Var.E && this.F == nx0Var.F && Float.compare(this.t, nx0Var.t) == 0 && Float.compare(this.v, nx0Var.v) == 0 && mc3.a(this.b, nx0Var.b) && mc3.a(this.c, nx0Var.c) && mc3.a(this.j, nx0Var.j) && mc3.a(this.l, nx0Var.l) && mc3.a(this.m, nx0Var.m) && mc3.a(this.d, nx0Var.d) && Arrays.equals(this.w, nx0Var.w) && mc3.a(this.k, nx0Var.k) && mc3.a(this.y, nx0Var.y) && mc3.a(this.p, nx0Var.p) && a(nx0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.G == 0) {
            String str = this.b;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ut1 ut1Var = this.k;
            int hashCode5 = (hashCode4 + (ut1Var == null ? 0 : Arrays.hashCode(ut1Var.b))) * 31;
            String str5 = this.l;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.m;
            this.G = ((((((((((((((((Float.floatToIntBits(this.v) + ((((Float.floatToIntBits(this.t) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.n) * 31) + ((int) this.q)) * 31) + this.r) * 31) + this.s) * 31)) * 31) + this.u) * 31)) * 31) + this.x) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.r);
        sb.append(", ");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.t);
        sb.append("], [");
        sb.append(this.z);
        sb.append(", ");
        return h5s.c(this.A, "])", sb);
    }

    public final boolean a(nx0 nx0Var) {
        if (this.o.size() != nx0Var.o.size()) {
            return false;
        }
        for (int i = 0; i < this.o.size(); i++) {
            if (!Arrays.equals((byte[]) this.o.get(i), (byte[]) nx0Var.o.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static nx0 a(Bundle bundle) {
        mx0 mx0Var = new mx0();
        if (bundle != null) {
            ClassLoader classLoader = yq.class.getClassLoader();
            int i = mc3.a;
            bundle.setClassLoader(classLoader);
        }
        int i2 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        nx0 nx0Var = H;
        String str = nx0Var.b;
        if (string == null) {
            string = str;
        }
        mx0Var.a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = nx0Var.c;
        if (string2 == null) {
            string2 = str2;
        }
        mx0Var.b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = nx0Var.d;
        if (string3 == null) {
            string3 = str3;
        }
        mx0Var.c = string3;
        mx0Var.d = bundle.getInt(Integer.toString(3, 36), nx0Var.e);
        mx0Var.e = bundle.getInt(Integer.toString(4, 36), nx0Var.f);
        mx0Var.f = bundle.getInt(Integer.toString(5, 36), nx0Var.g);
        mx0Var.g = bundle.getInt(Integer.toString(6, 36), nx0Var.h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = nx0Var.j;
        if (string4 == null) {
            string4 = str4;
        }
        mx0Var.h = string4;
        ut1 ut1Var = (ut1) bundle.getParcelable(Integer.toString(8, 36));
        ut1 ut1Var2 = nx0Var.k;
        if (ut1Var == null) {
            ut1Var = ut1Var2;
        }
        mx0Var.i = ut1Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = nx0Var.l;
        if (string5 == null) {
            string5 = str5;
        }
        mx0Var.j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = nx0Var.m;
        if (string6 == null) {
            string6 = str6;
        }
        mx0Var.k = string6;
        mx0Var.l = bundle.getInt(Integer.toString(11, 36), nx0Var.n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + BundleUtil.UNDERLINE_TAG + Integer.toString(i2, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i2++;
        }
        mx0Var.m = arrayList;
        mx0Var.n = (lk0) bundle.getParcelable(Integer.toString(13, 36));
        String num = Integer.toString(14, 36);
        nx0 nx0Var2 = H;
        mx0Var.o = bundle.getLong(num, nx0Var2.q);
        mx0Var.p = bundle.getInt(Integer.toString(15, 36), nx0Var2.r);
        mx0Var.q = bundle.getInt(Integer.toString(16, 36), nx0Var2.s);
        mx0Var.r = bundle.getFloat(Integer.toString(17, 36), nx0Var2.t);
        mx0Var.s = bundle.getInt(Integer.toString(18, 36), nx0Var2.u);
        mx0Var.t = bundle.getFloat(Integer.toString(19, 36), nx0Var2.v);
        mx0Var.u = bundle.getByteArray(Integer.toString(20, 36));
        mx0Var.v = bundle.getInt(Integer.toString(21, 36), nx0Var2.x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            mx0Var.w = (mx) mx.g.fromBundle(bundle2);
        }
        mx0Var.x = bundle.getInt(Integer.toString(23, 36), nx0Var2.z);
        mx0Var.y = bundle.getInt(Integer.toString(24, 36), nx0Var2.A);
        mx0Var.z = bundle.getInt(Integer.toString(25, 36), nx0Var2.B);
        mx0Var.A = bundle.getInt(Integer.toString(26, 36), nx0Var2.C);
        mx0Var.B = bundle.getInt(Integer.toString(27, 36), nx0Var2.D);
        mx0Var.C = bundle.getInt(Integer.toString(28, 36), nx0Var2.E);
        mx0Var.D = bundle.getInt(Integer.toString(29, 36), nx0Var2.F);
        return new nx0(mx0Var);
    }
}
