package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.ybsdk.feature.settings.internal.view.b;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public abstract class nab1 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(au2 au2Var, String str, sls slsVar, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1823206344);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(au2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(slsVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            int i5 = 0;
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
            } else {
                f530 f530Var3 = i4 != 0 ? c530.a : f530Var2;
                vpa1.a(an91.o(f530Var3, 0.0f, 8.0f, 8.0f, 8.0f, 1), false, ButtonSize.M, slsVar, wwg.S(-2002416072, true, new sf6(au2Var, str, i5), btsVar), btsVar, ((i3 << 3) & 7168) | 24960, 2);
                f530Var2 = f530Var3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new tf6(au2Var, str, slsVar, f530Var2, i, i2, 0);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        int i52 = 0;
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(au2 au2Var, String str, sls slsVar, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1340865439);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(au2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(slsVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            int i5 = 1;
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
            } else {
                f530 f530Var3 = i4 != 0 ? c530.a : f530Var2;
                vpa1.a(an91.o(f530Var3, 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, slsVar, wwg.S(-1272001839, true, new sf6(au2Var, str, i5), btsVar), btsVar, ((i3 << 3) & 7168) | 24960, 2);
                f530Var2 = f530Var3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new tf6(au2Var, str, slsVar, f530Var2, i, i2, 1);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        int i52 = 1;
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(StringBuilder sb, j5x j5xVar, int i) {
        int i2 = 0;
        if (j5xVar instanceof m5x) {
            Map map = ((m5x) j5xVar).a;
            if (map.isEmpty()) {
                sb.append("{}");
                return;
            }
            sb.append("{\n");
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                j5x j5xVar2 = (j5x) entry.getValue();
                int i4 = i + 1;
                for (int i5 = 0; i5 < i4; i5++) {
                    sb.append(Extension.TAB_CHAR);
                }
                sb.append("\"" + str + "\": ");
                c(sb, j5xVar2, i4);
                i3++;
                if (i3 < map.size()) {
                    sb.append(",");
                }
                sb.append("\n");
            }
            while (i2 < i) {
                sb.append(Extension.TAB_CHAR);
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(j5xVar instanceof v4x)) {
            if (j5xVar instanceof o6x) {
                sb.append("\"" + ((o6x) j5xVar).a + OpenList.CHAR_QUOTE);
                return;
            }
            if (j5xVar instanceof i5x) {
                sb.append(((i5x) j5xVar).a);
                return;
            } else if (j5xVar instanceof h5x) {
                sb.append(((h5x) j5xVar).a);
                return;
            } else {
                if (j5xVar instanceof w4x) {
                    sb.append(((w4x) j5xVar).a);
                    return;
                }
                return;
            }
        }
        List<j5x> list = ((v4x) j5xVar).a;
        if (list.isEmpty()) {
            sb.append("[]");
            return;
        }
        sb.append("[\n");
        int i6 = 0;
        for (j5x j5xVar3 : list) {
            int i7 = i6 + 1;
            int i8 = i + 1;
            for (int i9 = 0; i9 < i8; i9++) {
                sb.append(Extension.TAB_CHAR);
            }
            c(sb, j5xVar3, i8);
            if (i6 != scc.f(list)) {
                sb.append(",");
            }
            sb.append('\n');
            i6 = i7;
        }
        while (i2 < i) {
            sb.append(Extension.TAB_CHAR);
            i2++;
        }
        sb.append("]");
    }

    public static qa3 d(n6r0 n6r0Var, wls wlsVar, tls tlsVar, tls tlsVar2, tls tlsVar3, wls wlsVar2) {
        b bVar = (b) n6r0Var;
        hlq0 hlq0Var = new hlq0(14);
        bgc bgcVar = new bgc(12);
        int i = 15;
        hlq0 hlq0Var2 = new hlq0(i);
        hlq0 hlq0Var3 = new hlq0(i);
        w8r0 w8r0Var = w8r0.a;
        int i2 = 16;
        lum lumVar = new lum(new i8r0(i2), ger0.a, new hlq0(27), her0.a);
        int i3 = 17;
        lum lumVar2 = new lum(new i8r0(1), m8r0.a, new hlq0(i3), n8r0.a);
        lum lumVar3 = new lum(new i8r0(11), lbr0.a, new a5p0(24, wlsVar2, new cp1(wlsVar, 13)), mbr0.a);
        a5p0 a5p0Var = new a5p0(bVar, tlsVar2, bgcVar, hlq0Var);
        lum lumVar4 = new lum(new arm0(28), a6r0.a, new a5p0(i3, new uwl0(3, tlsVar3), a5p0Var), b6r0.a);
        int i4 = 0;
        return new qa3(w8r0Var, lumVar, lumVar2, lumVar3, lumVar4, new lum(new i8r0(i4), j8r0.a, new hlq0(i2), k8r0.a), new lum(new i8r0(2), a9r0.a, new uwl0(4, new o6r0(bVar, i4)), b9r0.a), new lum(new i8r0(12), rdr0.a, new hlq0(26), sdr0.a), new lum(new i8r0(15), cer0.a, new uwl0(7, tlsVar), der0.a), new lum(new i8r0(13), tdr0.a, new mtw(26), udr0.a), new lum(new arm0(29), t6r0.a, new wnf0(hlq0Var2, hlq0Var3, 3), u6r0.a));
    }

    public static qa3 e(n6r0 n6r0Var, pd8 pd8Var, wk6 wk6Var) {
        return b.a((b) n6r0Var, pd8Var, wk6Var, new hlq0(13), null, null, null, null, 120);
    }

    public static final String f(j5x j5xVar) {
        StringBuilder sb = new StringBuilder();
        c(sb, j5xVar, 1);
        return sb.toString();
    }
}
