package defpackage;

import kotlin.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes10.dex */
public final class pay0 {
    public static final /* synthetic */ kgx[] e = {new MutablePropertyReference1Impl("themeChangeModeId", 0, "getThemeChangeModeId()Ljava/lang/String;", pay0.class), new MutablePropertyReference1Impl("lastKnownLat", 0, "getLastKnownLat$impl()F", pay0.class), new MutablePropertyReference1Impl("lastKnownLon", 0, "getLastKnownLon$impl()F", pay0.class)};
    public final iid0 a;
    public final rme0 b;
    public final rme0 c;
    public final i3y d;

    public pay0(dne0 dne0Var) {
        cne0 a = dne0Var.a("taxi_app_theme");
        this.a = new iid0(a, "taxi_theme_change_mode");
        this.b = new rme0(0, a, a, "latitude");
        this.c = new rme0(0, a, a, "longitude");
        this.d = a.a(new oay0(0, this));
    }
}
