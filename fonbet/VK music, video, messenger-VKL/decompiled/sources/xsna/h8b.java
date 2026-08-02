package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ChannelPayoutVkPayReceiver.kt */
/* loaded from: classes16.dex */
public final class h8b {
    public final UserId a;
    public final String b;

    public h8b(UserId userId, String str) {
        this.a = userId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8b)) {
            return false;
        }
        h8b h8bVar = (h8b) obj;
        return epx.f(this.a, h8bVar.a) && epx.f(this.b, h8bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelPayoutVkPayReceiver(id=");
        sb.append(this.a);
        sb.append(", name=");
        return ho8.a(sb, this.b, ')');
    }
}
