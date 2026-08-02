package defpackage;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes8.dex */
public final class lv11 {
    public static final /* synthetic */ kgx[] d = {new MutablePropertyReference1Impl("lastUltimaState", 0, "getLastUltimaState()Ljava/lang/String;", lv11.class), new MutablePropertyReference1Impl("lastUltimaEnabled", 0, "getLastUltimaEnabled()Z", lv11.class), new MutablePropertyReference1Impl("isUltimaModeDisabledByUser", 0, "isUltimaModeDisabledByUser()Z", lv11.class)};
    public final qme0 a;
    public final qme0 b;
    public final qme0 c;

    public lv11(dne0 dne0Var) {
        cne0 a = dne0Var.a("ultima_mode_preferences");
        this.a = new qme0(1, a, a, "last_ultima_state");
        this.b = new qme0(0, a, a, "last_ultima_enabled");
        this.c = new qme0(0, a, a, "ultima_mode_disabled_manually");
    }
}
