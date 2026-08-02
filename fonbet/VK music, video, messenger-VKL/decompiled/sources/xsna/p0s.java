package xsna;

import com.vk.dto.common.Source;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.builders.ListBuilder;

/* compiled from: FoldersCountersLoaderWithCustomFolders.kt */
/* loaded from: classes18.dex */
public final class p0s {
    public final a1w a;
    public final b1s b;
    public final List<fnk> c;
    public final io.reactivex.rxjava3.subjects.d<Map<Integer, spm>> d;
    public final io.reactivex.rxjava3.core.w e;
    public final AtomicBoolean f;
    public final io.reactivex.rxjava3.disposables.b g;
    public final io.reactivex.rxjava3.internal.operators.observable.a0 h;

    public p0s(a1w a1wVar, b1s b1sVar, ListBuilder listBuilder) {
        this.a = a1wVar;
        this.b = b1sVar;
        this.c = listBuilder;
        jgp jgpVar = jgp.b;
        this.d = io.reactivex.rxjava3.subjects.d.O0(jgpVar);
        this.e = asu0.a.c();
        this.f = new AtomicBoolean(false);
        this.g = new io.reactivex.rxjava3.disposables.b();
        ArrayList arrayList = new ArrayList(c5g.u(listBuilder, 10));
        Iterator<E> it = listBuilder.iterator();
        while (it.hasNext()) {
            arrayList.add(((fnk) it.next()).a());
        }
        this.h = new io.reactivex.rxjava3.internal.operators.observable.a0(io.reactivex.rxjava3.core.q.m(this.d, io.reactivex.rxjava3.core.q.n(arrayList, new gcd0(17)).o0(io.reactivex.rxjava3.core.x.k(jgpVar)), new pa(new xpd((byte) 0, 3), 18)).r0(this.e), new o0s(this, 0));
    }

    public final void a() {
        this.g.b(io.reactivex.rxjava3.kotlin.c.e(this.a.C(this, new cqm(Source.CACHE)).q(this.e), new tcn(this, 7), new n6f(this, 24)));
    }

    public final void b() {
        a();
    }
}
