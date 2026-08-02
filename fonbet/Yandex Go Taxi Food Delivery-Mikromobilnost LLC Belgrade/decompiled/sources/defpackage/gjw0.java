package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.SupportEntryPointsImpl;
import java.lang.reflect.ParameterizedType;
import java.net.URLEncoder;

/* loaded from: classes9.dex */
public abstract class gjw0 {
    public static final String a(w4o w4oVar, String str, WebViewScreenParams.Auth auth) {
        String str2;
        byte[] bArr = tje.b;
        int i = 0;
        if (jl40.l(w4oVar, t4o.d) || jl40.l(w4oVar, u4o.d)) {
            byte[] bArr2 = tje.s1;
            byte[] bArr3 = new byte[36];
            while (i < 36) {
                bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                i++;
            }
            str2 = new String(bArr3, uza.a);
        } else {
            if (!jl40.l(w4oVar, v4o.d)) {
                w511.b();
                return null;
            }
            byte[] bArr4 = tje.g1;
            byte[] bArr5 = new byte[32];
            while (i < 32) {
                bArr5[i] = (byte) (bArr4[i] ^ bArr[i % 8]);
                i++;
            }
            str2 = new String(bArr5, uza.a);
        }
        return unr0.p("ybapp://screen.open/open_web?url=", URLEncoder.encode(str2.concat(str), "utf-8"), "&auth=", auth.getAuthLevel(), "&show_navbar=false&control=cross");
    }

    public static final dfr b(w4o w4oVar) {
        String q = tje.q(tje.u1);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, SupportEntryPointsImpl.class);
        String q2 = tje.q(tje.x2);
        WebViewScreenParams.Auth auth = WebViewScreenParams.Auth.BNK;
        String a = a(w4oVar, q2, auth);
        String q3 = tje.q(tje.a0);
        WebViewScreenParams.Auth auth2 = WebViewScreenParams.Auth.YANDEX;
        return new dfr(q, newParameterizedType, new CommonExperiment(new SupportEntryPointsImpl(a, a(w4oVar, q3, auth2), a(w4oVar, tje.q(tje.D1), auth2), a(w4oVar, tje.q(tje.F2), auth2), a(w4oVar, tje.q(tje.v), auth), a(w4oVar, tje.q(tje.Z2), auth2), a(w4oVar, tje.q(tje.m1), auth2), a(w4oVar, tje.q(tje.X1), auth2)), ExperimentApplyType.LATEST));
    }
}
