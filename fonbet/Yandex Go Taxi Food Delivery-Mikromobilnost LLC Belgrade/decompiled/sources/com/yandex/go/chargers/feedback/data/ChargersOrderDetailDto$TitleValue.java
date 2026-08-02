package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.zz9;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/feedback/data/ChargersOrderDetailDto$TitleValue", "Lcom/yandex/go/chargers/feedback/data/x;", "Companion", "$serializer", "com/yandex/go/chargers/feedback/data/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrderDetailDto$TitleValue extends x {
    public static final v Companion = new v();
    public final FormattedText a;
    public final FormattedText b;
    public final zz9 c;

    public ChargersOrderDetailDto$TitleValue(int i, FormattedText formattedText, FormattedText formattedText2, zz9 zz9Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zz9Var;
        }
    }

    public ChargersOrderDetailDto$TitleValue() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = null;
    }
}
