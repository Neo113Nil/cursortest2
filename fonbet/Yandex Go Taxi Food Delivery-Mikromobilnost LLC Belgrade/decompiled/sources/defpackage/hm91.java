package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ybsdk.widgets.common.PinCodeDotsView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.tickets.c;

/* loaded from: classes11.dex */
public abstract class hm91 {
    public static au2 a;

    public static final void a(int i, fid fidVar, tls tlsVar, tls tlsVar2, j940 j940Var, c cVar) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1406929922);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(j940Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.k(cVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            k3r k3rVar = ljs0.c;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            wp2 wp2Var = j940Var.b;
            if (wp2Var == null) {
                btsVar.e0(527154709);
            } else {
                btsVar.e0(527154710);
                c(wp2Var, btsVar, 0);
            }
            btsVar.t(false);
            f530 d3 = i9a1.d(k3rVar);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, d3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d4);
            String str = j940Var.c;
            if (str == null) {
                str = "";
            }
            String str2 = j940Var.d;
            if (str2 == null) {
                str2 = "";
            }
            b(str, str2, j940Var.a, tlsVar, btsVar, (i2 << 6) & 7168);
            com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.c.a((i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i2 & 7168), btsVar, tlsVar, tlsVar2, j940Var, cVar);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) j940Var, tlsVar, (Object) cVar, (Object) tlsVar2, i, 19);
        }
    }

    public static final void b(String str, String str2, String str3, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-288198426);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            crb1.a(an91.o(c530.a, 0.0f, 24.0f, 0.0f, 0.0f, 13), wwg.S(202498152, true, new sg0(22, tlsVar), btsVar), null, wwg.S(701054954, true, new kq5(str, str2, 8), btsVar), null, wwg.S(1199611756, true, new hp30(str3, tlsVar), btsVar), null, btsVar, 199734, 84);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(str, str2, str3, tlsVar, i, 17);
        }
    }

    public static final void c(wp2 wp2Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(379874549);
        int i2 = (btsVar.k(wp2Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            long n = tje.n(wp2Var, btsVar);
            pi6.a(m4m0.a(ljs0.c(c530.a, 1.0f).k(ljs0.b), zoy0.H(new Pair[]{new Pair(Float.valueOf(0.0f), new ldc(ldc.b(n, 0.6f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.3f), new ldc(ldc.b(n, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new ldc(ldc.l))}, ((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).screenHeightDp, 8), null, 6), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sc20(wp2Var, i, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(String str) {
        boolean z;
        un2 un2Var = qp41.a;
        Set<un2> unmodifiableSet = Collections.unmodifiableSet(un2.d);
        HashSet hashSet = new HashSet();
        for (un2 un2Var2 : unmodifiableSet) {
            if (un2Var2.a.equals(str)) {
                hashSet.add(un2Var2);
            }
        }
        if (hashSet.isEmpty()) {
            kbs.g(g8e.o("Unknown feature ", str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            un2 un2Var3 = (un2) it.next();
            switch (un2Var3.c) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                    z = true;
                    break;
                case 2:
                    z = false;
                    break;
            }
            if (z || un2Var3.a()) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context, String str) {
        un2 un2Var = qp41.a;
        Set<u2u0> unmodifiableSet = Collections.unmodifiableSet(u2u0.d);
        HashSet hashSet = new HashSet();
        for (u2u0 u2u0Var : unmodifiableSet) {
            if (u2u0Var.a.equals(str)) {
                hashSet.add(u2u0Var);
            }
        }
        if (hashSet.isEmpty()) {
            kbs.g(g8e.o("Unknown feature ", str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((u2u0) it.next()).a(context)) {
                return true;
            }
        }
        return false;
    }

    public static final void f(PinCodeDotsView pinCodeDotsView, nwb0 nwb0Var, sls slsVar, sls slsVar2) {
        int i = vvb0.a[nwb0Var.b.ordinal()];
        if (i == 1) {
            PinCodeDotsView.showSymbols$default(pinCodeDotsView, nwb0Var.a, null, 2, null);
            return;
        }
        if (i == 2) {
            pinCodeDotsView.showError(slsVar2);
            return;
        }
        if (i == 3) {
            pinCodeDotsView.showLoading();
        } else if (i == 4) {
            pinCodeDotsView.showSuccess(slsVar);
        } else {
            w511.b();
        }
    }
}
