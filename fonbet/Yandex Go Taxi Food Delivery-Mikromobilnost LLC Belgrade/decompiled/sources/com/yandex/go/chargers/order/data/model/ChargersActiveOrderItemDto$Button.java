package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersActiveOrderItemDto$Button", "Lcom/yandex/go/chargers/order/data/model/e0;", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderItemDto$Button extends e0 {
    public static final a0 Companion = new a0();
    public final FormattedText a;
    public final String b;
    public final Boolean c;
    public final o d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public ChargersActiveOrderItemDto$Button(int i, FormattedText formattedText, String str, Boolean bool, o oVar, String str2, boolean z, boolean z2, String str3) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = n.INSTANCE;
        } else {
            this.d = oVar;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final o getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getC() {
        return this.c;
    }

    /* renamed from: f, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    public ChargersActiveOrderItemDto$Button() {
        FormattedText formattedText = FormattedText.c;
        n nVar = n.INSTANCE;
        this.a = formattedText;
        this.b = "";
        this.c = null;
        this.d = nVar;
        this.e = "";
        this.f = true;
        this.g = false;
        this.h = null;
    }
}
