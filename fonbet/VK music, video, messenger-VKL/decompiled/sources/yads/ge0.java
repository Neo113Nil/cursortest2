package yads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ge0 implements yn1 {
    public final fe0 a;
    public final o30 b;
    public ae0 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public ge0(o30 o30Var, od0 od0Var) {
        this.b = o30Var;
        fe0 fe0Var = new fe0(od0Var);
        this.a = fe0Var;
        fe0Var.b(o30Var);
        this.d = C.TIME_UNSET;
        this.e = C.TIME_UNSET;
        this.f = C.TIME_UNSET;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [yads.s51] */
    @Override // yads.yn1
    public final mo a(gn1 gn1Var) {
        Uri uri;
        String str;
        String str2;
        Object obj;
        List list;
        tn2 tn2Var;
        float f;
        float f2;
        bn1 bn1Var;
        xm1 xm1Var;
        gn1 gn1Var2 = gn1Var;
        gn1Var2.c.getClass();
        String scheme = gn1Var2.c.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        bn1 bn1Var2 = gn1Var2.c;
        int a = mc3.a(bn1Var2.a, bn1Var2.b);
        fe0 fe0Var = this.a;
        yn1 yn1Var = (yn1) fe0Var.d.get(Integer.valueOf(a));
        if (yn1Var == null) {
            c63 a2 = fe0Var.a(a);
            if (a2 == null) {
                yn1Var = null;
            } else {
                yn1Var = (yn1) a2.get();
                hd0 hd0Var = fe0Var.f;
                if (hd0Var != null) {
                    yn1Var.a(hd0Var);
                }
                ae0 ae0Var = fe0Var.g;
                if (ae0Var != null) {
                    yn1Var.a(ae0Var);
                }
                fe0Var.d.put(Integer.valueOf(a), yn1Var);
            }
        }
        ni.a(yn1Var, "No suitable media source factory found for content type: " + a);
        zm1 zm1Var = gn1Var2.d;
        zm1Var.getClass();
        long j = zm1Var.b;
        long j2 = zm1Var.c;
        long j3 = zm1Var.d;
        float f3 = zm1Var.e;
        float f4 = zm1Var.f;
        zm1 zm1Var2 = gn1Var2.d;
        if (zm1Var2.b == C.TIME_UNSET) {
            j = this.d;
        }
        long j4 = j;
        if (zm1Var2.e == -3.4028235E38f) {
            f3 = this.g;
        }
        float f5 = f3;
        if (zm1Var2.f == -3.4028235E38f) {
            f4 = this.h;
        }
        float f6 = f4;
        if (zm1Var2.c == C.TIME_UNSET) {
            j2 = this.e;
        }
        long j5 = j2;
        if (zm1Var2.d == C.TIME_UNSET) {
            j3 = this.f;
        }
        zm1 zm1Var3 = new zm1(j4, j5, j3, f5, f6);
        if (!zm1Var3.equals(gn1Var2.d)) {
            wm1 wm1Var = new wm1();
            List list2 = Collections.EMPTY_LIST;
            tn2 g = s51.g();
            dn1 dn1Var = dn1.d;
            vm1 vm1Var = gn1Var2.f;
            vm1Var.getClass();
            tm1 tm1Var = new tm1(vm1Var);
            String str3 = gn1Var2.b;
            kn1 kn1Var = gn1Var2.e;
            gn1Var2.d.getClass();
            dn1 dn1Var2 = gn1Var2.g;
            bn1 bn1Var3 = gn1Var2.c;
            if (bn1Var3 != null) {
                String str4 = bn1Var3.e;
                String str5 = bn1Var3.b;
                Uri uri2 = bn1Var3.a;
                List list3 = bn1Var3.d;
                ?? r13 = bn1Var3.f;
                Object obj2 = bn1Var3.g;
                xm1 xm1Var2 = bn1Var3.c;
                if (xm1Var2 != null) {
                    str2 = str4;
                    list = list3;
                    tn2Var = r13;
                    obj = obj2;
                    wm1Var = new wm1(xm1Var2);
                } else {
                    str2 = str4;
                    list = list3;
                    tn2Var = r13;
                    obj = obj2;
                    wm1Var = new wm1();
                }
                str = str5;
                uri = uri2;
            } else {
                uri = null;
                str = null;
                str2 = null;
                obj = null;
                list = list2;
                tn2Var = g;
            }
            long j6 = zm1Var3.b;
            wm1 wm1Var2 = wm1Var;
            long j7 = zm1Var3.c;
            long j8 = zm1Var3.d;
            float f7 = zm1Var3.e;
            float f8 = zm1Var3.f;
            if (wm1Var2.b != null && wm1Var2.a == null) {
                throw new IllegalStateException();
            }
            if (uri != null) {
                f = f8;
                if (wm1Var2.a != null) {
                    f2 = f7;
                    xm1Var = new xm1(wm1Var2);
                } else {
                    f2 = f7;
                    xm1Var = null;
                }
                bn1Var = new bn1(uri, str, xm1Var, list, str2, tn2Var, obj);
            } else {
                f = f8;
                f2 = f7;
                bn1Var = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            String str6 = str3;
            vm1 vm1Var2 = new vm1(tm1Var);
            zm1 zm1Var4 = new zm1(j6, j7, j8, f2, f);
            if (kn1Var == null) {
                kn1Var = kn1.H;
            }
            gn1Var2 = new gn1(str6, vm1Var2, bn1Var, zm1Var4, kn1Var, dn1Var2);
        }
        mo a3 = yn1Var.a(gn1Var2);
        s51 s51Var = gn1Var2.c.f;
        if (!s51Var.isEmpty()) {
            mo[] moVarArr = new mo[s51Var.size() + 1];
            moVarArr[0] = a3;
            int i = 0;
            while (i < s51Var.size()) {
                o30 o30Var = this.b;
                o30Var.getClass();
                ae0 ae0Var2 = new ae0(0);
                ae0 ae0Var3 = this.c;
                if (ae0Var3 != null) {
                    ae0Var2 = ae0Var3;
                }
                int i2 = i + 1;
                moVarArr[i2] = new y03((en1) s51Var.get(i), o30Var, ae0Var2, true);
                i = i2;
            }
            a3 = new rt1(moVarArr, 0);
        }
        mo moVar = a3;
        vm1 vm1Var3 = gn1Var2.f;
        long j9 = vm1Var3.b;
        if (j9 != 0 || vm1Var3.c != Long.MIN_VALUE || vm1Var3.e) {
            long a4 = mc3.a(j9);
            long a5 = mc3.a(gn1Var2.f.c);
            vm1 vm1Var4 = gn1Var2.f;
            moVar = new wv(moVar, a4, a5, !vm1Var4.f, vm1Var4.d, vm1Var4.e);
        }
        gn1Var2.c.getClass();
        gn1Var2.c.getClass();
        return moVar;
    }

    public static yn1 a(Class cls, o30 o30Var) {
        try {
            return (yn1) cls.getConstructor(o30.class).newInstance(o30Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // yads.yn1
    public final yn1 a(hd0 hd0Var) {
        fe0 fe0Var = this.a;
        if (hd0Var != null) {
            fe0Var.f = hd0Var;
            Iterator it = fe0Var.d.values().iterator();
            while (it.hasNext()) {
                ((yn1) it.next()).a(hd0Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.yn1
    public final yn1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.c = ae0Var;
            fe0 fe0Var = this.a;
            fe0Var.g = ae0Var;
            Iterator it = fe0Var.d.values().iterator();
            while (it.hasNext()) {
                ((yn1) it.next()).a(ae0Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
