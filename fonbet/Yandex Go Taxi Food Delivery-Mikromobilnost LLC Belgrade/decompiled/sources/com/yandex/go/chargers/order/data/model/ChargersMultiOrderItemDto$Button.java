package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import defpackage.v3a;
import defpackage.w3a;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersMultiOrderItemDto$Button", "Lcom/yandex/go/chargers/order/data/model/q0;", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/n0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersMultiOrderItemDto$Button extends q0 {
    public static final n0 Companion = new n0();
    public final FormattedText a;
    public final String b;
    public final w3a c;
    public final String d;
    public final boolean e;
    public final String f;

    public ChargersMultiOrderItemDto$Button(int i, FormattedText formattedText, String str, w3a w3aVar, String str2, boolean z, String str3) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = v3a.INSTANCE;
        } else {
            this.c = w3aVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final w3a getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    public ChargersMultiOrderItemDto$Button() {
        FormattedText formattedText = FormattedText.c;
        v3a v3aVar = v3a.INSTANCE;
        this.a = formattedText;
        this.b = "";
        this.c = v3aVar;
        this.d = "";
        this.e = false;
        this.f = null;
    }
}
