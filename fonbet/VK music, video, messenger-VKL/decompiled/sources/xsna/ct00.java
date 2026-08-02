package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;

/* compiled from: MarketAllReviewsRestoreGoodItem.kt */
/* loaded from: classes18.dex */
public final class ct00 implements hfz {
    public final String b;
    public final BaseImageDto c;
    public final String d;
    public final int e;

    public ct00(String str, BaseImageDto baseImageDto, String str2, int i) {
        this.b = str;
        this.c = baseImageDto;
        this.d = str2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct00)) {
            return false;
        }
        ct00 ct00Var = (ct00) obj;
        return epx.f(this.b, ct00Var.b) && epx.f(this.c, ct00Var.c) && epx.f(this.d, ct00Var.d) && this.e == ct00Var.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        BaseImageDto baseImageDto = this.c;
        return Integer.hashCode(this.e) + urd0.a((hashCode + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAllReviewsRestoreGoodItem(fullId=");
        sb.append(this.b);
        sb.append(", goodAvatar=");
        sb.append(this.c);
        sb.append(", goodDisplayName=");
        sb.append(this.d);
        sb.append(", backgroundResId=");
        return vu5.b(sb, this.e, ')');
    }
}
