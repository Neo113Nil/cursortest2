package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: DeletedReplyItem.kt */
/* loaded from: classes18.dex */
public final class tvl implements hfz {
    public final int b;
    public final int c;
    public final UserId d;
    public final boolean e;
    public final int f;
    public final b2g0 g;

    public tvl(int i, int i2, UserId userId, boolean z, int i3, b2g0 b2g0Var) {
        this.b = i;
        this.c = i2;
        this.d = userId;
        this.e = z;
        this.f = i3;
        this.g = b2g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvl)) {
            return false;
        }
        tvl tvlVar = (tvl) obj;
        return this.b == tvlVar.b && this.c == tvlVar.c && epx.f(this.d, tvlVar.d) && this.e == tvlVar.e && this.f == tvlVar.f && epx.f(this.g, tvlVar.g);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.f);
    }

    public final int hashCode() {
        int a = shy.a(this.f, qoy.b(bh10.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b), 31, this.e), 31);
        b2g0 b2g0Var = this.g;
        return a + (b2g0Var == null ? 0 : b2g0Var.hashCode());
    }

    public final String toString() {
        return "DeletedReplyItem(reviewId=" + this.b + ", replyId=" + this.c + ", userId=" + this.d + ", isEnabled=" + this.e + ", itemId=" + this.f + ", additionalInfo=" + this.g + ')';
    }
}
