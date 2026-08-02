package ru.rustore.sdk.pushclient.g;

import android.os.Bundle;
import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.analytics.utils.ClickNotificationUtils$getAnalyticsPayload$2", f = "ClickNotificationUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class a extends SuspendLambda implements wzs<yvj, spj<? super NotificationAnalyticsPayload>, Object> {
    public final /* synthetic */ Bundle a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bundle bundle, spj<? super a> spjVar) {
        super(2, spjVar);
        this.a = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new a(this.a, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super NotificationAnalyticsPayload> spjVar) {
        return new a(this.a, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        Bundle bundle = this.a;
        String string = bundle != null ? bundle.getString("vkpns.analytics_payload.push_token_part") : null;
        Bundle bundle2 = this.a;
        String string2 = bundle2 != null ? bundle2.getString("vkpns.analytics_payload.message_id") : null;
        if (string == null || string2 == null) {
            return null;
        }
        return NotificationAnalyticsPayload.Companion.createSafe(string, string2);
    }
}
