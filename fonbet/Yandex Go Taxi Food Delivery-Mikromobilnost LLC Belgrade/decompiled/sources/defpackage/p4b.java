package defpackage;

import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.entities.ChatFlags;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p4b {
    public final String a;
    public final long b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final ExistingChatRequest k;

    public p4b(String str, long j, String str2, int i, boolean z, boolean z2, String str3, long j2) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = j2;
        this.i = ChatFlags.a(j2, 1L);
        this.j = ChatFlags.a(j2, 8L);
        this.k = p8b.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4b)) {
            return false;
        }
        p4b p4bVar = (p4b) obj;
        return this.a.equals(p4bVar.a) && this.b == p4bVar.b && this.c.equals(p4bVar.c) && this.d == p4bVar.d && this.e == p4bVar.e && this.f == p4bVar.f && jl40.l(this.g, p4bVar.g) && this.h == p4bVar.h;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(oyr.b(this.d, unr0.b(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
        String str = this.g;
        return Long.hashCode(this.h) + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("ChatListData(chatId=", this.a, ", internalId=", this.b);
        l.append(", chatName=");
        l.append(this.c);
        l.append(", unseen=");
        l.append(this.d);
        n.z(", isPinned=", ", mute=", l, this.e, this.f);
        x4e.C(l, ", addresseeId=", this.g, ", flags=");
        return oyr.n(this.h, Extension.C_BRAKE, l);
    }
}
