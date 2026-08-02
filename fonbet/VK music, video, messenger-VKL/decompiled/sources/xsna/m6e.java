package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.viewer.engine.feed.api.FeedMode;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.i1e;

/* compiled from: ClipsFeedEngineImpl.kt */
/* loaded from: classes17.dex */
public final class m6e<Item> implements h6e<Item> {
    public final mgk0 a;
    public final dux<Item> b;
    public final Lifecycle c;
    public final ClipFeedListFragment.f d;
    public final l36 e;
    public final mfh0 f;
    public final nt8 g;
    public final nt8 h;
    public d i;

    /* compiled from: ClipsFeedEngineImpl.kt */
    public final class a implements d {
        public final q8e a;
        public final RecyclerView.Adapter<?> b;
        public gxc c;
        public final androidx.recyclerview.widget.o0 d;
        public final v380 e;
        public final i1e f;
        public final p2f g;
        public final bgn h;
        public final n0f<Item> i;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r24v0, types: [androidx.recyclerview.widget.RecyclerView, xsna.q8e] */
        /* JADX WARN: Type inference failed for: r26v0, types: [androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView$Adapter<?>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [androidx.recyclerview.widget.o0, xsna.e4o0] */
        public a(q8e q8eVar, LinearLayoutManager linearLayoutManager, RecyclerView.Adapter adapter, FeedMode feedMode) {
            RecyclerView.r r0fVar;
            this.a = q8eVar;
            this.b = adapter;
            int i = e.$EnumSwitchMapping$0[feedMode.ordinal()];
            if (i == 1) {
                r0fVar = new r0f(0);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                r0fVar = new sc90();
            }
            ?? r5 = r0fVar;
            this.d = r5;
            v380 v380Var = new v380(q8eVar);
            v380Var.b = new hg(this, 21);
            this.e = v380Var;
            wlp wlpVar = new wlp(q8eVar, linearLayoutManager);
            z3o0 z3o0Var = new z3o0(r5, q8eVar, linearLayoutManager);
            i1e i1eVar = new i1e(m6e.this.a, wlpVar, new l6e(0, z3o0Var, z3o0.class, "getTargetPosition", "getTargetPosition()I", 0), m6e.this.f, new Handler(Looper.getMainLooper()));
            this.f = i1eVar;
            this.g = new p2f(q8eVar, i1eVar, r5, z3o0Var, new ekf0(linearLayoutManager, i1eVar.k, i1eVar.l, new zx(this, 25)));
            l36 l36Var = m6e.this.e;
            this.h = l36Var == null ? null : new bgn(new w0d0((hxc) l36Var.b, m6e.this.a, (xmf) l36Var.a));
            n0f<Item> n0fVar = new n0f<>(new com.vk.movika.sdk.base.logic.processor.actions.g(this, 27), m6e.this.b, new com.vk.im.engine.internal.api_commands.messages.a(this, 21), new sf1(this, 27), new o1e(this, 2), m6e.this.c.getCurrentState() != Lifecycle.State.RESUMED);
            this.i = n0fVar;
            q8eVar.addOnScrollListener(n0fVar);
            adapter.registerAdapterDataObserver(v380Var);
            r5.c(new j6e(this, 0));
        }

        @Override // xsna.g64
        public final void a() {
            i1e.b a = this.f.a();
            if (a != null) {
                a.a.D4().a();
            }
        }

        @Override // xsna.m6e.d
        public final void b(q8e q8eVar, LinearLayoutManager linearLayoutManager, RecyclerView.Adapter adapter, FeedMode feedMode) {
            Log.e("ClipsFeedEngineImpl", "Trying to attach already attached engine", new IllegalStateException());
        }

        @Override // xsna.m6e.d
        public final void c() {
            f();
            m6e<Item> m6eVar = m6e.this;
            m6eVar.i = m6eVar.new c();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.o0, xsna.e4o0] */
        @Override // xsna.m6e.d
        public final void d(boolean z) {
            this.d.b().attachToRecyclerView(z ? this.a : null);
        }

        @Override // xsna.m6e.d
        public final void e(gxc gxcVar) {
            this.c = gxcVar;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.recyclerview.widget.o0, xsna.e4o0] */
        public final void f() {
            this.a.removeOnScrollListener(this.i);
            this.b.unregisterAdapterDataObserver(this.e);
            p2f p2fVar = this.g;
            p2fVar.a.removeOnScrollListener(p2fVar.e);
            ?? r1 = p2fVar.c;
            r1.b().attachToRecyclerView(null);
            r1.a();
            p2fVar.d.d = -1;
            bgn bgnVar = this.h;
            if (bgnVar != null) {
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) bgnVar.b;
                if (cVar != null) {
                    cVar.dispose();
                }
                bgnVar.b = null;
                ((w0d0) bgnVar.a).c.stop();
            }
            this.c = null;
        }

        @Override // xsna.g64
        public final void g(sht0 sht0Var) {
            this.f.d();
        }

        @Override // xsna.g64
        public final boolean h() {
            g64 D4;
            i1e.b a = this.f.a();
            return (a == null || (D4 = a.a.D4()) == null || !D4.h()) ? false : true;
        }

        @Override // xsna.m6e.d
        public final void i(boolean z) {
            n0f<Item> n0fVar = this.i;
            if (!z) {
                if (n0fVar.g) {
                    n0fVar.g = false;
                    n0fVar.m(((a) n0fVar.b.c).a);
                    return;
                }
                return;
            }
            if (n0fVar.g) {
                return;
            }
            n0fVar.g = true;
            qxr<Item> qxrVar = n0fVar.i;
            if (qxrVar == null) {
                return;
            }
            n0fVar.e.invoke(qxrVar);
            n0fVar.i = null;
        }

        @Override // xsna.g64
        public final void j(sht0 sht0Var) {
            i1e i1eVar = this.f;
            i1eVar.e.post(new vb(i1eVar, 5));
        }

        @Override // xsna.m6e.d
        public final void onDestroy() {
            f();
            m6e.this.i = new b();
        }

        @Override // xsna.m6e.d
        public final void onPause() {
            n0f<Item> n0fVar = this.i;
            if (!n0fVar.g) {
                n0fVar.g = true;
                qxr<Item> qxrVar = n0fVar.i;
                if (qxrVar != null) {
                    n0fVar.e.invoke(qxrVar);
                    n0fVar.i = null;
                }
            }
            this.g.b.c();
            bgn bgnVar = this.h;
            if (bgnVar != null) {
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) bgnVar.b;
                if (cVar != null) {
                    cVar.dispose();
                }
                bgnVar.b = null;
            }
        }

        @Override // xsna.m6e.d
        public final void onResume() {
            n0f<Item> n0fVar = this.i;
            if (n0fVar.g) {
                n0fVar.g = false;
                n0fVar.m(((a) n0fVar.b.c).a);
            }
            this.g.b.d();
        }

        @Override // xsna.g64
        public final void pause() {
            this.f.c();
        }
    }

    /* compiled from: ClipsFeedEngineImpl.kt */
    public interface d extends g64 {
        void b(q8e q8eVar, LinearLayoutManager linearLayoutManager, RecyclerView.Adapter adapter, FeedMode feedMode);

        void c();

        void d(boolean z);

        void e(gxc gxcVar);

        void i(boolean z);

        void onDestroy();

        void onPause();

        void onResume();
    }

    /* compiled from: ClipsFeedEngineImpl.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedMode.values().length];
            try {
                iArr[FeedMode.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedMode.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m6e() {
        throw null;
    }

    public m6e(mgk0 mgk0Var, dux duxVar, androidx.lifecycle.m mVar, ClipFeedListFragment.f fVar, l36 l36Var) {
        mfh0 mfh0Var = new mfh0(0);
        this.a = mgk0Var;
        this.b = duxVar;
        this.c = mVar;
        this.d = fVar;
        this.e = l36Var;
        this.f = mfh0Var;
        nt8 nt8Var = new nt8(3);
        this.g = nt8Var;
        this.h = nt8Var;
        this.i = new c();
        mVar.addObserver(new i6e(this));
    }

    public final void a(gxc gxcVar) {
        this.i.e(gxcVar);
    }

    @Override // xsna.h6e
    public final void b(q8e q8eVar, LinearLayoutManager linearLayoutManager, RecyclerView.Adapter adapter, FeedMode feedMode) {
        this.i.b(q8eVar, linearLayoutManager, adapter, feedMode);
    }

    @Override // xsna.h6e
    public final void c() {
        this.i.c();
    }

    public final void d(boolean z) {
        this.i.i(z);
    }

    /* compiled from: ClipsFeedEngineImpl.kt */
    public static final class b implements d {
        @Override // xsna.g64
        public final boolean h() {
            return false;
        }

        @Override // xsna.g64
        public final void a() {
        }

        @Override // xsna.m6e.d
        public final void c() {
        }

        @Override // xsna.m6e.d
        public final void onDestroy() {
        }

        @Override // xsna.m6e.d
        public final void onPause() {
        }

        @Override // xsna.m6e.d
        public final void onResume() {
        }

        @Override // xsna.g64
        public final void pause() {
        }

        @Override // xsna.m6e.d
        public final void d(boolean z) {
        }

        @Override // xsna.m6e.d
        public final void e(gxc gxcVar) {
        }

        @Override // xsna.g64
        public final void g(sht0 sht0Var) {
        }

        @Override // xsna.m6e.d
        public final void i(boolean z) {
        }

        @Override // xsna.g64
        public final void j(sht0 sht0Var) {
        }

        @Override // xsna.m6e.d
        public final void b(q8e q8eVar, LinearLayoutManager linearLayoutManager, RecyclerView.Adapter adapter, FeedMode feedMode) {
        }
    }

    /* compiled from: ClipsFeedEngineImpl.kt */
    public final class c implements d {
        public c() {
        }

        @Override // xsna.m6e.d
        public final void b(q8e q8eVar, LinearLayoutManager linearLayoutManager, RecyclerView.Adapter adapter, FeedMode feedMode) {
            m6e<Item> m6eVar = m6e.this;
            m6eVar.i = m6eVar.new a(q8eVar, linearLayoutManager, adapter, feedMode);
        }

        @Override // xsna.g64
        public final boolean h() {
            return false;
        }

        @Override // xsna.m6e.d
        public final void onDestroy() {
            m6e.this.i = new b();
        }

        @Override // xsna.g64
        public final void a() {
        }

        @Override // xsna.m6e.d
        public final void c() {
        }

        @Override // xsna.m6e.d
        public final void onPause() {
        }

        @Override // xsna.m6e.d
        public final void onResume() {
        }

        @Override // xsna.g64
        public final void pause() {
        }

        @Override // xsna.m6e.d
        public final void d(boolean z) {
        }

        @Override // xsna.m6e.d
        public final void e(gxc gxcVar) {
        }

        @Override // xsna.g64
        public final void g(sht0 sht0Var) {
        }

        @Override // xsna.m6e.d
        public final void i(boolean z) {
        }

        @Override // xsna.g64
        public final void j(sht0 sht0Var) {
        }
    }
}
