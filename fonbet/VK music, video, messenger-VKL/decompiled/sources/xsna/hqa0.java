package xsna;

import com.vk.dto.ads.PixelStats;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import xsna.eqa0;

/* compiled from: PixelStatsTracker.kt */
/* loaded from: classes14.dex */
public interface hqa0 {
    public static final a a = a.a;

    /* compiled from: PixelStatsTracker.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final hqa0 STUB = new C3017a();

        /* compiled from: PixelStatsTracker.kt */
        /* renamed from: xsna.hqa0$a$a, reason: collision with other inner class name */
        public static final class C3017a implements hqa0 {
            public final eqa0 b = eqa0.a.a.getSTUB();

            @Override // xsna.hqa0
            public final io.reactivex.rxjava3.disposables.c a(Iterable<PixelStats> iterable) {
                return EmptyDisposable.INSTANCE;
            }

            @Override // xsna.hqa0
            public final eqa0 b() {
                return this.b;
            }

            @Override // xsna.hqa0
            public final boolean c() {
                return false;
            }

            @Override // xsna.hqa0
            public final io.reactivex.rxjava3.disposables.c d(String str) {
                return EmptyDisposable.INSTANCE;
            }
        }

        public final hqa0 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.disposables.c a(Iterable<PixelStats> iterable);

    eqa0 b();

    boolean c();

    io.reactivex.rxjava3.disposables.c d(String str);
}
