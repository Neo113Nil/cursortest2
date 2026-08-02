package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersActiveOrderItemDto$ListItem", "Lcom/yandex/go/chargers/order/data/model/e0;", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderItemDto$ListItem extends e0 {
    public static final c0 Companion = new c0();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final o d;
    public final String e;
    public final h0 f;

    public ChargersActiveOrderItemDto$ListItem(int i, FormattedText formattedText, FormattedText formattedText2, String str, o oVar, String str2, h0 h0Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = n.INSTANCE;
        } else {
            this.d = oVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = g0.INSTANCE;
        } else {
            this.f = h0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final o getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final h0 getF() {
        return this.f;
    }

    /* renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: e, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    /* renamed from: f, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    public ChargersActiveOrderItemDto$ListItem() {
        FormattedText formattedText = FormattedText.c;
        n nVar = n.INSTANCE;
        g0 g0Var = g0.INSTANCE;
        this.a = formattedText;
        this.b = formattedText;
        this.c = "";
        this.d = nVar;
        this.e = null;
        this.f = g0Var;
    }
}
