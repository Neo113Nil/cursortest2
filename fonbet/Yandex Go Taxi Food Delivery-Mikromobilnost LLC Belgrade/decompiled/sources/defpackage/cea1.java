package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.io.File;
import kotlin.Result;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.CSPVersionUtility;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class cea1 {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, CSPVersionUtility.CSP_BUILD_R2, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, HProv.ALG_TYPE_BLOCK, 1920, 2048, 2304, HProv.ALG_TYPE_DH, 2688, 2816, 2823, 2944, HProv.ALG_TYPE_SECURECHANNEL, 3840, 4096, 6144, 7680};

    public static final void a(int i, fid fidVar, tls tlsVar, f530 f530Var) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1630710707);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.e(tlsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2);
            sic a2 = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, d.d, d);
            String e = ohb1.e(btsVar, cyh0.qr_permission_content_title);
            AppColor$Palette appColor$Palette = AppColor$Palette.EverFront;
            f530Var2 = c530Var;
            jeb1.f(e, null, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 384, 0, 16250);
            oeb1.c(btsVar, ljs0.e(f530Var2, 8.0f));
            jeb1.f(ohb1.e(btsVar, cyh0.qr_permission_content_subtitle), null, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 384, 0, 16250);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.e(f530Var2, 32.0f));
            String e2 = ohb1.e(btsVar, cyh0.mt_qr_go_to_settings);
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ukb0(10, tlsVar);
                btsVar.o0(Q);
            }
            dda1.f(0, 12, btsVar, (sls) Q, null, e2, false);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m28(tlsVar, f530Var2, i);
        }
    }

    public static final String b(String str, JSONObject jSONObject) {
        Object failure;
        try {
            failure = jSONObject.getString(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static final String c(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(Extension.COLON_SPACE.concat(str));
        }
        return sb.toString();
    }
}
