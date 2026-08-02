package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/Button;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Button {
    public static final a Companion = new a();
    public final FormattedText a;
    public final String b;
    public final o c;

    public /* synthetic */ Button(int i, FormattedText formattedText, String str, o oVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = n.INSTANCE;
        } else {
            this.c = oVar;
        }
    }

    public Button() {
        FormattedText formattedText = FormattedText.c;
        n nVar = n.INSTANCE;
        this.a = formattedText;
        this.b = "";
        this.c = nVar;
    }
}
