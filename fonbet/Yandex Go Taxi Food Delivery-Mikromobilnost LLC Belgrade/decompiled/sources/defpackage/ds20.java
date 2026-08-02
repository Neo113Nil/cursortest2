package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public final class ds20 {
    public static final List a = scc.g("/v1/startup", "/v4/ad");

    public static String a(String str) {
        String d0 = evu0.d0(str, "://", "");
        if (evu0.J(d0)) {
            return null;
        }
        String f0 = evu0.f0('/', d0, d0);
        String f02 = evu0.f0('?', f0, f0);
        String f03 = evu0.f0('#', f02, f02);
        if (evu0.J(f03)) {
            return null;
        }
        return f03;
    }
}
