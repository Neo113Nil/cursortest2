package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import xsna.el50;
import xsna.f8a;

/* compiled from: CatalogLegacyBlockInlineActor.kt */
/* loaded from: classes16.dex */
public final class k8a extends bl50<CatalogBlockState, f8a, on50, bwj, dwj, r1a> {
    public final l8a c;
    public final t1a<? super CatalogBlockState> d;
    public final g8a e;
    public final sj50<CatalogBlockState, on50, ll50<on50, bwj, dwj>, jl50<CatalogBlockState>, r1a> f;
    public a g;

    /* compiled from: CatalogLegacyBlockInlineActor.kt */
    public static final class a {
        public final s1a<? super CatalogBlockState> a;
        public final b b;

        public a(s1a<? super CatalogBlockState> s1aVar, b bVar) {
            this.a = s1aVar;
            this.b = bVar;
        }
    }

    /* compiled from: CatalogLegacyBlockInlineActor.kt */
    public static final class b implements b2a {
        public final k8a a;
        public volatile boolean b;
        public final LinkedHashSet c = new LinkedHashSet();
        public final ReentrantLock d = new ReentrantLock();

        public b(k8a k8aVar) {
            this.a = k8aVar;
        }

        @Override // xsna.b2a
        public final void a(t0a t0aVar) {
            this.a.c.a(t0aVar);
        }

        @Override // xsna.b2a
        public final void b() {
            this.a.c.b();
        }

        @Override // xsna.b2a
        public final void c() {
            this.a.c.c();
            throw null;
        }

        @Override // xsna.b2a
        public final void e(on50 on50Var, ln50<on50> ln50Var, izs<? super dwj, ? extends bwj> izsVar) {
            if (this.b) {
                return;
            }
            el50.a.a(this.a, on50Var, ln50Var, new defpackage.v(3, this, izsVar));
        }

        @Override // xsna.b2a
        public final void f(List<String> list) {
            this.a.c.f(list);
        }

        @Override // xsna.b2a
        public final void g(String str, izs izsVar, v1a v1aVar) {
            this.a.c.d();
            throw null;
        }

        @Override // xsna.b2a
        public final CatalogBlockState getCurrentState() {
            return (CatalogBlockState) this.a.b.getCurrentState();
        }

        @Override // xsna.b2a
        public final void h(com.vk.libvideo.b bVar) {
            if (this.b) {
                return;
            }
        }

        @Override // xsna.b2a
        public final void i(BlockId.Simple simple, List list) {
            this.a.c.h();
            throw null;
        }

        @Override // xsna.b2a
        public final void j() {
            LinkedHashSet linkedHashSet = this.c;
            ReentrantLock reentrantLock = this.d;
            reentrantLock.lock();
            try {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((jn50) it.next()).a();
                }
                linkedHashSet.clear();
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // xsna.b2a
        public final void k(String str) {
            this.a.c.g();
            throw null;
        }

        @Override // xsna.b2a
        public final void l(r1a r1aVar) {
            if (this.b) {
                return;
            }
            this.a.c(r1aVar);
        }
    }

    public k8a(l8a l8aVar, t1a<? super CatalogBlockState> t1aVar, g8a g8aVar, sj50<CatalogBlockState, on50, ll50<on50, bwj, dwj>, jl50<CatalogBlockState>, r1a> sj50Var) {
        super(sj50Var);
        this.c = l8aVar;
        this.d = t1aVar;
        this.e = g8aVar;
        this.f = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<CatalogBlockState, on50, ll50<on50, bwj, dwj>, jl50<CatalogBlockState>, r1a> W() {
        return this.f;
    }

    @Override // xsna.bl50, xsna.uic
    public final void clear() {
        a aVar = this.g;
        if (aVar != null) {
            aVar.b.b = true;
            aVar.a.clear();
        }
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        b bVar = new b(this);
        this.g = new a(this.d.a(bVar), bVar);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        a aVar;
        f8a f8aVar = (f8a) lj50Var;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (f8aVar instanceof f8a.a) {
            q1a q1aVar = ((f8a.a) f8aVar).b;
            if (epx.f(q1aVar.w(), ((CatalogBlockState) sj50Var.getCurrentState()).w()) && (aVar = this.g) != null) {
                aVar.a.j(q1aVar);
                return;
            }
            return;
        }
        if (!(f8aVar instanceof f8a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        CatalogBlockState catalogBlockState = ((f8a.b) f8aVar).b;
        if (!this.e.a || epx.f(catalogBlockState.w(), ((CatalogBlockState) sj50Var.getCurrentState()).w())) {
            a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.a.M(catalogBlockState);
                return;
            }
            return;
        }
        a aVar3 = this.g;
        if (aVar3 != null) {
            aVar3.b.b = true;
            aVar3.a.clear();
        }
        el50.a.b(this, new l5(catalogBlockState, 16));
        t1a<? super CatalogBlockState> t1aVar = this.d;
        b bVar = new b(this);
        this.g = new a(t1aVar.a(bVar), bVar);
    }
}
