package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.mvi.core.internal.executors.ThreadType;
import xsna.fm50;
import xsna.km50;

/* compiled from: ViewScene.kt */
/* loaded from: classes3.dex */
public final class fi50<S extends km50, R extends fm50<? extends S>> implements n0u0<R> {
    public final c<S, R> a;
    public final fi50<S, R>.b b = new b();
    public a<S, R> c;
    public S d;

    /* compiled from: ViewScene.kt */
    public static final class a<S extends km50, R extends fm50<? extends S>> {
        public final izs<R, s3q0> a;
        public final f5z b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super R, s3q0> izsVar, f5z f5zVar) {
            this.a = izsVar;
            this.b = f5zVar;
        }
    }

    /* compiled from: ViewScene.kt */
    public final class b implements androidx.lifecycle.l {
        public b() {
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                f5zVar.getLifecycle().removeObserver(this);
                fi50.this.c = null;
            }
        }
    }

    /* compiled from: ViewScene.kt */
    public static final class c<S extends km50, R extends fm50<? extends S>> {
        public final bpn0 a;
        public final bpn0 b;

        public c(bpn0 bpn0Var, bpn0 bpn0Var2) {
            this.a = bpn0Var;
            this.b = bpn0Var2;
        }
    }

    public fi50(c<S, R> cVar) {
        this.a = cVar;
    }

    @Override // xsna.n0u0
    public final void a(izs izsVar, f5z f5zVar) {
        bpn0 bpn0Var = this.a.b;
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType[] threadTypeArr = {ThreadType.MAIN};
        aVar.getClass();
        ThreadType.a.a(threadTypeArr);
        if (f5zVar.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            f5zVar.getLifecycle().addObserver(this.b);
            this.c = new a<>(izsVar, f5zVar);
            if (this.d == null || !bpn0Var.isInitialized()) {
                return;
            }
            izsVar.invoke((fm50) bpn0Var.getValue());
        }
    }
}
