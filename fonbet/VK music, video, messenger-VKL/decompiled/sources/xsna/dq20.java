package xsna;

import com.vk.dto.common.PaymentType;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: MiniAppProduct.kt */
/* loaded from: classes6.dex */
public final class dq20 implements mge0 {
    public final String b;
    public final PaymentType c;
    public final Integer d;
    public a e = new a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, "", "", "");

    /* compiled from: MiniAppProduct.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final double c;
        public final String d;

        public a(double d, String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = d;
            this.d = str3;
        }
    }

    /* compiled from: MiniAppProduct.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentType.values().length];
            try {
                iArr[PaymentType.Subs.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dq20(String str, PaymentType paymentType, Integer num) {
        this.b = str;
        this.c = paymentType;
        this.d = num;
    }

    @Override // xsna.mge0
    public final String L4() {
        return this.b;
    }

    @Override // xsna.mge0
    public final String R8() {
        return "";
    }

    @Override // xsna.mge0
    public final String W6() {
        StringBuilder sb = new StringBuilder();
        sb.append(z230.b.c());
        sb.append(',');
        sb.append(b.$EnumSwitchMapping$0[this.c.ordinal()] == 1 ? 3 : 4);
        sb.append(',');
        sb.append(getId());
        sb.append(',');
        sb.append(z230.b.c());
        return sb.toString();
    }

    @Override // xsna.mge0
    public final void cb(JSONObject jSONObject) {
        String optString = jSONObject.optString("priceCurrencyCode");
        String str = optString == null ? "" : optString;
        double optDouble = jSONObject.optDouble("price_amount_micros");
        String optString2 = jSONObject.optString("title");
        String str2 = optString2 == null ? "" : optString2;
        String optString3 = jSONObject.optString("basePricePeriod");
        this.e = new a(optDouble, str, str2, optString3 == null ? "" : optString3);
    }

    @Override // xsna.mge0
    public final boolean d1() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq20)) {
            return false;
        }
        dq20 dq20Var = (dq20) obj;
        return epx.f(this.b, dq20Var.b) && this.c == dq20Var.c && epx.f(this.d, dq20Var.d);
    }

    @Override // xsna.mge0
    public final int getId() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        return -12845212;
    }

    @Override // xsna.mge0
    public final String getType() {
        return "";
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Integer num = this.d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // xsna.mge0
    public final boolean ma() {
        return false;
    }

    @Override // xsna.mge0
    public final String n() {
        return "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppProduct(merchantProductId=");
        sb.append(this.b);
        sb.append(", paymentType=");
        sb.append(this.c);
        sb.append(", purchaseProductId=");
        return uqi.b(sb, this.d, ')');
    }

    @Override // xsna.mge0
    public final PaymentType u3() {
        return this.c;
    }
}
