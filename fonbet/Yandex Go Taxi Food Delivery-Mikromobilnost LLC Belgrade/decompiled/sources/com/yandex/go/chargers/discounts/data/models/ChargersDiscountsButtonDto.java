package com.yandex.go.chargers.discounts.data.models;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsButtonDto;", "", "Companion", "com/yandex/go/chargers/discounts/data/models/q", "$serializer", "com/yandex/go/chargers/discounts/data/models/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsButtonDto {
    public static final r Companion = new r();
    public final FormattedText a;
    public final FormattedText b;
    public final boolean c;
    public final q d;

    public /* synthetic */ ChargersDiscountsButtonDto(int i, FormattedText formattedText, FormattedText formattedText2, boolean z, q qVar) {
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
            this.d = p.INSTANCE;
        } else {
            this.d = qVar;
        }
    }

    public ChargersDiscountsButtonDto() {
        FormattedText formattedText = FormattedText.c;
        p pVar = p.INSTANCE;
        this.a = formattedText;
        this.b = formattedText;
        this.c = false;
        this.d = pVar;
    }
}
