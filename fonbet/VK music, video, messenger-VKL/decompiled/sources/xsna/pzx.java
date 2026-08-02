package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.core.voip.VoipCallSource;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;

/* compiled from: JoinCallPatch.kt */
/* loaded from: classes7.dex */
public interface pzx extends xl50 {

    /* compiled from: JoinCallPatch.kt */
    public static abstract class a implements pzx {

        /* compiled from: JoinCallPatch.kt */
        /* renamed from: xsna.pzx$a$a, reason: collision with other inner class name */
        public static final class C3540a extends a {
            public final Throwable b;

            public C3540a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3540a) && epx.f(this.b, ((C3540a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: JoinCallPatch.kt */
        public static final class b extends a {
            public final String b;
            public final CallId c;
            public final String d;
            public final String e;
            public final int f;
            public final JoinData g;
            public final boolean h;
            public final VoipCallSource i;
            public final boolean j;
            public final boolean k;

            public b(String str, CallId callId, String str2, String str3, int i, JoinData joinData, boolean z, VoipCallSource voipCallSource, boolean z2, boolean z3) {
                this.b = str;
                this.c = callId;
                this.d = str2;
                this.e = str3;
                this.f = i;
                this.g = joinData;
                this.h = z;
                this.i = voipCallSource;
                this.j = z2;
                this.k = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g) && this.h == bVar.h && epx.f(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k;
            }

            public final int hashCode() {
                String str = this.b;
                int a = urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c.b);
                String str2 = this.d;
                return Boolean.hashCode(this.k) + qoy.b((this.i.hashCode() + qoy.b((this.g.hashCode() + shy.a(this.f, urd0.a((a + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e), 31)) * 31, 31, this.h)) * 31, 31, this.j);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(savedName=");
                sb.append(this.b);
                sb.append(", callId=");
                sb.append(this.c);
                sb.append(", callName=");
                sb.append(this.d);
                sb.append(", joinLink=");
                sb.append(this.e);
                sb.append(", countOfPeople=");
                sb.append(this.f);
                sb.append(", joinData=");
                sb.append(this.g);
                sb.append(", isJoinAsFeatureEnabled=");
                sb.append(this.h);
                sb.append(", callSource=");
                sb.append(this.i);
                sb.append(", isCameraOn=");
                sb.append(this.j);
                sb.append(", isMicOn=");
                return defpackage.q0.a(sb, this.k, ')');
            }
        }

        /* compiled from: JoinCallPatch.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    /* compiled from: JoinCallPatch.kt */
    public static abstract class b implements pzx {

        /* compiled from: JoinCallPatch.kt */
        public static final class a extends b {
            public final wt2 b;
            public final String c;

            public a(String str, wt2 wt2Var) {
                this.b = wt2Var;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SelectedAnonym(anonymJoinData=");
                sb.append(this.b);
                sb.append(", name=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: JoinCallPatch.kt */
        /* renamed from: xsna.pzx$b$b, reason: collision with other inner class name */
        public static final class C3541b extends b {
            public final cn b;
            public final og0 c;

            public C3541b(cn cnVar, og0 og0Var) {
                this.b = cnVar;
                this.c = og0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3541b)) {
                    return false;
                }
                C3541b c3541b = (C3541b) obj;
                return epx.f(this.b, c3541b.b) && epx.f(this.c, c3541b.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "SelectedCurrentUser(account=" + this.b + ", changeNameModel=" + this.c + ')';
            }
        }

        /* compiled from: JoinCallPatch.kt */
        public static final class c extends b {
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
                return "SelectedGroup(group=" + this.b + ')';
            }
        }
    }

    /* compiled from: JoinCallPatch.kt */
    public interface c extends pzx {

        /* compiled from: JoinCallPatch.kt */
        public static final class a implements c {
            public static final a b = new a();
        }

        /* compiled from: JoinCallPatch.kt */
        public static final class b implements c {
            public static final b b = new b();
        }
    }

    /* compiled from: JoinCallPatch.kt */
    public static abstract class d implements pzx {

        /* compiled from: JoinCallPatch.kt */
        public static final class a extends d {
        }
    }

    /* compiled from: JoinCallPatch.kt */
    public static final class e implements pzx {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("TransparentLoading(isLoading="), this.b, ')');
        }
    }
}
