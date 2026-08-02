package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VoipGroupSelectorPatch.kt */
/* loaded from: classes7.dex */
public abstract class yow0 implements xl50 {

    /* compiled from: VoipGroupSelectorPatch.kt */
    public static abstract class a extends yow0 {

        /* compiled from: VoipGroupSelectorPatch.kt */
        /* renamed from: xsna.yow0$a$a, reason: collision with other inner class name */
        public static final class C4125a extends a {
            public static final C4125a b = new C4125a();
        }
    }

    /* compiled from: VoipGroupSelectorPatch.kt */
    public static abstract class b extends yow0 {

        /* compiled from: VoipGroupSelectorPatch.kt */
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

        /* compiled from: VoipGroupSelectorPatch.kt */
        /* renamed from: xsna.yow0$b$b, reason: collision with other inner class name */
        public static final class C4126b extends b {
            public static final C4126b b = new C4126b();
        }

        /* compiled from: VoipGroupSelectorPatch.kt */
        public static final class c extends b {
            public final List<GroupsGroupFullDto> b;
            public final a c;

            /* compiled from: VoipGroupSelectorPatch.kt */
            public static abstract class a {

                /* compiled from: VoipGroupSelectorPatch.kt */
                /* renamed from: xsna.yow0$b$c$a$a, reason: collision with other inner class name */
                public static final class C4127a extends a {
                    public static final C4127a a = new C4127a();
                }

                /* compiled from: VoipGroupSelectorPatch.kt */
                /* renamed from: xsna.yow0$b$c$a$b, reason: collision with other inner class name */
                public static final class C4128b extends a {
                    public static final C4128b a = new C4128b();
                }

                /* compiled from: VoipGroupSelectorPatch.kt */
                /* renamed from: xsna.yow0$b$c$a$c, reason: collision with other inner class name */
                public static final class C4129c extends a {
                    public final GroupsGroupFullDto a;

                    public C4129c(GroupsGroupFullDto groupsGroupFullDto) {
                        this.a = groupsGroupFullDto;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C4129c) && epx.f(this.a, ((C4129c) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return "Group(group=" + this.a + ')';
                    }
                }
            }

            public c(List<GroupsGroupFullDto> list, a aVar) {
                this.b = list;
                this.c = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                a aVar = this.c;
                return hashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            public final String toString() {
                return "Success(groups=" + this.b + ", selectedUser=" + this.c + ')';
            }
        }
    }

    /* compiled from: VoipGroupSelectorPatch.kt */
    public static abstract class c extends yow0 {

        /* compiled from: VoipGroupSelectorPatch.kt */
        public static final class a extends c {
            public static final a b = new a();
        }

        /* compiled from: VoipGroupSelectorPatch.kt */
        public static final class b extends c {
            public final String b;
            public final ArrayList c;

            public b(String str, ArrayList arrayList) {
                this.b = str;
                this.c = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(query=");
                sb.append(this.b);
                sb.append(", result=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
            }
        }

        /* compiled from: VoipGroupSelectorPatch.kt */
        /* renamed from: xsna.yow0$c$c, reason: collision with other inner class name */
        public static final class C4130c extends c {
            public static final C4130c b = new C4130c();
        }
    }

    /* compiled from: VoipGroupSelectorPatch.kt */
    public static abstract class d extends yow0 {

        /* compiled from: VoipGroupSelectorPatch.kt */
        public static final class a extends d {
            public static final a b = new a();
        }

        /* compiled from: VoipGroupSelectorPatch.kt */
        public static final class b extends d {
            public static final b b = new b();
        }

        /* compiled from: VoipGroupSelectorPatch.kt */
        public static final class c extends d {
            public final GroupsGroupFullDto b;

            public c(GroupsGroupFullDto groupsGroupFullDto) {
                this.b = groupsGroupFullDto;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Group(group=" + this.b + ')';
            }
        }
    }
}
