package xsna;

/* compiled from: DiskSpaceAllocator.kt */
/* loaded from: classes8.dex */
public abstract class wu1 {

    /* compiled from: DiskSpaceAllocator.kt */
    public static abstract class a extends wu1 {

        /* compiled from: DiskSpaceAllocator.kt */
        /* renamed from: xsna.wu1$a$a, reason: collision with other inner class name */
        public static final class C3958a extends a {
            public final Exception a;

            public C3958a(Exception exc) {
                this.a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3958a) && epx.f(this.a, ((C3958a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Exception(cause=" + this.a + ")";
            }
        }

        /* compiled from: DiskSpaceAllocator.kt */
        public static final class b extends a {
            public final long a;
            public final long b;

            public b(long j, long j2) {
                this.a = j;
                this.b = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                return efz.b(this.b, ")", fp.b(this.a, "NotEnoughSpace(required=", ", available="));
            }
        }

        /* compiled from: DiskSpaceAllocator.kt */
        public static final class c extends a {
            public final long a;
            public final long b;

            public c(long j, long j2) {
                this.a = j;
                this.b = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                return efz.b(this.b, ")", fp.b(this.a, "RequireMoreBytesThanMaxAllocationBytes(requiredSize=", ", maxAllocationSize="));
            }
        }

        /* compiled from: DiskSpaceAllocator.kt */
        public static final class d extends a {
            public static final d a = new d();
        }
    }

    /* compiled from: DiskSpaceAllocator.kt */
    public static final class b extends wu1 {
        public static final b a = new b();
    }

    /* compiled from: DiskSpaceAllocator.kt */
    public static final class c extends wu1 {
        public static final c a = new c();
    }
}
