package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SocialGraphFriendsMvi.kt */
/* loaded from: classes5.dex */
public abstract class sdk0 implements xl50 {

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static abstract class a extends sdk0 {

        /* compiled from: SocialGraphFriendsMvi.kt */
        /* renamed from: xsna.sdk0$a$a, reason: collision with other inner class name */
        public static final class C3662a extends a {
        }

        /* compiled from: SocialGraphFriendsMvi.kt */
        public static final class b extends a {
        }
    }

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static abstract class b extends sdk0 {

        /* compiled from: SocialGraphFriendsMvi.kt */
        public static final class a extends b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: SocialGraphFriendsMvi.kt */
        /* renamed from: xsna.sdk0$b$b, reason: collision with other inner class name */
        public static final class C3663b extends b {
            public final List<itx> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C3663b(List<? extends itx> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3663b) && epx.f(this.b, ((C3663b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Loaded(list="), this.b);
            }
        }

        /* compiled from: SocialGraphFriendsMvi.kt */
        public static final class c extends b {
            public static final c b = new c();
        }

        /* compiled from: SocialGraphFriendsMvi.kt */
        public static final class d extends b {
            public final ArrayList b;

            public d(ArrayList arrayList) {
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SearchResult(list="), this.b);
            }
        }
    }
}
