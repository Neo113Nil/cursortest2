package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class epa1 {
    public static au2 a;

    public static final void a(String str, String str2, String str3, String str4, AddressMapPickerPointType addressMapPickerPointType, tls tlsVar, zls zlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-836615693);
        int i2 = 0;
        int i3 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.k(str3) ? 256 : 128) | (btsVar.k(str4) ? 2048 : 1024) | (btsVar.c(addressMapPickerPointType.ordinal()) ? 16384 : 8192) | (btsVar.a(false) ? 131072 : 65536) | (btsVar.e(tlsVar) ? 1048576 : 524288);
        if (btsVar.V(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                hk2 hk2Var = new hk2(0);
                hk2Var.d(str);
                n6b1.a(hk2Var, "chevron_right", "�");
                Q = hk2Var.i();
                btsVar.o0(Q);
            }
            kk2 kk2Var = (kk2) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                r3c0 r3c0Var = new r3c0(7, uh6.E(12), uh6.E(12));
                k2d.a.getClass();
                Q2 = gw00.e(new Pair("chevron_right", new oxv(r3c0Var, k2d.b)));
                btsVar.o0(Q2);
            }
            Map map = (Map) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = ly3.i(btsVar);
            }
            btsVar.e0(78368243);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new teb(20);
                btsVar.o0(Q4);
            }
            f530 b = fnq0.b(c530.a, true, (tls) Q4);
            btsVar.t(false);
            ydb1.a(b, wwg.S(1185680413, true, new b91(zlsVar, i2), btsVar), wwg.S(-871258814, true, new qk30(kk2Var, map, str2, str), btsVar), null, wwg.S(2017394632, true, new qk30(3, str3, tlsVar, str4), btsVar), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(str, str2, str3, str4, addressMapPickerPointType, tlsVar, zlsVar, i, 1);
        }
    }

    public static final void b(z7k0 z7k0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2062595750);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(z7k0Var) : btsVar.e(z7k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wx20.a(null, null, null, null, null, false, false, wwg.S(1743275446, true, new o990(19, z7k0Var, tlsVar), btsVar), btsVar, 12582912, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(z7k0Var, tlsVar, i, 17);
        }
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Flashlight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        long j = iq2.g;
        a6t0 a6t0Var = new a6t0(j);
        uq90 uq90Var = new uq90();
        uq90Var.j(19.0f, 7.0f);
        uq90Var.o(4.0f);
        uq90Var.e(0.0f, -1.66f, -3.13f, -3.0f, -7.0f, -3.0f);
        hr90 hr90Var = new hr90(5.0f, 2.34f, 5.0f, 4.0f);
        ArrayList arrayList = uq90Var.a;
        arrayList.add(hr90Var);
        uq90Var.p(3.0f);
        uq90Var.i(1.64f, 2.72f);
        uq90Var.m(0.2f, -0.22f, 0.38f, -0.38f);
        uq90Var.e(0.46f, -0.38f, 1.0f, -0.63f, 1.48f, -0.8f);
        uq90Var.d(9.49f, 8.17f, 10.73f, 8.0f, 12.0f, 8.0f);
        uq90Var.n(2.51f, 0.18f, 3.5f, 0.53f);
        uq90Var.e(0.49f, 0.18f, 1.02f, 0.43f, 1.48f, 0.81f);
        uq90Var.m(0.18f, 0.15f, 0.38f, 0.38f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", arrayList);
        a6t0 a6t0Var2 = new a6t0(j);
        uq90 e = nnm.e(16.0f, 21.5f);
        e.e(0.0f, 0.83f, -1.8f, 1.5f, -4.0f, 1.5f);
        e.n(-4.0f, -0.67f, -4.0f, -1.5f);
        e.o(11.43f);
        e.d(8.0f, 10.64f, 9.8f, 10.0f, 12.0f, 10.0f);
        e.n(4.0f, 0.64f, 4.0f, 1.43f);
        e.c();
        e.j(13.5f, 14.0f);
        e.b(1.5f, 1.5f, true, true, -3.0f, 0.0f);
        e.b(1.5f, 1.5f, false, true, 3.0f, 0.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
