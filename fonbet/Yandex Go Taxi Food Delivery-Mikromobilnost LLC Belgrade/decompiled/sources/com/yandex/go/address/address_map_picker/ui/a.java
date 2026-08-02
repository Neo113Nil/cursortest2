package com.yandex.go.address.address_map_picker.ui;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b31;
import defpackage.bts;
import defpackage.c530;
import defpackage.cx20;
import defpackage.did;
import defpackage.e0;
import defpackage.f530;
import defpackage.ffx;
import defpackage.fid;
import defpackage.g31;
import defpackage.gya1;
import defpackage.i31;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lz40;
import defpackage.m0;
import defpackage.o0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.pvi0;
import defpackage.rab1;
import defpackage.sb2;
import defpackage.sls;
import defpackage.t01;
import defpackage.tls;
import defpackage.tnb1;
import defpackage.tz20;
import defpackage.u01;
import defpackage.up2;
import defpackage.v01;
import defpackage.vpa1;
import defpackage.vz20;
import defpackage.wg0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wxb;
import defpackage.wz20;
import defpackage.xxb;
import defpackage.zpn;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(i31 i31Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-150056650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(i31Var) : btsVar.e(i31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new o0(14, tlsVar);
                btsVar.o0(Q);
            }
            gya1.d(false, (sls) Q, btsVar, 0, 1);
            b(!(i31Var instanceof g31) ? i31Var : null, wwg.S(2113252565, true, new wg0(i3, tlsVar), btsVar), btsVar, 48);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(i31Var, tlsVar, i, 9);
        }
    }

    public static final void b(Object obj, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-858727242);
        int i2 = (btsVar.k(obj) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(obj);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            if (obj != null) {
                oz40Var.setValue(obj);
            }
            Object Q2 = btsVar.Q();
            Object obj2 = Q2;
            if (Q2 == o430Var) {
                n0 c = ffx.c(1, 0, null, 6);
                c.g(tz20.a);
                btsVar.o0(c);
                obj2 = c;
            }
            lz40 lz40Var = (lz40) obj2;
            boolean e = ((i2 & 14) == 4) | btsVar.e(lz40Var);
            Object Q3 = btsVar.Q();
            if (e || Q3 == o430Var) {
                Q3 = new AddressMapPickerModalViewKt$AnimatedModalVisibility$1$1(lz40Var, oz40Var, obj, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, obj);
            Object value = oz40Var.getValue();
            if (value == null) {
                btsVar.e0(-1517558948);
                btsVar.t(false);
            } else {
                btsVar.e0(-1517558947);
                sb2.b(vz20.a.a(new wz20(lz40Var)), wwg.S(221448583, true, new u01(i2, i3, aVar, value), btsVar), btsVar, 56);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v01(i, 0, aVar, obj);
        }
    }

    public static final void c(b31 b31Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(892288919);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(b31Var) : btsVar.e(b31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, tnb1.e(new up2(ldc.l), null, btsVar, 4), null, null, false, false, wwg.S(566274797, true, new t01(b31Var, tlsVar), btsVar), wwg.S(-1510540763, true, new t01(tlsVar, b31Var), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(b31Var, tlsVar, i, 10);
        }
    }

    public static final void d(f530 f530Var, pvi0 pvi0Var, String str, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(645610296);
        int i2 = i | 6 | (btsVar.k(pvi0Var) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            vpa1.a(an91.o(c530Var, 0.0f, 8.0f, 8.0f, 8.0f, 1), false, ButtonSize.M, slsVar, wwg.S(-301492824, true, new wxb(i3, pvi0Var, str), btsVar), btsVar, (i2 & 7168) | 24960, 2);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xxb(f530Var2, pvi0Var, str, slsVar, i, 1);
        }
    }

    public static final void e(String str, String str2, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-613084228);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.k(str2) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new PickupFromPhotoComponentsKt$PickupFromPhotoToolBar$1$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, str);
            rab1.b(ljs0.e(c530.a, 48.0f), null, null, null, null, wwg.S(-1981862699, true, new e0(str, str2, tlsVar), btsVar), null, btsVar, 196614, 94);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e0(str, str2, tlsVar, i, 2);
        }
    }
}
