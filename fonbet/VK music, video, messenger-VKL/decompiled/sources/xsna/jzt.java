package xsna;

import com.vk.stickers.gifts.GiftModalButtonType;

/* compiled from: LimitedGiftModalPage.kt */
/* loaded from: classes6.dex */
public final class jzt {
    public final GiftModalButtonType a;
    public final long b;
    public final int c;
    public final String d;
    public final gzs<s3q0> e;

    public jzt(GiftModalButtonType giftModalButtonType, long j, int i, String str, gzs<s3q0> gzsVar) {
        this.a = giftModalButtonType;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzt)) {
            return false;
        }
        jzt jztVar = (jzt) obj;
        return this.a == jztVar.a && this.b == jztVar.b && this.c == jztVar.c && epx.f(this.d, jztVar.d) && epx.f(this.e, jztVar.e);
    }

    public final int hashCode() {
        int a = shy.a(this.c, bh10.a(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftModalContext(type=");
        sb.append(this.a);
        sb.append(", userToId=");
        sb.append(this.b);
        sb.append(", giftId=");
        sb.append(this.c);
        sb.append(", ref=");
        sb.append(this.d);
        sb.append(", onClickListener=");
        return uf3.d(sb, this.e, ')');
    }
}
