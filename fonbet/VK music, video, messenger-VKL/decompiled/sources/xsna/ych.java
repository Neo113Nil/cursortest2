package xsna;

/* compiled from: CommunityPostsSubscriptionRxBus.kt */
/* loaded from: classes5.dex */
public interface ych {
    public static final a a = a.a;

    /* compiled from: CommunityPostsSubscriptionRxBus.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ych STUB = new C4090a();

        /* compiled from: CommunityPostsSubscriptionRxBus.kt */
        /* renamed from: xsna.ych$a$a, reason: collision with other inner class name */
        public static final class C4090a implements ych {
            @Override // xsna.ych
            public final io.reactivex.rxjava3.core.q<qwc0> a() {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }
        }

        public final ych getSTUB() {
            return STUB;
        }
    }

    default io.reactivex.rxjava3.core.q<qwc0> a() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }
}
