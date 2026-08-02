package xsna;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedNavigatorDependencies.kt */
/* loaded from: classes4.dex */
public final class du60 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public du60(Lazy<? extends h7m> lazy) {
        this.a = lazy;
        ubw ubwVar = new ubw(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, ubwVar);
        this.c = msy.a(lazyThreadSafetyMode, new wp40(this, 3));
        this.d = msy.a(lazyThreadSafetyMode, new t2l(this, 28));
    }
}
