package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes8.dex */
public final class mm20 {
    public final i3y a;
    public final i3y b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public mm20(yuf0 yuf0Var) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.a = a.b(lazyThreadSafetyMode, new im20());
        int i = 0;
        this.b = a.b(lazyThreadSafetyMode, new jm20(yuf0Var, this, i));
        this.c = a.b(lazyThreadSafetyMode, new km20());
        int i2 = 1;
        a.b(lazyThreadSafetyMode, new jm20(yuf0Var, this, i2));
        a.b(lazyThreadSafetyMode, new lm20(yuf0Var, i));
        this.d = a.b(lazyThreadSafetyMode, new lm20(yuf0Var, i2));
        this.e = a.b(lazyThreadSafetyMode, new lm20(yuf0Var, 2));
        this.f = a.b(lazyThreadSafetyMode, new lm20(yuf0Var, 3));
        a.b(lazyThreadSafetyMode, new lm20(yuf0Var, 4));
    }
}
