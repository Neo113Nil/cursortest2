package com.yandex.go.taxi.order.change.due.data.dto;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.we8;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/due/data/dto/ChangeDueResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/due/data/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChangeDueResponse {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new we8(24))};
    public final String a;
    public final OrderChangesDto.Status b;

    public /* synthetic */ ChangeDueResponse(int i, String str, OrderChangesDto.Status status) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = OrderChangesDto.Status.SUCCESS;
        } else {
            this.b = status;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDueResponse)) {
            return false;
        }
        ChangeDueResponse changeDueResponse = (ChangeDueResponse) obj;
        return jl40.l(this.a, changeDueResponse.a) && this.b == changeDueResponse.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangeDueResponse(changeId=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }

    public ChangeDueResponse() {
        OrderChangesDto.Status status = OrderChangesDto.Status.SUCCESS;
        this.a = "";
        this.b = status;
    }
}
