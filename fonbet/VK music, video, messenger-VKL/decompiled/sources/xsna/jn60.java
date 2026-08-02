package xsna;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedItemUiDtoHoldersFactory.kt */
/* loaded from: classes4.dex */
public final class jn60 {
    public final Object a;
    public final Lazy<w5r0> b;
    public final Lazy<jhv> c;
    public final ro60 d;
    public final Lazy e;
    public final Lazy f;
    public final zqw g = fsk.c;
    public final Object h;
    public final Object i;

    public jn60(Lazy lazy, Lazy lazy2, Lazy lazy3, ro60 ro60Var, mbs mbsVar, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = ro60Var;
        this.e = lazy5;
        this.f = lazy4;
        f20 f20Var = new f20(26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, f20Var);
        this.i = msy.a(lazyThreadSafetyMode, new sk(18, this, mbsVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b2c0 a() {
        return (b2c0) this.i.getValue();
    }
}
