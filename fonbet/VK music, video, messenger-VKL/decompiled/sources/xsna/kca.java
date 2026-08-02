package xsna;

import android.annotation.SuppressLint;
import com.vk.log.L;

/* compiled from: CatalogRecentQueryStorageManager.kt */
/* loaded from: classes16.dex */
public final class kca {
    public final bpn0 a;
    public final int b;
    public final io.reactivex.rxjava3.core.w c;
    public final m1q<String> d;
    public final io.reactivex.rxjava3.internal.operators.single.v e;

    public kca() {
        throw null;
    }

    public kca(bpn0 bpn0Var) {
        io.reactivex.rxjava3.core.w c = asu0.a.c();
        this.a = bpn0Var;
        this.b = 5;
        this.c = c;
        m1q<String> m1qVar = new m1q<>(5, 2);
        this.d = m1qVar;
        this.e = new io.reactivex.rxjava3.internal.operators.single.v(new fca(this, 0));
        new io.reactivex.rxjava3.internal.operators.single.v(new gca(this, 0)).q(c).subscribe(new pp3(new jca(1, m1qVar, m1q.class, "addAll", "addAll(Ljava/util/Collection;)Z", 8, 0), 5), new st0(new gy(L.a, 4), 2));
    }

    @SuppressLint({"CheckResult"})
    public final void a(String str) {
        if (str.length() == 0) {
            return;
        }
        m1q<String> m1qVar = this.d;
        if (m1qVar.c.contains(str)) {
            return;
        }
        m1qVar.add(str);
        new io.reactivex.rxjava3.internal.operators.completable.m(new hca(0, this, m1qVar)).q(this.c).subscribe(new va4(0), new c60(new ug8(L.a, 1), 6));
    }

    public final void b() {
        new io.reactivex.rxjava3.internal.operators.completable.m(new ica(this, 0)).q(this.c).subscribe(new dm4(this, 1), new m20(new ie8(L.a, 1), 10));
    }
}
