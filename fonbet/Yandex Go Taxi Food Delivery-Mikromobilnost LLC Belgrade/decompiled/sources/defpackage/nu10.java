package defpackage;

import com.yandex.messaging.internal.LocalMessageRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class nu10 {
    public final long a;
    public final Long b;
    public final LocalMessageRef c;
    public final Long d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final String j;
    public final boolean k;
    public final boolean l;

    public nu10(long j, Long l, LocalMessageRef localMessageRef, Long l2, Long l3, String str, String str2, String str3, Long l4, String str4, boolean z, boolean z2) {
        this.a = j;
        this.b = l;
        this.c = localMessageRef;
        this.d = l2;
        this.e = l3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = l4;
        this.j = str4;
        this.k = z;
        this.l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu10)) {
            return false;
        }
        nu10 nu10Var = (nu10) obj;
        return this.a == nu10Var.a && jl40.l(this.b, nu10Var.b) && jl40.l(this.c, nu10Var.c) && jl40.l(this.d, nu10Var.d) && jl40.l(this.e, nu10Var.e) && jl40.l(this.f, nu10Var.f) && jl40.l(this.g, nu10Var.g) && jl40.l(this.h, nu10Var.h) && jl40.l(this.i, nu10Var.i) && jl40.l(this.j, nu10Var.j) && this.k == nu10Var.k && this.l == nu10Var.l;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        LocalMessageRef localMessageRef = this.c;
        int hashCode3 = (hashCode2 + (localMessageRef == null ? 0 : localMessageRef.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int b = unr0.b((hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h);
        Long l4 = this.i;
        int hashCode7 = (b + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.j;
        return Boolean.hashCode(this.l) + unr0.e((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageMenuData(internalId=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", localMessageRef=");
        sb.append(this.c);
        sb.append(", messageHistoryId=");
        sb.append(this.d);
        sb.append(", hostMessageHistoryId=");
        sb.append(this.e);
        sb.append(", fileId=");
        sb.append(this.f);
        g8e.D(sb, ", filename=", this.g, ", chatId=", this.h);
        sb.append(", originalMessageTimestamp=");
        sb.append(this.i);
        sb.append(", originalMessageChatId=");
        sb.append(this.j);
        n.z(", isForward=", ", isThreadHeader=", sb, this.k, this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
