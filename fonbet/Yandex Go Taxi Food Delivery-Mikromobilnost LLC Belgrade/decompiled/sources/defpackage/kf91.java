package defpackage;

import android.app.Activity;
import android.view.WindowManager;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import defpackage.a7u0;
import defpackage.bts;
import defpackage.did;
import defpackage.e0v;
import defpackage.fid;
import defpackage.fwi;
import defpackage.g0v;
import defpackage.ger;
import defpackage.iq2;
import defpackage.je31;
import defpackage.lg6;
import defpackage.m290;
import defpackage.o430;
import defpackage.oz40;
import defpackage.qab1;
import defpackage.rfb1;
import defpackage.rzu;
import defpackage.sb2;
import defpackage.sd2;
import defpackage.tje;
import defpackage.tse;
import defpackage.ubn;
import defpackage.up2;
import defpackage.vfc;
import defpackage.vuz;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.y7m;
import defpackage.yur;
import defpackage.yvh;
import defpackage.zpn;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public abstract class kf91 {
    public static final byte[] a = {PKIBody._CKUANN, DerValue.tag_UniversalString, -53, 83, -80, -119, -45, -89};
    public static final byte[] b = {96, 125, -78, 54, -43, -42, -79, -58, 126, 119, -108, 49, -39, -22};
    public static final byte[] c = {Alerts.alert_bad_certificate_hash_value, 125, -91, 56, -17, -32, -73};
    public static final byte[] d = {115, 116, -82, 48, -37, -42, -90, -44, 117, Alerts.alert_unsupported_extension, -108, 49, -47, -25, -72, -8, 121, Alerts.alert_no_application_protocol};

    public static final void a(f530 f530Var, sda0 sda0Var, fid fidVar, int i) {
        f530 f530Var2;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1562497917);
        int i2 = i | 6 | (btsVar.k(sda0Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530Var2 = c530.a;
            f530 k = ljs0.c(f530Var2, 1.0f).k(sda0Var.b ? pfb1.b(f530Var2, false, 31) : f530Var2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            CharSequence charSequence = sda0Var.a;
            if (charSequence == null) {
                btsVar.e0(2121552596);
                btsVar.t(false);
                f = 1.0f;
            } else {
                btsVar.e0(2121552597);
                f = 1.0f;
                ydb1.a(null, null, wwg.S(-1016203594, true, new or9(13, charSequence), btsVar), null, null, null, null, false, btsVar, 384, 251);
                btsVar.t(false);
            }
            a9b1.a(sda0Var.c, ljs0.c(f530Var2, f), wwg.S(1205482411, true, new wg30(27, sda0Var), btsVar), btsVar, 432);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o990(f530Var2, sda0Var, i, 2);
        }
    }

    public static final void b(final int i, je31 je31Var, boolean z, final tls tlsVar, final tls tlsVar2, lk31 lk31Var, final w49 w49Var, final frv0 frv0Var, final z0a0 z0a0Var, fid fidVar, int i2) {
        int i3;
        je31 je31Var2;
        final boolean z2;
        lk31 lk31Var2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1676201560);
        if ((i2 & 6) == 0) {
            i3 = (btsVar2.c(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            je31Var2 = je31Var;
            i3 |= btsVar2.k(je31Var2) ? 32 : 16;
        } else {
            je31Var2 = je31Var;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.e(tlsVar2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            lk31Var2 = lk31Var;
            i3 |= btsVar2.e(lk31Var2) ? 131072 : 65536;
        } else {
            lk31Var2 = lk31Var;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? btsVar2.k(w49Var) : btsVar2.e(w49Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (16777216 & i2) == 0 ? btsVar2.k(frv0Var) : btsVar2.e(frv0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i2) == 0) {
            i3 |= (134217728 & i2) == 0 ? btsVar2.k(z0a0Var) : btsVar2.e(z0a0Var) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if (btsVar2.V(i3 & 1, (38347923 & i3) != 38347922)) {
            final je31 je31Var3 = je31Var2;
            final lk31 lk31Var3 = lk31Var2;
            a S = wwg.S(441330700, true, new wls() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.c
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    y7m y7mVar;
                    float f;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar3 = (bts) fidVar2;
                    boolean V = btsVar3.V(intValue & 1, (intValue & 3) != 2);
                    zy11 zy11Var = zy11.a;
                    if (!V) {
                        btsVar3.Y();
                        return zy11Var;
                    }
                    Object Q = btsVar3.Q();
                    o430 o430Var = did.a;
                    if (Q == o430Var) {
                        Q = androidx.compose.runtime.f.j(Boolean.FALSE);
                        btsVar3.o0(Q);
                    }
                    oz40 oz40Var = (oz40) Q;
                    Object Q2 = btsVar3.Q();
                    if (Q2 == o430Var) {
                        Q2 = zpn.j(EmptyCoroutineContext.a, btsVar3);
                        btsVar3.o0(Q2);
                    }
                    tse tseVar = (tse) Q2;
                    wg6 a2 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, !((Boolean) oz40Var.getValue()).booleanValue() ? sb2.F() : sb2.K(300, 0, ubn.a, 2), false, null, null, null, null, btsVar3, 432, 0, 8153);
                    je31 je31Var4 = je31.this;
                    if (je31Var4.d == null) {
                        btsVar3.e0(788413578);
                        btsVar3.t(false);
                        y7mVar = null;
                    } else {
                        btsVar3.e0(788413579);
                        btsVar3.e0(-714448428);
                        a7u0 a7u0Var = j.h;
                        fwi fwiVar = (fwi) btsVar3.m(a7u0Var);
                        WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                        sd2 sd2Var = vuz.o(btsVar3).e;
                        float H = fwiVar.H(sd2Var.e().d);
                        btsVar3.t(false);
                        float f2 = H + 150.0f;
                        for (g0v g0vVar : je31Var4.b.a) {
                            if (g0vVar instanceof rzu) {
                                f = 128.0f;
                            } else if (g0vVar instanceof e0v) {
                                f = 48.0f;
                            }
                            f2 += f;
                        }
                        btsVar3.t(false);
                        y7mVar = new y7m(f2);
                    }
                    ger.a(a2, y7mVar != null ? y7mVar.a : i, !z2, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 8);
                    Object Q3 = btsVar3.Q();
                    if (Q3 == o430Var) {
                        Q3 = new VerticalHubV2ScreenKt$VerticalHubV2Screen$1$1$1(oz40Var, null);
                        btsVar3.o0(Q3);
                    }
                    zpn.e(btsVar3, (wls) Q3, zy11Var);
                    lg6 c2 = qab1.c(a2, new up2(tje.c(rfb1.e(a2), iq2.d)), null, btsVar3, 384, 0);
                    Object Q4 = btsVar3.Q();
                    if (Q4 == o430Var) {
                        Q4 = vfc.g(btsVar3);
                    }
                    sb2.b(m290.a.a(null), wwg.S(-1525337908, true, new yvh(je31Var4, w49Var, frv0Var, tlsVar, a2, c2, z0a0Var, (yur) Q4, tlsVar2, lk31Var3, tseVar, 1), btsVar3), btsVar3, 48);
                    return zy11Var;
                }
            }, btsVar2);
            btsVar = btsVar2;
            rzo.b(null, "default", S, btsVar, 3456, 3);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s07(i, je31Var, z, tlsVar, tlsVar2, lk31Var, w49Var, frv0Var, z0a0Var, i2);
        }
    }

    public static final void c(Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        activity.getWindow().setAttributes(attributes);
    }

    public static String d(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ a[i % 8]);
        }
        return new String(bArr2, uza.a);
    }
}
