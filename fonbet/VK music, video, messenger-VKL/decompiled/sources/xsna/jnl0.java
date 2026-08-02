package xsna;

import android.content.Context;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StorefrontServicesDependencies.kt */
/* loaded from: classes18.dex */
public final class jnl0 {
    public final bpn0 a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final Object e;
    public final bpn0 f;
    public final bpn0 g;
    public final Object h;
    public final Object i;

    public jnl0(Context context, f5z f5zVar, l7m l7mVar) {
        this.a = new bpn0(new b1d(l7mVar, context, f5zVar, 5));
        this.b = new bpn0(new unh(l7mVar, 3));
        this.c = new bpn0(new vnh(l7mVar, 2));
        this.d = new bpn0(new skg(l7mVar, 3));
        tll0 tll0Var = new tll0(l7mVar, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, tll0Var);
        this.f = new bpn0(new o7k0(1, context, l7mVar));
        this.g = new bpn0(new mze(l7mVar, 3));
        int i = 3;
        this.h = msy.a(lazyThreadSafetyMode, new nze(l7mVar, i));
        this.i = msy.a(lazyThreadSafetyMode, new oze(l7mVar, i));
    }
}
