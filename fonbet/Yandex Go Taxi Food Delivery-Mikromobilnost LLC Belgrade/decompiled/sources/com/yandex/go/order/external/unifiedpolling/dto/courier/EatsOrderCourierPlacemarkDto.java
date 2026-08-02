package com.yandex.go.order.external.unifiedpolling.dto.courier;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/courier/EatsOrderCourierPlacemarkDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/courier/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderCourierPlacemarkDto {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final float[] c;
    public final Boolean d;

    public /* synthetic */ EatsOrderCourierPlacemarkDto(int i, String str, String str2, float[] fArr, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = fArr;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    /* renamed from: a, reason: from getter */
    public final float[] getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public EatsOrderCourierPlacemarkDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
