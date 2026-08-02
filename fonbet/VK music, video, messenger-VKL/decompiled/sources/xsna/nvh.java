package xsna;

import com.vk.dto.newsfeed.entries.Post;

/* compiled from: CommunityProfileWallViewContract.kt */
/* loaded from: classes3.dex */
public abstract class nvh {

    /* compiled from: CommunityProfileWallViewContract.kt */
    public static abstract class a extends nvh {

        /* compiled from: CommunityProfileWallViewContract.kt */
        /* renamed from: xsna.nvh$a$a, reason: collision with other inner class name */
        public static final class C3419a extends a {
            public static final C3419a a = new C3419a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3419a);
            }

            public final int hashCode() {
                return 1666359312;
            }

            public final String toString() {
                return "AddEmptyErrorItem";
            }
        }

        /* compiled from: CommunityProfileWallViewContract.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1475033736;
            }

            public final String toString() {
                return "AddEmptyWallItem";
            }
        }

        /* compiled from: CommunityProfileWallViewContract.kt */
        public static final class c extends a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1246684487;
            }

            public final String toString() {
                return "CreationOnboardingTooltipShown";
            }
        }

        /* compiled from: CommunityProfileWallViewContract.kt */
        public static final class d extends a {
            public final Post a;

            public d(Post post) {
                this.a = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OnEntryAdded(post=" + this.a + ')';
            }
        }

        /* compiled from: CommunityProfileWallViewContract.kt */
        public static final class e extends a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1601416359;
            }

            public final String toString() {
                return "RemoveEmptyWallItem";
            }
        }

        /* compiled from: CommunityProfileWallViewContract.kt */
        public static final class f extends a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -650520357;
            }

            public final String toString() {
                return "ShowErrorToast";
            }
        }

        /* compiled from: CommunityProfileWallViewContract.kt */
        public static final class g extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                ((g) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "UpdateLoadingWall(isLoadingWall=false)";
            }
        }

        /* compiled from: CommunityProfileWallViewContract.kt */
        public static final class h extends a {
            public final int a;
            public final int b;
            public final int c;

            public h(int i, int i2, int i3) {
                this.a = i;
                this.b = i2;
                this.c = i3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UpdatePostsButtons(postponedCount=");
                sb.append(this.a);
                sb.append(", suggestedCount=");
                sb.append(this.b);
                sb.append(", draftsCount=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityProfileWallViewContract.kt */
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
