package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ShareTarget.kt */
/* loaded from: classes17.dex */
public interface f9j0 {

    /* compiled from: ShareTarget.kt */
    public static final class a implements f9j0 {
        public static final a a = new a();
    }

    /* compiled from: ShareTarget.kt */
    public static final class b implements f9j0 {
        public static final b a = new b();
    }

    /* compiled from: ShareTarget.kt */
    public interface c extends f9j0 {

        /* compiled from: ShareTarget.kt */
        public interface a extends c {

            /* compiled from: ShareTarget.kt */
            /* renamed from: xsna.f9j0$c$a$a, reason: collision with other inner class name */
            public static final class C2858a implements a {
                public final UserId a;
                public final String b;
                public final String c;
                public final boolean d;

                public C2858a(UserId userId, boolean z, String str, String str2) {
                    this.a = userId;
                    this.b = str;
                    this.c = str2;
                    this.d = z;
                }

                @Override // xsna.f9j0.c
                public final String a() {
                    return this.c;
                }

                @Override // xsna.f9j0.c
                public final boolean b() {
                    return this.d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2858a)) {
                        return false;
                    }
                    C2858a c2858a = (C2858a) obj;
                    return epx.f(this.a, c2858a.a) && epx.f(this.b, c2858a.b) && epx.f(this.c, c2858a.c) && this.d == c2858a.d;
                }

                @Override // xsna.f9j0.c
                public final UserId getId() {
                    return this.a;
                }

                @Override // xsna.f9j0.c
                public final String getName() {
                    return this.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Chat(id=");
                    sb.append(this.a);
                    sb.append(", name=");
                    sb.append(this.b);
                    sb.append(", avatarUrl=");
                    sb.append(this.c);
                    sb.append(", canSendMessage=");
                    return defpackage.q0.a(sb, this.d, ')');
                }
            }

            /* compiled from: ShareTarget.kt */
            public static final class b implements a {
                public final UserId a;
                public final String b;
                public final String c;
                public final boolean d;

                public b(UserId userId, boolean z, String str, String str2) {
                    this.a = userId;
                    this.b = str;
                    this.c = str2;
                    this.d = z;
                }

                @Override // xsna.f9j0.c
                public final String a() {
                    return this.c;
                }

                @Override // xsna.f9j0.c
                public final boolean b() {
                    return this.d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
                }

                @Override // xsna.f9j0.c
                public final UserId getId() {
                    return this.a;
                }

                @Override // xsna.f9j0.c
                public final String getName() {
                    return this.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Contact(id=");
                    sb.append(this.a);
                    sb.append(", name=");
                    sb.append(this.b);
                    sb.append(", avatarUrl=");
                    sb.append(this.c);
                    sb.append(", canSendMessage=");
                    return defpackage.q0.a(sb, this.d, ')');
                }
            }

            /* compiled from: ShareTarget.kt */
            /* renamed from: xsna.f9j0$c$a$c, reason: collision with other inner class name */
            public static final class C2859c implements a {
                public final UserId a;
                public final String b;
                public final String c;
                public final boolean d;

                public C2859c(UserId userId, boolean z, String str, String str2) {
                    this.a = userId;
                    this.b = str;
                    this.c = str2;
                    this.d = z;
                }

                @Override // xsna.f9j0.c
                public final String a() {
                    return this.c;
                }

                @Override // xsna.f9j0.c
                public final boolean b() {
                    return this.d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2859c)) {
                        return false;
                    }
                    C2859c c2859c = (C2859c) obj;
                    return epx.f(this.a, c2859c.a) && epx.f(this.b, c2859c.b) && epx.f(this.c, c2859c.c) && this.d == c2859c.d;
                }

                @Override // xsna.f9j0.c
                public final UserId getId() {
                    return this.a;
                }

                @Override // xsna.f9j0.c
                public final String getName() {
                    return this.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Group(id=");
                    sb.append(this.a);
                    sb.append(", name=");
                    sb.append(this.b);
                    sb.append(", avatarUrl=");
                    sb.append(this.c);
                    sb.append(", canSendMessage=");
                    return defpackage.q0.a(sb, this.d, ')');
                }
            }

            /* compiled from: ShareTarget.kt */
            public static final class d implements a {
                public final UserId a;
                public final String b;
                public final String c;
                public final boolean d;

                public d(UserId userId, boolean z, String str, String str2) {
                    this.a = userId;
                    this.b = str;
                    this.c = str2;
                    this.d = z;
                }

                @Override // xsna.f9j0.c
                public final String a() {
                    return this.c;
                }

                @Override // xsna.f9j0.c
                public final boolean b() {
                    return this.d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d;
                }

                @Override // xsna.f9j0.c
                public final UserId getId() {
                    return this.a;
                }

                @Override // xsna.f9j0.c
                public final String getName() {
                    return this.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("User(id=");
                    sb.append(this.a);
                    sb.append(", name=");
                    sb.append(this.b);
                    sb.append(", avatarUrl=");
                    sb.append(this.c);
                    sb.append(", canSendMessage=");
                    return defpackage.q0.a(sb, this.d, ')');
                }
            }
        }

        /* compiled from: ShareTarget.kt */
        public static final class b implements c {
            public final UserId a;
            public final String b;
            public final String c;
            public final boolean d;

            public b(UserId userId, boolean z, String str, String str2) {
                this.a = userId;
                this.b = str;
                this.c = str2;
                this.d = z;
            }

            @Override // xsna.f9j0.c
            public final String a() {
                return this.c;
            }

            @Override // xsna.f9j0.c
            public final boolean b() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
            }

            @Override // xsna.f9j0.c
            public final UserId getId() {
                return this.a;
            }

            @Override // xsna.f9j0.c
            public final String getName() {
                return this.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FriendTarget(id=");
                sb.append(this.a);
                sb.append(", name=");
                sb.append(this.b);
                sb.append(", avatarUrl=");
                sb.append(this.c);
                sb.append(", canSendMessage=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        String a();

        boolean b();

        UserId getId();

        String getName();
    }
}
