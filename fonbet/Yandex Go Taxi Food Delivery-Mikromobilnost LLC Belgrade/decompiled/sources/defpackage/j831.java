package defpackage;

import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public final class j831 {
    public final m831 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final VerificationStatus f;
    public final Integer g;
    public final Long h;
    public final Long i;
    public final String j;
    public final String k;
    public final String l;
    public final tx90 m;
    public final String n;

    public /* synthetic */ j831(m831 m831Var, String str, String str2, String str3, boolean z, VerificationStatus verificationStatus, Integer num, String str4, String str5, String str6, tx90 tx90Var, String str7, int i) {
        this(m831Var, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : verificationStatus, (i & 64) != 0 ? null : num, null, null, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : tx90Var, (i & 8192) != 0 ? null : str7);
    }

    public final m831 a() {
        return this.a;
    }

    public j831(m831 m831Var, String str, String str2, String str3, boolean z, VerificationStatus verificationStatus, Integer num, Long l, Long l2, String str4, String str5, String str6, tx90 tx90Var, String str7) {
        this.a = m831Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = verificationStatus;
        this.g = num;
        this.h = l;
        this.i = l2;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = tx90Var;
        this.n = str7;
    }
}
