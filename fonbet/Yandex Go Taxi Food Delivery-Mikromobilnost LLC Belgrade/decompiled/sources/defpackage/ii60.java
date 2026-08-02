package defpackage;

import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import com.yandex.messaging.internal.entities.MessageData;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ii60 {
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;
    public final String f;
    public final h2t g;
    public final MessageData h;
    public final NotificationMeta i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public /* synthetic */ ii60(String str, long j, long j2, int i, String str2, String str3, h2t h2tVar, MessageData messageData, NotificationMeta notificationMeta, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this(str, j, j2, i, str2, str3, h2tVar, messageData, notificationMeta, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? false : z4);
    }

    public static ii60 a(ii60 ii60Var, String str, String str2, int i) {
        String str3 = (i & 1) != 0 ? ii60Var.a : str;
        long j = ii60Var.b;
        long j2 = ii60Var.c;
        int i2 = ii60Var.d;
        String str4 = ii60Var.e;
        String str5 = (i & 32) != 0 ? ii60Var.f : str2;
        h2t h2tVar = (i & 64) != 0 ? ii60Var.g : null;
        MessageData messageData = ii60Var.h;
        NotificationMeta notificationMeta = ii60Var.i;
        boolean z = ii60Var.j;
        boolean z2 = ii60Var.k;
        boolean z3 = ii60Var.l;
        boolean z4 = ii60Var.m;
        ii60Var.getClass();
        return new ii60(str3, j, j2, i2, str4, str5, h2tVar, messageData, notificationMeta, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii60)) {
            return false;
        }
        ii60 ii60Var = (ii60) obj;
        return jl40.l(this.a, ii60Var.a) && this.b == ii60Var.b && this.c == ii60Var.c && this.d == ii60Var.d && jl40.l(this.e, ii60Var.e) && jl40.l(this.f, ii60Var.f) && jl40.l(this.g, ii60Var.g) && jl40.l(this.h, ii60Var.h) && jl40.l(this.i, ii60Var.i) && this.j == ii60Var.j && this.k == ii60Var.k && this.l == ii60Var.l && this.m == ii60Var.m;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b(oyr.b(this.d, qv10.c(qv10.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        String str2 = this.f;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        h2t h2tVar = this.g;
        int hashCode2 = (hashCode + (h2tVar == null ? 0 : h2tVar.hashCode())) * 31;
        MessageData messageData = this.h;
        int hashCode3 = (hashCode2 + (messageData == null ? 0 : messageData.hashCode())) * 31;
        NotificationMeta notificationMeta = this.i;
        return Boolean.hashCode(this.m) + unr0.e(unr0.e(unr0.e((hashCode3 + (notificationMeta != null ? notificationMeta.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder l = x4e.l("NotificationMessage(text=", this.a, ", messageHistoryId=", this.b);
        x4e.A(this.c, ", messageTimeMs=", ", type=", l);
        smw0.t(this.d, ", guid=", this.e, ", name=", l);
        l.append(this.f);
        l.append(", mediaData=");
        l.append(this.g);
        l.append(", messageData=");
        l.append(this.h);
        l.append(", notificationMeta=");
        l.append(this.i);
        l.append(", displaySeparate=");
        nnm.v(", receiverMentioned=", ", receiverReplied=", l, this.j, this.k);
        return smw0.k(", isMuted=", Extension.C_BRAKE, l, this.l, this.m);
    }

    public ii60(String str, long j, long j2, int i, String str2, String str3, h2t h2tVar, MessageData messageData, NotificationMeta notificationMeta, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = h2tVar;
        this.h = messageData;
        this.i = notificationMeta;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }
}
