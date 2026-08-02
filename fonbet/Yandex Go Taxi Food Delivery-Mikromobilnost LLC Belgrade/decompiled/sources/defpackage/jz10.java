package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jz10 {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final double j;
    public final String k;
    public final String l;
    public final Integer m;
    public final String n;
    public final String o;
    public final String p;
    public final Long q;
    public final long r;
    public final String s;
    public final Long t;
    public final String u;
    public final long v;
    public final String w;
    public final String x;
    public final String y;

    public jz10(long j, String str, long j2, long j3, long j4, long j5, long j6, long j7, String str2, double d, String str3, String str4, Integer num, String str5, String str6, String str7, Long l, long j8, String str8, Long l2, String str9, long j9, String str10, String str11, String str12) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = str2;
        this.j = d;
        this.k = str3;
        this.l = str4;
        this.m = num;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = l;
        this.r = j8;
        this.s = str8;
        this.t = l2;
        this.u = str9;
        this.v = j9;
        this.w = str10;
        this.x = str11;
        this.y = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz10)) {
            return false;
        }
        jz10 jz10Var = (jz10) obj;
        return this.a == jz10Var.a && jl40.l(this.b, jz10Var.b) && this.c == jz10Var.c && this.d == jz10Var.d && this.e == jz10Var.e && this.f == jz10Var.f && this.g == jz10Var.g && this.h == jz10Var.h && jl40.l(this.i, jz10Var.i) && Double.compare(this.j, jz10Var.j) == 0 && jl40.l(this.k, jz10Var.k) && jl40.l(this.l, jz10Var.l) && jl40.l(this.m, jz10Var.m) && jl40.l(this.n, jz10Var.n) && jl40.l(this.o, jz10Var.o) && jl40.l(this.p, jz10Var.p) && jl40.l(this.q, jz10Var.q) && this.r == jz10Var.r && jl40.l(this.s, jz10Var.s) && jl40.l(this.t, jz10Var.t) && jl40.l(this.u, jz10Var.u) && this.v == jz10Var.v && jl40.l(this.w, jz10Var.w) && jl40.l(this.x, jz10Var.x) && jl40.l(this.y, jz10Var.y);
    }

    public final int hashCode() {
        int c = qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int b = unr0.b(unr0.a((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k);
        String str2 = this.l;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.m;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.n;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.p;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.q;
        int c2 = qv10.c((hashCode5 + (l == null ? 0 : l.hashCode())) * 31, 31, this.r);
        String str6 = this.s;
        int hashCode6 = (c2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.t;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str7 = this.u;
        int c3 = qv10.c((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.v);
        String str8 = this.w;
        int hashCode8 = (c3 + (str8 == null ? 0 : str8.hashCode())) * 1742810335;
        String str9 = this.x;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.y;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = x4e.k("MessagesViewEntity(rowId=null, chatInternalId=", this.a, ", chatId=", this.b);
        x4e.A(this.c, ", messageHistoryId=", ", messageSequenceNumber=", k);
        k.append(this.d);
        x4e.A(this.e, ", messagePrevHistoryId=", ", messageInternalId=", k);
        k.append(this.f);
        x4e.A(this.g, ", messageVersion=", ", flags=", k);
        uw51.v(this.h, ", messageId=", this.i, k);
        nzs.o(k, ", time=", this.j, ", author=");
        g8e.D(k, this.k, ", data=", this.l, ", dataType=");
        tse0.w(this.m, ", customPayload=", this.n, ", replyData=", k);
        g8e.D(k, this.o, ", forwardedAuthorId=", this.p, ", hostMessageHistoryId=");
        k.append(this.q);
        k.append(", viewsCount=");
        k.append(this.r);
        k.append(", originalMessageChatId=");
        k.append(this.s);
        k.append(", originalMessageHistoryId=");
        k.append(this.t);
        x4e.C(k, ", fakeGuid=", this.u, ", forwardsCount=");
        uw51.v(this.v, ", notificationMeta=", this.w, k);
        g8e.D(k, ", originalLang=null, translatedLang=null, translatedText=null, originalReplyLang=null, translatedReplyText=null, translatedSuggests=null, forcedTranslatedText=", this.x, ", forcedTranslatedReplyText=", this.y);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
