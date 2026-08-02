package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.core.voip.VoipCallSource;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;

/* compiled from: CallJoiningHolder.kt */
/* loaded from: classes7.dex */
public final class s0y {
    public final CallId a;
    public final boolean b;
    public final boolean c;
    public final kyv d;
    public final a e;
    public final JoinData f;
    public final VoipCallSource g;

    /* compiled from: CallJoiningHolder.kt */
    public static abstract class a {

        /* compiled from: CallJoiningHolder.kt */
        /* renamed from: xsna.s0y$a$a, reason: collision with other inner class name */
        public static final class C3646a extends a {
            public final wt2 a;
            public final String b;

            public C3646a(String str, wt2 wt2Var) {
                this.a = wt2Var;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3646a)) {
                    return false;
                }
                C3646a c3646a = (C3646a) obj;
                return epx.f(this.a, c3646a.a) && epx.f(this.b, c3646a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AsAnonym(anonymJoinData=");
                sb.append(this.a);
                sb.append(", name=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: CallJoiningHolder.kt */
        public static final class b extends a {
            public final JoinData a;
            public final GroupsGroupFullDto b;

            public b(JoinData joinData, GroupsGroupFullDto groupsGroupFullDto) {
                this.a = joinData;
                this.b = groupsGroupFullDto;
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

        /* compiled from: CallJoiningHolder.kt */
        public static final class c extends a {
            public final JoinData a;
            public final cn b;
            public final og0 c;

            public c(JoinData joinData, cn cnVar, og0 og0Var) {
                this.a = joinData;
                this.b = cnVar;
                this.c = og0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                og0 og0Var = this.c;
                return hashCode + (og0Var == null ? 0 : og0Var.hashCode());
            }

            public final String toString() {
                return "AsUser(joinData=" + this.a + ", account=" + this.b + ", changeNameModel=" + this.c + ')';
            }
        }

        /* compiled from: CallJoiningHolder.kt */
        public static final class d extends a {
            public static final d a = new d();
        }
    }

    public s0y(CallId callId, boolean z, boolean z2, kyv kyvVar, a aVar, JoinData joinData, VoipCallSource voipCallSource) {
        this.a = callId;
        this.b = z;
        this.c = z2;
        this.d = kyvVar;
        this.e = aVar;
        this.f = joinData;
        this.g = voipCallSource;
    }
}
