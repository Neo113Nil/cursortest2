package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.voip.dto.call_member.CallMemberId;
import xsna.b89;

/* compiled from: VoipParticipantSettingsState.kt */
/* loaded from: classes7.dex */
public final class buw0 implements km50 {
    public final boolean b;
    public final Throwable c;
    public final c d;
    public final b e;
    public final d f;
    public final a g;

    /* compiled from: VoipParticipantSettingsState.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final b89.b f;
        public final boolean g;

        public a() {
            this(false, false, false, false, false, null, false, 255);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            b89.b bVar = this.f;
            return Boolean.hashCode(this.g) + ((b + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Control(isShowToolbar=false, canOpenProfile=");
            sb.append(this.a);
            sb.append(", canPin=");
            sb.append(this.b);
            sb.append(", canGrantedAdmin=");
            sb.append(this.c);
            sb.append(", canMediaRequestAttention=");
            sb.append(this.d);
            sb.append(", canMoveToWaitingRoom=");
            sb.append(this.e);
            sb.append(", changeName=");
            sb.append(this.f);
            sb.append(", canExclude=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, b89.b bVar, boolean z6, int i) {
            z = (i & 2) != 0 ? false : z;
            z2 = (i & 4) != 0 ? false : z2;
            z3 = (i & 8) != 0 ? false : z3;
            z4 = (i & 16) != 0 ? false : z4;
            z5 = (i & 32) != 0 ? false : z5;
            bVar = (i & 64) != 0 ? null : bVar;
            z6 = (i & 128) != 0 ? false : z6;
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = bVar;
            this.g = z6;
        }
    }

    /* compiled from: VoipParticipantSettingsState.kt */
    public static final class b {
        public final CallMemberId a;
        public final boolean b;
        public final boolean c;
        public final sew0 d;
        public final String e;
        public final String f;
        public final boolean g;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && this.g == bVar.g;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            sew0 sew0Var = this.d;
            return Boolean.hashCode(this.g) + urd0.a(urd0.a((b + (sew0Var == null ? 0 : sew0Var.hashCode())) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Participant(id=");
            sb.append(this.a);
            sb.append(", isSelf=");
            sb.append(this.b);
            sb.append(", isAdmin=");
            sb.append(this.c);
            sb.append(", avatar=");
            sb.append(this.d);
            sb.append(", name=");
            sb.append(this.e);
            sb.append(", nameGen=");
            sb.append(this.f);
            sb.append(", isFemale=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        public b(CallMemberId callMemberId, boolean z, boolean z2, sew0 sew0Var, String str, String str2, boolean z3) {
            this.a = callMemberId;
            this.b = z;
            this.c = z2;
            this.d = sew0Var;
            this.e = str;
            this.f = str2;
            this.g = z3;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            this(CallMemberId.a.a(String.valueOf(UserId.d.b)), false, false, null, "", "", false);
            Serializer.c<CallMemberId> cVar = CallMemberId.CREATOR;
        }
    }

    /* compiled from: VoipParticipantSettingsState.kt */
    public static final class c {
        public final CallMemberId a;
        public final boolean b;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Self(id=");
            sb.append(this.a);
            sb.append(", isAdmin=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public c(CallMemberId callMemberId, boolean z) {
            this.a = callMemberId;
            this.b = z;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            this(CallMemberId.a.a(String.valueOf(UserId.d.b)), false);
            Serializer.c<CallMemberId> cVar = CallMemberId.CREATOR;
        }
    }

    /* compiled from: VoipParticipantSettingsState.kt */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public d() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(isConnecting=");
            sb.append(this.a);
            sb.append(", isHandRaised=");
            sb.append(this.b);
            sb.append(", isMicrophoneOn=");
            sb.append(this.c);
            sb.append(", isCameraOn=");
            sb.append(this.d);
            sb.append(", isPinned=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public /* synthetic */ d(int i) {
            this(false, false, false, false, false);
        }

        public d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
        }
    }

    public buw0() {
        this(0);
    }

    public static buw0 a(buw0 buw0Var, boolean z, Throwable th, int i) {
        if ((i & 1) != 0) {
            z = buw0Var.b;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            th = buw0Var.c;
        }
        c cVar = buw0Var.d;
        b bVar = buw0Var.e;
        d dVar = buw0Var.f;
        a aVar = buw0Var.g;
        buw0Var.getClass();
        return new buw0(z2, th, cVar, bVar, dVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buw0)) {
            return false;
        }
        buw0 buw0Var = (buw0) obj;
        return this.b == buw0Var.b && epx.f(this.c, buw0Var.c) && epx.f(this.d, buw0Var.d) && epx.f(this.e, buw0Var.e) && epx.f(this.f, buw0Var.f) && epx.f(this.g, buw0Var.g);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Throwable th = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (th == null ? 0 : th.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VoipParticipantSettingsState(isLoading=" + this.b + ", error=" + this.c + ", self=" + this.d + ", participant=" + this.e + ", state=" + this.f + ", control=" + this.g + ')';
    }

    public buw0(boolean z, Throwable th, c cVar, b bVar, d dVar, a aVar) {
        this.b = z;
        this.c = th;
        this.d = cVar;
        this.e = bVar;
        this.f = dVar;
        this.g = aVar;
    }

    public /* synthetic */ buw0(int i) {
        this(false, null, new c(0), new b(0), new d(0), new a(false, false, false, false, false, null, false, 255));
    }
}
