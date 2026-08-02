package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: VoipAdminChangeNameState.kt */
/* loaded from: classes7.dex */
public abstract class gdw0 implements km50 {

    /* compiled from: VoipAdminChangeNameState.kt */
    public static final class a extends gdw0 {
        public final String b;
        public final String c;
        public final CallsUserId d;
        public final boolean e;
        public final AbstractC2935a f;

        /* compiled from: VoipAdminChangeNameState.kt */
        /* renamed from: xsna.gdw0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2935a {

            /* compiled from: VoipAdminChangeNameState.kt */
            /* renamed from: xsna.gdw0$a$a$a, reason: collision with other inner class name */
            public static final class C2936a extends AbstractC2935a {
                public static final C2936a a = new C2936a();
            }

            /* compiled from: VoipAdminChangeNameState.kt */
            /* renamed from: xsna.gdw0$a$a$b */
            public static final class b extends AbstractC2935a {
                public static final b a = new b();
            }
        }

        public a(String str, String str2, CallsUserId callsUserId, boolean z, AbstractC2935a abstractC2935a) {
            this.b = str;
            this.c = str2;
            this.d = callsUserId;
            this.e = z;
            this.f = abstractC2935a;
        }

        public static a a(a aVar, String str, boolean z, AbstractC2935a abstractC2935a, int i) {
            if ((i & 1) != 0) {
                str = aVar.b;
            }
            String str2 = str;
            String str3 = aVar.c;
            CallsUserId callsUserId = aVar.d;
            if ((i & 8) != 0) {
                z = aVar.e;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                abstractC2935a = aVar.f;
            }
            aVar.getClass();
            return new a(str2, str3, callsUserId, z2, abstractC2935a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + qoy.b((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
        }

        public final String toString() {
            return "Content(nameInTextField=" + this.b + ", realName=" + this.c + ", participantId=" + this.d + ", isLoading=" + this.e + ", changeNameValidationError=" + this.f + ')';
        }
    }

    /* compiled from: VoipAdminChangeNameState.kt */
    public static final class b extends gdw0 {
        public static final b b = new b();
    }
}
