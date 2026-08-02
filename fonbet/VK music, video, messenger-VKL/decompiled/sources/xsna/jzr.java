package xsna;

import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: FolderPeersObserver.kt */
/* loaded from: classes18.dex */
public final class jzr implements g4z {
    public final a1w b;
    public final int c;
    public final io.reactivex.rxjava3.subjects.d<Set<Long>> d = io.reactivex.rxjava3.subjects.d.O0(EmptySet.b);
    public final io.reactivex.rxjava3.core.w e;
    public final io.reactivex.rxjava3.disposables.b f;

    public jzr(a1w a1wVar, io.reactivex.rxjava3.subjects.f fVar, int i) {
        this.b = a1wVar;
        this.c = i;
        io.reactivex.rxjava3.core.w b = io.reactivex.rxjava3.schedulers.a.b();
        this.e = b;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f = bVar;
        bVar.b(fVar.r0(b).a0(b).subscribe(new xf1(new t1e(this, 22), 21)));
        a();
    }

    public final void a() {
        io.reactivex.rxjava3.internal.operators.single.c C = this.b.C(this, new fu90(this.c));
        io.reactivex.rxjava3.core.w wVar = this.e;
        this.f.b(io.reactivex.rxjava3.kotlin.c.e(C.q(wVar).m(wVar), new wze(this, 26), new r9k(this, 8)));
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.f.e();
    }
}
