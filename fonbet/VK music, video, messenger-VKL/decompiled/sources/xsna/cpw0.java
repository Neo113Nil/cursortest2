package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import java.util.List;

/* compiled from: VoipGroupSelectorState.kt */
/* loaded from: classes7.dex */
public abstract class cpw0 implements km50 {

    /* compiled from: VoipGroupSelectorState.kt */
    public static final class a extends cpw0 {
        public final List<GroupsGroupFullDto> b;
        public final AbstractC2675a c;
        public final e d;

        /* compiled from: VoipGroupSelectorState.kt */
        /* renamed from: xsna.cpw0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2675a {

            /* compiled from: VoipGroupSelectorState.kt */
            /* renamed from: xsna.cpw0$a$a$a, reason: collision with other inner class name */
            public static final class C2676a extends AbstractC2675a {
                public static final C2676a a = new C2676a();
            }

            /* compiled from: VoipGroupSelectorState.kt */
            /* renamed from: xsna.cpw0$a$a$b */
            public static final class b extends AbstractC2675a {
                public final GroupsGroupFullDto a;

                public b(GroupsGroupFullDto groupsGroupFullDto) {
                    this.a = groupsGroupFullDto;
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
                    return "Group(group=" + this.a + ')';
                }
            }
        }

        public a(List<GroupsGroupFullDto> list, AbstractC2675a abstractC2675a, e eVar) {
            this.b = list;
            this.c = abstractC2675a;
            this.d = eVar;
        }

        public static a a(a aVar, AbstractC2675a abstractC2675a, e eVar, int i) {
            List<GroupsGroupFullDto> list = aVar.b;
            if ((i & 2) != 0) {
                abstractC2675a = aVar.c;
            }
            if ((i & 4) != 0) {
                eVar = aVar.d;
            }
            aVar.getClass();
            return new a(list, abstractC2675a, eVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            AbstractC2675a abstractC2675a = this.c;
            return this.d.hashCode() + ((hashCode + (abstractC2675a == null ? 0 : abstractC2675a.hashCode())) * 31);
        }

        public final String toString() {
            return "Content(groups=" + this.b + ", selectedUser=" + this.c + ", searchState=" + this.d + ')';
        }
    }

    /* compiled from: VoipGroupSelectorState.kt */
    public static final class b extends cpw0 {
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

    /* compiled from: VoipGroupSelectorState.kt */
    public static final class c extends cpw0 {
        public static final c b = new c();
    }

    /* compiled from: VoipGroupSelectorState.kt */
    public static final class d extends cpw0 {
        public static final d b = new d();
    }

    /* compiled from: VoipGroupSelectorState.kt */
    public static abstract class e {

        /* compiled from: VoipGroupSelectorState.kt */
        public static final class a extends e {
            public static final a a = new a();
        }

        /* compiled from: VoipGroupSelectorState.kt */
        public static final class b extends e {
            public final String a;
            public final List<GroupsGroupFullDto> b;

            public b(String str, List<GroupsGroupFullDto> list) {
                this.a = str;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Visible(query=");
                sb.append(this.a);
                sb.append(", result=");
                return ms9.a(')', sb, this.b);
            }
        }
    }
}
