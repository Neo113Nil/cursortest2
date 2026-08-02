package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;

/* compiled from: PageState.kt */
/* loaded from: classes17.dex */
public final class ea90 {
    public final PaginationKey a;
    public final a b;

    /* compiled from: PageState.kt */
    public static abstract class a {

        /* compiled from: PageState.kt */
        /* renamed from: xsna.ea90$a$a, reason: collision with other inner class name */
        public static final class C2790a extends a {
            public final Throwable a;

            public C2790a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2790a) && epx.f(this.a, ((C2790a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }

        /* compiled from: PageState.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1055997022;
            }

            public final String toString() {
                return "Idle";
            }
        }

        /* compiled from: PageState.kt */
        public static final class c extends a {
            public final long a;

            public c(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("Loading(startTimestampMs="));
            }
        }
    }

    public ea90(PaginationKey paginationKey, a aVar) {
        this.a = paginationKey;
        this.b = aVar;
    }

    public static ea90 a(ea90 ea90Var, PaginationKey paginationKey, a aVar, int i) {
        if ((i & 1) != 0) {
            paginationKey = ea90Var.a;
        }
        if ((i & 2) != 0) {
            aVar = ea90Var.b;
        }
        ea90Var.getClass();
        return new ea90(paginationKey, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea90)) {
            return false;
        }
        ea90 ea90Var = (ea90) obj;
        return epx.f(this.a, ea90Var.a) && epx.f(this.b, ea90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageState(paginationKey=" + this.a + ", paginationState=" + this.b + ')';
    }
}
