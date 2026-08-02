package xsna;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: ProductAttachesHolderImpl.kt */
/* loaded from: classes18.dex */
public final class pid0 implements mid0, w8i {
    public final Context b;
    public final boolean c;
    public final f24 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public List<? extends pmc> m;
    public tmc n;
    public izs<? super pmc, s3q0> o;

    public pid0(Context context, boolean z, f24 f24Var) {
        this.b = context;
        this.c = z;
        this.d = f24Var;
        r010 r010Var = new r010(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, r010Var);
        this.f = msy.a(lazyThreadSafetyMode, new sy50(this, 18));
        this.g = msy.a(lazyThreadSafetyMode, new bbb0(this, 4));
        this.h = msy.a(lazyThreadSafetyMode, new rkt(this, 25));
        this.i = msy.a(lazyThreadSafetyMode, new nuv(this, 29));
        this.j = msy.a(lazyThreadSafetyMode, new u210(this, 18));
        this.k = new Object();
        this.l = msy.a(lazyThreadSafetyMode, new nid0(this, 0));
        this.m = EmptyList.b;
        this.o = new z6u(13);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mid0
    public final View a() {
        return ((uid0) this.l.getValue()).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mid0
    public final void b() {
        w530 w530Var = (w530) this.j.getValue();
        g6o0 g6o0Var = new g6o0(this);
        Object obj = this.k;
        w530Var.c(obj, g6o0Var);
        ((q08) this.g.getValue()).b(obj, new x8a(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mid0
    public final void c() {
        w530 w530Var = (w530) this.j.getValue();
        Object obj = this.k;
        w530Var.e(obj);
        ((q08) this.g.getValue()).a(obj);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mid0
    public final void d(List<? extends pmc> list, tmc tmcVar, izs<? super pmc, s3q0> izsVar) {
        this.m = list;
        this.n = tmcVar;
        this.o = izsVar;
        ((uid0) this.l.getValue()).a(list, tmcVar, this.o, new nk0(22, this, tmcVar));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(c5u c5uVar, boolean z) {
        Iterator it;
        List<? extends pmc> list = this.m;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof c5u) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c5u c5uVar2 = (c5u) it2.next();
            if (epx.f(c5uVar2, c5uVar)) {
                it = it2;
                c5uVar2 = new c5u(c5uVar2.a, c5uVar2.b, c5uVar2.c, c5uVar2.d, c5uVar2.e, c5uVar2.f, c5uVar2.g, c5uVar2.h, c5uVar2.i, z, c5uVar2.k, c5uVar2.l, c5uVar2.m, c5uVar2.n, c5uVar2.o);
            } else {
                it = it2;
            }
            arrayList2.add(c5uVar2);
            it2 = it;
        }
        this.m = arrayList2;
        tmc tmcVar = this.n;
        if (tmcVar != null) {
            ((uid0) this.l.getValue()).a(arrayList2, tmcVar, this.o, new nk0(22, this, tmcVar));
        }
    }
}
