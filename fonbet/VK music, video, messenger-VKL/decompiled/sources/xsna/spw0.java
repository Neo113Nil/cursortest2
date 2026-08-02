package xsna;

import java.util.ArrayList;

/* compiled from: VoipHistoryFriendsPatch.kt */
/* loaded from: classes7.dex */
public abstract class spw0 implements xl50 {

    /* compiled from: VoipHistoryFriendsPatch.kt */
    public static abstract class a extends spw0 {

        /* compiled from: VoipHistoryFriendsPatch.kt */
        /* renamed from: xsna.spw0$a$a, reason: collision with other inner class name */
        public static final class C3685a extends a {
            public final Throwable b;

            public C3685a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3685a) && epx.f(this.b, ((C3685a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VoipHistoryFriendsPatch.kt */
        public static final class b extends a {
            public final ArrayList b;
            public final int c;
            public final ArrayList d;

            public b(int i, ArrayList arrayList, ArrayList arrayList2) {
                this.b = arrayList;
                this.c = i;
                this.d = arrayList2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(importantFriends=");
                sb.append(this.b);
                sb.append(", allFriendsCount=");
                sb.append(this.c);
                sb.append(", allFriends=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
            }
        }
    }

    /* compiled from: VoipHistoryFriendsPatch.kt */
    public static abstract class b extends spw0 {

        /* compiled from: VoipHistoryFriendsPatch.kt */
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

        /* compiled from: VoipHistoryFriendsPatch.kt */
        /* renamed from: xsna.spw0$b$b, reason: collision with other inner class name */
        public static final class C3686b extends b {
            public final int b;
            public final ArrayList c;

            public C3686b(int i, ArrayList arrayList) {
                this.b = i;
                this.c = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3686b)) {
                    return false;
                }
                C3686b c3686b = (C3686b) obj;
                return this.b == c3686b.b && epx.f(this.c, c3686b.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(allFriendsCount=");
                sb.append(this.b);
                sb.append(", allFriendsPage=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
            }
        }

        /* compiled from: VoipHistoryFriendsPatch.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }

    /* compiled from: VoipHistoryFriendsPatch.kt */
    public static final class c extends spw0 {
        public static final c b = new c();
    }

    /* compiled from: VoipHistoryFriendsPatch.kt */
    public static abstract class d extends spw0 {

        /* compiled from: VoipHistoryFriendsPatch.kt */
        public static final class a extends d {
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

        /* compiled from: VoipHistoryFriendsPatch.kt */
        public static final class b extends d {
            public final ArrayList b;
            public final int c;
            public final ArrayList d;

            public b(int i, ArrayList arrayList, ArrayList arrayList2) {
                this.b = arrayList;
                this.c = i;
                this.d = arrayList2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(importantFriends=");
                sb.append(this.b);
                sb.append(", allFriendsCount=");
                sb.append(this.c);
                sb.append(", allFriends=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
            }
        }

        /* compiled from: VoipHistoryFriendsPatch.kt */
        public static final class c extends d {
            public static final c b = new c();
        }
    }
}
