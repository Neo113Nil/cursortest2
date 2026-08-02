package xsna;

import android.content.Context;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: BrowserAuthLinkRepository.kt */
/* loaded from: classes15.dex */
public interface lk8 {

    /* compiled from: BrowserAuthLinkRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final lk8 STUB = new C3271a();

        /* compiled from: BrowserAuthLinkRepository.kt */
        /* renamed from: xsna.lk8$a$a, reason: collision with other inner class name */
        public static final class C3271a implements lk8 {
            @Override // xsna.lk8
            public final io.reactivex.rxjava3.disposables.c a(Context context) {
                return EmptyDisposable.INSTANCE;
            }
        }

        public final lk8 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.disposables.c a(Context context);
}
