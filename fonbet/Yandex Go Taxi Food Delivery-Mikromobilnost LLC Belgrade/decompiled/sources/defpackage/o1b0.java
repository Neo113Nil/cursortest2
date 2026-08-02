package defpackage;

import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o1b0 {
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final transient boolean f;
    public final transient boolean g;
    public final String h;
    public final Long i;
    public final Long j;
    public final transient boolean k;
    public final transient boolean l;
    public final transient boolean m;
    public final boolean n;
    public final int o;
    public final boolean p;

    public o1b0(long j, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, Long l, Long l2, boolean z5, boolean z6, boolean z7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str3;
        this.i = l;
        this.j = l2;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        z83.h(null, (z && str2 == null) ? false : true);
        if (z4) {
            z83.i();
        }
        this.n = ChatNamespaces.b(str);
        this.o = ChatId.Companion.b(str);
        this.p = ChatNamespaces.a(str);
    }

    public final n1b0 a() {
        Long l = this.i;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        Long l2 = this.j;
        if (l2 != null) {
            return new n1b0(longValue, l2.longValue(), this.b);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        o1b0 o1b0Var = obj instanceof o1b0 ? (o1b0) obj : null;
        return o1b0Var != null && o1b0Var.a == this.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder k = x4e.k("PersistentChat(chatInternalId=", this.a, ", chatId=", this.b);
        uw51.x(", addresseeId=", this.c, ", isPrivate=", k, this.d);
        n.z(", isSavedMessages=", ", isChatWithBot=", k, this.e, this.f);
        k.append(", isChatWithSupportBot=");
        k.append(this.g);
        k.append(", currentProfileId=");
        k.append(this.h);
        k.append(", parentInternalId=");
        k.append(this.i);
        k.append(", parentMessageTimestamp=");
        k.append(this.j);
        n.z(", isStub=", ", isTransient=", k, this.k, this.l);
        return xra1.a(k, ", isPredicted=", this.m, Extension.C_BRAKE);
    }
}
