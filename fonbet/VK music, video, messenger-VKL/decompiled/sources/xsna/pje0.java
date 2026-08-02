package xsna;

import com.vk.push.pushsdk.domain.model.MessagePriority;
import xsna.eje0;

/* compiled from: PushMessageDto.kt */
/* loaded from: classes5.dex */
public final class pje0 {
    public final long a;
    public final String b;
    public final MessagePriority c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final eje0.a h;
    public final long i;

    public pje0(long j, String str, MessagePriority messagePriority, Integer num, Integer num2, String str2, String str3, eje0.a aVar, long j2) {
        this.a = j;
        this.b = str;
        this.c = messagePriority;
        this.d = num;
        this.e = num2;
        this.f = str2;
        this.g = str3;
        this.h = aVar;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pje0)) {
            return false;
        }
        pje0 pje0Var = (pje0) obj;
        return this.a == pje0Var.a && epx.f(this.b, pje0Var.b) && this.c == pje0Var.c && epx.f(this.d, pje0Var.d) && epx.f(this.e, pje0Var.e) && epx.f(this.f, pje0Var.f) && epx.f(this.g, pje0Var.g) && epx.f(this.h, pje0Var.h) && this.i == pje0Var.i;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int a = urd0.a((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode4 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        eje0.a aVar = this.h;
        return Long.hashCode(this.i) + ((hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessageDto(syn=");
        sb.append(this.a);
        sb.append(", collapseKey=");
        sb.append(this.b);
        sb.append(", priority=");
        sb.append(this.c);
        sb.append(", ttl=");
        sb.append(this.d);
        sb.append(", actualTtl=");
        sb.append(this.e);
        sb.append(", from=");
        sb.append(this.f);
        sb.append(", data=");
        sb.append(this.g);
        sb.append(", notification=");
        sb.append(this.h);
        sb.append(", receivedByPushServerAt=");
        return vu5.a(')', this.i, sb);
    }
}
