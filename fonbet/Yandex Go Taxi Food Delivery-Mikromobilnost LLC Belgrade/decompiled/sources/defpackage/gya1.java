package defpackage;

import androidx.compose.runtime.f;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public abstract class gya1 implements s4m0 {
    public static final void d(boolean z, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(600998422);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i3 |= btsVar.e(slsVar) ? 32 : 16;
        }
        int i6 = 1;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                z = true;
            }
            oz40 n = f.n(slsVar, btsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new zo2(n, z);
                btsVar.o0(Q);
            }
            zo2 zo2Var = (zo2) Q;
            boolean e = btsVar.e(zo2Var) | ((i3 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new zo1(zo2Var, z, i6);
                btsVar.o0(Q2);
            }
            zpn.i((sls) Q2, btsVar);
            rx60 a = d4z.a(btsVar);
            if (a == null) {
                ny61.r("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            qx60 onBackPressedDispatcher = a.getOnBackPressedDispatcher();
            boolean e2 = btsVar.e(onBackPressedDispatcher) | btsVar.e(zo2Var);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                Q3 = new v5(i5, onBackPressedDispatcher, zo2Var);
                btsVar.o0(Q3);
            }
            zpn.a(onBackPressedDispatcher, (tls) Q3, btsVar);
        } else {
            btsVar.Y();
        }
        boolean z2 = z;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yo2(z2, slsVar, i, i2, 0);
        }
    }

    public static final String e(fnt fntVar) {
        switch (hnt.a[fntVar.h.ordinal()]) {
            case 1:
                return "reservationFree";
            case 2:
                return "reservationPaid";
            case 3:
                return "acceptanceFree";
            case 4:
                return "acceptancePaid";
            case 5:
                return "unrecognized";
            case 6:
                return "parking";
            case 7:
                return "riding";
            default:
                w511.b();
                return null;
        }
    }

    public static /* synthetic */ boolean g(byte b) {
        return b >= 0;
    }

    public static void h(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || k(b2)) {
            ny61.B("Protocol message had invalid UTF-8.");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    public static void i(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!k(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!k(b3)) {
                cArr[i] = (char) (((b & PKIBody._CCP) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        ny61.B("Protocol message had invalid UTF-8.");
    }

    public static void j(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!k(b2)) {
            if ((((b2 + Alerts.alert_unrecognized_name) + (b << DerValue.tag_UniversalString)) >> 30) == 0 && !k(b3) && !k(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        ny61.B("Protocol message had invalid UTF-8.");
    }

    public static boolean k(byte b) {
        return b > -65;
    }

    @Override // defpackage.s4m0
    public String a() {
        return dya1.f(this);
    }

    @Override // defpackage.s4m0
    public Throwable b() {
        if (this instanceof p4m0) {
            return ((p4m0) this).a;
        }
        return null;
    }

    @Override // defpackage.s4m0
    public String c() {
        return dya1.e(this);
    }

    public abstract String f();
}
