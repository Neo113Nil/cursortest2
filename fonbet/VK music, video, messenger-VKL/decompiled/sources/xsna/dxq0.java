package xsna;

/* compiled from: UserProfileWallViewContract.kt */
/* loaded from: classes3.dex */
public abstract class dxq0 {

    /* compiled from: UserProfileWallViewContract.kt */
    public static abstract class a extends dxq0 {

        /* compiled from: UserProfileWallViewContract.kt */
        /* renamed from: xsna.dxq0$a$a, reason: collision with other inner class name */
        public static final class C2768a extends a {
            public static final C2768a a = new C2768a();
        }

        /* compiled from: UserProfileWallViewContract.kt */
        public static final class b extends a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("AddEmptyWallItem(isMyWall="), this.a, ')');
            }
        }

        /* compiled from: UserProfileWallViewContract.kt */
        public static final class c extends a {
            public static final c a = new c();
        }

        /* compiled from: UserProfileWallViewContract.kt */
        public static final class d extends a {
            public final boolean a;
            public final boolean b;

            public d(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && this.b == dVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UpdateCanSeeArchivedPosts(canSeeArchivedPosts=");
                sb.append(this.a);
                sb.append(", lastPostWereUnarchived=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileWallViewContract.kt */
        public static final class e extends a {
            public final int a;

            public e(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("UpdateDraftsCount(count="), this.a, ')');
            }
        }

        /* compiled from: UserProfileWallViewContract.kt */
        public static final class f extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                ((f) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "UpdateLoadingWall(isLoadingWall=false)";
            }
        }

        /* compiled from: UserProfileWallViewContract.kt */
        public static final class g extends a {
            public final int a;
            public final int b;

            public g(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.a == gVar.a && this.b == gVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UpdatePostponedAndSuggestedCounts(postponedCount=");
                sb.append(this.a);
                sb.append(", suggestedCount=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileWallViewContract.kt */
        public static final class h extends a {
            public final int a;

            public h(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("UpdatePostponedCount(count="), this.a, ')');
            }
        }

        /* compiled from: UserProfileWallViewContract.kt */
        public static final class i extends a {
            public final int a;

            public i(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.a == ((i) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("UpdateTotalPostsCount(count="), this.a, ')');
            }
        }
    }
}
