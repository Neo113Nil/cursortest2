package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: CallParticipantViewModel.kt */
/* loaded from: classes7.dex */
public final class b89 {
    public final h a;
    public final a b;
    public final c c;

    /* compiled from: CallParticipantViewModel.kt */
    public static abstract class a {

        /* compiled from: CallParticipantViewModel.kt */
        /* renamed from: xsna.b89$a$a, reason: collision with other inner class name */
        public static final class C2597a extends a {
            public final Throwable a;

            public C2597a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2597a) && epx.f(this.a, ((C2597a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: CallParticipantViewModel.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: CallParticipantViewModel.kt */
        public static final class c extends a {
            public static final c a = new c();
        }

        /* compiled from: CallParticipantViewModel.kt */
        public static final class d extends a {
            public static final d a = new d();
        }
    }

    /* compiled from: CallParticipantViewModel.kt */
    public static final class b {
        public final CallId a;
        public final String b;
        public final String c;
        public final String d;
        public final UserId e;

        public b(CallId callId, String str, String str2, String str3, UserId userId) {
            this.a = callId;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.a.b.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            UserId userId = this.e;
            return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeName(callId=");
            sb.append(this.a);
            sb.append(", participantId=");
            sb.append(this.b);
            sb.append(", realName=");
            sb.append(this.c);
            sb.append(", changedName=");
            sb.append(this.d);
            sb.append(", groupId=");
            return gp.b(sb, this.e, ')');
        }
    }

    /* compiled from: CallParticipantViewModel.kt */
    public static abstract class c {

        /* compiled from: CallParticipantViewModel.kt */
        public static final class a extends c {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: CallParticipantViewModel.kt */
        public static final class b extends c {
            public static final b a = new b();
        }

        /* compiled from: CallParticipantViewModel.kt */
        /* renamed from: xsna.b89$c$c, reason: collision with other inner class name */
        public static final class C2598c extends c {
            public static final C2598c a = new C2598c();
        }

        /* compiled from: CallParticipantViewModel.kt */
        public static final class d extends c {
            public static final d a = new d();
        }
    }

    /* compiled from: CallParticipantViewModel.kt */
    public static final class d {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MediaRequestAttention(isVisible="), this.a, ')');
        }
    }

    /* compiled from: CallParticipantViewModel.kt */
    public static final class e {
        public final boolean a;
        public final MediaOptionState b;

        public e(boolean z, MediaOptionState mediaOptionState) {
            this.a = z;
            this.b = mediaOptionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingMicrophone(isVisible=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: CallParticipantViewModel.kt */
    public static final class f {
        public final boolean a;
        public final MediaOptionState b;

        public f(boolean z, MediaOptionState mediaOptionState) {
            this.a = z;
            this.b = mediaOptionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingVideo(isVisible=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: CallParticipantViewModel.kt */
    public static final class g {
        public final boolean a;
        public final MediaOptionState b;

        public g(boolean z, MediaOptionState mediaOptionState) {
            this.a = z;
            this.b = mediaOptionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingWatchTogether(isVisible=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: CallParticipantViewModel.kt */
    public static abstract class h {

        /* compiled from: CallParticipantViewModel.kt */
        public static final class a extends h {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: CallParticipantViewModel.kt */
        public static final class b extends h {
            public final sew0 a;
            public final CharSequence b;
            public final boolean c;
            public final boolean d;
            public final boolean e;
            public final boolean f;
            public final boolean g;
            public final boolean h;
            public final boolean i;
            public final boolean j;
            public final boolean k;
            public final boolean l;
            public final boolean m;
            public final boolean n;
            public final e o;
            public final f p;
            public final g q;
            public final d r;
            public final boolean s;
            public final boolean t;
            public final boolean u;
            public final boolean v;
            public final b w;

            public b(sew0 sew0Var, CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, e eVar, f fVar, g gVar, d dVar, boolean z13, boolean z14, boolean z15, boolean z16, b bVar) {
                this.a = sew0Var;
                this.b = charSequence;
                this.c = z;
                this.d = z2;
                this.e = z3;
                this.f = z4;
                this.g = z5;
                this.h = z6;
                this.i = z7;
                this.j = z8;
                this.k = z9;
                this.l = z10;
                this.m = z11;
                this.n = z12;
                this.o = eVar;
                this.p = fVar;
                this.q = gVar;
                this.r = dVar;
                this.s = z13;
                this.t = z14;
                this.u = z15;
                this.v = z16;
                this.w = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && this.m == bVar.m && this.n == bVar.n && epx.f(this.o, bVar.o) && epx.f(this.p, bVar.p) && epx.f(this.q, bVar.q) && epx.f(this.r, bVar.r) && this.s == bVar.s && this.t == bVar.t && this.u == bVar.u && this.v == bVar.v && epx.f(this.w, bVar.w);
            }

            public final int hashCode() {
                int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(u11.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31)) * 31)) * 31, 31, this.r.a), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
                b bVar = this.w;
                return b + (bVar == null ? 0 : bVar.hashCode());
            }

            public final String toString() {
                return "Info(avatar=" + this.a + ", name=" + ((Object) this.b) + ", isFemale=" + this.c + ", isConnecting=" + this.d + ", canOpenProfile=" + this.e + ", canAddToFriend=" + this.f + ", canJoinToCommunity=" + this.g + ", canWrite=" + this.h + ", canExcludeFromCall=" + this.i + ", canLowerHand=" + this.j + ", canGrantAdmin=" + this.k + ", isAdmin=" + this.l + ", canPin=" + this.m + ", isPinned=" + this.n + ", mediaSettingMicrophone=" + this.o + ", mediaSettingVideo=" + this.p + ", mediaSettingWatchTogether=" + this.q + ", mediaRequestAttention=" + this.r + ", canRemoveWaitingUser=" + this.s + ", canMoveToWaitingRoom=" + this.t + ", isAnon=" + this.u + ", isCommunity=" + this.v + ", changeName=" + this.w + ')';
            }
        }

        /* compiled from: CallParticipantViewModel.kt */
        public static final class c extends h {
            public static final c a = new c();
        }
    }

    public b89(h hVar, a aVar, c cVar) {
        this.a = hVar;
        this.b = aVar;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b89)) {
            return false;
        }
        b89 b89Var = (b89) obj;
        return epx.f(this.a, b89Var.a) && epx.f(this.b, b89Var.b) && epx.f(this.c, b89Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CallParticipantViewModel(settings=" + this.a + ", addToFriends=" + this.b + ", joinToCommunity=" + this.c + ')';
    }
}
