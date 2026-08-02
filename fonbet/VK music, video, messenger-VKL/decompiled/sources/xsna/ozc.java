package xsna;

import com.vk.dto.actionlinks.ActionLink;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ClipFooterUiDto.kt */
/* loaded from: classes4.dex */
public final class ozc extends ol60 {
    public final String h;
    public final String i;
    public final ActionLink j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final a n;

    /* compiled from: ClipFooterUiDto.kt */
    public static final class a {
        public final int a;
        public final long b;
        public final String c;

        public a(int i, long j, String str) {
            this.a = i;
            this.b = j;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnalyticsData(vid=");
            sb.append(this.a);
            sb.append(", oid=");
            sb.append(this.b);
            sb.append(", trackCode=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public ozc(String str, String str2, ActionLink actionLink, Integer num, Integer num2, String str3, a aVar) {
        super(Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 0, 0, 0, null);
        this.h = str;
        this.i = str2;
        this.j = actionLink;
        this.k = num;
        this.l = num2;
        this.m = str3;
        this.n = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozc)) {
            return false;
        }
        ozc ozcVar = (ozc) obj;
        return epx.f(this.h, ozcVar.h) && epx.f(this.i, ozcVar.i) && epx.f(this.j, ozcVar.j) && epx.f(this.k, ozcVar.k) && epx.f(this.l, ozcVar.l) && epx.f(this.m, ozcVar.m) && epx.f(this.n, ozcVar.n);
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        String str = this.i;
        int hashCode2 = (this.j.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.k;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.l;
        return this.n.hashCode() + urd0.a((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.m);
    }

    public final String toString() {
        return "ClipFooterUiDto(buttonText=" + this.h + ", buttonIconUri=" + this.i + ", actionLink=" + this.j + ", bgColor=" + this.k + ", textColor=" + this.l + ", clipUniqueKey=" + this.m + ", analyticsData=" + this.n + ')';
    }
}
