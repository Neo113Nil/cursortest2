package xsna;

import kotlin.Result;

/* compiled from: MusicClearStorageInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class ff40 implements io.reactivex.rxjava3.core.c {
    public final /* synthetic */ lq9 b;

    /* compiled from: MusicClearStorageInteractorImpl.kt */
    public static final class a implements izs<Throwable, s3q0> {
        public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

        public a(io.reactivex.rxjava3.disposables.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            this.b.dispose();
            return s3q0.a;
        }
    }

    public ff40(lq9 lq9Var) {
        this.b = lq9Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onComplete() {
        this.b.resumeWith(s3q0.a);
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onError(Throwable th) {
        this.b.resumeWith(new Result.Failure(th));
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        this.b.r(new a(cVar));
    }
}
