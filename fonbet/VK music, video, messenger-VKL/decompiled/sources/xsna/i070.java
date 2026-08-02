package xsna;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: NewsfeedStoriesDaemon.kt */
/* loaded from: classes6.dex */
public interface i070 {
    public static final a x7 = a.a;

    io.reactivex.rxjava3.disposables.c a();

    void f(boolean z);

    void onPause();

    void onResume();

    void stop();

    /* compiled from: NewsfeedStoriesDaemon.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final i070 STUB = new C3029a();

        public final i070 getSTUB() {
            return STUB;
        }

        /* compiled from: NewsfeedStoriesDaemon.kt */
        /* renamed from: xsna.i070$a$a, reason: collision with other inner class name */
        public static final class C3029a implements i070 {
            @Override // xsna.i070
            public final io.reactivex.rxjava3.disposables.c a() {
                return EmptyDisposable.INSTANCE;
            }

            @Override // xsna.i070
            public final void onPause() {
            }

            @Override // xsna.i070
            public final void onResume() {
            }

            @Override // xsna.i070
            public final void stop() {
            }

            @Override // xsna.i070
            public final void f(boolean z) {
            }
        }
    }
}
