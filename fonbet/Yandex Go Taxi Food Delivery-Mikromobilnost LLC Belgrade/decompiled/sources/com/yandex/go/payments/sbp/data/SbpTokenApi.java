package com.yandex.go.payments.sbp.data;

import com.yandex.go.payments.sbp.data.model.SbpTokenBindRequest;
import com.yandex.go.payments.sbp.data.model.SbpTokenBindResponse;
import com.yandex.go.payments.sbp.data.model.SbpTokenHomeResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.wqs;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/sbp/data/SbpTokenApi;", "", "Lcom/yandex/go/payments/sbp/data/model/SbpTokenBindRequest;", "sbpTokenBindRequest", "Lcmt;", "Lcom/yandex/go/payments/sbp/data/model/SbpTokenBindResponse;", "b", "(Lcom/yandex/go/payments/sbp/data/model/SbpTokenBindRequest;)Lcmt;", "Lcom/yandex/go/payments/sbp/data/model/SbpTokenHomeResponse;", "a", "()Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface SbpTokenApi {
    @wqs("sbp-token/v1/home")
    cmt<SbpTokenHomeResponse> a();

    @s490("sbp-token/v1/bind")
    cmt<SbpTokenBindResponse> b(@q76 SbpTokenBindRequest sbpTokenBindRequest);
}
