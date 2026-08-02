package xsna;

import com.vk.push.common.messaging.ClickActionType;
import com.vk.push.pushsdk.domain.model.MessagePriority;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.Arrays;

/* compiled from: PushMessage.kt */
/* loaded from: classes5.dex */
public final class dje0 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final MessagePriority e;
    public final Integer f;
    public final int g;
    public final Long h;
    public final String i;
    public final byte[] j;
    public final a k;
    public final long l;
    public final int m;
    public final ReceivedBy n;

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

    public dje0(long j, long j2, long j3, String str, MessagePriority messagePriority, Integer num, int i, Long l, String str2, byte[] bArr, a aVar, long j4, int i2, ReceivedBy receivedBy) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = messagePriority;
        this.f = num;
        this.g = i;
        this.h = l;
        this.i = str2;
        this.j = bArr;
        this.k = aVar;
        this.l = j4;
        this.m = i2;
        this.n = receivedBy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dje0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        dje0 dje0Var = (dje0) obj;
        return this.a == dje0Var.a && this.b == dje0Var.b && this.c == dje0Var.c && epx.f(this.d, dje0Var.d) && this.e == dje0Var.e && epx.f(this.f, dje0Var.f) && epx.f(this.h, dje0Var.h) && epx.f(this.i, dje0Var.i) && Arrays.equals(this.j, dje0Var.j) && epx.f(this.k, dje0Var.k) && this.l == dje0Var.l && this.m == dje0Var.m && this.n == dje0Var.n;
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (this.e.hashCode() + ((a2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        Integer num = this.f;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Long l = this.h;
        int hashCode3 = (Arrays.hashCode(this.j) + urd0.a((hashCode2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.i)) * 31;
        a aVar = this.k;
        int a3 = shy.a(this.m, bh10.a((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.l), 31);
        ReceivedBy receivedBy = this.n;
        return a3 + (receivedBy != null ? receivedBy.hashCode() : 0);
    }

    public final String toString() {
        return "PushMessage(id=" + this.a + ", tokenPackageId=" + this.b + ", syn=" + this.c + ", collapseKey=" + this.d + ", priority=" + this.e + ", ttl=" + this.f + ", actualTtl=" + this.g + ", expiringTime=" + this.h + ", from=" + this.i + ", data=" + Arrays.toString(this.j) + ", notification=" + this.k + ", receivedByPushServerAt=" + this.l + ", deliveryAttempts=" + this.m + ", receivedBy=" + this.n + ')';
    }
}
