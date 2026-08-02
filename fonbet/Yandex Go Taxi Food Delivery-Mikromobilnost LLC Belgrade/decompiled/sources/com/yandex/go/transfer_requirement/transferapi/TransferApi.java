package com.yandex.go.transfer_requirement.transferapi;

import com.yandex.go.transfer_requirement.transferapi.check.TransferCheckResponse;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/transfer_requirement/transferapi/TransferApi;", "", "Lcom/yandex/go/transfer_requirement/transferapi/TransferParam;", "p", "Lcmt;", "Lcom/yandex/go/transfer_requirement/transferapi/draft/TransferDraftResponse;", "b", "(Lcom/yandex/go/transfer_requirement/transferapi/TransferParam;)Lcmt;", "Lcom/yandex/go/transfer_requirement/transferapi/check/TransferCheckResponse;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface TransferApi {
    @s490("transfers/v1/check")
    cmt<TransferCheckResponse> a(@q76 TransferParam p);

    @s490("transfers/v1/draft")
    cmt<TransferDraftResponse> b(@q76 TransferParam p);
}
