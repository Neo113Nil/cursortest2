package xsna;

import com.vk.voip.api.id.CallId;
import java.util.LinkedHashMap;
import xsna.g49;

/* compiled from: ConfigureSessionRoomsFeaturePreferences.kt */
/* loaded from: classes7.dex */
public final class c2j {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final com.vk.voip.b a;

    /* compiled from: ConfigureSessionRoomsFeaturePreferences.kt */
    public static final class a {
        public final int a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;

        public a(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = i;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = i2;
        }

        public static a a(a aVar, boolean z) {
            return new a(aVar.a, aVar.f, z, aVar.c, aVar.d, aVar.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + qoy.b(qoy.b(qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionRoomsParams(roomsCount=");
            sb.append(this.a);
            sb.append(", roomsWereCreated=");
            sb.append(this.b);
            sb.append(", assignRandomly=");
            sb.append(this.c);
            sb.append(", isTimerPreset=");
            sb.append(this.d);
            sb.append(", setTimeLimit=");
            sb.append(this.e);
            sb.append(", timeLimitMin=");
            return vu5.b(sb, this.f, ')');
        }
    }

    public c2j(com.vk.voip.b bVar) {
        this.a = bVar;
    }

    public final a a() {
        com.vk.voip.b bVar = this.a;
        CallId b2 = bVar.b();
        LinkedHashMap linkedHashMap = b;
        b bVar2 = (b) linkedHashMap.get(b2);
        a aVar = bVar2 != null ? bVar2.d : null;
        if (aVar != null) {
            return aVar;
        }
        CallId b3 = bVar.b();
        a aVar2 = new a(0, 0, false, true, false, false);
        linkedHashMap.put(bVar.b(), new b(bVar, b3, aVar2));
        return aVar2;
    }

    public final void b(a aVar) {
        com.vk.voip.b bVar = this.a;
        CallId b2 = bVar.b();
        LinkedHashMap linkedHashMap = b;
        b bVar2 = (b) linkedHashMap.get(b2);
        if (bVar2 != null) {
            bVar.h().i(bVar2);
        }
        linkedHashMap.put(bVar.b(), new b(bVar, bVar.b(), aVar));
    }

    /* compiled from: ConfigureSessionRoomsFeaturePreferences.kt */
    public static final class b implements g49 {
        public final com.vk.voip.b b;
        public final CallId c;
        public final a d;

        public b(com.vk.voip.b bVar, CallId callId, a aVar) {
            this.b = bVar;
            this.c = callId;
            this.d = aVar;
            bVar.h().d(this);
        }

        @Override // xsna.g49
        public final void i(g49.a aVar) {
            CallId callId = aVar.a;
            CallId callId2 = this.c;
            if (epx.f(callId, callId2)) {
                LinkedHashMap linkedHashMap = c2j.b;
                this.b.h().i(this);
                c2j.b.remove(callId2);
            }
        }

        @Override // xsna.g49
        public final void q() {
        }

        @Override // xsna.g49
        public final void f(g49.b bVar) {
        }

        @Override // xsna.g49
        public final void r(boolean z) {
        }

        @Override // xsna.g49
        public final void w(mlp mlpVar) {
        }

        @Override // xsna.g49
        public final void k(CallId callId, String str) {
        }

        @Override // xsna.g49
        public final void p(CallId callId, boolean z) {
        }

        @Override // xsna.g49
        public final void v(CallId callId, String str) {
        }

        @Override // xsna.g49
        public final void a(String str, boolean z, CallId callId) {
        }

        @Override // xsna.g49
        public final void b(dhw0 dhw0Var, boolean z, Throwable th) {
        }

        @Override // xsna.g49
        public final void u(CallId callId, boolean z, boolean z2) {
        }

        @Override // xsna.g49
        public final void l(int i, boolean z, boolean z2, CallId callId) {
        }
    }
}
