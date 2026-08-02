package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VkAuthExchangeLoginData.kt */
/* loaded from: classes6.dex */
public final class xbu0 {
    public static final xbu0 i = new xbu0(UserId.d, "", null, "", null, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
    public final UserId a;
    public final String b;
    public final String c;
    public final String d;
    public final AccountProfileType e;
    public final List<a> f;
    public final String g;
    public final c h;

    /* compiled from: VkAuthExchangeLoginData.kt */
    public static final class a {
        public final UserId a;
        public final String b;
        public final String c;
        public final String d;
        public final AccountProfileType e;

        public a(UserId userId, String str, String str2, String str3, AccountProfileType accountProfileType) {
            this.a = userId;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = accountProfileType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int a = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
            String str = this.c;
            return this.e.hashCode() + urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            return "AdditionalPersonalityData(userId=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", exchangeToken=" + this.d + ", profileType=" + this.e + ')';
        }
    }

    /* compiled from: VkAuthExchangeLoginData.kt */
    public static final class b {
        public static xbu0 a() {
            return xbu0.i;
        }
    }

    /* compiled from: VkAuthExchangeLoginData.kt */
    public static final class c {
        public final Boolean a;
        public final String b;

        public c(Boolean bool, String str) {
            this.a = bool;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtendedProfileData(isAvatarNft=");
            sb.append(this.a);
            sb.append(", domain=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public xbu0() {
        throw null;
    }

    public xbu0(UserId userId, String str, String str2, String str3, AccountProfileType accountProfileType, ArrayList arrayList, String str4, c cVar, int i2) {
        accountProfileType = (i2 & 16) != 0 ? AccountProfileType.NORMAL : accountProfileType;
        List list = (i2 & 32) != 0 ? EmptyList.b : arrayList;
        str4 = (i2 & 64) != 0 ? str : str4;
        cVar = (i2 & 128) != 0 ? null : cVar;
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = accountProfileType;
        this.f = list;
        this.g = str4;
        this.h = cVar;
    }

    public final List<a> a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final AccountProfileType e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbu0)) {
            return false;
        }
        xbu0 xbu0Var = (xbu0) obj;
        return epx.f(this.a, xbu0Var.a) && epx.f(this.b, xbu0Var.b) && epx.f(this.c, xbu0Var.c) && epx.f(this.d, xbu0Var.d) && this.e == xbu0Var.e && epx.f(this.f, xbu0Var.f) && epx.f(this.g, xbu0Var.g) && epx.f(this.h, xbu0Var.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        String str = this.c;
        int a3 = urd0.a(fw3.a((this.e.hashCode() + urd0.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g);
        c cVar = this.h;
        return a3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "VkAuthExchangeLoginData(userId=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", exchangeToken=" + this.d + ", profileType=" + this.e + ", additionalDataItems=" + this.f + ", fullName=" + this.g + ", extendedData=" + this.h + ')';
    }
}
