package xsna;

import android.annotation.SuppressLint;

/* compiled from: PlayerPoolSize.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes3.dex */
public final class c3b0 {
    public int a = 1;
    public final io.reactivex.rxjava3.subjects.d<Integer> b;

    public c3b0() {
        io.reactivex.rxjava3.subjects.d<Integer> O0 = io.reactivex.rxjava3.subjects.d.O0(2);
        this.b = O0;
        io.reactivex.rxjava3.internal.operators.single.d0 o = new io.reactivex.rxjava3.internal.operators.single.v(new b3b0()).o(1);
        asu0.a.getClass();
        io.reactivex.rxjava3.core.q.m(o.q(asu0.p()).w(), O0, new e8(new i60(8), 27)).subscribe(new uk40(new fa00(this, 15), 7));
    }
}
