package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class h6u0 {
    public static final void a(String str, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-33862010);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            z2d.a.getClass();
            a aVar = z2d.b;
            c530 c530Var = c530.a;
            f530 n = ljs0.n(c530Var, 24.0f, 30.0f);
            z910 d = pi6.d(x4c.c, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, n);
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
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            o4b1.b(mt71.m(q2h0.ic_user_location_pin, 0, btsVar), null, ljs0.c, null, null, 0.0f, null, btsVar, 440, 120);
            f530 m = ljs0.m(an91.o(c530Var, 0.0f, 1.5f, 0.0f, 0.0f, 13), 21.0f);
            byk0 byk0Var = cyk0.a;
            f530 b = m4m0.b(ymb1.l(m, byk0Var), tje.n(AppColor$Palette.Background, btsVar), qke.q);
            z910 d3 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            i2 = 6;
            v0b1.a(mja1.b(str, null, 6), ymb1.l(ljs0.m(c530Var, 18.0f), byk0Var), null, aVar, aVar, null, null, mhe.a, 0.0f, 0, btsVar, 12610944, 864);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            i2 = 6;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, i2);
        }
    }

    public static final void b(h611 h611Var, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-857682997);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(h611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-473557498);
            d(h611Var, f530Var, null, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(-473502938);
            c(h611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(h611Var, f530Var, z, i, 0);
        }
    }

    public static final void c(h611 h611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-846054646);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(h611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i4 = 0;
        int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean e = btsVar.e(h611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ij5(h611Var, 1);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(c, (tls) Q), wwg.S(-218821472, true, new lj5(h611Var, i5), btsVar), wwg.S(-538564773, true, new lj5(h611Var, i3), btsVar), null, wwg.S(-1972923627, true, new lj5(h611Var, 3), btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(h611Var, f530Var, i, i4);
        }
    }

    public static final void d(h611 h611Var, f530 f530Var, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1842168061);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(h611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ety0Var3 = xya1.d(btsVar).f.c;
            } else {
                btsVar.Y();
                ety0Var3 = ety0Var;
            }
            btsVar.u();
            String str = h611Var.b;
            boolean e = btsVar.e(h611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ij5(h611Var, 0);
                btsVar.o0(Q);
            }
            a5l0.d(str, fnq0.a(f530Var, (tls) Q), 0.0f, 0.0f, null, 0.0f, ety0Var3, null, wwg.S(-345180215, true, new lj5(h611Var, i3), btsVar), wwg.S(975904499, true, new q0v(18, h611Var, ety0Var3), btsVar), btsVar, 905969664, 188);
            ety0Var2 = ety0Var3;
        } else {
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) h611Var, f530Var, (Object) ety0Var2, i, 14);
        }
    }

    public static final void e(h611 h611Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(499220235);
        int i2 = (btsVar.e(h611Var) ? 4 : 2) | i;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            String str = h611Var.e;
            if (str != null) {
                btsVar.e0(-1201600603);
                a(str, btsVar, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(-1201545392);
                g(h611Var, btsVar, i2 & 14);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jj5(h611Var, i, i3);
        }
    }

    public static final void f(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1788819303);
        if (btsVar.V(i & 1, i != 0)) {
            o4b1.b(mt71.m(q2h0.ic_user_location_default, 0, btsVar), null, ljs0.m(c530.a, 21.0f), null, null, 0.0f, null, btsVar, 440, 120);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zbd(i, 29);
        }
    }

    public static final void g(h611 h611Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(786446242);
        int i2 = (btsVar.e(h611Var) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 b = m4m0.b(ymb1.l(ljs0.m(c530.a, 36.0f), cyk0.a), tje.n(AppColor$Palette.ControlMinor, btsVar), qke.q);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            xtb1.a(h611Var.c, h611Var.d, Integer.valueOf(rzo.X(tje.n(AppColor$Palette.TextMinor, btsVar))), null, btsVar, 0, 8);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jj5(h611Var, i, i3);
        }
    }

    public static final int h(Context context, Uri uri, String str, String[] strArr) {
        return context.getContentResolver().delete(uri, str, strArr);
    }

    public static final int i(s890 s890Var) {
        return (int) (s890Var.e == Orientation.Vertical ? s890Var.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : s890Var.e() >> 32);
    }

    public static final List j(Context context, Uri uri, String str, String[] strArr, String str2, tls tlsVar) {
        Cursor query = context.getContentResolver().query(uri, null, str, strArr, str2);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    ArrayList arrayList = new ArrayList();
                    do {
                        arrayList.add(tlsVar.invoke(query));
                    } while (query.moveToNext());
                    query.close();
                    return arrayList;
                }
            } finally {
            }
        }
        List list = Collections.EMPTY_LIST;
        if (query != null) {
            query.close();
        }
        return list;
    }

    public static final Calendar k(com.yandex.div.evaluable.types.a aVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(aVar.b);
        calendar.setTimeInMillis(aVar.a);
        return calendar;
    }

    public static final cg21 l(Uri uri) {
        return yri0.g(uri.toString());
    }

    public static final synchronized void m(Context context, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        synchronized (h6u0.class) {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver.update(uri, contentValues, str, strArr) == 0) {
                contentResolver.insert(uri, contentValues);
            }
        }
    }
}
