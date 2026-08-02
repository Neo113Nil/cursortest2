package xsna;

import kotlin.collections.EmptyList;

/* compiled from: EduContactsProvider.kt */
/* loaded from: classes2.dex */
public interface a6p {

    /* compiled from: EduContactsProvider.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final a6p STUB = new C2527a();

        /* compiled from: EduContactsProvider.kt */
        /* renamed from: xsna.a6p$a$a, reason: collision with other inner class name */
        public static final class C2527a implements a6p {
            @Override // xsna.a6p
            public final io.reactivex.rxjava3.internal.operators.single.x a() {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.a6p
            public final io.reactivex.rxjava3.internal.operators.single.x b() {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.a6p
            public final io.reactivex.rxjava3.internal.operators.single.x c() {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }
        }

        public final a6p getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.internal.operators.single.x a();

    io.reactivex.rxjava3.internal.operators.single.x b();

    io.reactivex.rxjava3.internal.operators.single.x c();
}
