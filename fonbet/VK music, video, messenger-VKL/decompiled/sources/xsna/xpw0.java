package xsna;

import java.util.List;

/* compiled from: VoipHistoryFriendsState.kt */
/* loaded from: classes7.dex */
public abstract class xpw0 implements km50 {

    /* compiled from: VoipHistoryFriendsState.kt */
    public static final class a extends xpw0 {
        public final List<gpw0> b;
        public final int c;
        public final List<gpw0> d;
        public final b e;
        public final AbstractC4033a f;

        /* compiled from: VoipHistoryFriendsState.kt */
        /* renamed from: xsna.xpw0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC4033a {

            /* compiled from: VoipHistoryFriendsState.kt */
            /* renamed from: xsna.xpw0$a$a$a, reason: collision with other inner class name */
            public static final class C4034a extends AbstractC4033a {
                public final Throwable a;

                public C4034a(Throwable th) {
                    this.a = th;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C4034a) && epx.f(this.a, ((C4034a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
                }
            }

            /* compiled from: VoipHistoryFriendsState.kt */
            /* renamed from: xsna.xpw0$a$a$b */
            public static final class b extends AbstractC4033a {
                public static final b a = new b();
            }

            /* compiled from: VoipHistoryFriendsState.kt */
            /* renamed from: xsna.xpw0$a$a$c */
            public static final class c extends AbstractC4033a {
                public static final c a = new c();
            }
        }

        /* compiled from: VoipHistoryFriendsState.kt */
        public static abstract class b {

            /* compiled from: VoipHistoryFriendsState.kt */
            /* renamed from: xsna.xpw0$a$b$a, reason: collision with other inner class name */
            public static final class C4035a extends b {
                public static final C4035a a = new C4035a();
            }

            /* compiled from: VoipHistoryFriendsState.kt */
            /* renamed from: xsna.xpw0$a$b$b, reason: collision with other inner class name */
            public static final class C4036b extends b {
                public static final C4036b a = new C4036b();
            }
        }

        public a(List<gpw0> list, int i, List<gpw0> list2, b bVar, AbstractC4033a abstractC4033a) {
            this.b = list;
            this.c = i;
            this.d = list2;
            this.e = bVar;
            this.f = abstractC4033a;
        }

        public static a a(a aVar, List list, int i, List list2, b bVar, AbstractC4033a abstractC4033a, int i2) {
            if ((i2 & 1) != 0) {
                list = aVar.b;
            }
            List list3 = list;
            if ((i2 & 2) != 0) {
                i = aVar.c;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                list2 = aVar.d;
            }
            List list4 = list2;
            if ((i2 & 8) != 0) {
                bVar = aVar.e;
            }
            b bVar2 = bVar;
            if ((i2 & 16) != 0) {
                abstractC4033a = aVar.f;
            }
            aVar.getClass();
            return new a(list3, i3, list4, bVar2, abstractC4033a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d)) * 31);
        }

        public final String toString() {
            return "Content(importantFriends=" + this.b + ", allFriendsCount=" + this.c + ", allFriends=" + this.d + ", reloadState=" + this.e + ", pagingState=" + this.f + ')';
        }
    }

    /* compiled from: VoipHistoryFriendsState.kt */
    public static final class b extends xpw0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: VoipHistoryFriendsState.kt */
    public static final class c extends xpw0 {
        public static final c b = new c();
    }
}
