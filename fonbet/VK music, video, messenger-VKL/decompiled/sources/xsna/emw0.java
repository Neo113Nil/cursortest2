package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import java.util.List;

/* compiled from: VoipChangeNameState.kt */
/* loaded from: classes7.dex */
public abstract class emw0 implements km50 {

    /* compiled from: VoipChangeNameState.kt */
    public static final class b extends emw0 {
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

    /* compiled from: VoipChangeNameState.kt */
    public static final class c extends emw0 {
        public static final c b = new c();
    }

    /* compiled from: VoipChangeNameState.kt */
    public static final class a extends emw0 {
        public final List<GroupsGroupFullDto> b;
        public final b c;
        public final cn d;
        public final String e;
        public final boolean f;
        public final boolean g;
        public final AbstractC2822a h;

        /* compiled from: VoipChangeNameState.kt */
        /* renamed from: xsna.emw0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2822a {

            /* compiled from: VoipChangeNameState.kt */
            /* renamed from: xsna.emw0$a$a$a, reason: collision with other inner class name */
            public static final class C2823a extends AbstractC2822a {
                public static final C2823a a = new C2823a();
            }

            /* compiled from: VoipChangeNameState.kt */
            /* renamed from: xsna.emw0$a$a$b */
            public static final class b extends AbstractC2822a {
                public static final b a = new b();
            }
        }

        /* compiled from: VoipChangeNameState.kt */
        public static abstract class b {

            /* compiled from: VoipChangeNameState.kt */
            /* renamed from: xsna.emw0$a$b$a, reason: collision with other inner class name */
            public static final class C2824a extends b {
                public static final C2824a a = new C2824a();
            }

            /* compiled from: VoipChangeNameState.kt */
            /* renamed from: xsna.emw0$a$b$b, reason: collision with other inner class name */
            public static final class C2825b extends b {
                public static final C2825b a = new C2825b();
            }

            /* compiled from: VoipChangeNameState.kt */
            public static final class c extends b {
                public final GroupsGroupFullDto a;

                public c(GroupsGroupFullDto groupsGroupFullDto) {
                    this.a = groupsGroupFullDto;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Group(group=" + this.a + ')';
                }
            }
        }

        public a(List<GroupsGroupFullDto> list, b bVar, cn cnVar, String str, boolean z, boolean z2, AbstractC2822a abstractC2822a) {
            this.b = list;
            this.c = bVar;
            this.d = cnVar;
            this.e = str;
            this.f = z;
            this.g = z2;
            this.h = abstractC2822a;
        }

        public static a a(a aVar, b bVar, String str, boolean z, boolean z2, AbstractC2822a abstractC2822a, int i) {
            List<GroupsGroupFullDto> list = aVar.b;
            if ((i & 2) != 0) {
                bVar = aVar.c;
            }
            b bVar2 = bVar;
            cn cnVar = aVar.d;
            if ((i & 8) != 0) {
                str = aVar.e;
            }
            String str2 = str;
            if ((i & 16) != 0) {
                z = aVar.f;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = aVar.g;
            }
            boolean z4 = z2;
            if ((i & 64) != 0) {
                abstractC2822a = aVar.h;
            }
            aVar.getClass();
            return new a(list, bVar2, cnVar, str2, z3, z4, abstractC2822a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            b bVar = this.c;
            return this.h.hashCode() + qoy.b(qoy.b(urd0.a((this.d.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            return "Content(groups=" + this.b + ", selectedUser=" + this.c + ", currentAccount=" + this.d + ", nameInTextField=" + this.e + ", isChangeNameEnabled=" + this.f + ", isLoading=" + this.g + ", changeNameValidationError=" + this.h + ')';
        }

        public /* synthetic */ a(List list, b bVar, cn cnVar, String str, boolean z) {
            this(list, bVar, cnVar, str, z, false, AbstractC2822a.C2823a.a);
        }
    }
}
