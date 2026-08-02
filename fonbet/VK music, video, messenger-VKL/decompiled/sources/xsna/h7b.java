package xsna;

import com.vk.im.engine.models.channels.ChannelType;

/* compiled from: ChannelNotify.kt */
/* loaded from: classes5.dex */
public final class h7b {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final ChannelType l;

    public h7b(long j, int i, String str, String str2, long j2, String str3, long j3, String str4, String str5, String str6, boolean z, ChannelType channelType) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.g = j3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = z;
        this.l = channelType;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.j;
    }

    public final long c() {
        return this.a;
    }

    public final ChannelType d() {
        return this.l;
    }

    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7b)) {
            return false;
        }
        h7b h7bVar = (h7b) obj;
        return this.a == h7bVar.a && this.b == h7bVar.b && epx.f(this.c, h7bVar.c) && epx.f(this.d, h7bVar.d) && this.e == h7bVar.e && epx.f(this.f, h7bVar.f) && this.g == h7bVar.g && epx.f(this.h, h7bVar.h) && epx.f(this.i, h7bVar.i) && epx.f(this.j, h7bVar.j) && this.k == h7bVar.k && this.l == h7bVar.l;
    }

    public final String f() {
        return this.h;
    }

    public final String g() {
        return this.i;
    }

    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int a = bh10.a(urd0.a(bh10.a(urd0.a(urd0.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int b = qoy.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.k);
        ChannelType channelType = this.l;
        return b + (channelType != null ? channelType.hashCode() : 0);
    }

    public final long i() {
        return this.g;
    }

    public final long j() {
        return this.e;
    }

    public final String k() {
        return this.c;
    }

    public final boolean l() {
        return this.k;
    }

    public final String toString() {
        return "ChannelNotify(channelId=" + this.a + ", cnvMsgId=" + this.b + ", title=" + this.c + ", body=" + this.d + ", timeMs=" + this.e + ", senderName=" + this.f + ", senderPeerDialogId=" + this.g + ", previewImageUrl=" + this.h + ", senderAvatarUrl=" + this.i + ", channelAvatarUrl=" + this.j + ", useSound=" + this.k + ", channelType=" + this.l + ')';
    }
}
