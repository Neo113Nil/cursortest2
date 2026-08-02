package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/PopupDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/x0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PopupDto {
    public static final x0 Companion = new x0();
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;

    public /* synthetic */ PopupDto(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    public PopupDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = null;
        this.c = formattedText;
        this.d = formattedText;
    }
}
