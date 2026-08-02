package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.entities.list.DiscountsListItemType;

/* loaded from: classes13.dex */
public final class iqj extends fqj {
    public final String a;
    public final String b;
    public final String c;

    public iqj(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.fqj
    public final DiscountsListItemType a() {
        return DiscountsListItemType.PROMO_LINK;
    }
}
