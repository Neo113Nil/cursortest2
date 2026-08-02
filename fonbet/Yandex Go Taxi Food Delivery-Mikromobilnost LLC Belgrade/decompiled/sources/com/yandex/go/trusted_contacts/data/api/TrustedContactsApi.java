package com.yandex.go.trusted_contacts.data.api;

import com.yandex.go.trusted_contacts.data.entities.network.DeleteTrustedContactsRequest;
import com.yandex.go.trusted_contacts.data.entities.network.DeletedTrustedContactsResponse;
import com.yandex.go.trusted_contacts.data.entities.network.NewTrustedContactsPutRequest;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsPutRequest;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsResponse;
import com.yandex.go.trusted_contacts.data.entities.network.UpdatedTrustedContactsResponse;
import defpackage.cmt;
import defpackage.g5u;
import defpackage.q76;
import defpackage.t490;
import defpackage.wqs;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/api/TrustedContactsApi;", "", "Lcmt;", "Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactsResponse;", "c", "()Lcmt;", "Lcom/yandex/go/trusted_contacts/data/entities/network/NewTrustedContactsPutRequest;", "request", "Lcom/yandex/go/trusted_contacts/data/entities/network/UpdatedTrustedContactsResponse;", "d", "(Lcom/yandex/go/trusted_contacts/data/entities/network/NewTrustedContactsPutRequest;)Lcmt;", "Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactsPutRequest;", "a", "(Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactsPutRequest;)Lcmt;", "Lcom/yandex/go/trusted_contacts/data/entities/network/DeleteTrustedContactsRequest;", "Lcom/yandex/go/trusted_contacts/data/entities/network/DeletedTrustedContactsResponse;", "b", "(Lcom/yandex/go/trusted_contacts/data/entities/network/DeleteTrustedContactsRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface TrustedContactsApi {
    @t490("safety_center/v2/contact")
    cmt<UpdatedTrustedContactsResponse> a(@q76 TrustedContactsPutRequest request);

    @g5u(hasBody = true, method = "DELETE", path = "safety_center/v2/contacts")
    cmt<DeletedTrustedContactsResponse> b(@q76 DeleteTrustedContactsRequest request);

    @wqs("safety_center/v2/contacts")
    cmt<TrustedContactsResponse> c();

    @t490("safety_center/v2/contact")
    cmt<UpdatedTrustedContactsResponse> d(@q76 NewTrustedContactsPutRequest request);
}
