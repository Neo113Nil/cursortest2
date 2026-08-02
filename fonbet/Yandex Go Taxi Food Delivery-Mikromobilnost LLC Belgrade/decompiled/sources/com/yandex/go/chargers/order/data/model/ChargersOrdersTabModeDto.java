package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersOrdersTabModeDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/v0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrdersTabModeDto {
    public static final v0 Companion = new v0();
    public final String a;
    public final String b;
    public final kotlinx.serialization.json.b c;

    public /* synthetic */ ChargersOrdersTabModeDto(int i, String str, String str2, kotlinx.serialization.json.b bVar) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final kotlinx.serialization.json.b getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public ChargersOrdersTabModeDto() {
        this.a = "";
        this.b = "";
        this.c = null;
    }
}
