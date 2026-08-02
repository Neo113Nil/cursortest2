package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class gmb1 {
    public static mgv a;

    public static final void a(yxb yxbVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-251205317);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(yxbVar) : btsVar.e(yxbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            cx20.a(null, null, tnb1.e(new up2(ldc.l), null, btsVar, 4), null, null, false, false, wwg.S(533923237, true, new vxb(yxbVar, tlsVar), btsVar), wwg.S(-1105682067, true, new qk30(tlsVar2, (Object) yxbVar, (Object) tlsVar, 18), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) yxbVar, (Object) tlsVar, (Object) tlsVar2, i, 14);
        }
    }

    public static final void b(f530 f530Var, pvi0 pvi0Var, String str, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1646395392);
        int i2 = i | 6 | (btsVar.k(pvi0Var) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            vpa1.a(an91.o(c530Var, 0.0f, 8.0f, 8.0f, 8.0f, 1), false, ButtonSize.M, slsVar, wwg.S(-513800304, true, new wxb(i3, pvi0Var, str), btsVar), btsVar, (i2 & 7168) | 24960, 2);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xxb(f530Var2, pvi0Var, str, slsVar, i, 0);
        }
    }

    public static String c(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte a2 = byteString.a(i);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append(CSPStore.UNIQUE_SEPARATOR);
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
