package com.yandex.go.taxi.order.change.common.data;

import com.yandex.go.taxi.order.change.source.data.ChangeSourceMessageResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.m3e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/common/data/ConfirmChangeResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/common/data/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConfirmChangeResponse {
    public static final a Companion = new a();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(0)), null, null, null};
    public final String a;
    public final OrderChangesDto.Status b;
    public final String c;
    public final ChangeSourceMessageResponse d;
    public final OrderChangesDto.Notification e;

    public /* synthetic */ ConfirmChangeResponse(int i, String str, OrderChangesDto.Status status, String str2, ChangeSourceMessageResponse changeSourceMessageResponse, OrderChangesDto.Notification notification) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = status;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = changeSourceMessageResponse;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = notification;
        }
    }

    public ConfirmChangeResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
