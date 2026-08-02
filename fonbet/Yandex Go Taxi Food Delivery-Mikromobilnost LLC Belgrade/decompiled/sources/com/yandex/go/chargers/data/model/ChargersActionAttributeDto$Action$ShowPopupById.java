package com.yandex.go.chargers.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/data/model/ChargersActionAttributeDto$Action$ShowPopupById", "Lcom/yandex/go/chargers/data/model/j;", "Companion", "$serializer", "com/yandex/go/chargers/data/model/g", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActionAttributeDto$Action$ShowPopupById extends j {
    public static final g Companion = new g();
    public final String a;

    public ChargersActionAttributeDto$Action$ShowPopupById(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public ChargersActionAttributeDto$Action$ShowPopupById() {
        this.a = "";
    }
}
