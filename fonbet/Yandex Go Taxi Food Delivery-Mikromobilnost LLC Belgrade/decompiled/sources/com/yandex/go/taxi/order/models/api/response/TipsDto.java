package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.objects.TipsType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TipsDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/q8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsDto {
    public static final q8 Companion = new q8();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(29)), null, null};
    public final TipsType a;
    public final String b;
    public final boolean c;

    public /* synthetic */ TipsDto(int i, TipsType tipsType, String str, boolean z) {
        this.a = (i & 1) == 0 ? null : tipsType;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    /* renamed from: a, reason: from getter */
    public final TipsType getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    public TipsDto() {
        this.a = null;
        this.b = "";
        this.c = false;
    }
}
