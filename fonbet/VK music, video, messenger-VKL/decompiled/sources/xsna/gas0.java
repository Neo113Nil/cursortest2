package xsna;

import android.app.Activity;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.apps.BuildInfo;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoCatalogTopBarConfigurator.kt */
/* loaded from: classes16.dex */
public final class gas0 {
    public final Activity a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final nz9 e;
    public final r8s0 f;
    public final xz9 g;
    public final boolean h = !BuildInfo.s();
    public final Object i;
    public final bpn0 j;
    public final bpn0 k;
    public final Object l;
    public int m;
    public LottieAnimationView n;

    public gas0(Activity activity, boolean z, boolean z2, boolean z3, nz9 nz9Var, r8s0 r8s0Var, xz9 xz9Var) {
        this.a = activity;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = nz9Var;
        this.f = r8s0Var;
        this.g = xz9Var;
        kud0 kud0Var = new kud0(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, kud0Var);
        this.j = new bpn0(new nid0(this, 21));
        this.k = new bpn0(new x1e0(this, 24));
        this.l = msy.a(lazyThreadSafetyMode, new jql0(1));
        this.m = -1;
    }
}
