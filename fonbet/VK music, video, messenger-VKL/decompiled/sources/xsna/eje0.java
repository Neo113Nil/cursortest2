package xsna;

import com.vk.push.common.messaging.ClickActionType;
import com.vk.push.pushsdk.domain.model.MessagePriority;

/* compiled from: PushMessage.kt */
/* loaded from: classes5.dex */
public final class eje0 {
    public final long a;
    public final String b;
    public final MessagePriority c;
    public final Integer d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;
    public final a i;
    public final long j;

    /* compiled from: PushMessage.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final ClickActionType h;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, ClickActionType clickActionType) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = clickActionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            ClickActionType clickActionType = this.h;
            return hashCode7 + (clickActionType != null ? clickActionType.hashCode() : 0);
        }

        public final String toString() {
            return "Notification(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", icon=" + this.d + ", color=" + this.e + ", channelId=" + this.f + ", clickAction=" + this.g + ", clickActionType=" + this.h + ')';
        }
    }

    public eje0(long j, String str, MessagePriority messagePriority, Integer num, int i, long j2, String str2, String str3, a aVar, long j3) {
        this.a = j;
        this.b = str;
        this.c = messagePriority;
        this.d = num;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = str3;
        this.i = aVar;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eje0)) {
            return false;
        }
        eje0 eje0Var = (eje0) obj;
        return this.a == eje0Var.a && epx.f(this.b, eje0Var.b) && this.c == eje0Var.c && epx.f(this.d, eje0Var.d) && this.e == eje0Var.e && this.f == eje0Var.f && epx.f(this.g, eje0Var.g) && epx.f(this.h, eje0Var.h) && epx.f(this.i, eje0Var.i) && this.j == eje0Var.j;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int a2 = urd0.a(bh10.a(shy.a(this.e, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f), 31, this.g);
        String str2 = this.h;
        int hashCode3 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.i;
        return Long.hashCode(this.j) + ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessage(syn=");
        sb.append(this.a);
        sb.append(", collapseKey=");
        sb.append(this.b);
        sb.append(", priority=");
        sb.append(this.c);
        sb.append(", ttl=");
        sb.append(this.d);
        sb.append(", actualTtl=");
        sb.append(this.e);
        sb.append(", expiringTime=");
        sb.append(this.f);
        sb.append(", from=");
        sb.append(this.g);
        sb.append(", data=");
        sb.append(this.h);
        sb.append(", notification=");
        sb.append(this.i);
        sb.append(", receivedByPushServerAt=");
        return vu5.a(')', this.j, sb);
    }
}
