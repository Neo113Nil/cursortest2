package xsna;

import kotlin.LazyThreadSafetyMode;
import xsna.k840;

/* compiled from: MusicEventsFeedPresenter.kt */
/* loaded from: classes.dex */
public final class ek40 implements w8i {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new c5o(this, 4));
    public final io.reactivex.rxjava3.disposables.c c;
    public final io.reactivex.rxjava3.disposables.c d;
    public final io.reactivex.rxjava3.disposables.c e;
    public final io.reactivex.rxjava3.disposables.c f;
    public final io.reactivex.rxjava3.disposables.c g;

    public ek40() {
        r5v0 r5v0Var = k840.a.h;
        this.c = (r5v0Var == null ? null : r5v0Var).a.a.b0(c8b0.class).subscribe(new bk40(new zvt(this, 1), 0));
        r5v0 r5v0Var2 = k840.a.h;
        this.d = (r5v0Var2 == null ? null : r5v0Var2).a.a.b0(b9b0.class).subscribe(new ck40(new ha3(this, 1), 0));
        r5v0 r5v0Var3 = k840.a.h;
        this.e = (r5v0Var3 == null ? null : r5v0Var3).a.a.b0(gcb0.class).subscribe(new dk40(new xys(this, 2), 0));
        r5v0 r5v0Var4 = k840.a.h;
        this.f = (r5v0Var4 == null ? null : r5v0Var4).a.a.b0(fa50.class).subscribe(new ua3(new zww(this, 1), 2));
        r5v0 r5v0Var5 = k840.a.h;
        this.g = (r5v0Var5 != null ? r5v0Var5 : null).a.a.b0(yd50.class).subscribe(new b720(new l8m(this, 2), 1));
    }

    public final void a() {
        this.c.dispose();
        this.d.dispose();
        this.e.dispose();
        this.f.dispose();
        this.g.dispose();
    }
}
