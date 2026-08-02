package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PagerAdapterFactory.kt */
/* loaded from: classes2.dex */
public final class ua90 {
    public final Context a;
    public final mkr0 b;
    public final LayoutInflater c;
    public final k7y d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final g6o0 h;
    public final Object i;
    public final Object j;
    public final Object k;

    public ua90(Context context, mkr0 mkr0Var, LayoutInflater layoutInflater, k7y k7yVar, boolean z, boolean z2, boolean z3, g6o0 g6o0Var) {
        this.a = context;
        this.b = mkr0Var;
        this.c = layoutInflater;
        this.d = k7yVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = g6o0Var;
        ubw ubwVar = new ubw(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, ubwVar);
        this.j = msy.a(lazyThreadSafetyMode, new wp40(this, 9));
        this.k = msy.a(lazyThreadSafetyMode, new ye80(this, 1));
    }
}
