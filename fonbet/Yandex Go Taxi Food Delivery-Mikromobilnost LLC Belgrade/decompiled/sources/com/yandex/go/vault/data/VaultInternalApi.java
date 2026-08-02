package com.yandex.go.vault.data;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.q76;
import defpackage.s490;
import defpackage.wqs;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/vault/data/VaultInternalApi;", "", "Lcom/yandex/go/vault/data/VaultOpenParam;", "param", "Lcmt;", "Lcom/yandex/go/vault/data/VaultResponse;", "b", "(Lcom/yandex/go/vault/data/VaultOpenParam;)Lcmt;", "", "zone", "location", "Lzy11;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface VaultInternalApi {
    @wqs("vault/accept")
    cmt<zy11> a(@djg0("zone") String zone, @z8u("x-location") String location);

    @s490("vault/open")
    cmt<VaultResponse> b(@q76 VaultOpenParam param);
}
