package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class hqb1 {
    public static final void a(f530 f530Var, vge vgeVar, boolean z, wls wlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        bts btsVar;
        f530 f530Var3;
        int i4;
        f530 f530Var4;
        a S;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1094695403);
        int i5 = i2 & 1;
        int i6 = 4;
        if (i5 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        }
        int i7 = i3 | (btsVar2.k(vgeVar) ? 32 : 16);
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i7 |= btsVar2.e(wlsVar) ? 2048 : 1024;
        }
        int i8 = 0;
        if (btsVar2.V(i7 & 1, (i7 & 1171) != 1170)) {
            if (i5 != 0) {
                int i9 = i7;
                f530Var4 = c530.a;
                i4 = i9;
            } else {
                i4 = i7;
                f530Var4 = f530Var2;
            }
            v4v v4vVar = vgeVar.d;
            if (v4vVar == null) {
                btsVar2.e0(-383081887);
                btsVar2.t(false);
                S = null;
            } else {
                btsVar2.e0(-383081886);
                S = wwg.S(1785383827, true, new mb(v4vVar, i6), btsVar2);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(f530Var4, 0.0f, false, 0.0f, null, wlsVar, wwg.S(2077523449, true, new uge(vgeVar, z, i8), btsVar2), null, null, S, null, null, false, btsVar, (i4 & 14) | 1572864 | ((i4 << 6) & ImageMetadata.JPEG_GPS_COORDINATES), 0, 7582);
            f530Var3 = f530Var4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fo1(f530Var3, vgeVar, z, wlsVar, i, i2, 2);
        }
    }

    public static final void b(xo40 xo40Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1970050814);
        int i2 = (btsVar.k(xo40Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            int i3 = xo40Var.a;
            List list = xo40Var.d;
            List list2 = xo40Var.c;
            boolean c = btsVar.c(i3);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                int i4 = xo40Var.a;
                Q = i4 != 0 ? context.getDrawable(i4) : null;
                btsVar.o0(Q);
            }
            Drawable drawable = (Drawable) Q;
            boolean k = btsVar.k(list2);
            Object Q2 = btsVar.Q();
            Object obj = Q2;
            if (k || Q2 == o430Var) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    int i5 = ((cfl0) it.next()).a;
                    Drawable drawable2 = i5 != 0 ? context.getDrawable(i5) : null;
                    if (drawable2 != null) {
                        arrayList.add(drawable2);
                    }
                }
                btsVar.o0(arrayList);
                obj = arrayList;
            }
            List list3 = (List) obj;
            boolean k2 = btsVar.k(list);
            Object Q3 = btsVar.Q();
            Object obj2 = Q3;
            if (k2 || Q3 == o430Var) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    int i6 = ((cfl0) it2.next()).a;
                    Drawable drawable3 = i6 != 0 ? context.getDrawable(i6) : null;
                    if (drawable3 != null) {
                        arrayList2.add(drawable3);
                    }
                }
                btsVar.o0(arrayList2);
                obj2 = arrayList2;
            }
            List list4 = (List) obj2;
            btsVar.e0(-861715991);
            ArrayList arrayList3 = xo40Var.e;
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            int i7 = 0;
            for (Object obj3 : arrayList3) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    scc.m();
                    throw null;
                }
                q68 q68Var = (q68) obj3;
                btsVar.c0(1766426621, btsVar.H(q68Var.a, Integer.valueOf(i7)));
                h58 h58Var = new h58(q68Var, ffb1.f(mja1.b(q68Var.a, null, 6), btsVar, 0));
                btsVar.t(false);
                arrayList4.add(h58Var);
                i7 = i8;
                i2 = i2;
            }
            int i9 = i2;
            btsVar.t(false);
            f530 e = ljs0.e(ljs0.c(an91.m(f530Var, 16.0f, 0.0f, 2), 1.0f), 108.0f);
            boolean e2 = btsVar.e(drawable) | btsVar.e(list4) | btsVar.e(list3) | ((i9 & 14) == 4) | btsVar.k(arrayList4);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == o430Var) {
                u50 u50Var = new u50(drawable, list4, list3, xo40Var, arrayList4, 14);
                btsVar.o0(u50Var);
                Q4 = u50Var;
            }
            qeb1.a(0, btsVar, (tls) Q4, e);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(xo40Var, f530Var, i, 16);
        }
    }

    public static final void c(String str, String str2, fid fidVar, int i) {
        String str3;
        bts btsVar;
        c530 c530Var;
        bts btsVar2;
        boolean z;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(1785236623);
        int i2 = i | (btsVar3.k(str) ? 4 : 2) | (btsVar3.k(str2) ? 32 : 16);
        if (btsVar3.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 k = an91.k(c530Var2, 16.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d = b.d(btsVar3, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar3.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, d.f, a);
            qje.W(btsVar3, d.e, o);
            wls wlsVar = d.g;
            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar3, hashCode, wlsVar);
            }
            qje.W(btsVar3, d.d, d);
            if (str == null) {
                btsVar3.e0(-1626908304);
                btsVar3.t(false);
                btsVar2 = btsVar3;
                z = false;
                c530Var = c530Var2;
            } else {
                btsVar3.e0(-1626908303);
                f530 o2 = an91.o(c530Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                c530Var = c530Var2;
                Object Q = btsVar3.Q();
                if (Q == did.a) {
                    Q = new f0z0(10);
                    btsVar3.o0(Q);
                }
                ymb1.j(str, fnq0.b(o2, false, (tls) Q), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65516);
                btsVar2 = btsVar3;
                z = false;
                btsVar2.t(false);
            }
            if (str2 == null) {
                btsVar2.e0(-1626642572);
                btsVar2.t(z);
                btsVar = btsVar2;
                str3 = str2;
            } else {
                btsVar2.e0(-1626642571);
                bts btsVar4 = btsVar2;
                str3 = str2;
                ymb1.f(str3, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, Integer.MAX_VALUE, null, null, btsVar4, 48, HProv.ALG_TYPE_SECURECHANNEL, 57340);
                btsVar = btsVar4;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            str3 = str2;
            btsVar = btsVar3;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq5(str, str3, i, 13);
        }
    }

    public static final void d(qam qamVar, Drawable drawable, float f, float f2, float f3, float f4) {
        ((cot) qamVar.N().a).n(f, f2);
        try {
            drawable.setBounds(0, 0, (int) f3, (int) f4);
            i28 q = qamVar.N().q();
            Canvas canvas = t72.a;
            drawable.draw(((s72) q).a);
        } finally {
            ((cot) qamVar.N().a).n(-f, -f2);
        }
    }
}
