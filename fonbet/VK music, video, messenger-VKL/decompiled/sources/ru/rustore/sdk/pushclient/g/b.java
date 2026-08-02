package ru.rustore.sdk.pushclient.g;

import android.os.Bundle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.analytics.utils.ClickNotificationUtils$getClickEventRequestCode$2", f = "ClickNotificationUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements wzs<yvj, spj<? super Integer>, Object> {
    public final /* synthetic */ Bundle a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Bundle bundle, spj<? super b> spjVar) {
        super(2, spjVar);
        this.a = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b(this.a, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Integer> spjVar) {
        return new b(this.a, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        Bundle bundle = this.a;
        if (bundle != null) {
            return new Integer(bundle.getInt("vkpns.click_event_marker.request_code"));
        }
        return null;
    }
}
