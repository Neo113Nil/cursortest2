package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import java.util.List;

/* compiled from: NewsfeedEvent.kt */
/* loaded from: classes4.dex */
public interface xh60 extends pk50 {

    /* compiled from: NewsfeedEvent.kt */
    public static final class a implements xh60 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2140079442;
        }

        public final String toString() {
            return "ActivateRecyclerAnimation";
        }
    }

    /* compiled from: NewsfeedEvent.kt */
    public interface b extends xh60 {

        /* compiled from: NewsfeedEvent.kt */
        public static final class a implements b {
            public final boolean a;

            public a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ButtonVisibility(visible="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        /* renamed from: xsna.xh60$b$b, reason: collision with other inner class name */
        public static final class C4002b implements b {
            public final int a;

            public C4002b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4002b) && this.a == ((C4002b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ChangeButtonVisibilityDelayed(boundary="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class c implements b {
            public final boolean a;
            public final String b;

            public c(boolean z, String str) {
                this.a = z;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.a) * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Loaded(hasNews=");
                sb.append(this.a);
                sb.append(", nextFrom=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class d implements b {
            public final int a;
            public final int b;

            public d(int i, int i2) {
                this.a = i;
                this.b = i2;
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
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ToPositionWithOffset(position=");
                sb.append(this.a);
                sb.append(", offsetPixels=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: NewsfeedEvent.kt */
    public static final class c implements xh60 {
        public static final c a = new c();
    }

    /* compiled from: NewsfeedEvent.kt */
    public static final class d implements xh60 {
        public final int a;
        public final String b;
        public final boolean c;

        public d(int i, String str, boolean z) {
            this.a = i;
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListChanged(listId=");
            sb.append(this.a);
            sb.append(", listRef=");
            sb.append(this.b);
            sb.append(", isNewsfeedTop=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: NewsfeedEvent.kt */
    public static final class e implements xh60 {
        public final yo60 a;

        public e(yo60 yo60Var) {
            this.a = yo60Var;
        }
    }

    /* compiled from: NewsfeedEvent.kt */
    public interface f extends xh60 {

        /* compiled from: NewsfeedEvent.kt */
        public static final class a implements f {
            public final boolean a;

            public a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Clear(isForceClear="), this.a, ')');
            }
        }
    }

    /* compiled from: NewsfeedEvent.kt */
    public interface g extends xh60 {
    }

    /* compiled from: NewsfeedEvent.kt */
    public interface h extends xh60 {

        /* compiled from: NewsfeedEvent.kt */
        public static final class a implements h {
            public final axl0 a;
            public final k070 b;

            public a(axl0 axl0Var, k070 k070Var) {
                this.a = axl0Var;
                this.b = k070Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "AppUpdateEvent(event=" + this.a + ", stories=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class b implements h {
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
                return defpackage.q0.a(new StringBuilder("CallInAppReviewForGarland(needReset="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class c implements h {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -261337461;
            }

            public final String toString() {
                return "InitCallInAppReview";
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class d implements h {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1473304032;
            }

            public final String toString() {
                return "Loaded";
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class e implements h {
            public final List<StoryEntry> a;
            public final k070 b;

            /* JADX WARN: Multi-variable type inference failed */
            public e(List<? extends StoryEntry> list, k070 k070Var) {
                this.a = list;
                this.b = k070Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "MarkAsSeen(stories=" + this.a + ", storiesDto=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class f implements h {
            public static final f a = new f();
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class g implements h {
            public final int a;
            public final boolean b;

            public g(int i, boolean z) {
                this.a = i;
                this.b = z;
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
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Reload(listId=");
                sb.append(this.a);
                sb.append(", isPullToRefresh=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        /* renamed from: xsna.xh60$h$h, reason: collision with other inner class name */
        public static final class C4003h implements h {
            public final ywm0 a;
            public final k070 b;

            public C4003h(ywm0 ywm0Var, k070 k070Var) {
                this.a = ywm0Var;
                this.b = k070Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4003h)) {
                    return false;
                }
                C4003h c4003h = (C4003h) obj;
                return epx.f(this.a, c4003h.a) && epx.f(this.b, c4003h.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Subscription(event=" + this.a + ", stories=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedEvent.kt */
        public static final class i implements h {
            public final UserProfile a;
            public final k070 b;

            public i(UserProfile userProfile, k070 k070Var) {
                this.a = userProfile;
                this.b = k070Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "UpdateUserProfile(userProfile=" + this.a + ", stories=" + this.b + ')';
            }
        }
    }
}
