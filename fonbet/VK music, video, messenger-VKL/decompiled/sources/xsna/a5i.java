package xsna;

/* compiled from: CommunityWallBus.kt */
/* loaded from: classes5.dex */
public interface a5i {
    public static final a a = a.a;

    default io.reactivex.rxjava3.core.q<c5i> a() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    /* compiled from: CommunityWallBus.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final a5i STUB = new C2522a();

        public final a5i getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityWallBus.kt */
        /* renamed from: xsna.a5i$a$a, reason: collision with other inner class name */
        public static final class C2522a implements a5i {
            @Override // xsna.a5i
            public final io.reactivex.rxjava3.core.q<c5i> a() {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.a5i
            public final void b(c5i c5iVar) {
            }
        }
    }

    default void b(c5i c5iVar) {
    }
}
