package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiUnscopedComponent;

/* compiled from: CompanionAppBridge.kt */
/* loaded from: classes.dex */
public final class j6i {
    public static bpn0 a;

    public static final i6i a() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (i6i) bpn0Var.getValue();
    }

    public static final DiScopedComponent b(h7m h7mVar, Class cls) {
        return h7mVar.a(fpf0.a(cls));
    }

    public static final DiUnscopedComponent c(h7m h7mVar, Class cls) {
        return h7mVar.mo408a(fpf0.a(cls));
    }
}
