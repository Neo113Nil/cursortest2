package xsna;

import android.net.Uri;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.hnd;
import xsna.jnd;

/* compiled from: ClipsCoauthorsUiProviderImpl.kt */
/* loaded from: classes16.dex */
public final class nnd implements jnd {
    public final ClipsCoauthorsInternalComponent a;
    public final Object b;
    public final Object c;

    public nnd(ClipsCoauthorsInternalComponent clipsCoauthorsInternalComponent) {
        this.a = clipsCoauthorsInternalComponent;
        com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar = new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, aVar);
        this.c = msy.a(lazyThreadSafetyMode, new t5(this, 23));
    }

    @Override // xsna.jnd
    public final io.reactivex.rxjava3.core.q a(Integer num, List list) {
        if (list.isEmpty()) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        List H0 = j5g.H0(list, 2);
        ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            arrayList.add(mcr0.h(Uri.parse((String) it.next())));
        }
        return new io.reactivex.rxjava3.internal.operators.observable.e3(null, arrayList, new u5(new tc(7), 5), io.reactivex.rxjava3.core.g.b).U(new qs6(new mnd(0, num), 5));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jnd
    public final void b(jnd.a aVar, uh3 uh3Var) {
        boolean equals = aVar.equals(jnd.a.C3128a.a);
        ?? r2 = this.b;
        if (equals) {
            ((ind) r2.getValue()).c(new hnd.d(uh3Var), false);
        } else {
            if (!(aVar instanceof jnd.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fkq0.b(((jnd.a.b) aVar).a)) {
                ((ind) r2.getValue()).c(new hnd.e(new un9(this, aVar, uh3Var, 1)), false);
            } else {
                ((ind) r2.getValue()).c(new hnd.f(new defpackage.f0(8, this, uh3Var)), false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jnd
    public final void c() {
        ((ind) this.b.getValue()).c(new hnd.a(1), true);
    }
}
