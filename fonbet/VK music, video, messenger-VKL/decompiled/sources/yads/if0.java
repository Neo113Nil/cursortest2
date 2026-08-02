package yads;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import xsna.iyc;
import xsna.sff;
import xsna.w0z0;
import xsna.w8m0;
import xsna.x0z0;
import xsna.y0z0;
import xsna.z0z0;

/* loaded from: classes10.dex */
public final class if0 extends nj1 {
    public static final tb2 i = new ey(new z0z0());
    public static final tb2 j = new ey(new w8m0(2));
    public final Object c;
    public final op0 d;
    public final boolean e;
    public final af0 f;
    public final df0 g;
    public pk h;

    public if0(Context context, af0 af0Var, dc dcVar) {
        this(af0Var, dcVar, context);
    }

    public static boolean a(boolean z, int i2) {
        int i3 = i2 & 7;
        if (i3 != 4) {
            return z && i3 == 3;
        }
        return true;
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public if0(af0 af0Var, dc dcVar, Context context) {
        this.c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.d = dcVar;
        this.f = af0Var;
        this.h = pk.h;
        boolean z = context != null && mc3.d(context);
        this.e = z;
        if (!z && context != null && mc3.a >= 32) {
            this.g = df0.a(context);
        }
        if (af0Var.L && context == null) {
            ji1.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(m83 m83Var, af0 af0Var, HashMap hashMap) {
        s83 s83Var;
        for (int i2 = 0; i2 < m83Var.b; i2++) {
            s83 s83Var2 = (s83) af0Var.z.get(m83Var.a(i2));
            if (s83Var2 != null && ((s83Var = (s83) hashMap.get(Integer.valueOf(s83Var2.b.d))) == null || (s83Var.c.isEmpty() && !s83Var2.c.isEmpty()))) {
                hashMap.put(Integer.valueOf(s83Var2.b.d), s83Var2);
            }
        }
    }

    public final void b() {
        boolean z;
        v83 v83Var;
        df0 df0Var;
        synchronized (this.c) {
            try {
                z = this.f.L && !this.e && mc3.a >= 32 && (df0Var = this.g) != null && df0Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (v83Var = this.a) == null) {
            return;
        }
        ((ho0) v83Var).i.a.sendEmptyMessage(10);
    }

    public static int a(nx0 nx0Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(nx0Var.d)) {
            return 4;
        }
        String b = b(str);
        String b2 = b(nx0Var.d);
        if (b2 == null || b == null) {
            return (z && b2 == null) ? 1 : 0;
        }
        if (b2.startsWith(b) || b.startsWith(b2)) {
            return 3;
        }
        int i2 = mc3.a;
        return b2.split("-", 2)[0].equals(b.split("-", 2)[0]) ? 2 : 0;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static int a(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r1.b != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        if (r1.equals("audio/ac4") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(nx0 nx0Var) {
        boolean z;
        df0 df0Var;
        synchronized (this.c) {
            try {
                z = true;
                if (this.f.L && !this.e) {
                    char c = 2;
                    if (nx0Var.z > 2) {
                        String str = nx0Var.m;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 187078296:
                                    if (str.equals(MimeTypes.AUDIO_AC3)) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 187078297:
                                    break;
                                case 1504578661:
                                    if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    if (mc3.a >= 32) {
                                        df0 df0Var2 = this.g;
                                        if (df0Var2 != null) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (mc3.a >= 32 || (df0Var = this.g) == null || !df0Var.b || !df0Var.a() || !this.g.b() || !this.g.a(nx0Var, this.h)) {
                                        z = false;
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        }
                        if (mc3.a >= 32) {
                        }
                        z = false;
                    }
                }
            } finally {
            }
        }
        return z;
    }

    public final List a(af0 af0Var, boolean z, int i2, l83 l83Var, int[] iArr) {
        ph2 ph2Var = new ph2() { // from class: xsna.a1z0
            @Override // yads.ph2
            public final boolean apply(Object obj) {
                return yads.if0.this.a((yads.nx0) obj);
            }
        };
        p51 p51Var = s51.c;
        kx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = 0;
        int i4 = 0;
        while (i3 < l83Var.b) {
            af0 af0Var2 = af0Var;
            boolean z2 = z;
            int i5 = i2;
            l83 l83Var2 = l83Var;
            xe0 xe0Var = new xe0(i5, l83Var2, i3, af0Var2, iArr[i3], z2, ph2Var);
            int i6 = i4 + 1;
            if (objArr.length < i6) {
                objArr = Arrays.copyOf(objArr, l51.a(objArr.length, i6));
            }
            objArr[i4] = xe0Var;
            i3++;
            i4 = i6;
            i2 = i5;
            l83Var = l83Var2;
            af0Var = af0Var2;
            z = z2;
        }
        return s51.b(i4, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(af0 af0Var, int[] iArr, int i2, l83 l83Var, int[] iArr2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        Point point;
        int i7;
        int i8;
        af0 af0Var2 = af0Var;
        l83 l83Var2 = l83Var;
        int i9 = iArr[i2];
        int i10 = af0Var2.j;
        int i11 = af0Var2.k;
        boolean z2 = af0Var2.l;
        if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
            z = true;
            i3 = Integer.MAX_VALUE;
        } else {
            int i12 = Integer.MAX_VALUE;
            for (int i13 = 0; i13 < l83Var2.b; i13++) {
                nx0 nx0Var = l83Var2.e[i13];
                int i14 = nx0Var.r;
                if (i14 > 0 && (i4 = nx0Var.s) > 0) {
                    if (z2) {
                        if ((i14 > i4) != (i10 > i11)) {
                            i6 = i10;
                            i5 = i11;
                            if (i14 * i6 < i4 * i5) {
                                int i15 = mc3.a;
                                point = new Point(i5, ((r9 + i14) - 1) / i14);
                            } else {
                                int i16 = mc3.a;
                                point = new Point(((r8 + i4) - 1) / i4, i6);
                            }
                            i7 = nx0Var.r;
                            int i17 = nx0Var.s;
                            i8 = i7 * i17;
                            if (i7 >= ((int) (point.x * 0.98f)) && i17 >= ((int) (point.y * 0.98f)) && i8 < i12) {
                                i12 = i8;
                            }
                        }
                    }
                    i5 = i10;
                    i6 = i11;
                    if (i14 * i6 < i4 * i5) {
                    }
                    i7 = nx0Var.r;
                    int i172 = nx0Var.s;
                    i8 = i7 * i172;
                    if (i7 >= ((int) (point.x * 0.98f))) {
                        i12 = i8;
                    }
                }
            }
            z = true;
            i3 = i12;
        }
        kx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i18 = 0;
        int i19 = 0;
        while (i18 < l83Var2.b) {
            int a = l83Var2.e[i18].a();
            hf0 hf0Var = new hf0(i2, l83Var2, i18, af0Var2, iArr2[i18], i9, (i3 == Integer.MAX_VALUE || (a != -1 && a <= i3)) ? z : false);
            int i20 = i19 + 1;
            if (objArr.length < i20) {
                objArr = Arrays.copyOf(objArr, l51.a(objArr.length, i20));
            }
            objArr[i19] = hf0Var;
            i18++;
            af0Var2 = af0Var;
            l83Var2 = l83Var;
            i19 = i20;
        }
        return s51.b(i19, objArr);
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @Override // yads.w83
    public final void a() {
        df0 df0Var;
        synchronized (this.c) {
            try {
                if (mc3.a >= 32 && (df0Var = this.g) != null) {
                    df0Var.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }

    public final Pair a(mj1 mj1Var, int[][][] iArr, final af0 af0Var) {
        final boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < mj1Var.a) {
                if (2 == mj1Var.b[i2] && mj1Var.c[i2].b > 0) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return a(1, mj1Var, iArr, new ff0() { // from class: xsna.v0z0
            @Override // yads.ff0
            public final List a(int i3, yads.l83 l83Var, int[] iArr2) {
                return yads.if0.this.a(af0Var, z, i3, l83Var, iArr2);
            }
        }, new w0z0());
    }

    public static Pair a(mj1 mj1Var, int[][][] iArr, af0 af0Var, String str) {
        return a(3, mj1Var, iArr, new iyc(af0Var, str), new y0z0());
    }

    public static Pair a(int i2, mj1 mj1Var, int[][][] iArr, ff0 ff0Var, Comparator comparator) {
        int i3;
        RandomAccess randomAccess;
        mj1 mj1Var2 = mj1Var;
        ArrayList arrayList = new ArrayList();
        int i4 = mj1Var2.a;
        int i5 = 0;
        while (i5 < i4) {
            if (i2 == mj1Var2.b[i5]) {
                m83 m83Var = mj1Var2.c[i5];
                for (int i6 = 0; i6 < m83Var.b; i6++) {
                    l83 a = m83Var.a(i6);
                    List a2 = ff0Var.a(i5, a, iArr[i5][i6]);
                    boolean[] zArr = new boolean[a.b];
                    int i7 = 0;
                    while (i7 < a.b) {
                        gf0 gf0Var = (gf0) a2.get(i7);
                        int a3 = gf0Var.a();
                        if (zArr[i7] || a3 == 0) {
                            i3 = i4;
                        } else {
                            if (a3 == 1) {
                                randomAccess = s51.a(gf0Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gf0Var);
                                int i8 = i7 + 1;
                                while (i8 < a.b) {
                                    gf0 gf0Var2 = (gf0) a2.get(i8);
                                    int i9 = i4;
                                    if (gf0Var2.a() == 2 && gf0Var.a(gf0Var2)) {
                                        arrayList2.add(gf0Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i4 = i9;
                                }
                                randomAccess = arrayList2;
                            }
                            i3 = i4;
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i4 = i3;
                    }
                }
            }
            i5++;
            mj1Var2 = mj1Var;
            i4 = i4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((gf0) list.get(i10)).d;
        }
        gf0 gf0Var3 = (gf0) list.get(0);
        return Pair.create(new np0(0, gf0Var3.c, iArr2), Integer.valueOf(gf0Var3.b));
    }

    public static Pair a(mj1 mj1Var, int[][][] iArr, int[] iArr2, af0 af0Var) {
        return a(2, mj1Var, iArr, new sff(af0Var, iArr2), new x0z0());
    }

    @Override // yads.w83
    public final void a(pk pkVar) {
        boolean equals;
        synchronized (this.c) {
            equals = this.h.equals(pkVar);
            this.h = pkVar;
        }
        if (equals) {
            return;
        }
        b();
    }

    public static List a(af0 af0Var, String str, int i2, l83 l83Var, int[] iArr) {
        p51 p51Var = s51.c;
        kx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = 0;
        int i4 = 0;
        while (i3 < l83Var.b) {
            af0 af0Var2 = af0Var;
            String str2 = str;
            int i5 = i2;
            l83 l83Var2 = l83Var;
            ef0 ef0Var = new ef0(i5, l83Var2, i3, af0Var2, iArr[i3], str2);
            int i6 = i4 + 1;
            if (objArr.length < i6) {
                objArr = Arrays.copyOf(objArr, l51.a(objArr.length, i6));
            }
            objArr[i4] = ef0Var;
            i3++;
            i4 = i6;
            i2 = i5;
            l83Var = l83Var2;
            af0Var = af0Var2;
            str = str2;
        }
        return s51.b(i4, objArr);
    }
}
