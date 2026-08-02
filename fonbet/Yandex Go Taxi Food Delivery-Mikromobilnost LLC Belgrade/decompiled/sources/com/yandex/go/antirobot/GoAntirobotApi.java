package com.yandex.go.antirobot;

import defpackage.cmt;
import defpackage.m5j0;
import defpackage.q76;
import defpackage.rvj0;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/antirobot/GoAntirobotApi;", "", "Lm5j0;", "requestBody", "Lcmt;", "Lrvj0;", "a", "(Lm5j0;)Lcmt;", "b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface GoAntirobotApi {
    @s490("antirobot/android/authenticate")
    cmt<rvj0> a(@q76 m5j0 requestBody);

    @s490("antirobot/android/generate_nonce")
    cmt<rvj0> b(@q76 m5j0 requestBody);
}
