package xsna;

import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;

/* compiled from: StickersPromoEntity.kt */
/* loaded from: classes5.dex */
public final class lbl0 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final PromoColor e;
    public final PromoColor f;
    public final VmojiConstructorOpenParamsModel g;

    public lbl0() {
        this(0, 0, 0, (PromoColor) null, (PromoColor) null, (VmojiConstructorOpenParamsModel) null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbl0)) {
            return false;
        }
        lbl0 lbl0Var = (lbl0) obj;
        return this.a == lbl0Var.a && this.b == lbl0Var.b && this.c == lbl0Var.c && this.d == lbl0Var.d && this.e == lbl0Var.e && this.f == lbl0Var.f && epx.f(this.g, lbl0Var.g);
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
        PromoColor promoColor = this.e;
        int hashCode = (a + (promoColor == null ? 0 : promoColor.hashCode())) * 31;
        PromoColor promoColor2 = this.f;
        return this.g.hashCode() + ((hashCode + (promoColor2 != null ? promoColor2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StickersPromoEntity(id=" + this.a + ", newStickersItems=" + this.b + ", globalPromotes=" + this.c + ", vmojiPromoCounter=" + this.d + ", vmojiPromoCounterColor=" + this.e + ", vmojiPromoDotColor=" + this.f + ", vmojiPromoOpenParams=" + this.g + ')';
    }

    public lbl0(long j, int i, int i2, int i3, PromoColor promoColor, PromoColor promoColor2, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = promoColor;
        this.f = promoColor2;
        this.g = vmojiConstructorOpenParamsModel;
    }

    public /* synthetic */ lbl0(int i, int i2, int i3, PromoColor promoColor, PromoColor promoColor2, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel, int i4) {
        this(0L, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? null : promoColor, (i4 & 32) != 0 ? null : promoColor2, (i4 & 64) != 0 ? new VmojiConstructorOpenParamsModel(null, null, null, 7, null) : vmojiConstructorOpenParamsModel);
    }
}
