package com.yandex.go.loyalty.impl.selector.data.model;

import com.yandex.go.loyalty.api.data.model.common.ColorSettings;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyProgramButtonDto;", "", "Companion", "$serializer", "com/yandex/go/loyalty/impl/selector/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyProgramButtonDto {
    public static final f Companion = new f();
    public final FormattedText a;
    public final String b;
    public final ColorSettings c;

    public LoyaltyProgramButtonDto(int i, FormattedText formattedText, String str, ColorSettings colorSettings) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) != 0) {
            this.c = colorSettings;
        } else {
            ColorSettings.Companion.getClass();
            this.c = ColorSettings.d;
        }
    }

    public LoyaltyProgramButtonDto() {
        FormattedText formattedText = FormattedText.c;
        ColorSettings.Companion.getClass();
        ColorSettings colorSettings = ColorSettings.d;
        this.a = formattedText;
        this.b = "";
        this.c = colorSettings;
    }
}
