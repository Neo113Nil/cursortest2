package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersPayloadDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/unified_polling/data/dto/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppOrdersPayloadDto {
    public static final g Companion = new g();
    public final kotlinx.serialization.json.b a;
    public final kotlinx.serialization.json.b b;
    public final kotlinx.serialization.json.b c;
    public final kotlinx.serialization.json.b d;
    public final kotlinx.serialization.json.b e;

    public /* synthetic */ SuperAppOrdersPayloadDto(int i, kotlinx.serialization.json.b bVar, kotlinx.serialization.json.b bVar2, kotlinx.serialization.json.b bVar3, kotlinx.serialization.json.b bVar4, kotlinx.serialization.json.b bVar5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bVar4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar5;
        }
    }

    public SuperAppOrdersPayloadDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
