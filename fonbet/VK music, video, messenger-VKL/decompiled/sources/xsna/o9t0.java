package xsna;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoProfileViewStateMapper.kt */
/* loaded from: classes6.dex */
public final class o9t0 {
    public final Resources a;
    public final boolean b;
    public final String c;
    public final b1y d;
    public final ou1 e;
    public final o5o f;
    public final boolean g;
    public final Object h;

    public o9t0() {
        throw null;
    }

    public o9t0(Resources resources, boolean z, String str, ou1 ou1Var, o5o o5oVar) {
        b1y b1yVar = new b1y(resources, 12);
        this.a = resources;
        this.b = z;
        this.c = str;
        this.d = b1yVar;
        this.e = ou1Var;
        this.f = o5oVar;
        Context context = e43.a;
        context = context == null ? null : context;
        HashSet hashSet = iah0.a;
        this.g = !fnj.b(context);
        this.h = msy.a(LazyThreadSafetyMode.NONE, new e6k0(5));
    }
}
