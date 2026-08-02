package com.yandex.go.taxi.order.change.driver;

import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import defpackage.cmt;
import defpackage.gsq0;
import defpackage.q76;
import defpackage.qje;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/change/driver/ChangeDriverApi;", "", "Lcom/yandex/go/taxi/order/change/driver/ChangeDriverApi$ConfirmRequest;", "requestParam", "Lcmt;", "Lcom/yandex/go/taxi/order/change/common/data/ConfirmChangeResponse;", "a", "(Lcom/yandex/go/taxi/order/change/driver/ChangeDriverApi$ConfirmRequest;)Lcmt;", "ConfirmRequest", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ChangeDriverApi {
    @s490("order-modifier/v1/change-driver/confirm")
    cmt<ConfirmChangeResponse> a(@q76 ConfirmRequest requestParam);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/driver/ChangeDriverApi$ConfirmRequest;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/driver/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ConfirmRequest {
        public static final a Companion = new a();
        public final String a;

        public /* synthetic */ ConfirmRequest(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                qje.Z(i, 1, ChangeDriverApi$ConfirmRequest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public ConfirmRequest(String str) {
            this.a = str;
        }
    }
}
