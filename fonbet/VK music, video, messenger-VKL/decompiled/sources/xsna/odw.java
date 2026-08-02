package xsna;

import com.vk.dto.common.Peer;
import java.util.Set;

/* compiled from: ImStoriesInfoHelper.kt */
/* loaded from: classes.dex */
public interface odw {
    public static final a a = a.a;

    io.reactivex.rxjava3.core.q<ndw> a();

    void b(Peer peer);

    io.reactivex.rxjava3.core.a c(Set<? extends Peer> set);

    void d(Set<? extends Peer> set);

    /* compiled from: ImStoriesInfoHelper.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C3450a b = new C3450a();

        public static C3450a a() {
            return b;
        }

        /* compiled from: ImStoriesInfoHelper.kt */
        /* renamed from: xsna.odw$a$a, reason: collision with other inner class name */
        public static final class C3450a implements odw {
            public final io.reactivex.rxjava3.internal.operators.observable.g0 b = io.reactivex.rxjava3.internal.operators.observable.g0.b;

            @Override // xsna.odw
            public final io.reactivex.rxjava3.core.q<ndw> a() {
                return this.b;
            }

            @Override // xsna.odw
            public final io.reactivex.rxjava3.core.a c(Set<? extends Peer> set) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.odw
            public final void b(Peer peer) {
            }

            @Override // xsna.odw
            public final void d(Set<? extends Peer> set) {
            }
        }
    }
}
