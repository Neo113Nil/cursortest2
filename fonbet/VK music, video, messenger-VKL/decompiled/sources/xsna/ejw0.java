package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.dto.VoipCallOnStartAction;
import java.util.Set;

/* compiled from: VoipCallStartParams.kt */
/* loaded from: classes7.dex */
public final class ejw0 {
    public final zqk0 a;
    public final VoipCallSource b;
    public final UserId c;
    public final String d;
    public final Set<VoipCallOnStartAction> e;

    /* JADX WARN: Multi-variable type inference failed */
    public ejw0(zqk0 zqk0Var, VoipCallSource voipCallSource, UserId userId, String str, Set<? extends VoipCallOnStartAction> set) {
        this.a = zqk0Var;
        this.b = voipCallSource;
        this.c = userId;
        this.d = str;
        this.e = set;
    }

    public static ejw0 f(ejw0 ejw0Var, Set set) {
        return new ejw0(ejw0Var.a, ejw0Var.b, ejw0Var.c, ejw0Var.d, set);
    }

    public final zqk0 a() {
        return this.a;
    }

    public final VoipCallSource b() {
        return this.b;
    }

    public final UserId c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Set<VoipCallOnStartAction> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejw0)) {
            return false;
        }
        ejw0 ejw0Var = (ejw0) obj;
        return epx.f(this.a, ejw0Var.a) && epx.f(this.b, ejw0Var.b) && epx.f(this.c, ejw0Var.c) && epx.f(this.d, ejw0Var.d) && epx.f(this.e, ejw0Var.e);
    }

    public final UserId g() {
        return this.c;
    }

    public final Set<VoipCallOnStartAction> h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        UserId userId = this.c;
        return this.e.hashCode() + urd0.a((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.d);
    }

    public final zqk0 i() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipCallStartParams(startConfiguration=");
        sb.append(this.a);
        sb.append(", callSource=");
        sb.append(this.b);
        sb.append(", fromId=");
        sb.append(this.c);
        sb.append(", maskId=");
        sb.append(this.d);
        sb.append(", onStartActions=");
        return ur.c(sb, this.e, ')');
    }
}
