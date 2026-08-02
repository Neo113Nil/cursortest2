package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.NotImplementedError;

/* compiled from: PodcastInteractor.kt */
/* loaded from: classes3.dex */
public interface phb0 {

    /* compiled from: PodcastInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final phb0 STUB = new C3512a();

        /* compiled from: PodcastInteractor.kt */
        /* renamed from: xsna.phb0$a$a, reason: collision with other inner class name */
        public static final class C3512a implements phb0 {
            @Override // xsna.phb0
            public final io.reactivex.rxjava3.core.a a(String str) {
                return io.reactivex.rxjava3.core.a.k(new NotImplementedError());
            }

            @Override // xsna.phb0
            public final io.reactivex.rxjava3.core.a b(UserId userId, Integer num, String str, String str2) {
                return io.reactivex.rxjava3.core.a.k(new NotImplementedError());
            }

            @Override // xsna.phb0
            public final io.reactivex.rxjava3.core.a c(UserId userId, Integer num, String str, String str2) {
                return io.reactivex.rxjava3.core.a.k(new NotImplementedError());
            }

            @Override // xsna.phb0
            public final io.reactivex.rxjava3.core.a d(String str) {
                return io.reactivex.rxjava3.core.a.k(new NotImplementedError());
            }
        }

        public final phb0 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.a a(String str);

    io.reactivex.rxjava3.core.a b(UserId userId, Integer num, String str, String str2);

    io.reactivex.rxjava3.core.a c(UserId userId, Integer num, String str, String str2);

    io.reactivex.rxjava3.core.a d(String str);
}
