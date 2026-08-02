package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AutoDownloadOfflineInteractor.kt */
/* loaded from: classes.dex */
public interface df5 {
    io.reactivex.rxjava3.core.a a(long j, String str, String str2);

    io.reactivex.rxjava3.core.a b(String str, String str2);

    io.reactivex.rxjava3.core.a c(String str, String str2, String str3);

    List<MusicTrack> d();

    io.reactivex.rxjava3.core.a e(long j, String str, String str2);

    io.reactivex.rxjava3.core.a f(long j, String str);

    io.reactivex.rxjava3.core.x<List<MusicTrack>> g(String str);

    io.reactivex.rxjava3.core.x<Boolean> h(String str, String str2);

    io.reactivex.rxjava3.core.x<List<String>> i(String str);

    io.reactivex.rxjava3.core.a j(MusicTrack musicTrack);

    long k(String str);

    MusicTrack l(String str);

    MusicTrack m(String str);

    boolean n(String str);

    io.reactivex.rxjava3.core.x o(long j, String str, List list);

    void p(MusicTrack musicTrack, String str);

    io.reactivex.rxjava3.core.x q(long j, String str, List list);

    String r(String str);

    /* compiled from: AutoDownloadOfflineInteractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final df5 STUB = new C2729a();

        public final df5 getSTUB() {
            return STUB;
        }

        /* compiled from: AutoDownloadOfflineInteractor.kt */
        /* renamed from: xsna.df5$a$a, reason: collision with other inner class name */
        public static final class C2729a implements df5 {
            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.a a(long j, String str, String str2) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.a b(String str, String str2) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.a c(String str, String str2, String str3) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.df5
            public final List<MusicTrack> d() {
                return EmptyList.b;
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.a e(long j, String str, String str2) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.a f(long j, String str) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.x<List<MusicTrack>> g(String str) {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.x<Boolean> h(String str, String str2) {
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.x<List<String>> i(String str) {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.a j(MusicTrack musicTrack) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.df5
            public final long k(String str) {
                return 0L;
            }

            @Override // xsna.df5
            public final MusicTrack l(String str) {
                return null;
            }

            @Override // xsna.df5
            public final MusicTrack m(String str) {
                return null;
            }

            @Override // xsna.df5
            public final boolean n(String str) {
                return false;
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.x o(long j, String str, List list) {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.df5
            public final io.reactivex.rxjava3.core.x q(long j, String str, List list) {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.df5
            public final String r(String str) {
                return null;
            }

            @Override // xsna.df5
            public final void p(MusicTrack musicTrack, String str) {
            }
        }
    }
}
