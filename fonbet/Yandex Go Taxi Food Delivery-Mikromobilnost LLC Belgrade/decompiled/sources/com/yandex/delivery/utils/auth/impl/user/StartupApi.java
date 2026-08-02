package com.yandex.delivery.utils.auth.impl.user;

import defpackage.an2;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/yandex/delivery/utils/auth/impl/user/StartupApi;", "", "", "authorization", "userId", "Lan2;", "Lcom/yandex/delivery/utils/auth/impl/user/StartupResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lan2;", "auth"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface StartupApi {
    @s490("/4.0/startup")
    an2<StartupResponse> a(@z8u("Authorization") String authorization, @z8u("X-YaTaxi-UserId") String userId);
}
