package xsna;

import com.vk.voip.api.id.CallId;

/* compiled from: CallLifecycleListener.kt */
/* loaded from: classes11.dex */
public interface g49 {

    /* compiled from: CallLifecycleListener.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final CallId a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final String g;

        public a(CallId callId, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
            this.a = callId;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = str2;
        }

        public final CallId a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.f;
        }

        public final boolean e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(this.a.b.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            String str = this.g;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallFinishInfo(callId=");
            sb.append(this.a);
            sb.append(", peerId=");
            sb.append(this.b);
            sb.append(", isBusy=");
            sb.append(this.c);
            sb.append(", isRemoved=");
            sb.append(this.d);
            sb.append(", isTimeout=");
            sb.append(this.e);
            sb.append(", isObsoleteClient=");
            sb.append(this.f);
            sb.append(", explanationHtml=");
            return ho8.a(sb, this.g, ')');
        }
    }

    /* compiled from: CallLifecycleListener.kt */
    /* loaded from: classes7.dex */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnJoinToGroupScheduledCallParams(isVideo=");
            sb.append(this.a);
            sb.append(", isAudio=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    void a(String str, boolean z, CallId callId);

    void b(dhw0 dhw0Var, boolean z, Throwable th);

    void f(b bVar);

    void i(a aVar);

    void k(CallId callId, String str);

    void l(int i, boolean z, boolean z2, CallId callId);

    void p(CallId callId, boolean z);

    void q();

    void r(boolean z);

    void u(CallId callId, boolean z, boolean z2);

    void v(CallId callId, String str);

    void w(mlp mlpVar);
}
