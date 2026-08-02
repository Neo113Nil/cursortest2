package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: InAppMsgPushSettings.kt */
/* loaded from: classes17.dex */
public final class uqw implements bxx {
    public final UserId b;
    public final boolean c;
    public final boolean d;

    public uqw(boolean z, UserId userId, boolean z2) {
        this.b = userId;
        this.c = z;
        this.d = z2;
    }

    public final UserId a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.d(Long.valueOf(this.b.b), "ownerId");
        w9yVar.b(Boolean.valueOf(this.c), "isPrivateMessagesEnabled");
        w9yVar.b(Boolean.valueOf(this.d), "isChatMessagesEnabled");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqw)) {
            return false;
        }
        uqw uqwVar = (uqw) obj;
        return epx.f(this.b, uqwVar.b) && this.c == uqwVar.c && this.d == uqwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppMsgPushSettings(ownerId=");
        sb.append(this.b);
        sb.append(", isPrivateMessagesEnabled=");
        sb.append(this.c);
        sb.append(", isChatMessagesEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
