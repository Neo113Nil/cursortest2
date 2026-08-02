package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.ybsdk.feature.nfc.api.models.NfcProductType;
import com.ybsdk.feature.nfc.api.models.NfcSystemSettingsType;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public abstract class atb1 {
    public static final void a(w1f w1fVar, yur yurVar, tls tlsVar, sls slsVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-360416370);
        int i2 = i | (btsVar.k(w1fVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            String str = w1fVar.a;
            v1f v1fVar = w1fVar.b;
            u1f u1fVar = w1fVar.c;
            c530 c530Var = c530.a;
            f530 b = m4m0.b(ljs0.u(ljs0.c(c530Var, 1.0f), null, 3), ((el51) btsVar.m(gl51.a)).c(), qke.q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            iqb1.a(str, btsVar, 0);
            x6b1.b(v1fVar, yurVar, slsVar, tlsVar, btsVar, ((i2 << 3) & 7168) | ((i2 >> 3) & 896) | 48);
            ypb1.a(u1fVar, slsVar, btsVar, (i2 >> 6) & 112);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(w1fVar, yurVar, tlsVar, slsVar, f530Var2, i);
        }
    }

    public static final boolean b(char c) {
        if ('A' > c || c >= '[') {
            return ('a' <= c && c < '{') || c == ' ' || c == '-' || c == '.';
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return com.ybsdk.feature.nfc.api.models.NfcProductType.WALLET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r1.equals("wallet") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r1.equals("credit_limit") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1.equals("split") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return com.ybsdk.feature.nfc.api.models.NfcProductType.CREDIT_LIMIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r1.equals("plus") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NfcProductType c(String str) {
        switch (str.hashCode()) {
            case -1272463739:
                if (str.equals("corp_card")) {
                    return NfcProductType.CORP_CARD;
                }
                return NfcProductType.UNKNOWN;
            case -819102987:
                break;
            case -795192327:
                break;
            case 111277:
                if (str.equals("pro")) {
                    return NfcProductType.PRO;
                }
                return NfcProductType.UNKNOWN;
            case 3444122:
                break;
            case 109648666:
                break;
            default:
                return NfcProductType.UNKNOWN;
        }
    }

    public static NfcSystemSettingsType d(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 590357905:
                if (str.equals("enable_draw_overlay")) {
                    return NfcSystemSettingsType.ENABLE_DRAW_OVERLAY;
                }
                return null;
            case 955764327:
                if (str.equals("enable_default_app")) {
                    return NfcSystemSettingsType.ENABLE_DEFAULT_APP;
                }
                return null;
            case 1134142551:
                if (str.equals("enable_biometry")) {
                    return NfcSystemSettingsType.ENABLE_BIOMETRY;
                }
                return null;
            case 1486961811:
                if (str.equals("enable_adapter")) {
                    return NfcSystemSettingsType.ENABLE_ADAPTER;
                }
                return null;
            case 1901115940:
                if (str.equals("add_shortcut")) {
                    return NfcSystemSettingsType.ADD_SHORTCUT;
                }
                return null;
            default:
                return null;
        }
    }
}
