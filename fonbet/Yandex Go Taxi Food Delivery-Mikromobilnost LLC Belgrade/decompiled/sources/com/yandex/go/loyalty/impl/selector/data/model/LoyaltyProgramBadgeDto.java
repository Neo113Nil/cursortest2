package com.yandex.go.loyalty.impl.selector.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyProgramBadgeDto;", "", "Companion", "$serializer", "com/yandex/go/loyalty/impl/selector/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyProgramBadgeDto {
    public static final e Companion = new e();
    public final FormattedText a;
    public final String b;

    public /* synthetic */ LoyaltyProgramBadgeDto(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public LoyaltyProgramBadgeDto() {
        this.a = FormattedText.c;
        this.b = "";
    }
}
