package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: Either.kt */
/* loaded from: classes17.dex */
public abstract class oap<A, B> {

    /* compiled from: Either.kt */
    public static final class a<A> extends oap {
        public final A a;

        public a(A a) {
            this.a = a;
        }

        public final A c() {
            return this.a;
        }
    }

    /* compiled from: Either.kt */
    public static final class b<B> extends oap {
        public final B a;

        public b(B b) {
            this.a = b;
        }

        public final B c() {
            return this.a;
        }
    }

    public final A a() {
        if (this instanceof b) {
            return null;
        }
        if (this instanceof a) {
            return ((a) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final B b() {
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
