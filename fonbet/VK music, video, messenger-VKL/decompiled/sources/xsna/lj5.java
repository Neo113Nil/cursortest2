package xsna;

import android.graphics.PointF;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.acs;

/* compiled from: AutoScrollMoveItemDelegate.kt */
/* loaded from: classes18.dex */
public final class lj5 {
    public static final /* synthetic */ qcy<Object>[] h = {new MutablePropertyReference1Impl(lj5.class, "disposableHorizontalScrolling", "getDisposableHorizontalScrolling()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, lj5.class, "disposableVerticalScrolling", "getDisposableVerticalScrolling()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    public static final int i = dn70.b(50);
    public static final int j = dn70.b(30);
    public static final int k = dn70.b(3);
    public static final int l = dn70.b(2);
    public static final int m = dn70.b(10);
    public final mwo0 a;
    public final acs.a b;
    public int c;
    public final ysg0<shh0> d = new ysg0<>();
    public final ysg0<shh0> e = new ysg0<>();
    public final x8a f = new x8a();
    public final x8a g = new x8a();

    public lj5(mwo0 mwo0Var, acs.a aVar) {
        this.a = mwo0Var;
        this.b = aVar;
    }

    public final boolean a(PointF pointF) {
        return pointF.x < this.a.d.o.left + ((float) i);
    }

    public final boolean b(PointF pointF) {
        return pointF.x > this.a.d.o.right - ((float) i);
    }
}
