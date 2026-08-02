package com.yandex.go.chargers.discounts.data.models;

import defpackage.gsq0;
import defpackage.xr9;
import defpackage.yr9;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountDetailsButtonDto;", "", "Companion", "yr9", "$serializer", "com/yandex/go/chargers/discounts/data/models/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountDetailsButtonDto {
    public static final a Companion = new a();
    public final FormattedText a;
    public final FormattedText b;
    public final boolean c;
    public final yr9 d;

    public /* synthetic */ ChargersDiscountDetailsButtonDto(int i, FormattedText formattedText, FormattedText formattedText2, boolean z, yr9 yr9Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = xr9.INSTANCE;
        } else {
            this.d = yr9Var;
        }
    }

    public ChargersDiscountDetailsButtonDto() {
        FormattedText formattedText = FormattedText.c;
        xr9 xr9Var = xr9.INSTANCE;
        this.a = formattedText;
        this.b = formattedText;
        this.c = false;
        this.d = xr9Var;
    }
}
