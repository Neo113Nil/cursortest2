package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderMultiOrderDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/i0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderMultiOrderDto {
    public static final i0 Companion = new i0();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;

    public /* synthetic */ ChargersActiveOrderMultiOrderDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final FormattedText getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    public ChargersActiveOrderMultiOrderDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
        this.d = formattedText;
    }
}
