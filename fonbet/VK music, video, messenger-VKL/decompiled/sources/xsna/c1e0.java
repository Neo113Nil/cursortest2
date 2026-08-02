package xsna;

import java.util.HashMap;

/* compiled from: ProfilesFilter.kt */
/* loaded from: classes7.dex */
public final class c1e0 implements izs<String, Boolean> {
    public final HashMap b;
    public final String c;
    public final boolean d;

    public c1e0(String str, HashMap hashMap) {
        this.b = hashMap;
        String obj = str != null ? drm0.p0(str).toString() : null;
        obj = obj == null ? "" : obj;
        this.c = obj;
        this.d = drm0.N(obj);
    }

    @Override // xsna.izs
    public final Boolean invoke(String str) {
        String str2 = str;
        if (this.d) {
            return Boolean.TRUE;
        }
        whr0 whr0Var = (whr0) this.b.get(str2);
        if (whr0Var == null) {
            return Boolean.FALSE;
        }
        String str3 = whr0Var.s;
        String str4 = this.c;
        boolean z = true;
        boolean B = brm0.B(str3, str4, true);
        boolean B2 = brm0.B(whr0Var.t, str4, true);
        if (!B && !B2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
