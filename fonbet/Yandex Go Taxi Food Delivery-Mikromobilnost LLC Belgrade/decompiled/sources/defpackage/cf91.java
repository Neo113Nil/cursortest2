package defpackage;

import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes5.dex */
public abstract class cf91 {
    public static final byte[] a = {73, -68, -22, -73, -89, -69, 72, -18};
    public static final byte[] b = {Alerts.alert_unsupported_certificate, -35, -124, -36, -44};
    public static final byte[] c = {Alerts.alert_unsupported_certificate, -35, -124, -36, -8, -46, Alerts.alert_certificate_revoked};
    public static final byte[] d = {Alerts.alert_certificate_unknown, -39, -98, -24, -58, -41, 36, -79, Alerts.alert_unsupported_certificate, -35, -124, -36, -44};
    public static final byte[] e = {Alerts.alert_bad_certificate, -44, -113, -44, -52, -28, 61, -99, Alerts.alert_certificate_revoked, -50, -75, -43, -58, -43, 35};
    public static final byte[] f = {Alerts.alert_unsupported_certificate, -35, -124, -36, -8, -40, BlobHeaderStructure.BLOB_VERSION, -117, Alerts.alert_bad_certificate, -41, -75, -59, -62, -56, 61, -126, 61};

    public static final void a(m1q0 m1q0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        a aVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1516478218);
        int i2 = (btsVar2.e(m1q0Var) ? 4 : 2) | i | 48;
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            gv90 gv90Var = m1q0Var.c;
            if (gv90Var instanceof pu90) {
                btsVar2.e0(-1357915978);
                aVar = wwg.S(-396645127, true, new mjf(16, tlsVar, gv90Var), btsVar2);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1357462573);
                btsVar2.t(false);
                aVar = null;
            }
            a aVar2 = aVar;
            a S = wwg.S(-1488797786, true, new tbb(26, m1q0Var), btsVar2);
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            web1.c(c530Var, 0.0f, false, 0.0f, null, null, S, null, null, aVar2, null, null, false, btsVar, 1573254, 0, 7610);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) m1q0Var, (Object) f530Var2, tlsVar, i, 22);
        }
    }

    public static final void b(final f530 f530Var, final tls tlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(865463741);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (!btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                final int i5 = 1;
                v.d = new wls() { // from class: zb31
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        zy11 zy11Var = zy11.a;
                        int i7 = i2;
                        int i8 = i;
                        tls tlsVar2 = tlsVar;
                        f530 f530Var2 = f530Var;
                        fid fidVar2 = (fid) obj;
                        ((Integer) obj2).getClass();
                        switch (i6) {
                            case 0:
                                cf91.b(f530Var2, tlsVar2, fidVar2, vng.O(i8 | 1), i7);
                                break;
                            default:
                                cf91.b(f530Var2, tlsVar2, fidVar2, vng.O(i8 | 1), i7);
                                break;
                        }
                        return zy11Var;
                    }
                };
                return;
            }
            return;
        }
        if (i4 != 0) {
            f530Var = c530.a;
        }
        final f530 f530Var2 = f530Var;
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i6 = 0;
            v2.d = new wls() { // from class: zb31
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    zy11 zy11Var = zy11.a;
                    int i7 = i2;
                    int i8 = i;
                    tls tlsVar2 = tlsVar;
                    f530 f530Var22 = f530Var2;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            cf91.b(f530Var22, tlsVar2, fidVar2, vng.O(i8 | 1), i7);
                            break;
                        default:
                            cf91.b(f530Var22, tlsVar2, fidVar2, vng.O(i8 | 1), i7);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static xba0 c(wrr wrrVar) {
        return new xba0((String) wrrVar.b, (kdc) wrrVar.c, (String) wrrVar.w, (String) wrrVar.x, (kdc) wrrVar.y, (String) wrrVar.z, (String) wrrVar.A);
    }
}
