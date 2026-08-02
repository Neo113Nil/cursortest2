package xsna;

import com.vk.dto.group.Group;
import com.vk.voip.api.join.JoinData;
import java.util.List;

/* compiled from: CallPreviewViewState.kt */
/* loaded from: classes7.dex */
public abstract class x89 {

    /* compiled from: CallPreviewViewState.kt */
    public static final class a extends x89 {
        public final s89 a;
        public final c b;
        public final cn c;
        public final List<Group> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(s89 s89Var, c cVar, cn cnVar, List<? extends Group> list) {
            this.a = s89Var;
            this.b = cVar;
            this.c = cnVar;
            this.d = list;
        }

        public static a a(a aVar, c cVar) {
            s89 s89Var = aVar.a;
            cn cnVar = aVar.c;
            List<Group> list = aVar.d;
            aVar.getClass();
            return new a(s89Var, cVar, cnVar, list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            cn cnVar = this.c;
            return this.d.hashCode() + ((hashCode2 + (cnVar != null ? cnVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(callPreview=");
            sb.append(this.a);
            sb.append(", joinAs=");
            sb.append(this.b);
            sb.append(", currentUser=");
            sb.append(this.c);
            sb.append(", groups=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: CallPreviewViewState.kt */
    public static final class b extends x89 {
        public final t89 a;

        public b(t89 t89Var) {
            this.a = t89Var;
        }
    }

    /* compiled from: CallPreviewViewState.kt */
    public static abstract class c {

        /* compiled from: CallPreviewViewState.kt */
        public static final class a extends c {
            public final String a;
            public final wt2 b;

            public a(String str, wt2 wt2Var) {
                this.a = str;
                this.b = wt2Var;
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
                return "AsAnonym(anonymName=" + this.a + ", anonymJoinData=" + this.b + ')';
            }
        }

        /* compiled from: CallPreviewViewState.kt */
        public static final class b extends c {
            public final JoinData a;
            public final Group b;

            public b(JoinData joinData, Group group) {
                this.a = joinData;
                this.b = group;
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
                return "AsGroup(joinData=" + this.a + ", group=" + this.b + ')';
            }
        }

        /* compiled from: CallPreviewViewState.kt */
        /* renamed from: xsna.x89$c$c, reason: collision with other inner class name */
        public static final class C3983c extends c {
            public final JoinData a;
            public final cn b;
            public final og0 c;

            public C3983c(JoinData joinData, cn cnVar, og0 og0Var) {
                this.a = joinData;
                this.b = cnVar;
                this.c = og0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3983c)) {
                    return false;
                }
                C3983c c3983c = (C3983c) obj;
                return epx.f(this.a, c3983c.a) && epx.f(this.b, c3983c.b) && epx.f(this.c, c3983c.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "AsUser(joinData=" + this.a + ", currentUser=" + this.b + ", changeNameModel=" + this.c + ')';
            }
        }
    }

    /* compiled from: CallPreviewViewState.kt */
    public static final class d extends x89 {
        public static final d a = new d();
    }
}
