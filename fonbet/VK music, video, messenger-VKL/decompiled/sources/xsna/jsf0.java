package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: RelatedMusicInVideoInteractor.kt */
/* loaded from: classes6.dex */
public interface jsf0 {
    io.reactivex.rxjava3.core.a a(UserId userId, Integer num, String str);

    boolean b(int i, Integer num);

    io.reactivex.rxjava3.core.x<csf0> c(UserId userId, Integer num, String str, String str2);

    boolean d(int i, Integer num);

    boolean e(int i, UserId userId);

    io.reactivex.rxjava3.core.q<s3q0> f();

    boolean g();

    void h();

    io.reactivex.rxjava3.core.x i(int i, UserId userId);

    /* compiled from: RelatedMusicInVideoInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final jsf0 STUB = new C3144a();

        public final jsf0 getSTUB() {
            return STUB;
        }

        /* compiled from: RelatedMusicInVideoInteractor.kt */
        /* renamed from: xsna.jsf0$a$a, reason: collision with other inner class name */
        public static final class C3144a implements jsf0 {
            @Override // xsna.jsf0
            public final io.reactivex.rxjava3.core.a a(UserId userId, Integer num, String str) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }

            @Override // xsna.jsf0
            public final boolean b(int i, Integer num) {
                return false;
            }

            @Override // xsna.jsf0
            public final io.reactivex.rxjava3.core.x<csf0> c(UserId userId, Integer num, String str, String str2) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.jsf0
            public final boolean d(int i, Integer num) {
                return false;
            }

            @Override // xsna.jsf0
            public final boolean e(int i, UserId userId) {
                return false;
            }

            @Override // xsna.jsf0
            public final io.reactivex.rxjava3.core.q<s3q0> f() {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jsf0
            public final boolean g() {
                return false;
            }

            @Override // xsna.jsf0
            public final io.reactivex.rxjava3.core.x i(int i, UserId userId) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.jsf0
            public final void h() {
            }
        }
    }
}
