package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.voip.api.id.CallId;
import com.vk.voip.userid.CallsUserId;

/* compiled from: VoipAdminChangeNamePatch.kt */
/* loaded from: classes7.dex */
public abstract class edw0 implements xl50 {

    /* compiled from: VoipAdminChangeNamePatch.kt */
    public static final class a extends edw0 {
        public final CallId b;
        public final Serializer.StreamParcelableAdapter c;
        public final String d;
        public final String e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CallId callId, CallsUserId callsUserId, String str, String str2) {
            this.b = callId;
            this.c = (Serializer.StreamParcelableAdapter) callsUserId;
            this.d = str;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = urd0.a((this.c.hashCode() + (this.b.b.hashCode() * 31)) * 31, 31, this.d);
            String str = this.e;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(callId=");
            sb.append(this.b);
            sb.append(", participantId=");
            sb.append(this.c);
            sb.append(", realName=");
            sb.append(this.d);
            sb.append(", changedName=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: VoipAdminChangeNamePatch.kt */
    public static abstract class b extends edw0 {

        /* compiled from: VoipAdminChangeNamePatch.kt */
        public static final class a extends b {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Loading(isLoading="), this.b, ')');
            }
        }

        /* compiled from: VoipAdminChangeNamePatch.kt */
        /* renamed from: xsna.edw0$b$b, reason: collision with other inner class name */
        public static final class C2796b extends b {
            public static final C2796b b = new C2796b();
        }
    }

    /* compiled from: VoipAdminChangeNamePatch.kt */
    public static final class c extends edw0 {
        public final String b;

        public c(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("TextFieldNameChanged(name="), this.b, ')');
        }
    }
}
