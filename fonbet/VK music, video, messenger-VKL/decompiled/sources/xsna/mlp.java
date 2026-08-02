package xsna;

import com.vk.dto.user.UserProfile;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.type.StartCallType;
import java.util.List;

/* compiled from: EngineCallErrorInfo.kt */
/* loaded from: classes7.dex */
public final class mlp {
    public final Throwable a;
    public final int b;
    public final String c;
    public final String d;
    public final List<UserProfile> e;
    public final CallId f;
    public final StartCallType g;
    public final String h;

    /* JADX WARN: Multi-variable type inference failed */
    public mlp(Throwable th, int i, String str, String str2, List<? extends UserProfile> list, CallId callId, StartCallType startCallType, String str3) {
        this.a = th;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = callId;
        this.g = startCallType;
        this.h = str3;
    }

    public final CallId a() {
        return this.f;
    }

    public final Throwable b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final StartCallType e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlp)) {
            return false;
        }
        mlp mlpVar = (mlp) obj;
        return epx.f(this.a, mlpVar.a) && this.b == mlpVar.b && epx.f(this.c, mlpVar.c) && epx.f(this.d, mlpVar.d) && epx.f(this.e, mlpVar.e) && epx.f(this.f, mlpVar.f) && this.g == mlpVar.g && epx.f(this.h, mlpVar.h);
    }

    public final int hashCode() {
        int a = urd0.a(fw3.a(urd0.a(urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f.b);
        StartCallType startCallType = this.g;
        int hashCode = (a + (startCallType == null ? 0 : startCallType.hashCode())) * 31;
        String str = this.h;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineCallErrorInfo(error=");
        sb.append(this.a);
        sb.append(", errorCode=");
        sb.append(this.b);
        sb.append(", errorType=");
        sb.append(this.c);
        sb.append(", peerId=");
        sb.append(this.d);
        sb.append(", profiles=");
        sb.append(this.e);
        sb.append(", callId=");
        sb.append(this.f);
        sb.append(", startCallType=");
        sb.append(this.g);
        sb.append(", explanationHtml=");
        return ho8.a(sb, this.h, ')');
    }
}
