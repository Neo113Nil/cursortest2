package xsna;

import com.vk.bridges.ProfileType;
import com.vk.core.apps.BuildInfo;

/* compiled from: AuthBridge.kt */
/* loaded from: classes.dex */
public final class o25 {
    public static bpn0 a;

    public static final b25 a() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (b25) bpn0Var.getValue();
    }

    public static final boolean b(b25 b25Var) {
        return b25Var.c0() == ProfileType.EDU;
    }

    public static final boolean c(b25 b25Var) {
        return BuildInfo.t() && !b(b25Var);
    }
}
