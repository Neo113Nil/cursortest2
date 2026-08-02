package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;

/* compiled from: CallPreview.kt */
/* loaded from: classes7.dex */
public final class s89 {
    public final CallId a;
    public final String b;
    public final String c;
    public final int d;
    public final JoinData e;
    public final a f;

    /* compiled from: CallPreview.kt */
    public static final class a {
        public final UserId a;
        public final String b;
        public final boolean c;

        public a(UserId userId, String str, boolean z) {
            this.a = userId;
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnonData(userId=");
            sb.append(this.a);
            sb.append(", secret=");
            sb.append(this.b);
            sb.append(", isEdu=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public s89(CallId callId, String str, String str2, int i, JoinData joinData, a aVar) {
        this.a = callId;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = joinData;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s89)) {
            return false;
        }
        s89 s89Var = (s89) obj;
        return epx.f(this.a, s89Var.a) && epx.f(this.b, s89Var.b) && epx.f(this.c, s89Var.c) && this.d == s89Var.d && epx.f(this.e, s89Var.e) && epx.f(this.f, s89Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.b.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.e.hashCode() + shy.a(this.d, urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31)) * 31;
        a aVar = this.f;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CallPreview(callId=" + this.a + ", callName=" + this.b + ", joinLink=" + this.c + ", countOfPeople=" + this.d + ", joinData=" + this.e + ", anonData=" + this.f + ')';
    }
}
