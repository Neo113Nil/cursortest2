package xsna;

import androidx.lifecycle.Lifecycle;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.ExecutorService;

/* compiled from: LifecycleChannel.kt */
/* loaded from: classes3.dex */
public final class f4z<T> implements wj50<T> {
    public final io.reactivex.rxjava3.subjects.f<T> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.wj50
    public final fq9 a(izs izsVar, f5z f5zVar) {
        if (!f5zVar.getLifecycle().getCurrentState().a(Lifecycle.State.INITIALIZED)) {
            return new mgn(EmptyDisposable.INSTANCE);
        }
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        mgn mgnVar = new mgn(this.a.a0(yiz.f(je00.b)).subscribe(new x4v(izsVar, 1)));
        f5zVar.getLifecycle().addObserver(new a(mgnVar));
        return mgnVar;
    }

    @Override // xsna.wj50
    public final void b(T t) {
        this.a.onNext(t);
    }

    /* compiled from: LifecycleChannel.kt */
    public static final class a implements nhl {
        public final mgn b;

        public a(mgn mgnVar) {
            this.b = mgnVar;
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
            f5zVar.getLifecycle().removeObserver(this);
            this.b.cancel();
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
        }
    }
}
