package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: PlaybackAnalyticsTrackerFacade.kt */
/* loaded from: classes3.dex */
public final class vva0 implements w8i {
    public final uw1 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public vva0(ex40 ex40Var, uw1 uw1Var) {
        this.b = uw1Var;
        pp00 pp00Var = new pp00(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, pp00Var);
        this.d = msy.a(lazyThreadSafetyMode, new h4(13, this, ex40Var));
        this.e = msy.a(lazyThreadSafetyMode, new e550(this, 9));
        this.f = msy.a(lazyThreadSafetyMode, new j4(20, this, ex40Var));
    }
}
