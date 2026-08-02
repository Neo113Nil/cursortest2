package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import java.util.List;

/* compiled from: VoipChangeNamePatch.kt */
/* loaded from: classes7.dex */
public abstract class amw0 implements xl50 {

    /* compiled from: VoipChangeNamePatch.kt */
    public static abstract class a extends amw0 {

        /* compiled from: VoipChangeNamePatch.kt */
        /* renamed from: xsna.amw0$a$a, reason: collision with other inner class name */
        public static final class C2551a extends a {
            public final Throwable b;

            public C2551a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2551a) && epx.f(this.b, ((C2551a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VoipChangeNamePatch.kt */
        public static final class b extends amw0 {
            public final cn b;
            public final String c;
            public final c d;

            public b(cn cnVar, String str, c cVar) {
                this.b = cnVar;
                this.c = str;
                this.d = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                int a = urd0.a(this.b.hashCode() * 31, 31, this.c);
                c cVar = this.d;
                return a + (cVar == null ? 0 : cVar.hashCode());
            }

            public final String toString() {
                return "InitWithoutGroups(account=" + this.b + ", name=" + this.c + ", selectedUser=" + this.d + ')';
            }
        }

        /* compiled from: VoipChangeNamePatch.kt */
        public static abstract class c {

            /* compiled from: VoipChangeNamePatch.kt */
            /* renamed from: xsna.amw0$a$c$a, reason: collision with other inner class name */
            public static final class C2552a extends c {
                public final String a;

                public C2552a(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2552a) && epx.f(this.a, ((C2552a) obj).a);
                }

                public final int hashCode() {
                    String str = this.a;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Anonym(name="), this.a, ')');
                }
            }

            /* compiled from: VoipChangeNamePatch.kt */
            public static final class b extends c {
                public final String a;

                public b(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("CurrentUser(name="), this.a, ')');
                }
            }

            /* compiled from: VoipChangeNamePatch.kt */
            /* renamed from: xsna.amw0$a$c$c, reason: collision with other inner class name */
            public static final class C2553c extends c {
                public final GroupsGroupFullDto a;

                public C2553c(GroupsGroupFullDto groupsGroupFullDto) {
                    this.a = groupsGroupFullDto;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2553c) && epx.f(this.a, ((C2553c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Group(group=" + this.a + ')';
                }
            }
        }

        /* compiled from: VoipChangeNamePatch.kt */
        public static final class d extends a {
            public static final d b = new d();
        }

        /* compiled from: VoipChangeNamePatch.kt */
        public static final class e extends a {
            public final List<GroupsGroupFullDto> b;
            public final c c;
            public final cn d;

            public e(List<GroupsGroupFullDto> list, c cVar, cn cnVar) {
                this.b = list;
                this.c = cVar;
                this.d = cnVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                c cVar = this.c;
                return this.d.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
            }

            public final String toString() {
                return "Success(groups=" + this.b + ", selectedUser=" + this.c + ", currentAccount=" + this.d + ')';
            }
        }
    }

    /* compiled from: VoipChangeNamePatch.kt */
    public static abstract class b extends amw0 {

        /* compiled from: VoipChangeNamePatch.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: VoipChangeNamePatch.kt */
        /* renamed from: xsna.amw0$b$b, reason: collision with other inner class name */
        public static final class C2554b extends b {
            public final boolean b;

            public C2554b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2554b) && this.b == ((C2554b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Loading(isLoading="), this.b, ')');
            }
        }

        /* compiled from: VoipChangeNamePatch.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }

    /* compiled from: VoipChangeNamePatch.kt */
    public static abstract class c extends amw0 {

        /* compiled from: VoipChangeNamePatch.kt */
        public static final class a extends c {
            public final String b;

            public a(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("Anonym(name="), this.b, ')');
            }
        }

        /* compiled from: VoipChangeNamePatch.kt */
        public static final class b extends c {
            public final String b;

            public b(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("CurrentUser(name="), this.b, ')');
            }
        }

        /* compiled from: VoipChangeNamePatch.kt */
        /* renamed from: xsna.amw0$c$c, reason: collision with other inner class name */
        public static final class C2555c extends c {
            public final GroupsGroupFullDto b;

            public C2555c(GroupsGroupFullDto groupsGroupFullDto) {
                this.b = groupsGroupFullDto;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2555c) && epx.f(this.b, ((C2555c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Group(group=" + this.b + ')';
            }
        }
    }

    /* compiled from: VoipChangeNamePatch.kt */
    public static final class d extends amw0 {
        public final String b;

        public d(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("TextFieldNameChanged(name="), this.b, ')');
        }
    }
}
