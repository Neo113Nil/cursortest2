package xsna;

import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;

/* compiled from: MaxAuthCache.kt */
/* loaded from: classes15.dex */
public final class ao10 {
    public static a a;

    /* compiled from: MaxAuthCache.kt */
    public static final class a {
        public final String a;
        public final r25 b;
        public final long c;
        public final String d;
        public final String e;
        public final String f;
        public final Integer g;
        public final String h;
        public final String i;

        public a(String str, r25 r25Var, long j, String str2, String str3, String str4, Integer num, String str5, String str6) {
            this.a = str;
            this.b = r25Var;
            this.c = j;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = num;
            this.h = str5;
            this.i = str6;
        }

        public static a a(a aVar, String str, String str2, String str3, Integer num, String str4, String str5, int i) {
            String str6 = aVar.a;
            r25 r25Var = aVar.b;
            long j = aVar.c;
            if ((i & 8) != 0) {
                str = aVar.d;
            }
            String str7 = str;
            if ((i & 16) != 0) {
                str2 = aVar.e;
            }
            String str8 = str2;
            if ((i & 32) != 0) {
                str3 = aVar.f;
            }
            return new a(str6, r25Var, j, str7, str8, str3, (i & 64) != 0 ? aVar.g : num, (i & 128) != 0 ? aVar.h : str4, (i & 256) != 0 ? aVar.i : str5);
        }

        public final r25 b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            int a = bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            String str = this.d;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.g;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.h;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.i;
            return hashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CachedAuthData(login=");
            sb.append(this.a);
            sb.append(", authBySmartflowData=");
            sb.append(this.b);
            sb.append(", timerEndTimestamp=");
            sb.append(this.c);
            sb.append(", maxMessengerHash=");
            sb.append(this.d);
            sb.append(", maxMessengerPhoneMask=");
            sb.append(this.e);
            sb.append(", maxMessengerOpenLink=");
            sb.append(this.f);
            sb.append(", maxOtpCodeLength=");
            sb.append(this.g);
            sb.append(", maxOtpCodePhoneMask=");
            sb.append(this.h);
            sb.append(", maxOtpCodeOpenLink=");
            return ho8.a(sb, this.i, ')');
        }
    }

    public static void a(String str, r25 r25Var) {
        VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions = r25Var.f.f;
        Long l = maxOptions != null ? maxOptions.b : null;
        a = new a(str, r25Var, l != null ? (l.longValue() * 1000) + System.currentTimeMillis() : 0L, null, null, null, null, null, null);
    }

    public static a b(String str) {
        a aVar = a;
        if (aVar == null || !epx.f(aVar.a, str)) {
            return null;
        }
        if (System.currentTimeMillis() < aVar.c) {
            return aVar;
        }
        a = null;
        return null;
    }
}
