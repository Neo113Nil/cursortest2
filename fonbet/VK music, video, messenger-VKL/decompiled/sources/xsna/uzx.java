package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.core.voip.VoipCallSource;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;

/* compiled from: JoinCallState.kt */
/* loaded from: classes7.dex */
public abstract class uzx implements km50 {

    /* compiled from: JoinCallState.kt */
    public static final class a extends uzx {
        public final CallId b;
        public final String c;
        public final String d;
        public final int e;
        public final AbstractC3860a f;
        public final boolean g;
        public final JoinData h;
        public final b i;
        public final boolean j;
        public final VoipCallSource k;

        /* compiled from: JoinCallState.kt */
        /* renamed from: xsna.uzx$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3860a {

            /* compiled from: JoinCallState.kt */
            /* renamed from: xsna.uzx$a$a$a, reason: collision with other inner class name */
            public static final class C3861a extends AbstractC3860a {
                public final wt2 a;
                public final String b;

                public C3861a(String str, wt2 wt2Var) {
                    this.a = wt2Var;
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3861a)) {
                        return false;
                    }
                    C3861a c3861a = (C3861a) obj;
                    return epx.f(this.a, c3861a.a) && epx.f(this.b, c3861a.b);
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

            /* compiled from: JoinCallState.kt */
            /* renamed from: xsna.uzx$a$a$b */
            public static final class b extends AbstractC3860a {
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

            /* compiled from: JoinCallState.kt */
            /* renamed from: xsna.uzx$a$a$c */
            public static final class c extends AbstractC3860a {
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
                    return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "AsUser(joinData=" + this.a + ", account=" + this.b + ", changeNameModel=" + this.c + ')';
                }
            }

            /* compiled from: JoinCallState.kt */
            /* renamed from: xsna.uzx$a$a$d */
            public static final class d extends AbstractC3860a {
                public static final d a = new d();
            }
        }

        public a(CallId callId, String str, String str2, int i, AbstractC3860a abstractC3860a, boolean z, JoinData joinData, b bVar, boolean z2, VoipCallSource voipCallSource) {
            this.b = callId;
            this.c = str;
            this.d = str2;
            this.e = i;
            this.f = abstractC3860a;
            this.g = z;
            this.h = joinData;
            this.i = bVar;
            this.j = z2;
            this.k = voipCallSource;
        }

        public static a a(a aVar, AbstractC3860a abstractC3860a, boolean z, b bVar, boolean z2, int i) {
            CallId callId = aVar.b;
            String str = aVar.c;
            String str2 = aVar.d;
            int i2 = aVar.e;
            if ((i & 16) != 0) {
                abstractC3860a = aVar.f;
            }
            AbstractC3860a abstractC3860a2 = abstractC3860a;
            if ((i & 32) != 0) {
                z = aVar.g;
            }
            boolean z3 = z;
            JoinData joinData = aVar.h;
            if ((i & 128) != 0) {
                bVar = aVar.i;
            }
            b bVar2 = bVar;
            boolean z4 = (i & 256) != 0 ? aVar.j : z2;
            VoipCallSource voipCallSource = aVar.k;
            aVar.getClass();
            return new a(callId, str, str2, i2, abstractC3860a2, z3, joinData, bVar2, z4, voipCallSource);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f) && this.g == aVar.g && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && this.j == aVar.j && epx.f(this.k, aVar.k);
        }

        public final int hashCode() {
            int hashCode = this.b.b.hashCode() * 31;
            String str = this.c;
            return this.k.hashCode() + qoy.b(qoy.b((this.h.hashCode() + qoy.b((this.f.hashCode() + shy.a(this.e, urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31)) * 31, 31, this.g)) * 31, 31, this.i.a), 31, this.j);
        }

        public final String toString() {
            return "Content(callId=" + this.b + ", callName=" + this.c + ", joinLink=" + this.d + ", countOfPeople=" + this.e + ", joinAs=" + this.f + ", isTransparentLoading=" + this.g + ", joinData=" + this.h + ", effectsCameraPreview=" + this.i + ", withAudio=" + this.j + ", joinCallSource=" + this.k + ')';
        }
    }

    /* compiled from: JoinCallState.kt */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("EffectsCameraPreview(cameraEnabled="), this.a, ')');
        }
    }

    /* compiled from: JoinCallState.kt */
    public static final class c extends uzx {
        public final Throwable b;

        public c(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: JoinCallState.kt */
    public static final class d extends uzx {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Loading(showLoader="), this.b, ')');
        }
    }
}
